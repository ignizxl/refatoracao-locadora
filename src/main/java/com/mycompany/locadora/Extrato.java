package com.mycompany.locadora;

/**
 *
 * @author igor
 */
public class Extrato {
    private Cliente cliente;

    public Extrato(Cliente cliente) {
        this.cliente = cliente;
    }

    public String gerarExtrato() {
        final String fimDeLinha = System.getProperty("line.separator");
        double valorTotal = 0.0;
        int pontosDeAlugadorFrequente = 0;
        StringBuilder resultado = new StringBuilder("Registro de Alugueis de " + cliente.getNome() + fimDeLinha);

        for (Aluguel aluguel : cliente.getFitasAlugadas()) {
            double valorCorrente = aluguel.calcularValor();
            pontosDeAlugadorFrequente += aluguel.calcularPontosDeAlugadorFrequente();
            resultado.append("\t").append(aluguel.getFita().getTítulo()).append("\t").append(valorCorrente).append(fimDeLinha);
            valorTotal += valorCorrente;
        }

        resultado.append("Valor total devido: ").append(valorTotal).append(fimDeLinha);
        resultado.append("Você acumulou ").append(pontosDeAlugadorFrequente).append(" pontos de alugador frequente");

        return resultado.toString();
    }
}