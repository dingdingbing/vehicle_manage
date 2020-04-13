package com.igeek.controller;

import com.igeek.config.UploadProperties;
import com.igeek.pojo.ResultBean;
import com.igeek.service.Impl.UploadFileQiniu;
import com.igeek.service.UploadFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

@Controller
public class UploadController {

    @Autowired
    UploadProperties uploadProperties;

    @ResponseBody
    @RequestMapping("/upload")
    public ResultBean uploadFileYun01(MultipartFile file) {
        // 上传到七牛云
        UploadFile uploadFile = new UploadFileQiniu(uploadProperties.getQiniu());
        String fileName = uploadFile.uploadFile(file);
        System.out.println(fileName);
        return new ResultBean(0,fileName,"成功");
    }

    @ResponseBody
    @RequestMapping("/download")
    public String download(HttpServletResponse response) throws FileNotFoundException {

        response.addHeader("Content-Disposition", "attachment; filename=" + response.encodeURL("a.jpg"));
        //设置下载之后不打开，并且下载后的文件名为a.jpg
        ServletOutputStream os = null;
        try {
            //通过URL下载文件 ，需要获取HttpURLConnection的输入流
            URL url = new URL("http://q3q8oh444.bkt.clouddn.com/d59bff48-8905-4fb0-9028-6e74c7430693.jpg");
            HttpURLConnection huc = (HttpURLConnection)url.openConnection();
            InputStream fis = huc.getInputStream();
            os = response.getOutputStream();
            byte[] b = new byte[1024];

            int len = -1;

            while ((len = fis.read(b)) != -1) {
                os.write(b, 0, len);
            }

            os.close();

            fis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return "成功";
    }

}
