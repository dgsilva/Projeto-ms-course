package br.com.microservico.hrwork.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import br.com.microservico.hrwork.entity.Worker;
import br.com.microservico.hrwork.repository.WorkerRepository;

@RestController
@RequestMapping("/workers")
public class WorkerController {
	
	@Autowired
	private WorkerRepository workerRepository;
	
	@GetMapping
	public List<Worker>buscarTodos(){
		List<Worker>workerList = workerRepository.findAll();
		return workerList;
	}

}
