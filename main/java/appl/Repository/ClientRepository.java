
package appl.Repository;



import appl.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Integer> {

    List<Client> findByName(String name);

    @Query(value = "SELECT * FROM  Clients c WHERE c.name = :name", nativeQuery = true)
    List<Client> retrieveByName(@Param("name") String name);

    @Query(value = "select distinct c.name, c.dateBirth, c.gender from Clients c", nativeQuery = true)
    List<Client> findAllClients();


}