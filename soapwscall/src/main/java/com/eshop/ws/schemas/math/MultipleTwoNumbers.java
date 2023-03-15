//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2023.03.09 於 08:21:25 AM CST 
//


package com.eshop.ws.schemas.math;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>multipleTwoNumbers complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="multipleTwoNumbers"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arg0" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="arg1" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "multipleTwoNumbers", propOrder = {
    "arg0",
    "arg1"
})
@XmlRootElement
public class MultipleTwoNumbers {

    protected float arg0;
    protected float arg1;

    /**
     * 取得 arg0 特性的值.
     * 
     */
    public float getArg0() {
        return arg0;
    }

    /**
     * 設定 arg0 特性的值.
     * 
     */
    public void setArg0(float value) {
        this.arg0 = value;
    }

    /**
     * 取得 arg1 特性的值.
     * 
     */
    public float getArg1() {
        return arg1;
    }

    /**
     * 設定 arg1 特性的值.
     * 
     */
    public void setArg1(float value) {
        this.arg1 = value;
    }

}
