
package com.chinatelecom.ismp.sp.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SPWithdrawSubscriptionReq complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SPWithdrawSubscriptionReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userIDType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="userID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IDType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="streamingNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SPID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SPAdmin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SPAdminPwd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SPWithdrawSubscriptionReq", propOrder = {
    "userIDType",
    "userID",
    "idType",
    "id",
    "streamingNo",
    "spid",
    "spAdmin",
    "spAdminPwd"
})
public class SPWithdrawSubscriptionReq {

    protected int userIDType;
    @XmlElement(required = true, nillable = true)
    protected String userID;
    @XmlElement(name = "IDType")
    protected int idType;
    @XmlElement(name = "ID", required = true, nillable = true)
    protected String id;
    @XmlElement(required = true, nillable = true)
    protected String streamingNo;
    @XmlElement(name = "SPID", required = true, nillable = true)
    protected String spid;
    @XmlElement(name = "SPAdmin", required = true, nillable = true)
    protected String spAdmin;
    @XmlElement(name = "SPAdminPwd", required = true, nillable = true)
    protected String spAdminPwd;

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
     * 获取idType属性的值。
     * 
     */
    public int getIDType() {
        return idType;
    }

    /**
     * 设置idType属性的值。
     * 
     */
    public void setIDType(int value) {
        this.idType = value;
    }

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
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
     * 获取spid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPID() {
        return spid;
    }

    /**
     * 设置spid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPID(String value) {
        this.spid = value;
    }

    /**
     * 获取spAdmin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPAdmin() {
        return spAdmin;
    }

    /**
     * 设置spAdmin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPAdmin(String value) {
        this.spAdmin = value;
    }

    /**
     * 获取spAdminPwd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPAdminPwd() {
        return spAdminPwd;
    }

    /**
     * 设置spAdminPwd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPAdminPwd(String value) {
        this.spAdminPwd = value;
    }

    public String toJson(){
        StringBuffer str = new StringBuffer();
        str.append("{");
        str.append("streamingNo:\"").append(streamingNo).append("\",");
        str.append("userID:\"").append(userID).append("\",");
        str.append("userIDType:\"").append(userIDType).append("\",");
        str.append("id:\"").append(id).append("\",");
        str.append("spid:\"").append(spid).append("\",");
        str.append("spAdmin:\"").append(spAdmin).append("\",");
        str.append("spAdminPwd:\"").append(spAdminPwd).append("\",");
        str.append("idType:\"").append(idType).append("\"");
        str.append("}");
        return str.toString();
    }
}
