package com.mycompany.locadora;

/**
 *
 * @author igor
 */
public class FitaNormal extends Fita {
    
    public FitaNormal(String título) {
        super(título);
    }

    @Override
    public double calcularValor(int diasAlugada) {
        double valor = 2;
        if (diasAlugada > 2) {
            valor += (diasAlugada - 2) * 1.5;
        }
        return valor;
    }
}