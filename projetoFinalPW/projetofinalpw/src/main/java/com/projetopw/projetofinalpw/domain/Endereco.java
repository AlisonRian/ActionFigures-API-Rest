package com.projetopw.projetofinalpw.domain;

import com.projetopw.projetofinalpw.domain.generics.AbstractEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Endereco extends AbstractEntity {
    String cep;
    int numero;
    String rua;
    String bairro;
    String cidade;
    String estado;
}
