package com.wallace.paymentservice.impl;

import com.wallace.paymentservice.model.Payment;
import com.wallace.paymentservice.resource.PaymentResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentResourceImpl implements PaymentResource {

    @Override
    public ResponseEntity<Payment> payment(Payment payment) {
        return null;
    }
}
