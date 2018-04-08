package cn.zhanghp.module.mapper;

import cn.zhanghp.entrity.*;
import cn.zhanghp.module.mapper.sql.AdminSql;
import org.apache.ibatis.annotations.*;

import java.util.List;

/*
 * @description: 管理员功能模块
 * @author: zhanghp
 * @date:2018-03-23
 */
@Mapper
public interface AdminMapper {

    /*新增学生*/
    @Insert("insert into student(id,name,sex,age,brith,entroTime,phone,email,clazz,password) " +
            "values(0,#{stuName},#{stuSex},#{stuAge},#{stuBrith},#{entroTime},#{phone},#{email},#{clazz},'123') ")
    int insertStudent(StudentInfo studentInfo);

    /*新增教师*/
    @Insert("insert into teacher(teaId,teaName,teaSex,teaAge,teaBrith,teaBrith,entroTime,title,major,native,phone,password)" +
            "values(0,#{teaName},#{teaSex},#{teaAge},#{teaBrith},#{entroTime},#{title},#{major},#{nativePlace},#{phone},'456')")
    int insertTeacher(TeacherInfo teacherInfo);

    /*新增课程*/
    @Insert("insert into course(mdID,mdName,mdStyle,mdStudent,mdStudyTime,)" +
            "values(0,#{mdName},#{mdStyle},#{mdStudyTime})")
    int insertCourse(CounseInfo counseInfo);

    /*新增系别*/
    @Insert("insert into department(deptId,depName)" +
            "values(0,#{depName})")
    int insertDepartment(String depName);

    /*查询所有教室*/
    @Select("select roomId,roomName,maxNum from classroom")
    List<ClassRoomInfo> selectRoom();

    /*按条件查询所有教师*/
    @Select("select teaId,teaName,title,major from teacher")
    List<TeacherInfo> selectTecher(String[] teaId);

    /*按条件查询授课数据*/
    @SelectProvider(type = AdminSql.class,method = "selectTeaching")
    List<TeachingInfo> selectTeaching(Integer roomId,Integer lessonTime,Integer tId,Integer weekday);

    /*新增授课数据*/
    @Insert("insert into teaching(id,tId,lessonTime,roomId,weekday)" +
            "values(0,#{tId},#{lessonTime},#{roomId},#{weekday})")
    int insertTeaching(@Param("tId")Integer tId,Integer lessonTime,Integer roomId,Integer weekday);

}
