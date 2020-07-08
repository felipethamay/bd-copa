package view;

import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaTabelaFinais extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel c1;
	private JLabel d2;
	private JLabel e1;
	private JLabel f2;
	private JLabel g1;
	private JLabel h2;
	private JLabel a1;
	private JLabel b2;
	private JLabel venc49;
	private JLabel venc50;
	private JLabel venc53;
	private JLabel venc54;
	private JLabel venc57;
	private JLabel venc58;
	private JLabel venc61;
	private JLabel venc62;
	private JLabel perd61;
	private JLabel perd62;
	private JLabel venc59;
	private JLabel venc60;
	private JLabel venc51;
	private JLabel venc52;
	private JLabel venc55;
	private JLabel venc56;
	private JLabel b1;
	private JLabel a2;
	private JLabel d1;
	private JLabel c2;
	private JLabel f1;
	private JLabel e2;
	private JLabel h1;
	private JLabel g2;
	private JTextField oi1_1;
	private JTextField oi1_2;
	private JTextField oi2_2;
	private JTextField oi2_1;
	private JTextField oi3_2;
	private JTextField oi3_1;
	private JTextField oi4_2;
	private JTextField oi4_1;
	private JTextField qu2_2;
	private JTextField qu2_1;
	private JTextField qu1_2;
	private JTextField qu1_1;
	private JTextField se1_2;
	private JTextField se1_1;
	private JTextField fi2_2;
	private JTextField fi1_1;
	private JTextField te2_2;
	private JTextField te1_1;
	private JTextField se2_2;
	private JTextField se2_1;
	private JTextField qu3_2;
	private JTextField qu3_1;
	private JTextField qu4_2;
	private JTextField qu4_1;
	private JTextField oi5_2;
	private JTextField oi5_1;
	private JTextField oi6_2;
	private JTextField oi6_1;
	private JTextField oi7_2;
	private JTextField oi7_1;
	private JTextField oi8_2;
	private JTextField oi8_1;
	private JButton btnSalvar;

	public TelaTabelaFinais() {
		setTitle("Grupos");
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("imagens/icone.jpg")));
		initialize();
		this.setLocationRelativeTo(null);
		setResizable(false);
	}

	public void initialize() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1046, 635);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				JOptionPane.showMessageDialog(null, "Salvo com sucesso");
			}
		});
		btnSalvar.setBounds(476, 551, 91, 23);
		contentPane.add(btnSalvar);

		a1 = new JLabel("0");
		a1.setBounds(12, 124, 46, 14);
		contentPane.add(a1);

		b2 = new JLabel("0");
		b2.setBounds(111, 123, 46, 14);
		contentPane.add(b2);

		c1 = new JLabel("0");
		c1.setBounds(12, 293, 46, 14);
		contentPane.add(c1);

		d2 = new JLabel("0");
		d2.setBounds(111, 292, 46, 14);
		contentPane.add(d2);

		e1 = new JLabel("0");
		e1.setBounds(12, 380, 46, 14);
		contentPane.add(e1);

		f2 = new JLabel("0");
		f2.setBounds(111, 379, 46, 14);
		contentPane.add(f2);

		g1 = new JLabel("0");
		g1.setBounds(12, 555, 46, 14);
		contentPane.add(g1);

		h2 = new JLabel("0");
		h2.setBounds(111, 554, 46, 14);
		contentPane.add(h2);

		venc49 = new JLabel("0");
		venc49.setBounds(189, 211, 46, 14);
		contentPane.add(venc49);

		venc50 = new JLabel("0");
		venc50.setBounds(288, 210, 46, 14);
		contentPane.add(venc50);

		venc53 = new JLabel("0");
		venc53.setBounds(189, 474, 46, 14);
		contentPane.add(venc53);

		venc54 = new JLabel("0");
		venc54.setBounds(288, 473, 46, 14);
		contentPane.add(venc54);

		venc57 = new JLabel("0");
		venc57.setBounds(357, 342, 46, 14);
		contentPane.add(venc57);

		venc58 = new JLabel("0");
		venc58.setBounds(456, 341, 46, 14);
		contentPane.add(venc58);

		venc61 = new JLabel("0");
		venc61.setBounds(450, 223, 46, 14);
		contentPane.add(venc61);

		venc62 = new JLabel("0");
		venc62.setBounds(549, 222, 46, 14);
		contentPane.add(venc62);

		perd61 = new JLabel("0");
		perd61.setBounds(450, 468, 46, 14);
		contentPane.add(perd61);

		perd62 = new JLabel("0");
		perd62.setBounds(549, 467, 46, 14);
		contentPane.add(perd62);

		venc59 = new JLabel("0");
		venc59.setBounds(556, 342, 46, 14);
		contentPane.add(venc59);

		venc60 = new JLabel("0");
		venc60.setBounds(655, 341, 46, 14);
		contentPane.add(venc60);

		venc51 = new JLabel("0");
		venc51.setBounds(723, 212, 46, 14);
		contentPane.add(venc51);

		venc52 = new JLabel("0");
		venc52.setBounds(822, 211, 46, 14);
		contentPane.add(venc52);

		venc55 = new JLabel("0");
		venc55.setBounds(723, 475, 46, 14);
		contentPane.add(venc55);

		venc56 = new JLabel("0");
		venc56.setBounds(822, 474, 46, 14);
		contentPane.add(venc56);

		b1 = new JLabel("0");
		b1.setBounds(890, 124, 46, 14);
		contentPane.add(b1);

		a2 = new JLabel("0");
		a2.setBounds(989, 123, 46, 14);
		contentPane.add(a2);

		d1 = new JLabel("0");
		d1.setBounds(890, 294, 46, 14);
		contentPane.add(d1);

		c2 = new JLabel("0");
		c2.setBounds(989, 293, 46, 14);
		contentPane.add(c2);

		f1 = new JLabel("0");
		f1.setBounds(890, 381, 46, 14);
		contentPane.add(f1);

		e2 = new JLabel("0");
		e2.setBounds(989, 380, 46, 14);
		contentPane.add(e2);

		h1 = new JLabel("0");
		h1.setBounds(890, 555, 46, 14);
		contentPane.add(h1);

		g2 = new JLabel("0");
		g2.setBounds(989, 554, 46, 14);
		contentPane.add(g2);

		oi1_1 = new JTextField();
		oi1_1.setBounds(57, 121, 19, 19);
		contentPane.add(oi1_1);
		oi1_1.setColumns(10);

		oi1_2 = new JTextField();
		oi1_2.setColumns(10);
		oi1_2.setBounds(90, 121, 19, 19);
		contentPane.add(oi1_2);

		oi2_1 = new JTextField();
		oi2_1.setColumns(10);
		oi2_1.setBounds(57, 289, 19, 19);
		contentPane.add(oi2_1);

		oi2_2 = new JTextField();
		oi2_2.setColumns(10);
		oi2_2.setBounds(90, 289, 19, 19);
		contentPane.add(oi2_2);

		oi3_1 = new JTextField();
		oi3_1.setColumns(10);
		oi3_1.setBounds(58, 378, 19, 19);
		contentPane.add(oi3_1);

		oi3_2 = new JTextField();
		oi3_2.setColumns(10);
		oi3_2.setBounds(91, 378, 19, 19);
		contentPane.add(oi3_2);

		oi4_1 = new JTextField();
		oi4_1.setColumns(10);
		oi4_1.setBounds(59, 553, 19, 19);
		contentPane.add(oi4_1);

		oi4_2 = new JTextField();
		oi4_2.setColumns(10);
		oi4_2.setBounds(92, 553, 19, 19);
		contentPane.add(oi4_2);

		qu1_1 = new JTextField();
		qu1_1.setColumns(10);
		qu1_1.setBounds(235, 209, 19, 19);
		contentPane.add(qu1_1);

		qu1_2 = new JTextField();
		qu1_2.setColumns(10);
		qu1_2.setBounds(268, 209, 19, 19);
		contentPane.add(qu1_2);

		qu2_1 = new JTextField();
		qu2_1.setColumns(10);
		qu2_1.setBounds(234, 471, 19, 19);
		contentPane.add(qu2_1);

		qu2_2 = new JTextField();
		qu2_2.setColumns(10);
		qu2_2.setBounds(267, 471, 19, 19);
		contentPane.add(qu2_2);

		se1_1 = new JTextField();
		se1_1.setColumns(10);
		se1_1.setBounds(402, 341, 19, 19);
		contentPane.add(se1_1);

		se1_2 = new JTextField();
		se1_2.setColumns(10);
		se1_2.setBounds(435, 341, 19, 19);
		contentPane.add(se1_2);

		fi1_1 = new JTextField();
		fi1_1.setColumns(10);
		fi1_1.setBounds(496, 220, 19, 19);
		contentPane.add(fi1_1);

		fi2_2 = new JTextField();
		fi2_2.setColumns(10);
		fi2_2.setBounds(529, 220, 19, 19);
		contentPane.add(fi2_2);

		te1_1 = new JTextField();
		te1_1.setColumns(10);
		te1_1.setBounds(496, 466, 19, 19);
		contentPane.add(te1_1);

		te2_2 = new JTextField();
		te2_2.setColumns(10);
		te2_2.setBounds(529, 466, 19, 19);
		contentPane.add(te2_2);

		se2_1 = new JTextField();
		se2_1.setColumns(10);
		se2_1.setBounds(599, 341, 19, 19);
		contentPane.add(se2_1);

		se2_2 = new JTextField();
		se2_2.setColumns(10);
		se2_2.setBounds(632, 341, 19, 19);
		contentPane.add(se2_2);

		qu3_1 = new JTextField();
		qu3_1.setColumns(10);
		qu3_1.setBounds(769, 209, 19, 19);
		contentPane.add(qu3_1);

		qu3_2 = new JTextField();
		qu3_2.setColumns(10);
		qu3_2.setBounds(802, 209, 19, 19);
		contentPane.add(qu3_2);

		qu4_1 = new JTextField();
		qu4_1.setColumns(10);
		qu4_1.setBounds(769, 472, 19, 19);
		contentPane.add(qu4_1);

		qu4_2 = new JTextField();
		qu4_2.setColumns(10);
		qu4_2.setBounds(802, 472, 19, 19);
		contentPane.add(qu4_2);

		oi5_1 = new JTextField();
		oi5_1.setColumns(10);
		oi5_1.setBounds(937, 121, 19, 19);
		contentPane.add(oi5_1);

		oi5_2 = new JTextField();
		oi5_2.setColumns(10);
		oi5_2.setBounds(970, 121, 19, 19);
		contentPane.add(oi5_2);

		oi6_1 = new JTextField();
		oi6_1.setColumns(10);
		oi6_1.setBounds(939, 289, 19, 19);
		contentPane.add(oi6_1);

		oi6_2 = new JTextField();
		oi6_2.setColumns(10);
		oi6_2.setBounds(972, 289, 19, 19);
		contentPane.add(oi6_2);

		oi7_1 = new JTextField();
		oi7_1.setColumns(10);
		oi7_1.setBounds(938, 378, 19, 19);
		contentPane.add(oi7_1);

		oi7_2 = new JTextField();
		oi7_2.setColumns(10);
		oi7_2.setBounds(971, 378, 19, 19);
		contentPane.add(oi7_2);

		oi8_1 = new JTextField();
		oi8_1.setColumns(10);
		oi8_1.setBounds(938, 552, 19, 19);
		contentPane.add(oi8_1);

		oi8_2 = new JTextField();
		oi8_2.setColumns(10);
		oi8_2.setBounds(971, 552, 19, 19);
		contentPane.add(oi8_2);

		JLabel UEPB = new JLabel("image");
		UEPB.setBounds(0, 0, 1043, 607);
		UEPB.setIcon(new ImageIcon(getClass().getResource("imagens/finais.png")));
		contentPane.add(UEPB);

	}

}
