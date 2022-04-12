package controller;
import model.*;
import org.springframework.web.bind.annotation.DeleteMapping;
import service.ProductsService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {
	

@GetMapping("/product")
private List<Products>getAllProducts()
{
	return ProductsService.getProductsById();
}

@DeleteMapping("/product/{id}")
private void deleteProduct(@PathVariable("id")int id)
{
	productsService.delete(id);
}


}
