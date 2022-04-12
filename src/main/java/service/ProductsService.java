package service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Products;
import repository.ProductsRepository;

@Service

public class ProductsService {

    @Autowired
    ProductsRepository productsRepository;

    public List<Products> getAllProducts() {
        List<Products> Products = new ArrayList<Products>();
        productsRepository.findAll().forEach(products1);
        return Products;
    }

    public Products getProductsById()
    {
        return productsRepository.findById().get();
    }
    public void saveOrUpdate(Products products)
    {
        productsRepository.save(products);
    }
    public void delete(int id)
    {
        productsRepository.deleteById(id);
    }
    public void update(Products products, int id)
    {
     productsRepository.save(products);
    }

}
