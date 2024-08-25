package com.projetopw.projetofinalpw.dto;

import com.projetopw.projetofinalpw.controller.FigureController;
import com.projetopw.projetofinalpw.controller.PedidoController;
import com.projetopw.projetofinalpw.controller.UsuarioController;
import com.projetopw.projetofinalpw.domain.Figure;
import com.projetopw.projetofinalpw.domain.Pedido;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FigureResponseDTO extends RepresentationModel<FigureResponseDTO> {
    String informacao;
    String ano;
    Float valor;
    Float tamanho;
    public void addLinks(Figure u){
        this.add(linkTo(FigureController.class).slash(u.getId()).withSelfRel());
    }
}
