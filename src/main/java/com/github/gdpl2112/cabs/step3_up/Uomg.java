package com.github.gdpl2112.cabs.step3_up;

import io.github.kloping.MySpringTool.annotations.http.*;

/**
 * @author github kloping
 * @version 1.0
 */

@HttpClient(" https://api.uomg.com/api")
public interface Uomg {
    /**
     * https://api.uomg.com/api/rand.avatar?sort=%E7%94%B7&format=json
     * 当参数 被 {@link ParamName} 和 {@link DefaultValue} 注解时 可传入 null
     * 将使用默认  {@link DefaultValue} 中的值
     * <p>
     * 其 返回为一个json 格式 显然不是 string
     * 利用 Callback 将 其数据不会立即返回
     * 而是 先去调用指定的方法
     *
     * @param sort
     * @param format
     * @return
     */
    @GetPath("/rand.avatar")
    @Callback("com.github.gdpl2112.cabs.step3_up.Step3.before")
    String getPng(
            @ParamName("sort") @DefaultValue("女") String sort,
            @ParamName("format") @DefaultValue("json") String format
    );
}
