//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2023.03.09 於 08:21:25 AM CST 
//


package com.eshop.ws.schemas.math;

import javax.xml.bind.annotation.*;


/**
 * <p>plusTwoNumbersResponse complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="plusTwoNumbersResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plusTwoNumbersResponse", propOrder = {
    "_return"
})
@XmlRootElement
public class PlusTwoNumbersResponse {

    @XmlElement(name = "return")
    protected float _return;

    /**
     * 取得 return 特性的值.
     * 
     */
    public float getReturn() {
        return _return;
    }

    /**
     * 設定 return 特性的值.
     * 
     */
    public void setReturn(float value) {
        this._return = value;
    }

}
