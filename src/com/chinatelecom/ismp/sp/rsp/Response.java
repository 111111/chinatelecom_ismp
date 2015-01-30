
package com.chinatelecom.ismp.sp.rsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Response complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="streamingNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Response", propOrder = {
    "resultCode",
    "streamingNo"
})
public class Response {

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
    protected int resultCode;

    @XmlElement(required = true, nillable = true)
    protected String streamingNo;

    /**
     * 获取resultCode属性的值。
     * 
     */
    public int getResultCode() {
        return resultCode;
    }

    /**
     * 设置resultCode属性的值。
     * 
     */
    public void setResultCode(int value) {
        this.resultCode = value;
    }

    /**
     * 获取streamingNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreamingNo() {
        return streamingNo;
    }

    /**
     * 设置streamingNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreamingNo(String value) {
        this.streamingNo = value;
    }

}
