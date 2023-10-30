package day1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 汪洋
 * @version 1.0.0
 * @ClassName FileWriterDemo.java
 * @Description
 * @CreateTime 2023年03月09日 14:18:00
 */
public class FileWriterDemo {
    public static void main(String[] args) {
        /**
         * 通过字符流写入数据到文件
         */
        //获取写入数据的文件对象
        File file = new File("demo1.txt");
        FileWriter fw = null;
        try {
            fw = new FileWriter(file,true);
            //写入字符数据
            fw.write("康康是一个帅哥!!");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
