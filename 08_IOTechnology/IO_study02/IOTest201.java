package com.sxt.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/*
* 第一个程序：理解操作步骤 标准
* 1、创建源
* 2、选择流
* 3、操作
* 4、释放资源
*/

public class IOTest201 {
    public static void main(String[] args) {
        //1、创建源
        File src = new File("abc.txt");
        //2、选择流
        InputStream is = null;
        try {
            is = new FileInputStream(src);
            //3、操作（读取）
            int temp;
            while ((temp=is.read()) != -1) {
                System.out.println((char)temp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != is) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}