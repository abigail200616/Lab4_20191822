package com.example.lab4_20191822.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Reserva {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idreserva")
    private int idreserva;
    @Basic
    @Column(name = "fecha_reserva")
    private Timestamp fechaReserva;
    @Basic
    @Column(name = "precio_total")
    private int precioTotal;
    @Basic
    @Column(name = "estado_pago")
    private String estadoPago;
    @Basic
    @Column(name = "user_iduser")
    private int userIduser;
    @Basic
    @Column(name = "vuelo_idvuelo")
    private int vueloIdvuelo;

    public int getIdreserva() {
        return idreserva;
    }

    public void setIdreserva(int idreserva) {
        this.idreserva = idreserva;
    }

    public Timestamp getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Timestamp fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }

    public String getEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(String estadoPago) {
        this.estadoPago = estadoPago;
    }

    public int getUserIduser() {
        return userIduser;
    }

    public void setUserIduser(int userIduser) {
        this.userIduser = userIduser;
    }

    public int getVueloIdvuelo() {
        return vueloIdvuelo;
    }

    public void setVueloIdvuelo(int vueloIdvuelo) {
        this.vueloIdvuelo = vueloIdvuelo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reserva reserva = (Reserva) o;
        return idreserva == reserva.idreserva && precioTotal == reserva.precioTotal && userIduser == reserva.userIduser && vueloIdvuelo == reserva.vueloIdvuelo && Objects.equals(fechaReserva, reserva.fechaReserva) && Objects.equals(estadoPago, reserva.estadoPago);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idreserva, fechaReserva, precioTotal, estadoPago, userIduser, vueloIdvuelo);
    }
}
