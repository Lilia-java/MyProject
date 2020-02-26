package Repository;

import Model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Integer> {

    List<Client> findByName(String name);

    @Query(value = "SELECT * FROM  Clients c WHERE c.name = :name", nativeQuery = true)
    List<Client> retrieveByName(@Param("name") String name);

    @Query(value = "select distinct c.name, c.date_birth from Clients c where district= :district", nativeQuery = true)
    List<Client> findByDistrict(@Param("district") String district);



}