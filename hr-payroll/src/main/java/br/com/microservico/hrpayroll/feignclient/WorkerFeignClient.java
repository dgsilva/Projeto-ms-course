package br.com.microservico.hrpayroll.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.microservico.hrpayroll.entity.Worker;

@Component
@FeignClient(name="hr-worker", url="http://localhost:8002/", path = "/workers")
public interface WorkerFeignClient {

	@GetMapping(value = "/{id}")
	ResponseEntity<Worker>findbyId(@PathVariable Long id);
}
