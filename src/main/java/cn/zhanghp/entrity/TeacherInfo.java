package cn.zhanghp.entrity;
/*
 * @description: 教师实体类
 * @author: zhanghp
 * @date:2018-03-23
 */

import lombok.Data;

@Data
public class TeacherInfo {

    public Integer teaId;
    public String teaName;
    public String password;
    public String teaSex;
    public Integer teaAge;
    public String teaBrith;
    public String entroTime;
    public String title;
    public String major;
    public String nativePlace;
    public String phone;

    public TeacherInfo() {
    }

    public TeacherInfo(String teaName, String teaSex, Integer teaAge, String teaBrith, String entroTime, String title, String major, String nativePlace, String phone) {
        this.teaName = teaName;
        this.teaSex = teaSex;
        this.teaAge = teaAge;
        this.teaBrith = teaBrith;
        this.entroTime = entroTime;
        this.title = title;
        this.major = major;
        this.nativePlace = nativePlace;
        this.phone = phone;
    }
}
