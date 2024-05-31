package br.com.fiap.CleanOceanic.controllers.dtos.endereco;

public record EnderecoUpdateDTO(

        String cep,

        String numero,

        String sigla,

        String bairro,

        String cidade


) {
}
