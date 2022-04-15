package controller;
import model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.ProductsService;
import java.util.List;

@RestController
public class ProductsController {
@Autowired
ProductsService productsService;

@GetMapping("/product")
private List<Products>getAllProducts()
{
	return ProductsService.getAllProducts();
}
@GetMapping("/product/{id}")
private Products getProducts(@PathVariable("id")int id)
{
	return productsService.getProductsById();
}

@DeleteMapping("/product/{id}")
private void deleteProduct(@PathVariable("id")int id)
{
	productsService.delete(id);
}

@PostMapping("/products")
	private int saveProduct(@RequestBody Products products)
{
	productsService.saveOrUpdate(products);
	return products.getId();
}

@PutMapping("/products")
	private Products update(@RequestBody Products products)
{
	productsService.saveOrUpdate(products);
	return products;
}

}
