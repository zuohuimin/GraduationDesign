package cn.zhanghp.entrity.ResultInfo;

import lombok.Data;

/**
 * @Description: TODO
 * @Author: zhanghpj
 * @Version 1.0, 13:48 2018/4/8
 * @See
 * @Since
 * @Deprecated
 */
@Data
public class Teaching {
    public Integer teachingId;
    public String teacherName;
    public String teacherClazz;
    public Integer lessonTime;
    public String roomName;
    public Integer weekday;
    public Integer maxNum;
    public Integer selectNum;


}
