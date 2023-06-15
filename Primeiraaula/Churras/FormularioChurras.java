import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.io.File;
import java.util.List;
import java.awt.event.ActionEvent;

public class FormularioChurras {

	private JFrame frame;
	private JTextField txtId;
	private JTextField txtNome;
	private JTextField txtEmail;
	private String caminhoFoto;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioChurras window = new FormularioChurras();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FormularioChurras() {
		initialize();
	}
	
	private void carregaUsuarios() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn("Nome");
		model.addColumn("Email");
		try {
			UsuarioDAO usuarioDAO = new UsuarioDAO();
			List<Usuario2> usuarios = usuarioDAO.listarUsuario();
			for(Usuario2 usuario : usuarios) {
				int id = usuario.getId();
				String nome = usuario.getNome();
				String email = usuario.getEmail();
				model.addRow(new Object[] {id, nome, email});
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		table.setModel(model);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setFont(new Font("Bookman Old Style", Font.PLAIN, 12));
		frame.getContentPane().setBackground(new Color(196, 196, 225));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Id:");
		lblNewLabel.setFont(new Font("Maiandra GD", Font.PLAIN, 15));
		lblNewLabel.setBounds(28, 151, 76, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setFont(new Font("Maiandra GD", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(28, 194, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email:");
		lblNewLabel_2.setFont(new Font("Maiandra GD", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(28, 239, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		txtId = new JTextField();
		txtId.setBounds(84, 150, 173, 20);
		frame.getContentPane().add(txtId);
		txtId.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setBounds(84, 193, 197, 20);
		frame.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(84, 238, 214, 20);
		frame.getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBackground(new Color(128, 128, 255));
		btnExcluir.setBounds(509, 588, 89, 23);
		frame.getContentPane().add(btnExcluir);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBackground(new Color(128, 128, 255));
		btnSalvar.setBounds(410, 588, 89, 23);
		frame.getContentPane().add(btnSalvar);
		
		JPanel pnlFoto = new JPanel();
		pnlFoto.setBorder(new LineBorder(new Color(128, 128, 255), 2));
		pnlFoto.setBounds(428, 133, 140, 140);
		frame.getContentPane().add(pnlFoto);
		
		JLabel lblFoto = new JLabel("");
		pnlFoto.add(lblFoto);
		
		JButton btnSelecionar = new JButton("Selecionar");
		btnSelecionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser();
				int result = fc.showOpenDialog(btnSelecionar);
				if (result == JFileChooser.APPROVE_OPTION) {
					File fotoSelecionada = fc.getSelectedFile();
					ImageIcon fotoIcone = new ImageIcon(fotoSelecionada.getAbsolutePath());
					caminhoFoto = fotoSelecionada.getAbsolutePath();
					Image img = fotoIcone.getImage();
					int tamanhoMax = Math.min(pnlFoto.getWidth(), pnlFoto.getHeight());
					Image scaledImage = img.getScaledInstance(tamanhoMax, tamanhoMax, Image.SCALE_SMOOTH);
					lblFoto.setIcon(new ImageIcon(scaledImage));
				}
			}
		});
		btnSelecionar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnSelecionar.setBackground(new Color(128, 128, 255));
		btnSelecionar.setBounds(452, 284, 89, 23);
		frame.getContentPane().add(btnSelecionar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 614, 94);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setRowHeaderView(table);
		frame.setBounds(100, 100, 650, 690);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		carregaUsuarios();
	}
}
