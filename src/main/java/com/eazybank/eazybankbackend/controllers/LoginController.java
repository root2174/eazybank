package com.eazybank.eazybankbackend.controllers;

import com.eazybank.eazybankbackend.model.Customer;
import com.eazybank.eazybankbackend.repository.CustomerRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Transactional
public class LoginController {

   private final CustomerRepository customerRepository;

   @PostMapping("/register")
   public ResponseEntity<ResponseStatus> registerUser(@RequestBody Customer customer) {
      Customer savedCustomer = customerRepository.save(customer);

      return ResponseEntity.status(HttpStatus.CREATED).build();
   }
}
