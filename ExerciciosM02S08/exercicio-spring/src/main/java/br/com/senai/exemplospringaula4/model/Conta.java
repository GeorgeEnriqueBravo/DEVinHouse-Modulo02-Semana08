package br.com.senai.exemplospringaula4.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

@Data
@AllArgsConstructor // Gera um construtor completo automáticamente
@NoArgsConstructor // Gera um construtor vázio
public class Conta {

    private Integer id_cliente;
    @CPF
    private String cpf;
    @NotNull // validação que o campo é obrigatório (não pode ser vázio), que funciona junto com o @Validate para Números
    private Double saldo = 0.0;

}
