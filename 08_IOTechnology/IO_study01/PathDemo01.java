package com.sxt.io;

import java.io.File;

public class PathDemo01
{
	/*
	* \ / 名称分割符 sepator
	*/

	public static void main(String[] artgs){
		String path = "D:\\SXT_Code_Learning\\08_IOTechnology\\IO_study01\\IO.png";
		System.out.println(File.separatorChar);
		//建议
		//1、 /
		path = "D:/SXT_Code_Learning/08_IOTechnology/IO_study01/IO.png";
		System.out.println(path);

		//2、常量拼接
		path = "D:"+File.separator+"java300"+File.separator+"IO_study01"+File.separator+"IO.png";
		System.out.println(path);
	
	}
}