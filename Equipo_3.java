package Repositorios.SwingInt;
import javax.swing.*;
import java.awt.Dimension;

class Equipo_3 {   
    public static void main(String args[]) {      

        //JFRAME    
        JFrame frmRegistro = new JFrame("Saldo del Usuario");  
        JPanel panel = new JPanel();
        frmRegistro.getContentPane();
        panel.setLayout(null);   
        frmRegistro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frmRegistro.setSize(300, 600); 
       
        //Objetos del Frame     

        //Buttons
        JButton btnAceptar = new JButton("Aceptar");
        Dimension size = btnAceptar.getPreferredSize();
        btnAceptar.setBounds(30, 500, size.width, size.height);

        JButton btnCancelar = new JButton("Cancelar");
        Dimension size2Dimension = btnCancelar.getPreferredSize();
        btnCancelar.setBounds(200, 500, size.width, size.height);


        //Labels
        JLabel lblTitulo = new JLabel("Seleccionar Tarjeta");
        size = lblTitulo.getPreferredSize();
        lblTitulo.setBounds(100, 30, size.width, size.height);

        JLabel  lblMonto = new JLabel ("Monto a Transferir");
        size = lblMonto.getPreferredSize();
        lblMonto.setBounds(30, 100, size.width, size.height);

        JLabel  lblSeleccionarTarj = new JLabel ("Seleccionar tarjeta");
        size = lblSeleccionarTarj.getPreferredSize();
        lblSeleccionarTarj.setBounds(30, 160, size.width, size.height);

        JLabel lblSaldoActual = new JLabel("Saldo Actual");
        size = lblSaldoActual.getPreferredSize();
        lblSaldoActual.setBounds(30, 210, size.width, size.height);

        //Label inmovil
        JLabel lblSaldo = new JLabel("$$Saldo Actual$$");
        size = lblSaldo.getPreferredSize();
        lblSaldo.setBounds(200, 210, size.width, size.height);

        
        JMenu menuSeleccionarTarj = new JMenu("Aqui deberia ir una lista despelgable xD");
        size = menuSeleccionarTarj.getPreferredSize();
        menuSeleccionarTarj.setBounds(200, 160, size.width, size.height);

        
        //Textfield
        JTextField txtFieldMonto = new JTextField("$$$$");
        size = txtFieldMonto.getPreferredSize();
        txtFieldMonto.setBounds(200, 110, size.width, size.height);

        JTextField txtFieldSelTarjeta = new JTextField("Lista desplegable");
        size = txtFieldSelTarjeta.getPreferredSize();
        txtFieldSelTarjeta.setBounds(200, 160, size.width, size.height);

      
       //Octavio
        panel.add(lblTitulo);
        panel.add(lblMonto);
        panel.add(lblSaldoActual);
        panel.add(lblSaldo);
        panel.add(lblSeleccionarTarj);

        panel.add(menuSeleccionarTarj);

        //Poncho
        panel.add(txtFieldMonto);
        //panel.add(txtFieldSelTarjeta);
     
        
        //Aaron
        panel.add(btnAceptar);   
        panel.add(btnCancelar); // Agrega el botón al panel de contenido del marco     
       
        
        //Classroom
        frmRegistro.add(panel);
        frmRegistro.setVisible(true);

        //El otro man los chescos xD
    }
}