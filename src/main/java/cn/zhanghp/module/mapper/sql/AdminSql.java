package cn.zhanghp.module.mapper.sql;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.jdbc.SQL;

/*
 * @description: 关于管理员模块的所有动态查询sql
 * @author: zhanghp
 * @date:2018-03-24
 */
public class AdminSql {

    public String selectTeacher(String[] teaIds){
        return new SQL(){
            {
                SELECT("teaId,teaName,teaSex,teaAge,teaBrith,entriTime,title,major,phone");
                FROM("teacher");
                if (teaIds!=null&&teaIds.length<=0){
                    WHERE("find_in_set(teaId,"+teaIds+")");

                }
            }
        }.toString();
    }


    public String selectTeaching(Integer roomId,Integer lessonTime,Integer tId,Integer weekDay){
        return new SQL(){
            {
                SELECT("id,tId,lessonTime,roomId,weekday,stopTime");
                FROM("teaching");
                if (roomId!=null&&roomId!=0){
                    WHERE("roomId="+roomId);
                }
                if (lessonTime!=null && lessonTime!=0){
                    AND();
                    WHERE("lessonTime="+lessonTime);
                }
                if (tId!=null &&tId!=0){
                    AND();
                    WHERE("tId="+tId);
                }
                if (weekDay!=null && weekDay!=0){
                    AND();
                    WHERE("weekday="+weekDay);
                }
            }
        }.toString();
    }
}
