package com.digitalhouse.checkout_service.controller.controller;

import com.digitalhouse.checkout_service.model.Checkout;
import com.digitalhouse.checkout_service.repository.ICheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/checkout")
public class CheckoutController {

    private ICheckoutService checkoutService;


    @Autowired
    public CheckoutController(ICheckoutService checkoutService) {
        super();
        this.checkoutService = checkoutService;
    }

    @GetMapping()
    public Checkout getCheckout (@RequestParam List<String> productIds){

        return checkoutService.buildCheckout(productIds);

    }
}
