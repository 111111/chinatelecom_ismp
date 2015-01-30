package com.chinatelecom.ismp.sp;

import java.util.HashMap;
import java.util.Map;

/**
 * ChinaTelecomConstants简要说明:
 * 创建人: qy
 * 创建时间: 14-9-1 上午9:37
 */
public class ChinaTelecomConstants {


    /**
     * 0：订购
     * 1：暂停
     * 2：暂停恢复
     * 3：退订
     * 4：退订该Sp下的所有套餐
     * 5：暂停该SP下的所有套餐
     * 6：替换
     */
    static class OPType{
        static int ORDER = 0;
        static int PAUSE = 1;
        static int PAUSE_RECOVERY = 2;
        static int UNSUBSCRIBE = 3;
        static int UNSUBSCRIBE_ALL = 4;
        static int PAUSE_RECOVERY_ALL = 5;
        static int REPLACE = 6;


    }

    /**
     * 0 成功
     * 10 发端设备类型非法
     * 11 发端设备ID非法
     * 12 用户号码非法
     * 13 用户类型非法
     * 14 产品ID非法
     * 15 套餐ID非法
     * 16 linkID非法
     * 17 HasFeatureStr非法
     * 18 FeatureStr非法
     * 19 ID非法
     * 20 IDType非法
     * 21 status非法
     * 22 OPType非法
     * 99其他
     */
    static class ResultCode{
        static int SUCCESS = 0;
        static int DEVICE_TYPE_ERROR = 10;
        static int DEVICE_ID_ERROR = 11;
        static int USER_ID_ERROR = 12;
        static int USER_ID_TYPE_ERROR = 13;
        static int PRODUCT_ID_ERROR = 14;
        static int PACKAGE_ID_ERROR = 15;
        static int LINKID_ERROR = 16;
        static int OTHER_CODE = 99;
    }
}
