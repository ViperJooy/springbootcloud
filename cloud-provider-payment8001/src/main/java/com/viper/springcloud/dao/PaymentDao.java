package com.viper.springcloud.dao;

import com.viper.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PaymentDao {
     int create(Payment payment);

     List<Payment> findAll();

     Payment getPaymentById(@Param("id") Long id);

     int delete(@Param("id") Long id);

     int updatePaymentById(Payment payment);
}
