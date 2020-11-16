package com.viper.springcloud.service;

import com.viper.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PaymentService {
    int create(Payment payment);

    List<Payment> findAll();

    Payment getPaymentById(@Param("id") Long id);

    int delete(@Param("id") Long id);

    int updatePaymentById(Payment payment);
}
