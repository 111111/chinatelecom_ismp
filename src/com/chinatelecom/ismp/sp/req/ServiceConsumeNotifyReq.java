
package com.chinatelecom.ismp.sp.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ServiceConsumeNotifyReq complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ServiceConsumeNotifyReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="featureStr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="linkID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="productID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="streamingNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userIDType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceConsumeNotifyReq", propOrder = {
    "featureStr",
    "linkID",
    "productID",
    "streamingNo",
    "userID",
    "userIDType"
})
public class ServiceConsumeNotifyReq {

    @XmlElement(required = true, nillable = true)
    protected String featureStr;
    @XmlElement(required = true, nillable = true)
    protected String linkID;
    @XmlElement(required = true, nillable = true)
    protected String productID;
    @XmlElement(required = true, nillable = true)
    protected String streamingNo;
    @XmlElement(required = true, nillable = true)
    protected String userID;
    protected int userIDType;

    /**
     * 获取featureStr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureStr() {
        return featureStr;
    }

    /**
     * 设置featureStr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureStr(String value) {
        this.featureStr = value;
    }

    /**
     * 获取linkID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkID() {
        return linkID;
    }

    /**
     * 设置linkID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkID(String value) {
        this.linkID = value;
    }

    /**
     * 获取productID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductID() {
        return productID;
    }

    /**
     * 设置productID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductID(String value) {
        this.productID = value;
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

    /**
     * 获取userID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * 设置userID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * 获取userIDType属性的值。
     * 
     */
    public int getUserIDType() {
        return userIDType;
    }

    /**
     * 设置userIDType属性的值。
     * 
     */
    public void setUserIDType(int value) {
        this.userIDType = value;
    }

    public String toJson(){
        StringBuffer str = new StringBuffer();
        str.append("{");
        str.append("streamingNo:\"").append(streamingNo).append("\",");
        str.append("userID:\"").append(userID).append("\",");
        str.append("userIDType:\"").append(userIDType).append("\",");
        str.append("productID:\"").append(productID).append("\",");
        str.append("linkID:\"").append(linkID).append("\",");
        str.append("featureStr:\"").append(featureStr).append("\"");
        str.append("}");
        return str.toString();
    }

}
