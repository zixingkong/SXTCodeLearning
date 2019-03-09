package com.sxt.io;

import java.io.File;

/*
* 列出下一级
* 1、list():列出下级名称
* 2、listFiles():列出下级File对象
* 列出所有的盘符
*/

public class DirDemo02 {
    public static void main(String[] args) {
        File dir = new File("D:\\尚学堂代码练习\\08_IO技术\\IO_study01");
        //下级名称 list
        String[] subNames = dir.list();
        for (String s:subNames) {
            System.out.println(s);
        }
		System.out.println("------------------------");
        //下级对象 listFiles
        File[] subFiles = dir.listFiles();
        for (File s:subFiles ) {
            System.out.println(s.getAbsolutePath());
        }
		System.out.println("------------------------------");
        //所有盘符
        File[] roots = dir.listRoots();
        for (File r:roots ) {
            System.out.println(r.getAbsolutePath());
        }
    }
}