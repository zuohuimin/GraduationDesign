package cn.zhanghp.entrity;

import lombok.Data;

/*
 * @description: 教师授课表实体类
 * @author: zhanghp
 * @date:2018-03-24
 */
@Data
public class TeachingInfo {

    public Integer id;
    public Integer tId;
    public Integer roomId;
    public Integer lessonTime;
    public String weekday;
    public String stopTime;

    public TeachingInfo() {
    }

    public TeachingInfo(Integer tId, Integer roomId, Integer lessonTime, String weekday, String stopTime) {
        this.tId = tId;
        this.roomId = roomId;
        this.lessonTime = lessonTime;
        this.weekday = weekday;
        this.stopTime = stopTime;
    }
}
