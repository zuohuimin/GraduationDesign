package cn.zhanghp.entrity;

import lombok.Data;

/*
 * @description: 学生实体类
 * @author: zhanghp
 * @date:2018-03-23
 */
@Data
public class StudentInfo {

    public Integer stuId;
    public String stuName;
    public String pasword;
    public String stuSex;
    public Integer stuAge;
    public String stuBrith;
    public String phone;
    public String entroTime;
    public String email;
    public Integer clazz;

    public StudentInfo() {
    }

    public StudentInfo( String stuName,  String stuSex, Integer stuAge, String stuBrith, String phone, String entroTime, String email, Integer clazz) {
        this.stuName = stuName;
        this.stuSex = stuSex;
        this.stuAge = stuAge;
        this.stuBrith = stuBrith;
        this.phone = phone;
        this.entroTime = entroTime;
        this.email = email;
        this.clazz = clazz;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", pasword='" + pasword + '\'' +
                ", stuSex='" + stuSex + '\'' +
                ", stuAge='" + stuAge + '\'' +
                ", stuBrith='" + stuBrith + '\'' +
                ", phone='" + phone + '\'' +
                ", entroTime='" + entroTime + '\'' +
                ", email='" + email + '\'' +
                ", clazz=" + clazz +
                '}';
    }
}
