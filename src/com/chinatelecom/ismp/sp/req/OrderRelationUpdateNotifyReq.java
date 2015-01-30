
package com.chinatelecom.ismp.sp.req;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OrderRelationUpdateNotifyReq complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OrderRelationUpdateNotifyReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OPType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="packageID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldPackageID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldProductID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streamingNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userIDType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="VerUserID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderRelationUpdateNotifyReq", propOrder = {
    "opType",
    "packageID",
    "oldPackageID",
    "productID",
    "oldProductID",
    "streamingNo",
    "userID",
    "userIDType",
    "verUserID"
})
public class OrderRelationUpdateNotifyReq {

    @XmlElement(name = "OPType")
    protected int opType;//0：订购  1：暂停  2：暂停恢复  3：退订  4：退订该Sp下的所有套餐  5：暂停该SP下的所有套餐 6：替换

    //暂时无用
    @XmlElementRef(name = "packageID", namespace = "http://req.sp.ismp.chinatelecom.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> packageID;//套餐标识
    //暂时无用
    @XmlElementRef(name = "oldPackageID", namespace = "http://req.sp.ismp.chinatelecom.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> oldPackageID;//被替换套餐标识

    @XmlElementRef(name = "productID", namespace = "http://req.sp.ismp.chinatelecom.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productID;//产品标识

    //暂时无用
    @XmlElementRef(name = "oldProductID", namespace = "http://req.sp.ismp.chinatelecom.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> oldProductID;//被替换产品标识

    @XmlElement(required = true, nillable = true)
    protected String streamingNo;//流水号

    @XmlElement(required = true, nillable = true)
    protected String userID;//用户号码

    protected int userIDType;//0：MSISDN  1：PHS  2：PSTN  3：Pseudo Code

    @XmlElement(name = "VerUserID", nillable = true)
    protected List<String> verUserID;

    /**
     * 获取opType属性的值。
     * 
     */
    public int getOPType() {
        return opType;
    }

    /**
     * 设置opType属性的值。
     * 
     */
    public void setOPType(int value) {
        this.opType = value;
    }

    /**
     * 获取packageID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPackageID() {
        return packageID;
    }

    /**
     * 设置packageID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPackageID(JAXBElement<String> value) {
        this.packageID = value;
    }

    /**
     * 获取oldPackageID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOldPackageID() {
        return oldPackageID;
    }

    /**
     * 设置oldPackageID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOldPackageID(JAXBElement<String> value) {
        this.oldPackageID = value;
    }

    /**
     * 获取productID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductID() {
        return productID;
    }

    /**
     * 设置productID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductID(JAXBElement<String> value) {
        this.productID = value;
    }

    /**
     * 获取oldProductID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOldProductID() {
        return oldProductID;
    }

    /**
     * 设置oldProductID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOldProductID(JAXBElement<String> value) {
        this.oldProductID = value;
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

    /**
     * Gets the value of the verUserID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the verUserID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVerUserID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVerUserID() {
        if (verUserID == null) {
            verUserID = new ArrayList<String>();
        }
        return this.verUserID;
    }


    public String toJson(){
        StringBuffer str = new StringBuffer();
        str.append("{");
        str.append("streamingNo:\"").append(streamingNo).append("\",");
        str.append("userID:\"").append(userID).append("\",");
        str.append("userIDType:\"").append(userIDType).append("\",");
        str.append("productID:\"").append(productID == null ? "" : productID.getValue()).append("\",");
        str.append("oldProductID:\"").append(oldProductID == null ? "" : oldProductID.getValue()).append("\",");
        str.append("packageID:\"").append(packageID == null ? "" : packageID.getValue()).append("\",");
        str.append("oldPackageID:\"").append(oldPackageID == null ? "" : oldPackageID.getValue()).append("\",");
        str.append("OPType:\"").append(opType).append("\"");
        str.append("}");
        return str.toString();
    }

}
