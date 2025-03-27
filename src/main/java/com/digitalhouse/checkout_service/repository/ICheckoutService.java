package com.digitalhouse.checkout_service.repository;

import com.digitalhouse.checkout_service.model.Checkout;

import java.util.List;


public interface ICheckoutService  {

    Checkout buildCheckout(List<String> productosIds);
}
