package br.com.treinaweb.twgerenciadortarefas.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.treinaweb.twgerenciadortarefas.modelos.Tarefa;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Long> {

	
}
