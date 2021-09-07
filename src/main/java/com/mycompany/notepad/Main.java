package com.mycompany.notepad;

import com.mycompany.notepad.telaapp.*;


public class Main {
    
    public static void main(String[] args) {
        new TelaApp().setVisible(true);
    }

    public void criarInternalFrame() {
        new PopUp().setVisible(true);
    }
    
    
    
}
