package com.bootcamp.springbootroman;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static java.util.Collections.nCopies;
import static java.lang.String.join;

@RestController
@RequestMapping("/convert")
public class RomanConverterNumberController {

    @GetMapping
    public String getMessage() {
        return "E achou que nao chegaria ate aqui ne? Meu parabens, voce e merecedora!";
    }

    private String convertToRomanNumber(int decimal) {
        final int[] DECIMAIS = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        final String[] ROMANOS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < DECIMAIS.length; i++) {
            int parteInteira = decimal / DECIMAIS[i];
            decimal -= DECIMAIS[i] * parteInteira;
            resultado.append(join("", nCopies(parteInteira, ROMANOS[i])));
        }
        return resultado.toString();
    }
// https://iteracao.info/java-conversao-de-decimais-em-romanos/

    @GetMapping("/{number}")
    public String setConvert(@PathVariable int number) {
        String conversion = convertToRomanNumber(number);
        return conversion;
    }
}
