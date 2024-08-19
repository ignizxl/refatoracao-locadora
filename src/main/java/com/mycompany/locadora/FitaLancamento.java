package com.mycompany.locadora;

/**
 *
 * @author igor
 */
public class FitaLancamento extends Fita {

    public FitaLancamento(String título) {
        super(título);
    }

    @Override
    public double calcularValor(int diasAlugada) {
        return diasAlugada * 3;
    }
    
    @Override
    public int calcularPontosDeAlugadorFrequente(int diasAlugada) {
        return diasAlugada > 1 ? 2 : 1; // 2 pontos se for aluguel de mais de 1 dia
    }
}
