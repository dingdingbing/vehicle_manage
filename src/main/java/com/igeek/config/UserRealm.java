package com.igeek.config;

import com.igeek.pojo.User;
import com.igeek.service.IUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

//自定义一个UserRealm extends AuthorizingRealm
public class UserRealm extends AuthorizingRealm {

    @Autowired
    private IUserService userService;
    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("执行了=====>授权");
        //下面进行的认证，现在需要进行授权，用户是无法访问没有授权的页面的
        //1.获得授权的方法
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        //2.获得已经认证的用户的拥有的权限
        Subject subject = SecurityUtils.getSubject();
        User currentUser = (User)subject.getPrincipal();
        Set<String> permissions = userService.selectPerById(currentUser.getUserid());
        if(currentUser==null || "".equals(permissions) ||permissions==null ){
            return info;
        }else{
            //3.将用户的perms权限设置进授权的方法
           // info.addStringPermission(currentUser.getPerms());
            info.addStringPermissions(permissions);
            return info;
        }



    }

    //认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        System.out.println("执行了=====>认证");

        UsernamePasswordToken token=(UsernamePasswordToken)authenticationToken;
        User user = userService.selectByName(token.getUsername());
        if(user==null){
            return null;
        }


       /*
       这里如果需要盐值加密，则需要调用SimpleAuthenticationInfo(Object principal, Object hashedCredentials, ByteSource credentialsSalt, String realmName)
        上面这个构造方法，传入一个盐，可以使用username当做盐
        SimpleAuthenticationInfo simpleAuthenticationInfo1 = new SimpleAuthenticationInfo("", user.getPassword(), ByteSource.Util.bytes(user.getUsername()), "");
        由于过程是不可逆的，所以只能通过注册得到加盐后的密码
        注册使用Shiro的String hashPassword = new SimpleHash("加密格式",密码,"盐",加密次数).toString();方法来加密注册密码

        */

       //CredentialsMatcher是一个很关键的接口，他的实现类SimpleCredentialsMatcher，因为有一个默认的加密方式就是不加密，所以在不设置加密方式的情况下，数据库使用明文密码也是可以登录的

        //可以将用户的信息放到principal中，供授权方法使用                                     principal
        //SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo("", user.getPassword(), "");
        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(user, user.getPassword(), ByteSource.Util.bytes(user.getUsername()), "");


        //为了使index页面的登录按钮在已经登录的情况下不显示，需要往session中存一个user对象进行判断
        Subject subject = SecurityUtils.getSubject();

        Session session = subject.getSession();
        session.setAttribute("loginUser",user);
        return simpleAuthenticationInfo;
    }
}
