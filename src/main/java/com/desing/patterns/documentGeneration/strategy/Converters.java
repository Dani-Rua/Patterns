package com.desing.patterns.documentGeneration.strategy;


import java.util.List;

public class Converters {

    public static final ConvertFile CONVERT_XLSX = tipo -> {
        String message = "Archivo de tipo XLSX convertido a PDF.";
        showDocumentStructure("Archivo XLSX", List.of("Titulo", "Columna", "Tabla", "Estilo"));
        return message;
    };



    public static final ConvertFile CONVERT_DOCX = tipo ->{
        String message = "Archivo de tipo DOCX convertido a PDF.";
        showDocumentStructure("Archivo DOCX", List.of("Nombre", "Edad", "Pais"));
        return message;
    };


    public static final ConvertFile CONVERT_XML = tipo -> {
     String message = "Archivo de tipo XML convertido a PDF.";
        showDocumentStructure("Archivo XML", List.of("Etiqueta", "Valor", "Atributo"));
     return message;
    };

    private static void showDocumentStructure(String title, List<String> columns){
        System.out.println("\n Generando documento: " + title);
        System.out.println("Titulo: " + title);
        System.out.println("Columnas:");
        columns.stream()
                        .map(column -> "    - " + columns)
                                .forEach(System.out::println);
        System.out.println("Estilo: Fuente Arial, Tamao 12, Negrita en Titulos\n");
    }
}
