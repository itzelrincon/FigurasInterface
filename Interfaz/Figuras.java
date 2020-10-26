package Interfaz;
public class Figuras extends javax.swing.JFrame {

    public Figuras() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TrianguloBTN = new javax.swing.JButton();
        CuadrilateroBTN = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Operacion = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        jLabel1.setText("Área y perímetro de figuras geométricas.");

        TrianguloBTN.setText("Triangulo");
        TrianguloBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrianguloBTNActionPerformed(evt);
            }
        });

        CuadrilateroBTN.setText("Cuadrilatero");
        CuadrilateroBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuadrilateroBTNActionPerformed(evt);
            }
        });

        jLabel2.setText("Seleccione el tipo de figura:");

        Operacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Area", "Perimetro" }));

        jLabel3.setText("Tipo de operación:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(Operacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(TrianguloBTN)
                        .addGap(176, 176, 176)
                        .addComponent(CuadrilateroBTN)))
                .addContainerGap(174, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Operacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TrianguloBTN)
                    .addComponent(CuadrilateroBTN))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TrianguloBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrianguloBTNActionPerformed
        
        String Tipo = Operacion.getSelectedItem().toString();
        
        if ("Area".equals(Tipo)){
        Triangulo triangulo = new Triangulo();
        triangulo.setVisible(true);
        }
        else {
            TrianguloP perimetro = new TrianguloP();
            perimetro.setVisible(true);
        }            
    }//GEN-LAST:event_TrianguloBTNActionPerformed

    private void CuadrilateroBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuadrilateroBTNActionPerformed
        String Tipo = Operacion.getSelectedItem().toString();
        
        if ("Area".equals(Tipo)){
            Cuadrilatero cuadrilatero = new Cuadrilatero();
            cuadrilatero.setVisible(true);
        }
        else {
            CuadrilateroP perimetro = new CuadrilateroP();
            perimetro.setVisible(true);
        }
        
    }//GEN-LAST:event_CuadrilateroBTNActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Figuras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CuadrilateroBTN;
    private javax.swing.JComboBox<String> Operacion;
    private javax.swing.JButton TrianguloBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}