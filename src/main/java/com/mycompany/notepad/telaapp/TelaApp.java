package com.mycompany.notepad.telaapp;


public class TelaApp extends javax.swing.JFrame {
private String texto = "";
   
    public TelaApp() {
        initComponents();
        
        this.setLocation(450, 200);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        salvar = new javax.swing.JMenu();
        novo = new javax.swing.JMenuItem();
        SalvarMenu = new javax.swing.JMenuItem();
        recortar = new javax.swing.JMenu();
        selectAl = new javax.swing.JMenu();
        copiar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textArea.setColumns(20);
        textArea.setRows(5);
        textArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textAreaKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(textArea);

        salvar.setText("Arquivo");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        novo.setText("Novo");
        novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoActionPerformed(evt);
            }
        });
        salvar.add(novo);

        SalvarMenu.setText("Salvar");
        SalvarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarMenuActionPerformed(evt);
            }
        });
        salvar.add(SalvarMenu);

        jMenuBar1.add(salvar);

        recortar.setText("Recortar");
        recortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recortarActionPerformed(evt);
            }
        });
        jMenuBar1.add(recortar);

        selectAl.setText("Selecionar tudo");
        selectAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectAlActionPerformed(evt);
            }
        });
        jMenuBar1.add(selectAl);

        copiar.setText("Copiar");
        copiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copiarActionPerformed(evt);
            }
        });
        jMenuBar1.add(copiar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalvarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarMenuActionPerformed
        this.texto = textArea.getText();
         
        
    }//GEN-LAST:event_SalvarMenuActionPerformed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
       this.texto = textArea.getText();
    }//GEN-LAST:event_salvarActionPerformed

    private void novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoActionPerformed
        if ( this.texto.equals(textArea.getText())){
            
            TelaApp telaApp = new TelaApp();
            telaApp.setVisible(true);
            telaApp.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            
        }
        else{
            
            new PopUp().setVisible(true);
        }
    }//GEN-LAST:event_novoActionPerformed

    private void selectAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectAlActionPerformed
        this.textArea.selectAll();
    }//GEN-LAST:event_selectAlActionPerformed

    private void copiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copiarActionPerformed
        this.textArea.copy();
    }//GEN-LAST:event_copiarActionPerformed

    private void recortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recortarActionPerformed
        this.textArea.cut();
    }//GEN-LAST:event_recortarActionPerformed

    private void textAreaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textAreaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_textAreaKeyTyped

    public String getTexto(){
        return this.texto;
    }
    
    public void setTexto(String texto){
        this.texto = texto;
    }
    
    public String getTextArea(){
        this.textArea.selectAll();
        this.textArea.setText(textArea.getSelectedText());
        return this.textArea.getText();
    }
    
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem SalvarMenu;
    private javax.swing.JMenu copiar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem novo;
    private javax.swing.JMenu recortar;
    private javax.swing.JMenu salvar;
    private javax.swing.JMenu selectAl;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
