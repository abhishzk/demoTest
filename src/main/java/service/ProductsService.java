package service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Product;
import repository.ProductsRepository;

@Service

public class ProductsService {
	
@Autowired 
ProductsRepository productsRepository;

public List<Product>getAllProducts()
{
	List<Product>Products = new ArrayList<Product>();
	productsRepository.findAll().forEach(products1)
	return Products;
}

}
