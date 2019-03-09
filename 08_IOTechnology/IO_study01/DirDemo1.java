package com.sxt.io;

import java.io.File;

/**
* 创建目录
* 1、mkdir():确保上级目录存在，不存在创建失败
* 2、mkdirs()：上级目录可以不存在，不存在一同来创建
*/
public class DirDemo1 {
    public static void main(String[] args) {
        File dir = new File("D:\\尚学堂代码练习\\08_IO技术\\IO_study01\\dir\\test");
		//创建目录
		boolean flag = dir.mkdirs();
		System.out.println(flag);
		//创建目录
		dir = new File("D:\\尚学堂代码练习\\08_IO技术\\IO_study01\\dir\\test");
		flag = dir.mkdir();
		System.out.println(flag);
    }
}
