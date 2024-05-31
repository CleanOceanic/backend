package br.com.fiap.CleanOceanic.controllers.dtos.usuario;

import jakarta.validation.constraints.NotBlank;

public record UsuarioUpdateDTO(

        String nome,

        String dataNascimento,

        String genero,

        String email,

        String senha,

        String telefone

) {
}
