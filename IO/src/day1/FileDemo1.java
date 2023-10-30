package day1;

import java.io.File;
import java.io.IOException;

/**
 * @author 汪洋
 * @version 1.0.0
 * @ClassName FileDemo1.java
 * @Description
 * @CreateTime 2023年03月09日 09:30:00
 */
public class FileDemo1 {
    public static void main(String[] args) {
        //创建一个文件对象
        File file = new File("d:\\tools");
        System.out.println("文件大小:"+file.length());
        System.out.println("是否为文件:"+file.isFile());
        System.out.println("是否为文件夹:"+file.isDirectory());
        System.out.println("文件夹内容:"+file.listFiles());
        File[] files = file.listFiles();
        for(File fl : files){
            System.out.println("文件名="+fl.getName());
        }

        //创建文件操作
//        File file1 = new File("d:/demo2.txt");
//        try {
//            file1.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //创建文件夹
        File file2 = new File("d:/dljd/io");
        //是创建文件夹，但不能创建带有子集的文件夹目录
        file2.mkdir();
        //是创建文件夹，可以同时创建子集和父级文件夹目录
//        file2.mkdirs();

    }
}
