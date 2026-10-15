package br.com.joselucianorc.springcloud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.joselucianorc.springcloud.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
