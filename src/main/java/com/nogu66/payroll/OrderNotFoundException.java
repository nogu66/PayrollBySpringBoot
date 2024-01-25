package com.nogu66.payroll;

public class OrderNotFoundException extends RuntimeException {
    
    OrderNotFoundException(Long id) {
        super("Could not find order " + id);
    }
}
