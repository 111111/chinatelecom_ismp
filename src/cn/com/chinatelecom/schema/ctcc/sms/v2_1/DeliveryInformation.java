
package cn.com.chinatelecom.schema.ctcc.sms.v2_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DeliveryInformation complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DeliveryInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="deliveryStatus" type="{http://www.chinatelecom.com.cn/schema/ctcc/sms/v2_1}DeliveryStatus"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryInformation", propOrder = {
    "address",
    "deliveryStatus"
})
public class DeliveryInformation {

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String address;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DeliveryStatus deliveryStatus;

    /**
     * 获取address属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置address属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * 获取deliveryStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DeliveryStatus }
     *     
     */
    public DeliveryStatus getDeliveryStatus() {
        return deliveryStatus;
    }

    /**
     * 设置deliveryStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryStatus }
     *     
     */
    public void setDeliveryStatus(DeliveryStatus value) {
        this.deliveryStatus = value;
    }

    public String toJson(){
        StringBuffer json = new StringBuffer();
        json.append("{");
        json.append("address:\"").append(address).append("\",");
        json.append("deliveryStatus:\"").append(deliveryStatus).append("\"");
        json.append("}");
        return json.toString();
    }
}
