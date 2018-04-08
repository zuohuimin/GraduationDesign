package cn.zhanghp.entrity;

import lombok.Data;

/*
 * @description: 咨询信息
 * @author: zhanghp
 * @date:2018-03-23
 */
@Data
public class ConsultInfo {

    public Integer consulId;
    public String author;
    public String title;
    public String status;
    public String content;
    public String creatTime;
    public String updateTime;
    public String reason;

}
