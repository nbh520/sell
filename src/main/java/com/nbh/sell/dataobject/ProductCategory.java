package com.nbh.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;


/**
 * 类目
 * @author Nibohan
 * @date 2018-06-04  21:06
 * Product_Category
 */
@Entity
@DynamicUpdate
@Data
public class ProductCategory {
    /*类目ID*/

    @Id
    @GeneratedValue
    private Integer categoryId;
    /** 类目名字 */
    private  String categoryName;
    /** 类目编号 */
    private Integer categoryType;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
