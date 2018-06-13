package com.nbh.sell.service;

import com.nbh.sell.dataobject.ProductInfo;
import com.nbh.sell.respository.ProductInfoRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {
    @Autowired
    ProductInfoRepository productInfoRepository;

    @Test
    public void saveTest(){
        ProductInfo productinfo = new ProductInfo();
        productinfo.setProductId("123456");
        productinfo.setProductName("皮蛋瘦肉粥");
        productinfo.setProductPrice(new BigDecimal(3.2));
        productinfo.setProductStock(100);
        productinfo.setProductDescription("很好喝");
        productinfo.setProductIcon("http://xxx.jpg");
        productinfo.setProductStatus(0);
        productinfo.setCategoryType(2);
        ProductInfo result = productInfoRepository.save(productinfo);
        Assert.assertNotNull(result);
    }
    @Test
    public void findByProductStatus() throws Exception{
        List<ProductInfo> productInfoList = productInfoRepository.findByProductStatus(0);
        Assert.assertNotEquals(0,productInfoList.size());
    }
}