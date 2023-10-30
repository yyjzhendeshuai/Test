package day2.homework;

import java.io.File;

/**
 * @author 汪洋
 * @version 1.0.0
 * @ClassName HomeWork2.java
 * @Description
 * @CreateTime 2023年03月10日 09:17:00
 */
public class HomeWork2 {

    //统计所有源码文件的变量
    static int count = 0;

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
                    //文件是.java结尾的
                    if(fls.getName().endsWith(".java")){
                        count++;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        /**
         * 2、使用File类统计jdk源码目录中所有*.java文件的总个数
         */
         //获取源码文件对象
        File file = new File("d:\\src");
        getFile(file);
        System.out.println("总计源码文件个数："+count);
    }
}
