package com.github.gdpl2112.cabs.step3_up;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import io.github.kloping.MySpringTool.StarterApplication;
import io.github.kloping.MySpringTool.annotations.AutoStand;
import io.github.kloping.MySpringTool.annotations.CommentScan;
import org.jsoup.nodes.Document;

/**
 * 进阶教学
 * 当 调用到 https://api.uomg.com/api/rand.avatar?sort=%E7%94%B7&format=json
 * API 时 数据量小 不至于 我们生成一个 实体类 时
 * 编写 {@link Uomg}
 * <p>
 * ```json
 * {"code":1,"imgurl":"https:\/\/ae01.alicdn.com\/kf\/HTB17B4LbwaH3KVjSZFp762hKpXao.png"}
 * ```
 *
 * @author github-kloping
 * @version 1.0
 */

@CommentScan(path = "com.github.gdpl2112.cabs.step3_up")
public class Step3 {
    public static String before(Document document) {
        System.out.println("before");
        System.out.println(document);
        JSONObject jo = JSON.parseObject(document.body().text());
        return jo.getString("imgurl");
    }

    @AutoStand
    public static Uomg uomg;

    public static void main(String[] args) {

        StarterApplication.run(Step3.class);

        System.out.println("return: " + uomg.getPng(null, null));

    }
}
