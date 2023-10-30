package day2.homework;

import java.io.*;

/**
 * @author 汪洋
 * @version 1.0.0
 * @ClassName HomeWork3.java
 * @Description
 * @CreateTime 2023年03月10日 09:22:00
 */
public class HomeWork3 {

    //定义一个统计源文件总代码行数的变量
    static int columnCount=0;

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
                        try {
                            readFileColumn(fls);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    //定义一个使用流读取文件信息的方法
    public static void readFileColumn(File file) throws IOException {
        //使用字符缓冲区读取文件的每个行
        BufferedReader br = new BufferedReader(new FileReader(file));
        String str = "";
        while((str = br.readLine()) !=null){
            columnCount++;
        }
    }


    public static void main(String[] args) {
        /***
         * 3、通过流获取jdk源码中所有源码文件总代码行数。
         * */
        File file = new File("d:\\src");
        getFile(file);
        System.out.println("总代码行数:"+columnCount);

    }
}
