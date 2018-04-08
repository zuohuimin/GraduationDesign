package cn.zhanghp.module.api;

import cn.zhanghp.entrity.ResultInfo.Teaching;

import java.util.List;

/**
 * @Description: TODO
 * @Author: zhanghpj
 * @Version 1.0, 13:46 2018/4/8
 * @See
 * @Since
 * @Deprecated
 */
public interface StudentApi {


    List<Teaching> queryTeaching(Integer team);
}
