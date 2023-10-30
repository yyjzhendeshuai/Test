package day2.homework;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.util.Scanner;

/**
 * @author 汪洋
 * @version 1.0.0
 * @ClassName HomeWork1.java
 * @Description
 * @CreateTime 2023年03月10日 08:58:00
 */
public class HomeWork1 {

    //定义一个获取所有文件对象的方法
    public static void getFile(File file){
        //判断是否为文件夹
        if(file.isDirectory()){
            //获取当前文件夹中所有文件对象
            File[] files = file.listFiles();
            //循环遍历所有的文件对象
            for(int i=0; files!=null && i<files.length;i++){
                File fls = files[i];
                if(fls == null){
                    return;
                }
                //判断是否还存在子文件夹，如果有就通过递归调用继续遍历
                if(fls.isDirectory()){
                    getFile(fls);
                }else{
                    System.out.println(fls.getAbsolutePath()+"\\"+fls.getName()+",文件大小:"+fls.length());
                }
            }
        }else{
            System.out.println(file.getAbsolutePath()+"\\"+file.getName()+",文件大小:"+file.length());
        }
    }

    public static void main(String[] args) {
        /**
         * 使用File类实现计算机磁盘指定目录的文件扫描，并且将每次扫描的文件信息显示在控制台；
         *    信息内容： 文件路径+文件名称+文件大小   例如： c:\windows\a.txt --20000字节
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入扫描路径:");
        String path = sc.next();

        File file =new File(path);
        getFile(file);


    }
}
