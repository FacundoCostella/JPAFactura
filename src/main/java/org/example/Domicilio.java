package org.example;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "domicilio")
public class Domicilio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre_calle")
    private String nombre_calle;

    @Column(name = "numero")
    private int numero;

    @OneToOne(mappedBy = "domicilio")
    private Cliente cliente;


    public Domicilio() {
    }

    public Domicilio(int numero, String nombre_calle) {
        this.numero = numero;
        this.nombre_calle = nombre_calle;
    }

    public Domicilio(Cliente cliente, int numero, String nombre_calle) {
        this.cliente = cliente;
        this.numero = numero;
        this.nombre_calle = nombre_calle;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre_calle() {
        return nombre_calle;
    }

    public void setNombre_calle(String nombre_calle) {
        this.nombre_calle = nombre_calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
