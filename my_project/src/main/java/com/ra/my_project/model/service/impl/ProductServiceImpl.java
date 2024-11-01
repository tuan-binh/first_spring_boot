package com.ra.my_project.model.service.impl;

import com.ra.my_project.model.entity.Product;
import com.ra.my_project.model.repository.IProductRepository;
import com.ra.my_project.model.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService
{
    @Autowired
    private IProductRepository productRepository;

    @Override
    public List<Product> getAllProducts()
    {
        return productRepository.findAll();
    }
}
