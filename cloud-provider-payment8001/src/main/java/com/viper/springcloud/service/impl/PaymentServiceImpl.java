package com.viper.springcloud.service.impl;

import com.viper.springcloud.dao.PaymentDao;
import com.viper.springcloud.entities.Payment;
import com.viper.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }

    @Override
    public List<Payment> findAll() {
        return paymentDao.findAll();
    }

    @Override
    public int delete(Long id) {
        return paymentDao.delete(id);
    }

    @Override
    public int updatePaymentById(Payment payment) {
        return paymentDao.updatePaymentById(payment);
    }
}
