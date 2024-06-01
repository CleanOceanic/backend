package br.com.fiap.CleanOceanic.models;

import br.com.fiap.CleanOceanic.controllers.dtos.usuarioEndereco.UsuarioEnderecoRegisterDTO;
import br.com.fiap.CleanOceanic.controllers.dtos.usuarioEndereco.UsuarioEnderecoUpdateDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "T_USUARIO_ENDERECO")
public class UsuarioEndereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario_endereco")
    private Long idUsuarioEndereco;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_endereco")
    private Endereco endereco;

    @Column(name = "dt_created_at")
    private LocalDateTime createdAt;

    public UsuarioEndereco(UsuarioEnderecoRegisterDTO usuarioEnderecoRegisterDTO) {
        this.createdAt = LocalDateTime.now();
    }

}
