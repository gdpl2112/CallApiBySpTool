package com.github.gdpl2112.cabs.step0;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.gdpl2112.cabs.step0.entity.SevenWeather;
import io.github.kloping.json.JsonSJC;

/**
 * 第0步, 首先随便拿到一个请求的数据
 * 作为模块
 * 这里用的是 优客
 * https://api.iyk0.com/7rtq/?city=北京
 * 其数据为
 *
 *
 * ```json
 * {
 *     "code": 200,
 *     "msg": "获取成功！",
 *     "city": "北京",
 *     "cityid": "101010100",
 *     "update_time": "2022-01-18 09:15:04",
 *     "data": [
 *         {
 *             "date": "2022-01-18",
 *             "wea": "晴",
 *             "wea_img": "qing",
 *             "tem_day": "3",
 *             "tem_night": "-7",
 *             "win": "东北风",
 *             "win_speed": "<3级"
 *         },
 *         {
 *             "date": "2022-01-19",
 *             "wea": "多云",
 *             "wea_img": "yun",
 *             "tem_day": "0",
 *             "tem_night": "-8",
 *             "win": "南风",
 *             "win_speed": "<3级"
 *         },
 *         {
 *             "date": "2022-01-20",
 *             "wea": "多云",
 *             "wea_img": "yun",
 *             "tem_day": "0",
 *             "tem_night": "-7",
 *             "win": "南风",
 *             "win_speed": "<3级"
 *         },
 *         {
 *             "date": "2022-01-21",
 *             "wea": "阴",
 *             "wea_img": "yin",
 *             "tem_day": "0",
 *             "tem_night": "-5",
 *             "win": "北风",
 *             "win_speed": "<3级"
 *         },
 *         {
 *             "date": "2022-01-22",
 *             "wea": "多云",
 *             "wea_img": "yun",
 *             "tem_day": "1",
 *             "tem_night": "-7",
 *             "win": "东北风",
 *             "win_speed": "<3级"
 *         },
 *         {
 *             "date": "2022-01-23",
 *             "wea": "多云转阴",
 *             "wea_img": "yun",
 *             "tem_day": "2",
 *             "tem_night": "-6",
 *             "win": "南风",
 *             "win_speed": "<3级"
 *         },
 *         {
 *             "date": "2022-01-24",
 *             "wea": "多云转晴",
 *             "wea_img": "yun",
 *             "tem_day": "3",
 *             "tem_night": "-6",
 *             "win": "西南风",
 *             "win_speed": "<3级"
 *         }
 *     ]
 * }
 * ```
 *
 *
 * <p>
 * <p>
 * 利用 io.github.kloping.json.JsonSJC
 * 运行下面 代码 即可生成 {@link SevenWeather}
 *
 * 当然 也可以用其他的 方法 生成数据实体类
 *
 * 数据模块实体类
 *
 * @author github-kloping
 * @version 1.0
 */
public class Step0 {
    public static void main(String[] args) {
        JSONObject jsonObject = JSON.parseObject("{\n" +
                "    \"code\": 200,\n" +
                "    \"msg\": \"获取成功！\",\n" +
                "    \"city\": \"北京\",\n" +
                "    \"cityid\": \"101010100\",\n" +
                "    \"update_time\": \"2022-01-18 09:15:04\",\n" +
                "    \"data\": [\n" +
                "        {\n" +
                "            \"date\": \"2022-01-18\",\n" +
                "            \"wea\": \"晴\",\n" +
                "            \"wea_img\": \"qing\",\n" +
                "            \"tem_day\": \"3\",\n" +
                "            \"tem_night\": \"-7\",\n" +
                "            \"win\": \"东北风\",\n" +
                "            \"win_speed\": \"<3级\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"date\": \"2022-01-19\",\n" +
                "            \"wea\": \"多云\",\n" +
                "            \"wea_img\": \"yun\",\n" +
                "            \"tem_day\": \"0\",\n" +
                "            \"tem_night\": \"-8\",\n" +
                "            \"win\": \"南风\",\n" +
                "            \"win_speed\": \"<3级\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"date\": \"2022-01-20\",\n" +
                "            \"wea\": \"多云\",\n" +
                "            \"wea_img\": \"yun\",\n" +
                "            \"tem_day\": \"0\",\n" +
                "            \"tem_night\": \"-7\",\n" +
                "            \"win\": \"南风\",\n" +
                "            \"win_speed\": \"<3级\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"date\": \"2022-01-21\",\n" +
                "            \"wea\": \"阴\",\n" +
                "            \"wea_img\": \"yin\",\n" +
                "            \"tem_day\": \"0\",\n" +
                "            \"tem_night\": \"-5\",\n" +
                "            \"win\": \"北风\",\n" +
                "            \"win_speed\": \"<3级\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"date\": \"2022-01-22\",\n" +
                "            \"wea\": \"多云\",\n" +
                "            \"wea_img\": \"yun\",\n" +
                "            \"tem_day\": \"1\",\n" +
                "            \"tem_night\": \"-7\",\n" +
                "            \"win\": \"东北风\",\n" +
                "            \"win_speed\": \"<3级\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"date\": \"2022-01-23\",\n" +
                "            \"wea\": \"多云转阴\",\n" +
                "            \"wea_img\": \"yun\",\n" +
                "            \"tem_day\": \"2\",\n" +
                "            \"tem_night\": \"-6\",\n" +
                "            \"win\": \"南风\",\n" +
                "            \"win_speed\": \"<3级\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"date\": \"2022-01-24\",\n" +
                "            \"wea\": \"多云转晴\",\n" +
                "            \"wea_img\": \"yun\",\n" +
                "            \"tem_day\": \"3\",\n" +
                "            \"tem_night\": \"-6\",\n" +
                "            \"win\": \"西南风\",\n" +
                "            \"win_speed\": \"<3级\"\n" +
                "        }\n" +
                "    ]\n" +
                "}");
        JsonSJC.parse(jsonObject, "./src/main/java/com/github/gdpl2112/cabs/step0/entity", "SevenWeather", "com.github.gdpl2112.cabs.step0.entity");
    }
}
