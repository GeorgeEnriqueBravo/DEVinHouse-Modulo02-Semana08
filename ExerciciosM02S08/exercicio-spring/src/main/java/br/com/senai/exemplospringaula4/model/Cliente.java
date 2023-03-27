package br.com.senai.exemplospringaula4.model;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

@Data
@AllArgsConstructor // Gera um construtor completo automáticamente
@NoArgsConstructor // Gera um construtor vázio
public class Cliente {
    @CPF // validação que verifica se o CPF é válido que funciona junto com o @Validate
    private String cpf;
    @NotBlank // validação que o campo é obrigatório (não pode ser vázio), que funciona junto com o @Validate para Strings
    private String nome;
    private Long idade;
}
