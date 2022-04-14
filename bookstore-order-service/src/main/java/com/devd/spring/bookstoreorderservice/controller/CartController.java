package com.devd.spring.bookstoreorderservice.controller;

import com.devd.spring.bookstoreorderservice.web.CreateCartResponse;
import com.devd.spring.bookstoreorderservice.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin
public class CartController {

    @Autowired
    private CartService cartService;

    @PostMapping("/cart")
    @PreAuthorize("hasAuthority('STANDARD_USER') or hasAuthority('ADMIN_USER')" )
    public ResponseEntity<CreateCartResponse> createCart() {

        String cartId = cartService.createCart();

        return ResponseEntity.status(HttpStatus.CREATED).body(null);
    }
    
    @GetMapping("/cart")
    public ResponseEntity<?> getCart(){
    
        return ResponseEntity.ok(cartService.getCart());
        
    }

}
