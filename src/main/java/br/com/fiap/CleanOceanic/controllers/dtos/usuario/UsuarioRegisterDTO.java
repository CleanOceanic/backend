package br.com.fiap.CleanOceanic.controllers.dtos.usuario;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record UsuarioRegisterDTO(
        @NotNull
        Long id,

        @NotBlank
        String nome,

        @NotBlank
        String dataNascimento,

        @NotBlank
        String genero,

        @NotBlank
        String email,

        @NotBlank
        String senha,

        @NotBlank
        String telefone
) {
}
