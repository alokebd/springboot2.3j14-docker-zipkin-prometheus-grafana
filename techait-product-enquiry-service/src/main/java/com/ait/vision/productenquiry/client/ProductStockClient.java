package com.ait.vision.productenquiry.client;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ait.vision.productenquiry.beans.ProductEnquiryBean;

//@FeignClient(name="techait-product-stock-service", url="localhost:8800")
@FeignClient(name="techait-product-stock-service")

public interface ProductStockClient {

   @GetMapping("/product-stock/productName/{productName}/productAvailability/{productAvailability}")
    public ProductEnquiryBean checkProductStock(@PathVariable String productName,
                                              @PathVariable String productAvailability);

}
