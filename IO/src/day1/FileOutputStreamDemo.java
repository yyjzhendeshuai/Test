package day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 汪洋
 * @version 1.0.0
 * @ClassName FileOutputStreamDemo.java
 * @Description
 * @CreateTime 2023年03月09日 11:22:00
 */
public class FileOutputStreamDemo {
    public static void main(String[] args) {
        /**
         * 通过将java程序中产生的数据写入到文件
         */
        //创建文件对象
        File file =new File("demo.txt"); //通过相对路径存放在当前的工程下

        FileOutputStream fos =null;
        try {
            //创建文件字节输出流
//            fos = new FileOutputStream(file);
            fos = new FileOutputStream(file,true);

            //写入数据
            fos.write("佳佳111\n".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
