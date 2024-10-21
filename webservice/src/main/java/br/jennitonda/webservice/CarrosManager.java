package br.jennitonda.webservice;

import java.util.*;

public class CarrosManager {
    private List <Carro> carros;

public CarrosManager(){
    this.carros = new ArrayList<>();
    this.carros.add(new Carro("X6", "BMW"));
    this.carros.add(new Carro("Uno", "FIAT"));
}

    public List <Carro> getCarros(){
        return this.carros;
    }
}