package com.digitalhouse.checkout_service.service;

import com.digitalhouse.checkout_service.model.dto.Product;
import com.digitalhouse.checkout_service.repository.IProductService;
import com.digitalhouse.checkout_service.repositoyFeign.FeigProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductService implements IProductService {

    private FeigProductRepository feigProductRepository;
    @Autowired
    public ProductService(FeigProductRepository feigProductRepository) {
        this.feigProductRepository = feigProductRepository;
    }

    @Override
    public Product getAllProducts(String id) {
        return feigProductRepository.getProductById(id);
    }
}
