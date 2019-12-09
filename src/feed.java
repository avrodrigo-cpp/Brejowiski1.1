import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;

public class feed extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	private JPanel contentPane;
	private static JTable jTableCerveja;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 * @param minhasCervejas 
	 */
	
	private static void carregaTabela( List<Cerveja> minhasCervejas) {
		
		String Cerveja = "";
		String Recipiente = "";
		String Preco = "";
		String Estabelecimento = "";
		String Cidade = "";
		
		DefaultTableModel model = (DefaultTableModel) jTableCerveja.getModel();
		for (Cerveja cerveja : minhasCervejas) {
			Cerveja = cerveja.getNome();
			Recipiente = cerveja.getRecipiente();
			Preco = Double.toString(cerveja.getPreco());
			Estabelecimento = cerveja.getEstabelecimento();
			Cidade = cerveja.getCidade();
			model.addRow(new String[] {Cerveja, Recipiente, Preco, Estabelecimento, Cidade });
		}
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run(List<Cerveja> minhasCervejas) {
				try {
					
					feed frame = new feed(minhasCervejas);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		});
	}

	/**
	 * Create the frame.
	 * @param minhasCervejas 
	 * @param minhasCervejas 
	 */
	public feed(List<Cerveja> minhasCervejas) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 49, 432, 204);
		contentPane.add(scrollPane);
		
		jTableCerveja = new JTable();
		scrollPane.setViewportView(jTableCerveja);
		jTableCerveja.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Cerveja", "Recipiente", "Pre\u00E7o", "Estabelecimento", "Cidade"
			}
		));
		
		
		jTableCerveja.getColumnModel().getColumn(0).setPreferredWidth(110);
		jTableCerveja.getColumnModel().getColumn(1).setPreferredWidth(110);
		jTableCerveja.getColumnModel().getColumn(2).setPreferredWidth(50);
		jTableCerveja.getColumnModel().getColumn(3).setPreferredWidth(120);
		jTableCerveja.getColumnModel().getColumn(4).setPreferredWidth(110);
		
		carregaTabela(minhasCervejas);
		JLabel lblFeed = new JLabel("Feed");
		lblFeed.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		lblFeed.setBounds(187, 13, 58, 36);
		contentPane.add(lblFeed);
		setLocationRelativeTo(null);
	}
}
