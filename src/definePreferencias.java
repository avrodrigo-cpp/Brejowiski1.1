import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class definePreferencias extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4759176313470184962L;
	JButton Cadastrar, Fechar;
	JTextField Nome, Recipiente, Cidade;
	PrincipalBrejowiski pb;
	public definePreferencias() {
		getContentPane().setLayout(null);
		setTitle("Cadastro de Preferencias");
		Handler obj = new Handler();
		
		JLabel LNome = new JLabel("Cerveja Favorita:");
		LNome.setBounds(60,20,150,30);
		add(LNome);
		Nome = new JTextField();
		Nome.setBounds(60,45,150,30);
		add(Nome);
		
		JLabel LRecipiente = new JLabel("Recipiente:");
		LRecipiente.setBounds(60,65,150,30);
		add(LRecipiente);
		Recipiente = new JTextField();
		Recipiente.setBounds(60,90,150,30);
		add(Recipiente);
		
		JLabel LCidade = new JLabel("Cidade:");
		LCidade.setBounds(60,110,150,30);
		add(LCidade);
		Cidade = new JTextField();
		Cidade.setBounds(60,135,150,30);
		add(Cidade);
		
		Cadastrar = new JButton("Cadastrar");
		Cadastrar.setBounds(30,180,100,30);
		Cadastrar.addActionListener(obj);
		add(Cadastrar);
		
		Fechar = new JButton("Fechar");
		Fechar.setBounds(130,180,100,30);
		Fechar.addActionListener(obj);
		add(Fechar);
		
		setBounds(110,10,300,300);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public class Handler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == Cadastrar){
				Preferencia aux = new Preferencia();
				aux.setNome(Nome.getText());
				aux.setRecipiente(Recipiente.getText());
				aux.setCidade(Cidade.getText());
				pb.cadastra(aux);
			}
			if(e.getSource() == Fechar){
				
			}
		}
	}
}
