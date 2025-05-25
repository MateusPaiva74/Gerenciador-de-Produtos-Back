package br.com.gerenciadordeprodutos.API.repository;

import br.com.gerenciadordeprodutos.API.model.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {
}
