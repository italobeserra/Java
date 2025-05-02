package com.mycompany.resolucaodatela;

import java.awt.*;
        
public class ResolucaoDaTela {

    public static void main(String[] args) {
       Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int largura = (int) screenSize.getWidth();
        int altura = (int) screenSize.getHeight();
        
        System.out.println("Resolução da tela:" + largura + "x" + altura);
    }
}
