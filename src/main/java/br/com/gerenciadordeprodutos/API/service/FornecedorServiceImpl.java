package br.com.gerenciadordeprodutos.API.service;

import br.com.gerenciadordeprodutos.API.dtos.CriarFornecedorRequest;
import br.com.gerenciadordeprodutos.API.dtos.FornecedorCriadoResponse;
import br.com.gerenciadordeprodutos.API.repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class FornecedorServiceImpl implements FornecedorService{

    @Autowired
    FornecedorRepository fornecedorRepository;
    @Override
    public FornecedorCriadoResponse criarFornecedor(CriarFornecedorRequest criarFornecedorRequest) {
        return null;
    }
}
