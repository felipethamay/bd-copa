package view;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class TelaInicial extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	TelaInicial inicio;

	public static void main(String[] args) {
		TelaInicial frame = new TelaInicial();
		frame.setVisible(true);
	}

	public TelaInicial() {
		setTitle("Copa 2014");
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("imagens/icone.jpg")));
		initialize();
		this.setLocationRelativeTo(null);
		setResizable(false);
		this.dispose();
	}

	public void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 643, 687);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel logo = new JLabel("");
		logo.setBounds(0, 0, 650, 650);
		logo.setIcon(new ImageIcon(getClass().getResource("imagens/copabrasil.jpg")));
		contentPane.add(logo);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnArquivo = new JMenu("Arquivo");
		menuBar.add(mnArquivo);

		JMenu mnConsultar = new JMenu("Consultar");
		menuBar.add(mnConsultar);

		JMenuItem mntmGrupos = new JMenuItem("Grupos");
		mnConsultar.add(mntmGrupos);
		mntmGrupos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaTabelaGeral ttg = new TelaTabelaGeral();
				ttg.setVisible(true);
			}
		});

		JMenuItem mntmEliminatorias = new JMenuItem("Eliminatorias");
		mnConsultar.add(mntmEliminatorias);
		mntmEliminatorias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaTabelaFinais ttf = new TelaTabelaFinais();
				ttf.setVisible(true);
			}
		});

		JMenu mnAjuda = new JMenu("Ajuda");
		menuBar.add(mnAjuda);

		JMenuItem mntmSobre = new JMenuItem("Sobre");
		mntmSobre.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				TelaCreditos tc = new TelaCreditos();
				tc.setVisible(true);

			}

		});
		mnAjuda.add(mntmSobre);
		getContentPane().setLayout(null);
	}
}
