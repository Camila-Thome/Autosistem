package br.edu.unisep.autosistem.view;

import br.edu.unisep.autosistem.model.Frota;
import br.edu.unisep.autosistem.model.Carro;
import br.edu.unisep.autosistem.model.Moto;
import br.edu.unisep.autosistem.model.Caminhao;

public class Principal {
    public static void main(String[] args) {

        Frota frota = new Frota();


        frota.adicionarVeiculo(new Carro("Mclaren", "Senna", 2024, 2));
        frota.adicionarVeiculo(new Moto("BMW", "S1000RR", 2024, 1000));
        frota.adicionarVeiculo(new Caminhao("Volkswagen", "Constelation", 2018, "Granel"));


        frota.exibirFrota();
    }
}