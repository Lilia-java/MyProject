package SpringDB.Repository;


import SpringDB.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

   /* List<Product> findByName(String name);

    @Query(value = "SELECT * FROM  Products b WHERE b.name = :name", nativeQuery = true)
    List<Product> retrieveByName(@Param("name") String name);*/

    /*List<Product> findByPrice(int price);

    @Query(value = "select b.name,b.price from Products b where b.price>:price order by b.name,b.price desc", nativeQuery = true)
    List<Product> findByPrice(@Param("price") int price);*/

    /*List<Product> getAllProducts;
    @Query(value = "select distinct name, price from Products", nativeQuery = true)
    List<Product> getAllProducts;*/

   /* @Query(value = "select p.name,p.quantity,p.price from Products p,clients c,orders o where o.Client_id=c.id and o.product_id=p.id and p.quentity>:quentity order by p.price", nativeQuery = true)
    List<Product> findByQuentity(@Param("quentity") int quentity);

    @Query(value = "select distinct p.name, p.price from Products p", nativeQuery = true)
    List<Product> findAllProducts();*/
}

