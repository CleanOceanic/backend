package br.com.fiap.CleanOceanic.controllers.dtos.endereco;

import br.com.fiap.CleanOceanic.models.Endereco;
import br.com.fiap.CleanOceanic.models.Usuario;

public record EnderecoDetailedDTO(

        Long id,
        String cep,

        String numero,

        String sigla,

        String bairro,

        String cidade

) {

    public EnderecoDetailedDTO(Endereco endereco) {
        this(
                endereco.getIdEndereco(), endereco.getCep(), endereco.getNumero(), endereco.getSigla(),
                endereco.getBairro(), endereco.getCidade()
        );
    }

}
