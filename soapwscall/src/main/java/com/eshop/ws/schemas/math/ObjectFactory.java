//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2023.03.09 於 08:21:25 AM CST 
//


package com.eshop.ws.schemas.math;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.eshop.ws.schemas.math package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ScriptException_QNAME = new QName("http://ws.mona.com/", "ScriptException");
    private final static QName _DivideTwoNumbers_QNAME = new QName("http://ws.mona.com/", "divideTwoNumbers");
    private final static QName _DivideTwoNumbersResponse_QNAME = new QName("http://ws.mona.com/", "divideTwoNumbersResponse");
    private final static QName _FormulaResult_QNAME = new QName("http://ws.mona.com/", "formulaResult");
    private final static QName _FormulaResultResponse_QNAME = new QName("http://ws.mona.com/", "formulaResultResponse");
    private final static QName _MinusTwoNumbers_QNAME = new QName("http://ws.mona.com/", "minusTwoNumbers");
    private final static QName _MinusTwoNumbersResponse_QNAME = new QName("http://ws.mona.com/", "minusTwoNumbersResponse");
    private final static QName _MultipleTwoNumbers_QNAME = new QName("http://ws.mona.com/", "multipleTwoNumbers");
    private final static QName _MultipleTwoNumbersResponse_QNAME = new QName("http://ws.mona.com/", "multipleTwoNumbersResponse");
    private final static QName _PlusTwoNumbers_QNAME = new QName("http://ws.mona.com/", "plusTwoNumbers");
    private final static QName _PlusTwoNumbersResponse_QNAME = new QName("http://ws.mona.com/", "plusTwoNumbersResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.eshop.ws.schemas.math
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ScriptException }
     * 
     */
    public ScriptException createScriptException() {
        return new ScriptException();
    }

    /**
     * Create an instance of {@link DivideTwoNumbers }
     * 
     */
    public DivideTwoNumbers createDivideTwoNumbers() {
        return new DivideTwoNumbers();
    }

    /**
     * Create an instance of {@link DivideTwoNumbersResponse }
     * 
     */
    public DivideTwoNumbersResponse createDivideTwoNumbersResponse() {
        return new DivideTwoNumbersResponse();
    }

    /**
     * Create an instance of {@link FormulaResult }
     * 
     */
    public FormulaResult createFormulaResult() {
        return new FormulaResult();
    }

    /**
     * Create an instance of {@link FormulaResultResponse }
     * 
     */
    public FormulaResultResponse createFormulaResultResponse() {
        return new FormulaResultResponse();
    }

    /**
     * Create an instance of {@link MinusTwoNumbers }
     * 
     */
    public MinusTwoNumbers createMinusTwoNumbers() {
        return new MinusTwoNumbers();
    }

    /**
     * Create an instance of {@link MinusTwoNumbersResponse }
     * 
     */
    public MinusTwoNumbersResponse createMinusTwoNumbersResponse() {
        return new MinusTwoNumbersResponse();
    }

    /**
     * Create an instance of {@link MultipleTwoNumbers }
     * 
     */
    public MultipleTwoNumbers createMultipleTwoNumbers() {
        return new MultipleTwoNumbers();
    }

    /**
     * Create an instance of {@link MultipleTwoNumbersResponse }
     * 
     */
    public MultipleTwoNumbersResponse createMultipleTwoNumbersResponse() {
        return new MultipleTwoNumbersResponse();
    }

    /**
     * Create an instance of {@link PlusTwoNumbers }
     * 
     */
    public PlusTwoNumbers createPlusTwoNumbers() {
        return new PlusTwoNumbers();
    }

    /**
     * Create an instance of {@link PlusTwoNumbersResponse }
     * 
     */
    public PlusTwoNumbersResponse createPlusTwoNumbersResponse() {
        return new PlusTwoNumbersResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScriptException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mona.com/", name = "ScriptException")
    public JAXBElement<ScriptException> createScriptException(ScriptException value) {
        return new JAXBElement<ScriptException>(_ScriptException_QNAME, ScriptException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivideTwoNumbers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mona.com/", name = "divideTwoNumbers")
    public JAXBElement<DivideTwoNumbers> createDivideTwoNumbers(DivideTwoNumbers value) {
        return new JAXBElement<DivideTwoNumbers>(_DivideTwoNumbers_QNAME, DivideTwoNumbers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivideTwoNumbersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mona.com/", name = "divideTwoNumbersResponse")
    public JAXBElement<DivideTwoNumbersResponse> createDivideTwoNumbersResponse(DivideTwoNumbersResponse value) {
        return new JAXBElement<DivideTwoNumbersResponse>(_DivideTwoNumbersResponse_QNAME, DivideTwoNumbersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FormulaResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mona.com/", name = "formulaResult")
    public JAXBElement<FormulaResult> createFormulaResult(FormulaResult value) {
        return new JAXBElement<FormulaResult>(_FormulaResult_QNAME, FormulaResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FormulaResultResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mona.com/", name = "formulaResultResponse")
    public JAXBElement<FormulaResultResponse> createFormulaResultResponse(FormulaResultResponse value) {
        return new JAXBElement<FormulaResultResponse>(_FormulaResultResponse_QNAME, FormulaResultResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MinusTwoNumbers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mona.com/", name = "minusTwoNumbers")
    public JAXBElement<MinusTwoNumbers> createMinusTwoNumbers(MinusTwoNumbers value) {
        return new JAXBElement<MinusTwoNumbers>(_MinusTwoNumbers_QNAME, MinusTwoNumbers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MinusTwoNumbersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mona.com/", name = "minusTwoNumbersResponse")
    public JAXBElement<MinusTwoNumbersResponse> createMinusTwoNumbersResponse(MinusTwoNumbersResponse value) {
        return new JAXBElement<MinusTwoNumbersResponse>(_MinusTwoNumbersResponse_QNAME, MinusTwoNumbersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultipleTwoNumbers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mona.com/", name = "multipleTwoNumbers")
    public JAXBElement<MultipleTwoNumbers> createMultipleTwoNumbers(MultipleTwoNumbers value) {
        return new JAXBElement<MultipleTwoNumbers>(_MultipleTwoNumbers_QNAME, MultipleTwoNumbers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultipleTwoNumbersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mona.com/", name = "multipleTwoNumbersResponse")
    public JAXBElement<MultipleTwoNumbersResponse> createMultipleTwoNumbersResponse(MultipleTwoNumbersResponse value) {
        return new JAXBElement<MultipleTwoNumbersResponse>(_MultipleTwoNumbersResponse_QNAME, MultipleTwoNumbersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlusTwoNumbers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mona.com/", name = "plusTwoNumbers")
    public JAXBElement<PlusTwoNumbers> createPlusTwoNumbers(PlusTwoNumbers value) {
        return new JAXBElement<PlusTwoNumbers>(_PlusTwoNumbers_QNAME, PlusTwoNumbers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlusTwoNumbersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mona.com/", name = "plusTwoNumbersResponse")
    public JAXBElement<PlusTwoNumbersResponse> createPlusTwoNumbersResponse(PlusTwoNumbersResponse value) {
        return new JAXBElement<PlusTwoNumbersResponse>(_PlusTwoNumbersResponse_QNAME, PlusTwoNumbersResponse.class, null, value);
    }

}
