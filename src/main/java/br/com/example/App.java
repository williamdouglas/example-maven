package br.com.example;

import br.com.example.servicos.ResultadoCEP;

public class App {
    public static void main(String[] args) {
        String resultado = ResultadoCEP.obtemCEP();
            System.out.print(resultado);
    }
}