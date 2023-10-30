package day2.homework;

import day2.bean.Student;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author 汪洋
 * @version 1.0.0
 * @ClassName ObjectInputStreamDemo.java
 * @Description
 * @CreateTime 2023年03月10日 11:12:00
 */
public class ObjectInputStreamDemo {
    public static void main(String[] args) {
        /**
         * 反序列化操作--将文件中存储的对象还原到程序
         */
        File file = new File("obj.txt");
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            //读取对象数据
            Student stu = (Student) ois.readObject();
            System.out.println(stu.getSname()+"--"+stu.getSid());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
