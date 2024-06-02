package springcloudms.customerservice.model;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@DiscriminatorValue(value = "CUSTOMER")
public class Customer extends BaseCustomerEntity {

    public Customer() {
        super();
    }

}
