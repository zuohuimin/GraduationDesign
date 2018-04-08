package cn.zhanghp.entrity;

/*
 * @description: 系别表
 * @author: zhanghp
 * @date:2018-03-23
 */
public class DepartmentInfo {

    public Integer deptId;
    public String depName;

    public DepartmentInfo() {
    }

    public DepartmentInfo(String depName) {
        this.depName = depName;
    }
}
