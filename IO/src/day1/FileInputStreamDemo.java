package day1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author 汪洋
 * @version 1.0.0
 * @ClassName FileInputStreamDemo.java
 * @Description
 * @CreateTime 2023年03月09日 10:35:00
 */
public class FileInputStreamDemo {
    public static void main(String[] args) {
        /***
         * 通过字节流读取一个文件中的数据到java程序中
         */
         //创建需要读取数据的文件对象
        File file = new File("d:/mysql课堂笔记.sql");
        //判断读取的文件是否存在
        if(file.exists()){
            FileInputStream fis =null;
            try {
                //创建文件字节输入流
                fis = new FileInputStream(file);
                //读取文件数据
                //通过一个字节一个字节读取的方式
//                int input = -1;
//                while((input = fis.read()) != -1){
//                    System.out.println(input);
//                }

                //通过一个容器读取所有的文件数据
                byte[] by = new byte[1024];

                while(fis.read(by) != -1) {
                    String str = new String(by);
                    System.out.println(str);
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                //将读取完文件数据后的流进行关闭
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }else{
            System.out.println("读取的文件不存在....");
        }



    }
}
