package com.digitalhouse.checkout_service.repository;

import com.digitalhouse.checkout_service.model.dto.Product;

public interface IProductService {

    Product getAllProducts (String id);

}
