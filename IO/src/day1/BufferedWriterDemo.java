package day1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 汪洋
 * @version 1.0.0
 * @ClassName BufferedWriterDemo.java
 * @Description
 * @CreateTime 2023年03月09日 15:55:00
 */
public class BufferedWriterDemo {
    public static void main(String[] args) {
        //字符缓冲区写入数据到文件
        File file = new File("demo3.txt");
        try {
            //创建文件字符流
            FileWriter fw = new FileWriter(file,true);
            //创建字符缓冲流
            BufferedWriter bw = new BufferedWriter(fw);
            //写入数据
            bw.write("欢迎大家来到动力节点!!");
            //在每次写完后可以换行操作
            bw.newLine();
            //为了实现缓冲区数据能写入到文件，可以通过刷新缓冲区或关闭缓冲区来进行数据写入
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
