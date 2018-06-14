package com.nbh.sell.respository;

import com.nbh.sell.dataobject.OrderDetail;
import com.nbh.sell.dataobject.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Nibohan
 * @date 2018-06-13  23:08
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail,String> {
    List<OrderDetail> findByOrderId(String orderId);
}
