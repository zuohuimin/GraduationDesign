package cn.zhanghp.entrity;

import lombok.Data;

/*
 * @description: 课程信息
 * @author: zhanghp
 * @date:2018-03-23
 */
@Data
public class CounseInfo {

    public Integer mdId;
    public String mdName;
    public String mdStyle;
    public String mdStudyTime;

    public CounseInfo() {
    }

    public CounseInfo(String mdName, String mdStyle, String mdStudyTime) {
        this.mdName = mdName;
        this.mdStyle = mdStyle;
        this.mdStudyTime = mdStudyTime;
    }
}
