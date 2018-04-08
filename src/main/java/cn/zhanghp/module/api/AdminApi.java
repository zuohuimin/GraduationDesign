package cn.zhanghp.module.api;

import cn.zhanghp.entrity.TeacherInfo;
import cn.zhanghp.entrity.TeachingInfo;

import java.util.List;

public interface AdminApi {

    int addStudent(String stuName, String stuSex, Integer stuAge, String stuBrith, String phone, String email, Integer calzz);

    int addTeacher(String name,String sex,Integer age, String brith,String title,String major,String nativePlace,String phone);

   // int addAdmin();

    int addCourse(String name,String style,String studyTime);


    int addDepartment(String depName);

  //  int addRole();

    boolean teachingSchedule(TeacherInfo teacherInfo , Integer weekDay);


    List<TeacherInfo> queryteachers(String[] teaId);
}
