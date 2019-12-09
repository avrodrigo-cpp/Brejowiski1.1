import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class preferenciaUsuario extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 51515454121L;
	PrincipalBrejowiski pb;
	private JPanel contentPane;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					preferenciaUsuario frame = new preferenciaUsuario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the frame.
	 * @param minhasCervejas 
	 */
	public preferenciaUsuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCervejaFavorita = new JLabel("Cerveja Favorita:");
		lblCervejaFavorita.setBounds(12, 69, 128, 28);
		contentPane.add(lblCervejaFavorita);
		
		JComboBox cbCerveja = new JComboBox();
		cbCerveja.setModel(new DefaultComboBoxModel(new String[] {"", "Brahma", "Skol"}));
		cbCerveja.setBounds(194, 69, 205, 28);
		contentPane.add(cbCerveja);
		
		
		JLabel lblRecipienteFavorito = new JLabel("Recipiente Favorito:");
		lblRecipienteFavorito.setBounds(12, 110, 128, 28);
		contentPane.add(lblRecipienteFavorito);
		
		JComboBox cbRecipiente = new JComboBox();
		cbRecipiente.setModel(new DefaultComboBoxModel(new String[] {"", "1 Litro (garrafa)", "600 ml (garrafa)", "300 ml (garrafa)", "473 ml (lata)", "350 ml (lata)", ""}));
		cbRecipiente.setBounds(194, 110, 205, 28);
		contentPane.add(cbRecipiente);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(12, 154, 91, 23);
		contentPane.add(lblCidade);
		
		JComboBox cbCidade = new JComboBox();
		cbCidade.setModel(new DefaultComboBoxModel(new String[] {"", "Ouro Branco -MG"}));
		cbCidade.setBounds(194, 151, 205, 28);
		contentPane.add(cbCidade);
		
		JLabel lblCadastrarPreferencias = new JLabel("Cadastrar Preferencias");
		lblCadastrarPreferencias.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblCadastrarPreferencias.setBounds(103, 13, 226, 43);
		contentPane.add(lblCadastrarPreferencias);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnCadastrar);
					Preferencia aux = new Preferencia();
					String Saida = "";
					Saida = (String) cbCerveja.getSelectedItem();
					aux.setNome(Saida);
					Saida = (String) cbRecipiente.getSelectedItem();
					aux.setRecipiente(Saida);
					Saida = (String) cbCidade.getSelectedItem();
					aux.setCidade(Saida);
					setVisible(false);
			}
		});
		btnCadastrar.setBounds(43, 203, 97, 25);
		contentPane.add(btnCadastrar);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnFechar);
				setVisible(false);
			}
		});
		btnFechar.setBounds(266, 203, 97, 25);
		contentPane.add(btnFechar);
		setLocationRelativeTo(null);

	}
	
}
