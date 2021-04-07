package br.com.microservico.hrwork.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.microservico.hrwork.entity.Worker;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
