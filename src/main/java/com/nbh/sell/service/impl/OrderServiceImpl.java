package com.nbh.sell.service.impl;

import com.nbh.sell.dataobject.OrderDetail;
import com.nbh.sell.dataobject.ProductInfo;
import com.nbh.sell.dto.OrderDTO;
import com.nbh.sell.service.OrderService;
import com.nbh.sell.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @author Nibohan
 * @date 2018-06-14  19:05
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private ProductService productService;

    @Override
    public OrderDTO create(OrderDTO orderDTO) {
        //1.查询商品（数量，价格）
        for(OrderDetail orderDetail : orderDTO.getOrderDetailList()){
            ProductInfo productInfo = productService.findOne(orderDetail.getProductId());
        }
        //2.计算总价

        //3.写入订单数据库

        //4.扣库存
        return null;
    }

    @Override
    public OrderDTO findOne(String orderId) {

        return null;
    }

    @Override
    public Page<OrderDTO> findList(String buyerOpenid, Pageable pageable) {
        return null;
    }

    @Override
    public OrderDTO cancel(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO finish(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO paid(OrderDTO orderDTO) {
        return null;
    }
}
