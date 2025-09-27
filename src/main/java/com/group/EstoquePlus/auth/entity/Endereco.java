package com.group.EstoquePlus.auth.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
    private String estado, cidade, cep, rua, numero, bairro;

    @ManyToMany
    @JoinColumn(name = "cnpj",referencedColumnName = "cnpj")
    private Vendedor vendedor;

    @ManyToMany
    @JoinColumn(name = "cpf", referencedColumnName = "cpf")
    private Comprador comprador;
}
