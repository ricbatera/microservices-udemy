package br.com.conultdg.cambio_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.conultdg.cambio_service.domain.model.Cambio;

public interface CambioRepository extends JpaRepository<Cambio, Long>{
	Cambio findByFromAndTo(String from, String to);
}
