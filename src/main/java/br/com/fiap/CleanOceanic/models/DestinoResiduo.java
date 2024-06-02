package br.com.fiap.CleanOceanic.models;

import br.com.fiap.CleanOceanic.controllers.dtos.destinoResiduo.DestinoResiduoRegisterDTO;
import br.com.fiap.CleanOceanic.controllers.dtos.destinoResiduo.DestinoResiduoUpdateDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "T_DESTINO_RESIDUO")
public class DestinoResiduo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_destino_residuo")
    private Long idDestinoResiduo;

    @Column(name = "ds_nome_local")
    private String nomeLocal;

    @Column(name = "ds_tipo_destino")
    private String tipoDestino;

    @Column(name = "vl_quantidade_enviado")
    private double quantidadeEnviado;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_residuo_coletado")
    private ResiduoColetado residuoColetado;

    @Column(name = "dt_created_at")
    private LocalDateTime createdAt;

    public DestinoResiduo(DestinoResiduoRegisterDTO destinoResiduoRegisterDTO) {
        this.nomeLocal = destinoResiduoRegisterDTO.nomeLocal();
        this.tipoDestino = destinoResiduoRegisterDTO.tipoDestino();
        this.quantidadeEnviado = destinoResiduoRegisterDTO.quantidadeEnviado();
        this.createdAt = LocalDateTime.now();
    }

    public void updateInformation(DestinoResiduoUpdateDTO destinoResiduoUpdateDTO) {
        if (destinoResiduoUpdateDTO.nomeLocal() != null){
            this.nomeLocal = destinoResiduoUpdateDTO.nomeLocal();
        }

        if (destinoResiduoUpdateDTO.tipoDestino() != null) {
            this.tipoDestino = destinoResiduoUpdateDTO.tipoDestino();
        }

        if (destinoResiduoUpdateDTO.quantidadeEnviado() != 0) {
            this.quantidadeEnviado = destinoResiduoUpdateDTO.quantidadeEnviado();
        }



    }
}
