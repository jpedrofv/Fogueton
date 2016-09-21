package telas;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.Icon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

import util.HoraData;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.JTextField;

public class Principal {

	private JFrame frame;
	JPanel paneInicio = new JPanel();
	JPanel paneEquipe = new JPanel();
	JPanel paneLancamento = new JPanel();
	JPanel panePosLancamento = new JPanel();
	JTabbedPane principal = new JTabbedPane(JTabbedPane.TOP);
	JTabbedPane rank = new JTabbedPane(JTabbedPane.TOP);
	JPanel altura = new JPanel();
	JPanel velocidade = new JPanel();
	JPanel distancia = new JPanel();
	HoraData HD = new HoraData();
	private final JPanel sistema = new JPanel();
	private final JPanel pesquisa = new JPanel();
	private final JLabel lblHora = new JLabel("Hora:");
	private final JLabel lblData = new JLabel("Data:");
	private final JLabel hora = new JLabel("");
	private final JLabel data = new JLabel("");
	private final JButton button = new JButton("");
	private final JButton btnEditarDadosDa = new JButton("Editar Dados Da Equipe");
	private final JTable table = new JTable();
	private final JScrollPane scrollPane = new JScrollPane();
	private final JLabel lblRankingPorAltitude = new JLabel("Ranking Por Altitude");
	private JTextField txtCodEqp;
	private JTextField txtNomeEqp;
	private JTextField txtRM_1;
	private JTextField txtNome_1;
	private JTextField txtTurma_1;
	private JTextField txtRM_2;
	private JTextField txtRM_3;
	private JTextField txtRM_4;
	private JTextField txtRM_5;
	private JTextField txtNome_2;
	private JTextField txtNome_3;
	private JTextField txtNome_4;
	private JTextField txtNome_5;
	private JTextField txtTurma_2;
	private JTextField txtTurma_3;
	private JTextField txtTurma_4;
	private JTextField txtTurma_5;
	
	
	
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
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
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent arg0) {
				HD.start(data);
				HD.start1(hora);
				
			}
		});
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setUndecorated(true);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setBounds(0, 0,screenSize.width, screenSize.height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		principal.setFont(new Font("Lucida Console", Font.BOLD, 11));
		principal.setBorder(UIManager.getBorder("Button.border"));
		principal.setForeground(Color.RED);
		principal.setBackground(Color.WHITE);
		
       
		
		
		
		principal.setBounds(274, 96, 1070, 435);
		paneInicio.setBackground(Color.WHITE);
		principal.add("Inicio", paneInicio);
		paneInicio.setLayout(null);
			
			JButton btnIniciarSequnciaDe = new JButton("Iniciar Sequ\u00EAncia De Lan\u00E7amentos");
			btnIniciarSequnciaDe.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					principal.setSelectedIndex(2);
				}
			});
			btnIniciarSequnciaDe.setIcon(new ImageIcon(Principal.class.getResource("/images/foguete.jpg")));
			btnIniciarSequnciaDe.setBorder(new LineBorder(Color.RED, 3, true));
			btnIniciarSequnciaDe.setBackground(Color.WHITE);
			btnIniciarSequnciaDe.setForeground(Color.RED);
			btnIniciarSequnciaDe.setFont(new Font("Lucida Console", Font.BOLD, 13));
			btnIniciarSequnciaDe.setBounds(82, 220, 399, 65);
			paneInicio.add(btnIniciarSequnciaDe);
			btnEditarDadosDa.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					principal.setSelectedIndex(1);
				}
			});
			btnEditarDadosDa.setFont(new Font("Lucida Console", Font.BOLD, 13));
			btnEditarDadosDa.setBorder(new LineBorder(Color.RED, 2, true));
			btnEditarDadosDa.setForeground(Color.RED);
			btnEditarDadosDa.setBackground(Color.WHITE);
			btnEditarDadosDa.setBounds(606, 220, 399, 65);
			
			paneInicio.add(btnEditarDadosDa);
		paneEquipe.setForeground(new Color(102, 255, 102));
		
		paneEquipe.setBackground(Color.WHITE);
		principal.add("Equipe", paneEquipe);
		paneEquipe.setLayout(null);
		
		JLabel lblCadastroDeEquipes = new JLabel("Cadastro De Equipes");
		lblCadastroDeEquipes.setForeground(Color.RED);
		lblCadastroDeEquipes.setFont(new Font("Lucida Console", Font.BOLD, 15));
		lblCadastroDeEquipes.setBounds(433, 11, 220, 35);
		paneEquipe.add(lblCadastroDeEquipes);
		
		JLabel lblCdigoDeRegistro = new JLabel("C\u00F3digo de Registro");
		lblCdigoDeRegistro.setForeground(Color.RED);
		lblCdigoDeRegistro.setFont(new Font("Lucida Console", Font.BOLD, 13));
		lblCdigoDeRegistro.setBounds(168, 81, 180, 14);
		paneEquipe.add(lblCdigoDeRegistro);
		
		txtCodEqp = new JTextField();
		txtCodEqp.setEnabled(false);
		txtCodEqp.setEditable(false);
		txtCodEqp.setFont(new Font("Lucida Console", Font.BOLD, 13));
		txtCodEqp.setForeground(Color.RED);
		txtCodEqp.setBounds(358, 78, 86, 20);
		paneEquipe.add(txtCodEqp);
		txtCodEqp.setColumns(10);
		
		JLabel lblNomeDaEquipe = new JLabel("Nome da Equipe");
		lblNomeDaEquipe.setForeground(Color.RED);
		lblNomeDaEquipe.setFont(new Font("Lucida Console", Font.BOLD, 13));
		lblNomeDaEquipe.setBounds(611, 81, 145, 14);
		paneEquipe.add(lblNomeDaEquipe);
		
		txtNomeEqp = new JTextField();
		txtNomeEqp.setFont(new Font("Lucida Console", Font.PLAIN, 13));
		txtNomeEqp.setBounds(766, 78, 166, 20);
		paneEquipe.add(txtNomeEqp);
		txtNomeEqp.setColumns(10);
		
		JPanel aluno1 = new JPanel();
		aluno1.setVisible(false);
		aluno1.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 2, true), "Integrante 1", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 0, 0)));
		aluno1.setBackground(Color.WHITE);
		aluno1.setBounds(82, 157, 180, 178);
		paneEquipe.add(aluno1);
		aluno1.setLayout(null);
		
		JLabel lblRm = new JLabel("RM:");
		lblRm.setForeground(Color.RED);
		lblRm.setFont(new Font("Lucida Console", Font.BOLD, 13));
		lblRm.setBounds(10, 27, 46, 14);
		aluno1.add(lblRm);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setForeground(Color.RED);
		lblNome.setFont(new Font("Lucida Console", Font.BOLD, 13));
		lblNome.setBounds(10, 64, 46, 14);
		aluno1.add(lblNome);
		
		JLabel lblTurma = new JLabel("Turma:");
		lblTurma.setForeground(Color.RED);
		lblTurma.setFont(new Font("Lucida Console", Font.BOLD, 13));
		lblTurma.setBounds(10, 108, 54, 14);
		aluno1.add(lblTurma);
		
		txtRM_1 = new JTextField();
		txtRM_1.setBounds(66, 24, 86, 20);
		aluno1.add(txtRM_1);
		txtRM_1.setColumns(10);
		
		txtNome_1 = new JTextField();
		txtNome_1.setBounds(66, 61, 86, 20);
		aluno1.add(txtNome_1);
		txtNome_1.setColumns(10);
		
		txtTurma_1 = new JTextField();
		txtTurma_1.setBounds(66, 105, 86, 20);
		aluno1.add(txtTurma_1);
		txtTurma_1.setColumns(10);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtRM_1.setText("");
				txtNome_1.setText("");
				txtTurma_1.setText("");
			}
		});
		btnLimpar.setFont(new Font("Lucida Console", Font.PLAIN, 10));
		btnLimpar.setForeground(Color.RED);
		btnLimpar.setBackground(Color.WHITE);
		btnLimpar.setBorder(new LineBorder(Color.RED, 2, true));
		btnLimpar.setBounds(106, 144, 64, 23);
		aluno1.add(btnLimpar);
		
		JPanel aluno2 = new JPanel();
		aluno2.setVisible(false);
		aluno2.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 2, true), "Integrante 2", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 0, 0)));
		aluno2.setBackground(Color.WHITE);
		aluno2.setBounds(272, 157, 180, 178);
		paneEquipe.add(aluno2);
		aluno2.setLayout(null);
		
		JLabel label = new JLabel("RM:");
		label.setForeground(Color.RED);
		label.setFont(new Font("Lucida Console", Font.BOLD, 13));
		label.setBounds(10, 24, 46, 14);
		aluno2.add(label);
		
		JLabel label_1 = new JLabel("Nome:");
		label_1.setForeground(Color.RED);
		label_1.setFont(new Font("Lucida Console", Font.BOLD, 13));
		label_1.setBounds(10, 61, 46, 14);
		aluno2.add(label_1);
		
		JLabel label_2 = new JLabel("Turma:");
		label_2.setForeground(Color.RED);
		label_2.setFont(new Font("Lucida Console", Font.BOLD, 13));
		label_2.setBounds(10, 105, 61, 14);
		aluno2.add(label_2);
		
		txtRM_2 = new JTextField();
		txtRM_2.setBounds(66, 21, 86, 20);
		aluno2.add(txtRM_2);
		txtRM_2.setColumns(10);
		
		txtNome_2 = new JTextField();
		txtNome_2.setBounds(66, 58, 86, 20);
		aluno2.add(txtNome_2);
		txtNome_2.setColumns(10);
		
		txtTurma_2 = new JTextField();
		txtTurma_2.setColumns(10);
		txtTurma_2.setBounds(66, 102, 86, 20);
		aluno2.add(txtTurma_2);
		
		JButton btnLimpar_1 = new JButton("Limpar");
		btnLimpar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtRM_2.setText("");
				txtNome_2.setText("");
				txtTurma_2.setText("");
			}
		});
		btnLimpar_1.setFont(new Font("Lucida Console", Font.PLAIN, 10));
		btnLimpar_1.setForeground(Color.RED);
		btnLimpar_1.setBackground(Color.WHITE);
		btnLimpar_1.setBorder(new LineBorder(Color.RED, 2, true));
		btnLimpar_1.setBounds(101, 144, 69, 23);
		aluno2.add(btnLimpar_1);
		
		JPanel aluno3 = new JPanel();
		aluno3.setVisible(false);
		aluno3.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 2, true), "Integrante 3", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 0, 0)));
		aluno3.setBackground(Color.WHITE);
		aluno3.setBounds(462, 157, 180, 178);
		paneEquipe.add(aluno3);
		aluno3.setLayout(null);
		
		JLabel label_3 = new JLabel("RM:");
		label_3.setForeground(Color.RED);
		label_3.setFont(new Font("Lucida Console", Font.BOLD, 13));
		label_3.setBounds(10, 24, 46, 14);
		aluno3.add(label_3);
		
		JLabel label_4 = new JLabel("Nome:");
		label_4.setForeground(Color.RED);
		label_4.setFont(new Font("Lucida Console", Font.BOLD, 13));
		label_4.setBounds(10, 61, 46, 14);
		aluno3.add(label_4);
		
		JLabel label_5 = new JLabel("Turma:");
		label_5.setForeground(Color.RED);
		label_5.setFont(new Font("Lucida Console", Font.BOLD, 13));
		label_5.setBounds(10, 105, 66, 14);
		aluno3.add(label_5);
		
		txtRM_3 = new JTextField();
		txtRM_3.setBounds(66, 21, 86, 20);
		aluno3.add(txtRM_3);
		txtRM_3.setColumns(10);
		
		txtNome_3 = new JTextField();
		txtNome_3.setColumns(10);
		txtNome_3.setBounds(66, 58, 86, 20);
		aluno3.add(txtNome_3);
		
		txtTurma_3 = new JTextField();
		txtTurma_3.setColumns(10);
		txtTurma_3.setBounds(66, 102, 86, 20);
		aluno3.add(txtTurma_3);
		
		JButton btnLimpar_2 = new JButton("Limpar");
		btnLimpar_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtRM_3.setText("");
				txtNome_3.setText("");
				txtTurma_3.setText("");
			}
		});
		btnLimpar_2.setFont(new Font("Lucida Console", Font.PLAIN, 10));
		btnLimpar_2.setForeground(Color.RED);
		btnLimpar_2.setBackground(Color.WHITE);
		btnLimpar_2.setBorder(new LineBorder(Color.RED, 2, true));
		btnLimpar_2.setBounds(104, 144, 66, 23);
		aluno3.add(btnLimpar_2);
		
		JPanel aluno4 = new JPanel();
		aluno4.setVisible(false);
		aluno4.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 2, true), "Integrante 4", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 0, 0)));
		aluno4.setBackground(Color.WHITE);
		aluno4.setBounds(652, 157, 180, 178);
		paneEquipe.add(aluno4);
		aluno4.setLayout(null);
		
		JLabel label_6 = new JLabel("RM:");
		label_6.setForeground(Color.RED);
		label_6.setFont(new Font("Lucida Console", Font.BOLD, 13));
		label_6.setBounds(10, 24, 46, 14);
		aluno4.add(label_6);
		
		JLabel label_7 = new JLabel("Nome:");
		label_7.setForeground(Color.RED);
		label_7.setFont(new Font("Lucida Console", Font.BOLD, 13));
		label_7.setBounds(10, 61, 46, 14);
		aluno4.add(label_7);
		
		JLabel label_8 = new JLabel("Turma:");
		label_8.setForeground(Color.RED);
		label_8.setFont(new Font("Lucida Console", Font.BOLD, 13));
		label_8.setBounds(10, 105, 62, 14);
		aluno4.add(label_8);
		
		txtRM_4 = new JTextField();
		txtRM_4.setBounds(66, 21, 86, 20);
		aluno4.add(txtRM_4);
		txtRM_4.setColumns(10);
		
		txtNome_4 = new JTextField();
		txtNome_4.setColumns(10);
		txtNome_4.setBounds(66, 58, 86, 20);
		aluno4.add(txtNome_4);
		
		txtTurma_4 = new JTextField();
		txtTurma_4.setColumns(10);
		txtTurma_4.setBounds(66, 102, 86, 20);
		aluno4.add(txtTurma_4);
		
		JButton btnLimpar_3 = new JButton("Limpar");
		btnLimpar_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtRM_4.setText("");
				txtNome_4.setText("");
				txtTurma_4.setText("");
			}
		});
		btnLimpar_3.setFont(new Font("Lucida Console", Font.PLAIN, 10));
		btnLimpar_3.setForeground(Color.RED);
		btnLimpar_3.setBackground(Color.WHITE);
		btnLimpar_3.setBorder(new LineBorder(Color.RED, 2, true));
		btnLimpar_3.setBounds(102, 144, 68, 23);
		aluno4.add(btnLimpar_3);
		
		JPanel aluno5 = new JPanel();
		aluno5.setVisible(false);
		aluno5.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 2, true), "Integrante 5", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 0, 0)));
		aluno5.setBackground(Color.WHITE);
		aluno5.setBounds(842, 157, 180, 178);
		paneEquipe.add(aluno5);
		aluno5.setLayout(null);
		
		JLabel label_9 = new JLabel("RM:");
		label_9.setForeground(Color.RED);
		label_9.setFont(new Font("Lucida Console", Font.BOLD, 13));
		label_9.setBounds(10, 24, 46, 14);
		aluno5.add(label_9);
		
		JLabel label_10 = new JLabel("Nome:");
		label_10.setForeground(Color.RED);
		label_10.setFont(new Font("Lucida Console", Font.BOLD, 13));
		label_10.setBounds(10, 61, 46, 14);
		aluno5.add(label_10);
		
		JLabel label_11 = new JLabel("Turma:");
		label_11.setForeground(Color.RED);
		label_11.setFont(new Font("Lucida Console", Font.BOLD, 13));
		label_11.setBounds(10, 105, 61, 14);
		aluno5.add(label_11);
		
		txtRM_5 = new JTextField();
		txtRM_5.setBounds(66, 21, 86, 20);
		aluno5.add(txtRM_5);
		txtRM_5.setColumns(10);
		
		txtNome_5 = new JTextField();
		txtNome_5.setColumns(10);
		txtNome_5.setBounds(66, 58, 86, 20);
		aluno5.add(txtNome_5);
		
		txtTurma_5 = new JTextField();
		txtTurma_5.setColumns(10);
		txtTurma_5.setBounds(66, 102, 86, 20);
		aluno5.add(txtTurma_5);
		
		JButton btnLimpar_4 = new JButton("Limpar");
		btnLimpar_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtRM_5.setText("");
				txtNome_5.setText("");
				txtTurma_5.setText("");
			}
		});
		btnLimpar_4.setFont(new Font("Lucida Console", Font.PLAIN, 10));
		btnLimpar_4.setForeground(Color.RED);
		btnLimpar_4.setBackground(Color.WHITE);
		btnLimpar_4.setBorder(new LineBorder(Color.RED, 2, true));
		btnLimpar_4.setBounds(103, 144, 67, 23);
		aluno5.add(btnLimpar_4);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBorder(new LineBorder(Color.RED, 3, true));
		btnCadastrar.setBackground(Color.WHITE);
		btnCadastrar.setFont(new Font("Lucida Console", Font.BOLD, 13));
		btnCadastrar.setForeground(Color.RED);
		btnCadastrar.setBounds(320, 361, 189, 23);
		paneEquipe.add(btnCadastrar);
		
		JButton btnLimparTodosCampos = new JButton("Limpar Todos Campos");
		btnLimparTodosCampos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNomeEqp.setText("");
				txtRM_1.setText("");
				txtNome_1.setText("");
				txtTurma_1.setText("");
				txtRM_2.setText("");
				txtNome_2.setText("");
				txtTurma_2.setText("");
				txtRM_3.setText("");
				txtNome_3.setText("");
				txtTurma_3.setText("");
				txtRM_4.setText("");
				txtNome_4.setText("");
				txtTurma_4.setText("");
				txtRM_5.setText("");
				txtNome_5.setText("");
				txtTurma_5.setText("");
			}
		});
		btnLimparTodosCampos.setBorder(new LineBorder(Color.RED, 3, true));
		btnLimparTodosCampos.setBackground(Color.WHITE);
		btnLimparTodosCampos.setFont(new Font("Lucida Console", Font.BOLD, 13));
		btnLimparTodosCampos.setForeground(Color.RED);
		btnLimparTodosCampos.setBounds(588, 361, 189, 23);
		paneEquipe.add(btnLimparTodosCampos);
		
		JComboBox qtdInt = new JComboBox();
		qtdInt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			if(qtdInt.getSelectedItem().equals("")){
				aluno1.setVisible(false);
				aluno2.setVisible(false);
				aluno3.setVisible(false);
				aluno4.setVisible(false);
				aluno5.setVisible(false);
			}else if(qtdInt.getSelectedItem().equals("1")){
					aluno1.setVisible(true);
					aluno2.setVisible(false);
					aluno3.setVisible(false);
					aluno4.setVisible(false);
					aluno5.setVisible(false);
				}else if(qtdInt.getSelectedItem().equals("2")){
					aluno1.setVisible(true);
					aluno2.setVisible(true);
					aluno3.setVisible(false);
					aluno4.setVisible(false);
					aluno5.setVisible(false);
				}else if(qtdInt.getSelectedItem().equals("3")){
					aluno1.setVisible(true);
					aluno2.setVisible(true);
					aluno3.setVisible(true);
					aluno4.setVisible(false);
					aluno5.setVisible(false);
				}else if(qtdInt.getSelectedItem().equals("4")){
					aluno1.setVisible(true);
					aluno2.setVisible(true);
					aluno3.setVisible(true);
					aluno4.setVisible(true);
					aluno5.setVisible(false);
				}else{
					aluno1.setVisible(true);
					aluno2.setVisible(true);
					aluno3.setVisible(true);
					aluno4.setVisible(true);
					aluno5.setVisible(true);
				}
			}
		});
		qtdInt.setModel(new DefaultComboBoxModel(new String[] {"", "1", "2", "3", "4", "5"}));
		qtdInt.setBounds(625, 118, 42, 20);
		paneEquipe.add(qtdInt);
		
		JLabel lblQuantidadeDeIntegrantes = new JLabel("Quantidade de Integrantes");
		lblQuantidadeDeIntegrantes.setForeground(Color.RED);
		lblQuantidadeDeIntegrantes.setFont(new Font("Lucida Console", Font.BOLD, 13));
		lblQuantidadeDeIntegrantes.setBounds(376, 121, 239, 14);
		paneEquipe.add(lblQuantidadeDeIntegrantes);
		paneLancamento.setBackground(new Color(0,0,0,0));
		principal.add("Lançamento", paneLancamento);
		principal.add("Pós Lançamento", panePosLancamento);
		panePosLancamento.setBackground(new Color(0,0,0,0));
		frame.getContentPane().add(principal);
		rank.setFont(new Font("Lucida Console", Font.BOLD, 11));
		rank.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 2, true), "Ranking", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 0, 0)));
		rank.setForeground(Color.RED);
		rank.setBackground(Color.WHITE);
		
		
		rank.setBounds(274, 542, 1082, 202);
		altura.setBackground(Color.WHITE);
		rank.add("Altitude", altura);
		altura.setLayout(null);
		scrollPane.setForeground(new Color(102, 255, 102));
		scrollPane.setBackground(new Color(0, 0, 0));
		scrollPane.setFont(new Font("Lucida Console", Font.BOLD, 12));
		scrollPane.setBounds(10, 33, 1045, 110);
		
		altura.add(scrollPane);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setGridColor(Color.DARK_GRAY);
		table.setBackground(Color.WHITE);
		table.setForeground(Color.WHITE);
		table.setFont(new Font("Lucida Console", Font.BOLD, 12));
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, "", null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Posi\u00E7\u00E3o", "Equipe", "Ultimo Lan\u00E7amento", "Data"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(261);
		table.getColumnModel().getColumn(1).setPreferredWidth(260);
		table.getColumnModel().getColumn(2).setPreferredWidth(119);
		lblRankingPorAltitude.setFont(new Font("Lucida Console", Font.BOLD, 15));
		lblRankingPorAltitude.setForeground(Color.RED);
		lblRankingPorAltitude.setBackground(new Color(0, 0, 0));
		lblRankingPorAltitude.setBounds(473, 11, 233, 14);
		
		altura.add(lblRankingPorAltitude);
		velocidade.setBackground(Color.WHITE);
		rank.add("Velocidade", velocidade);
		distancia.setBackground(Color.WHITE);
		rank.add("Distância", distancia);
		frame.getContentPane().add(rank);
		sistema.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 2, true), "Dados do Sistema", TitledBorder.CENTER, TitledBorder.TOP, null, Color.RED));
		sistema.setBackground(Color.WHITE);
		sistema.setBounds(10, 96, 254, 466);
		
		frame.getContentPane().add(sistema);
		sistema.setLayout(null);
		lblHora.setFont(new Font("Lucida Console", Font.BOLD, 13));
		lblHora.setForeground(Color.RED);
		lblHora.setBounds(10, 290, 46, 14);
		
		sistema.add(lblHora);
		lblData.setFont(new Font("Lucida Console", Font.BOLD, 13));
		lblData.setForeground(Color.RED);
		lblData.setBounds(10, 315, 46, 14);
		
		sistema.add(lblData);
		hora.setForeground(Color.RED);
		hora.setBackground(Color.WHITE);
		hora.setFont(new Font("Lucida Console", Font.BOLD, 13));
		hora.setBounds(66, 290, 178, 14);
		
		sistema.add(hora);
		data.setForeground(Color.RED);
		data.setBackground(Color.WHITE);
		data.setFont(new Font("Lucida Console", Font.BOLD, 13));
		data.setBounds(66, 315, 178, 14);
		
		sistema.add(data);
		
		JLabel lblEquipe = new JLabel("Equipe:");
		lblEquipe.setForeground(Color.RED);
		lblEquipe.setFont(new Font("Lucida Console", Font.BOLD, 13));
		lblEquipe.setBounds(10, 216, 63, 14);
		sistema.add(lblEquipe);
		
		JLabel lblPosioGeral = new JLabel("Posi\u00E7\u00E3o Geral:");
		lblPosioGeral.setForeground(Color.RED);
		lblPosioGeral.setFont(new Font("Lucida Console", Font.BOLD, 13));
		lblPosioGeral.setBounds(10, 241, 131, 14);
		sistema.add(lblPosioGeral);
		pesquisa.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 2, true), "Pesquisar Grupo", TitledBorder.CENTER, TitledBorder.TOP, null, Color.RED));
		pesquisa.setBackground(Color.WHITE);
		pesquisa.setBounds(10, 568, 254, 116);
		
		frame.getContentPane().add(pesquisa);
		pesquisa.setLayout(null);
		
		JLabel lblPesquisarGrupoPor = new JLabel("Pesquisar Grupo Por:");
		lblPesquisarGrupoPor.setFont(new Font("Lucida Console", Font.BOLD, 13));
		lblPesquisarGrupoPor.setForeground(Color.RED);
		lblPesquisarGrupoPor.setBackground(Color.WHITE);
		lblPesquisarGrupoPor.setBounds(10, 50, 186, 14);
		pesquisa.add(lblPesquisarGrupoPor);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBorder(new LineBorder(Color.RED, 2, true));
		comboBox.setForeground(Color.RED);
		comboBox.setBackground(Color.WHITE);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"--Selecione--", "Nome", "Integrante"}));
		comboBox.setFont(new Font("Lucida Console", Font.PLAIN, 11));
		comboBox.setBounds(10, 75, 197, 20);
		pesquisa.add(comboBox);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int x = JOptionPane.showConfirmDialog(null, "Você deseja encerrar o aplicativo??");
				if(x == JOptionPane.OK_OPTION){
				 frame.dispose();
				}
			}
		});
		button.setIcon(new ImageIcon(Principal.class.getResource("/images/Logout.png")));
		button.setBounds(1264, 11, 92, 74);
		frame.getContentPane().add(button);
		

	}
}
