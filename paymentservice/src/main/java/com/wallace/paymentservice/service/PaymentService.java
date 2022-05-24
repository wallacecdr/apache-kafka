package com.wallace.paymentservice.service;

import com.wallace.paymentservice.model.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);
}
