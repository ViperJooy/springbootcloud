package com.viper.springcloud.controller;

import com.viper.springcloud.entities.CommonResult;
import com.viper.springcloud.entities.Payment;
import com.viper.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("*****插入结果" + result);
        return new CommonResult(200, "success", result);
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment result = paymentService.getPaymentById(id);
        return new CommonResult(200, "success", result);
    }

    @GetMapping(value = "/payment/getAll")
    public CommonResult getPaymentById() {
        List<Payment> paymentList = paymentService.findAll();
        return new CommonResult(200, "success", paymentList);
    }

    @DeleteMapping(value = "/payment/del")
    public CommonResult delete(@RequestParam(value = "id") Long id) {
        int result = paymentService.delete(id);
        return new CommonResult(200, "success", result);
    }

    @PutMapping(value = "/payment/update")
    public CommonResult put(@RequestBody Payment payment) {
        int result = paymentService.updatePaymentById(payment);
        return new CommonResult(200, "success", result);
    }

}
