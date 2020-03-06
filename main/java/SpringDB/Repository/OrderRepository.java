package SpringDB.Repository;

import SpringDB.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Integer> {

    List<Order> findByDateOrd(String dateOrd);

    @Query(value = "SELECT * FROM  orders o WHERE o.date_ord = :dateOrd", nativeQuery = true)
    List<Order> retrieveByDateOrd(@Param("dateOrd") String dateOrd);

   /* @Query(value = "select c.name,o.date_order from clients c,products p,orders o where o.client_id=c.id and o.product_id=p.id and o.summ>=:sum" , nativeQuery = true)
    List<Order> findBySum(@Param("sum") int sum);

    @Query(value = "select distinct to_char(o.date_order,'mm.yyyy') from orders o", nativeQuery = true)
    List<Order> findAllDates();*/




}
