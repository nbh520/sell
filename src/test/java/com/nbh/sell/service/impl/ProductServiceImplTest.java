package com.nbh.sell.service.impl;

import com.nbh.sell.dataobject.ProductInfo;
import com.nbh.sell.enums.ProductStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    private ProductServiceImpl PS;
    @Test
    public void findOne(){
        ProductInfo productInfo = PS.findOne("123456");
        Assert.assertEquals("123456",productInfo.getProductId());
    }

    @Test
    public void findUpAll() throws Exception{
        List<ProductInfo> productInfos = PS.findUpAll();
        Assert.assertNotEquals(0,productInfos.size());
    }

    @Test
    public void findAll() throws Exception{
        PageRequest request = new PageRequest(0,2);
        Page<ProductInfo> productInfoPage = PS.findAll(request);
        System.out.println(productInfoPage.getTotalElements());

    }

    @Test
    public void save() throws Exception{
        ProductInfo productinfo = new ProductInfo();
        productinfo.setProductId("123457");
        productinfo.setProductName("皮皮虾");
        productinfo.setProductPrice(new BigDecimal(3.2));
        productinfo.setProductStock(100);
        productinfo.setProductDescription("很好吃的虾");
        productinfo.setProductIcon("http://xxx.jpg");
        productinfo.setProductStatus(ProductStatusEnum.DOWN.getCode());
        productinfo.setCategoryType(2);
        ProductInfo productInfo =  PS.save(productinfo);
        Assert.assertNotNull(productInfo);
    }
}