package com.huyingbao.demo.util;

import com.huyingbao.demo.BuildConfig;


/**
 * 服务器工具类
 * Created by liujunfeng on 2017/1/1.
 */

public class ServerUtils {
    //    private static String DEBUG_SERVER_API = "http://160.6.76.238:1337";
    private static String DEBUG_SERVER_API = "http://api.huyingbao.top";
    private static String SERVER_API = "http://api.huyingbao.top";

    /**
     * 获取api完整地址
     *
     * @return
     */
    public static String getServerApi() {
        return BuildConfig.DEBUG ? DEBUG_SERVER_API : SERVER_API;
    }
}