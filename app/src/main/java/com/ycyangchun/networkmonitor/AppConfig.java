package com.ycyangchun.networkmonitor;

/**
 *
 * 配置类
 */
public class AppConfig {
    /**
     * true 为debug状态，打印日志;false为上线发布状态
     */
    public static boolean IS_DEBUG = true;

    /**
     * 测试环境
     */
    public static final int TEST_TYPE = 0;
    /**
     * 生产环境
     */
    public static final int PRODUCT_TYPE = 1;
    /**
     * 通过修改该常量改变测试|生产环境
     */
    public static int RELEASE_TYPE = TEST_TYPE;

    /**
     * 测试环境根路径
     */
    public static final String SERVER_ROOT_TEST = "http://211.99.241.7:8809/";
    /**
     * 生产版本根路径
     */
    public static final String SERVER_ROOT_PRODUCT = "";

    public static String getServerUrl() {
        StringBuilder serverUrl = new StringBuilder("");
        if (RELEASE_TYPE == PRODUCT_TYPE) {// 正式环境
            serverUrl.append(SERVER_ROOT_PRODUCT);
        } else if (RELEASE_TYPE == TEST_TYPE) {// 测试环境
            serverUrl.append(SERVER_ROOT_TEST);
        }
        return serverUrl.toString();

    }

}
