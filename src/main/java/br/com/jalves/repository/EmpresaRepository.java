package br.com.jalves.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jalves.model.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
	
	Empresa findByCnpj(String cnpj);
	
}
