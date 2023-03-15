package com.eshop.sales.web;

import com.eshop.ws.client.MathClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ws.client.WebServiceIOException;

import java.util.Map;

@Controller
public class SoapCallController {

    @Autowired
    MathClient mathClient;

    @RequestMapping("/mathrequest")
    public String mathrequest() {
        return "soapwsclient/mathclient";
    }

    @RequestMapping("/mathresponse")
    public String mathresponse(@RequestParam(value = "numOne") String strOne,
                               @RequestParam(value = "numTwo") String strTwo, Model model) {
        float numOne = 0, numTwo = 0;
        try {
            numOne = Float.valueOf(strOne);
            numTwo = Float.valueOf(strTwo);

            float plus = mathClient.plusTwoNumbers(numOne, numTwo);
            model.addAttribute("plus", plus);
            float minus = mathClient.minusTwoNumbers(numOne, numTwo);
            model.addAttribute("minus", minus);
            float multiple = mathClient.multipleTwoNumbers(numOne, numTwo);
            model.addAttribute("multiple", multiple);
            float divide = mathClient.divideTwoNumbers(numOne, numTwo);
            model.addAttribute("divide", divide);

            model.addAttribute("numOne", strOne);
            model.addAttribute("numTwo", strTwo);
        } catch (NumberFormatException ne) {
            model.addAttribute("errorMessage", "NumberFormatException") ;
        } catch (WebServiceIOException we) {
            model.addAttribute("errorMessage", "WebServiceIOException") ;
        }

        return "soapwsclient/mathclient";
    }
}
