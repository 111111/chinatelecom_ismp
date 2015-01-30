
package cn.com.chinatelecom.schema.ctcc.common.v2_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RequestSOAPHeader complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RequestSOAPHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="spId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="spPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timeStamp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transEnd" type="{http://www.chinatelecom.com.cn/schema/ctcc/common/v2_1}EndReason" minOccurs="0"/>
 *         &lt;element name="linkId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OA" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="FA" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="multicastMessaging" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestSOAPHeader", propOrder = {
    "spId",
    "spPassword",
    "timeStamp",
    "productId",
    "san",
    "transactionId",
    "transEnd",
    "linkId",
    "oa",
    "fa",
    "multicastMessaging"
})
public class RequestSOAPHeader {

    @XmlElement(required = true)
    protected String spId;
    @XmlElement(required = true)
    protected String spPassword;
    @XmlElement(required = true)
    protected String timeStamp;
    @XmlElement(required = true)
    protected String productId;
    @XmlElement(name = "SAN")
    protected String san;
    protected String transactionId;
    protected String transEnd;
    protected String linkId;
    @XmlElement(name = "OA")
    @XmlSchemaType(name = "anyURI")
    protected String oa;
    @XmlElement(name = "FA")
    @XmlSchemaType(name = "anyURI")
    protected String fa;
    protected Boolean multicastMessaging;

    /**
     * 获取spId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpId() {
        return spId;
    }

    /**
     * 设置spId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpId(String value) {
        this.spId = value;
    }

    /**
     * 获取spPassword属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpPassword() {
        return spPassword;
    }

    /**
     * 设置spPassword属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpPassword(String value) {
        this.spPassword = value;
    }

    /**
     * 获取timeStamp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeStamp() {
        return timeStamp;
    }

    /**
     * 设置timeStamp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeStamp(String value) {
        this.timeStamp = value;
    }

    /**
     * 获取productId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * 设置productId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
        this.productId = value;
    }

    /**
     * 获取san属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAN() {
        return san;
    }

    /**
     * 设置san属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAN(String value) {
        this.san = value;
    }

    /**
     * 获取transactionId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * 设置transactionId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * 获取transEnd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransEnd() {
        return transEnd;
    }

    /**
     * 设置transEnd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransEnd(String value) {
        this.transEnd = value;
    }

    /**
     * 获取linkId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkId() {
        return linkId;
    }

    /**
     * 设置linkId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkId(String value) {
        this.linkId = value;
    }

    /**
     * 获取oa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOA() {
        return oa;
    }

    /**
     * 设置oa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOA(String value) {
        this.oa = value;
    }

    /**
     * 获取fa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFA() {
        return fa;
    }

    /**
     * 设置fa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFA(String value) {
        this.fa = value;
    }

    /**
     * 获取multicastMessaging属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMulticastMessaging() {
        return multicastMessaging;
    }

    /**
     * 设置multicastMessaging属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMulticastMessaging(Boolean value) {
        this.multicastMessaging = value;
    }

}
