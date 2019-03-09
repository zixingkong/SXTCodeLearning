package com.sxt.io;

import java.io.UnsupportedEncodingException;

/*
* 解码：字节 -> 字符串
*
*/

public class ContentDecode
{
	public static void main(String[] args) throws UnsupportedEncodingException{
		String msg = "性命生命使命a";
		//编码：字节数组
		byte[] datas = msg.getBytes("utf-8");
		//解码：字符串 String​(byte[] bytes, int offset, int length, String charsetName)
		msg = new String(datas,0,datas.length,"utf-8");
		System.out.println(msg);

		//乱码：
		//1、字节数不够
		msg = new String(datas,0,datas.length-2,"utf-8");
		System.out.println(msg);
		msg = new String(datas,0,datas.length-1,"utf-8");
		System.out.println(msg);

		//2、字符集不统一
		msg = new String(datas,0,datas.length-1,"UTF-16");
		System.out.println(msg);
		
		
	
	}
}