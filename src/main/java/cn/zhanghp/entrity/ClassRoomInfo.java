package cn.zhanghp.entrity;

import lombok.Data;

/*
 * @description: 教室信息
 * @author: zhanghp
 * @date:2018-03-23
 */
@Data
public class ClassRoomInfo {

    public Integer roomId;
    public String roomName;
    public Integer maxNum;
}
