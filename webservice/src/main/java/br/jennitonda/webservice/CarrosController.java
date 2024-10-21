package br.jennitonda.webservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
@RequestMapping("/carros")
public class CarrosController {

    private List<Carro> carros = new ArrayList<>();

    public CarrosController() {
        carros.add(new Carro("X6", "BMW"));
        carros.add(new Carro("Uno", "FIAT"));
    }

@GetMapping
    public List<Carro> listCarros(){
        return carros;
    }
}