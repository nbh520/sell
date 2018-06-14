package com.nbh.sell.dto;

import com.nbh.sell.dataobject.OrderDetail;
import com.nbh.sell.enums.OrderStatusEnum;
import com.nbh.sell.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author Nibohan
 * @date 2018-06-14  18:58
 */

@Data
public class OrderDTO {
    private String orderId;
    /** 买家名字 */
    private String buyerName;
    /** 买家手机号 */
    private String buyerPhone;
    /** 买家地址 */
    private String buyerAddress;
    /** 买家微信Openid */
    private String buyerOpenid;
    /** 订单总金额 */
    private BigDecimal orderAmount;
    /** 订单状态 */
    List<OrderDetail> orderDetailList;

}
