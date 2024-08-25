package com.projetopw.projetofinalpw.domain;

import java.util.List;

import com.projetopw.projetofinalpw.domain.generics.AbstractEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Usuario extends AbstractEntity {

    String nome;
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "endereco_id")
    Endereco endereco;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    List<Pedido> pedidos;

    public void setEndereco(Endereco entityEndereco) {

    }
}
