package com.example.lab4_20191822.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Getter
@Setter
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

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public Vuelo getVueloId() {
        return vueloId;
    }

    public void setVueloId(Vuelo vueloId) {
        this.vueloId = vueloId;
    }

    @Basic
    @Column(name = "estado_pago")
    private String estadoPago;
    @ManyToOne
    @JoinColumn(name = "user_iduser")
    private User userId;
    @ManyToOne
    @JoinColumn(name = "vuelo_idvuelo")
    private Vuelo vueloId;

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


}
