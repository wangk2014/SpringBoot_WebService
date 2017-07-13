
package cn.wk.webservice.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="errorDescriptiion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "errorCode",
    "errorDescriptiion"
})
@XmlRootElement(name = "WSResultDTO", namespace = "http://www.wk.cn/webservice")
public class WSResultDTO {

    @XmlElement(namespace = "http://www.wk.cn/webservice")
    protected int errorCode;
    @XmlElement(namespace = "http://www.wk.cn/webservice", required = true)
    protected String errorDescriptiion;

    /**
     * 获取errorCode属性的值。
     * 
     */
    public int getErrorCode() {
        return errorCode;
    }

    /**
     * 设置errorCode属性的值。
     * 
     */
    public void setErrorCode(int value) {
        this.errorCode = value;
    }

    /**
     * 获取errorDescriptiion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorDescriptiion() {
        return errorDescriptiion;
    }

    /**
     * 设置errorDescriptiion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorDescriptiion(String value) {
        this.errorDescriptiion = value;
    }

}
