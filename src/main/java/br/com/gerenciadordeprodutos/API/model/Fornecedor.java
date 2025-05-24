package br.com.gerenciadordeprodutos.API.model;
import br.com.gerenciadordeprodutos.API.enums.TipoFornecedorEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "fornecedor")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Fornecedor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome" , nullable = false, length = 100)
    private String nome;

    @Column(name = "cnpj",  nullable = false,unique = true, length = 14)
    private String cnpj;

    @Column(name = "email", length = 100)
    private String emaill;

    @Column(name = "tipo_fornecedor", nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoFornecedorEnum tipoFornecedorEnump;

    @Column(name = "criado_em", nullable = false)
    private LocalDateTime criadoEm;
}
