package ShopProject.Repository;

import ShopProject.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Integer> {

    List<Order> findByName(String name);

    @Query(value = "SELECT * FROM  orders o WHERE .name = :name", nativeQuery = true)
    List<Order> retrieveByName(@Param("name") String name);

    @Query(value = "select c.name,o.date_order from clients c,products p,orders o where o.client_id=c.id and o.product_id=p.id and o.summ>=:sum" , nativeQuery = true)
    List<Order> findBySum(@Param("sum") int sum);

    @Query(value = "select distinct to_char(o.date_order,'mm.yyyy') from orders o", nativeQuery = true)
    List<Order> findAllDates();

    @Query(value = "select c.name,s.name from clients c,shops s,orders o where o.client_id=c.id and o.seller=s.id", nativeQuery = true)
    List<Order> findAllclient_idAndSeller();

    @Query(value = "select o.date_purchase,c.name,c.discount,b.name,o.quentity from clients c,books b,orders o where o.client_id=c.id and o.seller=b.id", nativeQuery = true)
    List<Order> findAllSellingBook();

}
