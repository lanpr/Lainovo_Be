package com.alpha.lainovo.repository;

import com.alpha.lainovo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    Customer findByEmail(String email);

    Customer findByRefreshToken(String token);

    Customer findByCustomerResetPasswordCode(String customerResetPasswordCode);
}
