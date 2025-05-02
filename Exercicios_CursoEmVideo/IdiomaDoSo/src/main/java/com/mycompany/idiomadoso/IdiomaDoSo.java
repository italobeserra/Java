package com.mycompany.idiomadoso;

import java.util.Locale;

public class IdiomaDoSo {

    public static void main(String[] args) {
        Locale locale = Locale.getDefault(); // Pega o locale padrão do sistema
        String idioma = locale.getDisplayLanguage(); // Nome do idioma no idioma atual

        System.out.println("Idioma do sistema: " + idioma);
    }
}
