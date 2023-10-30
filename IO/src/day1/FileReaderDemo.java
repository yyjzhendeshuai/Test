package day1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 汪洋
 * @version 1.0.0
 * @ClassName FileReaderDemo.java
 * @Description
 * @CreateTime 2023年03月09日 14:10:00
 */
public class FileReaderDemo {

    /**
     * 通过字符流读取文件数据
     */
    public static void main(String[] args) {
        //创建一个文件对象
        File file = new File("课堂笔记.txt");
        //判断文件是否存在
        if(file.exists()){
            //申明文件字符输入流
            FileReader fr = null;
            try{
                fr = new FileReader(file);
//                int input = -1;
//                //以字符进行文件信息读取
//                while((input = fr.read()) !=-1){
//                    System.out.println((char)input);
//                }
                 char[] ch = new char[1024];
                 while(fr.read(ch) !=-1){
                     System.out.println(new String(ch));
                 }

            }catch (Exception e){
                e.printStackTrace();
            }finally {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        }else{
            System.out.println("读取文件失败....");
        }
    }



}
