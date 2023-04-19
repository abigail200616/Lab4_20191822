package com.example.lab4_20191822.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Getter
@Setter
@Table(name = "vuelo", schema = "lab4", catalog = "")
public class Vuelo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idvuelo")
    private int idvuelo;
    @Basic
    @Column(name = "origen")
    private String origen;
    @Basic
    @Column(name = "destino")
    private String destino;
    @Basic
    @Column(name = "fecha_salida")
    private Timestamp fechaSalida;
    @Basic
    @Column(name = "fecha_llegada")
    private Timestamp fechaLlegada;
    @Basic
    @Column(name = "duracion")
    private int duracion;
    @Basic
    @Column(name = "precio")
    private int precio;
    @Basic
    @Column(name = "asientos_disponibles")
    private int asientosDisponibles;

    public Aerolinea getAerolineaId() {
        return aerolineaId;
    }

    public void setAerolineaId(Aerolinea aerolineaId) {
        this.aerolineaId = aerolineaId;
    }

    @Basic
    @Column(name = "descripcion")
    private String descripcion;
    @ManyToOne
    @JoinColumn(name = "aerolinea_idaerolinea")
    private Aerolinea aerolineaId;

    public int getIdvuelo() {
        return idvuelo;
    }

    public void setIdvuelo(int idvuelo) {
        this.idvuelo = idvuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Timestamp getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Timestamp fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Timestamp getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Timestamp fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getAsientosDisponibles() {
        return asientosDisponibles;
    }

    public void setAsientosDisponibles(int asientosDisponibles) {
        this.asientosDisponibles = asientosDisponibles;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }



}
