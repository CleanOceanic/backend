package br.com.fiap.CleanOceanic.models;

import br.com.fiap.CleanOceanic.controllers.dtos.pontoColetaEndereco.PontoColetaEnderecoRegisterDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "T_PONTO_COLETA_ENDERECO")
public class PontoColetaEndereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ponto_coleta_endereco")
    private Long idPontoColetaEndereco;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_ponto_coleta")
    private PontoColeta pontoColeta;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_endereco")
    private Endereco endereco;

    @Column(name = "dt_created_at")
    private LocalDateTime createdAt;

    public PontoColetaEndereco(PontoColetaEnderecoRegisterDTO pontoColetaEnderecoRegisterDTO) {
        this.createdAt = LocalDateTime.now();
    }

}
