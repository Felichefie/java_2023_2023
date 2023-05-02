import javax.swing.*;
import java.awt.*;

public class AddMoneyMenu
{
    JFrame frame;

    void addComponentsToPane(Container pane)
    {
        /* This can later be changed to use GridBagLayout */
        pane.setLayout(null);   

        /* Design */

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

        
        JComboBox menuSeleccionarTarj = new JComboBox ();
        size = menuSeleccionarTarj.getPreferredSize();
        menuSeleccionarTarj.setBounds(200, 160, size.width, size.height);

        
        //Textfield
        JTextField txtFieldMonto = new JTextField("1000");
        size = txtFieldMonto.getPreferredSize();
        txtFieldMonto.setBounds(200, 110, size.width, size.height);

        JTextField txtFieldSelTarjeta = new JTextField("Lista desplegable");
        size = txtFieldSelTarjeta.getPreferredSize();
        txtFieldSelTarjeta.setBounds(200, 160, size.width, size.height);

      
       //Octavio
        pane.add(lblTitulo);
        pane.add(lblMonto);
        pane.add(lblSaldoActual);
        pane.add(lblSaldo);
        pane.add(lblSeleccionarTarj);

        pane.add(menuSeleccionarTarj);

        //Poncho
        pane.add(txtFieldMonto);
        //pane.add(txtFieldSelTarjeta);
     
        
        //Aaron
        pane.add(btnAceptar);   
        pane.add(btnCancelar);
       
        
        //Classroom
        this.frame.setVisible(true);

    }

    public AddMoneyMenu ()
    {
        this.frame = new JFrame ("Agregar dinero");
        this.frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        this.frame.setSize (300, 600);

        addComponentsToPane (this.frame.getContentPane ());

        this.frame.setVisible (true);
    } 
}
//kojihyutrf