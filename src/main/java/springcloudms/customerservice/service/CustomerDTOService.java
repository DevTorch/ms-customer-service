package springcloudms.customerservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import springcloudms.customerservice.repository.CustomerDTORepository;

@Service
@RequiredArgsConstructor
public class CustomerDTOService {

    private final CustomerDTORepository customerRepository;

}
