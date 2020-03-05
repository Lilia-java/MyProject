package ShopProject.Repository;

import ShopProject.Model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Integer> {

    List<Client> findByName(String name);

    @Query(value = "SELECT * FROM  Clients c WHERE c.name = :name", nativeQuery = true)
    List<Client> retrieveByName(@Param("name") String name);


}