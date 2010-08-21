/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainFrame.java
 *
 * Created on 18/07/2010, 18:24:40
 */

package sgpp;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo
 */
public class MainFrame extends javax.swing.JFrame {

    /** Creates new form MainFrame */
    public MainFrame() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        telaCalculoPlanilha = new javax.swing.JDialog();
        btnCalcular = new javax.swing.JButton();
        nomeArquivo = new javax.swing.JTextField();
        btnAbreFileChooser = new javax.swing.JButton();
        selecionaArquivo = new javax.swing.JFileChooser();
        telaResultadoCalculoPlanilha = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultadoTextArea = new javax.swing.JTextArea();
        labelCentral = new javax.swing.JLabel();
        mainMenu = new javax.swing.JMenuBar();
        menuProgramas = new javax.swing.JMenu();
        menuCalculoPlanilha = new javax.swing.JMenuItem();
        menuSobre = new javax.swing.JMenu();

        telaCalculoPlanilha.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        telaCalculoPlanilha.setTitle("Escolha do Arquivo");
        telaCalculoPlanilha.setMinimumSize(new java.awt.Dimension(480, 140));

        btnCalcular.setText("Calcular Planilha");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        nomeArquivo.setEditable(false);

        btnAbreFileChooser.setText("...");
        btnAbreFileChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbreFileChooserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout telaCalculoPlanilhaLayout = new javax.swing.GroupLayout(telaCalculoPlanilha.getContentPane());
        telaCalculoPlanilha.getContentPane().setLayout(telaCalculoPlanilhaLayout);
        telaCalculoPlanilhaLayout.setHorizontalGroup(
            telaCalculoPlanilhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaCalculoPlanilhaLayout.createSequentialGroup()
                .addGroup(telaCalculoPlanilhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, telaCalculoPlanilhaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(nomeArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnAbreFileChooser))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, telaCalculoPlanilhaLayout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(btnCalcular)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        telaCalculoPlanilhaLayout.setVerticalGroup(
            telaCalculoPlanilhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaCalculoPlanilhaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(telaCalculoPlanilhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAbreFileChooser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCalcular)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        selecionaArquivo.setApproveButtonText("Selecionar");
        selecionaArquivo.setApproveButtonToolTipText("");
        selecionaArquivo.setFileHidingEnabled(false);
        selecionaArquivo.setEnabled(false);
        selecionaArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionaArquivoActionPerformed(evt);
            }
        });

        telaResultadoCalculoPlanilha.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        telaResultadoCalculoPlanilha.setTitle("Resultado do Cálculo");
        telaResultadoCalculoPlanilha.setMinimumSize(new java.awt.Dimension(300, 300));
        telaResultadoCalculoPlanilha.setModalExclusionType(java.awt.Dialog.ModalExclusionType.TOOLKIT_EXCLUDE);

        resultadoTextArea.setColumns(20);
        resultadoTextArea.setEditable(false);
        resultadoTextArea.setRows(5);
        jScrollPane1.setViewportView(resultadoTextArea);

        javax.swing.GroupLayout telaResultadoCalculoPlanilhaLayout = new javax.swing.GroupLayout(telaResultadoCalculoPlanilha.getContentPane());
        telaResultadoCalculoPlanilha.getContentPane().setLayout(telaResultadoCalculoPlanilhaLayout);
        telaResultadoCalculoPlanilhaLayout.setHorizontalGroup(
            telaResultadoCalculoPlanilhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(telaResultadoCalculoPlanilhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(telaResultadoCalculoPlanilhaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        telaResultadoCalculoPlanilhaLayout.setVerticalGroup(
            telaResultadoCalculoPlanilhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 168, Short.MAX_VALUE)
            .addGroup(telaResultadoCalculoPlanilhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(telaResultadoCalculoPlanilhaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelCentral.setFont(new java.awt.Font("Tahoma", 0, 36));
        labelCentral.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCentral.setText("SGPP");

        menuProgramas.setLabel("Programas");

        menuCalculoPlanilha.setText("Cálculo de Planilha DIEF");
        menuCalculoPlanilha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCalculoPlanilhaActionPerformed(evt);
            }
        });
        menuProgramas.add(menuCalculoPlanilha);

        mainMenu.add(menuProgramas);

        menuSobre.setText("Sobre");
        menuSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSobreMouseClicked(evt);
            }
        });
        mainMenu.add(menuSobre);

        setJMenuBar(mainMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(labelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(labelCentral)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuSobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSobreMouseClicked
        alertSobre();
    }//GEN-LAST:event_menuSobreMouseClicked

    private void menuCalculoPlanilhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCalculoPlanilhaActionPerformed
        telaCalculoPlanilha.setVisible(true);
    }//GEN-LAST:event_menuCalculoPlanilhaActionPerformed

    private void selecionaArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionaArquivoActionPerformed
        File arquivo = selecionaArquivo.getSelectedFile();
        nomeArquivo.setText(arquivo.getAbsolutePath());
    }//GEN-LAST:event_selecionaArquivoActionPerformed

    private void btnAbreFileChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbreFileChooserActionPerformed
        nomeArquivo.setText(null);
        selecionaArquivo.repaint();
        selecionaArquivo.showOpenDialog(null);
    }//GEN-LAST:event_btnAbreFileChooserActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed

        if(nomeArquivo.getText() == null || nomeArquivo.getText().equals(""))
            return;

        telaResultadoCalculoPlanilha.setVisible(true);
        telaCalculoPlanilha.setVisible(false);

        resultadoTextArea.setEditable(false);

        //Faz o cálculo aqui

        resultadoTextArea.setText("escrevendo o resultado...");
    }//GEN-LAST:event_btnCalcularActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbreFileChooser;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCentral;
    private javax.swing.JMenuBar mainMenu;
    private javax.swing.JMenuItem menuCalculoPlanilha;
    private javax.swing.JMenu menuProgramas;
    private javax.swing.JMenu menuSobre;
    private javax.swing.JTextField nomeArquivo;
    private javax.swing.JTextArea resultadoTextArea;
    private javax.swing.JFileChooser selecionaArquivo;
    private javax.swing.JDialog telaCalculoPlanilha;
    private javax.swing.JDialog telaResultadoCalculoPlanilha;
    // End of variables declaration//GEN-END:variables

    private void alertSobre() {
        new JOptionPane().showMessageDialog(this, "Sistema desenvolvido para uso exclusivo de\nCelínio Nogueira Barros");
    }

}
