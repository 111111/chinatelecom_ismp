
package cn.com.chinatelecom.schema.ctcc.sms.v2_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DeliveryStatus�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�����ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="DeliveryStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DeliveredToNetwork"/>
 *     &lt;enumeration value="DeliveryUncertain"/>
 *     &lt;enumeration value="DeliveryImpossible"/>
 *     &lt;enumeration value="MessageWaiting"/>
 *     &lt;enumeration value="DeliveredToTerminal"/>
 *     &lt;enumeration value="DeliveryNotificationNotSupported"/>
 *     &lt;enumeration value="AuthPriceFailed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeliveryStatus")
@XmlEnum
public enum DeliveryStatus {

    //短消息已成功递交至网络
    @XmlEnumValue("DeliveredToNetwork")
    DELIVERED_TO_NETWORK("DeliveredToNetwork"),
    //递交状态未知
    @XmlEnumValue("DeliveryUncertain")
    DELIVERY_UNCERTAIN("DeliveryUncertain"),
    //无法成功发送
    @XmlEnumValue("DeliveryImpossible")
    DELIVERY_IMPOSSIBLE("DeliveryImpossible"),
    //消息仍在排队等待递交
    @XmlEnumValue("MessageWaiting")
    MESSAGE_WAITING("MessageWaiting"),
    //成功发送至终端
    @XmlEnumValue("DeliveredToTerminal")
    DELIVERED_TO_TERMINAL("DeliveredToTerminal"),
    //不支持发送回执功能
    @XmlEnumValue("DeliveryNotificationNotSupported")
    DELIVERY_NOTIFICATION_NOT_SUPPORTED("DeliveryNotificationNotSupported"),
    //鉴权计费失败
    @XmlEnumValue("AuthPriceFailed")
    AUTH_PRICE_FAILED("AuthPriceFailed");
    private final String value;

    DeliveryStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeliveryStatus fromValue(String v) {
        for (DeliveryStatus c: DeliveryStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
