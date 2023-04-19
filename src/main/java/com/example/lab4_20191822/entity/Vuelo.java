package com.example.lab4_20191822.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "vuelo", schema = "lab4", catalog = "")
public class VueloEntity {
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
    @Basic
    @Column(name = "descripcion")
    private String descripcion;
    @Basic
    @Column(name = "aerolinea_idaerolinea")
    private int aerolineaIdaerolinea;

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

    public int getAerolineaIdaerolinea() {
        return aerolineaIdaerolinea;
    }

    public void setAerolineaIdaerolinea(int aerolineaIdaerolinea) {
        this.aerolineaIdaerolinea = aerolineaIdaerolinea;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VueloEntity that = (VueloEntity) o;
        return idvuelo == that.idvuelo && duracion == that.duracion && precio == that.precio && asientosDisponibles == that.asientosDisponibles && aerolineaIdaerolinea == that.aerolineaIdaerolinea && Objects.equals(origen, that.origen) && Objects.equals(destino, that.destino) && Objects.equals(fechaSalida, that.fechaSalida) && Objects.equals(fechaLlegada, that.fechaLlegada) && Objects.equals(descripcion, that.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idvuelo, origen, destino, fechaSalida, fechaLlegada, duracion, precio, asientosDisponibles, descripcion, aerolineaIdaerolinea);
    }
}
