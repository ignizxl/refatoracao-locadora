package com.mycompany.locadora;

/**
 *
 * @author igor
 */
public class FitaInfantil extends Fita {

    public FitaInfantil(String título) {
        super(título);
    }

    @Override
    public double calcularValor(int diasAlugada) {
        double valor = 1.5;
        if (diasAlugada > 3) {
            valor += (diasAlugada - 3) * 1.5;
        }
        return valor;
    }
}