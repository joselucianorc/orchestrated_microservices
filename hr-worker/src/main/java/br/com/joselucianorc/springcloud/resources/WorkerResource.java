package br.com.joselucianorc.springcloud.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.joselucianorc.springcloud.entities.Worker;
import br.com.joselucianorc.springcloud.repositories.WorkerRepository;

@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {
	
	@Autowired
	private WorkerRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Worker>> findAll() {
		List<Worker> list = repository.findAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Worker> findAll(@PathVariable Long id) {
		Worker worker = repository.findById(id).get();
		return ResponseEntity.ok(worker);
	}

}
