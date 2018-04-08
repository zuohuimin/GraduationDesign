package cn.zhanghp.controller;

import cn.zhanghp.entrity.ResultInfo.Teaching;
import cn.zhanghp.module.api.StudentApi;
import cn.zhanghp.util.RtnData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @Author: zhanghpj
 * @Version 1.0, 13:13 2018/4/8
 * @See
 * @Since
 * @Deprecated
 */
@Controller
@RequestMapping("Student")
public class StudentController {

    @Autowired
    private StudentApi studentApi;

    /**
     * @description  修改密码
     * @method  updatePassword
     * @params stuId
     * @return String
     * @exception
     */
    public String updatePassword(Integer stuId){

        return new RtnData().toString();
    }

    /**
     * @description 授课表查询
     * @method  queryTeaching
     * @params team
     * @return
     * @exception
     */
    @RequestMapping(value = "/stu/queryTeaching",method = RequestMethod.GET)
    @ResponseBody
    public String queryTeaching(@RequestParam("team") Integer team){
        List<Teaching> teachings = new ArrayList<>();
        teachings = studentApi.queryTeaching(team);
        return new RtnData(teachings).toString();
    }

    /**
     * @description 选课
     * @method  selectTeaching
     * @params stuId,teachingId,team
     * @return
     * @exception
     */
    public String selectTeaching(Integer stuId,Integer teachingId,Integer team){

        return new RtnData().toString();
    }

    /**
     * @description 个人课程查询
     * @method  queryStuTeaching
     * @params stuId
     * @return
     * @exception
     */
    public String queryStuTeaching(Integer stuId){

        return new RtnData().toString();
    }


    /**
     * @description 查询咨询信息
     * @method  queryConsult
     * @params
     * @return
     * @exception
     */
    public String queryConsult(){
        return new RtnData().toString();
    }

    /**
     * @description 个人收藏信息查询
     * @method  queryOneselfConsult
     * @params stuId
     * @return
     * @exception
     */
    public String queryOneselfConsult(){

        return new RtnData().toString();
    }

    /**
     * @description 个人信息查询
     * @method  queryOneselfInfo
     * @params stuId
     * @return
     * @exception
     */
    public String queryOneselfInfo(){

        return new RtnData().toString();
    }

}
