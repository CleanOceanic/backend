package br.com.fiap.CleanOceanic.models;

import br.com.fiap.CleanOceanic.controllers.dtos.usuario.UsuarioRegisterDTO;
import br.com.fiap.CleanOceanic.controllers.dtos.usuario.UsuarioUpdateDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "T_USUARIO")
public class Usuario {

    @Id
    @Column(name = "id_usuario")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idUsuario;

    @Column(name = "ds_nome", nullable = false)
    private String nome;

    @Column(name = "dt_data_nascimento")
    private String dataNascimento;

    @Column(name = "ds_genero")
    private String genero;

    @Column(name = "ds_email")
    private String email;

    @Column(name = "ds_name")
    private String senha;

    @Column(name = "ds_telefone")
    private String telefone;

    @Column(name = "dt_created_at")
    private LocalDateTime createdAt;

    public Usuario(UsuarioRegisterDTO usuarioRegisterDTO) {
        this.nome = usuarioRegisterDTO.nome();
        this.dataNascimento = usuarioRegisterDTO.dataNascimento();
        this.genero = usuarioRegisterDTO.genero();
        this.email = usuarioRegisterDTO.email();
        this.senha = usuarioRegisterDTO.senha();
        this.telefone = usuarioRegisterDTO.telefone();
        this.createdAt = LocalDateTime.now();
    }

    public void updateInformation(UsuarioUpdateDTO usuarioUpdateDTO) {
        if (usuarioUpdateDTO.nome() != null) {
            this.nome = usuarioUpdateDTO.nome();
        }

        if (usuarioUpdateDTO.dataNascimento() != null) {
            this.dataNascimento = usuarioUpdateDTO.dataNascimento();
        }

        if (usuarioUpdateDTO.genero() != null) {
            this.genero = usuarioUpdateDTO.genero();
        }

        if (usuarioUpdateDTO.email() != null) {
            this.email = usuarioUpdateDTO.email();
        }

        if (usuarioUpdateDTO.senha() != null) {
            this.senha = usuarioUpdateDTO.senha();
        }

        if (usuarioUpdateDTO.telefone() != null) {
            this.telefone = usuarioUpdateDTO.telefone();
        }
    }

}
