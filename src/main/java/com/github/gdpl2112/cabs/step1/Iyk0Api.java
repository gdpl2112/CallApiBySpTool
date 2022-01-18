package com.github.gdpl2112.cabs.step1;

import com.github.gdpl2112.cabs.step0.entity.SevenWeather;
import io.github.kloping.MySpringTool.annotations.http.GetPath;
import io.github.kloping.MySpringTool.annotations.http.HttpClient;
import io.github.kloping.MySpringTool.annotations.http.ParamName;

/**
 * 优客API的接口定义
 * @author github-kloping
 */
@HttpClient("https://api.iyk0.com/")
public interface Iyk0Api {
    /**
     * 其 内部 将调用
     * HttpClient 与 GetPath 拼接
     * 与 参数 ParamName 的 组合get 路径
     *
     * @param city
     * @return
     */
    @GetPath("7rtq/")
    SevenWeather get7rtq(@ParamName("city") String city);
}