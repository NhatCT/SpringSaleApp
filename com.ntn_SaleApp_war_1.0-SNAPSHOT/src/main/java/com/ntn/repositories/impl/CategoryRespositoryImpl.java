/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ntn.repositories.impl;

import com.ntn.repositories.CategoryRepository;
import com.ntn.pojo.Category;
import jakarta.persistence.Query;
import java.util.List;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author admin
 */
@Repository
@Transactional
public class CategoryRespositoryImpl implements CategoryRepository {

    @Autowired
    private LocalSessionFactoryBean factory;
    
    public List<Category> getCates() {
 
            Session s=this.factory.getObject().getCurrentSession();
            Query q = s.createQuery("FROM Category", Category.class); // ten lop khong phai ten bang
            return q.getResultList();
        }
    }
