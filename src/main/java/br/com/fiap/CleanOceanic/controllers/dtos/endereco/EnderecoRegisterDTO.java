package br.com.fiap.CleanOceanic.controllers.dtos.endereco;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public record EnderecoRegisterDTO(

        @NotNull
        Long idEndereco,
        @NotBlank
        String cep,
        @NotBlank
        String numero,
        @NotBlank
        String sigla,
        @NotBlank
        String bairro,
        @NotBlank
        String cidade

) {
}
