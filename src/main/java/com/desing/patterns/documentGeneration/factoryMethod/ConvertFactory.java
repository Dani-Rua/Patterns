package com.desing.patterns.documentGeneration.factoryMethod;

import com.desing.patterns.documentGeneration.strategy.ConvertFile;
import com.desing.patterns.documentGeneration.strategy.Converters;

import java.util.Map;
import java.util.Optional;

public class ConvertFactory {

    private static final Map<String, ConvertFile> CONVERTS = Map.of(
            "xlsx", Converters.CONVERT_XLSX,
            "docx", Converters.CONVERT_DOCX,
            "xml", Converters.CONVERT_XML
    );

    public static ConvertFile addConvert(String tipo){
        return Optional.ofNullable(CONVERTS.get(tipo.toLowerCase()))
                .orElseThrow(() -> new IllegalArgumentException("Formato no soportado: " + tipo));
    }
}
