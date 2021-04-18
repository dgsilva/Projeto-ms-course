package br.com.microservico.hrpayroll.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.microservico.hrpayroll.entity.Payment;
import br.com.microservico.hrpayroll.entity.Worker;
import br.com.microservico.hrpayroll.feignclient.WorkerFeignClient;

@Service
public class PaymentService {

	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	public Payment getPayment(long workerId,int days) {
		
		Worker worker = workerFeignClient.findbyId(workerId).getBody();		
		return new Payment(worker.getName(), worker.getDailyIncome(),days);
		
	}
}
