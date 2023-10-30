package day2.bean;

import java.io.Serializable;

/**
 * @author 汪洋
 * @version 1.0.0
 * @ClassName Student.java
 * @Description
 * @CreateTime 2023年03月10日 10:58:00
 */
//需要被写入到文件的对象只需让当前的对象实现序列化接口
public class Student implements Serializable {
    private Integer sid;
    private String sname;

    public Student(Integer sid, String sname, String ssex) {
        this.sid = sid;
        this.sname = sname;
        this.ssex = ssex;
    }

    private String ssex;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }
}
