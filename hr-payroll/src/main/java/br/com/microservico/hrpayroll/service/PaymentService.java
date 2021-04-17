package br.com.microservico.hrpayroll.service;

import org.springframework.stereotype.Service;

import br.com.microservico.hrpayroll.entity.Payment;

@Service
public class PaymentService {

	public Payment getPayment(long workerId,int days) {
		return new Payment("Bob", 200.0,days);
		
	}
}
