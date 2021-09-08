package com.example.androidposition.util;

import java.awt.*;
import java.awt.image.BufferedImage;

public class CreateImage {
    public static BufferedImage getImage(){
        //在内存中创建一个图片
        BufferedImage image = new BufferedImage(900,300,BufferedImage.TYPE_INT_RGB);
        //得到图片
        Graphics2D g = (Graphics2D) image.getGraphics(); //笔
        //设置图片的背景颜色
        g.setColor(Color.white);
        g.fillRect(0,0,900,300);
        //给图片写数据
        g.setColor(Color.BLUE);
        g.setFont(new Font(null,Font.BOLD,150));
        g.drawString(RandomUtil.makeNum(),200,200);

        return image;
    }
}
