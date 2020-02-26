package Service;

import Model.Product;
import Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository ProductRepository;


    public List<Product> findAll(){
        return ProductRepository.findAll();
    }

    public Product findById(int id){
        Optional<Product> optional = ProductRepository.findById(id);
        return optional.orElse(new Product());
    }

    public List<Product> findByName(String name){
        return ProductRepository.findByName(name);
    }

    public void save(Product Product){
        ProductRepository.save(Product);
    }

    public List<Product> retrieveByName(String name){
        return ProductRepository.retrieveByName(name);
    }

    public List<Product> findByPrice(int price){
        //price = 20000;
        return ProductRepository.findByPrice(price);
    }

    public List<Product> findByQuentity(int quentity){
        //quentity = 10;
        return ProductRepository.findByQuentity(quentity);
    }

    public List<Product> findAllProducts(){
        return ProductRepository.findAllProducts();
    }

}


