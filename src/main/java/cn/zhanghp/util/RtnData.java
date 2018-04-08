package cn.zhanghp.util;

/*
 * @description: 返回实体类
 * @author: zhanghp
 * @date:2018-03-23
 */
public class RtnData {

    private String rtnCode = "000000";
    private String rtnMessage = "请求成功！";
    private Object responseData;

    public RtnData(String rtnCode, String rtnMessage, Object responesData) {
        this.rtnCode = rtnCode;
        this.rtnMessage = rtnMessage;
        this.responseData = responesData;
    }

    public RtnData(Object responesData) {
        this.responseData = responesData;
    }

    public RtnData(String rtnCode, String rtnMessage) {
        this.rtnCode = rtnCode;
        this.rtnMessage = rtnMessage;
    }

    public RtnData() {}

    @Override
    public String toString() {
        return "RtnData{" +
                "rtnCode='" + rtnCode + '\'' +
                ", rtnMessage='" + rtnMessage + '\'' +
                ", responseData=" + responseData +
                '}';
    }
}
