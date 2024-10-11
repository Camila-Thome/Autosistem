package br.edu.unisep.autosistem.model;

import java.util.ArrayList;

public class Frota {
    private ArrayList<Veiculo> veiculos;

    public Frota() {
        veiculos = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void exibirFrota() {
        for (Veiculo veiculo : veiculos) {
            System.out.println(veiculo.exibirDetalhes());
        }
    }
}