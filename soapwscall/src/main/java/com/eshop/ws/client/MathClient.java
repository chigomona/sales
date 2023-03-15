package com.eshop.ws.client;

import javax.xml.bind.JAXBElement;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.eshop.ws.schemas.math.DivideTwoNumbers;
import com.eshop.ws.schemas.math.DivideTwoNumbersResponse;
import com.eshop.ws.schemas.math.MinusTwoNumbers;
import com.eshop.ws.schemas.math.MinusTwoNumbersResponse;
import com.eshop.ws.schemas.math.MultipleTwoNumbers;
import com.eshop.ws.schemas.math.MultipleTwoNumbersResponse;
import com.eshop.ws.schemas.math.ObjectFactory;
import com.eshop.ws.schemas.math.PlusTwoNumbers;
import com.eshop.ws.schemas.math.PlusTwoNumbersResponse;

public class MathClient extends WebServiceGatewaySupport {
	
	private ObjectFactory factory = new ObjectFactory();
	

	public float plusTwoNumbers(float first, float second) {
		PlusTwoNumbers plusRequest = factory.createPlusTwoNumbers();
		plusRequest.setArg0(first);
		plusRequest.setArg1(second);
		JAXBElement<PlusTwoNumbersResponse> plusResponse = (JAXBElement<PlusTwoNumbersResponse>)callPlusTwoNumbers(plusRequest);
		return plusResponse.getValue().getReturn() ;
	}
	
	public float minusTwoNumbers(float first, float second) {
		MinusTwoNumbers minusRequest = factory.createMinusTwoNumbers();
		minusRequest.setArg0(first);
		minusRequest.setArg1(second);
		JAXBElement<MinusTwoNumbersResponse> minusResponse = (JAXBElement<MinusTwoNumbersResponse>)callMinusTwoNumbers(minusRequest);
		return minusResponse.getValue().getReturn() ;
	}
	
	public float multipleTwoNumbers(float first, float second) {
		MultipleTwoNumbers multipleRequest = factory.createMultipleTwoNumbers() ;
		multipleRequest.setArg0(first);
		multipleRequest.setArg1(second);
		JAXBElement<MultipleTwoNumbersResponse> multipleResponse = (JAXBElement<MultipleTwoNumbersResponse>)callMultipleTwoNumbers(multipleRequest);
		return multipleResponse.getValue().getReturn() ;
	}
	
	public float divideTwoNumbers(float first, float second) {
		DivideTwoNumbers divideRequest = factory.createDivideTwoNumbers();
		divideRequest.setArg0(first);
		divideRequest.setArg1(second);
		JAXBElement<DivideTwoNumbersResponse> divideResponse = (JAXBElement<DivideTwoNumbersResponse>)callDivideTwoNumbers(divideRequest);
		return divideResponse.getValue().getReturn() ;
	}

	public Object callPlusTwoNumbers(PlusTwoNumbers request) {
		return getWebServiceTemplate().marshalSendAndReceive(request,
				new SoapActionCallback("http://ws.mona.com/SimpleCalculator/plusTwoNumbersRequest"));
	}

	public Object callMinusTwoNumbers(MinusTwoNumbers request) {
		return getWebServiceTemplate().marshalSendAndReceive(request,
				new SoapActionCallback("http://ws.mona.com/SimpleCalculator/minusTwoNumbersRequest"));
	}
	public Object callMultipleTwoNumbers(MultipleTwoNumbers request) {
		return getWebServiceTemplate().marshalSendAndReceive(request,
				new SoapActionCallback("http://ws.mona.com/SimpleCalculator/multipleTwoNumbersRequest"));
	}
	public Object callDivideTwoNumbers(DivideTwoNumbers request) {
		return getWebServiceTemplate().marshalSendAndReceive(request,
				new SoapActionCallback("http://ws.mona.com/SimpleCalculator/divideTwoNumbersRequest"));
	}

	
}