package SpringDB.Service;

import SpringDB.Model.Order;
import SpringDB.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;


    public List<Order> findByDateOrd(String dateOrd){
        return orderRepository.findByDateOrd(dateOrd);
    }

   /* public void save(Order order){
        orderRepository.save(order);
    }*/

    public List<Order> retrieveByDateOrd(String dateOrd){
        return orderRepository.retrieveByDateOrd(dateOrd);
    }

  /*  public List<Order> findBySum(int sum){
        //sum=60000;
        return orderRepository.findBySum(sum);
    }*/

    /*public List<Order> findByDateOrd(String date){
        //date="01.03.2019";
        return orderRepository.findByDateOrd(date);
    }*/

   /* public List<Order> findAllDates(){
        return orderRepository.findAllDates();
    }
*/
   /* public List<Order> findAllCustomerAndSeller(){
        return orderRepository.findAllCustomerAndSeller();
    }
*/


}


