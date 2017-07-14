
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
 *         &lt;element name="suspectID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="matchedSuspectID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="operName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "suspectID",
    "matchedSuspectID",
    "operName",
    "password"
})
@XmlRootElement(name = "createMatchedInfoRequest", namespace = "http://www.wk.cn/webservice")
public class CreateMatchedInfoRequest {

    @XmlElement(namespace = "http://www.wk.cn/webservice", required = true)
    protected String suspectID;
    @XmlElement(namespace = "http://www.wk.cn/webservice", required = true)
    protected String matchedSuspectID;
    @XmlElement(namespace = "http://www.wk.cn/webservice", required = true)
    protected String operName;
    @XmlElement(namespace = "http://www.wk.cn/webservice", required = true)
    protected String password;

    /**
     * 获取suspectID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuspectID() {
        return suspectID;
    }

    /**
     * 设置suspectID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuspectID(String value) {
        this.suspectID = value;
    }

    /**
     * 获取matchedSuspectID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchedSuspectID() {
        return matchedSuspectID;
    }

    /**
     * 设置matchedSuspectID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchedSuspectID(String value) {
        this.matchedSuspectID = value;
    }

    /**
     * 获取operName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperName() {
        return operName;
    }

    /**
     * 设置operName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperName(String value) {
        this.operName = value;
    }

    /**
     * 获取password属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置password属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

}
