package Atelie.view;

import Atelie.view.cliente.ClienteConsultaGUI;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class menuGUI extends javax.swing.JFrame {
    
    private ClienteConsultaGUI formClienteConsultaGUI = null;

    public menuGUI() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnCadastros = new javax.swing.JMenu();
        mnCadCliente = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ateliê Pâmela Artes");
        setName("menuGUI"); // NOI18N

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 915, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 381, Short.MAX_VALUE)
        );

        mnCadastros.setText("Cadastros");

        mnCadCliente.setText("Cliente");
        mnCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadClienteActionPerformed(evt);
            }
        });
        mnCadastros.add(mnCadCliente);

        jMenuBar1.add(mnCadastros);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadClienteActionPerformed

        try {
            if (formClienteConsultaGUI == null) {
                formClienteConsultaGUI = new ClienteConsultaGUI();
            }
            
            formClienteConsultaGUI.setClosable(true);
            formClienteConsultaGUI.setResizable(true);
            formClienteConsultaGUI.setMaximizable(true);
            formClienteConsultaGUI.setVisible(true);
            
            desktop.add(formClienteConsultaGUI);
            formClienteConsultaGUI.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(menuGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnCadClienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane desktop;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnCadCliente;
    private javax.swing.JMenu mnCadastros;
    // End of variables declaration//GEN-END:variables
}
