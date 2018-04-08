package cn.zhanghp.module.mapper;

import cn.zhanghp.entrity.ResultInfo.Teaching;
import cn.zhanghp.module.mapper.sql.StudentSql;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

/**
 * @Description: TODO
 * @Author: zhanghpj
 * @Version 1.0, 14:05 2018/4/8
 * @See
 * @Since
 * @Deprecated
 */
@Mapper
public interface StudentMapper {

    @SelectProvider(type = StudentSql.class,method = "queryTeaching")
    @Results({
            @Result(column = "teachId",property = "teachingId",javaType = Integer.class),
            @Result(column = "teaName",property = "teacherName",javaType = String.class),
            @Result(column = "course",property = "teacherClazz",javaType = String.class),
            @Result(column = "roomName",property = "roomName",javaType = String.class),
            @Result(column = "maxNum",property = "maxNum",javaType = Integer.class),
            @Result(column = "selectNum",property = "teacherClazz",javaType = Integer.class),
            @Result(column = "weekday",property = "weekday",javaType = Integer.class),
    })
    List<Teaching> queryTeaching(Integer Team);

}
