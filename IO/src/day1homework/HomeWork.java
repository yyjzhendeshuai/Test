package day1homework;

import java.io.*;

/**
 * @author 汪洋
 * @version 1.0.0
 * @ClassName HomeWork.java
 * @Description
 * @CreateTime 2023年03月09日 14:33:00
 */
public class HomeWork {
    public static void main(String[] args) {
        /**
         * 文件复制
         */
        //获取一个原文件(需要复制的文件)
        File oldFile = new File("课堂笔记.txt");
        //获取一个新文件
        File newFile = new File("demo副本.txt");
        FileInputStream fis=null;
        FileOutputStream fos = null;
        try {
            //从原文件中读取到文件数据
            fis = new FileInputStream(oldFile);
            fos = new FileOutputStream(newFile,true);

            //定义字节容器
            int input =-1;
            while((input = fis.read()) !=-1){
                fos.write(input);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

        }


    }
}
