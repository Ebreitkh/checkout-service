package com.digitalhouse.checkout_service.service;

import com.digitalhouse.checkout_service.model.Checkout;
import com.digitalhouse.checkout_service.model.dto.Product;
import com.digitalhouse.checkout_service.repository.ICheckoutService;
import com.digitalhouse.checkout_service.repository.IProductService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CheckoutService implements ICheckoutService {
    private IProductService productService;

    public CheckoutService(IProductService productService) {
        this.productService = productService;
    }
    @Override
    public Checkout buildCheckout(List<String> productosIds) {
        Double total = 0.0;
        for (String id: productosIds){
            Product product = productService.getAllProducts(id);
            System.out.println("Respuesta desde"+ product.getInstance());
            total += product.getPrice();
        }

        Checkout checkout = new Checkout("234","www.digitalhouse.com/checkout?code=234", total.toString(), List.of("Credicard"));
        return checkout;
    }
}
