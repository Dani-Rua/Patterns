package com.desing.patterns.documentGeneration;


import com.desing.patterns.documentGeneration.factoryMethod.ConvertFactory;
import com.desing.patterns.documentGeneration.strategy.ConvertFile;

import java.util.Scanner;

public class DocumentGenerationMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tipo de archivo (xlsx, docx, xml): ");
        String tipo = scanner.nextLine();

        ConvertFile convert = ConvertFactory.addConvert(tipo);
        String result = convert.apply(tipo);

        System.out.println(result);
    }
}
