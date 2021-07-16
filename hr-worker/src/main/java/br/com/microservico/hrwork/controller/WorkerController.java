package br.com.microservico.hrwork.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.microservico.hrwork.entity.Worker;
import br.com.microservico.hrwork.repository.WorkerRepository;

@RestController
@RequestMapping("/workers")
public class WorkerController {
	
	private static Logger logger = LoggerFactory.getLogger(WorkerController.class);
	
	@Autowired
	private WorkerRepository workerRepository;
	
	@Autowired
	private Environment env;
	
	@GetMapping
	public List<Worker>buscarTodos(){
		List<Worker>workerList = workerRepository.findAll();
		return workerList;
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Worker>findbyId(@PathVariable Long id){
       
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        
		logger.info("PORT = " + env.getProperty("local.server.port"));
		
		Worker obj = workerRepository.findById(id).get();
		return ResponseEntity.ok(obj);
	}
	
	

}
