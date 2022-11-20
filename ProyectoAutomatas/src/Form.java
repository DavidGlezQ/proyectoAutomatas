import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * @author David Alejando Gonzalez Quezada
 * @project ProyectoAutomatas
 * 19/11/22
 */
public class Form extends JFrame {

    public Form() {
        initComponents();
    }

    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        tvIdentificador = new javax.swing.JLabel();
        tvOperadorRelacional = new javax.swing.JLabel();
        tvOperadorLogico = new javax.swing.JLabel();
        tvOperadorAritmetico = new javax.swing.JLabel();
        tvAsignacion = new javax.swing.JLabel();
        tvNumEnteros = new javax.swing.JLabel();
        tvNumDecimales = new javax.swing.JLabel();
        tvComentarios = new javax.swing.JLabel();
        tvParentesis = new javax.swing.JLabel();
        tvLlave = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Seleccionar");
        jButton1.setActionCommand("jSeleccionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setText("Tokens detectados:");

        tvIdentificador.setText("Identificador");

        tvOperadorRelacional.setText("Operador relacional");

        tvOperadorLogico.setText("Operador logico");

        tvOperadorAritmetico.setText("Operador aritmetico");

        tvAsignacion.setText("Asignacion");

        tvNumEnteros.setText("Numeros enteros");

        tvNumDecimales.setText("Numeros decimales");

        tvComentarios.setText("Comentario");

        tvParentesis.setText("Parentesis");

        tvLlave.setText("Llave");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tvLlave)
                                        .addComponent(tvParentesis)
                                        .addComponent(tvComentarios)
                                        .addComponent(tvNumDecimales)
                                        .addComponent(tvNumEnteros)
                                        .addComponent(jLabel1)
                                        .addComponent(tvIdentificador)
                                        .addComponent(tvOperadorRelacional)
                                        .addComponent(tvOperadorLogico)
                                        .addComponent(tvOperadorAritmetico)
                                        .addComponent(tvAsignacion))
                                .addGap(105, 105, 105))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tvIdentificador)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tvOperadorRelacional)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tvOperadorLogico)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tvOperadorAritmetico)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tvAsignacion)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tvNumEnteros)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tvNumDecimales)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tvComentarios)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tvParentesis)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tvLlave))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton1)))
                                .addContainerGap(144, Short.MAX_VALUE))
        );

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(null);
        File archivo = fc.getSelectedFile();

        try{
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String texto = "";
            String linea = "";
            while ((linea = br.readLine()) != null) texto+=linea+"\n";
            jTextArea1.setText(texto);
            JOptionPane.showMessageDialog(null, "Leido correctamente");
        }catch(Exception ex){

        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);

            }
        });
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel tvAsignacion;
    private javax.swing.JLabel tvComentarios;
    private javax.swing.JLabel tvIdentificador;
    private javax.swing.JLabel tvLlave;
    private javax.swing.JLabel tvNumDecimales;
    private javax.swing.JLabel tvNumEnteros;
    private javax.swing.JLabel tvOperadorAritmetico;
    private javax.swing.JLabel tvOperadorLogico;
    private javax.swing.JLabel tvOperadorRelacional;
    private javax.swing.JLabel tvParentesis;
    // End of variables declaration
}