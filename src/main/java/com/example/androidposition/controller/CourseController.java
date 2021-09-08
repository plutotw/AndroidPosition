package com.example.androidposition.controller;

import com.example.androidposition.pojo.CourseList;
import com.example.androidposition.service.ListServiceImpl;
import com.example.androidposition.util.CreateImage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;

@Controller
public class CourseController {

    @Resource
    private ListServiceImpl listService;


    @RequestMapping("/getList")
    @ResponseBody
    public List<CourseList> getList(){
        return listService.getList();
    }

    @RequestMapping("/add")
    @ResponseBody
    public int add(CourseList list){
        return listService.addList(list);
    }

    @RequestMapping("/getImage")
    public void getImage(HttpServletResponse resp) throws IOException {
        //如何让浏览器3秒自动刷新一次;
        resp.setHeader("refresh","3");

        BufferedImage image= CreateImage.getImage();

        //告诉浏览器，这个请求用图片的方式打开
        resp.setContentType("image/jpeg");
        //网站存在缓存，不让浏览器缓存
        resp.setDateHeader("expires",-1);
        resp.setHeader("Cache-Control","no-cache");
        resp.setHeader("Pragma","no-cache");

        //把图片写给浏览器
        ImageIO.write(image,"jpg", resp.getOutputStream());
    }
}
