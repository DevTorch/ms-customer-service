package springcloudms.customerservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springcloudms.customerservice.model.BaseCustomerEntity;

@Repository
public interface CustomerDTORepository extends JpaRepository<BaseCustomerEntity, Long> {
    
}
