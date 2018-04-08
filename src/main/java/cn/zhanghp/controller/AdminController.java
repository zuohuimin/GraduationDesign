package cn.zhanghp.controller;

import cn.zhanghp.entrity.TeacherInfo;
import cn.zhanghp.module.api.AdminApi;
import cn.zhanghp.util.RtnData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/*
 * @description: 教务管理员模块
 * @author: zhanghp
 * @date:2018-03-23
 */

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminApi adminApi;

    @RequestMapping(value = "/reginster",method = RequestMethod.GET)
    public String returnForm(){
        return "forms";
    }

    /*
     * @description: 新增学生
     * @author: zhanghp
     * @date:2018/3/24
     */
    @RequestMapping(value = "/add/student",method = RequestMethod.POST)
    @ResponseBody
    public String addStudent(String stuName, String stuSex, Integer stuAge, String stuBrith, String phone, String email, Integer clazz){

        int result = adminApi.addStudent(stuName,stuSex,stuAge,stuBrith,phone,email,clazz);
        if (result==1){
            return new RtnData().toString();
        }
        return new RtnData("999999","请求失败！").toString();
    }

    /*
     * @description: 新增教师
     * @author: zhanghp
     * @date:2018/3/24
     */
    @RequestMapping(value = "/add/teacher",method = RequestMethod.POST)
    @ResponseBody
    public String addTeacher(String name,String sex,Integer age, String brith,String title,String major,String nativePlace,String phone){
        int result = adminApi.addTeacher(name,sex,age,brith,title,major,nativePlace,phone);
        if (result==1){
            return new RtnData().toString();
        }
        return new RtnData("999999","请求失败！").toString();
    }

    /*
     * @description: 新增课程
     * @author: zhanghp
     * @date:2018/3/24
     */
    @RequestMapping(value = "/add/course",method = RequestMethod.POST)
    @ResponseBody
    public String addCourse(String name,String style,String studyTime){
        int result = adminApi.addCourse(name,style,studyTime);
        if (result==1){
            return new RtnData().toString();
        }
        return new RtnData("999999","请求失败！").toString();
    }

    /*
     * @description: 新增系别
     * @author: zhanghp
     * @date:2018/3/24
     */
    @RequestMapping(value = "/add/department",method = RequestMethod.POST)
    @ResponseBody
    public String addDepartment(String name){
        int result = adminApi.addDepartment(name);
        if (result==1){
            return new RtnData().toString();
        }
        return new RtnData("999999","请求失败！").toString();
    }


    /*
     * @description: 新增授课表
     * @author: zhanghp
     * @date:2018/3/24
     */
    @RequestMapping(value = "/add/teaching",method = RequestMethod.POST)
    @ResponseBody
    public String addTeaching(String[] teaId,Integer weekday){
        List<TeacherInfo> teacherInfoList = new ArrayList<>();
        //获取参与排课的所有信息
        teacherInfoList = adminApi.queryteachers(teaId);
        if (teacherInfoList.size()<=0){
            return new RtnData("999999","请求失败！").toString();
        }
        for (TeacherInfo teacherInfo : teacherInfoList) {
            boolean checked = adminApi.teachingSchedule(teacherInfo,weekday);
            if (!checked){
                return new RtnData("999999","教室已经被使用完！！").toString();
            }
        }
        return new RtnData().toString();
    }


}
