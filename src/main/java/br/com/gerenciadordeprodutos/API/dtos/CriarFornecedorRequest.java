package br.com.gerenciadordeprodutos.API.dtos;

import br.com.gerenciadordeprodutos.API.enums.TipoFornecedorEnum;

public record CriarFornecedorRequest(
        String nome,
        String cnpj,
        String email,
        TipoFornecedorEnum tipoFornecedorEnum
) {
}
