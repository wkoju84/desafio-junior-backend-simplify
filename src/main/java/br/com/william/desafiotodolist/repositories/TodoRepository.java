package br.com.william.desafiotodolist.repositories;

import br.com.william.desafiotodolist.entities.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
