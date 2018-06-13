package com.nbh.sell.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nbh.sell.dataobject.ProductInfo;
import lombok.Data;

import java.util.List;

/**
 * @author Nibohan
 * @date 2018-06-11  16:22
 */
@Data
public class ProductVO {

    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;
}
