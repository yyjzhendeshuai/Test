package day1;

import java.io.*;

/**
 * @author 汪洋
 * @version 1.0.0
 * @ClassName BufferedReaderDemo.java
 * @Description
 * @CreateTime 2023年03月09日 15:47:00
 */
public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        //通过简化方式编写代码

        //创建一个字符缓冲区读取指定的文件数据
        BufferedReader br = new BufferedReader(new FileReader(new File("课堂笔记.txt")));
        //通过缓冲区读取文件数据
        String str="";
        //通过行的方式读取文件数据
        while((str = br.readLine()) !=null){
            System.out.println(str);
        }

    }

}
