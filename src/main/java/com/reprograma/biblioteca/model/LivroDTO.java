package com.reprograma.biblioteca.model;

import lombok.Data;

//todo: conversar sobre anotação Data e quais seus benefícios
//todo: conversar sobre a classe LivroDTO e suas propriedades
@Data
public class LivroDTO {

    private Long id;

    private String name;

    private boolean isReservado;
}
