package cn.zhanghp.module.service;

import cn.zhanghp.entrity.*;
import cn.zhanghp.module.api.AdminApi;
import cn.zhanghp.module.mapper.AdminMapper;
import cn.zhanghp.util.ToolUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/*
 * @description: 管理员模块
 * @author: zhanghp
 * @date:2018-03-23
 */

@Service
@Transactional
public class AdminApiImpl implements AdminApi {

    @Autowired
    private AdminMapper adminMapper;


    @Override
    public int addStudent(String stuName,String stuSex,Integer stuAge,String stuBrith,String phone,String email,Integer calzz) {
        String entorTime = ToolUtil.getDate();
        StudentInfo studentInfo = new StudentInfo(stuName,stuSex,stuAge,stuBrith,phone,entorTime,email,calzz);
        return adminMapper.insertStudent(studentInfo);
    }


    @Override
    public int addTeacher(String name,String sex,Integer age, String brith,String title,String major,String nativePlace,String phone) {
        String entorTime = ToolUtil.getDate();
        TeacherInfo teacherInfo = new TeacherInfo(name,sex,age,brith,entorTime,title,major,nativePlace,phone);
        return adminMapper.insertTeacher(teacherInfo);
    }

//    @Override
//    public int addAdmin() {
//        return 0;
//    }

    @Override
    public int addCourse(String name,String style,String studyTime) {
        CounseInfo counseInfo = new CounseInfo(name,style,studyTime);
        return adminMapper.insertCourse(counseInfo);
    }



    @Override
    public int addDepartment(String depName) {
        return adminMapper.insertDepartment(depName);
    }

    @Override
    public List<TeacherInfo> queryteachers(String[] teaId) {
        return adminMapper.selectTecher(teaId);
    }

    /*管理员排课功能*/
    @Override
    public boolean teachingSchedule(TeacherInfo teacherInfo ,Integer weekDay) {

        List<TeachingInfo> teachingInfos = new ArrayList<>();
        //获取所有教室
        List<ClassRoomInfo> roomList = adminMapper.selectRoom();
        for(int i = 0 ;i<roomList.size(); i++){
            teachingInfos = adminMapper.selectTeaching(roomList.get(i).getRoomId(),0,0,weekDay);
           //没有课时课程 1，2，3，4
           if (teachingInfos.isEmpty()){
               //添加一个授课   随机从1，2，3，4中选择一个开始
                Integer num = ToolUtil.getNum();
               adminMapper.insertTeaching(teacherInfo.getTeaId(),num,roomList.get(i).getRoomId(),weekDay);
               return true;
           }else if (teachingInfos.size()<4){//已有排课   但是全天没有排
               List<Integer> lessonTime = new ArrayList<>();
               for (TeachingInfo teachingInfo : teachingInfos) {
                   lessonTime.add(teachingInfo.getLessonTime());
               }
               //获取剩余课时  并从中随机取出一个
               Integer num = ToolUtil.getLessonTime(lessonTime);
               adminMapper.insertTeaching(teacherInfo.getTeaId(),num,roomList.get(i).getRoomId(),weekDay);
               return true;
           }
        }
        return false;


    }

}
