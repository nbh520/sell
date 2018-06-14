package com.nbh.sell.dataobject;

import com.nbh.sell.enums.OrderStatusEnum;
import com.nbh.sell.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author Nibohan
 * @date 2018-06-13  18:08
 */
@Entity
@Data
@DynamicUpdate
public class OrderMaster {

    /** 订单Id */
    @Id
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
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();
    /** 支付状态 , 默认为0 未支付*/
    private Integer payStatus = PayStatusEnum.WAIT.getCode();
    /** 创建时间 */
//    private Date createTime;
    /** 更新时间 */
//    private Date updataTime;


}
