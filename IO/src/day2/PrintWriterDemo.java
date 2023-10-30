package day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * @author 汪洋
 * @version 1.0.0
 * @ClassName PrintWriterDemo.java
 * @Description
 * @CreateTime 2023年03月10日 10:41:00
 */
public class PrintWriterDemo {
    public static void main(String[] args) {
        /**
         * 通过字符打印流将程序中的数据写入到文件。
         * PrintWriter字符打印流在后期的Servlet学习中会使用到
         */
        try {
            PrintWriter pw = new PrintWriter(new File("demo4.txt"));
            //直接通过打印方法将数据写入文件
            pw.println("你吃了吗");
            pw.println("我没有吃");
            pw.println(true);
            pw.println(123);
            //刷新打印流
            pw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
