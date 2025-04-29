package com.digitalhouse.checkout_service.repositoyFeign;



import com.digitalhouse.checkout_service.configuration.LoadBalancerConfiguration;
import com.digitalhouse.checkout_service.model.dto.Product;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "products-service")
//@LoadBalancerClient(value = "products-service", configuration = LoadBalancerConfiguration.class)

public interface FeigProductRepository {

    @RequestMapping(method = RequestMethod.GET, value = "/products")
    Product getProductById(@RequestParam String id);
}
