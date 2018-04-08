package cn.zhanghp.module.mapper.sql;

import com.sun.org.apache.xpath.internal.operations.And;
import org.apache.ibatis.jdbc.SQL;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: TODO
 * @Author: zhanghpj
 * @Version 1.0, 14:09 2018/4/8
 * @See
 * @Since
 * @Deprecated
 */
public class StudentSql {


    private static final Logger logger = LoggerFactory.getLogger(StudentSql.class);

    public String queryTeaching(Integer team){
        String sql = new SQL(){
            {
                SELECT("teaching.id as teachId","tea.teaName as teaName","tea.major as course","room.roomName as roomName","room.maxNum as maxNum","teaching.weekday as weekday","teaching.selectNum as selectNum");
                FROM("teaching as teaching","teacher as tea","classroom as room");
                WHERE("teaching.tId = tea.teaId and teaching.roomId = room.roomId");
                AND();
                WHERE("team="+team);
            }
        }.toString();
        logger.info("queryTeachIng >>:"+sql);
        return sql;
    }

}
