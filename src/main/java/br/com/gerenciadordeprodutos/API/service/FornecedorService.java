package br.com.gerenciadordeprodutos.API.service;

import br.com.gerenciadordeprodutos.API.dtos.CriarFornecedorRequest;
import br.com.gerenciadordeprodutos.API.dtos.FornecedorCriadoResponse;
import br.com.gerenciadordeprodutos.API.repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public interface FornecedorService{

    FornecedorCriadoResponse  criarFornecedor (CriarFornecedorRequest criarFornecedorRequest);
}
