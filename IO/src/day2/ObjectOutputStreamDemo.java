package day2;

import day2.bean.Student;

import java.io.*;

/**
 * @author 汪洋
 * @version 1.0.0
 * @ClassName ObjectOutputStreamDemo.java
 * @Description
 * @CreateTime 2023年03月10日 11:00:00
 */
public class ObjectOutputStreamDemo {
    public static void main(String[] args) {
        /**
         * 通过序列化操作将对象写入到文件中
         */
        //定义写入数据的文件对象
        File file = new File("obj.txt");
        try {
            //创建文件字节流
            FileOutputStream fos = new FileOutputStream(file);
            //创建对象输出字节流  --序列化
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            //创建一个需要写入到文件的对象
            Student stu = new Student(1,"如花","女");

            //输出
            oos.writeObject(stu);

            //先开后关的原则
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
