package motos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.HashSet;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Choice;
import java.awt.Checkbox;
import java.awt.Panel;
import java.awt.Font;
import javax.swing.ImageIcon;

public class Form extends JFrame {

	private JPanel contentPane;
	private JTextField motoNome;
	private JTextField motoAno;
	private JTextField motoPreco;
	private JTextField motoKm;
	private JTextField motoCilindradas;
	private JTextField motoCor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form frame = new Form();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 522, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCadastrar = new JButton("CADASTRAR");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, 
						"nome: " +motoNome.getText() + 
						"\n\n Ano: " +motoAno.getText() + 
						"\n\n Preço: " +motoPreco.getText() + 
						"\n\n Km por litro: " +motoKm.getText() +
						"\n\n Cilindradas: " +motoCilindradas.getText() + 
						"\n\n Cor da moto: " +motoCor.getText() );
				
				HashSet loading = new HashSet();
				loading.add("Cadastrando......");
				System.out.println(loading.toString());
				
				HashSet confirm = new HashSet();
				confirm.add("Cadastro realizado com sucesso!");
				System.out.println(confirm.toString());
				
				HashMap end = new HashMap();
				end.put("msg", "Programa pronto para cadastrar outra moto!");
				System.out.println(end.get("msg"));
				
			}
		});
		btnCadastrar.setBounds(185, 360, 137, 23);
		contentPane.add(btnCadastrar);
		
		motoNome = new JTextField();
		motoNome.setBounds(24, 158, 86, 20);
		contentPane.add(motoNome);
		motoNome.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Modelo");
		lblNewLabel.setBounds(24, 144, 46, 14);
		contentPane.add(lblNewLabel);
		
		motoAno = new JTextField();
		motoAno.setBounds(136, 158, 86, 20);
		contentPane.add(motoAno);
		motoAno.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Ano:");
		lblNewLabel_1.setBounds(136, 144, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Cilindradas");
		lblNewLabel_2.setBounds(24, 241, 68, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Cadastro de motos");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_3.setBounds(62, 11, 358, 58);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Preco (R$)");
		lblNewLabel_4.setBounds(24, 194, 86, 14);
		contentPane.add(lblNewLabel_4);
		
		motoPreco = new JTextField();
		motoPreco.setBounds(24, 210, 86, 20);
		contentPane.add(motoPreco);
		motoPreco.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Km/L");
		lblNewLabel_5.setBounds(136, 194, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		motoKm = new JTextField();
		motoKm.setBounds(136, 210, 86, 20);
		contentPane.add(motoKm);
		motoKm.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon("D:\\Downloads Navegador\\bmw.png"));
		lblNewLabel_6.setBounds(291, 125, 79, 83);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon("D:\\Downloads Navegador\\ducati.png"));
		lblNewLabel_7.setBounds(396, 124, 73, 89);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Marcas");
		lblNewLabel_8.setBounds(357, 100, 46, 14);
		contentPane.add(lblNewLabel_8);
		
		motoCilindradas = new JTextField();
		motoCilindradas.setBounds(24, 262, 86, 20);
		contentPane.add(motoCilindradas);
		motoCilindradas.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Cor");
		lblNewLabel_9.setBounds(136, 241, 46, 14);
		contentPane.add(lblNewLabel_9);
		
		motoCor = new JTextField();
		motoCor.setBounds(136, 262, 86, 20);
		contentPane.add(motoCor);
		motoCor.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setIcon(new ImageIcon("D:\\Downloads Navegador\\harley (3).png"));
		lblNewLabel_10.setBounds(390, 193, 95, 110);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setIcon(new ImageIcon("D:\\Downloads Navegador\\Webp.net-resizeimage (3).png"));
		lblNewLabel_11.setBounds(272, 173, 114, 141);
		contentPane.add(lblNewLabel_11);
		
	}
}
