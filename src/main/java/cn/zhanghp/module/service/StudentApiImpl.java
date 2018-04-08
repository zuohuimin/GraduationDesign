package cn.zhanghp.module.service;

import cn.zhanghp.entrity.ResultInfo.Teaching;
import cn.zhanghp.module.api.StudentApi;
import cn.zhanghp.module.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: TODO
 * @Author: zhanghpj
 * @Version 1.0, 14:00 2018/4/8
 * @See
 * @Since
 * @Deprecated
 */
@Service
public class StudentApiImpl implements StudentApi{

    @Autowired
    private StudentMapper studentMapper;
    @Override
    public List<Teaching> queryTeaching(Integer team) {

        return studentMapper.queryTeaching(team);
    }
}
