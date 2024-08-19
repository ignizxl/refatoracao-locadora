package com.mycompany.locadora;

/**
 *
 * @author igor
 */
public abstract class Fita {

    private String título;

    public Fita(String título) {
        this.título = título;
    }

    public String getTítulo() {
        return título;
    }
    
    public abstract double calcularValor(int diasAlugada);

    public int calcularPontosDeAlugadorFrequente(int diasAlugada) {
        return 1; // Padrão é 1 ponto para qualquer fita
    }
}