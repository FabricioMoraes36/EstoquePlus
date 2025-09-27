package com.group.EstoquePlus.auth.entity;


import jakarta.persistence.Entity;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Comprador {
    private String nome, senha;
    private CPF cpf;
    private Email email;
}
