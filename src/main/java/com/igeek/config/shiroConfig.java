package com.igeek.config;

import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.codec.Base64;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.CookieRememberMeManager;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.servlet.SimpleCookie;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class shiroConfig  {
    //三步走，倒着走，321,1.shiroFilterFactoryBean     2.websecuritymanager 授权管理   3.创建Realm对象

    @Bean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("getDefaultWebSecurityManager") DefaultWebSecurityManager defaultWebSecurityManager){
        ShiroFilterFactoryBean bean = new ShiroFilterFactoryBean();
        //设置安全管理器

        // anon:无需认证就可以访问  authc：必须认证才能访问   user：必须拥有 记住我 功能才能访问
        // perms：拥有对某个资源的权限才能访问      role：拥有某个角色才能访问

        Map<String, String> filterMap=new LinkedHashMap<String, String>();

        //需要拥有资源才能访问相对应的链接
        filterMap.put("/user/add","perms[user:add]");
        filterMap.put("/user/update","perms[user:update]");
        //必须要认证才能访问/user下的链接
        filterMap.put("/user/**","authc");
        filterMap.put("/index","authc");
        filterMap.put("/index.html","authc");
        filterMap.put("/tables","authc" );
        filterMap.put("/driver","authc" );
        filterMap.put("/car/**","authc" );
        filterMap.put("/carLocation","authc" );
        filterMap.put("/carDispatch/**","authc" );
        filterMap.put("/driver/**","authc" );
        filterMap.put("/upload","authc" );
        filterMap.put("/download","authc" );
        filterMap.put("/toregister","anon");
        filterMap.put("/login","anon");
        filterMap.put("/login.html","anon");



        bean.setFilterChainDefinitionMap(filterMap);


        //设置登录的请求
        bean.setLoginUrl("/login");

        //设置未授权的请求
        bean.setUnauthorizedUrl("/unauthorized");



        bean.setSecurityManager(defaultWebSecurityManager);
        return bean;

    }

    @Bean
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("userRealm") UserRealm userRealm){
        DefaultWebSecurityManager defaultWebSecurityManager = new DefaultWebSecurityManager();
        //关联realm
        defaultWebSecurityManager.setRealm(userRealm);
        defaultWebSecurityManager.setRememberMeManager(rememberMeManager());
        return defaultWebSecurityManager;
    }


    @Bean
    public SimpleCookie rememberMeCookie() {
        //这个参数是cookie的名称，对应前端的checkbox的name = rememberMe
        SimpleCookie simpleCookie = new SimpleCookie("remember");
        //如果httyOnly设置为true，则客户端不会暴露给客户端脚本代码，使用HttpOnly cookie有助于减少某些类型的跨站点脚本攻击；
        simpleCookie.setHttpOnly(true);
        //记住我cookie生效时间,单位是秒
        simpleCookie.setMaxAge(600);
        return simpleCookie;
    }

    @Bean
    public CookieRememberMeManager rememberMeManager() {
        CookieRememberMeManager cookieRememberMeManager = new CookieRememberMeManager();
        //rememberme cookie加密的密钥 建议每个项目都不一样 默认AES算法 密钥长度（128 256 512 位），通过以下代码可以获取
        //KeyGenerator keygen = KeyGenerator.getInstance("AES");
        //SecretKey deskey = keygen.generateKey();
        //System.out.println(Base64.encodeToString(deskey.getEncoded()));
        byte[] cipherKey = Base64.decode("wGiHplamyXlVB11UXWol8g==");
        cookieRememberMeManager.setCipherKey(cipherKey);
        cookieRememberMeManager.setCookie(rememberMeCookie());
        return cookieRememberMeManager;
    }


    @Bean  //创建自定义realm
    public UserRealm userRealm(){
        UserRealm userRealm = new UserRealm();
        //将加密方式设置进realm，然后在自定义的realm里面可以使用
        userRealm.setCredentialsMatcher(hashedCredentialsMatcher());

        return userRealm;
    }


    @Bean//注入加密方式，交给spring托管
    public HashedCredentialsMatcher hashedCredentialsMatcher(){
        HashedCredentialsMatcher hashedMatcher = new HashedCredentialsMatcher();
       //使用md5进行加密
        hashedMatcher.setHashAlgorithmName("md5");
        //设置散列次数，意思为加密几次
        hashedMatcher.setHashIterations(1024);
        return hashedMatcher;
    }

    @Bean
    public ShiroDialect shiroDialect(){
        return new ShiroDialect();
    }
}
