/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
        double valorCorrente = 0.0;
        switch(fita.getCódigoDePreço()) {
            case Fita.NORMAL:
                valorCorrente += 2;
                if(diasAlugada > 2) {
                    valorCorrente += (diasAlugada - 2) * 1.5;
                }
                break;
            case Fita.LANÇAMENTO:
                valorCorrente += diasAlugada * 3;
                break;
            case Fita.INFANTIL:
                valorCorrente += 1.5;
                if(diasAlugada > 3) {
                    valorCorrente += (diasAlugada - 3) * 1.5;
                }
                break;
        }
        return valorCorrente;
    }

    public int calcularPontosDeAlugadorFrequente() {
        int pontos = 1;
        if(fita.getCódigoDePreço() == Fita.LANÇAMENTO && diasAlugada > 1) {
            pontos++;
        }
        return pontos;
    }
}


