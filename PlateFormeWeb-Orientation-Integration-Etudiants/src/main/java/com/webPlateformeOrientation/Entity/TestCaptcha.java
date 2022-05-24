package com.webPlateformeOrientation.Entity;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import cn.apiclub.captcha.Captcha;

public abstract class TestCaptcha {
 
	public static Captcha createCaptcha(int width,int height)
	{
		
		Captcha cap = new Captcha.Builder(width, height).addBackground()
		.addText()
		.addNoise()
		.build();
		return cap;
	}
	public static void createImage(Captcha captcha)
	{
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		
		try {
			ImageIO.write(captcha.getImage(),"png", os);
			FileOutputStream fos = new FileOutputStream("C:/Users/A/OneDrive/Images/example/captcha1.png");
			fos.write(os.toByteArray());
			fos.flush(); fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
