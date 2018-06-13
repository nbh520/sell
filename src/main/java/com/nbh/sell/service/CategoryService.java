package com.nbh.sell.service;

import com.nbh.sell.dataobject.ProductCategory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Nibohan
 * @date 2018-06-07  22:03
 */
public interface CategoryService {
    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryType(List<Integer> categoryTypeList);

    /*
     * 新增
     */
    ProductCategory save(ProductCategory productCategory);

}
