
package cn.com.chinatelecom.schema.ctcc.sms.notification.v2_1.local;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import cn.com.chinatelecom.schema.ctcc.sms.v2_1.DeliveryInformation;


/**
 * <p>notifySmsDeliveryReceipt complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="notifySmsDeliveryReceipt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="correlator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deliveryStatus" type="{http://www.chinatelecom.com.cn/schema/ctcc/sms/v2_1}DeliveryInformation"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notifySmsDeliveryReceipt", propOrder = {
    "correlator",
    "deliveryStatus"
})
public class NotifySmsDeliveryReceipt {

    @XmlElement(required = true)
    protected String correlator;
    @XmlElement(required = true)
    protected DeliveryInformation deliveryStatus;

    /**
     * 获取correlator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelator() {
        return correlator;
    }

    /**
     * 设置correlator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelator(String value) {
        this.correlator = value;
    }

    /**
     * 获取deliveryStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DeliveryInformation }
     *     
     */
    public DeliveryInformation getDeliveryStatus() {
        return deliveryStatus;
    }

    /**
     * 设置deliveryStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryInformation }
     *     
     */
    public void setDeliveryStatus(DeliveryInformation value) {
        this.deliveryStatus = value;
    }

}
