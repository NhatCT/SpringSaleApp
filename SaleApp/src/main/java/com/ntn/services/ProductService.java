/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ntn.services;

import com.ntn.pojo.Product;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Thanh Nhat
 */
public interface ProductService {
        List<Product> getProducts(Map<String,String> params);
         void addOrUpdateProduct(Product p);
         Product geProductById(int id);
         void deleteProduct(int id);
}
