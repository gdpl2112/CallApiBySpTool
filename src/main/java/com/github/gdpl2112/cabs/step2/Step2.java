package com.github.gdpl2112.cabs.step2;

import com.github.gdpl2112.cabs.step0.entity.SevenWeather;
import com.github.gdpl2112.cabs.step1.Iyk0Api;
import io.github.kloping.MySpringTool.StarterApplication;
import io.github.kloping.MySpringTool.annotations.AutoStand;
import io.github.kloping.MySpringTool.annotations.CommentScan;

/**
 * CommentScan(path = "com.github.gdpl2112.cabs.step1") <br/>
 * 将方才{@link  Iyk0Api}的 接口 扫描 <br/>
 *
 * 启动工具(含实现该接口 <br/>
 * StarterApplication.run(Step2.class)
 *
 * AutoStand 将 实现的 接口 填充至 字段
 *
 * 至此 该 demo <p>初级教学<p/>已经结束
 * @author github-kloping
 * @version 1.0
 */
@CommentScan(path = "com.github.gdpl2112.cabs.step1")
public class Step2 {
    @AutoStand
    public static Iyk0Api api;

    public static void main(String[] args) {
        StarterApplication.run(Step2.class);

        SevenWeather sevenWeather = api.get7rtq("北京");

        System.out.println(sevenWeather);
    }
}
