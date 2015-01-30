
package com.chinatelecom.ismp.sp.req;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>NotifyManagementInfoReq complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="NotifyManagementInfoReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IDType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "NotifyManagementInfoReq", propOrder = {
    "id",
    "idType",
    "status",
    "streamingNo"
})
public class NotifyManagementInfoReq {

    @XmlElement(name = "ID", required = true, nillable = true)
    protected String id;
    @XmlElement(name = "IDType")
    protected int idType;
    protected int status;
    @XmlElement(required = true, nillable = true)
    protected String streamingNo;

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
     * 获取status属性的值。
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     */
    public void setStatus(int value) {
        this.status = value;
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

    public String toJson(){
        StringBuffer json = new StringBuffer();
        json.append("{");
        json.append("streamingNo:\"").append(streamingNo).append("\",");
        json.append("id:\"").append(id).append("\",");
        json.append("idType:\"").append(idType).append("\",");
        json.append("status:\"").append(status).append("\"");
        json.append("}");
        return json.toString();
    }
}
