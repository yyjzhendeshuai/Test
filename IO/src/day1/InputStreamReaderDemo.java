package day1;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author 汪洋
 * @version 1.0.0
 * @ClassName InputStreamReaderDemo.java
 * @Description
 * @CreateTime 2023年03月09日 15:27:00
 */
public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
        //定义一个字节字符转换流获取控制台输入
        InputStreamReader isr = new InputStreamReader(System.in);
        int input = -1;
        System.out.println("请输入:");
        while((input = isr.read())!=-1){
            System.out.println((char)input);
        }
    }
}
