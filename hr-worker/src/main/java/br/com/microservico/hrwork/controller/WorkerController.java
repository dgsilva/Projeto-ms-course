package br.com.microservico.hrwork.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@Autowired
	private WorkerRepository workerRepository;
	
	@GetMapping
	public List<Worker>buscarTodos(){
		List<Worker>workerList = workerRepository.findAll();
		return workerList;
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Worker>findbyId(@PathVariable Long id){
		Worker obj = workerRepository.findById(id).get();
		return ResponseEntity.ok(obj);
	}

}
