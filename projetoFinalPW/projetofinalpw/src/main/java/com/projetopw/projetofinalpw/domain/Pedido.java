package com.projetopw.projetofinalpw.domain;

import java.util.List;

import com.projetopw.projetofinalpw.domain.generics.AbstractEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Pedido extends AbstractEntity {

    @ManyToMany
    List<Figure> figures;
    @ManyToOne
    Usuario usuario;
    Float valorTotal;
}
