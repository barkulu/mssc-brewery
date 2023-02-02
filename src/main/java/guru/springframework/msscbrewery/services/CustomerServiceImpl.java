package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder().id(customerId).name("Simon").build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        customerDto.setId(UUID.randomUUID());
        return customerDto;
    }

    @Override
    public void updateCustomer(UUID cusotmerId, CustomerDto customerDto) {
        log.debug("Update Customer " + cusotmerId);
    }

    @Override
    public void deleteCustomer(UUID cusotmerId) {
        log.debug("Delete Customer " + cusotmerId);
    }
}
