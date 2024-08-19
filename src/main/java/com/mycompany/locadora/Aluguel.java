package com.mycompany.locadora;

/**
 *
 * @author igor
 */
public class Aluguel {
    private Fita fita;
    private int diasAlugada;

    public Aluguel(Fita fita, int diasAlugada) {
        this.fita = fita;
        this.diasAlugada = diasAlugada;
    }

    public Fita getFita() {
        return fita;
    }

    public int getDiasAlugada() {
        return diasAlugada;
    }

    public double calcularValor() {
        return fita.calcularValor(diasAlugada);
    }

    public int calcularPontosDeAlugadorFrequente() {
        return fita.calcularPontosDeAlugadorFrequente(diasAlugada);
    }
}