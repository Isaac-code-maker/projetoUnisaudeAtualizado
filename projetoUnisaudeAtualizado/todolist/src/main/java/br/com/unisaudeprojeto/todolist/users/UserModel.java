package br.com.unisaudeprojeto.todolist.users;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "tb_users")
public class UserModel {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    @Column(unique = true)
    private String nome;
    private Integer idade;
    private String email;
    private String telefone;
    private String genero;
    private String rg;
    private String cpf;
    private String profissão;
    private String cidade;
    private String endereço;
    private String estado_civil;
    private String observações;
    
    @CreationTimestamp
    private LocalDateTime createdAT;
}
