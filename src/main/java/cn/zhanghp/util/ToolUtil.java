package cn.zhanghp.util;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
 * @description: 各种工具类
 * @author: zhanghp
 * @date:2018-03-23
 */
public class ToolUtil {

    private List<Integer> list = new ArrayList<>(4);

    /*
     * @description: 返回目前系统时间
     * @author: zhanghp
     * @date:2018/3/23
     */
    public static String getDate() {
        SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd");
        Long dateLong = System.currentTimeMillis();
        return format.format(dateLong);
    }


    public static Integer getNum() {
        Random random = new Random();
        return random.nextInt(4) + 1;

    }

    public static Integer getLessonTime(List list) {
        Integer[] ints = {1, 2, 3, 4};
        List<Integer> lis = new ArrayList<>();
        Collections.addAll(lis, ints);
        for (int i : ints) {
            if (list.contains(i)) lis.remove(lis.indexOf(i));
        }
        Random random = new Random();
        return lis.get(random.nextInt(lis.size()));
    }


}
