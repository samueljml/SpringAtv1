package br.com.gabriel.fatec_ipi_paoo_lista_veiculos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gabriel.fatec_ipi_paoo_lista_veiculos.model.beans.Veiculo;

public interface VeiculosRepository extends JpaRepository<Veiculo, Long>{

}
