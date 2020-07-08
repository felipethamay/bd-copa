package view;

import java.util.List;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

import java.awt.Color;

import javax.swing.JButton;

import model.Jogo;
import control.ControleJogo;
import persistence.Persistence;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaTabelaGeral extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textA1_1;
	private JTextField textA1_2;
	private JTextField textA2_1;
	private JTextField textA2_2;
	private JTextField textA3_1;
	private JTextField textA3_2;
	private JTextField textA4_1;
	private JTextField textA4_2;
	private JTextField textA5_1;
	private JTextField textA5_2;
	private JTextField textA6_1;
	private JTextField textA6_2;
	private JTextField textB1_1;
	private JTextField textB1_2;
	private JTextField textB2_1;
	private JTextField textB2_2;
	private JTextField textB3_1;
	private JTextField textB3_2;
	private JTextField textB4_1;
	private JTextField textB4_2;
	private JTextField textB5_1;
	private JTextField textB5_2;
	private JTextField textB6_1;
	private JTextField textB6_2;
	private JTextField textC1_1;
	private JTextField textC1_2;
	private JTextField textC2_1;
	private JTextField textC2_2;
	private JTextField textC3_1;
	private JTextField textC3_2;
	private JTextField textC4_1;
	private JTextField textC4_2;
	private JTextField textC5_1;
	private JTextField textC5_2;
	private JTextField textC6_1;
	private JTextField textC6_2;
	private JTextField textD1_1;
	private JTextField textD1_2;
	private JTextField textD2_1;
	private JTextField textD2_2;
	private JTextField textD3_1;
	private JTextField textD3_2;
	private JTextField textD4_1;
	private JTextField textD4_2;
	private JTextField textD5_1;
	private JTextField textD5_2;
	private JTextField textD6_1;
	private JTextField textD6_2;
	private JTextField textE1_1;
	private JTextField textE1_2;
	private JTextField textE2_1;
	private JTextField textE2_2;
	private JTextField textE3_1;
	private JTextField textE3_2;
	private JTextField textE4_1;
	private JTextField textE4_2;
	private JTextField textE5_1;
	private JTextField textE5_2;
	private JTextField textE6_1;
	private JTextField textE6_2;
	private JTextField textF1_1;
	private JTextField textF1_2;
	private JTextField textF2_1;
	private JTextField textF2_2;
	private JTextField textF3_1;
	private JTextField textF3_2;
	private JTextField textF4_1;
	private JTextField textF4_2;
	private JTextField textF5_1;
	private JTextField textF5_2;
	private JTextField textF6_1;
	private JTextField textF6_2;
	private JTextField textG1_1;
	private JTextField textG1_2;
	private JTextField textG2_1;
	private JTextField textG2_2;
	private JTextField textG3_1;
	private JTextField textG3_2;
	private JTextField textG4_1;
	private JTextField textG4_2;
	private JTextField textG5_1;
	private JTextField textG5_2;
	private JTextField textG6_1;
	private JTextField textG6_2;
	private JTextField textH1_1;
	private JTextField textH1_2;
	private JTextField textH2_1;
	private JTextField textH2_2;
	private JTextField textH3_1;
	private JTextField textH3_2;
	private JTextField textH4_1;
	private JTextField textH4_2;
	private JTextField textH5_1;
	private JTextField textH5_2;
	private JTextField textH6_1;
	private JTextField textH6_2;

	private JLabel brasilp;
	private JLabel brasilj;
	private JLabel brasilv;
	private JLabel brasile;
	private JLabel brasild;
	private JLabel brasilgp;
	private JLabel brasilgc;
	private JLabel brasilsg;
	private JLabel mexicop;
	private JLabel mexicoj;
	private JLabel mexicov;
	private JLabel mexicoe;
	private JLabel mexicod;
	private JLabel mexicogp;
	private JLabel mexicogc;
	private JLabel mexicosg;
	private JLabel croaciap;
	private JLabel croaciaj;
	private JLabel croaciav;
	private JLabel croaciae;
	private JLabel croaciad;
	private JLabel croaciagp;
	private JLabel croaciagc;
	private JLabel croaciasg;
	private JLabel camaroesp;
	private JLabel camaroesj;
	private JLabel camaroesv;
	private JLabel camaroese;
	private JLabel camaroesd;
	private JLabel camaroesgp;
	private JLabel camaroesgc;
	private JLabel camaroessg;
	private JLabel australiap;
	private JLabel australiaj;
	private JLabel australiav;
	private JLabel australiae;
	private JLabel australiad;
	private JLabel australiagp;
	private JLabel australiagc;
	private JLabel australiasg;
	private JLabel chilep;
	private JLabel chilej;
	private JLabel chilev;
	private JLabel chilee;
	private JLabel chiled;
	private JLabel chilegp;
	private JLabel chilegc;
	private JLabel chilesg;
	private JLabel espanhap;
	private JLabel espanhaj;
	private JLabel espanhav;
	private JLabel espanhae;
	private JLabel espanhad;
	private JLabel espanhagp;
	private JLabel espanhagc;
	private JLabel espanhasg;
	private JLabel holandap;
	private JLabel holandaj;
	private JLabel holandav;
	private JLabel holandae;
	private JLabel holandad;
	private JLabel holandagp;
	private JLabel holandagc;
	private JLabel holandasg;
	private JLabel colombiap;
	private JLabel colombiaj;
	private JLabel colombiav;
	private JLabel colombiae;
	private JLabel colombiad;
	private JLabel colombiagp;
	private JLabel colombiagc;
	private JLabel colombiasg;
	private JLabel cmarfimp;
	private JLabel cmarfimj;
	private JLabel cmarfimv;
	private JLabel cmarfime;
	private JLabel cmarfimd;
	private JLabel cmarfimgp;
	private JLabel cmarfimgc;
	private JLabel cmarfimsg;
	private JLabel greciap;
	private JLabel greciaj;
	private JLabel greciav;
	private JLabel greciae;
	private JLabel greciad;
	private JLabel greciagp;
	private JLabel greciagc;
	private JLabel greciasg;
	private JLabel japaop;
	private JLabel japaoj;
	private JLabel japaov;
	private JLabel japaoe;
	private JLabel japaod;
	private JLabel japaogp;
	private JLabel japaogc;
	private JLabel japaosg;
	private JLabel costaricap;
	private JLabel costaricaj;
	private JLabel costaricav;
	private JLabel costaricae;
	private JLabel costaricad;
	private JLabel costaricagp;
	private JLabel costaricagc;
	private JLabel costaricasg;
	private JLabel inglaterrap;
	private JLabel inglaterraj;
	private JLabel inglaterrav;
	private JLabel inglaterrae;
	private JLabel inglaterrad;
	private JLabel inglaterragp;
	private JLabel inglaterragc;
	private JLabel inglaterrasg;
	private JLabel italiap;
	private JLabel italiaj;
	private JLabel italiav;
	private JLabel italiae;
	private JLabel italiad;
	private JLabel italiagp;
	private JLabel italiagc;
	private JLabel italiasg;
	private JLabel uruguaip;
	private JLabel uruguaij;
	private JLabel uruguaiv;
	private JLabel uruguaie;
	private JLabel uruguaid;
	private JLabel uruguaigp;
	private JLabel uruguaigc;
	private JLabel uruguaisg;
	private JLabel equadorp;
	private JLabel equadorj;
	private JLabel equadorv;
	private JLabel equadore;
	private JLabel equadord;
	private JLabel equadorgp;
	private JLabel equadorgc;
	private JLabel equadorsg;
	private JLabel francap;
	private JLabel francaj;
	private JLabel francav;
	private JLabel francae;
	private JLabel francad;
	private JLabel francagp;
	private JLabel francagc;
	private JLabel francasg;
	private JLabel hondurasp;
	private JLabel hondurasj;
	private JLabel hondurasv;
	private JLabel hondurase;
	private JLabel hondurasd;
	private JLabel hondurasgp;
	private JLabel hondurasgc;
	private JLabel hondurassg;
	private JLabel suicap;
	private JLabel suicaj;
	private JLabel suicav;
	private JLabel suicae;
	private JLabel suicad;
	private JLabel suicagp;
	private JLabel suicagc;
	private JLabel suicasg;
	private JLabel argentinap;
	private JLabel argentinaj;
	private JLabel argentinav;
	private JLabel argentinae;
	private JLabel argentinad;
	private JLabel argentinagp;
	private JLabel argentinagc;
	private JLabel argentinasg;
	private JLabel bosniap;
	private JLabel bosniaj;
	private JLabel bosniav;
	private JLabel bosniae;
	private JLabel bosniad;
	private JLabel bosniagp;
	private JLabel bosniagc;
	private JLabel bosniasg;
	private JLabel irap;
	private JLabel iraj;
	private JLabel irav;
	private JLabel irae;
	private JLabel irad;
	private JLabel iragp;
	private JLabel iragc;
	private JLabel irasg;
	private JLabel nigeriap;
	private JLabel nigeriaj;
	private JLabel nigeriav;
	private JLabel nigeriae;
	private JLabel nigeriad;
	private JLabel nigeriagp;
	private JLabel nigeriagc;
	private JLabel nigeriasg;
	private JLabel alemanhap;
	private JLabel alemanhaj;
	private JLabel alemanhav;
	private JLabel alemanhae;
	private JLabel alemanhad;
	private JLabel alemanhagp;
	private JLabel alemanhagc;
	private JLabel alemanhasg;
	private JLabel euap;
	private JLabel euaj;
	private JLabel euav;
	private JLabel euae;
	private JLabel euad;
	private JLabel euagp;
	private JLabel euagc;
	private JLabel euasg;
	private JLabel ganap;
	private JLabel ganaj;
	private JLabel ganav;
	private JLabel ganae;
	private JLabel ganad;
	private JLabel ganagp;
	private JLabel ganagc;
	private JLabel ganasg;
	private JLabel portugalp;
	private JLabel portugalj;
	private JLabel portugalv;
	private JLabel portugale;
	private JLabel portugald;
	private JLabel portugalgp;
	private JLabel portugalgc;
	private JLabel portugalsg;
	private JLabel argeliap;
	private JLabel argeliaj;
	private JLabel argeliav;
	private JLabel argeliae;
	private JLabel argeliad;
	private JLabel argeliagp;
	private JLabel argeliagc;
	private JLabel argeliasg;
	private JLabel belgicap;
	private JLabel belgicaj;
	private JLabel belgicav;
	private JLabel belgicae;
	private JLabel belgicad;
	private JLabel belgicagp;
	private JLabel belgicagc;
	private JLabel belgicasg;
	private JLabel cdosulp;
	private JLabel cdosulj;
	private JLabel cdosulv;
	private JLabel cdosule;
	private JLabel cdosuld;
	private JLabel cdosulgp;
	private JLabel cdosulgc;
	private JLabel cdosulsg;
	private JLabel russiap;
	private JLabel russiaj;
	private JLabel russiav;
	private JLabel russiae;
	private JLabel russiad;
	private JLabel russiagp;
	private JLabel russiagc;
	private JLabel russiasg;

	public TelaTabelaGeral() {
		setTitle("Grupos");
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("imagens/icone.jpg")));
		initialize();
		this.setLocationRelativeTo(null);
		setResizable(false);
		this.preencheTabela();
	}

	public void initialize() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1179, 661);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(60, 179, 113));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				List<Jogo> jogos = Persistence.listJogo();

				brasilp.setText("0");
				brasilj.setText("0");
				brasilv.setText("0");
				brasile.setText("0");
				brasild.setText("0");
				brasilgp.setText("0");
				brasilgc.setText("0");
				brasilsg.setText("0");
				mexicop.setText("0");
				mexicoj.setText("0");
				mexicov.setText("0");
				mexicoe.setText("0");
				mexicod.setText("0");
				mexicogp.setText("0");
				mexicogc.setText("0");
				mexicosg.setText("0");
				croaciap.setText("0");
				croaciaj.setText("0");
				croaciav.setText("0");
				croaciae.setText("0");
				croaciad.setText("0");
				croaciagp.setText("0");
				croaciagc.setText("0");
				croaciasg.setText("0");
				camaroesp.setText("0");
				camaroesj.setText("0");
				camaroesv.setText("0");
				camaroese.setText("0");
				camaroesd.setText("0");
				camaroesgp.setText("0");
				camaroesgc.setText("0");
				camaroessg.setText("0");
				australiap.setText("0");
				australiaj.setText("0");
				australiav.setText("0");
				australiae.setText("0");
				australiad.setText("0");
				australiagp.setText("0");
				australiagc.setText("0");
				australiasg.setText("0");
				chilep.setText("0");
				chilej.setText("0");
				chilev.setText("0");
				chilee.setText("0");
				chiled.setText("0");
				chilegp.setText("0");
				chilegc.setText("0");
				chilesg.setText("0");
				espanhap.setText("0");
				espanhaj.setText("0");
				espanhav.setText("0");
				espanhae.setText("0");
				espanhad.setText("0");
				espanhagp.setText("0");
				espanhagc.setText("0");
				espanhasg.setText("0");
				holandap.setText("0");
				holandaj.setText("0");
				holandav.setText("0");
				holandae.setText("0");
				holandad.setText("0");
				holandagp.setText("0");
				holandagc.setText("0");
				holandasg.setText("0");
				colombiap.setText("0");
				colombiaj.setText("0");
				colombiav.setText("0");
				colombiae.setText("0");
				colombiad.setText("0");
				colombiagp.setText("0");
				colombiagc.setText("0");
				colombiasg.setText("0");
				cmarfimp.setText("0");
				cmarfimj.setText("0");
				cmarfimv.setText("0");
				cmarfime.setText("0");
				cmarfimd.setText("0");
				cmarfimgp.setText("0");
				cmarfimgc.setText("0");
				cmarfimsg.setText("0");
				greciap.setText("0");
				greciaj.setText("0");
				greciav.setText("0");
				greciae.setText("0");
				greciad.setText("0");
				greciagp.setText("0");
				greciagc.setText("0");
				greciasg.setText("0");
				japaop.setText("0");
				japaoj.setText("0");
				japaov.setText("0");
				japaoe.setText("0");
				japaod.setText("0");
				japaogp.setText("0");
				japaogc.setText("0");
				japaosg.setText("0");
				costaricap.setText("0");
				costaricaj.setText("0");
				costaricav.setText("0");
				costaricae.setText("0");
				costaricad.setText("0");
				costaricagp.setText("0");
				costaricagc.setText("0");
				costaricasg.setText("0");
				inglaterrap.setText("0");
				inglaterraj.setText("0");
				inglaterrav.setText("0");
				inglaterrae.setText("0");
				inglaterrad.setText("0");
				inglaterragp.setText("0");
				inglaterragc.setText("0");
				inglaterrasg.setText("0");
				italiap.setText("0");
				italiaj.setText("0");
				italiav.setText("0");
				italiae.setText("0");
				italiad.setText("0");
				italiagp.setText("0");
				italiagc.setText("0");
				italiasg.setText("0");
				uruguaip.setText("0");
				uruguaij.setText("0");
				uruguaiv.setText("0");
				uruguaie.setText("0");
				uruguaid.setText("0");
				uruguaigp.setText("0");
				uruguaigc.setText("0");
				uruguaisg.setText("0");
				equadorp.setText("0");
				equadorj.setText("0");
				equadorv.setText("0");
				equadore.setText("0");
				equadord.setText("0");
				equadorgp.setText("0");
				equadorgc.setText("0");
				equadorsg.setText("0");
				francap.setText("0");
				francaj.setText("0");
				francav.setText("0");
				francae.setText("0");
				francad.setText("0");
				francagp.setText("0");
				francagc.setText("0");
				francasg.setText("0");
				hondurasp.setText("0");
				hondurasj.setText("0");
				hondurasv.setText("0");
				hondurase.setText("0");
				hondurasd.setText("0");
				hondurasgp.setText("0");
				hondurasgc.setText("0");
				hondurassg.setText("0");
				suicap.setText("0");
				suicaj.setText("0");
				suicav.setText("0");
				suicae.setText("0");
				suicad.setText("0");
				suicagp.setText("0");
				suicagc.setText("0");
				suicasg.setText("0");
				argentinap.setText("0");
				argentinaj.setText("0");
				argentinav.setText("0");
				argentinae.setText("0");
				argentinad.setText("0");
				argentinagp.setText("0");
				argentinagc.setText("0");
				argentinasg.setText("0");
				bosniap.setText("0");
				bosniaj.setText("0");
				bosniav.setText("0");
				bosniae.setText("0");
				bosniad.setText("0");
				bosniagp.setText("0");
				bosniagc.setText("0");
				bosniasg.setText("0");
				irap.setText("0");
				iraj.setText("0");
				irav.setText("0");
				irae.setText("0");
				irad.setText("0");
				iragp.setText("0");
				iragc.setText("0");
				irasg.setText("0");
				nigeriap.setText("0");
				nigeriaj.setText("0");
				nigeriav.setText("0");
				nigeriae.setText("0");
				nigeriad.setText("0");
				nigeriagp.setText("0");
				nigeriagc.setText("0");
				nigeriasg.setText("0");
				alemanhap.setText("0");
				alemanhaj.setText("0");
				alemanhav.setText("0");
				alemanhae.setText("0");
				alemanhad.setText("0");
				alemanhagp.setText("0");
				alemanhagc.setText("0");
				alemanhasg.setText("0");
				euap.setText("0");
				euaj.setText("0");
				euav.setText("0");
				euae.setText("0");
				euad.setText("0");
				euagp.setText("0");
				euagc.setText("0");
				euasg.setText("0");
				ganap.setText("0");
				ganaj.setText("0");
				ganav.setText("0");
				ganae.setText("0");
				ganad.setText("0");
				ganagp.setText("0");
				ganagc.setText("0");
				ganasg.setText("0");
				portugalp.setText("0");
				portugalj.setText("0");
				portugalv.setText("0");
				portugale.setText("0");
				portugald.setText("0");
				portugalgp.setText("0");
				portugalgc.setText("0");
				portugalsg.setText("0");
				argeliap.setText("0");
				argeliaj.setText("0");
				argeliav.setText("0");
				argeliae.setText("0");
				argeliad.setText("0");
				argeliagp.setText("0");
				argeliagc.setText("0");
				argeliasg.setText("0");
				belgicap.setText("0");
				belgicaj.setText("0");
				belgicav.setText("0");
				belgicae.setText("0");
				belgicad.setText("0");
				belgicagp.setText("0");
				belgicagc.setText("0");
				belgicasg.setText("0");
				cdosulp.setText("0");
				cdosulj.setText("0");
				cdosulv.setText("0");
				cdosule.setText("0");
				cdosuld.setText("0");
				cdosulgp.setText("0");
				cdosulgc.setText("0");
				cdosulsg.setText("0");
				russiap.setText("0");
				russiaj.setText("0");
				russiav.setText("0");
				russiae.setText("0");
				russiad.setText("0");
				russiagp.setText("0");
				russiagc.setText("0");
				russiasg.setText("0");

				/*
				 * GRUPO A
				 */

				// Brasil x croacia

				if (!(textA1_1.getText().isEmpty() && textA1_2.getText().isEmpty())) {
					brasilj.setText(Integer.toString(Integer.parseInt(brasilj.getText()) + 1));
					croaciaj.setText(Integer.toString(Integer.parseInt(croaciaj.getText()) + 1));

					brasilgp.setText(Integer
							.toString(Integer.parseInt(brasilgp.getText()) + (Integer.parseInt(textA1_1.getText()))));
					croaciagp.setText(Integer
							.toString(Integer.parseInt(croaciagp.getText()) + (Integer.parseInt(textA1_2.getText()))));

					brasilgc.setText(Integer
							.toString(Integer.parseInt(brasilgc.getText()) + (Integer.parseInt(textA1_2.getText()))));
					croaciagc.setText(Integer
							.toString(Integer.parseInt(croaciagc.getText()) + (Integer.parseInt(textA1_1.getText()))));

					brasilsg.setText(Integer
							.toString(Integer.parseInt(brasilgp.getText()) - (Integer.parseInt(brasilgc.getText()))));
					croaciasg.setText(Integer
							.toString(Integer.parseInt(croaciagp.getText()) - (Integer.parseInt(croaciagc.getText()))));

					if (Integer.parseInt(textA1_1.getText()) > Integer.parseInt(textA1_2.getText())) {
						brasilv.setText(Integer.toString(Integer.parseInt(brasilv.getText()) + 1));
						croaciad.setText(Integer.toString(Integer.parseInt(croaciad.getText()) + 1));
						brasilp.setText(Integer.toString(Integer.parseInt(brasilp.getText()) + 3));
					} else if (Integer.parseInt(textA1_2.getText()) > Integer.parseInt(textA1_1.getText())) {
						brasild.setText(Integer.toString(Integer.parseInt(brasild.getText()) + 1));
						croaciap.setText(Integer.toString(Integer.parseInt(croaciap.getText()) + 3));
						croaciav.setText(Integer.toString(Integer.parseInt(croaciav.getText()) + 1));
					} else {
						brasile.setText(Integer.toString(Integer.parseInt(brasile.getText()) + 1));
						croaciae.setText(Integer.toString(Integer.parseInt(croaciae.getText()) + 1));
						croaciap.setText(Integer.toString(Integer.parseInt(croaciap.getText()) + 1));
						brasilp.setText(Integer.toString(Integer.parseInt(brasilp.getText()) + 1));
					}

					Jogo jogo1 = ControleJogo.criaJogo("Brasil", Integer.parseInt(textA1_1.getText()), "Croacia",
							Integer.parseInt(textA1_2.getText()));
					if (!jogos.contains(jogo1)) {
						Persistence.save(jogo1);
					}
				}

				// Mexico x camaroes
				if (!textA2_1.getText().isEmpty() && !textA2_2.getText().isEmpty()) {
					mexicoj.setText(Integer.toString(Integer.parseInt(mexicoj.getText()) + 1));
					camaroesj.setText(Integer.toString(Integer.parseInt(camaroesj.getText()) + 1));

					mexicogp.setText(Integer
							.toString(Integer.parseInt(mexicogp.getText()) + (Integer.parseInt(textA2_1.getText()))));
					camaroesgp.setText(Integer
							.toString(Integer.parseInt(camaroesgp.getText()) + (Integer.parseInt(textA2_2.getText()))));

					mexicogc.setText(Integer
							.toString(Integer.parseInt(mexicogc.getText()) + (Integer.parseInt(textA2_2.getText()))));
					camaroesgc.setText(Integer
							.toString(Integer.parseInt(camaroesgc.getText()) + (Integer.parseInt(textA2_1.getText()))));

					mexicosg.setText(Integer
							.toString(Integer.parseInt(mexicogp.getText()) - (Integer.parseInt(mexicogc.getText()))));
					camaroessg.setText(Integer.toString(
							Integer.parseInt(camaroesgp.getText()) - (Integer.parseInt(camaroesgc.getText()))));

					if (Integer.parseInt(textA2_1.getText()) > Integer.parseInt(textA2_2.getText())) {
						mexicov.setText(Integer.toString(Integer.parseInt(mexicov.getText()) + 1));
						mexicop.setText(Integer.toString(Integer.parseInt(mexicop.getText()) + 3));
						camaroesd.setText(Integer.toString(Integer.parseInt(camaroesd.getText()) + 1));
					} else if (Integer.parseInt(textA2_2.getText()) > Integer.parseInt(textA2_1.getText())) {
						mexicod.setText(Integer.toString(Integer.parseInt(mexicod.getText()) + 1));
						camaroesv.setText(Integer.toString(Integer.parseInt(camaroesv.getText()) + 1));
						camaroesp.setText(Integer.toString(Integer.parseInt(camaroesp.getText()) + 3));
					} else {
						mexicoe.setText(Integer.toString(Integer.parseInt(mexicoe.getText()) + 1));
						camaroese.setText(Integer.toString(Integer.parseInt(camaroese.getText()) + 1));
						camaroesp.setText(Integer.toString(Integer.parseInt(camaroesp.getText()) + 1));
						mexicop.setText(Integer.toString(Integer.parseInt(mexicop.getText()) + 1));
					}

					Jogo jogo2 = ControleJogo.criaJogo("Mexico", Integer.parseInt(textA2_1.getText()), "Camaroes",
							Integer.parseInt(textA2_2.getText()));
					if (!jogos.contains(jogo2)) {
						Persistence.save(jogo2);
					}
				}

				// Brasil x mexico
				if (!textA3_1.getText().isEmpty() && !textA3_2.getText().isEmpty()) {
					brasilj.setText(Integer.toString(Integer.parseInt(brasilj.getText()) + 1));
					mexicoj.setText(Integer.toString(Integer.parseInt(mexicoj.getText()) + 1));

					brasilgp.setText(Integer
							.toString((Integer.parseInt(brasilgp.getText())) + (Integer.parseInt(textA3_1.getText()))));
					mexicogp.setText(Integer
							.toString((Integer.parseInt(mexicogp.getText())) + (Integer.parseInt(textA3_2.getText()))));

					brasilgc.setText(Integer
							.toString((Integer.parseInt(brasilgc.getText())) + (Integer.parseInt(textA3_2.getText()))));
					mexicogc.setText(Integer
							.toString((Integer.parseInt(mexicogc.getText())) + (Integer.parseInt(textA3_1.getText()))));

					brasilsg.setText(Integer
							.toString((Integer.parseInt(brasilgp.getText())) - (Integer.parseInt(brasilgc.getText()))));
					mexicosg.setText(Integer
							.toString((Integer.parseInt(mexicogp.getText())) - (Integer.parseInt(mexicogc.getText()))));

					if (Integer.parseInt(textA3_1.getText()) > Integer.parseInt(textA3_2.getText())) {
						brasilv.setText(Integer.toString(Integer.parseInt(brasilv.getText()) + 1));
						mexicod.setText(Integer.toString(Integer.parseInt(mexicod.getText()) + 1));
						brasilp.setText(Integer.toString(Integer.parseInt(brasilp.getText()) + 3));
					} else if (Integer.parseInt(textA3_2.getText()) > Integer.parseInt(textA3_1.getText())) {
						brasild.setText(Integer.toString(Integer.parseInt(brasild.getText()) + 1));
						mexicop.setText(Integer.toString(Integer.parseInt(mexicop.getText()) + 3));
						mexicov.setText(Integer.toString(Integer.parseInt(mexicov.getText()) + 1));
					} else {
						brasile.setText(Integer.toString(Integer.parseInt(brasile.getText()) + 1));
						mexicoe.setText(Integer.toString(Integer.parseInt(mexicoe.getText()) + 1));
						mexicop.setText(Integer.toString(Integer.parseInt(mexicop.getText()) + 1));
						brasilp.setText(Integer.toString(Integer.parseInt(brasilp.getText()) + 1));
					}

					Jogo jogo3 = ControleJogo.criaJogo("Brasil", Integer.parseInt(textA3_1.getText()), "Mexico",
							Integer.parseInt(textA3_2.getText()));
					if (!jogos.contains(jogo3)) {
						Persistence.save(jogo3);
					}
				}

				// Camaroes x Croacia

				if (!textA4_1.getText().isEmpty() && !textA4_2.getText().isEmpty()) {
					camaroesj.setText(Integer.toString(Integer.parseInt(camaroesj.getText()) + 1));
					croaciaj.setText(Integer.toString(Integer.parseInt(croaciaj.getText()) + 1));

					camaroesgp.setText(Integer
							.toString(Integer.parseInt(camaroesgp.getText()) + (Integer.parseInt(textA4_1.getText()))));
					croaciagp.setText(Integer
							.toString(Integer.parseInt(croaciagp.getText()) + (Integer.parseInt(textA4_2.getText()))));

					camaroesgc.setText(Integer
							.toString(Integer.parseInt(camaroesgc.getText()) + (Integer.parseInt(textA4_2.getText()))));
					croaciagc.setText(Integer
							.toString(Integer.parseInt(croaciagc.getText()) + (Integer.parseInt(textA4_1.getText()))));

					camaroessg.setText(Integer.toString(
							Integer.parseInt(camaroesgp.getText()) - (Integer.parseInt(camaroesgc.getText()))));
					croaciasg.setText(Integer
							.toString(Integer.parseInt(croaciagp.getText()) - (Integer.parseInt(croaciagc.getText()))));

					if (Integer.parseInt(textA4_1.getText()) > Integer.parseInt(textA4_2.getText())) {
						camaroesv.setText(Integer.toString(Integer.parseInt(camaroesv.getText()) + 1));
						croaciad.setText(Integer.toString(Integer.parseInt(croaciad.getText()) + 1));
						camaroesp.setText(Integer.toString(Integer.parseInt(camaroesp.getText()) + 3));
					} else if (Integer.parseInt(textA4_2.getText()) > Integer.parseInt(textA4_1.getText())) {
						camaroesd.setText(Integer.toString(Integer.parseInt(camaroesd.getText()) + 1));
						croaciap.setText(Integer.toString(Integer.parseInt(croaciap.getText()) + 3));
						croaciav.setText(Integer.toString(Integer.parseInt(croaciav.getText()) + 1));
					} else {
						camaroese.setText(Integer.toString(Integer.parseInt(camaroese.getText()) + 1));
						croaciae.setText(Integer.toString(Integer.parseInt(croaciae.getText()) + 1));
						croaciap.setText(Integer.toString(Integer.parseInt(croaciap.getText()) + 1));
						camaroesp.setText(Integer.toString(Integer.parseInt(camaroesp.getText()) + 1));
					}

					Jogo jogo4 = ControleJogo.criaJogo("Camaroes", Integer.parseInt(textA4_1.getText()), "Croacia",
							Integer.parseInt(textA4_2.getText()));
					if (!jogos.contains(jogo4)) {
						Persistence.save(jogo4);
					}
				}

				// Camaroes x Brasil

				if (!textA5_1.getText().isEmpty() && !textA5_2.getText().isEmpty()) {
					camaroesj.setText(Integer.toString(Integer.parseInt(camaroesj.getText()) + 1));
					brasilj.setText(Integer.toString(Integer.parseInt(brasilj.getText()) + 1));

					camaroesgp.setText(Integer
							.toString(Integer.parseInt(camaroesgp.getText()) + (Integer.parseInt(textA5_1.getText()))));
					brasilgp.setText(Integer
							.toString(Integer.parseInt(brasilgp.getText()) + (Integer.parseInt(textA5_2.getText()))));

					camaroesgc.setText(Integer
							.toString(Integer.parseInt(camaroesgc.getText()) + (Integer.parseInt(textA5_2.getText()))));
					brasilgc.setText(Integer
							.toString(Integer.parseInt(brasilgc.getText()) + (Integer.parseInt(textA5_1.getText()))));

					camaroessg.setText(Integer.toString(
							Integer.parseInt(camaroesgp.getText()) - (Integer.parseInt(camaroesgc.getText()))));
					brasilsg.setText(Integer
							.toString(Integer.parseInt(brasilgp.getText()) - (Integer.parseInt(brasilgc.getText()))));

					if (Integer.parseInt(textA5_1.getText()) > Integer.parseInt(textA5_2.getText())) {
						camaroesv.setText(Integer.toString(Integer.parseInt(camaroesv.getText()) + 1));
						brasild.setText(Integer.toString(Integer.parseInt(brasild.getText()) + 1));
						camaroesp.setText(Integer.toString(Integer.parseInt(camaroesp.getText()) + 3));
					} else if (Integer.parseInt(textA5_2.getText()) > Integer.parseInt(textA5_1.getText())) {
						camaroesd.setText(Integer.toString(Integer.parseInt(camaroesd.getText()) + 1));
						brasilp.setText(Integer.toString(Integer.parseInt(brasilp.getText()) + 3));
						brasilv.setText(Integer.toString(Integer.parseInt(brasilv.getText()) + 1));
					} else {
						camaroese.setText(Integer.toString(Integer.parseInt(camaroese.getText()) + 1));
						brasile.setText(Integer.toString(Integer.parseInt(brasile.getText()) + 1));
						brasilp.setText(Integer.toString(Integer.parseInt(brasilp.getText()) + 1));
						camaroesp.setText(Integer.toString(Integer.parseInt(camaroesp.getText()) + 1));
					}

					Jogo jogo5 = ControleJogo.criaJogo("Camaroes", Integer.parseInt(textA5_1.getText()), "Brasil",
							Integer.parseInt(textA5_2.getText()));
					if (!jogos.contains(jogo5)) {
						Persistence.save(jogo5);
					}
				}

				// Croacia x Mexico

				if (!textA6_1.getText().isEmpty() && !textA6_2.getText().isEmpty()) {
					croaciaj.setText(Integer.toString(Integer.parseInt(croaciaj.getText()) + 1));
					mexicoj.setText(Integer.toString(Integer.parseInt(mexicoj.getText()) + 1));

					croaciagp.setText(Integer
							.toString(Integer.parseInt(croaciagp.getText()) + (Integer.parseInt(textA6_1.getText()))));
					mexicogp.setText(Integer
							.toString(Integer.parseInt(mexicogp.getText()) + (Integer.parseInt(textA6_2.getText()))));

					croaciagc.setText(Integer
							.toString(Integer.parseInt(croaciagc.getText()) + (Integer.parseInt(textA6_2.getText()))));
					mexicogc.setText(Integer
							.toString(Integer.parseInt(mexicogc.getText()) + (Integer.parseInt(textA6_1.getText()))));

					croaciasg.setText(Integer
							.toString(Integer.parseInt(croaciagp.getText()) - (Integer.parseInt(croaciagc.getText()))));
					mexicosg.setText(Integer
							.toString(Integer.parseInt(mexicogp.getText()) - (Integer.parseInt(mexicogc.getText()))));

					if (Integer.parseInt(textA6_1.getText()) > Integer.parseInt(textA6_2.getText())) {
						croaciav.setText(Integer.toString(Integer.parseInt(croaciav.getText()) + 1));
						mexicod.setText(Integer.toString(Integer.parseInt(mexicod.getText()) + 1));
						croaciap.setText(Integer.toString(Integer.parseInt(croaciap.getText()) + 3));
					} else if (Integer.parseInt(textA6_2.getText()) > Integer.parseInt(textA6_1.getText())) {
						croaciad.setText(Integer.toString(Integer.parseInt(croaciad.getText()) + 1));
						mexicop.setText(Integer.toString(Integer.parseInt(mexicop.getText()) + 3));
						mexicov.setText(Integer.toString(Integer.parseInt(mexicov.getText()) + 1));
					} else {
						croaciae.setText(Integer.toString(Integer.parseInt(croaciae.getText()) + 1));
						mexicoe.setText(Integer.toString(Integer.parseInt(mexicoe.getText()) + 1));
						mexicop.setText(Integer.toString(Integer.parseInt(mexicop.getText()) + 1));
						croaciap.setText(Integer.toString(Integer.parseInt(croaciap.getText()) + 1));
					}

					Jogo jogo6 = ControleJogo.criaJogo("Croacia", Integer.parseInt(textA6_1.getText()), "Mexico",
							Integer.parseInt(textA6_2.getText()));
					if (!jogos.contains(jogo6)) {
						Persistence.save(jogo6);
					}
				}

				/*
				 * GRUPO B
				 */

				// espanha x holanda
				if (!(textB1_1.getText().isEmpty() && textB1_2.getText().isEmpty())) {
					espanhaj.setText(Integer.toString(Integer.parseInt(espanhaj.getText()) + 1));
					holandaj.setText(Integer.toString(Integer.parseInt(holandaj.getText()) + 1));

					espanhagp.setText(Integer
							.toString(Integer.parseInt(espanhagp.getText()) + (Integer.parseInt(textB1_1.getText()))));
					holandagp.setText(Integer
							.toString(Integer.parseInt(holandagp.getText()) + (Integer.parseInt(textB1_2.getText()))));

					espanhagc.setText(Integer
							.toString(Integer.parseInt(espanhagc.getText()) + (Integer.parseInt(textB1_2.getText()))));
					holandagc.setText(Integer
							.toString(Integer.parseInt(holandagc.getText()) + (Integer.parseInt(textB1_1.getText()))));

					espanhasg.setText(Integer
							.toString(Integer.parseInt(espanhagp.getText()) - (Integer.parseInt(espanhagc.getText()))));
					holandasg.setText(Integer
							.toString(Integer.parseInt(holandagp.getText()) - (Integer.parseInt(holandagc.getText()))));

					if (Integer.parseInt(textB1_1.getText()) > Integer.parseInt(textB1_2.getText())) {
						espanhav.setText(Integer.toString(Integer.parseInt(espanhav.getText()) + 1));
						holandad.setText(Integer.toString(Integer.parseInt(holandad.getText()) + 1));
						espanhap.setText(Integer.toString(Integer.parseInt(espanhap.getText()) + 3));
					} else if (Integer.parseInt(textB1_2.getText()) > Integer.parseInt(textB1_1.getText())) {
						espanhad.setText(Integer.toString(Integer.parseInt(espanhad.getText()) + 1));
						holandap.setText(Integer.toString(Integer.parseInt(holandap.getText()) + 3));
						holandav.setText(Integer.toString(Integer.parseInt(holandav.getText()) + 1));
					} else {
						espanhae.setText(Integer.toString(Integer.parseInt(espanhae.getText()) + 1));
						holandae.setText(Integer.toString(Integer.parseInt(holandae.getText()) + 1));
						holandap.setText(Integer.toString(Integer.parseInt(holandap.getText()) + 1));
						espanhap.setText(Integer.toString(Integer.parseInt(espanhap.getText()) + 1));
					}

					Jogo jogo7 = ControleJogo.criaJogo("Espanha", Integer.parseInt(textB1_1.getText()), "Holanda",
							Integer.parseInt(textB1_2.getText()));
					if (!jogos.contains(jogo7)) {
						Persistence.save(jogo7);
					}
				}

				// chile x australia
				if (!(textB2_1.getText().isEmpty() && textB2_2.getText().isEmpty())) {
					chilej.setText(Integer.toString(Integer.parseInt(chilej.getText()) + 1));
					australiaj.setText(Integer.toString(Integer.parseInt(australiaj.getText()) + 1));

					chilegp.setText(Integer
							.toString(Integer.parseInt(chilegp.getText()) + (Integer.parseInt(textB2_1.getText()))));
					australiagp.setText(Integer.toString(
							Integer.parseInt(australiagp.getText()) + (Integer.parseInt(textB2_2.getText()))));

					chilegc.setText(Integer
							.toString(Integer.parseInt(chilegc.getText()) + (Integer.parseInt(textB2_2.getText()))));
					australiagc.setText(Integer.toString(
							Integer.parseInt(australiagc.getText()) + (Integer.parseInt(textB2_1.getText()))));

					chilesg.setText(Integer
							.toString(Integer.parseInt(chilegp.getText()) - (Integer.parseInt(chilegc.getText()))));
					australiasg.setText(Integer.toString(
							Integer.parseInt(australiagp.getText()) - (Integer.parseInt(australiagc.getText()))));

					if (Integer.parseInt(textB2_1.getText()) > Integer.parseInt(textB2_2.getText())) {
						chilev.setText(Integer.toString(Integer.parseInt(chilev.getText()) + 1));
						australiad.setText(Integer.toString(Integer.parseInt(australiad.getText()) + 1));
						chilep.setText(Integer.toString(Integer.parseInt(chilep.getText()) + 3));
					} else if (Integer.parseInt(textB2_2.getText()) > Integer.parseInt(textB2_1.getText())) {
						chiled.setText(Integer.toString(Integer.parseInt(chiled.getText()) + 1));
						australiap.setText(Integer.toString(Integer.parseInt(australiap.getText()) + 3));
						australiav.setText(Integer.toString(Integer.parseInt(australiav.getText()) + 1));
					} else {
						chilee.setText(Integer.toString(Integer.parseInt(chilee.getText()) + 1));
						australiae.setText(Integer.toString(Integer.parseInt(australiae.getText()) + 1));
						australiap.setText(Integer.toString(Integer.parseInt(australiap.getText()) + 1));
						chilep.setText(Integer.toString(Integer.parseInt(chilep.getText()) + 1));
					}

					Jogo jogo8 = (ControleJogo.criaJogo("Chile", Integer.parseInt(textB2_1.getText()), "Australia",
							Integer.parseInt(textB2_2.getText())));
					if (!jogos.contains(jogo8)) {
						Persistence.save(jogo8);
					}

				}

				// australia x holanda
				if (!(textB3_1.getText().isEmpty() && textB3_2.getText().isEmpty())) {
					australiaj.setText(Integer.toString(Integer.parseInt(australiaj.getText()) + 1));
					holandaj.setText(Integer.toString(Integer.parseInt(holandaj.getText()) + 1));

					australiagp.setText(Integer.toString(
							Integer.parseInt(australiagp.getText()) + (Integer.parseInt(textB3_1.getText()))));
					holandagp.setText(Integer
							.toString(Integer.parseInt(holandagp.getText()) + (Integer.parseInt(textB3_2.getText()))));

					australiagc.setText(Integer.toString(
							Integer.parseInt(australiagc.getText()) + (Integer.parseInt(textB3_2.getText()))));
					holandagc.setText(Integer
							.toString(Integer.parseInt(holandagc.getText()) + (Integer.parseInt(textB3_1.getText()))));

					australiasg.setText(Integer.toString(
							Integer.parseInt(australiagp.getText()) - (Integer.parseInt(australiagc.getText()))));
					holandasg.setText(Integer
							.toString(Integer.parseInt(holandagp.getText()) - (Integer.parseInt(holandagc.getText()))));

					if (Integer.parseInt(textB3_1.getText()) > Integer.parseInt(textB3_2.getText())) {
						australiav.setText(Integer.toString(Integer.parseInt(australiav.getText()) + 1));
						holandad.setText(Integer.toString(Integer.parseInt(holandad.getText()) + 1));
						australiap.setText(Integer.toString(Integer.parseInt(australiap.getText()) + 3));
					} else if (Integer.parseInt(textB3_2.getText()) > Integer.parseInt(textB3_1.getText())) {
						australiad.setText(Integer.toString(Integer.parseInt(australiad.getText()) + 1));
						holandap.setText(Integer.toString(Integer.parseInt(holandap.getText()) + 3));
						holandav.setText(Integer.toString(Integer.parseInt(holandav.getText()) + 1));
					} else {
						australiae.setText(Integer.toString(Integer.parseInt(australiae.getText()) + 1));
						holandae.setText(Integer.toString(Integer.parseInt(holandae.getText()) + 1));
						holandap.setText(Integer.toString(Integer.parseInt(holandap.getText()) + 1));
						australiap.setText(Integer.toString(Integer.parseInt(australiap.getText()) + 1));
					}

					Jogo jogo9 = ControleJogo.criaJogo("Australia", Integer.parseInt(textB3_1.getText()), "Holanda",
							Integer.parseInt(textB3_2.getText()));

					if (!jogos.contains(jogo9)) {
						Persistence.save(jogo9);
					}
				}

				// espanha x chile
				if (!(textB4_1.getText().isEmpty() && textB4_2.getText().isEmpty())) {
					espanhaj.setText(Integer.toString(Integer.parseInt(espanhaj.getText()) + 1));
					chilej.setText(Integer.toString(Integer.parseInt(chilej.getText()) + 1));

					espanhagp.setText(Integer
							.toString(Integer.parseInt(espanhagp.getText()) + (Integer.parseInt(textB4_1.getText()))));
					chilegp.setText(Integer
							.toString(Integer.parseInt(chilegp.getText()) + (Integer.parseInt(textB4_2.getText()))));

					espanhagc.setText(Integer
							.toString(Integer.parseInt(espanhagc.getText()) + (Integer.parseInt(textB4_2.getText()))));
					chilegc.setText(Integer
							.toString(Integer.parseInt(chilegc.getText()) + (Integer.parseInt(textB4_1.getText()))));

					espanhasg.setText(Integer
							.toString(Integer.parseInt(espanhagp.getText()) - (Integer.parseInt(espanhagc.getText()))));
					chilesg.setText(Integer
							.toString(Integer.parseInt(chilegp.getText()) - (Integer.parseInt(chilegc.getText()))));

					if (Integer.parseInt(textB4_1.getText()) > Integer.parseInt(textB4_2.getText())) {
						espanhav.setText(Integer.toString(Integer.parseInt(espanhav.getText()) + 1));
						chiled.setText(Integer.toString(Integer.parseInt(chiled.getText()) + 1));
						chilep.setText(Integer.toString(Integer.parseInt(chilep.getText()) + 3));
					} else if (Integer.parseInt(textB4_2.getText()) > Integer.parseInt(textB4_1.getText())) {
						espanhad.setText(Integer.toString(Integer.parseInt(espanhad.getText()) + 1));
						chilep.setText(Integer.toString(Integer.parseInt(chilep.getText()) + 3));
						chilev.setText(Integer.toString(Integer.parseInt(chilev.getText()) + 1));
					} else {
						espanhae.setText(Integer.toString(Integer.parseInt(espanhae.getText()) + 1));
						chilee.setText(Integer.toString(Integer.parseInt(chilee.getText()) + 1));
						chilep.setText(Integer.toString(Integer.parseInt(chilep.getText()) + 1));
						espanhap.setText(Integer.toString(Integer.parseInt(espanhap.getText()) + 1));
					}

					Jogo jogo10 = ControleJogo.criaJogo("Espanha", Integer.parseInt(textB4_1.getText()), "Chile",
							Integer.parseInt(textB4_2.getText()));
					if (!jogos.contains(jogo10)) {
						Persistence.save(jogo10);
					}

				}

				// australia x espanha
				if (!(textB5_1.getText().isEmpty() && textB5_2.getText().isEmpty())) {
					australiaj.setText(Integer.toString(Integer.parseInt(australiaj.getText()) + 1));
					espanhaj.setText(Integer.toString(Integer.parseInt(espanhaj.getText()) + 1));

					australiagp.setText(Integer.toString(
							Integer.parseInt(australiagp.getText()) + (Integer.parseInt(textB5_1.getText()))));
					espanhagp.setText(Integer
							.toString(Integer.parseInt(espanhagp.getText()) + (Integer.parseInt(textB5_2.getText()))));

					australiagc.setText(Integer.toString(
							Integer.parseInt(australiagc.getText()) + (Integer.parseInt(textB5_2.getText()))));
					espanhagc.setText(Integer
							.toString(Integer.parseInt(espanhagc.getText()) + (Integer.parseInt(textB5_1.getText()))));

					australiasg.setText(Integer.toString(
							Integer.parseInt(australiagp.getText()) - (Integer.parseInt(australiagc.getText()))));
					espanhasg.setText(Integer
							.toString(Integer.parseInt(espanhagp.getText()) - (Integer.parseInt(espanhagc.getText()))));

					if (Integer.parseInt(textB5_1.getText()) > Integer.parseInt(textB5_2.getText())) {
						australiav.setText(Integer.toString(Integer.parseInt(australiav.getText()) + 1));
						espanhad.setText(Integer.toString(Integer.parseInt(espanhad.getText()) + 1));
						australiap.setText(Integer.toString(Integer.parseInt(australiap.getText()) + 3));
					} else if (Integer.parseInt(textB5_2.getText()) > Integer.parseInt(textB5_1.getText())) {
						australiad.setText(Integer.toString(Integer.parseInt(australiad.getText()) + 1));
						espanhap.setText(Integer.toString(Integer.parseInt(espanhap.getText()) + 3));
						espanhav.setText(Integer.toString(Integer.parseInt(espanhav.getText()) + 1));
					} else {
						australiae.setText(Integer.toString(Integer.parseInt(australiae.getText()) + 1));
						espanhae.setText(Integer.toString(Integer.parseInt(espanhae.getText()) + 1));
						espanhap.setText(Integer.toString(Integer.parseInt(espanhap.getText()) + 1));
						australiap.setText(Integer.toString(Integer.parseInt(australiap.getText()) + 1));
					}

					Jogo jogo11 = ControleJogo.criaJogo("Australia", Integer.parseInt(textB5_1.getText()), "Espanha",
							Integer.parseInt(textB5_2.getText()));
					if (!jogos.contains(jogo11)) {
						Persistence.save(jogo11);
					}

				}

				// holanda x chile
				if (!(textB6_1.getText().isEmpty() && textB6_2.getText().isEmpty())) {
					holandaj.setText(Integer.toString(Integer.parseInt(holandaj.getText()) + 1));
					chilej.setText(Integer.toString(Integer.parseInt(chilej.getText()) + 1));

					holandagp.setText(Integer
							.toString(Integer.parseInt(holandagp.getText()) + (Integer.parseInt(textB6_1.getText()))));
					chilegp.setText(Integer
							.toString(Integer.parseInt(chilegp.getText()) + (Integer.parseInt(textB6_2.getText()))));

					holandagc.setText(Integer
							.toString(Integer.parseInt(holandagc.getText()) + (Integer.parseInt(textB6_2.getText()))));
					chilegc.setText(Integer
							.toString(Integer.parseInt(chilegc.getText()) + (Integer.parseInt(textB6_1.getText()))));

					holandasg.setText(Integer
							.toString(Integer.parseInt(holandagp.getText()) - (Integer.parseInt(holandagc.getText()))));
					chilesg.setText(Integer
							.toString(Integer.parseInt(chilegp.getText()) - (Integer.parseInt(chilegc.getText()))));

					if (Integer.parseInt(textB6_1.getText()) > Integer.parseInt(textB6_2.getText())) {
						holandav.setText(Integer.toString(Integer.parseInt(holandav.getText()) + 1));
						chiled.setText(Integer.toString(Integer.parseInt(chiled.getText()) + 1));
						holandap.setText(Integer.toString(Integer.parseInt(holandap.getText()) + 3));
					} else if (Integer.parseInt(textB6_2.getText()) > Integer.parseInt(textB6_1.getText())) {
						holandad.setText(Integer.toString(Integer.parseInt(holandad.getText()) + 1));
						chilep.setText(Integer.toString(Integer.parseInt(chilep.getText()) + 3));
						chilev.setText(Integer.toString(Integer.parseInt(chilev.getText()) + 1));
					} else {
						holandae.setText(Integer.toString(Integer.parseInt(holandae.getText()) + 1));
						chilee.setText(Integer.toString(Integer.parseInt(chilee.getText()) + 1));
						chilep.setText(Integer.toString(Integer.parseInt(chilep.getText()) + 1));
						holandap.setText(Integer.toString(Integer.parseInt(holandap.getText()) + 1));
					}

					Jogo jogo12 = ControleJogo.criaJogo("Holanda", Integer.parseInt(textB6_1.getText()), "Chile",
							Integer.parseInt(textB6_2.getText()));
					if (!jogos.contains(jogo12)) {
						Persistence.save(jogo12);
					}

				}

				/*
				 * GRUPO C
				 */
				// colombia x grecia
				if (!(textC1_1.getText().isEmpty() && textC1_2.getText().isEmpty())) {
					colombiaj.setText(Integer.toString(Integer.parseInt(colombiaj.getText()) + 1));
					greciaj.setText(Integer.toString(Integer.parseInt(greciaj.getText()) + 1));

					colombiagp.setText(Integer
							.toString(Integer.parseInt(colombiagp.getText()) + (Integer.parseInt(textC1_1.getText()))));
					greciagp.setText(Integer
							.toString(Integer.parseInt(greciagp.getText()) + (Integer.parseInt(textC1_2.getText()))));

					colombiagc.setText(Integer
							.toString(Integer.parseInt(colombiagc.getText()) + (Integer.parseInt(textC1_2.getText()))));
					greciagc.setText(Integer
							.toString(Integer.parseInt(greciagc.getText()) + (Integer.parseInt(textC1_1.getText()))));

					colombiasg.setText(Integer.toString(
							Integer.parseInt(colombiagp.getText()) - (Integer.parseInt(colombiagc.getText()))));
					greciasg.setText(Integer
							.toString(Integer.parseInt(greciagp.getText()) - (Integer.parseInt(greciagc.getText()))));

					if (Integer.parseInt(textC1_1.getText()) > Integer.parseInt(textC1_2.getText())) {
						colombiav.setText(Integer.toString(Integer.parseInt(colombiav.getText()) + 1));
						greciad.setText(Integer.toString(Integer.parseInt(greciad.getText()) + 1));
						greciap.setText(Integer.toString(Integer.parseInt(colombiap.getText()) + 3));
					} else if (Integer.parseInt(textC1_2.getText()) > Integer.parseInt(textC1_1.getText())) {
						colombiad.setText(Integer.toString(Integer.parseInt(colombiad.getText()) + 1));
						greciap.setText(Integer.toString(Integer.parseInt(greciap.getText()) + 3));
						greciav.setText(Integer.toString(Integer.parseInt(greciav.getText()) + 1));
					} else {
						colombiae.setText(Integer.toString(Integer.parseInt(colombiae.getText()) + 1));
						greciae.setText(Integer.toString(Integer.parseInt(greciae.getText()) + 1));
						greciap.setText(Integer.toString(Integer.parseInt(greciap.getText()) + 1));
						colombiap.setText(Integer.toString(Integer.parseInt(colombiap.getText()) + 1));
					}

					Jogo jogo13 = ControleJogo.criaJogo("Colombia", Integer.parseInt(textC1_1.getText()), "Grecia",
							Integer.parseInt(textC1_2.getText()));
					if (!jogos.contains(jogo13)) {
						Persistence.save(jogo13);
					}

				}
				// cmarfim x japao
				if (!(textC2_1.getText().isEmpty() && textC2_2.getText().isEmpty())) {
					cmarfimj.setText(Integer.toString(Integer.parseInt(cmarfimj.getText()) + 1));
					japaoj.setText(Integer.toString(Integer.parseInt(japaoj.getText()) + 1));

					cmarfimgp.setText(Integer
							.toString(Integer.parseInt(cmarfimgp.getText()) + (Integer.parseInt(textC2_1.getText()))));
					japaogp.setText(Integer
							.toString(Integer.parseInt(japaogp.getText()) + (Integer.parseInt(textC2_2.getText()))));

					cmarfimgc.setText(Integer
							.toString(Integer.parseInt(cmarfimgc.getText()) + (Integer.parseInt(textC2_2.getText()))));
					japaogc.setText(Integer
							.toString(Integer.parseInt(japaogc.getText()) + (Integer.parseInt(textC2_1.getText()))));

					cmarfimsg.setText(Integer
							.toString(Integer.parseInt(cmarfimgp.getText()) - (Integer.parseInt(cmarfimgc.getText()))));
					japaosg.setText(Integer
							.toString(Integer.parseInt(japaogp.getText()) - (Integer.parseInt(japaogc.getText()))));

					if (Integer.parseInt(textC2_1.getText()) > Integer.parseInt(textC2_2.getText())) {
						cmarfimv.setText(Integer.toString(Integer.parseInt(cmarfimv.getText()) + 1));
						japaod.setText(Integer.toString(Integer.parseInt(japaod.getText()) + 1));
						cmarfimp.setText(Integer.toString(Integer.parseInt(cmarfimp.getText()) + 3));
					} else if (Integer.parseInt(textC2_2.getText()) > Integer.parseInt(textC2_1.getText())) {
						cmarfimd.setText(Integer.toString(Integer.parseInt(cmarfimd.getText()) + 1));
						japaop.setText(Integer.toString(Integer.parseInt(japaop.getText()) + 3));
						croaciav.setText(Integer.toString(Integer.parseInt(croaciav.getText()) + 1));
					} else {
						cmarfime.setText(Integer.toString(Integer.parseInt(cmarfime.getText()) + 1));
						japaoe.setText(Integer.toString(Integer.parseInt(japaoe.getText()) + 1));
						japaop.setText(Integer.toString(Integer.parseInt(japaop.getText()) + 1));
						cmarfimp.setText(Integer.toString(Integer.parseInt(cmarfimp.getText()) + 1));
					}

					Jogo jogo14 = ControleJogo.criaJogo("Cmarfim", Integer.parseInt(textC2_1.getText()), "Japao",
							Integer.parseInt(textC2_2.getText()));

					if (!jogos.contains(jogo14)) {
						Persistence.save(jogo14);
					}

				}

				// colombia x cmarfim
				if (!(textC3_1.getText().isEmpty() && textC3_2.getText().isEmpty())) {
					colombiaj.setText(Integer.toString(Integer.parseInt(colombiaj.getText()) + 1));
					croaciaj.setText(Integer.toString(Integer.parseInt(croaciaj.getText()) + 1));

					colombiagp.setText(Integer
							.toString(Integer.parseInt(colombiagp.getText()) + (Integer.parseInt(textC3_1.getText()))));
					cmarfimgp.setText(Integer
							.toString(Integer.parseInt(cmarfimgp.getText()) + (Integer.parseInt(textC3_2.getText()))));

					colombiagc.setText(Integer
							.toString(Integer.parseInt(colombiagc.getText()) + (Integer.parseInt(textC3_2.getText()))));
					cmarfimgc.setText(Integer
							.toString(Integer.parseInt(cmarfimgc.getText()) + (Integer.parseInt(textC3_1.getText()))));

					colombiasg.setText(Integer.toString(
							Integer.parseInt(colombiagp.getText()) - (Integer.parseInt(colombiagc.getText()))));
					cmarfimsg.setText(Integer
							.toString(Integer.parseInt(cmarfimgp.getText()) - (Integer.parseInt(cmarfimgc.getText()))));

					if (Integer.parseInt(textC3_1.getText()) > Integer.parseInt(textC3_2.getText())) {
						colombiav.setText(Integer.toString(Integer.parseInt(colombiav.getText()) + 1));
						cmarfimd.setText(Integer.toString(Integer.parseInt(cmarfimd.getText()) + 1));
						colombiap.setText(Integer.toString(Integer.parseInt(colombiap.getText()) + 3));
					} else if (Integer.parseInt(textC3_2.getText()) > Integer.parseInt(textC3_1.getText())) {
						colombiad.setText(Integer.toString(Integer.parseInt(colombiad.getText()) + 1));
						cmarfimp.setText(Integer.toString(Integer.parseInt(cmarfimp.getText()) + 3));
						cmarfimv.setText(Integer.toString(Integer.parseInt(cmarfimv.getText()) + 1));
					} else {
						colombiae.setText(Integer.toString(Integer.parseInt(colombiae.getText()) + 1));
						cmarfime.setText(Integer.toString(Integer.parseInt(cmarfime.getText()) + 1));
						cmarfimp.setText(Integer.toString(Integer.parseInt(cmarfimp.getText()) + 1));
						colombiap.setText(Integer.toString(Integer.parseInt(colombiap.getText()) + 1));
					}

					Jogo jogo15 = ControleJogo.criaJogo("Colombia", Integer.parseInt(textC3_1.getText()), "Cmarfim",
							Integer.parseInt(textC3_2.getText()));
					if (!jogos.contains(jogo15)) {
						Persistence.save(jogo15);
					}

				}

				// japao x grecia
				if (!(textC4_1.getText().isEmpty() && textC4_2.getText().isEmpty())) {
					japaoj.setText(Integer.toString(Integer.parseInt(japaoj.getText()) + 1));
					greciaj.setText(Integer.toString(Integer.parseInt(greciaj.getText()) + 1));

					japaogp.setText(Integer
							.toString(Integer.parseInt(japaogp.getText()) + (Integer.parseInt(textC4_1.getText()))));
					greciagp.setText(Integer
							.toString(Integer.parseInt(greciagp.getText()) + (Integer.parseInt(textC4_2.getText()))));

					japaogc.setText(Integer
							.toString(Integer.parseInt(japaogc.getText()) + (Integer.parseInt(textC4_2.getText()))));
					greciagc.setText(Integer
							.toString(Integer.parseInt(greciagc.getText()) + (Integer.parseInt(textC4_1.getText()))));

					japaosg.setText(Integer
							.toString(Integer.parseInt(japaogp.getText()) - (Integer.parseInt(japaogc.getText()))));
					greciasg.setText(Integer
							.toString(Integer.parseInt(greciagp.getText()) - (Integer.parseInt(greciagc.getText()))));

					if (Integer.parseInt(textC4_1.getText()) > Integer.parseInt(textC4_2.getText())) {
						japaov.setText(Integer.toString(Integer.parseInt(japaov.getText()) + 1));
						greciad.setText(Integer.toString(Integer.parseInt(greciad.getText()) + 1));
						japaop.setText(Integer.toString(Integer.parseInt(japaop.getText()) + 3));
					} else if (Integer.parseInt(textC4_2.getText()) > Integer.parseInt(textC4_1.getText())) {
						japaod.setText(Integer.toString(Integer.parseInt(japaod.getText()) + 1));
						greciap.setText(Integer.toString(Integer.parseInt(greciap.getText()) + 3));
						greciav.setText(Integer.toString(Integer.parseInt(greciav.getText()) + 1));
					} else {
						japaoe.setText(Integer.toString(Integer.parseInt(japaoe.getText()) + 1));
						greciae.setText(Integer.toString(Integer.parseInt(greciae.getText()) + 1));
						greciap.setText(Integer.toString(Integer.parseInt(greciap.getText()) + 1));
						japaop.setText(Integer.toString(Integer.parseInt(japaop.getText()) + 1));
					}

					Jogo jogo16 = ControleJogo.criaJogo("Japao", Integer.parseInt(textC4_1.getText()), "Grecia",
							Integer.parseInt(textC4_2.getText()));
					if (!jogos.contains(jogo16)) {
						Persistence.save(jogo16);
					}

				}

				// japao x colombia
				if (!(textC5_1.getText().isEmpty() && textC5_2.getText().isEmpty())) {
					japaoj.setText(Integer.toString(Integer.parseInt(japaoj.getText()) + 1));
					colombiaj.setText(Integer.toString(Integer.parseInt(colombiaj.getText()) + 1));

					japaogp.setText(Integer
							.toString(Integer.parseInt(japaogp.getText()) + (Integer.parseInt(textC5_1.getText()))));
					colombiagp.setText(Integer
							.toString(Integer.parseInt(colombiagp.getText()) + (Integer.parseInt(textC5_2.getText()))));

					japaogc.setText(Integer
							.toString(Integer.parseInt(japaogc.getText()) + (Integer.parseInt(textC5_2.getText()))));
					colombiagc.setText(Integer
							.toString(Integer.parseInt(colombiagc.getText()) + (Integer.parseInt(textC5_1.getText()))));

					japaosg.setText(Integer
							.toString(Integer.parseInt(japaogp.getText()) - (Integer.parseInt(japaogc.getText()))));
					colombiasg.setText(Integer.toString(
							Integer.parseInt(colombiagp.getText()) - (Integer.parseInt(colombiagc.getText()))));

					if (Integer.parseInt(textC5_1.getText()) > Integer.parseInt(textC5_2.getText())) {
						japaov.setText(Integer.toString(Integer.parseInt(japaov.getText()) + 1));
						colombiad.setText(Integer.toString(Integer.parseInt(colombiad.getText()) + 1));
						japaop.setText(Integer.toString(Integer.parseInt(japaop.getText()) + 3));
					} else if (Integer.parseInt(textC5_2.getText()) > Integer.parseInt(textC5_1.getText())) {
						japaod.setText(Integer.toString(Integer.parseInt(japaod.getText()) + 1));
						colombiap.setText(Integer.toString(Integer.parseInt(colombiap.getText()) + 3));
						colombiav.setText(Integer.toString(Integer.parseInt(colombiav.getText()) + 1));
					} else {
						japaoe.setText(Integer.toString(Integer.parseInt(japaoe.getText()) + 1));
						colombiae.setText(Integer.toString(Integer.parseInt(colombiae.getText()) + 1));
						colombiap.setText(Integer.toString(Integer.parseInt(colombiap.getText()) + 1));
						japaop.setText(Integer.toString(Integer.parseInt(japaop.getText()) + 1));
					}

					Jogo jogo17 = ControleJogo.criaJogo("Japao", Integer.parseInt(textC5_1.getText()), "Colombia",
							Integer.parseInt(textC5_2.getText()));
					if (!jogos.contains(jogo17)) {
						Persistence.save(jogo17);
					}

				}

				// grecia x cmarfim
				if (!(textC6_1.getText().isEmpty() && textC6_2.getText().isEmpty())) {
					greciaj.setText(Integer.toString(Integer.parseInt(greciaj.getText()) + 1));
					cmarfimj.setText(Integer.toString(Integer.parseInt(cmarfimj.getText()) + 1));

					greciagp.setText(Integer
							.toString(Integer.parseInt(greciagp.getText()) + (Integer.parseInt(textC6_1.getText()))));
					cmarfimgp.setText(Integer
							.toString(Integer.parseInt(cmarfimgp.getText()) + (Integer.parseInt(textC1_2.getText()))));

					greciagc.setText(Integer
							.toString(Integer.parseInt(greciagc.getText()) + (Integer.parseInt(textC6_2.getText()))));
					cmarfimgc.setText(Integer
							.toString(Integer.parseInt(cmarfimgc.getText()) + (Integer.parseInt(textC6_1.getText()))));

					greciasg.setText(Integer
							.toString(Integer.parseInt(greciagp.getText()) - (Integer.parseInt(greciagc.getText()))));
					cmarfimsg.setText(Integer
							.toString(Integer.parseInt(cmarfimgp.getText()) - (Integer.parseInt(cmarfimgc.getText()))));

					if (Integer.parseInt(textC6_1.getText()) > Integer.parseInt(textC6_2.getText())) {
						greciav.setText(Integer.toString(Integer.parseInt(greciav.getText()) + 1));
						cmarfimd.setText(Integer.toString(Integer.parseInt(cmarfimd.getText()) + 1));
						greciap.setText(Integer.toString(Integer.parseInt(greciap.getText()) + 3));
					} else if (Integer.parseInt(textC6_2.getText()) > Integer.parseInt(textC6_1.getText())) {
						greciad.setText(Integer.toString(Integer.parseInt(greciad.getText()) + 1));
						cmarfimp.setText(Integer.toString(Integer.parseInt(cmarfimp.getText()) + 3));
						cmarfimv.setText(Integer.toString(Integer.parseInt(cmarfimv.getText()) + 1));
					} else {
						greciae.setText(Integer.toString(Integer.parseInt(greciae.getText()) + 1));
						cmarfime.setText(Integer.toString(Integer.parseInt(cmarfime.getText()) + 1));
						cmarfimp.setText(Integer.toString(Integer.parseInt(cmarfimp.getText()) + 1));
						greciap.setText(Integer.toString(Integer.parseInt(greciap.getText()) + 1));
					}

					Jogo jogo18 = ControleJogo.criaJogo("Grecia", Integer.parseInt(textC6_1.getText()), "Cmarfim",
							Integer.parseInt(textC6_2.getText()));
					if (!jogos.contains(jogo18)) {
						Persistence.save(jogo18);
					}

				}

				/*
				 * GRUPO D
				 */
				// uruguai x costarica
				if (!(textD1_1.getText().isEmpty() && textD1_2.getText().isEmpty())) {
					uruguaij.setText(Integer.toString(Integer.parseInt(uruguaij.getText()) + 1));
					costaricaj.setText(Integer.toString(Integer.parseInt(costaricaj.getText()) + 1));

					uruguaigp.setText(Integer
							.toString(Integer.parseInt(uruguaigp.getText()) + (Integer.parseInt(textD1_1.getText()))));
					costaricagp.setText(Integer.toString(
							Integer.parseInt(costaricagp.getText()) + (Integer.parseInt(textD1_2.getText()))));

					uruguaigc.setText(Integer
							.toString(Integer.parseInt(uruguaigc.getText()) + (Integer.parseInt(textD1_2.getText()))));
					costaricagc.setText(Integer.toString(
							Integer.parseInt(costaricagc.getText()) + (Integer.parseInt(textD1_1.getText()))));

					uruguaisg.setText(Integer
							.toString(Integer.parseInt(uruguaigp.getText()) - (Integer.parseInt(uruguaigc.getText()))));
					costaricasg.setText(Integer.toString(
							Integer.parseInt(costaricagp.getText()) - (Integer.parseInt(costaricagc.getText()))));

					if (Integer.parseInt(textD1_1.getText()) > Integer.parseInt(textD1_2.getText())) {
						uruguaiv.setText(Integer.toString(Integer.parseInt(uruguaiv.getText()) + 1));
						costaricad.setText(Integer.toString(Integer.parseInt(costaricad.getText()) + 1));
						uruguaip.setText(Integer.toString(Integer.parseInt(uruguaip.getText()) + 3));
					} else if (Integer.parseInt(textD1_2.getText()) > Integer.parseInt(textD1_1.getText())) {
						uruguaid.setText(Integer.toString(Integer.parseInt(uruguaid.getText()) + 1));
						costaricap.setText(Integer.toString(Integer.parseInt(costaricap.getText()) + 3));
						costaricav.setText(Integer.toString(Integer.parseInt(costaricav.getText()) + 1));
					} else {
						uruguaie.setText(Integer.toString(Integer.parseInt(uruguaie.getText()) + 1));
						costaricae.setText(Integer.toString(Integer.parseInt(costaricae.getText()) + 1));
						costaricap.setText(Integer.toString(Integer.parseInt(costaricap.getText()) + 1));
						uruguaip.setText(Integer.toString(Integer.parseInt(uruguaip.getText()) + 1));
					}

					Jogo jogo19 = ControleJogo.criaJogo("Uruguai", Integer.parseInt(textD1_1.getText()), "Costarica",
							Integer.parseInt(textD1_2.getText()));
					if (!jogos.contains(jogo19)) {
						Persistence.save(jogo19);
					}

				}

				// inglaterra x italia
				if (!(textD2_1.getText().isEmpty() && textD2_2.getText().isEmpty())) {
					inglaterraj.setText(Integer.toString(Integer.parseInt(inglaterraj.getText()) + 1));
					italiaj.setText(Integer.toString(Integer.parseInt(italiaj.getText()) + 1));

					inglaterragp.setText(Integer.toString(
							Integer.parseInt(inglaterragp.getText()) + (Integer.parseInt(textD2_1.getText()))));
					italiagp.setText(Integer
							.toString(Integer.parseInt(italiagp.getText()) + (Integer.parseInt(textD2_2.getText()))));

					inglaterragc.setText(Integer.toString(
							Integer.parseInt(inglaterragc.getText()) + (Integer.parseInt(textD2_2.getText()))));
					italiagc.setText(Integer
							.toString(Integer.parseInt(italiagc.getText()) + (Integer.parseInt(textD2_1.getText()))));

					inglaterrasg.setText(Integer.toString(
							Integer.parseInt(inglaterragp.getText()) - (Integer.parseInt(inglaterragc.getText()))));
					italiasg.setText(Integer
							.toString(Integer.parseInt(italiagp.getText()) - (Integer.parseInt(italiagc.getText()))));

					if (Integer.parseInt(textD2_1.getText()) > Integer.parseInt(textD2_2.getText())) {
						inglaterrav.setText(Integer.toString(Integer.parseInt(inglaterrav.getText()) + 1));
						italiad.setText(Integer.toString(Integer.parseInt(italiad.getText()) + 1));
						inglaterrap.setText(Integer.toString(Integer.parseInt(inglaterrap.getText()) + 3));
					} else if (Integer.parseInt(textD2_2.getText()) > Integer.parseInt(textD2_1.getText())) {
						inglaterrad.setText(Integer.toString(Integer.parseInt(inglaterrad.getText()) + 1));
						italiap.setText(Integer.toString(Integer.parseInt(italiap.getText()) + 3));
						italiav.setText(Integer.toString(Integer.parseInt(italiav.getText()) + 1));
					} else {
						inglaterrae.setText(Integer.toString(Integer.parseInt(inglaterrae.getText()) + 1));
						italiae.setText(Integer.toString(Integer.parseInt(italiae.getText()) + 1));
						italiap.setText(Integer.toString(Integer.parseInt(italiap.getText()) + 1));
						inglaterrap.setText(Integer.toString(Integer.parseInt(inglaterrap.getText()) + 1));
					}

					Jogo jogo20 = ControleJogo.criaJogo("Inglaterra", Integer.parseInt(textD2_1.getText()), "Italia",
							Integer.parseInt(textD2_2.getText()));
					if (!jogos.contains(jogo20)) {
						Persistence.save(jogo20);
					}

				}

				// uruguai x inglaterra
				if (!(textD3_1.getText().isEmpty() && textD3_2.getText().isEmpty())) {
					uruguaij.setText(Integer.toString(Integer.parseInt(uruguaij.getText()) + 1));
					inglaterraj.setText(Integer.toString(Integer.parseInt(inglaterraj.getText()) + 1));

					uruguaigp.setText(Integer
							.toString(Integer.parseInt(uruguaigp.getText()) + (Integer.parseInt(textD3_1.getText()))));
					inglaterragp.setText(Integer.toString(
							Integer.parseInt(inglaterragp.getText()) + (Integer.parseInt(textD3_2.getText()))));

					uruguaigc.setText(Integer
							.toString(Integer.parseInt(uruguaigc.getText()) + (Integer.parseInt(textD3_2.getText()))));
					inglaterragc.setText(Integer.toString(
							Integer.parseInt(inglaterragc.getText()) + (Integer.parseInt(textD3_1.getText()))));

					uruguaisg.setText(Integer
							.toString(Integer.parseInt(uruguaigp.getText()) - (Integer.parseInt(uruguaigc.getText()))));
					inglaterrasg.setText(Integer.toString(
							Integer.parseInt(inglaterragp.getText()) - (Integer.parseInt(inglaterragc.getText()))));

					if (Integer.parseInt(textD3_1.getText()) > Integer.parseInt(textD3_2.getText())) {
						uruguaiv.setText(Integer.toString(Integer.parseInt(uruguaiv.getText()) + 1));
						inglaterrad.setText(Integer.toString(Integer.parseInt(inglaterrad.getText()) + 1));
						uruguaip.setText(Integer.toString(Integer.parseInt(uruguaip.getText()) + 3));
					} else if (Integer.parseInt(textD3_2.getText()) > Integer.parseInt(textD3_1.getText())) {
						uruguaid.setText(Integer.toString(Integer.parseInt(uruguaid.getText()) + 1));
						inglaterrap.setText(Integer.toString(Integer.parseInt(inglaterrap.getText()) + 3));
						inglaterrav.setText(Integer.toString(Integer.parseInt(inglaterrav.getText()) + 1));
					} else {
						uruguaie.setText(Integer.toString(Integer.parseInt(uruguaie.getText()) + 1));
						inglaterrae.setText(Integer.toString(Integer.parseInt(inglaterrae.getText()) + 1));
						inglaterrap.setText(Integer.toString(Integer.parseInt(inglaterrap.getText()) + 1));
						uruguaip.setText(Integer.toString(Integer.parseInt(uruguaip.getText()) + 1));
					}

					Jogo jogo21 = ControleJogo.criaJogo("Uruguai", Integer.parseInt(textD3_1.getText()), "Inglaterra",
							Integer.parseInt(textD3_2.getText()));
					if (!jogos.contains(jogo21)) {
						Persistence.save(jogo21);
					}

				}

				// italia x crica
				if (!(textD4_1.getText().isEmpty() && textD4_2.getText().isEmpty())) {
					italiaj.setText(Integer.toString(Integer.parseInt(italiaj.getText()) + 1));
					costaricaj.setText(Integer.toString(Integer.parseInt(costaricaj.getText()) + 1));

					italiagp.setText(Integer
							.toString(Integer.parseInt(italiagp.getText()) + (Integer.parseInt(textD4_1.getText()))));
					costaricagp.setText(Integer.toString(
							Integer.parseInt(costaricagp.getText()) + (Integer.parseInt(textD4_2.getText()))));

					italiagc.setText(Integer
							.toString(Integer.parseInt(italiagc.getText()) + (Integer.parseInt(textD4_2.getText()))));
					costaricagc.setText(Integer.toString(
							Integer.parseInt(costaricagc.getText()) + (Integer.parseInt(textD4_1.getText()))));

					italiasg.setText(Integer
							.toString(Integer.parseInt(italiagp.getText()) - (Integer.parseInt(italiagc.getText()))));
					costaricasg.setText(Integer.toString(
							Integer.parseInt(costaricagp.getText()) - (Integer.parseInt(costaricagc.getText()))));

					if (Integer.parseInt(textD4_1.getText()) > Integer.parseInt(textD4_2.getText())) {
						italiav.setText(Integer.toString(Integer.parseInt(italiav.getText()) + 1));
						costaricad.setText(Integer.toString(Integer.parseInt(costaricad.getText()) + 1));
						italiap.setText(Integer.toString(Integer.parseInt(italiap.getText()) + 3));
					} else if (Integer.parseInt(textD4_2.getText()) > Integer.parseInt(textD4_1.getText())) {
						italiad.setText(Integer.toString(Integer.parseInt(italiad.getText()) + 1));
						costaricap.setText(Integer.toString(Integer.parseInt(costaricap.getText()) + 3));
						costaricav.setText(Integer.toString(Integer.parseInt(costaricav.getText()) + 1));
					} else {
						italiae.setText(Integer.toString(Integer.parseInt(italiae.getText()) + 1));
						costaricae.setText(Integer.toString(Integer.parseInt(costaricae.getText()) + 1));
						costaricap.setText(Integer.toString(Integer.parseInt(costaricap.getText()) + 1));
						italiap.setText(Integer.toString(Integer.parseInt(italiap.getText()) + 1));
					}

					Jogo jogo22 = ControleJogo.criaJogo("Italia", Integer.parseInt(textD4_1.getText()), "Costarica",
							Integer.parseInt(textD4_2.getText()));
					if (!jogos.contains(jogo22)) {
						Persistence.save(jogo22);
					}

				}

				// italia x uruguai
				if (!(textD5_1.getText().isEmpty() && textD5_2.getText().isEmpty())) {
					italiaj.setText(Integer.toString(Integer.parseInt(italiaj.getText()) + 1));
					uruguaij.setText(Integer.toString(Integer.parseInt(uruguaij.getText()) + 1));

					italiagp.setText(Integer
							.toString(Integer.parseInt(italiagp.getText()) + (Integer.parseInt(textD5_1.getText()))));
					uruguaigp.setText(Integer
							.toString(Integer.parseInt(uruguaigp.getText()) + (Integer.parseInt(textD5_2.getText()))));

					italiagc.setText(Integer
							.toString(Integer.parseInt(italiagc.getText()) + (Integer.parseInt(textD5_2.getText()))));
					uruguaigc.setText(Integer
							.toString(Integer.parseInt(uruguaigc.getText()) + (Integer.parseInt(textD5_1.getText()))));

					italiasg.setText(Integer
							.toString(Integer.parseInt(italiagp.getText()) - (Integer.parseInt(italiagc.getText()))));
					uruguaisg.setText(Integer
							.toString(Integer.parseInt(uruguaigp.getText()) - (Integer.parseInt(uruguaigc.getText()))));

					if (Integer.parseInt(textD5_1.getText()) > Integer.parseInt(textD5_2.getText())) {
						italiav.setText(Integer.toString(Integer.parseInt(italiav.getText()) + 1));
						uruguaid.setText(Integer.toString(Integer.parseInt(uruguaid.getText()) + 1));
						italiap.setText(Integer.toString(Integer.parseInt(italiap.getText()) + 3));
					} else if (Integer.parseInt(textD5_2.getText()) > Integer.parseInt(textD5_1.getText())) {
						italiad.setText(Integer.toString(Integer.parseInt(italiad.getText()) + 1));
						uruguaip.setText(Integer.toString(Integer.parseInt(uruguaip.getText()) + 3));
						uruguaiv.setText(Integer.toString(Integer.parseInt(uruguaiv.getText()) + 1));
					} else {
						italiae.setText(Integer.toString(Integer.parseInt(italiae.getText()) + 1));
						uruguaie.setText(Integer.toString(Integer.parseInt(uruguaie.getText()) + 1));
						uruguaip.setText(Integer.toString(Integer.parseInt(uruguaip.getText()) + 1));
						italiap.setText(Integer.toString(Integer.parseInt(italiap.getText()) + 1));
					}

					Jogo jogo23 = ControleJogo.criaJogo("Italia", Integer.parseInt(textD5_1.getText()), "Uruguai",
							Integer.parseInt(textD5_2.getText()));
					if (!jogos.contains(jogo23)) {
						Persistence.save(jogo23);
					}

				}

				// costarica x inglaterra
				if (!(textD6_1.getText().isEmpty() && textD6_2.getText().isEmpty())) {
					costaricaj.setText(Integer.toString(Integer.parseInt(costaricaj.getText()) + 1));
					inglaterraj.setText(Integer.toString(Integer.parseInt(inglaterraj.getText()) + 1));

					costaricagp.setText(Integer.toString(
							Integer.parseInt(costaricagp.getText()) + (Integer.parseInt(textD6_1.getText()))));
					inglaterragp.setText(Integer.toString(
							Integer.parseInt(inglaterragp.getText()) + (Integer.parseInt(textD6_2.getText()))));

					costaricagc.setText(Integer.toString(
							Integer.parseInt(costaricagc.getText()) + (Integer.parseInt(textD6_2.getText()))));
					inglaterragc.setText(Integer.toString(
							Integer.parseInt(inglaterragc.getText()) + (Integer.parseInt(textD6_1.getText()))));

					costaricasg.setText(Integer.toString(
							Integer.parseInt(costaricagp.getText()) - (Integer.parseInt(costaricagc.getText()))));
					inglaterrasg.setText(Integer.toString(
							Integer.parseInt(inglaterragp.getText()) - (Integer.parseInt(inglaterragc.getText()))));

					if (Integer.parseInt(textD6_1.getText()) > Integer.parseInt(textD6_2.getText())) {
						costaricav.setText(Integer.toString(Integer.parseInt(costaricav.getText()) + 1));
						inglaterrad.setText(Integer.toString(Integer.parseInt(inglaterrad.getText()) + 1));
						costaricap.setText(Integer.toString(Integer.parseInt(costaricap.getText()) + 3));
					} else if (Integer.parseInt(textD6_2.getText()) > Integer.parseInt(textD6_1.getText())) {
						costaricad.setText(Integer.toString(Integer.parseInt(costaricad.getText()) + 1));
						inglaterrap.setText(Integer.toString(Integer.parseInt(inglaterrap.getText()) + 3));
						inglaterrav.setText(Integer.toString(Integer.parseInt(inglaterrav.getText()) + 1));
					} else {
						costaricae.setText(Integer.toString(Integer.parseInt(costaricae.getText()) + 1));
						inglaterrae.setText(Integer.toString(Integer.parseInt(inglaterrae.getText()) + 1));
						inglaterrap.setText(Integer.toString(Integer.parseInt(inglaterrap.getText()) + 1));
						costaricap.setText(Integer.toString(Integer.parseInt(costaricap.getText()) + 1));
					}

					Jogo jogo24 = ControleJogo.criaJogo("Costarica", Integer.parseInt(textD3_1.getText()), "Inglaterra",
							Integer.parseInt(textD3_2.getText()));
					if (!jogos.contains(jogo24)) {
						Persistence.save(jogo24);
					}

				}

				/*
				 * GRUPO E
				 */

				// suica x equador
				if (!(textE1_1.getText().isEmpty() && textE1_2.getText().isEmpty())) {
					suicaj.setText(Integer.toString(Integer.parseInt(suicaj.getText()) + 1));
					equadorj.setText(Integer.toString(Integer.parseInt(equadorj.getText()) + 1));

					suicagp.setText(Integer
							.toString(Integer.parseInt(suicagp.getText()) + (Integer.parseInt(textE1_1.getText()))));
					equadorgp.setText(Integer
							.toString(Integer.parseInt(equadorgp.getText()) + (Integer.parseInt(textE1_2.getText()))));

					suicagc.setText(Integer
							.toString(Integer.parseInt(suicagc.getText()) + (Integer.parseInt(textE1_2.getText()))));
					equadorgc.setText(Integer
							.toString(Integer.parseInt(equadorgc.getText()) + (Integer.parseInt(textE1_1.getText()))));

					suicasg.setText(Integer
							.toString(Integer.parseInt(suicagp.getText()) - (Integer.parseInt(suicagc.getText()))));
					equadorsg.setText(Integer
							.toString(Integer.parseInt(equadorgp.getText()) - (Integer.parseInt(equadorgc.getText()))));

					if (Integer.parseInt(textE1_1.getText()) > Integer.parseInt(textE1_2.getText())) {
						suicav.setText(Integer.toString(Integer.parseInt(suicav.getText()) + 1));
						equadord.setText(Integer.toString(Integer.parseInt(equadord.getText()) + 1));
						suicap.setText(Integer.toString(Integer.parseInt(suicap.getText()) + 3));
					} else if (Integer.parseInt(textE1_2.getText()) > Integer.parseInt(textE1_1.getText())) {
						suicad.setText(Integer.toString(Integer.parseInt(suicad.getText()) + 1));
						equadorp.setText(Integer.toString(Integer.parseInt(equadorp.getText()) + 3));
						equadorv.setText(Integer.toString(Integer.parseInt(equadorv.getText()) + 1));
					} else {
						suicae.setText(Integer.toString(Integer.parseInt(suicae.getText()) + 1));
						equadore.setText(Integer.toString(Integer.parseInt(equadore.getText()) + 1));
						equadorp.setText(Integer.toString(Integer.parseInt(equadorp.getText()) + 1));
						suicap.setText(Integer.toString(Integer.parseInt(suicap.getText()) + 1));
					}

					Jogo jogo25 = ControleJogo.criaJogo("Suica", Integer.parseInt(textE1_1.getText()), "Equador",
							Integer.parseInt(textE1_2.getText()));
					if (!jogos.contains(jogo25)) {
						Persistence.save(jogo25);
					}
				}

				// franca x honduras
				if (!(textE2_1.getText().isEmpty() && textE2_2.getText().isEmpty())) {
					francaj.setText(Integer.toString(Integer.parseInt(francaj.getText()) + 1));
					hondurasj.setText(Integer.toString(Integer.parseInt(hondurasj.getText()) + 1));

					francagp.setText(Integer
							.toString(Integer.parseInt(francagp.getText()) + (Integer.parseInt(textE2_1.getText()))));
					hondurasgp.setText(Integer
							.toString(Integer.parseInt(hondurasgp.getText()) + (Integer.parseInt(textE2_2.getText()))));

					francagc.setText(Integer
							.toString(Integer.parseInt(francagc.getText()) + (Integer.parseInt(textE2_2.getText()))));
					hondurasgc.setText(Integer
							.toString(Integer.parseInt(hondurasgc.getText()) + (Integer.parseInt(textE2_1.getText()))));

					francasg.setText(Integer
							.toString(Integer.parseInt(francagp.getText()) - (Integer.parseInt(francagc.getText()))));
					hondurassg.setText(Integer.toString(
							Integer.parseInt(hondurasgp.getText()) - (Integer.parseInt(hondurasgc.getText()))));

					if (Integer.parseInt(textE2_1.getText()) > Integer.parseInt(textE2_2.getText())) {
						francav.setText(Integer.toString(Integer.parseInt(francav.getText()) + 1));
						hondurasd.setText(Integer.toString(Integer.parseInt(hondurasd.getText()) + 1));
						francap.setText(Integer.toString(Integer.parseInt(francap.getText()) + 3));
					} else if (Integer.parseInt(textE2_2.getText()) > Integer.parseInt(textE2_1.getText())) {
						francad.setText(Integer.toString(Integer.parseInt(francad.getText()) + 1));
						hondurasp.setText(Integer.toString(Integer.parseInt(hondurasp.getText()) + 3));
						hondurasv.setText(Integer.toString(Integer.parseInt(hondurasv.getText()) + 1));
					} else {
						francae.setText(Integer.toString(Integer.parseInt(francae.getText()) + 1));
						hondurase.setText(Integer.toString(Integer.parseInt(hondurase.getText()) + 1));
						hondurasp.setText(Integer.toString(Integer.parseInt(hondurasp.getText()) + 1));
						francap.setText(Integer.toString(Integer.parseInt(francap.getText()) + 1));
					}

					Jogo jogo26 = ControleJogo.criaJogo("Franca", Integer.parseInt(textE2_1.getText()), "Honduras",
							Integer.parseInt(textE2_2.getText()));
					if (!jogos.contains(jogo26)) {
						Persistence.save(jogo26);
					}

				}

				// suica x franca
				if (!(textE3_1.getText().isEmpty() && textE3_2.getText().isEmpty())) {
					suicaj.setText(Integer.toString(Integer.parseInt(suicaj.getText()) + 1));
					francaj.setText(Integer.toString(Integer.parseInt(francaj.getText()) + 1));

					suicagp.setText(Integer
							.toString(Integer.parseInt(suicagp.getText()) + (Integer.parseInt(textE3_1.getText()))));
					francagp.setText(Integer
							.toString(Integer.parseInt(francagp.getText()) + (Integer.parseInt(textE3_2.getText()))));

					suicagc.setText(Integer
							.toString(Integer.parseInt(suicagc.getText()) + (Integer.parseInt(textE3_2.getText()))));
					francagc.setText(Integer
							.toString(Integer.parseInt(francagc.getText()) + (Integer.parseInt(textE3_1.getText()))));

					suicasg.setText(Integer
							.toString(Integer.parseInt(suicagp.getText()) - (Integer.parseInt(suicagc.getText()))));
					francasg.setText(Integer
							.toString(Integer.parseInt(francagp.getText()) - (Integer.parseInt(francagc.getText()))));

					if (Integer.parseInt(textE3_1.getText()) > Integer.parseInt(textE3_2.getText())) {
						suicav.setText(Integer.toString(Integer.parseInt(suicav.getText()) + 1));
						francad.setText(Integer.toString(Integer.parseInt(francad.getText()) + 1));
						suicap.setText(Integer.toString(Integer.parseInt(suicap.getText()) + 3));
					} else if (Integer.parseInt(textE3_2.getText()) > Integer.parseInt(textE3_1.getText())) {
						suicad.setText(Integer.toString(Integer.parseInt(suicad.getText()) + 1));
						francap.setText(Integer.toString(Integer.parseInt(francap.getText()) + 3));
						francav.setText(Integer.toString(Integer.parseInt(francav.getText()) + 1));
					} else {
						suicae.setText(Integer.toString(Integer.parseInt(suicae.getText()) + 1));
						francae.setText(Integer.toString(Integer.parseInt(francae.getText()) + 1));
						francap.setText(Integer.toString(Integer.parseInt(francap.getText()) + 1));
						suicap.setText(Integer.toString(Integer.parseInt(suicap.getText()) + 1));
					}
					Jogo jogo27 = ControleJogo.criaJogo("Suica", Integer.parseInt(textE3_1.getText()), "Franca",
							Integer.parseInt(textE3_2.getText()));
					if (!jogos.contains(jogo27)) {
						Persistence.save(jogo27);
					}

				}

				// honduras x equador
				if (!(textE4_1.getText().isEmpty() && textE4_2.getText().isEmpty())) {
					hondurasj.setText(Integer.toString(Integer.parseInt(hondurasj.getText()) + 1));
					equadorj.setText(Integer.toString(Integer.parseInt(equadorj.getText()) + 1));

					hondurasgp.setText(Integer
							.toString(Integer.parseInt(hondurasgp.getText()) + (Integer.parseInt(textE4_1.getText()))));
					equadorgp.setText(Integer
							.toString(Integer.parseInt(equadorgp.getText()) + (Integer.parseInt(textE4_2.getText()))));

					hondurasgc.setText(Integer
							.toString(Integer.parseInt(hondurasgc.getText()) + (Integer.parseInt(textE4_2.getText()))));
					equadorgc.setText(Integer
							.toString(Integer.parseInt(equadorgc.getText()) + (Integer.parseInt(textE4_1.getText()))));

					hondurassg.setText(Integer.toString(
							Integer.parseInt(hondurasgp.getText()) - (Integer.parseInt(hondurasgc.getText()))));
					equadorsg.setText(Integer
							.toString(Integer.parseInt(equadorgp.getText()) - (Integer.parseInt(equadorgc.getText()))));

					if (Integer.parseInt(textE4_1.getText()) > Integer.parseInt(textE4_2.getText())) {
						hondurasv.setText(Integer.toString(Integer.parseInt(hondurasv.getText()) + 1));
						equadord.setText(Integer.toString(Integer.parseInt(equadord.getText()) + 1));
						hondurasp.setText(Integer.toString(Integer.parseInt(hondurasp.getText()) + 3));
					} else if (Integer.parseInt(textE4_2.getText()) > Integer.parseInt(textE4_1.getText())) {
						hondurasd.setText(Integer.toString(Integer.parseInt(hondurasd.getText()) + 1));
						equadorp.setText(Integer.toString(Integer.parseInt(equadorp.getText()) + 3));
						equadorv.setText(Integer.toString(Integer.parseInt(equadorv.getText()) + 1));
					} else {
						hondurase.setText(Integer.toString(Integer.parseInt(hondurase.getText()) + 1));
						equadore.setText(Integer.toString(Integer.parseInt(equadore.getText()) + 1));
						equadorp.setText(Integer.toString(Integer.parseInt(equadorp.getText()) + 1));
						hondurasp.setText(Integer.toString(Integer.parseInt(hondurasp.getText()) + 1));
					}

					Jogo jogo28 = ControleJogo.criaJogo("Honduras", Integer.parseInt(textE4_1.getText()), "Equador",
							Integer.parseInt(textE4_2.getText()));
					if (!jogos.contains(jogo28)) {
						Persistence.save(jogo28);
					}

				}

				// honduras x suica
				if (!(textE5_1.getText().isEmpty() && textE5_2.getText().isEmpty())) {
					hondurasj.setText(Integer.toString(Integer.parseInt(hondurasj.getText()) + 1));
					suicaj.setText(Integer.toString(Integer.parseInt(suicaj.getText()) + 1));

					hondurasgp.setText(Integer
							.toString(Integer.parseInt(hondurasgp.getText()) + (Integer.parseInt(textE5_1.getText()))));
					suicagp.setText(Integer
							.toString(Integer.parseInt(suicagp.getText()) + (Integer.parseInt(textE5_2.getText()))));

					hondurasgc.setText(Integer
							.toString(Integer.parseInt(hondurasgc.getText()) + (Integer.parseInt(textE5_2.getText()))));
					suicagc.setText(Integer
							.toString(Integer.parseInt(suicagc.getText()) + (Integer.parseInt(textE5_1.getText()))));

					hondurassg.setText(Integer.toString(
							Integer.parseInt(hondurasgp.getText()) - (Integer.parseInt(hondurasgc.getText()))));
					suicasg.setText(Integer
							.toString(Integer.parseInt(suicagp.getText()) - (Integer.parseInt(suicagc.getText()))));

					if (Integer.parseInt(textE5_1.getText()) > Integer.parseInt(textE5_2.getText())) {
						hondurasv.setText(Integer.toString(Integer.parseInt(hondurasv.getText()) + 1));
						suicad.setText(Integer.toString(Integer.parseInt(suicad.getText()) + 1));
						hondurasp.setText(Integer.toString(Integer.parseInt(hondurasp.getText()) + 3));
					} else if (Integer.parseInt(textE5_2.getText()) > Integer.parseInt(textE5_1.getText())) {
						hondurasd.setText(Integer.toString(Integer.parseInt(hondurasd.getText()) + 1));
						suicap.setText(Integer.toString(Integer.parseInt(suicap.getText()) + 3));
						suicav.setText(Integer.toString(Integer.parseInt(suicav.getText()) + 1));
					} else {
						hondurase.setText(Integer.toString(Integer.parseInt(hondurase.getText()) + 1));
						suicae.setText(Integer.toString(Integer.parseInt(suicae.getText()) + 1));
						suicap.setText(Integer.toString(Integer.parseInt(suicap.getText()) + 1));
						hondurasp.setText(Integer.toString(Integer.parseInt(hondurasp.getText()) + 1));
					}

					Jogo jogo29 = ControleJogo.criaJogo("Honduras", Integer.parseInt(textE5_1.getText()), "Suica",
							Integer.parseInt(textE5_2.getText()));
					if (!jogos.contains(jogo29)) {
						Persistence.save(jogo29);
					}

				}

				// equador x franca
				if (!(textE6_1.getText().isEmpty() && textE6_2.getText().isEmpty())) {
					equadorj.setText(Integer.toString(Integer.parseInt(equadorj.getText()) + 1));
					francaj.setText(Integer.toString(Integer.parseInt(francaj.getText()) + 1));

					equadorgp.setText(Integer
							.toString(Integer.parseInt(equadorgp.getText()) + (Integer.parseInt(textE6_1.getText()))));
					francagp.setText(Integer
							.toString(Integer.parseInt(francagp.getText()) + (Integer.parseInt(textE6_2.getText()))));

					equadorgc.setText(Integer
							.toString(Integer.parseInt(equadorgc.getText()) + (Integer.parseInt(textE6_2.getText()))));
					francagc.setText(Integer
							.toString(Integer.parseInt(francagc.getText()) + (Integer.parseInt(textE6_1.getText()))));

					equadorsg.setText(Integer
							.toString(Integer.parseInt(equadorgp.getText()) - (Integer.parseInt(equadorgc.getText()))));
					francasg.setText(Integer
							.toString(Integer.parseInt(francagp.getText()) - (Integer.parseInt(francagc.getText()))));

					if (Integer.parseInt(textE6_1.getText()) > Integer.parseInt(textE6_2.getText())) {
						equadorv.setText(Integer.toString(Integer.parseInt(equadorv.getText()) + 1));
						francad.setText(Integer.toString(Integer.parseInt(francad.getText()) + 1));
						equadorp.setText(Integer.toString(Integer.parseInt(equadorp.getText()) + 3));
					} else if (Integer.parseInt(textE6_2.getText()) > Integer.parseInt(textE6_1.getText())) {
						equadord.setText(Integer.toString(Integer.parseInt(equadord.getText()) + 1));
						francap.setText(Integer.toString(Integer.parseInt(francap.getText()) + 3));
						francav.setText(Integer.toString(Integer.parseInt(francav.getText()) + 1));
					} else {
						equadore.setText(Integer.toString(Integer.parseInt(equadore.getText()) + 1));
						francae.setText(Integer.toString(Integer.parseInt(francae.getText()) + 1));
						francap.setText(Integer.toString(Integer.parseInt(francap.getText()) + 1));
						equadorp.setText(Integer.toString(Integer.parseInt(equadorp.getText()) + 1));
					}

					Jogo jogo30 = ControleJogo.criaJogo("Equador", Integer.parseInt(textE6_1.getText()), "Franca",
							Integer.parseInt(textE6_2.getText()));
					if (!jogos.contains(jogo30)) {
						Persistence.save(jogo30);
					}

				}

				/*
				 * GRUPO F
				 */

				// argentina x bosnia
				if (!(textF1_1.getText().isEmpty() && textF1_2.getText().isEmpty())) {
					argentinaj.setText(Integer.toString(Integer.parseInt(argentinaj.getText()) + 1));
					bosniaj.setText(Integer.toString(Integer.parseInt(bosniaj.getText()) + 1));

					argentinagp.setText(Integer.toString(
							Integer.parseInt(argentinagp.getText()) + (Integer.parseInt(textF1_1.getText()))));
					bosniagp.setText(Integer
							.toString(Integer.parseInt(bosniagp.getText()) + (Integer.parseInt(textF1_2.getText()))));

					argentinagc.setText(Integer.toString(
							Integer.parseInt(argentinagc.getText()) + (Integer.parseInt(textF1_2.getText()))));
					bosniagc.setText(Integer
							.toString(Integer.parseInt(bosniagc.getText()) + (Integer.parseInt(textF1_1.getText()))));

					argentinasg.setText(Integer.toString(
							Integer.parseInt(argentinagp.getText()) - (Integer.parseInt(argentinagc.getText()))));
					bosniasg.setText(Integer
							.toString(Integer.parseInt(bosniagp.getText()) - (Integer.parseInt(bosniagc.getText()))));

					if (Integer.parseInt(textF1_1.getText()) > Integer.parseInt(textF1_2.getText())) {
						argentinav.setText(Integer.toString(Integer.parseInt(argentinav.getText()) + 1));
						bosniad.setText(Integer.toString(Integer.parseInt(bosniad.getText()) + 1));
						argentinap.setText(Integer.toString(Integer.parseInt(argentinap.getText()) + 3));
					} else if (Integer.parseInt(textF1_2.getText()) > Integer.parseInt(textF1_1.getText())) {
						argentinad.setText(Integer.toString(Integer.parseInt(argentinad.getText()) + 1));
						bosniap.setText(Integer.toString(Integer.parseInt(bosniap.getText()) + 3));
						bosniav.setText(Integer.toString(Integer.parseInt(bosniav.getText()) + 1));
					} else {
						argentinae.setText(Integer.toString(Integer.parseInt(argentinae.getText()) + 1));
						bosniae.setText(Integer.toString(Integer.parseInt(bosniae.getText()) + 1));
						bosniap.setText(Integer.toString(Integer.parseInt(bosniap.getText()) + 1));
						argentinap.setText(Integer.toString(Integer.parseInt(argentinap.getText()) + 1));
					}

					Jogo jogo31 = ControleJogo.criaJogo("Argentina", Integer.parseInt(textF1_1.getText()), "Bosnia",
							Integer.parseInt(textF1_2.getText()));
					if (!jogos.contains(jogo31)) {
						Persistence.save(jogo31);
					}

				}

				// ira x nigeria
				if (!(textF2_1.getText().isEmpty() && textF2_2.getText().isEmpty())) {
					iraj.setText(Integer.toString(Integer.parseInt(iraj.getText()) + 1));
					nigeriaj.setText(Integer.toString(Integer.parseInt(nigeriaj.getText()) + 1));

					iragp.setText(Integer
							.toString(Integer.parseInt(iragp.getText()) + (Integer.parseInt(textF2_1.getText()))));
					nigeriagp.setText(Integer
							.toString(Integer.parseInt(nigeriagp.getText()) + (Integer.parseInt(textF2_2.getText()))));

					iragc.setText(Integer
							.toString(Integer.parseInt(iragc.getText()) + (Integer.parseInt(textF2_2.getText()))));
					nigeriagc.setText(Integer
							.toString(Integer.parseInt(nigeriagc.getText()) + (Integer.parseInt(textF2_1.getText()))));

					irasg.setText(
							Integer.toString(Integer.parseInt(iragp.getText()) - (Integer.parseInt(iragc.getText()))));
					nigeriasg.setText(Integer
							.toString(Integer.parseInt(nigeriagp.getText()) - (Integer.parseInt(croaciagc.getText()))));

					if (Integer.parseInt(textF2_1.getText()) > Integer.parseInt(textF2_2.getText())) {
						irav.setText(Integer.toString(Integer.parseInt(irav.getText()) + 1));
						nigeriad.setText(Integer.toString(Integer.parseInt(nigeriad.getText()) + 1));
						irap.setText(Integer.toString(Integer.parseInt(irap.getText()) + 3));
					} else if (Integer.parseInt(textF2_2.getText()) > Integer.parseInt(textF2_1.getText())) {
						irad.setText(Integer.toString(Integer.parseInt(irad.getText()) + 1));
						nigeriap.setText(Integer.toString(Integer.parseInt(nigeriap.getText()) + 3));
						nigeriav.setText(Integer.toString(Integer.parseInt(nigeriav.getText()) + 1));
					} else {
						irae.setText(Integer.toString(Integer.parseInt(irae.getText()) + 1));
						nigeriae.setText(Integer.toString(Integer.parseInt(nigeriae.getText()) + 1));
						nigeriap.setText(Integer.toString(Integer.parseInt(nigeriap.getText()) + 1));
						irap.setText(Integer.toString(Integer.parseInt(irap.getText()) + 1));
					}

					Jogo jogo32 = ControleJogo.criaJogo("Ira", Integer.parseInt(textF2_1.getText()), "Nigeria",
							Integer.parseInt(textF2_2.getText()));
					if (!jogos.contains(jogo32)) {
						Persistence.save(jogo32);
					}

				}

				// argentina x ira
				if (!(textF3_1.getText().isEmpty() && textF3_2.getText().isEmpty())) {
					argentinaj.setText(Integer.toString(Integer.parseInt(argentinaj.getText()) + 1));
					iraj.setText(Integer.toString(Integer.parseInt(iraj.getText()) + 1));

					argentinagp.setText(Integer.toString(
							Integer.parseInt(argentinagp.getText()) + (Integer.parseInt(textF3_1.getText()))));
					iragp.setText(Integer
							.toString(Integer.parseInt(iragp.getText()) + (Integer.parseInt(textF3_2.getText()))));

					argentinagc.setText(Integer.toString(
							Integer.parseInt(argentinagc.getText()) + (Integer.parseInt(textF3_2.getText()))));
					iragc.setText(Integer
							.toString(Integer.parseInt(iragc.getText()) + (Integer.parseInt(textF3_1.getText()))));

					argentinasg.setText(Integer.toString(
							Integer.parseInt(argentinagp.getText()) - (Integer.parseInt(argentinagc.getText()))));
					irasg.setText(
							Integer.toString(Integer.parseInt(iragp.getText()) - (Integer.parseInt(iragc.getText()))));

					if (Integer.parseInt(textF3_1.getText()) > Integer.parseInt(textF3_2.getText())) {
						argentinav.setText(Integer.toString(Integer.parseInt(argentinav.getText()) + 1));
						irad.setText(Integer.toString(Integer.parseInt(irad.getText()) + 1));
						argentinap.setText(Integer.toString(Integer.parseInt(argentinap.getText()) + 3));
					} else if (Integer.parseInt(textF3_2.getText()) > Integer.parseInt(textF3_1.getText())) {
						argentinad.setText(Integer.toString(Integer.parseInt(argentinad.getText()) + 1));
						irap.setText(Integer.toString(Integer.parseInt(irap.getText()) + 3));
						irav.setText(Integer.toString(Integer.parseInt(irav.getText()) + 1));
					} else {
						argentinae.setText(Integer.toString(Integer.parseInt(argentinae.getText()) + 1));
						irae.setText(Integer.toString(Integer.parseInt(irae.getText()) + 1));
						irap.setText(Integer.toString(Integer.parseInt(irap.getText()) + 1));
						argentinap.setText(Integer.toString(Integer.parseInt(argentinap.getText()) + 1));
					}

					Jogo jogo33 = ControleJogo.criaJogo("Argentina", Integer.parseInt(textF3_1.getText()), "Ira",
							Integer.parseInt(textF3_2.getText()));
					if (!jogos.contains(jogo33)) {
						Persistence.save(jogo33);
					}

				}

				// nigeria x bosnia
				if (!(textF4_1.getText().isEmpty() && textF4_2.getText().isEmpty())) {
					nigeriaj.setText(Integer.toString(Integer.parseInt(nigeriaj.getText()) + 1));
					bosniaj.setText(Integer.toString(Integer.parseInt(bosniaj.getText()) + 1));

					nigeriagp.setText(Integer
							.toString(Integer.parseInt(nigeriagp.getText()) + (Integer.parseInt(textF4_1.getText()))));
					bosniagp.setText(Integer
							.toString(Integer.parseInt(bosniagp.getText()) + (Integer.parseInt(textF4_2.getText()))));

					nigeriagc.setText(Integer
							.toString(Integer.parseInt(nigeriagc.getText()) + (Integer.parseInt(textF4_2.getText()))));
					bosniagc.setText(Integer
							.toString(Integer.parseInt(bosniagc.getText()) + (Integer.parseInt(textF4_1.getText()))));

					nigeriasg.setText(Integer
							.toString(Integer.parseInt(nigeriagp.getText()) - (Integer.parseInt(nigeriagc.getText()))));
					bosniasg.setText(Integer
							.toString(Integer.parseInt(bosniagp.getText()) - (Integer.parseInt(bosniagc.getText()))));

					if (Integer.parseInt(textF4_1.getText()) > Integer.parseInt(textF4_2.getText())) {
						nigeriav.setText(Integer.toString(Integer.parseInt(nigeriav.getText()) + 1));
						bosniad.setText(Integer.toString(Integer.parseInt(bosniad.getText()) + 1));
						nigeriap.setText(Integer.toString(Integer.parseInt(nigeriap.getText()) + 3));
					} else if (Integer.parseInt(textF4_2.getText()) > Integer.parseInt(textF4_1.getText())) {
						nigeriad.setText(Integer.toString(Integer.parseInt(nigeriad.getText()) + 1));
						bosniap.setText(Integer.toString(Integer.parseInt(bosniap.getText()) + 3));
						bosniav.setText(Integer.toString(Integer.parseInt(bosniav.getText()) + 1));
					} else {
						nigeriae.setText(Integer.toString(Integer.parseInt(nigeriae.getText()) + 1));
						bosniae.setText(Integer.toString(Integer.parseInt(bosniae.getText()) + 1));
						bosniap.setText(Integer.toString(Integer.parseInt(bosniap.getText()) + 1));
						nigeriap.setText(Integer.toString(Integer.parseInt(nigeriap.getText()) + 1));
					}

					Jogo jogo34 = ControleJogo.criaJogo("Nigeria", Integer.parseInt(textF4_1.getText()), "Bosnia",
							Integer.parseInt(textF4_2.getText()));
					if (!jogos.contains(jogo34)) {
						Persistence.save(jogo34);
					}

				}

				// nigeria x argentina
				if (!(textF5_1.getText().isEmpty() && textF5_2.getText().isEmpty())) {
					nigeriaj.setText(Integer.toString(Integer.parseInt(nigeriaj.getText()) + 1));
					argentinaj.setText(Integer.toString(Integer.parseInt(argentinaj.getText()) + 1));

					nigeriagp.setText(Integer
							.toString(Integer.parseInt(nigeriagp.getText()) + (Integer.parseInt(textF5_1.getText()))));
					argentinagp.setText(Integer.toString(
							Integer.parseInt(argentinagp.getText()) + (Integer.parseInt(textF5_2.getText()))));

					nigeriagc.setText(Integer
							.toString(Integer.parseInt(nigeriagc.getText()) + (Integer.parseInt(textF5_2.getText()))));
					argentinagc.setText(Integer.toString(
							Integer.parseInt(argentinagc.getText()) + (Integer.parseInt(textF5_1.getText()))));

					nigeriasg.setText(Integer
							.toString(Integer.parseInt(nigeriagp.getText()) - (Integer.parseInt(nigeriagc.getText()))));
					argentinasg.setText(Integer.toString(
							Integer.parseInt(argentinagp.getText()) - (Integer.parseInt(argentinagc.getText()))));

					if (Integer.parseInt(textF5_1.getText()) > Integer.parseInt(textF5_2.getText())) {
						nigeriav.setText(Integer.toString(Integer.parseInt(nigeriav.getText()) + 1));
						argentinad.setText(Integer.toString(Integer.parseInt(argentinad.getText()) + 1));
						nigeriap.setText(Integer.toString(Integer.parseInt(nigeriap.getText()) + 3));
					} else if (Integer.parseInt(textF5_2.getText()) > Integer.parseInt(textF5_1.getText())) {
						nigeriad.setText(Integer.toString(Integer.parseInt(nigeriad.getText()) + 1));
						argentinap.setText(Integer.toString(Integer.parseInt(argentinap.getText()) + 3));
						argentinav.setText(Integer.toString(Integer.parseInt(argentinav.getText()) + 1));
					} else {
						nigeriae.setText(Integer.toString(Integer.parseInt(nigeriae.getText()) + 1));
						argentinae.setText(Integer.toString(Integer.parseInt(argentinae.getText()) + 1));
						argentinap.setText(Integer.toString(Integer.parseInt(argentinap.getText()) + 1));
						nigeriap.setText(Integer.toString(Integer.parseInt(nigeriap.getText()) + 1));
					}

					Jogo jogo35 = ControleJogo.criaJogo("Nigeria", Integer.parseInt(textF5_1.getText()), "Argentina",
							Integer.parseInt(textF5_2.getText()));
					if (!jogos.contains(jogo35)) {
						Persistence.save(jogo35);
					}

				}

				// bosnia x ira
				if (!(textF6_1.getText().isEmpty() && textF6_2.getText().isEmpty())) {
					bosniaj.setText(Integer.toString(Integer.parseInt(bosniaj.getText()) + 1));
					iraj.setText(Integer.toString(Integer.parseInt(iraj.getText()) + 1));

					bosniagp.setText(Integer
							.toString(Integer.parseInt(bosniagp.getText()) + (Integer.parseInt(textF6_1.getText()))));
					iragp.setText(Integer
							.toString(Integer.parseInt(iragp.getText()) + (Integer.parseInt(textF6_2.getText()))));

					bosniagc.setText(Integer
							.toString(Integer.parseInt(bosniagc.getText()) + (Integer.parseInt(textF6_2.getText()))));
					iragc.setText(Integer
							.toString(Integer.parseInt(iragc.getText()) + (Integer.parseInt(textF6_1.getText()))));

					bosniasg.setText(Integer
							.toString(Integer.parseInt(bosniagp.getText()) - (Integer.parseInt(bosniagc.getText()))));
					irasg.setText(
							Integer.toString(Integer.parseInt(iragp.getText()) - (Integer.parseInt(iragc.getText()))));

					if (Integer.parseInt(textF6_1.getText()) > Integer.parseInt(textF6_2.getText())) {
						bosniav.setText(Integer.toString(Integer.parseInt(bosniav.getText()) + 1));
						irad.setText(Integer.toString(Integer.parseInt(irad.getText()) + 1));
						argentinap.setText(Integer.toString(Integer.parseInt(argentinap.getText()) + 3));
					} else if (Integer.parseInt(textF6_2.getText()) > Integer.parseInt(textF6_1.getText())) {
						bosniad.setText(Integer.toString(Integer.parseInt(bosniad.getText()) + 1));
						irap.setText(Integer.toString(Integer.parseInt(irap.getText()) + 3));
						irav.setText(Integer.toString(Integer.parseInt(irav.getText()) + 1));
					} else {
						bosniae.setText(Integer.toString(Integer.parseInt(bosniae.getText()) + 1));
						irae.setText(Integer.toString(Integer.parseInt(irae.getText()) + 1));
						irap.setText(Integer.toString(Integer.parseInt(irap.getText()) + 1));
						bosniap.setText(Integer.toString(Integer.parseInt(bosniap.getText()) + 1));
					}

					Jogo jogo36 = ControleJogo.criaJogo("Bosnia", Integer.parseInt(textF6_1.getText()), "Ira",
							Integer.parseInt(textF6_2.getText()));
					if (!jogos.contains(jogo36)) {
						Persistence.save(jogo36);
					}

				}

				/**
				 * GRUPO G
				 */
				// alemanha x portugal
				if (!(textG1_1.getText().isEmpty() && textG1_2.getText().isEmpty())) {
					alemanhaj.setText(Integer.toString(Integer.parseInt(alemanhaj.getText()) + 1));
					portugalj.setText(Integer.toString(Integer.parseInt(portugalj.getText()) + 1));

					alemanhagp.setText(Integer
							.toString(Integer.parseInt(alemanhagp.getText()) + (Integer.parseInt(textG1_1.getText()))));
					portugalgp.setText(Integer
							.toString(Integer.parseInt(portugalgp.getText()) + (Integer.parseInt(textG1_2.getText()))));

					alemanhagc.setText(Integer
							.toString(Integer.parseInt(alemanhagc.getText()) + (Integer.parseInt(textG1_2.getText()))));
					portugalgc.setText(Integer
							.toString(Integer.parseInt(portugalgc.getText()) + (Integer.parseInt(textG1_1.getText()))));

					alemanhasg.setText(Integer.toString(
							Integer.parseInt(alemanhagp.getText()) - (Integer.parseInt(alemanhagc.getText()))));
					portugalsg.setText(Integer.toString(
							Integer.parseInt(portugalgp.getText()) - (Integer.parseInt(portugalgc.getText()))));

					if (Integer.parseInt(textG1_1.getText()) > Integer.parseInt(textG1_2.getText())) {
						alemanhav.setText(Integer.toString(Integer.parseInt(alemanhav.getText()) + 1));
						portugald.setText(Integer.toString(Integer.parseInt(portugald.getText()) + 1));
						alemanhap.setText(Integer.toString(Integer.parseInt(alemanhap.getText()) + 3));
					} else if (Integer.parseInt(textG1_2.getText()) > Integer.parseInt(textG1_1.getText())) {
						alemanhad.setText(Integer.toString(Integer.parseInt(alemanhad.getText()) + 1));
						portugalp.setText(Integer.toString(Integer.parseInt(portugalp.getText()) + 3));
						portugalv.setText(Integer.toString(Integer.parseInt(portugalv.getText()) + 1));
					} else {
						alemanhae.setText(Integer.toString(Integer.parseInt(alemanhae.getText()) + 1));
						portugale.setText(Integer.toString(Integer.parseInt(portugale.getText()) + 1));
						portugalp.setText(Integer.toString(Integer.parseInt(portugalp.getText()) + 1));
						alemanhap.setText(Integer.toString(Integer.parseInt(alemanhap.getText()) + 1));
					}

					Jogo jogo37 = ControleJogo.criaJogo("Alemanha", Integer.parseInt(textG1_1.getText()), "Portugal",
							Integer.parseInt(textG1_2.getText()));
					if (!jogos.contains(jogo37)) {
						Persistence.save(jogo37);
					}

				}

				// gana x eua
				if (!(textG2_1.getText().isEmpty() && textG2_2.getText().isEmpty())) {
					ganaj.setText(Integer.toString(Integer.parseInt(ganaj.getText()) + 1));
					euaj.setText(Integer.toString(Integer.parseInt(euaj.getText()) + 1));

					ganagp.setText(Integer
							.toString(Integer.parseInt(ganagp.getText()) + (Integer.parseInt(textG2_1.getText()))));
					euagp.setText(Integer
							.toString(Integer.parseInt(euagp.getText()) + (Integer.parseInt(textG2_2.getText()))));

					ganagc.setText(Integer
							.toString(Integer.parseInt(ganagc.getText()) + (Integer.parseInt(textG2_2.getText()))));
					euagc.setText(Integer
							.toString(Integer.parseInt(euagc.getText()) + (Integer.parseInt(textG2_1.getText()))));

					ganasg.setText(Integer
							.toString(Integer.parseInt(ganagp.getText()) - (Integer.parseInt(ganagc.getText()))));
					euasg.setText(
							Integer.toString(Integer.parseInt(euagp.getText()) - (Integer.parseInt(euagc.getText()))));

					if (Integer.parseInt(textG2_1.getText()) > Integer.parseInt(textG2_2.getText())) {
						ganav.setText(Integer.toString(Integer.parseInt(ganav.getText()) + 1));
						euad.setText(Integer.toString(Integer.parseInt(euad.getText()) + 1));
						ganap.setText(Integer.toString(Integer.parseInt(ganap.getText()) + 3));
					} else if (Integer.parseInt(textG2_2.getText()) > Integer.parseInt(textG2_1.getText())) {
						ganad.setText(Integer.toString(Integer.parseInt(ganad.getText()) + 1));
						euap.setText(Integer.toString(Integer.parseInt(euap.getText()) + 3));
						euav.setText(Integer.toString(Integer.parseInt(euav.getText()) + 1));
					} else {
						ganae.setText(Integer.toString(Integer.parseInt(ganae.getText()) + 1));
						euae.setText(Integer.toString(Integer.parseInt(euae.getText()) + 1));
						euap.setText(Integer.toString(Integer.parseInt(euap.getText()) + 1));
						ganap.setText(Integer.toString(Integer.parseInt(ganap.getText()) + 1));
					}

					Jogo jogo38 = ControleJogo.criaJogo("Gana", Integer.parseInt(textG2_1.getText()), "Eua",
							Integer.parseInt(textG2_2.getText()));
					if (!jogos.contains(jogo38)) {
						Persistence.save(jogo38);
					}

				}

				// alemanha x gana
				if (!(textG3_1.getText().isEmpty() && textG3_2.getText().isEmpty())) {
					alemanhaj.setText(Integer.toString(Integer.parseInt(alemanhaj.getText()) + 1));
					ganaj.setText(Integer.toString(Integer.parseInt(ganaj.getText()) + 1));

					alemanhagp.setText(Integer
							.toString(Integer.parseInt(alemanhagp.getText()) + (Integer.parseInt(textG3_1.getText()))));
					ganagp.setText(Integer
							.toString(Integer.parseInt(ganagp.getText()) + (Integer.parseInt(textG3_2.getText()))));

					alemanhagc.setText(Integer
							.toString(Integer.parseInt(alemanhagc.getText()) + (Integer.parseInt(textG3_2.getText()))));
					ganagc.setText(Integer
							.toString(Integer.parseInt(ganagc.getText()) + (Integer.parseInt(textG3_1.getText()))));

					alemanhasg.setText(Integer.toString(
							Integer.parseInt(alemanhagp.getText()) - (Integer.parseInt(alemanhagc.getText()))));
					ganasg.setText(Integer
							.toString(Integer.parseInt(ganagp.getText()) - (Integer.parseInt(ganagc.getText()))));

					if (Integer.parseInt(textG3_1.getText()) > Integer.parseInt(textG3_2.getText())) {
						alemanhav.setText(Integer.toString(Integer.parseInt(alemanhav.getText()) + 1));
						ganad.setText(Integer.toString(Integer.parseInt(ganad.getText()) + 1));
						alemanhap.setText(Integer.toString(Integer.parseInt(alemanhap.getText()) + 3));
					} else if (Integer.parseInt(textG3_2.getText()) > Integer.parseInt(textG3_1.getText())) {
						alemanhad.setText(Integer.toString(Integer.parseInt(alemanhad.getText()) + 1));
						ganap.setText(Integer.toString(Integer.parseInt(ganap.getText()) + 3));
						ganav.setText(Integer.toString(Integer.parseInt(ganav.getText()) + 1));
					} else {
						alemanhae.setText(Integer.toString(Integer.parseInt(alemanhae.getText()) + 1));
						ganae.setText(Integer.toString(Integer.parseInt(ganae.getText()) + 1));
						ganap.setText(Integer.toString(Integer.parseInt(ganap.getText()) + 1));
						alemanhap.setText(Integer.toString(Integer.parseInt(alemanhap.getText()) + 1));
					}

					Jogo jogo39 = ControleJogo.criaJogo("Alemanha", Integer.parseInt(textG3_1.getText()), "Gana",
							Integer.parseInt(textG3_2.getText()));
					if (!jogos.contains(jogo39)) {
						Persistence.save(jogo39);
					}

				}

				// eua x portugual
				if (!(textG4_1.getText().isEmpty() && textG4_2.getText().isEmpty())) {
					euaj.setText(Integer.toString(Integer.parseInt(euaj.getText()) + 1));
					portugalj.setText(Integer.toString(Integer.parseInt(portugalj.getText()) + 1));

					euagp.setText(Integer
							.toString(Integer.parseInt(euagp.getText()) + (Integer.parseInt(textG4_1.getText()))));
					portugalgp.setText(Integer
							.toString(Integer.parseInt(portugalgp.getText()) + (Integer.parseInt(textG4_2.getText()))));

					euagc.setText(Integer
							.toString(Integer.parseInt(euagc.getText()) + (Integer.parseInt(textG4_2.getText()))));
					portugalgc.setText(Integer
							.toString(Integer.parseInt(portugalgc.getText()) + (Integer.parseInt(textG4_1.getText()))));

					euasg.setText(
							Integer.toString(Integer.parseInt(euagp.getText()) - (Integer.parseInt(euagc.getText()))));
					portugalsg.setText(Integer.toString(
							Integer.parseInt(portugalgp.getText()) - (Integer.parseInt(portugalgc.getText()))));

					if (Integer.parseInt(textG4_1.getText()) > Integer.parseInt(textG4_2.getText())) {
						euav.setText(Integer.toString(Integer.parseInt(euav.getText()) + 1));
						portugald.setText(Integer.toString(Integer.parseInt(portugald.getText()) + 1));
						euap.setText(Integer.toString(Integer.parseInt(euap.getText()) + 3));
					} else if (Integer.parseInt(textG4_2.getText()) > Integer.parseInt(textG4_1.getText())) {
						euad.setText(Integer.toString(Integer.parseInt(euad.getText()) + 1));
						portugalp.setText(Integer.toString(Integer.parseInt(portugalp.getText()) + 3));
						portugalv.setText(Integer.toString(Integer.parseInt(portugalv.getText()) + 1));
					} else {
						euae.setText(Integer.toString(Integer.parseInt(euae.getText()) + 1));
						portugale.setText(Integer.toString(Integer.parseInt(portugale.getText()) + 1));
						portugalp.setText(Integer.toString(Integer.parseInt(portugalp.getText()) + 1));
						euap.setText(Integer.toString(Integer.parseInt(euap.getText()) + 1));
					}

					Jogo jogo40 = ControleJogo.criaJogo("Eua", Integer.parseInt(textG4_1.getText()), "Portugal",
							Integer.parseInt(textG4_2.getText()));
					if (!jogos.contains(jogo40)) {
						Persistence.save(jogo40);
					}

				}

				// eua x alemanha
				if (!(textG5_1.getText().isEmpty() && textG5_2.getText().isEmpty())) {
					euaj.setText(Integer.toString(Integer.parseInt(euaj.getText()) + 1));
					alemanhaj.setText(Integer.toString(Integer.parseInt(alemanhaj.getText()) + 1));

					euagp.setText(Integer
							.toString(Integer.parseInt(euagp.getText()) + (Integer.parseInt(textG5_1.getText()))));
					alemanhagp.setText(Integer
							.toString(Integer.parseInt(alemanhagp.getText()) + (Integer.parseInt(textG5_2.getText()))));

					euagc.setText(Integer
							.toString(Integer.parseInt(euagc.getText()) + (Integer.parseInt(textG5_2.getText()))));
					alemanhagc.setText(Integer
							.toString(Integer.parseInt(alemanhagc.getText()) + (Integer.parseInt(textG5_1.getText()))));

					euasg.setText(
							Integer.toString(Integer.parseInt(euagp.getText()) - (Integer.parseInt(euagc.getText()))));
					alemanhasg.setText(Integer.toString(
							Integer.parseInt(alemanhagp.getText()) - (Integer.parseInt(alemanhagc.getText()))));

					if (Integer.parseInt(textG5_1.getText()) > Integer.parseInt(textG5_2.getText())) {
						euav.setText(Integer.toString(Integer.parseInt(euav.getText()) + 1));
						alemanhad.setText(Integer.toString(Integer.parseInt(alemanhad.getText()) + 1));
						euap.setText(Integer.toString(Integer.parseInt(euap.getText()) + 3));
					} else if (Integer.parseInt(textG5_2.getText()) > Integer.parseInt(textG5_1.getText())) {
						euad.setText(Integer.toString(Integer.parseInt(euad.getText()) + 1));
						alemanhap.setText(Integer.toString(Integer.parseInt(alemanhap.getText()) + 3));
						alemanhav.setText(Integer.toString(Integer.parseInt(alemanhav.getText()) + 1));
					} else {
						euae.setText(Integer.toString(Integer.parseInt(euae.getText()) + 1));
						alemanhae.setText(Integer.toString(Integer.parseInt(alemanhae.getText()) + 1));
						alemanhap.setText(Integer.toString(Integer.parseInt(alemanhap.getText()) + 1));
						euap.setText(Integer.toString(Integer.parseInt(euap.getText()) + 1));
					}

					Jogo jogo41 = ControleJogo.criaJogo("Eua", Integer.parseInt(textG5_1.getText()), "Alemanha",
							Integer.parseInt(textG5_2.getText()));
					if (!jogos.contains(jogo41)) {
						Persistence.save(jogo41);
					}

				}

				// portugual x gana
				if (!(textG6_1.getText().isEmpty() && textG6_2.getText().isEmpty())) {
					portugalj.setText(Integer.toString(Integer.parseInt(portugalj.getText()) + 1));
					ganaj.setText(Integer.toString(Integer.parseInt(ganaj.getText()) + 1));

					portugalgp.setText(Integer
							.toString(Integer.parseInt(portugalgp.getText()) + (Integer.parseInt(textG6_1.getText()))));
					ganagp.setText(Integer
							.toString(Integer.parseInt(ganagp.getText()) + (Integer.parseInt(textG6_2.getText()))));

					portugalgc.setText(Integer
							.toString(Integer.parseInt(portugalgc.getText()) + (Integer.parseInt(textG6_2.getText()))));
					ganagc.setText(Integer
							.toString(Integer.parseInt(ganagc.getText()) + (Integer.parseInt(textG6_1.getText()))));

					portugalsg.setText(Integer.toString(
							Integer.parseInt(portugalgp.getText()) - (Integer.parseInt(portugalgc.getText()))));
					ganasg.setText(Integer
							.toString(Integer.parseInt(portugalgp.getText()) - (Integer.parseInt(ganagc.getText()))));

					if (Integer.parseInt(textG6_1.getText()) > Integer.parseInt(textG6_2.getText())) {
						portugalv.setText(Integer.toString(Integer.parseInt(portugalv.getText()) + 1));
						ganad.setText(Integer.toString(Integer.parseInt(ganad.getText()) + 1));
						portugalp.setText(Integer.toString(Integer.parseInt(portugalp.getText()) + 3));
					} else if (Integer.parseInt(textG6_2.getText()) > Integer.parseInt(textG6_1.getText())) {
						portugald.setText(Integer.toString(Integer.parseInt(portugald.getText()) + 1));
						ganap.setText(Integer.toString(Integer.parseInt(ganap.getText()) + 3));
						ganav.setText(Integer.toString(Integer.parseInt(ganav.getText()) + 1));
					} else {
						portugale.setText(Integer.toString(Integer.parseInt(portugale.getText()) + 1));
						ganae.setText(Integer.toString(Integer.parseInt(ganae.getText()) + 1));
						ganap.setText(Integer.toString(Integer.parseInt(ganap.getText()) + 1));
						portugalp.setText(Integer.toString(Integer.parseInt(portugalp.getText()) + 1));
					}

					Jogo jogo42 = ControleJogo.criaJogo("Portugal", Integer.parseInt(textG6_1.getText()), "Gana",
							Integer.parseInt(textG6_2.getText()));
					if (!jogos.contains(jogo42)) {
						Persistence.save(jogo42);
					}

				}

				/**
				 * GRUPO H
				 */

				// belgica x argelia
				if (!(textH1_1.getText().isEmpty() && textH1_2.getText().isEmpty())) {
					belgicaj.setText(Integer.toString(Integer.parseInt(belgicaj.getText()) + 1));
					argeliaj.setText(Integer.toString(Integer.parseInt(argeliaj.getText()) + 1));

					belgicagp.setText(Integer
							.toString(Integer.parseInt(belgicagp.getText()) + (Integer.parseInt(textH1_1.getText()))));
					argeliagp.setText(Integer
							.toString(Integer.parseInt(argeliagp.getText()) + (Integer.parseInt(textH1_2.getText()))));

					belgicagc.setText(Integer
							.toString(Integer.parseInt(belgicagc.getText()) + (Integer.parseInt(textH1_2.getText()))));
					argeliagc.setText(Integer
							.toString(Integer.parseInt(argeliagc.getText()) + (Integer.parseInt(textH1_1.getText()))));

					belgicasg.setText(Integer
							.toString(Integer.parseInt(belgicagp.getText()) - (Integer.parseInt(belgicagc.getText()))));
					argeliasg.setText(Integer
							.toString(Integer.parseInt(argeliagp.getText()) - (Integer.parseInt(argeliagc.getText()))));

					if (Integer.parseInt(textH1_1.getText()) > Integer.parseInt(textH1_2.getText())) {
						belgicav.setText(Integer.toString(Integer.parseInt(belgicav.getText()) + 1));
						argeliad.setText(Integer.toString(Integer.parseInt(argeliad.getText()) + 1));
						belgicap.setText(Integer.toString(Integer.parseInt(belgicap.getText()) + 3));
					} else if (Integer.parseInt(textH1_2.getText()) > Integer.parseInt(textH1_1.getText())) {
						belgicad.setText(Integer.toString(Integer.parseInt(belgicad.getText()) + 1));
						argeliap.setText(Integer.toString(Integer.parseInt(argeliap.getText()) + 3));
						argeliav.setText(Integer.toString(Integer.parseInt(argeliav.getText()) + 1));
					} else {
						belgicae.setText(Integer.toString(Integer.parseInt(belgicae.getText()) + 1));
						argeliae.setText(Integer.toString(Integer.parseInt(argeliae.getText()) + 1));
						argeliap.setText(Integer.toString(Integer.parseInt(argeliap.getText()) + 1));
						belgicap.setText(Integer.toString(Integer.parseInt(belgicap.getText()) + 1));
					}

					Jogo jogo43 = ControleJogo.criaJogo("Belgica", Integer.parseInt(textH1_1.getText()), "Argelia",
							Integer.parseInt(textH1_2.getText()));
					if (!jogos.contains(jogo43)) {
						Persistence.save(jogo43);
					}

				}

				// russia x c do sul
				if (!(textH2_1.getText().isEmpty() && textH2_2.getText().isEmpty())) {
					russiaj.setText(Integer.toString(Integer.parseInt(russiaj.getText()) + 1));
					cdosulj.setText(Integer.toString(Integer.parseInt(cdosulj.getText()) + 1));

					russiagp.setText(Integer
							.toString(Integer.parseInt(russiagp.getText()) + (Integer.parseInt(textH2_1.getText()))));
					cdosulgp.setText(Integer
							.toString(Integer.parseInt(cdosulgp.getText()) + (Integer.parseInt(textH1_2.getText()))));

					russiagc.setText(Integer
							.toString(Integer.parseInt(russiagc.getText()) + (Integer.parseInt(textH2_2.getText()))));
					cdosulgc.setText(Integer
							.toString(Integer.parseInt(cdosulgc.getText()) + (Integer.parseInt(textH2_1.getText()))));

					russiasg.setText(Integer
							.toString(Integer.parseInt(russiagp.getText()) - (Integer.parseInt(russiagc.getText()))));
					cdosulsg.setText(Integer
							.toString(Integer.parseInt(cdosulgp.getText()) - (Integer.parseInt(cdosulgc.getText()))));

					if (Integer.parseInt(textH2_1.getText()) > Integer.parseInt(textH2_2.getText())) {
						russiav.setText(Integer.toString(Integer.parseInt(russiav.getText()) + 1));
						cdosuld.setText(Integer.toString(Integer.parseInt(cdosuld.getText()) + 1));
						russiap.setText(Integer.toString(Integer.parseInt(russiap.getText()) + 3));
					} else if (Integer.parseInt(textH2_2.getText()) > Integer.parseInt(textH2_1.getText())) {
						russiad.setText(Integer.toString(Integer.parseInt(russiad.getText()) + 1));
						cdosulp.setText(Integer.toString(Integer.parseInt(cdosulp.getText()) + 3));
						cdosulv.setText(Integer.toString(Integer.parseInt(cdosulv.getText()) + 1));
					} else {
						russiae.setText(Integer.toString(Integer.parseInt(russiae.getText()) + 1));
						cdosule.setText(Integer.toString(Integer.parseInt(cdosule.getText()) + 1));
						cdosulp.setText(Integer.toString(Integer.parseInt(cdosulp.getText()) + 1));
						russiap.setText(Integer.toString(Integer.parseInt(russiap.getText()) + 1));
					}

					Jogo jogo44 = ControleJogo.criaJogo("Russia", Integer.parseInt(textH2_1.getText()), "Cdosul",
							Integer.parseInt(textH2_2.getText()));
					if (!jogos.contains(jogo44)) {
						Persistence.save(jogo44);
					}

				}

				// belgica x russia
				if (!(textH3_1.getText().isEmpty() && textH3_2.getText().isEmpty())) {
					belgicaj.setText(Integer.toString(Integer.parseInt(belgicaj.getText()) + 1));
					russiaj.setText(Integer.toString(Integer.parseInt(russiaj.getText()) + 1));

					belgicagp.setText(Integer
							.toString(Integer.parseInt(belgicagp.getText()) + (Integer.parseInt(textH3_1.getText()))));
					russiagp.setText(Integer
							.toString(Integer.parseInt(russiagp.getText()) + (Integer.parseInt(textH3_2.getText()))));

					belgicagc.setText(Integer
							.toString(Integer.parseInt(belgicagc.getText()) + (Integer.parseInt(textH3_2.getText()))));
					russiagc.setText(Integer
							.toString(Integer.parseInt(russiagc.getText()) + (Integer.parseInt(textH3_1.getText()))));

					belgicasg.setText(Integer
							.toString(Integer.parseInt(belgicagp.getText()) - (Integer.parseInt(belgicagc.getText()))));
					russiasg.setText(Integer
							.toString(Integer.parseInt(russiagp.getText()) - (Integer.parseInt(russiagc.getText()))));

					if (Integer.parseInt(textH3_1.getText()) > Integer.parseInt(textH3_2.getText())) {
						belgicav.setText(Integer.toString(Integer.parseInt(belgicav.getText()) + 1));
						russiad.setText(Integer.toString(Integer.parseInt(russiad.getText()) + 1));
						belgicap.setText(Integer.toString(Integer.parseInt(belgicap.getText()) + 3));
					} else if (Integer.parseInt(textH3_2.getText()) > Integer.parseInt(textH3_1.getText())) {
						belgicad.setText(Integer.toString(Integer.parseInt(belgicad.getText()) + 1));
						russiap.setText(Integer.toString(Integer.parseInt(russiap.getText()) + 3));
						russiav.setText(Integer.toString(Integer.parseInt(russiav.getText()) + 1));
					} else {
						belgicae.setText(Integer.toString(Integer.parseInt(belgicae.getText()) + 1));
						russiae.setText(Integer.toString(Integer.parseInt(russiae.getText()) + 1));
						russiap.setText(Integer.toString(Integer.parseInt(russiap.getText()) + 1));
						belgicap.setText(Integer.toString(Integer.parseInt(belgicap.getText()) + 1));
					}

					Jogo jogo45 = ControleJogo.criaJogo("Belgica", Integer.parseInt(textH3_1.getText()), "Russia",
							Integer.parseInt(textH3_2.getText()));
					if (!jogos.contains(jogo45)) {
						Persistence.save(jogo45);
					}

				}

				// c do sul x argelia
				if (!(textH4_1.getText().isEmpty() && textH4_2.getText().isEmpty())) {
					cdosulj.setText(Integer.toString(Integer.parseInt(cdosulj.getText()) + 1));
					argeliaj.setText(Integer.toString(Integer.parseInt(argeliaj.getText()) + 1));

					cdosulgp.setText(Integer
							.toString(Integer.parseInt(cdosulgp.getText()) + (Integer.parseInt(textH4_1.getText()))));
					argeliagp.setText(Integer
							.toString(Integer.parseInt(argeliagp.getText()) + (Integer.parseInt(textH4_2.getText()))));

					cdosulgc.setText(Integer
							.toString(Integer.parseInt(cdosulgc.getText()) + (Integer.parseInt(textH4_2.getText()))));
					argeliagc.setText(Integer
							.toString(Integer.parseInt(argeliagc.getText()) + (Integer.parseInt(textH4_1.getText()))));

					cdosulsg.setText(Integer
							.toString(Integer.parseInt(cdosulgp.getText()) - (Integer.parseInt(cdosulgc.getText()))));
					argeliasg.setText(Integer
							.toString(Integer.parseInt(argeliagp.getText()) - (Integer.parseInt(argeliagc.getText()))));

					if (Integer.parseInt(textH4_1.getText()) > Integer.parseInt(textH4_2.getText())) {
						cdosulv.setText(Integer.toString(Integer.parseInt(cdosulv.getText()) + 1));
						argeliad.setText(Integer.toString(Integer.parseInt(argeliad.getText()) + 1));
						cdosulp.setText(Integer.toString(Integer.parseInt(cdosulp.getText()) + 3));
					} else if (Integer.parseInt(textH4_2.getText()) > Integer.parseInt(textH4_1.getText())) {
						cdosuld.setText(Integer.toString(Integer.parseInt(cdosuld.getText()) + 1));
						argeliap.setText(Integer.toString(Integer.parseInt(argeliap.getText()) + 3));
						argeliav.setText(Integer.toString(Integer.parseInt(argeliav.getText()) + 1));
					} else {
						cdosule.setText(Integer.toString(Integer.parseInt(cdosule.getText()) + 1));
						argeliae.setText(Integer.toString(Integer.parseInt(argeliae.getText()) + 1));
						argeliap.setText(Integer.toString(Integer.parseInt(argeliap.getText()) + 1));
						cdosulp.setText(Integer.toString(Integer.parseInt(cdosulp.getText()) + 1));
					}

					Jogo jogo46 = ControleJogo.criaJogo("Cdosul", Integer.parseInt(textH4_1.getText()), "Argelia",
							Integer.parseInt(textH4_2.getText()));
					if (!jogos.contains(jogo46)) {
						Persistence.save(jogo46);
					}

				}

				// c do sul x belgica
				if (!(textH5_1.getText().isEmpty() && textH5_2.getText().isEmpty())) {
					cdosulj.setText(Integer.toString(Integer.parseInt(cdosulj.getText()) + 1));
					belgicaj.setText(Integer.toString(Integer.parseInt(belgicaj.getText()) + 1));

					cdosulgp.setText(Integer
							.toString(Integer.parseInt(cdosulgp.getText()) + (Integer.parseInt(textH5_1.getText()))));
					belgicagp.setText(Integer
							.toString(Integer.parseInt(belgicagp.getText()) + (Integer.parseInt(textH5_2.getText()))));

					cdosulgc.setText(Integer
							.toString(Integer.parseInt(cdosulgc.getText()) + (Integer.parseInt(textH5_2.getText()))));
					belgicagc.setText(Integer
							.toString(Integer.parseInt(belgicagc.getText()) + (Integer.parseInt(textH5_1.getText()))));

					cdosulsg.setText(Integer
							.toString(Integer.parseInt(cdosulgp.getText()) - (Integer.parseInt(cdosulgc.getText()))));
					belgicasg.setText(Integer
							.toString(Integer.parseInt(belgicagp.getText()) - (Integer.parseInt(belgicagc.getText()))));

					if (Integer.parseInt(textH5_1.getText()) > Integer.parseInt(textH5_2.getText())) {
						cdosulv.setText(Integer.toString(Integer.parseInt(cdosulv.getText()) + 1));
						belgicad.setText(Integer.toString(Integer.parseInt(belgicad.getText()) + 1));
						cdosulp.setText(Integer.toString(Integer.parseInt(cdosulp.getText()) + 3));
					} else if (Integer.parseInt(textH5_2.getText()) > Integer.parseInt(textH5_1.getText())) {
						cdosuld.setText(Integer.toString(Integer.parseInt(cdosuld.getText()) + 1));
						belgicap.setText(Integer.toString(Integer.parseInt(belgicap.getText()) + 3));
						belgicav.setText(Integer.toString(Integer.parseInt(belgicav.getText()) + 1));
					} else {
						cdosule.setText(Integer.toString(Integer.parseInt(cdosule.getText()) + 1));
						belgicae.setText(Integer.toString(Integer.parseInt(belgicae.getText()) + 1));
						belgicap.setText(Integer.toString(Integer.parseInt(belgicap.getText()) + 1));
						cdosulp.setText(Integer.toString(Integer.parseInt(cdosulp.getText()) + 1));
					}

					Jogo jogo47 = ControleJogo.criaJogo("Cdosul", Integer.parseInt(textH5_1.getText()), "Belgica",
							Integer.parseInt(textH5_2.getText()));
					if (!jogos.contains(jogo47)) {
						Persistence.save(jogo47);
					}

				}

				// argelia x russia
				if (!(textH6_1.getText().isEmpty() && textH6_2.getText().isEmpty())) {
					argeliaj.setText(Integer.toString(Integer.parseInt(argeliaj.getText()) + 1));
					russiaj.setText(Integer.toString(Integer.parseInt(russiaj.getText()) + 1));

					argeliagp.setText(Integer
							.toString(Integer.parseInt(argeliagp.getText()) + (Integer.parseInt(textH6_1.getText()))));
					russiagp.setText(Integer
							.toString(Integer.parseInt(russiagp.getText()) + (Integer.parseInt(textH6_2.getText()))));

					argeliagc.setText(Integer
							.toString(Integer.parseInt(argeliagc.getText()) + (Integer.parseInt(textH6_2.getText()))));
					russiagc.setText(Integer
							.toString(Integer.parseInt(russiagc.getText()) + (Integer.parseInt(textH6_1.getText()))));

					argeliasg.setText(Integer
							.toString(Integer.parseInt(argeliagp.getText()) - (Integer.parseInt(argeliagc.getText()))));
					russiasg.setText(Integer
							.toString(Integer.parseInt(russiagp.getText()) - (Integer.parseInt(russiagc.getText()))));

					if (Integer.parseInt(textH6_1.getText()) > Integer.parseInt(textH6_2.getText())) {
						argeliav.setText(Integer.toString(Integer.parseInt(argeliav.getText()) + 1));
						russiad.setText(Integer.toString(Integer.parseInt(russiad.getText()) + 1));
						argeliap.setText(Integer.toString(Integer.parseInt(argeliap.getText()) + 3));
					} else if (Integer.parseInt(textH6_2.getText()) > Integer.parseInt(textH6_1.getText())) {
						argeliad.setText(Integer.toString(Integer.parseInt(argeliad.getText()) + 1));
						russiap.setText(Integer.toString(Integer.parseInt(russiap.getText()) + 3));
						russiav.setText(Integer.toString(Integer.parseInt(russiav.getText()) + 1));
					} else {
						argeliae.setText(Integer.toString(Integer.parseInt(argeliae.getText()) + 1));
						russiae.setText(Integer.toString(Integer.parseInt(russiae.getText()) + 1));
						russiap.setText(Integer.toString(Integer.parseInt(russiap.getText()) + 1));
						argeliap.setText(Integer.toString(Integer.parseInt(argeliap.getText()) + 1));
					}

					Jogo jogo48 = ControleJogo.criaJogo("Argelia", Integer.parseInt(textH6_1.getText()), "Russia",
							Integer.parseInt(textH6_2.getText()));
					if (!jogos.contains(jogo48)) {
						Persistence.save(jogo48);
					}

				}

				JOptionPane.showMessageDialog(null, "Salvo com sucesso");
			}
		});
		btnSalvar.setBounds(547, 602, 91, 23);
		contentPane.add(btnSalvar);

		textA1_1 = new JTextField();
		textA1_1.setBounds(168, 37, 19, 19);
		contentPane.add(textA1_1);
		textA1_1.setColumns(10);

		textA1_2 = new JTextField();
		textA1_2.setColumns(10);
		textA1_2.setBounds(197, 37, 19, 19);
		contentPane.add(textA1_2);

		textA2_1 = new JTextField();
		textA2_1.setColumns(10);
		textA2_1.setBounds(168, 55, 19, 19);
		contentPane.add(textA2_1);

		textA2_2 = new JTextField();
		textA2_2.setColumns(10);
		textA2_2.setBounds(197, 55, 19, 19);
		contentPane.add(textA2_2);

		textA3_1 = new JTextField();
		textA3_1.setColumns(10);
		textA3_1.setBounds(168, 76, 19, 19);
		contentPane.add(textA3_1);

		textA3_2 = new JTextField();
		textA3_2.setColumns(10);
		textA3_2.setBounds(197, 76, 19, 19);
		contentPane.add(textA3_2);

		textA4_1 = new JTextField();
		textA4_1.setColumns(10);
		textA4_1.setBounds(168, 95, 19, 19);
		contentPane.add(textA4_1);

		textA4_2 = new JTextField();
		textA4_2.setColumns(10);
		textA4_2.setBounds(197, 95, 19, 19);
		contentPane.add(textA4_2);

		textA5_1 = new JTextField();
		textA5_1.setColumns(10);
		textA5_1.setBounds(168, 115, 19, 19);
		contentPane.add(textA5_1);

		textA5_2 = new JTextField();
		textA5_2.setColumns(10);
		textA5_2.setBounds(197, 115, 19, 19);
		contentPane.add(textA5_2);

		textA6_1 = new JTextField();
		textA6_1.setColumns(10);
		textA6_1.setBounds(168, 134, 19, 19);
		contentPane.add(textA6_1);

		textA6_2 = new JTextField();
		textA6_2.setColumns(10);
		textA6_2.setBounds(197, 134, 19, 19);
		contentPane.add(textA6_2);

		textB1_1 = new JTextField();
		textB1_1.setColumns(10);
		textB1_1.setBounds(168, 181, 19, 19);
		contentPane.add(textB1_1);

		textB1_2 = new JTextField();
		textB1_2.setColumns(10);
		textB1_2.setBounds(197, 181, 19, 19);
		contentPane.add(textB1_2);

		textB2_1 = new JTextField();
		textB2_1.setColumns(10);
		textB2_1.setBounds(168, 199, 19, 19);
		contentPane.add(textB2_1);

		textB2_2 = new JTextField();
		textB2_2.setColumns(10);
		textB2_2.setBounds(197, 199, 19, 19);
		contentPane.add(textB2_2);

		textB3_1 = new JTextField();
		textB3_1.setColumns(10);
		textB3_1.setBounds(168, 220, 19, 19);
		contentPane.add(textB3_1);

		textB3_2 = new JTextField();
		textB3_2.setColumns(10);
		textB3_2.setBounds(197, 220, 19, 19);
		contentPane.add(textB3_2);

		textB4_1 = new JTextField();
		textB4_1.setColumns(10);
		textB4_1.setBounds(168, 239, 19, 19);
		contentPane.add(textB4_1);

		textB4_2 = new JTextField();
		textB4_2.setColumns(10);
		textB4_2.setBounds(197, 239, 19, 19);
		contentPane.add(textB4_2);

		textB5_1 = new JTextField();
		textB5_1.setColumns(10);
		textB5_1.setBounds(168, 259, 19, 19);
		contentPane.add(textB5_1);

		textB5_2 = new JTextField();
		textB5_2.setColumns(10);
		textB5_2.setBounds(197, 259, 19, 19);
		contentPane.add(textB5_2);

		textB6_1 = new JTextField();
		textB6_1.setColumns(10);
		textB6_1.setBounds(168, 278, 19, 19);
		contentPane.add(textB6_1);

		textB6_2 = new JTextField();
		textB6_2.setColumns(10);
		textB6_2.setBounds(197, 278, 19, 19);
		contentPane.add(textB6_2);

		textC1_1 = new JTextField();
		textC1_1.setColumns(10);
		textC1_1.setBounds(168, 331, 19, 19);
		contentPane.add(textC1_1);

		textC1_2 = new JTextField();
		textC1_2.setColumns(10);
		textC1_2.setBounds(197, 331, 19, 19);
		contentPane.add(textC1_2);

		textC2_1 = new JTextField();
		textC2_1.setColumns(10);
		textC2_1.setBounds(168, 349, 19, 19);
		contentPane.add(textC2_1);

		textC2_2 = new JTextField();
		textC2_2.setColumns(10);
		textC2_2.setBounds(197, 349, 19, 19);
		contentPane.add(textC2_2);

		textC3_1 = new JTextField();
		textC3_1.setColumns(10);
		textC3_1.setBounds(168, 370, 19, 19);
		contentPane.add(textC3_1);

		textC3_2 = new JTextField();
		textC3_2.setColumns(10);
		textC3_2.setBounds(197, 370, 19, 19);
		contentPane.add(textC3_2);

		textC4_1 = new JTextField();
		textC4_1.setColumns(10);
		textC4_1.setBounds(168, 389, 19, 19);
		contentPane.add(textC4_1);

		textC4_2 = new JTextField();
		textC4_2.setColumns(10);
		textC4_2.setBounds(197, 389, 19, 19);
		contentPane.add(textC4_2);

		textC5_1 = new JTextField();
		textC5_1.setColumns(10);
		textC5_1.setBounds(168, 409, 19, 19);
		contentPane.add(textC5_1);

		textC5_2 = new JTextField();
		textC5_2.setColumns(10);
		textC5_2.setBounds(197, 409, 19, 19);
		contentPane.add(textC5_2);

		textC6_1 = new JTextField();
		textC6_1.setColumns(10);
		textC6_1.setBounds(168, 428, 19, 19);
		contentPane.add(textC6_1);

		textC6_2 = new JTextField();
		textC6_2.setColumns(10);
		textC6_2.setBounds(197, 428, 19, 19);
		contentPane.add(textC6_2);

		textD1_1 = new JTextField();
		textD1_1.setColumns(10);
		textD1_1.setBounds(168, 478, 19, 19);
		contentPane.add(textD1_1);

		textD1_2 = new JTextField();
		textD1_2.setColumns(10);
		textD1_2.setBounds(197, 478, 19, 19);
		contentPane.add(textD1_2);

		textD2_1 = new JTextField();
		textD2_1.setColumns(10);
		textD2_1.setBounds(168, 495, 19, 19);
		contentPane.add(textD2_1);

		textD2_2 = new JTextField();
		textD2_2.setColumns(10);
		textD2_2.setBounds(197, 495, 19, 19);
		contentPane.add(textD2_2);

		textD3_1 = new JTextField();
		textD3_1.setColumns(10);
		textD3_1.setBounds(168, 515, 19, 19);
		contentPane.add(textD3_1);

		textD3_2 = new JTextField();
		textD3_2.setColumns(10);
		textD3_2.setBounds(197, 515, 19, 19);
		contentPane.add(textD3_2);

		textD4_1 = new JTextField();
		textD4_1.setColumns(10);
		textD4_1.setBounds(168, 532, 19, 19);
		contentPane.add(textD4_1);

		textD4_2 = new JTextField();
		textD4_2.setColumns(10);
		textD4_2.setBounds(197, 532, 19, 19);
		contentPane.add(textD4_2);

		textD5_1 = new JTextField();
		textD5_1.setColumns(10);
		textD5_1.setBounds(168, 550, 19, 19);
		contentPane.add(textD5_1);

		textD5_2 = new JTextField();
		textD5_2.setColumns(10);
		textD5_2.setBounds(197, 550, 19, 19);
		contentPane.add(textD5_2);

		textD6_1 = new JTextField();
		textD6_1.setColumns(10);
		textD6_1.setBounds(168, 570, 19, 19);
		contentPane.add(textD6_1);

		textD6_2 = new JTextField();
		textD6_2.setColumns(10);
		textD6_2.setBounds(197, 570, 19, 19);
		contentPane.add(textD6_2);

		textE1_1 = new JTextField();
		textE1_1.setColumns(10);
		textE1_1.setBounds(746, 37, 19, 19);
		contentPane.add(textE1_1);

		textE1_2 = new JTextField();
		textE1_2.setColumns(10);
		textE1_2.setBounds(775, 37, 19, 19);
		contentPane.add(textE1_2);

		textE2_1 = new JTextField();
		textE2_1.setColumns(10);
		textE2_1.setBounds(746, 55, 19, 19);
		contentPane.add(textE2_1);

		textE2_2 = new JTextField();
		textE2_2.setColumns(10);
		textE2_2.setBounds(775, 55, 19, 19);
		contentPane.add(textE2_2);

		textE3_1 = new JTextField();
		textE3_1.setColumns(10);
		textE3_1.setBounds(746, 76, 19, 19);
		contentPane.add(textE3_1);

		textE3_2 = new JTextField();
		textE3_2.setColumns(10);
		textE3_2.setBounds(775, 76, 19, 19);
		contentPane.add(textE3_2);

		textE4_1 = new JTextField();
		textE4_1.setColumns(10);
		textE4_1.setBounds(746, 95, 19, 19);
		contentPane.add(textE4_1);

		textE4_2 = new JTextField();
		textE4_2.setColumns(10);
		textE4_2.setBounds(775, 95, 19, 19);
		contentPane.add(textE4_2);

		textE5_1 = new JTextField();
		textE5_1.setColumns(10);
		textE5_1.setBounds(746, 115, 19, 19);
		contentPane.add(textE5_1);

		textE5_2 = new JTextField();
		textE5_2.setColumns(10);
		textE5_2.setBounds(775, 115, 19, 19);
		contentPane.add(textE5_2);

		textE6_1 = new JTextField();
		textE6_1.setColumns(10);
		textE6_1.setBounds(746, 134, 19, 19);
		contentPane.add(textE6_1);

		textE6_2 = new JTextField();
		textE6_2.setColumns(10);
		textE6_2.setBounds(775, 134, 19, 19);
		contentPane.add(textE6_2);

		textF1_1 = new JTextField();
		textF1_1.setColumns(10);
		textF1_1.setBounds(746, 181, 19, 19);
		contentPane.add(textF1_1);

		textF1_2 = new JTextField();
		textF1_2.setColumns(10);
		textF1_2.setBounds(775, 181, 19, 19);
		contentPane.add(textF1_2);

		textF2_1 = new JTextField();
		textF2_1.setColumns(10);
		textF2_1.setBounds(746, 199, 19, 19);
		contentPane.add(textF2_1);

		textF2_2 = new JTextField();
		textF2_2.setColumns(10);
		textF2_2.setBounds(775, 199, 19, 19);
		contentPane.add(textF2_2);

		textF3_1 = new JTextField();
		textF3_1.setColumns(10);
		textF3_1.setBounds(746, 220, 19, 19);
		contentPane.add(textF3_1);

		textF3_2 = new JTextField();
		textF3_2.setColumns(10);
		textF3_2.setBounds(775, 220, 19, 19);
		contentPane.add(textF3_2);

		textF4_1 = new JTextField();
		textF4_1.setColumns(10);
		textF4_1.setBounds(746, 239, 19, 19);
		contentPane.add(textF4_1);

		textF4_2 = new JTextField();
		textF4_2.setColumns(10);
		textF4_2.setBounds(775, 239, 19, 19);
		contentPane.add(textF4_2);

		textF5_1 = new JTextField();
		textF5_1.setColumns(10);
		textF5_1.setBounds(746, 259, 19, 19);
		contentPane.add(textF5_1);

		textF5_2 = new JTextField();
		textF5_2.setColumns(10);
		textF5_2.setBounds(775, 259, 19, 19);
		contentPane.add(textF5_2);

		textF6_1 = new JTextField();
		textF6_1.setColumns(10);
		textF6_1.setBounds(746, 278, 19, 19);
		contentPane.add(textF6_1);

		textF6_2 = new JTextField();
		textF6_2.setColumns(10);
		textF6_2.setBounds(775, 278, 19, 19);
		contentPane.add(textF6_2);

		textG1_1 = new JTextField();
		textG1_1.setColumns(10);
		textG1_1.setBounds(746, 331, 19, 19);
		contentPane.add(textG1_1);

		textG1_2 = new JTextField();
		textG1_2.setColumns(10);
		textG1_2.setBounds(775, 331, 19, 19);
		contentPane.add(textG1_2);

		textG2_1 = new JTextField();
		textG2_1.setColumns(10);
		textG2_1.setBounds(746, 349, 19, 19);
		contentPane.add(textG2_1);

		textG2_2 = new JTextField();
		textG2_2.setColumns(10);
		textG2_2.setBounds(775, 349, 19, 19);
		contentPane.add(textG2_2);

		textG3_1 = new JTextField();
		textG3_1.setColumns(10);
		textG3_1.setBounds(746, 370, 19, 19);
		contentPane.add(textG3_1);

		textG3_2 = new JTextField();
		textG3_2.setColumns(10);
		textG3_2.setBounds(775, 370, 19, 19);
		contentPane.add(textG3_2);

		textG4_1 = new JTextField();
		textG4_1.setColumns(10);
		textG4_1.setBounds(746, 389, 19, 19);
		contentPane.add(textG4_1);

		textG4_2 = new JTextField();
		textG4_2.setColumns(10);
		textG4_2.setBounds(775, 389, 19, 19);
		contentPane.add(textG4_2);

		textG5_1 = new JTextField();
		textG5_1.setColumns(10);
		textG5_1.setBounds(746, 409, 19, 19);
		contentPane.add(textG5_1);

		textG5_2 = new JTextField();
		textG5_2.setColumns(10);
		textG5_2.setBounds(775, 409, 19, 19);
		contentPane.add(textG5_2);

		textG6_1 = new JTextField();
		textG6_1.setColumns(10);
		textG6_1.setBounds(746, 428, 19, 19);
		contentPane.add(textG6_1);

		textG6_2 = new JTextField();
		textG6_2.setColumns(10);
		textG6_2.setBounds(775, 428, 19, 19);
		contentPane.add(textG6_2);

		textH1_1 = new JTextField();
		textH1_1.setColumns(10);
		textH1_1.setBounds(743, 478, 19, 19);
		contentPane.add(textH1_1);

		textH1_2 = new JTextField();
		textH1_2.setColumns(10);
		textH1_2.setBounds(774, 477, 19, 19);
		contentPane.add(textH1_2);

		textH2_1 = new JTextField();
		textH2_1.setColumns(10);
		textH2_1.setBounds(743, 495, 19, 19);
		contentPane.add(textH2_1);

		textH2_2 = new JTextField();
		textH2_2.setColumns(10);
		textH2_2.setBounds(774, 495, 19, 19);
		contentPane.add(textH2_2);

		textH3_1 = new JTextField();
		textH3_1.setColumns(10);
		textH3_1.setBounds(743, 515, 19, 19);
		contentPane.add(textH3_1);

		textH3_2 = new JTextField();
		textH3_2.setColumns(10);
		textH3_2.setBounds(775, 515, 19, 19);
		contentPane.add(textH3_2);

		textH4_1 = new JTextField();
		textH4_1.setColumns(10);
		textH4_1.setBounds(743, 532, 19, 19);
		contentPane.add(textH4_1);

		textH4_2 = new JTextField();
		textH4_2.setColumns(10);
		textH4_2.setBounds(775, 532, 19, 19);
		contentPane.add(textH4_2);

		textH5_1 = new JTextField();
		textH5_1.setColumns(10);
		textH5_1.setBounds(743, 550, 19, 19);
		contentPane.add(textH5_1);

		textH5_2 = new JTextField();
		textH5_2.setColumns(10);
		textH5_2.setBounds(775, 550, 19, 19);
		contentPane.add(textH5_2);

		textH6_1 = new JTextField();
		textH6_1.setColumns(10);
		textH6_1.setBounds(743, 570, 19, 19);
		contentPane.add(textH6_1);

		textH6_2 = new JTextField();
		textH6_2.setColumns(10);
		textH6_2.setBounds(775, 570, 19, 19);
		contentPane.add(textH6_2);

		brasilp = new JLabel("0");
		brasilp.setBounds(403, 76, 15, 15);
		contentPane.add(brasilp);

		brasilj = new JLabel("0");
		brasilj.setBounds(424, 76, 15, 15);
		contentPane.add(brasilj);

		brasilv = new JLabel("0");
		brasilv.setBounds(444, 76, 15, 15);
		contentPane.add(brasilv);

		brasile = new JLabel("0");
		brasile.setBounds(463, 76, 15, 15);
		contentPane.add(brasile);

		brasild = new JLabel("0");
		brasild.setBounds(481, 76, 15, 15);
		contentPane.add(brasild);

		brasilgp = new JLabel("0");
		brasilgp.setBounds(504, 76, 15, 15);
		contentPane.add(brasilgp);

		brasilgc = new JLabel("0");
		brasilgc.setBounds(533, 76, 15, 15);
		contentPane.add(brasilgc);

		brasilsg = new JLabel("0");
		brasilsg.setBounds(561, 76, 15, 15);
		contentPane.add(brasilsg);

		mexicop = new JLabel("0");
		mexicop.setBounds(403, 91, 15, 15);
		contentPane.add(mexicop);

		mexicoj = new JLabel("0");
		mexicoj.setBounds(424, 91, 15, 15);
		contentPane.add(mexicoj);

		mexicov = new JLabel("0");
		mexicov.setBounds(444, 91, 15, 15);
		contentPane.add(mexicov);

		mexicoe = new JLabel("0");
		mexicoe.setBounds(463, 91, 15, 15);
		contentPane.add(mexicoe);

		mexicod = new JLabel("0");
		mexicod.setBounds(481, 91, 15, 15);
		contentPane.add(mexicod);

		mexicogp = new JLabel("0");
		mexicogp.setBounds(504, 91, 15, 15);
		contentPane.add(mexicogp);

		mexicogc = new JLabel("0");
		mexicogc.setBounds(533, 91, 15, 15);
		contentPane.add(mexicogc);

		mexicosg = new JLabel("0");
		mexicosg.setBounds(561, 91, 15, 15);
		contentPane.add(mexicosg);

		croaciap = new JLabel("0");
		croaciap.setBounds(403, 103, 15, 15);
		contentPane.add(croaciap);

		croaciaj = new JLabel("0");
		croaciaj.setBounds(424, 103, 15, 15);
		contentPane.add(croaciaj);

		croaciav = new JLabel("0");
		croaciav.setBounds(444, 103, 15, 15);
		contentPane.add(croaciav);

		croaciae = new JLabel("0");
		croaciae.setBounds(463, 103, 15, 15);
		contentPane.add(croaciae);

		croaciad = new JLabel("0");
		croaciad.setBounds(481, 103, 15, 15);
		contentPane.add(croaciad);

		croaciagp = new JLabel("0");
		croaciagp.setBounds(504, 103, 15, 15);
		contentPane.add(croaciagp);

		croaciagc = new JLabel("0");
		croaciagc.setBounds(533, 103, 15, 15);
		contentPane.add(croaciagc);

		croaciasg = new JLabel("0");
		croaciasg.setBounds(561, 103, 15, 15);
		contentPane.add(croaciasg);

		camaroesp = new JLabel("0");
		camaroesp.setBounds(403, 117, 15, 15);
		contentPane.add(camaroesp);

		camaroesj = new JLabel("0");
		camaroesj.setBounds(424, 117, 15, 15);
		contentPane.add(camaroesj);

		camaroesv = new JLabel("0");
		camaroesv.setBounds(444, 117, 15, 15);
		contentPane.add(camaroesv);

		camaroese = new JLabel("0");
		camaroese.setBounds(463, 117, 15, 15);
		contentPane.add(camaroese);

		camaroesd = new JLabel("0");
		camaroesd.setBounds(481, 117, 15, 15);
		contentPane.add(camaroesd);

		camaroesgp = new JLabel("0");
		camaroesgp.setBounds(504, 117, 15, 15);
		contentPane.add(camaroesgp);

		camaroesgc = new JLabel("0");
		camaroesgc.setBounds(533, 117, 15, 15);
		contentPane.add(camaroesgc);

		camaroessg = new JLabel("0");
		camaroessg.setBounds(561, 117, 15, 15);
		contentPane.add(camaroessg);

		australiap = new JLabel("0");
		australiap.setBounds(403, 220, 15, 15);
		contentPane.add(australiap);

		australiaj = new JLabel("0");
		australiaj.setBounds(424, 220, 15, 15);
		contentPane.add(australiaj);

		australiav = new JLabel("0");
		australiav.setBounds(444, 220, 15, 15);
		contentPane.add(australiav);

		australiae = new JLabel("0");
		australiae.setBounds(463, 220, 15, 15);
		contentPane.add(australiae);

		australiad = new JLabel("0");
		australiad.setBounds(481, 220, 15, 15);
		contentPane.add(australiad);

		australiagp = new JLabel("0");
		australiagp.setBounds(504, 220, 15, 15);
		contentPane.add(australiagp);

		australiagc = new JLabel("0");
		australiagc.setBounds(533, 220, 15, 15);
		contentPane.add(australiagc);

		australiasg = new JLabel("0");
		australiasg.setBounds(561, 220, 15, 15);
		contentPane.add(australiasg);

		chilep = new JLabel("0");
		chilep.setBounds(403, 235, 15, 15);
		contentPane.add(chilep);

		chilej = new JLabel("0");
		chilej.setBounds(424, 235, 15, 15);
		contentPane.add(chilej);

		chilev = new JLabel("0");
		chilev.setBounds(444, 235, 15, 15);
		contentPane.add(chilev);

		chilee = new JLabel("0");
		chilee.setBounds(463, 235, 15, 15);
		contentPane.add(chilee);

		chiled = new JLabel("0");
		chiled.setBounds(481, 235, 15, 15);
		contentPane.add(chiled);

		chilegp = new JLabel("0");
		chilegp.setBounds(504, 235, 15, 15);
		contentPane.add(chilegp);

		chilegc = new JLabel("0");
		chilegc.setBounds(533, 235, 15, 15);
		contentPane.add(chilegc);

		chilesg = new JLabel("0");
		chilesg.setBounds(561, 235, 15, 15);
		contentPane.add(chilesg);

		espanhap = new JLabel("0");
		espanhap.setBounds(403, 247, 15, 15);
		contentPane.add(espanhap);

		espanhaj = new JLabel("0");
		espanhaj.setBounds(424, 247, 15, 15);
		contentPane.add(espanhaj);

		espanhav = new JLabel("0");
		espanhav.setBounds(444, 247, 15, 15);
		contentPane.add(espanhav);

		espanhae = new JLabel("0");
		espanhae.setBounds(463, 247, 15, 15);
		contentPane.add(espanhae);

		espanhad = new JLabel("0");
		espanhad.setBounds(481, 247, 15, 15);
		contentPane.add(espanhad);

		espanhagp = new JLabel("0");
		espanhagp.setBounds(504, 247, 15, 15);
		contentPane.add(espanhagp);

		espanhagc = new JLabel("0");
		espanhagc.setBounds(533, 247, 15, 15);
		contentPane.add(espanhagc);

		espanhasg = new JLabel("0");
		espanhasg.setBounds(561, 247, 15, 15);
		contentPane.add(espanhasg);

		holandap = new JLabel("0");
		holandap.setBounds(403, 261, 15, 15);
		contentPane.add(holandap);

		holandaj = new JLabel("0");
		holandaj.setBounds(424, 261, 15, 15);
		contentPane.add(holandaj);

		holandav = new JLabel("0");
		holandav.setBounds(444, 261, 15, 15);
		contentPane.add(holandav);

		holandae = new JLabel("0");
		holandae.setBounds(463, 261, 15, 15);
		contentPane.add(holandae);

		holandad = new JLabel("0");
		holandad.setBounds(481, 261, 15, 15);
		contentPane.add(holandad);

		holandagp = new JLabel("0");
		holandagp.setBounds(504, 261, 15, 15);
		contentPane.add(holandagp);

		holandagc = new JLabel("0");
		holandagc.setBounds(533, 261, 15, 15);
		contentPane.add(holandagc);

		holandasg = new JLabel("0");
		holandasg.setBounds(561, 261, 15, 15);
		contentPane.add(holandasg);

		colombiap = new JLabel("0");
		colombiap.setBounds(403, 370, 15, 15);
		contentPane.add(colombiap);

		colombiaj = new JLabel("0");
		colombiaj.setBounds(424, 370, 15, 15);
		contentPane.add(colombiaj);

		colombiav = new JLabel("0");
		colombiav.setBounds(444, 370, 15, 15);
		contentPane.add(colombiav);

		colombiae = new JLabel("0");
		colombiae.setBounds(463, 370, 15, 15);
		contentPane.add(colombiae);

		colombiad = new JLabel("0");
		colombiad.setBounds(481, 370, 15, 15);
		contentPane.add(colombiad);

		colombiagp = new JLabel("0");
		colombiagp.setBounds(504, 370, 15, 15);
		contentPane.add(colombiagp);

		colombiagc = new JLabel("0");
		colombiagc.setBounds(533, 370, 15, 15);
		contentPane.add(colombiagc);

		colombiasg = new JLabel("0");
		colombiasg.setBounds(561, 370, 15, 15);
		contentPane.add(colombiasg);

		cmarfimp = new JLabel("0");
		cmarfimp.setBounds(403, 385, 15, 15);
		contentPane.add(cmarfimp);

		cmarfimj = new JLabel("0");
		cmarfimj.setBounds(424, 385, 15, 15);
		contentPane.add(cmarfimj);

		cmarfimv = new JLabel("0");
		cmarfimv.setBounds(444, 385, 15, 15);
		contentPane.add(cmarfimv);

		cmarfime = new JLabel("0");
		cmarfime.setBounds(463, 385, 15, 15);
		contentPane.add(cmarfime);

		cmarfimd = new JLabel("0");
		cmarfimd.setBounds(481, 385, 15, 15);
		contentPane.add(cmarfimd);

		cmarfimgp = new JLabel("0");
		cmarfimgp.setBounds(504, 385, 15, 15);
		contentPane.add(cmarfimgp);

		cmarfimgc = new JLabel("0");
		cmarfimgc.setBounds(533, 385, 15, 15);
		contentPane.add(cmarfimgc);

		cmarfimsg = new JLabel("0");
		cmarfimsg.setBounds(561, 385, 15, 15);
		contentPane.add(cmarfimsg);

		greciap = new JLabel("0");
		greciap.setBounds(403, 397, 15, 15);
		contentPane.add(greciap);

		greciaj = new JLabel("0");
		greciaj.setBounds(424, 397, 15, 15);
		contentPane.add(greciaj);

		greciav = new JLabel("0");
		greciav.setBounds(444, 397, 15, 15);
		contentPane.add(greciav);

		greciae = new JLabel("0");
		greciae.setBounds(463, 397, 15, 15);
		contentPane.add(greciae);

		greciad = new JLabel("0");
		greciad.setBounds(481, 397, 15, 15);
		contentPane.add(greciad);

		greciagp = new JLabel("0");
		greciagp.setBounds(504, 397, 15, 15);
		contentPane.add(greciagp);

		greciagc = new JLabel("0");
		greciagc.setBounds(533, 397, 15, 15);
		contentPane.add(greciagc);

		greciasg = new JLabel("0");
		greciasg.setBounds(561, 397, 15, 15);
		contentPane.add(greciasg);

		japaop = new JLabel("0");
		japaop.setBounds(403, 411, 15, 15);
		contentPane.add(japaop);

		japaoj = new JLabel("0");
		japaoj.setBounds(424, 411, 15, 15);
		contentPane.add(japaoj);

		japaov = new JLabel("0");
		japaov.setBounds(444, 411, 15, 15);
		contentPane.add(japaov);

		japaoe = new JLabel("0");
		japaoe.setBounds(463, 411, 15, 15);
		contentPane.add(japaoe);

		japaod = new JLabel("0");
		japaod.setBounds(481, 411, 15, 15);
		contentPane.add(japaod);

		japaogp = new JLabel("0");
		japaogp.setBounds(504, 411, 15, 15);
		contentPane.add(japaogp);

		japaogc = new JLabel("0");
		japaogc.setBounds(533, 411, 15, 15);
		contentPane.add(japaogc);

		japaosg = new JLabel("0");
		japaosg.setBounds(561, 411, 15, 15);
		contentPane.add(japaosg);

		costaricap = new JLabel("0");
		costaricap.setBounds(403, 511, 15, 15);
		contentPane.add(costaricap);

		costaricaj = new JLabel("0");
		costaricaj.setBounds(424, 511, 15, 15);
		contentPane.add(costaricaj);

		costaricav = new JLabel("0");
		costaricav.setBounds(444, 511, 15, 15);
		contentPane.add(costaricav);

		costaricae = new JLabel("0");
		costaricae.setBounds(463, 511, 15, 15);
		contentPane.add(costaricae);

		costaricad = new JLabel("0");
		costaricad.setBounds(481, 511, 15, 15);
		contentPane.add(costaricad);

		costaricagp = new JLabel("0");
		costaricagp.setBounds(504, 511, 15, 15);
		contentPane.add(costaricagp);

		costaricagc = new JLabel("0");
		costaricagc.setBounds(533, 511, 15, 15);
		contentPane.add(costaricagc);

		costaricasg = new JLabel("0");
		costaricasg.setBounds(561, 511, 15, 15);
		contentPane.add(costaricasg);

		inglaterrap = new JLabel("0");
		inglaterrap.setBounds(403, 526, 15, 15);
		contentPane.add(inglaterrap);

		inglaterraj = new JLabel("0");
		inglaterraj.setBounds(424, 526, 15, 15);
		contentPane.add(inglaterraj);

		inglaterrav = new JLabel("0");
		inglaterrav.setBounds(444, 526, 15, 15);
		contentPane.add(inglaterrav);

		inglaterrae = new JLabel("0");
		inglaterrae.setBounds(463, 526, 15, 15);
		contentPane.add(inglaterrae);

		inglaterrad = new JLabel("0");
		inglaterrad.setBounds(481, 526, 15, 15);
		contentPane.add(inglaterrad);

		inglaterragp = new JLabel("0");
		inglaterragp.setBounds(504, 526, 15, 15);
		contentPane.add(inglaterragp);

		inglaterragc = new JLabel("0");
		inglaterragc.setBounds(533, 526, 15, 15);
		contentPane.add(inglaterragc);

		inglaterrasg = new JLabel("0");
		inglaterrasg.setBounds(561, 526, 15, 15);
		contentPane.add(inglaterrasg);

		italiap = new JLabel("0");
		italiap.setBounds(403, 538, 15, 15);
		contentPane.add(italiap);

		italiaj = new JLabel("0");
		italiaj.setBounds(424, 538, 15, 15);
		contentPane.add(italiaj);

		italiav = new JLabel("0");
		italiav.setBounds(444, 538, 15, 15);
		contentPane.add(italiav);

		italiae = new JLabel("0");
		italiae.setBounds(463, 538, 15, 15);
		contentPane.add(italiae);

		italiad = new JLabel("0");
		italiad.setBounds(481, 538, 15, 15);
		contentPane.add(italiad);

		italiagp = new JLabel("0");
		italiagp.setBounds(504, 538, 15, 15);
		contentPane.add(italiagp);

		italiagc = new JLabel("0");
		italiagc.setBounds(533, 538, 15, 15);
		contentPane.add(italiagc);

		italiasg = new JLabel("0");
		italiasg.setBounds(561, 538, 15, 15);
		contentPane.add(italiasg);

		uruguaip = new JLabel("0");
		uruguaip.setBounds(403, 552, 15, 15);
		contentPane.add(uruguaip);

		uruguaij = new JLabel("0");
		uruguaij.setBounds(424, 552, 15, 15);
		contentPane.add(uruguaij);

		uruguaiv = new JLabel("0");
		uruguaiv.setBounds(444, 552, 15, 15);
		contentPane.add(uruguaiv);

		uruguaie = new JLabel("0");
		uruguaie.setBounds(463, 552, 15, 15);
		contentPane.add(uruguaie);

		uruguaid = new JLabel("0");
		uruguaid.setBounds(481, 552, 15, 15);
		contentPane.add(uruguaid);

		uruguaigp = new JLabel("0");
		uruguaigp.setBounds(504, 552, 15, 15);
		contentPane.add(uruguaigp);

		uruguaigc = new JLabel("0");
		uruguaigc.setBounds(533, 552, 15, 15);
		contentPane.add(uruguaigc);

		uruguaisg = new JLabel("0");
		uruguaisg.setBounds(561, 552, 15, 15);
		contentPane.add(uruguaisg);

		equadorp = new JLabel("0");
		equadorp.setBounds(978, 76, 15, 15);
		contentPane.add(equadorp);

		equadorj = new JLabel("0");
		equadorj.setBounds(999, 76, 15, 15);
		contentPane.add(equadorj);

		equadorv = new JLabel("0");
		equadorv.setBounds(1019, 76, 15, 15);
		contentPane.add(equadorv);

		equadore = new JLabel("0");
		equadore.setBounds(1038, 76, 15, 15);
		contentPane.add(equadore);

		equadord = new JLabel("0");
		equadord.setBounds(1056, 76, 15, 15);
		contentPane.add(equadord);

		equadorgp = new JLabel("0");
		equadorgp.setBounds(1079, 76, 15, 15);
		contentPane.add(equadorgp);

		equadorgc = new JLabel("0");
		equadorgc.setBounds(1108, 76, 15, 15);
		contentPane.add(equadorgc);

		equadorsg = new JLabel("0");
		equadorsg.setBounds(1136, 76, 15, 15);
		contentPane.add(equadorsg);

		francap = new JLabel("0");
		francap.setBounds(978, 91, 15, 15);
		contentPane.add(francap);

		francaj = new JLabel("0");
		francaj.setBounds(999, 91, 15, 15);
		contentPane.add(francaj);

		francav = new JLabel("0");
		francav.setBounds(1019, 91, 15, 15);
		contentPane.add(francav);

		francae = new JLabel("0");
		francae.setBounds(1038, 91, 15, 15);
		contentPane.add(francae);

		francad = new JLabel("0");
		francad.setBounds(1056, 91, 15, 15);
		contentPane.add(francad);

		francagp = new JLabel("0");
		francagp.setBounds(1079, 91, 15, 15);
		contentPane.add(francagp);

		francagc = new JLabel("0");
		francagc.setBounds(1108, 91, 15, 15);
		contentPane.add(francagc);

		francasg = new JLabel("0");
		francasg.setBounds(1136, 91, 15, 15);
		contentPane.add(francasg);

		hondurasp = new JLabel("0");
		hondurasp.setBounds(978, 103, 15, 15);
		contentPane.add(hondurasp);

		hondurasj = new JLabel("0");
		hondurasj.setBounds(999, 103, 15, 15);
		contentPane.add(hondurasj);

		hondurasv = new JLabel("0");
		hondurasv.setBounds(1019, 103, 15, 15);
		contentPane.add(hondurasv);

		hondurase = new JLabel("0");
		hondurase.setBounds(1038, 103, 15, 15);
		contentPane.add(hondurase);

		hondurasd = new JLabel("0");
		hondurasd.setBounds(1056, 103, 15, 15);
		contentPane.add(hondurasd);

		hondurasgp = new JLabel("0");
		hondurasgp.setBounds(1079, 103, 15, 15);
		contentPane.add(hondurasgp);

		hondurasgc = new JLabel("0");
		hondurasgc.setBounds(1108, 103, 15, 15);
		contentPane.add(hondurasgc);

		hondurassg = new JLabel("0");
		hondurassg.setBounds(1136, 103, 15, 15);
		contentPane.add(hondurassg);

		suicap = new JLabel("0");
		suicap.setBounds(978, 117, 15, 15);
		contentPane.add(suicap);

		suicaj = new JLabel("0");
		suicaj.setBounds(999, 117, 15, 15);
		contentPane.add(suicaj);

		suicav = new JLabel("0");
		suicav.setBounds(1019, 117, 15, 15);
		contentPane.add(suicav);

		suicae = new JLabel("0");
		suicae.setBounds(1038, 117, 15, 15);
		contentPane.add(suicae);

		suicad = new JLabel("0");
		suicad.setBounds(1056, 117, 15, 15);
		contentPane.add(suicad);

		suicagp = new JLabel("0");
		suicagp.setBounds(1079, 117, 15, 15);
		contentPane.add(suicagp);

		suicagc = new JLabel("0");
		suicagc.setBounds(1108, 117, 15, 15);
		contentPane.add(suicagc);

		suicasg = new JLabel("0");
		suicasg.setBounds(1136, 117, 15, 15);
		contentPane.add(suicasg);

		argentinap = new JLabel("0");
		argentinap.setBounds(990, 220, 15, 15);
		contentPane.add(argentinap);

		argentinaj = new JLabel("0");
		argentinaj.setBounds(1011, 220, 15, 15);
		contentPane.add(argentinaj);

		argentinav = new JLabel("0");
		argentinav.setBounds(1031, 220, 15, 15);
		contentPane.add(argentinav);

		argentinae = new JLabel("0");
		argentinae.setBounds(1050, 220, 15, 15);
		contentPane.add(argentinae);

		argentinad = new JLabel("0");
		argentinad.setBounds(1068, 220, 15, 15);
		contentPane.add(argentinad);

		argentinagp = new JLabel("0");
		argentinagp.setBounds(1091, 220, 15, 15);
		contentPane.add(argentinagp);

		argentinagc = new JLabel("0");
		argentinagc.setBounds(1120, 220, 15, 15);
		contentPane.add(argentinagc);

		argentinasg = new JLabel("0");
		argentinasg.setBounds(1148, 220, 15, 15);
		contentPane.add(argentinasg);

		bosniap = new JLabel("0");
		bosniap.setBounds(990, 235, 15, 15);
		contentPane.add(bosniap);

		bosniaj = new JLabel("0");
		bosniaj.setBounds(1011, 235, 15, 15);
		contentPane.add(bosniaj);

		bosniav = new JLabel("0");
		bosniav.setBounds(1031, 235, 15, 15);
		contentPane.add(bosniav);

		bosniae = new JLabel("0");
		bosniae.setBounds(1050, 235, 15, 15);
		contentPane.add(bosniae);

		bosniad = new JLabel("0");
		bosniad.setBounds(1068, 235, 15, 15);
		contentPane.add(bosniad);

		bosniagp = new JLabel("0");
		bosniagp.setBounds(1091, 235, 15, 15);
		contentPane.add(bosniagp);

		bosniagc = new JLabel("0");
		bosniagc.setBounds(1120, 235, 15, 15);
		contentPane.add(bosniagc);

		bosniasg = new JLabel("0");
		bosniasg.setBounds(1148, 235, 15, 15);
		contentPane.add(bosniasg);

		irap = new JLabel("0");
		irap.setBounds(990, 247, 15, 15);
		contentPane.add(irap);

		iraj = new JLabel("0");
		iraj.setBounds(1011, 247, 15, 15);
		contentPane.add(iraj);

		irav = new JLabel("0");
		irav.setBounds(1031, 247, 15, 15);
		contentPane.add(irav);

		irae = new JLabel("0");
		irae.setBounds(1050, 247, 15, 15);
		contentPane.add(irae);

		irad = new JLabel("0");
		irad.setBounds(1068, 247, 15, 15);
		contentPane.add(irad);

		iragp = new JLabel("0");
		iragp.setBounds(1091, 247, 15, 15);
		contentPane.add(iragp);

		iragc = new JLabel("0");
		iragc.setBounds(1120, 247, 15, 15);
		contentPane.add(iragc);

		irasg = new JLabel("0");
		irasg.setBounds(1148, 247, 15, 15);
		contentPane.add(irasg);

		nigeriap = new JLabel("0");
		nigeriap.setBounds(990, 261, 15, 15);
		contentPane.add(nigeriap);

		nigeriaj = new JLabel("0");
		nigeriaj.setBounds(1011, 261, 15, 15);
		contentPane.add(nigeriaj);

		nigeriav = new JLabel("0");
		nigeriav.setBounds(1031, 261, 15, 15);
		contentPane.add(nigeriav);

		nigeriae = new JLabel("0");
		nigeriae.setBounds(1050, 261, 15, 15);
		contentPane.add(nigeriae);

		nigeriad = new JLabel("0");
		nigeriad.setBounds(1068, 261, 15, 15);
		contentPane.add(nigeriad);

		nigeriagp = new JLabel("0");
		nigeriagp.setBounds(1091, 261, 15, 15);
		contentPane.add(nigeriagp);

		nigeriagc = new JLabel("0");
		nigeriagc.setBounds(1120, 261, 15, 15);
		contentPane.add(nigeriagc);

		nigeriasg = new JLabel("0");
		nigeriasg.setBounds(1148, 261, 15, 15);
		contentPane.add(nigeriasg);

		alemanhap = new JLabel("0");
		alemanhap.setBounds(990, 370, 15, 15);
		contentPane.add(alemanhap);

		alemanhaj = new JLabel("0");
		alemanhaj.setBounds(1011, 370, 15, 15);
		contentPane.add(alemanhaj);

		alemanhav = new JLabel("0");
		alemanhav.setBounds(1031, 370, 15, 15);
		contentPane.add(alemanhav);

		alemanhae = new JLabel("0");
		alemanhae.setBounds(1050, 370, 15, 15);
		contentPane.add(alemanhae);

		alemanhad = new JLabel("0");
		alemanhad.setBounds(1068, 370, 15, 15);
		contentPane.add(alemanhad);

		alemanhagp = new JLabel("0");
		alemanhagp.setBounds(1091, 370, 15, 15);
		contentPane.add(alemanhagp);

		alemanhagc = new JLabel("0");
		alemanhagc.setBounds(1120, 370, 15, 15);
		contentPane.add(alemanhagc);

		alemanhasg = new JLabel("0");
		alemanhasg.setBounds(1148, 370, 15, 15);
		contentPane.add(alemanhasg);

		euap = new JLabel("0");
		euap.setBounds(990, 385, 15, 15);
		contentPane.add(euap);

		euaj = new JLabel("0");
		euaj.setBounds(1011, 385, 15, 15);
		contentPane.add(euaj);

		euav = new JLabel("0");
		euav.setBounds(1031, 385, 15, 15);
		contentPane.add(euav);

		euae = new JLabel("0");
		euae.setBounds(1050, 385, 15, 15);
		contentPane.add(euae);

		euad = new JLabel("0");
		euad.setBounds(1068, 385, 15, 15);
		contentPane.add(euad);

		euagp = new JLabel("0");
		euagp.setBounds(1091, 385, 15, 15);
		contentPane.add(euagp);

		euagc = new JLabel("0");
		euagc.setBounds(1120, 385, 15, 15);
		contentPane.add(euagc);

		euasg = new JLabel("0");
		euasg.setBounds(1148, 385, 15, 15);
		contentPane.add(euasg);

		ganap = new JLabel("0");
		ganap.setBounds(990, 397, 15, 15);
		contentPane.add(ganap);

		ganaj = new JLabel("0");
		ganaj.setBounds(1011, 397, 15, 15);
		contentPane.add(ganaj);

		ganav = new JLabel("0");
		ganav.setBounds(1031, 397, 15, 15);
		contentPane.add(ganav);

		ganae = new JLabel("0");
		ganae.setBounds(1050, 397, 15, 15);
		contentPane.add(ganae);

		ganad = new JLabel("0");
		ganad.setBounds(1068, 397, 15, 15);
		contentPane.add(ganad);

		ganagp = new JLabel("0");
		ganagp.setBounds(1091, 397, 15, 15);
		contentPane.add(ganagp);

		ganagc = new JLabel("0");
		ganagc.setBounds(1120, 397, 15, 15);
		contentPane.add(ganagc);

		ganasg = new JLabel("0");
		ganasg.setBounds(1148, 397, 15, 15);
		contentPane.add(ganasg);

		portugalp = new JLabel("0");
		portugalp.setBounds(990, 411, 15, 15);
		contentPane.add(portugalp);

		portugalj = new JLabel("0");
		portugalj.setBounds(1011, 411, 15, 15);
		contentPane.add(portugalj);

		portugalv = new JLabel("0");
		portugalv.setBounds(1031, 411, 15, 15);
		contentPane.add(portugalv);

		portugale = new JLabel("0");
		portugale.setBounds(1050, 411, 15, 15);
		contentPane.add(portugale);

		portugald = new JLabel("0");
		portugald.setBounds(1068, 411, 15, 15);
		contentPane.add(portugald);

		portugalgp = new JLabel("0");
		portugalgp.setBounds(1091, 411, 15, 15);
		contentPane.add(portugalgp);

		portugalgc = new JLabel("0");
		portugalgc.setBounds(1120, 411, 15, 15);
		contentPane.add(portugalgc);

		portugalsg = new JLabel("0");
		portugalsg.setBounds(1148, 411, 15, 15);
		contentPane.add(portugalsg);

		argeliap = new JLabel("0");
		argeliap.setBounds(978, 515, 15, 15);
		contentPane.add(argeliap);

		argeliaj = new JLabel("0");
		argeliaj.setBounds(999, 515, 15, 15);
		contentPane.add(argeliaj);

		argeliav = new JLabel("0");
		argeliav.setBounds(1019, 515, 15, 15);
		contentPane.add(argeliav);

		argeliae = new JLabel("0");
		argeliae.setBounds(1038, 515, 15, 15);
		contentPane.add(argeliae);

		argeliad = new JLabel("0");
		argeliad.setBounds(1056, 515, 15, 15);
		contentPane.add(argeliad);

		argeliagp = new JLabel("0");
		argeliagp.setBounds(1079, 515, 15, 15);
		contentPane.add(argeliagp);

		argeliagc = new JLabel("0");
		argeliagc.setBounds(1108, 515, 15, 15);
		contentPane.add(argeliagc);

		argeliasg = new JLabel("0");
		argeliasg.setBounds(1136, 515, 15, 15);
		contentPane.add(argeliasg);

		belgicap = new JLabel("0");
		belgicap.setBounds(978, 530, 15, 15);
		contentPane.add(belgicap);

		belgicaj = new JLabel("0");
		belgicaj.setBounds(999, 530, 15, 15);
		contentPane.add(belgicaj);

		belgicav = new JLabel("0");
		belgicav.setBounds(1019, 530, 15, 15);
		contentPane.add(belgicav);

		belgicae = new JLabel("0");
		belgicae.setBounds(1038, 530, 15, 15);
		contentPane.add(belgicae);

		belgicad = new JLabel("0");
		belgicad.setBounds(1056, 530, 15, 15);
		contentPane.add(belgicad);

		belgicagp = new JLabel("0");
		belgicagp.setBounds(1079, 530, 15, 15);
		contentPane.add(belgicagp);

		belgicagc = new JLabel("0");
		belgicagc.setBounds(1108, 530, 15, 15);
		contentPane.add(belgicagc);

		belgicasg = new JLabel("0");
		belgicasg.setBounds(1136, 530, 15, 15);
		contentPane.add(belgicasg);

		cdosulp = new JLabel("0");
		cdosulp.setBounds(978, 542, 15, 15);
		contentPane.add(cdosulp);

		cdosulj = new JLabel("0");
		cdosulj.setBounds(999, 542, 15, 15);
		contentPane.add(cdosulj);

		cdosulv = new JLabel("0");
		cdosulv.setBounds(1019, 542, 15, 15);
		contentPane.add(cdosulv);

		cdosule = new JLabel("0");
		cdosule.setBounds(1038, 542, 15, 15);
		contentPane.add(cdosule);

		cdosuld = new JLabel("0");
		cdosuld.setBounds(1056, 542, 15, 15);
		contentPane.add(cdosuld);

		cdosulgp = new JLabel("0");
		cdosulgp.setBounds(1079, 542, 15, 15);
		contentPane.add(cdosulgp);

		cdosulgc = new JLabel("0");
		cdosulgc.setBounds(1108, 542, 15, 15);
		contentPane.add(cdosulgc);

		cdosulsg = new JLabel("0");
		cdosulsg.setBounds(1136, 542, 15, 15);
		contentPane.add(cdosulsg);

		russiap = new JLabel("0");
		russiap.setBounds(978, 556, 15, 15);
		contentPane.add(russiap);

		russiaj = new JLabel("0");
		russiaj.setBounds(999, 556, 15, 15);
		contentPane.add(russiaj);

		russiav = new JLabel("0");
		russiav.setBounds(1019, 556, 15, 15);
		contentPane.add(russiav);

		russiae = new JLabel("0");
		russiae.setBounds(1038, 556, 15, 15);
		contentPane.add(russiae);

		russiad = new JLabel("0");
		russiad.setBounds(1056, 556, 15, 15);
		contentPane.add(russiad);

		russiagp = new JLabel("0");
		russiagp.setBounds(1079, 556, 15, 15);
		contentPane.add(russiagp);

		russiagc = new JLabel("0");
		russiagc.setBounds(1108, 556, 15, 15);
		contentPane.add(russiagc);

		russiasg = new JLabel("0");
		russiasg.setBounds(1136, 556, 15, 15);
		contentPane.add(russiasg);

		JLabel UEPB = new JLabel("image");
		UEPB.setBounds(0, 0, 1174, 607);
		UEPB.setIcon(new ImageIcon(getClass().getResource("imagens/grupos.png")));
		contentPane.add(UEPB);

	}

	public void preencheTabela() {
		List<Jogo> jogos = Persistence.listJogo();

		if (jogos.size() != 0) {
			for (Jogo jg : jogos) {
				if (jg.equals("Brasil", "Croacia")) {
					textA1_1.setText(Integer.toString(jg.getValor1()));
					textA1_2.setText(Integer.toString(jg.getValor2()));
				}
				if (jg.equals("Mexico", "Camaroes")) {
					textA2_1.setText(Integer.toString(jg.getValor1()));
					textA2_2.setText(Integer.toString(jg.getValor2()));
				}
				if (jg.equals("Brasil", "Mexico")) {
					textA3_1.setText(Integer.toString(jg.getValor1()));
					textA3_2.setText(Integer.toString(jg.getValor2()));
				}
				if (jg.equals("Camaroes", "Croacia")) {
					textA4_1.setText(Integer.toString(jg.getValor1()));
					textA4_2.setText(Integer.toString(jg.getValor2()));
				}
				if (jg.equals("Camaroes", "Brasil")) {
					textA5_1.setText(Integer.toString(jg.getValor1()));
					textA5_2.setText(Integer.toString(jg.getValor2()));
				}
				if (jg.equals("Croacia", "Mexico")) {
					textA6_1.setText(Integer.toString(jg.getValor1()));
					textA6_2.setText(Integer.toString(jg.getValor2()));
				}
				if (jg.equals("Espanha", "Holanda")) {
					textB1_1.setText(Integer.toString(jg.getValor1()));
					textB1_2.setText(Integer.toString(jg.getValor2()));
				}
				if (jg.equals("Chile", "Australia")) {
					textB2_1.setText(Integer.toString(jg.getValor1()));
					textB2_2.setText(Integer.toString(jg.getValor2()));
				}
				if (jg.equals("Australia", "Holanda")) {
					textB3_1.setText(Integer.toString(jg.getValor1()));
					textB3_2.setText(Integer.toString(jg.getValor2()));
				}
				if (jg.equals("Espanha", "Chile")) {
					textB4_1.setText(Integer.toString(jg.getValor1()));
					textB4_2.setText(Integer.toString(jg.getValor2()));
				}
				if (jg.equals("Australia", "Espanha")) {
					textB5_1.setText(Integer.toString(jg.getValor1()));
					textB5_2.setText(Integer.toString(jg.getValor2()));
				}
				if (jg.equals("Holanda", "Chile")) {
					textB6_1.setText(Integer.toString(jg.getValor1()));
					textB6_2.setText(Integer.toString(jg.getValor2()));
				}
				if (jg.equals("Holanda", "Chile")) {
					textC1_1.setText(Integer.toString(jg.getValor1()));
					textC1_2.setText(Integer.toString(jg.getValor2()));
				}
				if (jg.equals("Colombia", "Grecia")) {
					textC2_1.setText(Integer.toString(jg.getValor1()));
					textC2_2.setText(Integer.toString(jg.getValor2()));
				}
				if (jg.equals("Cmarfim", "Japao")) {
					textC3_1.setText(Integer.toString(jg.getValor1()));
					textC3_2.setText(Integer.toString(jg.getValor2()));
				}
				if (jg.equals("Colombia", "Cmarfim")) {
					textC4_1.setText(Integer.toString(jg.getValor1()));
					textC4_2.setText(Integer.toString(jg.getValor2()));
				}
				if (jg.equals("Japao", "Grecia")) {
					textC5_1.setText(Integer.toString(jg.getValor1()));
					textC5_2.setText(Integer.toString(jg.getValor2()));
				}
				if (jg.equals("Japao", "Colombia")) {
					textC6_1.setText(Integer.toString(jg.getValor1()));
					textC6_2.setText(Integer.toString(jg.getValor2()));
				}
				if (jg.equals("Grecia", "Cmarfim")) {
					textD1_1.setText(Integer.toString(jg.getValor1()));
					textD1_2.setText(Integer.toString(jg.getValor2()));
				}
				if (jg.equals("Uruguai", "Costarica")) {
					textD2_1.setText(Integer.toString(jg.getValor1()));
					textD2_2.setText(Integer.toString(jg.getValor2()));
				}
				if (jg.equals("Inglaterra", "Italia")) {
					textD3_1.setText(Integer.toString(jg.getValor1()));
					textD3_2.setText(Integer.toString(jg.getValor2()));
				}
				if (jg.equals("Uruguai", "Inglaterra")) {
					textD4_1.setText(Integer.toString(jg.getValor1()));
					textD4_2.setText(Integer.toString(jg.getValor2()));
				}
				if (jg.equals("Italia", "Costarica")) {
					textD5_1.setText(Integer.toString(jg.getValor1()));
					textD5_2.setText(Integer.toString(jg.getValor2()));
				}
				if (jg.equals("Costarica", "Inglaterra")) {
					textD6_1.setText(Integer.toString(jg.getValor1()));
					textD6_2.setText(Integer.toString(jg.getValor2()));
				}
				if (jg.equals("Suica", "Equador")) {
					textE1_1.setText(Integer.toString(jg.getValor1()));
					textE1_2.setText(Integer.toString(jg.getValor2()));
				}
				if (jg.equals("Franca", "Honduras")) {
					textE2_1.setText(Integer.toString(jg.getValor1()));
					textE2_2.setText(Integer.toString(jg.getValor2()));
				}
				if (jg.equals("Suica", "Franca")) {
					textE3_1.setText(Integer.toString(jg.getValor1()));
					textE3_2.setText(Integer.toString(jg.getValor2()));
				}
				if (jg.equals("Honduras", "Equador")) {
					textE4_1.setText(Integer.toString(jg.getValor1()));
					textE4_2.setText(Integer.toString(jg.getValor2()));
				}
				if (jg.equals("Honduras", "Suica")) {
					textE5_1.setText(Integer.toString(jg.getValor1()));
					textE5_2.setText(Integer.toString(jg.getValor2()));
				}
				if (jg.equals("Equador", "Franca")) {
					textE6_1.setText(Integer.toString(jg.getValor1()));
					textE6_2.setText(Integer.toString(jg.getValor2()));
				}
				if (jg.equals("Argentina", "Bosnia")) {
					textF1_1.setText(Integer.toString(jg.getValor1()));
					textF1_2.setText(Integer.toString(jg.getValor2()));
				}
				if (jg.equals("Ira", "Nigeria")) {
					textF2_1.setText(Integer.toString(jg.getValor1()));
					textF2_2.setText(Integer.toString(jg.getValor2()));
				}
				if (jg.equals("Argentina", "Ira")) {
					textF3_1.setText(Integer.toString(jg.getValor1()));
					textF3_2.setText(Integer.toString(jg.getValor2()));
				}
				if (jg.equals("Nigeria", "Bosnia")) {
					textF4_1.setText(Integer.toString(jg.getValor1()));
					textF4_2.setText(Integer.toString(jg.getValor2()));
				}
				if (jg.equals("Nigeria", "Argentina")) {
					textF5_1.setText(Integer.toString(jg.getValor1()));
					textF5_2.setText(Integer.toString(jg.getValor2()));
				}
				if (jg.equals("Bosnia", "Ira")) {
					textF6_1.setText(Integer.toString(jg.getValor1()));
					textF6_2.setText(Integer.toString(jg.getValor2()));
				}
				if (jg.equals("Alemanha", "Portugal")) {
					textG1_1.setText(Integer.toString(jg.getValor1()));
					textG1_2.setText(Integer.toString(jg.getValor2()));
				}
				if (jg.equals("Gana", "Eua")) {
					textG2_1.setText(Integer.toString(jg.getValor1()));
					textG2_2.setText(Integer.toString(jg.getValor2()));
				}
				if (jg.equals("Alemanha", "Gana")) {
					textG3_1.setText(Integer.toString(jg.getValor1()));
					textG3_2.setText(Integer.toString(jg.getValor2()));
				}
				if (jg.equals("Eua", "Portugal")) {
					textG4_1.setText(Integer.toString(jg.getValor1()));
					textG4_2.setText(Integer.toString(jg.getValor2()));
				}
				if (jg.equals("Eua", "Alemanha")) {
					textG5_1.setText(Integer.toString(jg.getValor1()));
					textG5_2.setText(Integer.toString(jg.getValor2()));
				}
				if (jg.equals("Portugal", "Gana")) {
					textG6_1.setText(Integer.toString(jg.getValor1()));
					textG6_2.setText(Integer.toString(jg.getValor2()));
				}
				if (jg.equals("Belgica", "Argelia")) {
					textH1_1.setText(Integer.toString(jg.getValor1()));
					textH1_2.setText(Integer.toString(jg.getValor2()));
				}
				if (jg.equals("Russia", "Cdosul")) {
					textH2_1.setText(Integer.toString(jg.getValor1()));
					textH2_2.setText(Integer.toString(jg.getValor2()));
				}
				if (jg.equals("Belgica", "Russia")) {
					textH3_1.setText(Integer.toString(jg.getValor1()));
					textH3_2.setText(Integer.toString(jg.getValor2()));
				}
				if (jg.equals("Cdosul", "Argelia")) {
					textH4_1.setText(Integer.toString(jg.getValor1()));
					textH4_2.setText(Integer.toString(jg.getValor2()));
				}
				if (jg.equals("Cdosul", "Belgica")) {
					textH5_1.setText(Integer.toString(jg.getValor1()));
					textH5_2.setText(Integer.toString(jg.getValor2()));
				}
				if (jg.equals("Argelia", "Russia")) {
					textH6_1.setText(Integer.toString(jg.getValor1()));
					textH6_2.setText(Integer.toString(jg.getValor2()));
				}

			}
		}

		/*
		 * GRUPO A
		 */

		// Brasil x croacia

		if (!(textA1_1.getText().isEmpty() && textA1_2.getText().isEmpty())) {
			brasilj.setText(Integer.toString(Integer.parseInt(brasilj.getText()) + 1));
			croaciaj.setText(Integer.toString(Integer.parseInt(croaciaj.getText()) + 1));

			brasilgp.setText(
					Integer.toString(Integer.parseInt(brasilgp.getText()) + (Integer.parseInt(textA1_1.getText()))));
			croaciagp.setText(
					Integer.toString(Integer.parseInt(croaciagp.getText()) + (Integer.parseInt(textA1_2.getText()))));

			brasilgc.setText(
					Integer.toString(Integer.parseInt(brasilgc.getText()) + (Integer.parseInt(textA1_2.getText()))));
			croaciagc.setText(
					Integer.toString(Integer.parseInt(croaciagc.getText()) + (Integer.parseInt(textA1_1.getText()))));

			brasilsg.setText(
					Integer.toString(Integer.parseInt(brasilgp.getText()) - (Integer.parseInt(brasilgc.getText()))));
			croaciasg.setText(
					Integer.toString(Integer.parseInt(croaciagp.getText()) - (Integer.parseInt(croaciagc.getText()))));

			if (Integer.parseInt(textA1_1.getText()) > Integer.parseInt(textA1_2.getText())) {
				brasilv.setText(Integer.toString(Integer.parseInt(brasilv.getText()) + 1));
				croaciad.setText(Integer.toString(Integer.parseInt(croaciad.getText()) + 1));
				brasilp.setText(Integer.toString(Integer.parseInt(brasilp.getText()) + 3));
			} else if (Integer.parseInt(textA1_2.getText()) > Integer.parseInt(textA1_1.getText())) {
				brasild.setText(Integer.toString(Integer.parseInt(brasild.getText()) + 1));
				croaciap.setText(Integer.toString(Integer.parseInt(croaciap.getText()) + 3));
				croaciav.setText(Integer.toString(Integer.parseInt(croaciav.getText()) + 1));
			} else {
				brasile.setText(Integer.toString(Integer.parseInt(brasile.getText()) + 1));
				croaciae.setText(Integer.toString(Integer.parseInt(croaciae.getText()) + 1));
				croaciap.setText(Integer.toString(Integer.parseInt(croaciap.getText()) + 1));
				brasilp.setText(Integer.toString(Integer.parseInt(brasilp.getText()) + 1));
			}

		}

		// Mexico x camaroes
		if (!textA2_1.getText().isEmpty() && !textA2_2.getText().isEmpty()) {
			mexicoj.setText(Integer.toString(Integer.parseInt(mexicoj.getText()) + 1));
			camaroesj.setText(Integer.toString(Integer.parseInt(camaroesj.getText()) + 1));

			mexicogp.setText(
					Integer.toString(Integer.parseInt(mexicogp.getText()) + (Integer.parseInt(textA2_1.getText()))));
			camaroesgp.setText(
					Integer.toString(Integer.parseInt(camaroesgp.getText()) + (Integer.parseInt(textA2_2.getText()))));

			mexicogc.setText(
					Integer.toString(Integer.parseInt(mexicogc.getText()) + (Integer.parseInt(textA2_2.getText()))));
			camaroesgc.setText(
					Integer.toString(Integer.parseInt(camaroesgc.getText()) + (Integer.parseInt(textA2_1.getText()))));

			mexicosg.setText(
					Integer.toString(Integer.parseInt(mexicogp.getText()) - (Integer.parseInt(mexicogc.getText()))));
			camaroessg.setText(Integer
					.toString(Integer.parseInt(camaroesgp.getText()) - (Integer.parseInt(camaroesgc.getText()))));

			if (Integer.parseInt(textA2_1.getText()) > Integer.parseInt(textA2_2.getText())) {
				mexicov.setText(Integer.toString(Integer.parseInt(mexicov.getText()) + 1));
				mexicop.setText(Integer.toString(Integer.parseInt(mexicop.getText()) + 3));
				camaroesd.setText(Integer.toString(Integer.parseInt(camaroesd.getText()) + 1));
			} else if (Integer.parseInt(textA2_2.getText()) > Integer.parseInt(textA2_1.getText())) {
				mexicod.setText(Integer.toString(Integer.parseInt(mexicod.getText()) + 1));
				camaroesv.setText(Integer.toString(Integer.parseInt(camaroesv.getText()) + 1));
				camaroesp.setText(Integer.toString(Integer.parseInt(camaroesp.getText()) + 3));
			} else {
				mexicoe.setText(Integer.toString(Integer.parseInt(mexicoe.getText()) + 1));
				camaroese.setText(Integer.toString(Integer.parseInt(camaroese.getText()) + 1));
				camaroesp.setText(Integer.toString(Integer.parseInt(camaroesp.getText()) + 1));
				mexicop.setText(Integer.toString(Integer.parseInt(mexicop.getText()) + 1));
			}

		}

		// Brasil x mexico
		if (!textA3_1.getText().isEmpty() && !textA3_2.getText().isEmpty()) {
			brasilj.setText(Integer.toString(Integer.parseInt(brasilj.getText()) + 1));
			mexicoj.setText(Integer.toString(Integer.parseInt(mexicoj.getText()) + 1));

			brasilgp.setText(
					Integer.toString((Integer.parseInt(brasilgp.getText())) + (Integer.parseInt(textA3_1.getText()))));
			mexicogp.setText(
					Integer.toString((Integer.parseInt(mexicogp.getText())) + (Integer.parseInt(textA3_2.getText()))));

			brasilgc.setText(
					Integer.toString((Integer.parseInt(brasilgc.getText())) + (Integer.parseInt(textA3_2.getText()))));
			mexicogc.setText(
					Integer.toString((Integer.parseInt(mexicogc.getText())) + (Integer.parseInt(textA3_1.getText()))));

			brasilsg.setText(
					Integer.toString((Integer.parseInt(brasilgp.getText())) - (Integer.parseInt(brasilgc.getText()))));
			mexicosg.setText(
					Integer.toString((Integer.parseInt(mexicogp.getText())) - (Integer.parseInt(mexicogc.getText()))));

			if (Integer.parseInt(textA3_1.getText()) > Integer.parseInt(textA3_2.getText())) {
				brasilv.setText(Integer.toString(Integer.parseInt(brasilv.getText()) + 1));
				mexicod.setText(Integer.toString(Integer.parseInt(mexicod.getText()) + 1));
				brasilp.setText(Integer.toString(Integer.parseInt(brasilp.getText()) + 3));
			} else if (Integer.parseInt(textA3_2.getText()) > Integer.parseInt(textA3_1.getText())) {
				brasild.setText(Integer.toString(Integer.parseInt(brasild.getText()) + 1));
				mexicop.setText(Integer.toString(Integer.parseInt(mexicop.getText()) + 3));
				mexicov.setText(Integer.toString(Integer.parseInt(mexicov.getText()) + 1));
			} else {
				brasile.setText(Integer.toString(Integer.parseInt(brasile.getText()) + 1));
				mexicoe.setText(Integer.toString(Integer.parseInt(mexicoe.getText()) + 1));
				mexicop.setText(Integer.toString(Integer.parseInt(mexicop.getText()) + 1));
				brasilp.setText(Integer.toString(Integer.parseInt(brasilp.getText()) + 1));
			}

		}

		// Camaroes x Croacia

		if (!textA4_1.getText().isEmpty() && !textA4_2.getText().isEmpty()) {
			camaroesj.setText(Integer.toString(Integer.parseInt(camaroesj.getText()) + 1));
			croaciaj.setText(Integer.toString(Integer.parseInt(croaciaj.getText()) + 1));

			camaroesgp.setText(
					Integer.toString(Integer.parseInt(camaroesgp.getText()) + (Integer.parseInt(textA4_1.getText()))));
			croaciagp.setText(
					Integer.toString(Integer.parseInt(croaciagp.getText()) + (Integer.parseInt(textA4_2.getText()))));

			camaroesgc.setText(
					Integer.toString(Integer.parseInt(camaroesgc.getText()) + (Integer.parseInt(textA4_2.getText()))));
			croaciagc.setText(
					Integer.toString(Integer.parseInt(croaciagc.getText()) + (Integer.parseInt(textA4_1.getText()))));

			camaroessg.setText(Integer
					.toString(Integer.parseInt(camaroesgp.getText()) - (Integer.parseInt(camaroesgc.getText()))));
			croaciasg.setText(
					Integer.toString(Integer.parseInt(croaciagp.getText()) - (Integer.parseInt(croaciagc.getText()))));

			if (Integer.parseInt(textA4_1.getText()) > Integer.parseInt(textA4_2.getText())) {
				camaroesv.setText(Integer.toString(Integer.parseInt(camaroesv.getText()) + 1));
				croaciad.setText(Integer.toString(Integer.parseInt(croaciad.getText()) + 1));
				camaroesp.setText(Integer.toString(Integer.parseInt(camaroesp.getText()) + 3));
			} else if (Integer.parseInt(textA4_2.getText()) > Integer.parseInt(textA4_1.getText())) {
				camaroesd.setText(Integer.toString(Integer.parseInt(camaroesd.getText()) + 1));
				croaciap.setText(Integer.toString(Integer.parseInt(croaciap.getText()) + 3));
				croaciav.setText(Integer.toString(Integer.parseInt(croaciav.getText()) + 1));
			} else {
				camaroese.setText(Integer.toString(Integer.parseInt(camaroese.getText()) + 1));
				croaciae.setText(Integer.toString(Integer.parseInt(croaciae.getText()) + 1));
				croaciap.setText(Integer.toString(Integer.parseInt(croaciap.getText()) + 1));
				camaroesp.setText(Integer.toString(Integer.parseInt(camaroesp.getText()) + 1));
			}

		}

		// Camaroes x Brasil

		if (!textA5_1.getText().isEmpty() && !textA5_2.getText().isEmpty()) {
			camaroesj.setText(Integer.toString(Integer.parseInt(camaroesj.getText()) + 1));
			brasilj.setText(Integer.toString(Integer.parseInt(brasilj.getText()) + 1));

			camaroesgp.setText(
					Integer.toString(Integer.parseInt(camaroesgp.getText()) + (Integer.parseInt(textA5_1.getText()))));
			brasilgp.setText(
					Integer.toString(Integer.parseInt(brasilgp.getText()) + (Integer.parseInt(textA5_2.getText()))));

			camaroesgc.setText(
					Integer.toString(Integer.parseInt(camaroesgc.getText()) + (Integer.parseInt(textA5_2.getText()))));
			brasilgc.setText(
					Integer.toString(Integer.parseInt(brasilgc.getText()) + (Integer.parseInt(textA5_1.getText()))));

			camaroessg.setText(Integer
					.toString(Integer.parseInt(camaroesgp.getText()) - (Integer.parseInt(camaroesgc.getText()))));
			brasilsg.setText(
					Integer.toString(Integer.parseInt(brasilgp.getText()) - (Integer.parseInt(brasilgc.getText()))));

			if (Integer.parseInt(textA5_1.getText()) > Integer.parseInt(textA5_2.getText())) {
				camaroesv.setText(Integer.toString(Integer.parseInt(camaroesv.getText()) + 1));
				brasild.setText(Integer.toString(Integer.parseInt(brasild.getText()) + 1));
				camaroesp.setText(Integer.toString(Integer.parseInt(camaroesp.getText()) + 3));
			} else if (Integer.parseInt(textA5_2.getText()) > Integer.parseInt(textA5_1.getText())) {
				camaroesd.setText(Integer.toString(Integer.parseInt(camaroesd.getText()) + 1));
				brasilp.setText(Integer.toString(Integer.parseInt(brasilp.getText()) + 3));
				brasilv.setText(Integer.toString(Integer.parseInt(brasilv.getText()) + 1));
			} else {
				camaroese.setText(Integer.toString(Integer.parseInt(camaroese.getText()) + 1));
				brasile.setText(Integer.toString(Integer.parseInt(brasile.getText()) + 1));
				brasilp.setText(Integer.toString(Integer.parseInt(brasilp.getText()) + 1));
				camaroesp.setText(Integer.toString(Integer.parseInt(camaroesp.getText()) + 1));
			}

		}

		// Croacia x Mexico

		if (!textA6_1.getText().isEmpty() && !textA6_2.getText().isEmpty()) {
			croaciaj.setText(Integer.toString(Integer.parseInt(croaciaj.getText()) + 1));
			mexicoj.setText(Integer.toString(Integer.parseInt(mexicoj.getText()) + 1));

			croaciagp.setText(
					Integer.toString(Integer.parseInt(croaciagp.getText()) + (Integer.parseInt(textA6_1.getText()))));
			mexicogp.setText(
					Integer.toString(Integer.parseInt(mexicogp.getText()) + (Integer.parseInt(textA6_2.getText()))));

			croaciagc.setText(
					Integer.toString(Integer.parseInt(croaciagc.getText()) + (Integer.parseInt(textA6_2.getText()))));
			mexicogc.setText(
					Integer.toString(Integer.parseInt(mexicogc.getText()) + (Integer.parseInt(textA6_1.getText()))));

			croaciasg.setText(
					Integer.toString(Integer.parseInt(croaciagp.getText()) - (Integer.parseInt(croaciagc.getText()))));
			mexicosg.setText(
					Integer.toString(Integer.parseInt(mexicogp.getText()) - (Integer.parseInt(mexicogc.getText()))));

			if (Integer.parseInt(textA6_1.getText()) > Integer.parseInt(textA6_2.getText())) {
				croaciav.setText(Integer.toString(Integer.parseInt(croaciav.getText()) + 1));
				mexicod.setText(Integer.toString(Integer.parseInt(mexicod.getText()) + 1));
				croaciap.setText(Integer.toString(Integer.parseInt(croaciap.getText()) + 3));
			} else if (Integer.parseInt(textA6_2.getText()) > Integer.parseInt(textA6_1.getText())) {
				croaciad.setText(Integer.toString(Integer.parseInt(croaciad.getText()) + 1));
				mexicop.setText(Integer.toString(Integer.parseInt(mexicop.getText()) + 3));
				mexicov.setText(Integer.toString(Integer.parseInt(mexicov.getText()) + 1));
			} else {
				croaciae.setText(Integer.toString(Integer.parseInt(croaciae.getText()) + 1));
				mexicoe.setText(Integer.toString(Integer.parseInt(mexicoe.getText()) + 1));
				mexicop.setText(Integer.toString(Integer.parseInt(mexicop.getText()) + 1));
				croaciap.setText(Integer.toString(Integer.parseInt(croaciap.getText()) + 1));
			}

		}

		/*
		 * GRUPO B
		 */

		// espanha x holanda
		if (!(textB1_1.getText().isEmpty() && textB1_2.getText().isEmpty())) {
			espanhaj.setText(Integer.toString(Integer.parseInt(espanhaj.getText()) + 1));
			holandaj.setText(Integer.toString(Integer.parseInt(holandaj.getText()) + 1));

			espanhagp.setText(
					Integer.toString(Integer.parseInt(espanhagp.getText()) + (Integer.parseInt(textB1_1.getText()))));
			holandagp.setText(
					Integer.toString(Integer.parseInt(holandagp.getText()) + (Integer.parseInt(textB1_2.getText()))));

			espanhagc.setText(
					Integer.toString(Integer.parseInt(espanhagc.getText()) + (Integer.parseInt(textB1_2.getText()))));
			holandagc.setText(
					Integer.toString(Integer.parseInt(holandagc.getText()) + (Integer.parseInt(textB1_1.getText()))));

			espanhasg.setText(
					Integer.toString(Integer.parseInt(espanhagp.getText()) - (Integer.parseInt(espanhagc.getText()))));
			holandasg.setText(
					Integer.toString(Integer.parseInt(holandagp.getText()) - (Integer.parseInt(holandagc.getText()))));

			if (Integer.parseInt(textB1_1.getText()) > Integer.parseInt(textB1_2.getText())) {
				espanhav.setText(Integer.toString(Integer.parseInt(espanhav.getText()) + 1));
				holandad.setText(Integer.toString(Integer.parseInt(holandad.getText()) + 1));
				espanhap.setText(Integer.toString(Integer.parseInt(espanhap.getText()) + 3));
			} else if (Integer.parseInt(textB1_2.getText()) > Integer.parseInt(textB1_1.getText())) {
				espanhad.setText(Integer.toString(Integer.parseInt(espanhad.getText()) + 1));
				holandap.setText(Integer.toString(Integer.parseInt(holandap.getText()) + 3));
				holandav.setText(Integer.toString(Integer.parseInt(holandav.getText()) + 1));
			} else {
				espanhae.setText(Integer.toString(Integer.parseInt(espanhae.getText()) + 1));
				holandae.setText(Integer.toString(Integer.parseInt(holandae.getText()) + 1));
				holandap.setText(Integer.toString(Integer.parseInt(holandap.getText()) + 1));
				espanhap.setText(Integer.toString(Integer.parseInt(espanhap.getText()) + 1));
			}

		}

		// chile x australia
		if (!(textB2_1.getText().isEmpty() && textB2_2.getText().isEmpty())) {
			chilej.setText(Integer.toString(Integer.parseInt(chilej.getText()) + 1));
			australiaj.setText(Integer.toString(Integer.parseInt(australiaj.getText()) + 1));

			chilegp.setText(
					Integer.toString(Integer.parseInt(chilegp.getText()) + (Integer.parseInt(textB2_1.getText()))));
			australiagp.setText(
					Integer.toString(Integer.parseInt(australiagp.getText()) + (Integer.parseInt(textB2_2.getText()))));

			chilegc.setText(
					Integer.toString(Integer.parseInt(chilegc.getText()) + (Integer.parseInt(textB2_2.getText()))));
			australiagc.setText(
					Integer.toString(Integer.parseInt(australiagc.getText()) + (Integer.parseInt(textB2_1.getText()))));

			chilesg.setText(
					Integer.toString(Integer.parseInt(chilegp.getText()) - (Integer.parseInt(chilegc.getText()))));
			australiasg.setText(Integer
					.toString(Integer.parseInt(australiagp.getText()) - (Integer.parseInt(australiagc.getText()))));

			if (Integer.parseInt(textB2_1.getText()) > Integer.parseInt(textB2_2.getText())) {
				chilev.setText(Integer.toString(Integer.parseInt(chilev.getText()) + 1));
				australiad.setText(Integer.toString(Integer.parseInt(australiad.getText()) + 1));
				chilep.setText(Integer.toString(Integer.parseInt(chilep.getText()) + 3));
			} else if (Integer.parseInt(textB2_2.getText()) > Integer.parseInt(textB2_1.getText())) {
				chiled.setText(Integer.toString(Integer.parseInt(chiled.getText()) + 1));
				australiap.setText(Integer.toString(Integer.parseInt(australiap.getText()) + 3));
				australiav.setText(Integer.toString(Integer.parseInt(australiav.getText()) + 1));
			} else {
				chilee.setText(Integer.toString(Integer.parseInt(chilee.getText()) + 1));
				australiae.setText(Integer.toString(Integer.parseInt(australiae.getText()) + 1));
				australiap.setText(Integer.toString(Integer.parseInt(australiap.getText()) + 1));
				chilep.setText(Integer.toString(Integer.parseInt(chilep.getText()) + 1));
			}

		}

		// australia x holanda
		if (!(textB3_1.getText().isEmpty() && textB3_2.getText().isEmpty())) {
			australiaj.setText(Integer.toString(Integer.parseInt(australiaj.getText()) + 1));
			holandaj.setText(Integer.toString(Integer.parseInt(holandaj.getText()) + 1));

			australiagp.setText(
					Integer.toString(Integer.parseInt(australiagp.getText()) + (Integer.parseInt(textB3_1.getText()))));
			holandagp.setText(
					Integer.toString(Integer.parseInt(holandagp.getText()) + (Integer.parseInt(textB3_2.getText()))));

			australiagc.setText(
					Integer.toString(Integer.parseInt(australiagc.getText()) + (Integer.parseInt(textB3_2.getText()))));
			holandagc.setText(
					Integer.toString(Integer.parseInt(holandagc.getText()) + (Integer.parseInt(textB3_1.getText()))));

			australiasg.setText(Integer
					.toString(Integer.parseInt(australiagp.getText()) - (Integer.parseInt(australiagc.getText()))));
			holandasg.setText(
					Integer.toString(Integer.parseInt(holandagp.getText()) - (Integer.parseInt(holandagc.getText()))));

			if (Integer.parseInt(textB3_1.getText()) > Integer.parseInt(textB3_2.getText())) {
				australiav.setText(Integer.toString(Integer.parseInt(australiav.getText()) + 1));
				holandad.setText(Integer.toString(Integer.parseInt(holandad.getText()) + 1));
				australiap.setText(Integer.toString(Integer.parseInt(australiap.getText()) + 3));
			} else if (Integer.parseInt(textB3_2.getText()) > Integer.parseInt(textB3_1.getText())) {
				australiad.setText(Integer.toString(Integer.parseInt(australiad.getText()) + 1));
				holandap.setText(Integer.toString(Integer.parseInt(holandap.getText()) + 3));
				holandav.setText(Integer.toString(Integer.parseInt(holandav.getText()) + 1));
			} else {
				australiae.setText(Integer.toString(Integer.parseInt(australiae.getText()) + 1));
				holandae.setText(Integer.toString(Integer.parseInt(holandae.getText()) + 1));
				holandap.setText(Integer.toString(Integer.parseInt(holandap.getText()) + 1));
				australiap.setText(Integer.toString(Integer.parseInt(australiap.getText()) + 1));
			}

		}

		// espanha x chile
		if (!(textB4_1.getText().isEmpty() && textB4_2.getText().isEmpty())) {
			espanhaj.setText(Integer.toString(Integer.parseInt(espanhaj.getText()) + 1));
			chilej.setText(Integer.toString(Integer.parseInt(chilej.getText()) + 1));

			espanhagp.setText(
					Integer.toString(Integer.parseInt(espanhagp.getText()) + (Integer.parseInt(textB4_1.getText()))));
			chilegp.setText(
					Integer.toString(Integer.parseInt(chilegp.getText()) + (Integer.parseInt(textB4_2.getText()))));

			espanhagc.setText(
					Integer.toString(Integer.parseInt(espanhagc.getText()) + (Integer.parseInt(textB4_2.getText()))));
			chilegc.setText(
					Integer.toString(Integer.parseInt(chilegc.getText()) + (Integer.parseInt(textB4_1.getText()))));

			espanhasg.setText(
					Integer.toString(Integer.parseInt(espanhagp.getText()) - (Integer.parseInt(espanhagc.getText()))));
			chilesg.setText(
					Integer.toString(Integer.parseInt(chilegp.getText()) - (Integer.parseInt(chilegc.getText()))));

			if (Integer.parseInt(textB4_1.getText()) > Integer.parseInt(textB4_2.getText())) {
				espanhav.setText(Integer.toString(Integer.parseInt(espanhav.getText()) + 1));
				chiled.setText(Integer.toString(Integer.parseInt(chiled.getText()) + 1));
				chilep.setText(Integer.toString(Integer.parseInt(chilep.getText()) + 3));
			} else if (Integer.parseInt(textB4_2.getText()) > Integer.parseInt(textB4_1.getText())) {
				espanhad.setText(Integer.toString(Integer.parseInt(espanhad.getText()) + 1));
				chilep.setText(Integer.toString(Integer.parseInt(chilep.getText()) + 3));
				chilev.setText(Integer.toString(Integer.parseInt(chilev.getText()) + 1));
			} else {
				espanhae.setText(Integer.toString(Integer.parseInt(espanhae.getText()) + 1));
				chilee.setText(Integer.toString(Integer.parseInt(chilee.getText()) + 1));
				chilep.setText(Integer.toString(Integer.parseInt(chilep.getText()) + 1));
				espanhap.setText(Integer.toString(Integer.parseInt(espanhap.getText()) + 1));
			}

		}

		// australia x espanha
		if (!(textB5_1.getText().isEmpty() && textB5_2.getText().isEmpty())) {
			australiaj.setText(Integer.toString(Integer.parseInt(australiaj.getText()) + 1));
			espanhaj.setText(Integer.toString(Integer.parseInt(espanhaj.getText()) + 1));

			australiagp.setText(
					Integer.toString(Integer.parseInt(australiagp.getText()) + (Integer.parseInt(textB5_1.getText()))));
			espanhagp.setText(
					Integer.toString(Integer.parseInt(espanhagp.getText()) + (Integer.parseInt(textB5_2.getText()))));

			australiagc.setText(
					Integer.toString(Integer.parseInt(australiagc.getText()) + (Integer.parseInt(textB5_2.getText()))));
			espanhagc.setText(
					Integer.toString(Integer.parseInt(espanhagc.getText()) + (Integer.parseInt(textB5_1.getText()))));

			australiasg.setText(Integer
					.toString(Integer.parseInt(australiagp.getText()) - (Integer.parseInt(australiagc.getText()))));
			espanhasg.setText(
					Integer.toString(Integer.parseInt(espanhagp.getText()) - (Integer.parseInt(espanhagc.getText()))));

			if (Integer.parseInt(textB5_1.getText()) > Integer.parseInt(textB5_2.getText())) {
				australiav.setText(Integer.toString(Integer.parseInt(australiav.getText()) + 1));
				espanhad.setText(Integer.toString(Integer.parseInt(espanhad.getText()) + 1));
				australiap.setText(Integer.toString(Integer.parseInt(australiap.getText()) + 3));
			} else if (Integer.parseInt(textB5_2.getText()) > Integer.parseInt(textB5_1.getText())) {
				australiad.setText(Integer.toString(Integer.parseInt(australiad.getText()) + 1));
				espanhap.setText(Integer.toString(Integer.parseInt(espanhap.getText()) + 3));
				espanhav.setText(Integer.toString(Integer.parseInt(espanhav.getText()) + 1));
			} else {
				australiae.setText(Integer.toString(Integer.parseInt(australiae.getText()) + 1));
				espanhae.setText(Integer.toString(Integer.parseInt(espanhae.getText()) + 1));
				espanhap.setText(Integer.toString(Integer.parseInt(espanhap.getText()) + 1));
				australiap.setText(Integer.toString(Integer.parseInt(australiap.getText()) + 1));
			}

		}

		// holanda x chile
		if (!(textB6_1.getText().isEmpty() && textB6_2.getText().isEmpty())) {
			holandaj.setText(Integer.toString(Integer.parseInt(holandaj.getText()) + 1));
			chilej.setText(Integer.toString(Integer.parseInt(chilej.getText()) + 1));

			holandagp.setText(
					Integer.toString(Integer.parseInt(holandagp.getText()) + (Integer.parseInt(textB6_1.getText()))));
			chilegp.setText(
					Integer.toString(Integer.parseInt(chilegp.getText()) + (Integer.parseInt(textB6_2.getText()))));

			holandagc.setText(
					Integer.toString(Integer.parseInt(holandagc.getText()) + (Integer.parseInt(textB6_2.getText()))));
			chilegc.setText(
					Integer.toString(Integer.parseInt(chilegc.getText()) + (Integer.parseInt(textB6_1.getText()))));

			holandasg.setText(
					Integer.toString(Integer.parseInt(holandagp.getText()) - (Integer.parseInt(holandagc.getText()))));
			chilesg.setText(
					Integer.toString(Integer.parseInt(chilegp.getText()) - (Integer.parseInt(chilegc.getText()))));

			if (Integer.parseInt(textB6_1.getText()) > Integer.parseInt(textB6_2.getText())) {
				holandav.setText(Integer.toString(Integer.parseInt(holandav.getText()) + 1));
				chiled.setText(Integer.toString(Integer.parseInt(chiled.getText()) + 1));
				holandap.setText(Integer.toString(Integer.parseInt(holandap.getText()) + 3));
			} else if (Integer.parseInt(textB6_2.getText()) > Integer.parseInt(textB6_1.getText())) {
				holandad.setText(Integer.toString(Integer.parseInt(holandad.getText()) + 1));
				chilep.setText(Integer.toString(Integer.parseInt(chilep.getText()) + 3));
				chilev.setText(Integer.toString(Integer.parseInt(chilev.getText()) + 1));
			} else {
				holandae.setText(Integer.toString(Integer.parseInt(holandae.getText()) + 1));
				chilee.setText(Integer.toString(Integer.parseInt(chilee.getText()) + 1));
				chilep.setText(Integer.toString(Integer.parseInt(chilep.getText()) + 1));
				holandap.setText(Integer.toString(Integer.parseInt(holandap.getText()) + 1));
			}

		}

		/*
		 * GRUPO C
		 */
		// colombia x grecia
		if (!(textC1_1.getText().isEmpty() && textC1_2.getText().isEmpty())) {
			colombiaj.setText(Integer.toString(Integer.parseInt(colombiaj.getText()) + 1));
			greciaj.setText(Integer.toString(Integer.parseInt(greciaj.getText()) + 1));

			colombiagp.setText(
					Integer.toString(Integer.parseInt(colombiagp.getText()) + (Integer.parseInt(textC1_1.getText()))));
			greciagp.setText(
					Integer.toString(Integer.parseInt(greciagp.getText()) + (Integer.parseInt(textC1_2.getText()))));

			colombiagc.setText(
					Integer.toString(Integer.parseInt(colombiagc.getText()) + (Integer.parseInt(textC1_2.getText()))));
			greciagc.setText(
					Integer.toString(Integer.parseInt(greciagc.getText()) + (Integer.parseInt(textC1_1.getText()))));

			colombiasg.setText(Integer
					.toString(Integer.parseInt(colombiagp.getText()) - (Integer.parseInt(colombiagc.getText()))));
			greciasg.setText(
					Integer.toString(Integer.parseInt(greciagp.getText()) - (Integer.parseInt(greciagc.getText()))));

			if (Integer.parseInt(textC1_1.getText()) > Integer.parseInt(textC1_2.getText())) {
				colombiav.setText(Integer.toString(Integer.parseInt(colombiav.getText()) + 1));
				greciad.setText(Integer.toString(Integer.parseInt(greciad.getText()) + 1));
				greciap.setText(Integer.toString(Integer.parseInt(colombiap.getText()) + 3));
			} else if (Integer.parseInt(textC1_2.getText()) > Integer.parseInt(textC1_1.getText())) {
				colombiad.setText(Integer.toString(Integer.parseInt(colombiad.getText()) + 1));
				greciap.setText(Integer.toString(Integer.parseInt(greciap.getText()) + 3));
				greciav.setText(Integer.toString(Integer.parseInt(greciav.getText()) + 1));
			} else {
				colombiae.setText(Integer.toString(Integer.parseInt(colombiae.getText()) + 1));
				greciae.setText(Integer.toString(Integer.parseInt(greciae.getText()) + 1));
				greciap.setText(Integer.toString(Integer.parseInt(greciap.getText()) + 1));
				colombiap.setText(Integer.toString(Integer.parseInt(colombiap.getText()) + 1));
			}

		}
		// cmarfim x japao
		if (!(textC2_1.getText().isEmpty() && textC2_2.getText().isEmpty())) {
			cmarfimj.setText(Integer.toString(Integer.parseInt(cmarfimj.getText()) + 1));
			japaoj.setText(Integer.toString(Integer.parseInt(japaoj.getText()) + 1));

			cmarfimgp.setText(
					Integer.toString(Integer.parseInt(cmarfimgp.getText()) + (Integer.parseInt(textC2_1.getText()))));
			japaogp.setText(
					Integer.toString(Integer.parseInt(japaogp.getText()) + (Integer.parseInt(textC2_2.getText()))));

			cmarfimgc.setText(
					Integer.toString(Integer.parseInt(cmarfimgc.getText()) + (Integer.parseInt(textC2_2.getText()))));
			japaogc.setText(
					Integer.toString(Integer.parseInt(japaogc.getText()) + (Integer.parseInt(textC2_1.getText()))));

			cmarfimsg.setText(
					Integer.toString(Integer.parseInt(cmarfimgp.getText()) - (Integer.parseInt(cmarfimgc.getText()))));
			japaosg.setText(
					Integer.toString(Integer.parseInt(japaogp.getText()) - (Integer.parseInt(japaogc.getText()))));

			if (Integer.parseInt(textC2_1.getText()) > Integer.parseInt(textC2_2.getText())) {
				cmarfimv.setText(Integer.toString(Integer.parseInt(cmarfimv.getText()) + 1));
				japaod.setText(Integer.toString(Integer.parseInt(japaod.getText()) + 1));
				cmarfimp.setText(Integer.toString(Integer.parseInt(cmarfimp.getText()) + 3));
			} else if (Integer.parseInt(textC2_2.getText()) > Integer.parseInt(textC2_1.getText())) {
				cmarfimd.setText(Integer.toString(Integer.parseInt(cmarfimd.getText()) + 1));
				japaop.setText(Integer.toString(Integer.parseInt(japaop.getText()) + 3));
				croaciav.setText(Integer.toString(Integer.parseInt(croaciav.getText()) + 1));
			} else {
				cmarfime.setText(Integer.toString(Integer.parseInt(cmarfime.getText()) + 1));
				japaoe.setText(Integer.toString(Integer.parseInt(japaoe.getText()) + 1));
				japaop.setText(Integer.toString(Integer.parseInt(japaop.getText()) + 1));
				cmarfimp.setText(Integer.toString(Integer.parseInt(cmarfimp.getText()) + 1));
			}

		}

		// colombia x cmarfim
		if (!(textC3_1.getText().isEmpty() && textC3_2.getText().isEmpty())) {
			colombiaj.setText(Integer.toString(Integer.parseInt(colombiaj.getText()) + 1));
			croaciaj.setText(Integer.toString(Integer.parseInt(croaciaj.getText()) + 1));

			colombiagp.setText(
					Integer.toString(Integer.parseInt(colombiagp.getText()) + (Integer.parseInt(textC3_1.getText()))));
			cmarfimgp.setText(
					Integer.toString(Integer.parseInt(cmarfimgp.getText()) + (Integer.parseInt(textC3_2.getText()))));

			colombiagc.setText(
					Integer.toString(Integer.parseInt(colombiagc.getText()) + (Integer.parseInt(textC3_2.getText()))));
			cmarfimgc.setText(
					Integer.toString(Integer.parseInt(cmarfimgc.getText()) + (Integer.parseInt(textC3_1.getText()))));

			colombiasg.setText(Integer
					.toString(Integer.parseInt(colombiagp.getText()) - (Integer.parseInt(colombiagc.getText()))));
			cmarfimsg.setText(
					Integer.toString(Integer.parseInt(cmarfimgp.getText()) - (Integer.parseInt(cmarfimgc.getText()))));

			if (Integer.parseInt(textC3_1.getText()) > Integer.parseInt(textC3_2.getText())) {
				colombiav.setText(Integer.toString(Integer.parseInt(colombiav.getText()) + 1));
				cmarfimd.setText(Integer.toString(Integer.parseInt(cmarfimd.getText()) + 1));
				colombiap.setText(Integer.toString(Integer.parseInt(colombiap.getText()) + 3));
			} else if (Integer.parseInt(textC3_2.getText()) > Integer.parseInt(textC3_1.getText())) {
				colombiad.setText(Integer.toString(Integer.parseInt(colombiad.getText()) + 1));
				cmarfimp.setText(Integer.toString(Integer.parseInt(cmarfimp.getText()) + 3));
				cmarfimv.setText(Integer.toString(Integer.parseInt(cmarfimv.getText()) + 1));
			} else {
				colombiae.setText(Integer.toString(Integer.parseInt(colombiae.getText()) + 1));
				cmarfime.setText(Integer.toString(Integer.parseInt(cmarfime.getText()) + 1));
				cmarfimp.setText(Integer.toString(Integer.parseInt(cmarfimp.getText()) + 1));
				colombiap.setText(Integer.toString(Integer.parseInt(colombiap.getText()) + 1));
			}

		}

		// japao x grecia
		if (!(textC4_1.getText().isEmpty() && textC4_2.getText().isEmpty())) {
			japaoj.setText(Integer.toString(Integer.parseInt(japaoj.getText()) + 1));
			greciaj.setText(Integer.toString(Integer.parseInt(greciaj.getText()) + 1));

			japaogp.setText(
					Integer.toString(Integer.parseInt(japaogp.getText()) + (Integer.parseInt(textC4_1.getText()))));
			greciagp.setText(
					Integer.toString(Integer.parseInt(greciagp.getText()) + (Integer.parseInt(textC4_2.getText()))));

			japaogc.setText(
					Integer.toString(Integer.parseInt(japaogc.getText()) + (Integer.parseInt(textC4_2.getText()))));
			greciagc.setText(
					Integer.toString(Integer.parseInt(greciagc.getText()) + (Integer.parseInt(textC4_1.getText()))));

			japaosg.setText(
					Integer.toString(Integer.parseInt(japaogp.getText()) - (Integer.parseInt(japaogc.getText()))));
			greciasg.setText(
					Integer.toString(Integer.parseInt(greciagp.getText()) - (Integer.parseInt(greciagc.getText()))));

			if (Integer.parseInt(textC4_1.getText()) > Integer.parseInt(textC4_2.getText())) {
				japaov.setText(Integer.toString(Integer.parseInt(japaov.getText()) + 1));
				greciad.setText(Integer.toString(Integer.parseInt(greciad.getText()) + 1));
				japaop.setText(Integer.toString(Integer.parseInt(japaop.getText()) + 3));
			} else if (Integer.parseInt(textC4_2.getText()) > Integer.parseInt(textC4_1.getText())) {
				japaod.setText(Integer.toString(Integer.parseInt(japaod.getText()) + 1));
				greciap.setText(Integer.toString(Integer.parseInt(greciap.getText()) + 3));
				greciav.setText(Integer.toString(Integer.parseInt(greciav.getText()) + 1));
			} else {
				japaoe.setText(Integer.toString(Integer.parseInt(japaoe.getText()) + 1));
				greciae.setText(Integer.toString(Integer.parseInt(greciae.getText()) + 1));
				greciap.setText(Integer.toString(Integer.parseInt(greciap.getText()) + 1));
				japaop.setText(Integer.toString(Integer.parseInt(japaop.getText()) + 1));
			}

		}

		// japao x colombia
		if (!(textC5_1.getText().isEmpty() && textC5_2.getText().isEmpty())) {
			japaoj.setText(Integer.toString(Integer.parseInt(japaoj.getText()) + 1));
			colombiaj.setText(Integer.toString(Integer.parseInt(colombiaj.getText()) + 1));

			japaogp.setText(
					Integer.toString(Integer.parseInt(japaogp.getText()) + (Integer.parseInt(textC5_1.getText()))));
			colombiagp.setText(
					Integer.toString(Integer.parseInt(colombiagp.getText()) + (Integer.parseInt(textC5_2.getText()))));

			japaogc.setText(
					Integer.toString(Integer.parseInt(japaogc.getText()) + (Integer.parseInt(textC5_2.getText()))));
			colombiagc.setText(
					Integer.toString(Integer.parseInt(colombiagc.getText()) + (Integer.parseInt(textC5_1.getText()))));

			japaosg.setText(
					Integer.toString(Integer.parseInt(japaogp.getText()) - (Integer.parseInt(japaogc.getText()))));
			colombiasg.setText(Integer
					.toString(Integer.parseInt(colombiagp.getText()) - (Integer.parseInt(colombiagc.getText()))));

			if (Integer.parseInt(textC5_1.getText()) > Integer.parseInt(textC5_2.getText())) {
				japaov.setText(Integer.toString(Integer.parseInt(japaov.getText()) + 1));
				colombiad.setText(Integer.toString(Integer.parseInt(colombiad.getText()) + 1));
				japaop.setText(Integer.toString(Integer.parseInt(japaop.getText()) + 3));
			} else if (Integer.parseInt(textC5_2.getText()) > Integer.parseInt(textC5_1.getText())) {
				japaod.setText(Integer.toString(Integer.parseInt(japaod.getText()) + 1));
				colombiap.setText(Integer.toString(Integer.parseInt(colombiap.getText()) + 3));
				colombiav.setText(Integer.toString(Integer.parseInt(colombiav.getText()) + 1));
			} else {
				japaoe.setText(Integer.toString(Integer.parseInt(japaoe.getText()) + 1));
				colombiae.setText(Integer.toString(Integer.parseInt(colombiae.getText()) + 1));
				colombiap.setText(Integer.toString(Integer.parseInt(colombiap.getText()) + 1));
				japaop.setText(Integer.toString(Integer.parseInt(japaop.getText()) + 1));
			}

		}

		// grecia x cmarfim
		if (!(textC6_1.getText().isEmpty() && textC6_2.getText().isEmpty())) {
			greciaj.setText(Integer.toString(Integer.parseInt(greciaj.getText()) + 1));
			cmarfimj.setText(Integer.toString(Integer.parseInt(cmarfimj.getText()) + 1));

			greciagp.setText(
					Integer.toString(Integer.parseInt(greciagp.getText()) + (Integer.parseInt(textC6_1.getText()))));
			cmarfimgp.setText(
					Integer.toString(Integer.parseInt(cmarfimgp.getText()) + (Integer.parseInt(textC1_2.getText()))));

			greciagc.setText(
					Integer.toString(Integer.parseInt(greciagc.getText()) + (Integer.parseInt(textC6_2.getText()))));
			cmarfimgc.setText(
					Integer.toString(Integer.parseInt(cmarfimgc.getText()) + (Integer.parseInt(textC6_1.getText()))));

			greciasg.setText(
					Integer.toString(Integer.parseInt(greciagp.getText()) - (Integer.parseInt(greciagc.getText()))));
			cmarfimsg.setText(
					Integer.toString(Integer.parseInt(cmarfimgp.getText()) - (Integer.parseInt(cmarfimgc.getText()))));

			if (Integer.parseInt(textC6_1.getText()) > Integer.parseInt(textC6_2.getText())) {
				greciav.setText(Integer.toString(Integer.parseInt(greciav.getText()) + 1));
				cmarfimd.setText(Integer.toString(Integer.parseInt(cmarfimd.getText()) + 1));
				greciap.setText(Integer.toString(Integer.parseInt(greciap.getText()) + 3));
			} else if (Integer.parseInt(textC6_2.getText()) > Integer.parseInt(textC6_1.getText())) {
				greciad.setText(Integer.toString(Integer.parseInt(greciad.getText()) + 1));
				cmarfimp.setText(Integer.toString(Integer.parseInt(cmarfimp.getText()) + 3));
				cmarfimv.setText(Integer.toString(Integer.parseInt(cmarfimv.getText()) + 1));
			} else {
				greciae.setText(Integer.toString(Integer.parseInt(greciae.getText()) + 1));
				cmarfime.setText(Integer.toString(Integer.parseInt(cmarfime.getText()) + 1));
				cmarfimp.setText(Integer.toString(Integer.parseInt(cmarfimp.getText()) + 1));
				greciap.setText(Integer.toString(Integer.parseInt(greciap.getText()) + 1));
			}

		}

		/*
		 * GRUPO D
		 */
		// uruguai x costarica
		if (!(textD1_1.getText().isEmpty() && textD1_2.getText().isEmpty())) {
			uruguaij.setText(Integer.toString(Integer.parseInt(uruguaij.getText()) + 1));
			costaricaj.setText(Integer.toString(Integer.parseInt(costaricaj.getText()) + 1));

			uruguaigp.setText(
					Integer.toString(Integer.parseInt(uruguaigp.getText()) + (Integer.parseInt(textD1_1.getText()))));
			costaricagp.setText(
					Integer.toString(Integer.parseInt(costaricagp.getText()) + (Integer.parseInt(textD1_2.getText()))));

			uruguaigc.setText(
					Integer.toString(Integer.parseInt(uruguaigc.getText()) + (Integer.parseInt(textD1_2.getText()))));
			costaricagc.setText(
					Integer.toString(Integer.parseInt(costaricagc.getText()) + (Integer.parseInt(textD1_1.getText()))));

			uruguaisg.setText(
					Integer.toString(Integer.parseInt(uruguaigp.getText()) - (Integer.parseInt(uruguaigc.getText()))));
			costaricasg.setText(Integer
					.toString(Integer.parseInt(costaricagp.getText()) - (Integer.parseInt(costaricagc.getText()))));

			if (Integer.parseInt(textD1_1.getText()) > Integer.parseInt(textD1_2.getText())) {
				uruguaiv.setText(Integer.toString(Integer.parseInt(uruguaiv.getText()) + 1));
				costaricad.setText(Integer.toString(Integer.parseInt(costaricad.getText()) + 1));
				uruguaip.setText(Integer.toString(Integer.parseInt(uruguaip.getText()) + 3));
			} else if (Integer.parseInt(textD1_2.getText()) > Integer.parseInt(textD1_1.getText())) {
				uruguaid.setText(Integer.toString(Integer.parseInt(uruguaid.getText()) + 1));
				costaricap.setText(Integer.toString(Integer.parseInt(costaricap.getText()) + 3));
				costaricav.setText(Integer.toString(Integer.parseInt(costaricav.getText()) + 1));
			} else {
				uruguaie.setText(Integer.toString(Integer.parseInt(uruguaie.getText()) + 1));
				costaricae.setText(Integer.toString(Integer.parseInt(costaricae.getText()) + 1));
				costaricap.setText(Integer.toString(Integer.parseInt(costaricap.getText()) + 1));
				uruguaip.setText(Integer.toString(Integer.parseInt(uruguaip.getText()) + 1));
			}

		}

		// inglaterra x italia
		if (!(textD2_1.getText().isEmpty() && textD2_2.getText().isEmpty())) {
			inglaterraj.setText(Integer.toString(Integer.parseInt(inglaterraj.getText()) + 1));
			italiaj.setText(Integer.toString(Integer.parseInt(italiaj.getText()) + 1));

			inglaterragp.setText(Integer
					.toString(Integer.parseInt(inglaterragp.getText()) + (Integer.parseInt(textD2_1.getText()))));
			italiagp.setText(
					Integer.toString(Integer.parseInt(italiagp.getText()) + (Integer.parseInt(textD2_2.getText()))));

			inglaterragc.setText(Integer
					.toString(Integer.parseInt(inglaterragc.getText()) + (Integer.parseInt(textD2_2.getText()))));
			italiagc.setText(
					Integer.toString(Integer.parseInt(italiagc.getText()) + (Integer.parseInt(textD2_1.getText()))));

			inglaterrasg.setText(Integer
					.toString(Integer.parseInt(inglaterragp.getText()) - (Integer.parseInt(inglaterragc.getText()))));
			italiasg.setText(
					Integer.toString(Integer.parseInt(italiagp.getText()) - (Integer.parseInt(italiagc.getText()))));

			if (Integer.parseInt(textD2_1.getText()) > Integer.parseInt(textD2_2.getText())) {
				inglaterrav.setText(Integer.toString(Integer.parseInt(inglaterrav.getText()) + 1));
				italiad.setText(Integer.toString(Integer.parseInt(italiad.getText()) + 1));
				inglaterrap.setText(Integer.toString(Integer.parseInt(inglaterrap.getText()) + 3));
			} else if (Integer.parseInt(textD2_2.getText()) > Integer.parseInt(textD2_1.getText())) {
				inglaterrad.setText(Integer.toString(Integer.parseInt(inglaterrad.getText()) + 1));
				italiap.setText(Integer.toString(Integer.parseInt(italiap.getText()) + 3));
				italiav.setText(Integer.toString(Integer.parseInt(italiav.getText()) + 1));
			} else {
				inglaterrae.setText(Integer.toString(Integer.parseInt(inglaterrae.getText()) + 1));
				italiae.setText(Integer.toString(Integer.parseInt(italiae.getText()) + 1));
				italiap.setText(Integer.toString(Integer.parseInt(italiap.getText()) + 1));
				inglaterrap.setText(Integer.toString(Integer.parseInt(inglaterrap.getText()) + 1));
			}

		}

		// uruguai x inglaterra
		if (!(textD3_1.getText().isEmpty() && textD3_2.getText().isEmpty())) {
			uruguaij.setText(Integer.toString(Integer.parseInt(uruguaij.getText()) + 1));
			inglaterraj.setText(Integer.toString(Integer.parseInt(inglaterraj.getText()) + 1));

			uruguaigp.setText(
					Integer.toString(Integer.parseInt(uruguaigp.getText()) + (Integer.parseInt(textD3_1.getText()))));
			inglaterragp.setText(Integer
					.toString(Integer.parseInt(inglaterragp.getText()) + (Integer.parseInt(textD3_2.getText()))));

			uruguaigc.setText(
					Integer.toString(Integer.parseInt(uruguaigc.getText()) + (Integer.parseInt(textD3_2.getText()))));
			inglaterragc.setText(Integer
					.toString(Integer.parseInt(inglaterragc.getText()) + (Integer.parseInt(textD3_1.getText()))));

			uruguaisg.setText(
					Integer.toString(Integer.parseInt(uruguaigp.getText()) - (Integer.parseInt(uruguaigc.getText()))));
			inglaterrasg.setText(Integer
					.toString(Integer.parseInt(inglaterragp.getText()) - (Integer.parseInt(inglaterragc.getText()))));

			if (Integer.parseInt(textD3_1.getText()) > Integer.parseInt(textD3_2.getText())) {
				uruguaiv.setText(Integer.toString(Integer.parseInt(uruguaiv.getText()) + 1));
				inglaterrad.setText(Integer.toString(Integer.parseInt(inglaterrad.getText()) + 1));
				uruguaip.setText(Integer.toString(Integer.parseInt(uruguaip.getText()) + 3));
			} else if (Integer.parseInt(textD3_2.getText()) > Integer.parseInt(textD3_1.getText())) {
				uruguaid.setText(Integer.toString(Integer.parseInt(uruguaid.getText()) + 1));
				inglaterrap.setText(Integer.toString(Integer.parseInt(inglaterrap.getText()) + 3));
				inglaterrav.setText(Integer.toString(Integer.parseInt(inglaterrav.getText()) + 1));
			} else {
				uruguaie.setText(Integer.toString(Integer.parseInt(uruguaie.getText()) + 1));
				inglaterrae.setText(Integer.toString(Integer.parseInt(inglaterrae.getText()) + 1));
				inglaterrap.setText(Integer.toString(Integer.parseInt(inglaterrap.getText()) + 1));
				uruguaip.setText(Integer.toString(Integer.parseInt(uruguaip.getText()) + 1));
			}

		}

		// italia x crica
		if (!(textD4_1.getText().isEmpty() && textD4_2.getText().isEmpty())) {
			italiaj.setText(Integer.toString(Integer.parseInt(italiaj.getText()) + 1));
			costaricaj.setText(Integer.toString(Integer.parseInt(costaricaj.getText()) + 1));

			italiagp.setText(
					Integer.toString(Integer.parseInt(italiagp.getText()) + (Integer.parseInt(textD4_1.getText()))));
			costaricagp.setText(
					Integer.toString(Integer.parseInt(costaricagp.getText()) + (Integer.parseInt(textD4_2.getText()))));

			italiagc.setText(
					Integer.toString(Integer.parseInt(italiagc.getText()) + (Integer.parseInt(textD4_2.getText()))));
			costaricagc.setText(
					Integer.toString(Integer.parseInt(costaricagc.getText()) + (Integer.parseInt(textD4_1.getText()))));

			italiasg.setText(
					Integer.toString(Integer.parseInt(italiagp.getText()) - (Integer.parseInt(italiagc.getText()))));
			costaricasg.setText(Integer
					.toString(Integer.parseInt(costaricagp.getText()) - (Integer.parseInt(costaricagc.getText()))));

			if (Integer.parseInt(textD4_1.getText()) > Integer.parseInt(textD4_2.getText())) {
				italiav.setText(Integer.toString(Integer.parseInt(italiav.getText()) + 1));
				costaricad.setText(Integer.toString(Integer.parseInt(costaricad.getText()) + 1));
				italiap.setText(Integer.toString(Integer.parseInt(italiap.getText()) + 3));
			} else if (Integer.parseInt(textD4_2.getText()) > Integer.parseInt(textD4_1.getText())) {
				italiad.setText(Integer.toString(Integer.parseInt(italiad.getText()) + 1));
				costaricap.setText(Integer.toString(Integer.parseInt(costaricap.getText()) + 3));
				costaricav.setText(Integer.toString(Integer.parseInt(costaricav.getText()) + 1));
			} else {
				italiae.setText(Integer.toString(Integer.parseInt(italiae.getText()) + 1));
				costaricae.setText(Integer.toString(Integer.parseInt(costaricae.getText()) + 1));
				costaricap.setText(Integer.toString(Integer.parseInt(costaricap.getText()) + 1));
				italiap.setText(Integer.toString(Integer.parseInt(italiap.getText()) + 1));
			}

		}

		// italia x uruguai
		if (!(textD5_1.getText().isEmpty() && textD5_2.getText().isEmpty())) {
			italiaj.setText(Integer.toString(Integer.parseInt(italiaj.getText()) + 1));
			uruguaij.setText(Integer.toString(Integer.parseInt(uruguaij.getText()) + 1));

			italiagp.setText(
					Integer.toString(Integer.parseInt(italiagp.getText()) + (Integer.parseInt(textD5_1.getText()))));
			uruguaigp.setText(
					Integer.toString(Integer.parseInt(uruguaigp.getText()) + (Integer.parseInt(textD5_2.getText()))));

			italiagc.setText(
					Integer.toString(Integer.parseInt(italiagc.getText()) + (Integer.parseInt(textD5_2.getText()))));
			uruguaigc.setText(
					Integer.toString(Integer.parseInt(uruguaigc.getText()) + (Integer.parseInt(textD5_1.getText()))));

			italiasg.setText(
					Integer.toString(Integer.parseInt(italiagp.getText()) - (Integer.parseInt(italiagc.getText()))));
			uruguaisg.setText(
					Integer.toString(Integer.parseInt(uruguaigp.getText()) - (Integer.parseInt(uruguaigc.getText()))));

			if (Integer.parseInt(textD5_1.getText()) > Integer.parseInt(textD5_2.getText())) {
				italiav.setText(Integer.toString(Integer.parseInt(italiav.getText()) + 1));
				uruguaid.setText(Integer.toString(Integer.parseInt(uruguaid.getText()) + 1));
				italiap.setText(Integer.toString(Integer.parseInt(italiap.getText()) + 3));
			} else if (Integer.parseInt(textD5_2.getText()) > Integer.parseInt(textD5_1.getText())) {
				italiad.setText(Integer.toString(Integer.parseInt(italiad.getText()) + 1));
				uruguaip.setText(Integer.toString(Integer.parseInt(uruguaip.getText()) + 3));
				uruguaiv.setText(Integer.toString(Integer.parseInt(uruguaiv.getText()) + 1));
			} else {
				italiae.setText(Integer.toString(Integer.parseInt(italiae.getText()) + 1));
				uruguaie.setText(Integer.toString(Integer.parseInt(uruguaie.getText()) + 1));
				uruguaip.setText(Integer.toString(Integer.parseInt(uruguaip.getText()) + 1));
				italiap.setText(Integer.toString(Integer.parseInt(italiap.getText()) + 1));
			}

		}

		// costarica x inglaterra
		if (!(textD6_1.getText().isEmpty() && textD6_2.getText().isEmpty())) {
			costaricaj.setText(Integer.toString(Integer.parseInt(costaricaj.getText()) + 1));
			inglaterraj.setText(Integer.toString(Integer.parseInt(inglaterraj.getText()) + 1));

			costaricagp.setText(
					Integer.toString(Integer.parseInt(costaricagp.getText()) + (Integer.parseInt(textD6_1.getText()))));
			inglaterragp.setText(Integer
					.toString(Integer.parseInt(inglaterragp.getText()) + (Integer.parseInt(textD6_2.getText()))));

			costaricagc.setText(
					Integer.toString(Integer.parseInt(costaricagc.getText()) + (Integer.parseInt(textD6_2.getText()))));
			inglaterragc.setText(Integer
					.toString(Integer.parseInt(inglaterragc.getText()) + (Integer.parseInt(textD6_1.getText()))));

			costaricasg.setText(Integer
					.toString(Integer.parseInt(costaricagp.getText()) - (Integer.parseInt(costaricagc.getText()))));
			inglaterrasg.setText(Integer
					.toString(Integer.parseInt(inglaterragp.getText()) - (Integer.parseInt(inglaterragc.getText()))));

			if (Integer.parseInt(textD6_1.getText()) > Integer.parseInt(textD6_2.getText())) {
				costaricav.setText(Integer.toString(Integer.parseInt(costaricav.getText()) + 1));
				inglaterrad.setText(Integer.toString(Integer.parseInt(inglaterrad.getText()) + 1));
				costaricap.setText(Integer.toString(Integer.parseInt(costaricap.getText()) + 3));
			} else if (Integer.parseInt(textD6_2.getText()) > Integer.parseInt(textD6_1.getText())) {
				costaricad.setText(Integer.toString(Integer.parseInt(costaricad.getText()) + 1));
				inglaterrap.setText(Integer.toString(Integer.parseInt(inglaterrap.getText()) + 3));
				inglaterrav.setText(Integer.toString(Integer.parseInt(inglaterrav.getText()) + 1));
			} else {
				costaricae.setText(Integer.toString(Integer.parseInt(costaricae.getText()) + 1));
				inglaterrae.setText(Integer.toString(Integer.parseInt(inglaterrae.getText()) + 1));
				inglaterrap.setText(Integer.toString(Integer.parseInt(inglaterrap.getText()) + 1));
				costaricap.setText(Integer.toString(Integer.parseInt(costaricap.getText()) + 1));
			}

		}

		/*
		 * GRUPO E
		 */

		// suica x equador
		if (!(textE1_1.getText().isEmpty() && textE1_2.getText().isEmpty())) {
			suicaj.setText(Integer.toString(Integer.parseInt(suicaj.getText()) + 1));
			equadorj.setText(Integer.toString(Integer.parseInt(equadorj.getText()) + 1));

			suicagp.setText(
					Integer.toString(Integer.parseInt(suicagp.getText()) + (Integer.parseInt(textE1_1.getText()))));
			equadorgp.setText(
					Integer.toString(Integer.parseInt(equadorgp.getText()) + (Integer.parseInt(textE1_2.getText()))));

			suicagc.setText(
					Integer.toString(Integer.parseInt(suicagc.getText()) + (Integer.parseInt(textE1_2.getText()))));
			equadorgc.setText(
					Integer.toString(Integer.parseInt(equadorgc.getText()) + (Integer.parseInt(textE1_1.getText()))));

			suicasg.setText(
					Integer.toString(Integer.parseInt(suicagp.getText()) - (Integer.parseInt(suicagc.getText()))));
			equadorsg.setText(
					Integer.toString(Integer.parseInt(equadorgp.getText()) - (Integer.parseInt(equadorgc.getText()))));

			if (Integer.parseInt(textE1_1.getText()) > Integer.parseInt(textE1_2.getText())) {
				suicav.setText(Integer.toString(Integer.parseInt(suicav.getText()) + 1));
				equadord.setText(Integer.toString(Integer.parseInt(equadord.getText()) + 1));
				suicap.setText(Integer.toString(Integer.parseInt(suicap.getText()) + 3));
			} else if (Integer.parseInt(textE1_2.getText()) > Integer.parseInt(textE1_1.getText())) {
				suicad.setText(Integer.toString(Integer.parseInt(suicad.getText()) + 1));
				equadorp.setText(Integer.toString(Integer.parseInt(equadorp.getText()) + 3));
				equadorv.setText(Integer.toString(Integer.parseInt(equadorv.getText()) + 1));
			} else {
				suicae.setText(Integer.toString(Integer.parseInt(suicae.getText()) + 1));
				equadore.setText(Integer.toString(Integer.parseInt(equadore.getText()) + 1));
				equadorp.setText(Integer.toString(Integer.parseInt(equadorp.getText()) + 1));
				suicap.setText(Integer.toString(Integer.parseInt(suicap.getText()) + 1));
			}

		}

		// franca x honduras
		if (!(textE2_1.getText().isEmpty() && textE2_2.getText().isEmpty())) {
			francaj.setText(Integer.toString(Integer.parseInt(francaj.getText()) + 1));
			hondurasj.setText(Integer.toString(Integer.parseInt(hondurasj.getText()) + 1));

			francagp.setText(
					Integer.toString(Integer.parseInt(francagp.getText()) + (Integer.parseInt(textE2_1.getText()))));
			hondurasgp.setText(
					Integer.toString(Integer.parseInt(hondurasgp.getText()) + (Integer.parseInt(textE2_2.getText()))));

			francagc.setText(
					Integer.toString(Integer.parseInt(francagc.getText()) + (Integer.parseInt(textE2_2.getText()))));
			hondurasgc.setText(
					Integer.toString(Integer.parseInt(hondurasgc.getText()) + (Integer.parseInt(textE2_1.getText()))));

			francasg.setText(
					Integer.toString(Integer.parseInt(francagp.getText()) - (Integer.parseInt(francagc.getText()))));
			hondurassg.setText(Integer
					.toString(Integer.parseInt(hondurasgp.getText()) - (Integer.parseInt(hondurasgc.getText()))));

			if (Integer.parseInt(textE2_1.getText()) > Integer.parseInt(textE2_2.getText())) {
				francav.setText(Integer.toString(Integer.parseInt(francav.getText()) + 1));
				hondurasd.setText(Integer.toString(Integer.parseInt(hondurasd.getText()) + 1));
				francap.setText(Integer.toString(Integer.parseInt(francap.getText()) + 3));
			} else if (Integer.parseInt(textE2_2.getText()) > Integer.parseInt(textE2_1.getText())) {
				francad.setText(Integer.toString(Integer.parseInt(francad.getText()) + 1));
				hondurasp.setText(Integer.toString(Integer.parseInt(hondurasp.getText()) + 3));
				hondurasv.setText(Integer.toString(Integer.parseInt(hondurasv.getText()) + 1));
			} else {
				francae.setText(Integer.toString(Integer.parseInt(francae.getText()) + 1));
				hondurase.setText(Integer.toString(Integer.parseInt(hondurase.getText()) + 1));
				hondurasp.setText(Integer.toString(Integer.parseInt(hondurasp.getText()) + 1));
				francap.setText(Integer.toString(Integer.parseInt(francap.getText()) + 1));
			}

		}

		// suica x franca
		if (!(textE3_1.getText().isEmpty() && textE3_2.getText().isEmpty())) {
			suicaj.setText(Integer.toString(Integer.parseInt(suicaj.getText()) + 1));
			francaj.setText(Integer.toString(Integer.parseInt(francaj.getText()) + 1));

			suicagp.setText(
					Integer.toString(Integer.parseInt(suicagp.getText()) + (Integer.parseInt(textE3_1.getText()))));
			francagp.setText(
					Integer.toString(Integer.parseInt(francagp.getText()) + (Integer.parseInt(textE3_2.getText()))));

			suicagc.setText(
					Integer.toString(Integer.parseInt(suicagc.getText()) + (Integer.parseInt(textE3_2.getText()))));
			francagc.setText(
					Integer.toString(Integer.parseInt(francagc.getText()) + (Integer.parseInt(textE3_1.getText()))));

			suicasg.setText(
					Integer.toString(Integer.parseInt(suicagp.getText()) - (Integer.parseInt(suicagc.getText()))));
			francasg.setText(
					Integer.toString(Integer.parseInt(francagp.getText()) - (Integer.parseInt(francagc.getText()))));

			if (Integer.parseInt(textE3_1.getText()) > Integer.parseInt(textE3_2.getText())) {
				suicav.setText(Integer.toString(Integer.parseInt(suicav.getText()) + 1));
				francad.setText(Integer.toString(Integer.parseInt(francad.getText()) + 1));
				suicap.setText(Integer.toString(Integer.parseInt(suicap.getText()) + 3));
			} else if (Integer.parseInt(textE3_2.getText()) > Integer.parseInt(textE3_1.getText())) {
				suicad.setText(Integer.toString(Integer.parseInt(suicad.getText()) + 1));
				francap.setText(Integer.toString(Integer.parseInt(francap.getText()) + 3));
				francav.setText(Integer.toString(Integer.parseInt(francav.getText()) + 1));
			} else {
				suicae.setText(Integer.toString(Integer.parseInt(suicae.getText()) + 1));
				francae.setText(Integer.toString(Integer.parseInt(francae.getText()) + 1));
				francap.setText(Integer.toString(Integer.parseInt(francap.getText()) + 1));
				suicap.setText(Integer.toString(Integer.parseInt(suicap.getText()) + 1));
			}
		}

		// honduras x equador
		if (!(textE4_1.getText().isEmpty() && textE4_2.getText().isEmpty())) {
			hondurasj.setText(Integer.toString(Integer.parseInt(hondurasj.getText()) + 1));
			equadorj.setText(Integer.toString(Integer.parseInt(equadorj.getText()) + 1));

			hondurasgp.setText(
					Integer.toString(Integer.parseInt(hondurasgp.getText()) + (Integer.parseInt(textE4_1.getText()))));
			equadorgp.setText(
					Integer.toString(Integer.parseInt(equadorgp.getText()) + (Integer.parseInt(textE4_2.getText()))));

			hondurasgc.setText(
					Integer.toString(Integer.parseInt(hondurasgc.getText()) + (Integer.parseInt(textE4_2.getText()))));
			equadorgc.setText(
					Integer.toString(Integer.parseInt(equadorgc.getText()) + (Integer.parseInt(textE4_1.getText()))));

			hondurassg.setText(Integer
					.toString(Integer.parseInt(hondurasgp.getText()) - (Integer.parseInt(hondurasgc.getText()))));
			equadorsg.setText(
					Integer.toString(Integer.parseInt(equadorgp.getText()) - (Integer.parseInt(equadorgc.getText()))));

			if (Integer.parseInt(textE4_1.getText()) > Integer.parseInt(textE4_2.getText())) {
				hondurasv.setText(Integer.toString(Integer.parseInt(hondurasv.getText()) + 1));
				equadord.setText(Integer.toString(Integer.parseInt(equadord.getText()) + 1));
				hondurasp.setText(Integer.toString(Integer.parseInt(hondurasp.getText()) + 3));
			} else if (Integer.parseInt(textE4_2.getText()) > Integer.parseInt(textE4_1.getText())) {
				hondurasd.setText(Integer.toString(Integer.parseInt(hondurasd.getText()) + 1));
				equadorp.setText(Integer.toString(Integer.parseInt(equadorp.getText()) + 3));
				equadorv.setText(Integer.toString(Integer.parseInt(equadorv.getText()) + 1));
			} else {
				hondurase.setText(Integer.toString(Integer.parseInt(hondurase.getText()) + 1));
				equadore.setText(Integer.toString(Integer.parseInt(equadore.getText()) + 1));
				equadorp.setText(Integer.toString(Integer.parseInt(equadorp.getText()) + 1));
				hondurasp.setText(Integer.toString(Integer.parseInt(hondurasp.getText()) + 1));
			}

		}

		// honduras x suica
		if (!(textE5_1.getText().isEmpty() && textE5_2.getText().isEmpty())) {
			hondurasj.setText(Integer.toString(Integer.parseInt(hondurasj.getText()) + 1));
			suicaj.setText(Integer.toString(Integer.parseInt(suicaj.getText()) + 1));

			hondurasgp.setText(
					Integer.toString(Integer.parseInt(hondurasgp.getText()) + (Integer.parseInt(textE5_1.getText()))));
			suicagp.setText(
					Integer.toString(Integer.parseInt(suicagp.getText()) + (Integer.parseInt(textE5_2.getText()))));

			hondurasgc.setText(
					Integer.toString(Integer.parseInt(hondurasgc.getText()) + (Integer.parseInt(textE5_2.getText()))));
			suicagc.setText(
					Integer.toString(Integer.parseInt(suicagc.getText()) + (Integer.parseInt(textE5_1.getText()))));

			hondurassg.setText(Integer
					.toString(Integer.parseInt(hondurasgp.getText()) - (Integer.parseInt(hondurasgc.getText()))));
			suicasg.setText(
					Integer.toString(Integer.parseInt(suicagp.getText()) - (Integer.parseInt(suicagc.getText()))));

			if (Integer.parseInt(textE5_1.getText()) > Integer.parseInt(textE5_2.getText())) {
				hondurasv.setText(Integer.toString(Integer.parseInt(hondurasv.getText()) + 1));
				suicad.setText(Integer.toString(Integer.parseInt(suicad.getText()) + 1));
				hondurasp.setText(Integer.toString(Integer.parseInt(hondurasp.getText()) + 3));
			} else if (Integer.parseInt(textE5_2.getText()) > Integer.parseInt(textE5_1.getText())) {
				hondurasd.setText(Integer.toString(Integer.parseInt(hondurasd.getText()) + 1));
				suicap.setText(Integer.toString(Integer.parseInt(suicap.getText()) + 3));
				suicav.setText(Integer.toString(Integer.parseInt(suicav.getText()) + 1));
			} else {
				hondurase.setText(Integer.toString(Integer.parseInt(hondurase.getText()) + 1));
				suicae.setText(Integer.toString(Integer.parseInt(suicae.getText()) + 1));
				suicap.setText(Integer.toString(Integer.parseInt(suicap.getText()) + 1));
				hondurasp.setText(Integer.toString(Integer.parseInt(hondurasp.getText()) + 1));
			}

		}

		// equador x franca
		if (!(textE6_1.getText().isEmpty() && textE6_2.getText().isEmpty())) {
			equadorj.setText(Integer.toString(Integer.parseInt(equadorj.getText()) + 1));
			francaj.setText(Integer.toString(Integer.parseInt(francaj.getText()) + 1));

			equadorgp.setText(
					Integer.toString(Integer.parseInt(equadorgp.getText()) + (Integer.parseInt(textE6_1.getText()))));
			francagp.setText(
					Integer.toString(Integer.parseInt(francagp.getText()) + (Integer.parseInt(textE6_2.getText()))));

			equadorgc.setText(
					Integer.toString(Integer.parseInt(equadorgc.getText()) + (Integer.parseInt(textE6_2.getText()))));
			francagc.setText(
					Integer.toString(Integer.parseInt(francagc.getText()) + (Integer.parseInt(textE6_1.getText()))));

			equadorsg.setText(
					Integer.toString(Integer.parseInt(equadorgp.getText()) - (Integer.parseInt(equadorgc.getText()))));
			francasg.setText(
					Integer.toString(Integer.parseInt(francagp.getText()) - (Integer.parseInt(francagc.getText()))));

			if (Integer.parseInt(textE6_1.getText()) > Integer.parseInt(textE6_2.getText())) {
				equadorv.setText(Integer.toString(Integer.parseInt(equadorv.getText()) + 1));
				francad.setText(Integer.toString(Integer.parseInt(francad.getText()) + 1));
				equadorp.setText(Integer.toString(Integer.parseInt(equadorp.getText()) + 3));
			} else if (Integer.parseInt(textE6_2.getText()) > Integer.parseInt(textE6_1.getText())) {
				equadord.setText(Integer.toString(Integer.parseInt(equadord.getText()) + 1));
				francap.setText(Integer.toString(Integer.parseInt(francap.getText()) + 3));
				francav.setText(Integer.toString(Integer.parseInt(francav.getText()) + 1));
			} else {
				equadore.setText(Integer.toString(Integer.parseInt(equadore.getText()) + 1));
				francae.setText(Integer.toString(Integer.parseInt(francae.getText()) + 1));
				francap.setText(Integer.toString(Integer.parseInt(francap.getText()) + 1));
				equadorp.setText(Integer.toString(Integer.parseInt(equadorp.getText()) + 1));
			}

		}

		/*
		 * GRUPO F
		 */

		// argentina x bosnia
		if (!(textF1_1.getText().isEmpty() && textF1_2.getText().isEmpty())) {
			argentinaj.setText(Integer.toString(Integer.parseInt(argentinaj.getText()) + 1));
			bosniaj.setText(Integer.toString(Integer.parseInt(bosniaj.getText()) + 1));

			argentinagp.setText(
					Integer.toString(Integer.parseInt(argentinagp.getText()) + (Integer.parseInt(textF1_1.getText()))));
			bosniagp.setText(
					Integer.toString(Integer.parseInt(bosniagp.getText()) + (Integer.parseInt(textF1_2.getText()))));

			argentinagc.setText(
					Integer.toString(Integer.parseInt(argentinagc.getText()) + (Integer.parseInt(textF1_2.getText()))));
			bosniagc.setText(
					Integer.toString(Integer.parseInt(bosniagc.getText()) + (Integer.parseInt(textF1_1.getText()))));

			argentinasg.setText(Integer
					.toString(Integer.parseInt(argentinagp.getText()) - (Integer.parseInt(argentinagc.getText()))));
			bosniasg.setText(
					Integer.toString(Integer.parseInt(bosniagp.getText()) - (Integer.parseInt(bosniagc.getText()))));

			if (Integer.parseInt(textF1_1.getText()) > Integer.parseInt(textF1_2.getText())) {
				argentinav.setText(Integer.toString(Integer.parseInt(argentinav.getText()) + 1));
				bosniad.setText(Integer.toString(Integer.parseInt(bosniad.getText()) + 1));
				argentinap.setText(Integer.toString(Integer.parseInt(argentinap.getText()) + 3));
			} else if (Integer.parseInt(textF1_2.getText()) > Integer.parseInt(textF1_1.getText())) {
				argentinad.setText(Integer.toString(Integer.parseInt(argentinad.getText()) + 1));
				bosniap.setText(Integer.toString(Integer.parseInt(bosniap.getText()) + 3));
				bosniav.setText(Integer.toString(Integer.parseInt(bosniav.getText()) + 1));
			} else {
				argentinae.setText(Integer.toString(Integer.parseInt(argentinae.getText()) + 1));
				bosniae.setText(Integer.toString(Integer.parseInt(bosniae.getText()) + 1));
				bosniap.setText(Integer.toString(Integer.parseInt(bosniap.getText()) + 1));
				argentinap.setText(Integer.toString(Integer.parseInt(argentinap.getText()) + 1));
			}

		}

		// ira x nigeria
		if (!(textF2_1.getText().isEmpty() && textF2_2.getText().isEmpty())) {
			iraj.setText(Integer.toString(Integer.parseInt(iraj.getText()) + 1));
			nigeriaj.setText(Integer.toString(Integer.parseInt(nigeriaj.getText()) + 1));

			iragp.setText(Integer.toString(Integer.parseInt(iragp.getText()) + (Integer.parseInt(textF2_1.getText()))));
			nigeriagp.setText(
					Integer.toString(Integer.parseInt(nigeriagp.getText()) + (Integer.parseInt(textF2_2.getText()))));

			iragc.setText(Integer.toString(Integer.parseInt(iragc.getText()) + (Integer.parseInt(textF2_2.getText()))));
			nigeriagc.setText(
					Integer.toString(Integer.parseInt(nigeriagc.getText()) + (Integer.parseInt(textF2_1.getText()))));

			irasg.setText(Integer.toString(Integer.parseInt(iragp.getText()) - (Integer.parseInt(iragc.getText()))));
			nigeriasg.setText(
					Integer.toString(Integer.parseInt(nigeriagp.getText()) - (Integer.parseInt(croaciagc.getText()))));

			if (Integer.parseInt(textF2_1.getText()) > Integer.parseInt(textF2_2.getText())) {
				irav.setText(Integer.toString(Integer.parseInt(irav.getText()) + 1));
				nigeriad.setText(Integer.toString(Integer.parseInt(nigeriad.getText()) + 1));
				irap.setText(Integer.toString(Integer.parseInt(irap.getText()) + 3));
			} else if (Integer.parseInt(textF2_2.getText()) > Integer.parseInt(textF2_1.getText())) {
				irad.setText(Integer.toString(Integer.parseInt(irad.getText()) + 1));
				nigeriap.setText(Integer.toString(Integer.parseInt(nigeriap.getText()) + 3));
				nigeriav.setText(Integer.toString(Integer.parseInt(nigeriav.getText()) + 1));
			} else {
				irae.setText(Integer.toString(Integer.parseInt(irae.getText()) + 1));
				nigeriae.setText(Integer.toString(Integer.parseInt(nigeriae.getText()) + 1));
				nigeriap.setText(Integer.toString(Integer.parseInt(nigeriap.getText()) + 1));
				irap.setText(Integer.toString(Integer.parseInt(irap.getText()) + 1));
			}

		}

		// argentina x ira
		if (!(textF3_1.getText().isEmpty() && textF3_2.getText().isEmpty())) {
			argentinaj.setText(Integer.toString(Integer.parseInt(argentinaj.getText()) + 1));
			iraj.setText(Integer.toString(Integer.parseInt(iraj.getText()) + 1));

			argentinagp.setText(
					Integer.toString(Integer.parseInt(argentinagp.getText()) + (Integer.parseInt(textF3_1.getText()))));
			iragp.setText(Integer.toString(Integer.parseInt(iragp.getText()) + (Integer.parseInt(textF3_2.getText()))));

			argentinagc.setText(
					Integer.toString(Integer.parseInt(argentinagc.getText()) + (Integer.parseInt(textF3_2.getText()))));
			iragc.setText(Integer.toString(Integer.parseInt(iragc.getText()) + (Integer.parseInt(textF3_1.getText()))));

			argentinasg.setText(Integer
					.toString(Integer.parseInt(argentinagp.getText()) - (Integer.parseInt(argentinagc.getText()))));
			irasg.setText(Integer.toString(Integer.parseInt(iragp.getText()) - (Integer.parseInt(iragc.getText()))));

			if (Integer.parseInt(textF3_1.getText()) > Integer.parseInt(textF3_2.getText())) {
				argentinav.setText(Integer.toString(Integer.parseInt(argentinav.getText()) + 1));
				irad.setText(Integer.toString(Integer.parseInt(irad.getText()) + 1));
				argentinap.setText(Integer.toString(Integer.parseInt(argentinap.getText()) + 3));
			} else if (Integer.parseInt(textF3_2.getText()) > Integer.parseInt(textF3_1.getText())) {
				argentinad.setText(Integer.toString(Integer.parseInt(argentinad.getText()) + 1));
				irap.setText(Integer.toString(Integer.parseInt(irap.getText()) + 3));
				irav.setText(Integer.toString(Integer.parseInt(irav.getText()) + 1));
			} else {
				argentinae.setText(Integer.toString(Integer.parseInt(argentinae.getText()) + 1));
				irae.setText(Integer.toString(Integer.parseInt(irae.getText()) + 1));
				irap.setText(Integer.toString(Integer.parseInt(irap.getText()) + 1));
				argentinap.setText(Integer.toString(Integer.parseInt(argentinap.getText()) + 1));
			}

		}

		// nigeria x bosnia
		if (!(textF4_1.getText().isEmpty() && textF4_2.getText().isEmpty())) {
			nigeriaj.setText(Integer.toString(Integer.parseInt(nigeriaj.getText()) + 1));
			bosniaj.setText(Integer.toString(Integer.parseInt(bosniaj.getText()) + 1));

			nigeriagp.setText(
					Integer.toString(Integer.parseInt(nigeriagp.getText()) + (Integer.parseInt(textF4_1.getText()))));
			bosniagp.setText(
					Integer.toString(Integer.parseInt(bosniagp.getText()) + (Integer.parseInt(textF4_2.getText()))));

			nigeriagc.setText(
					Integer.toString(Integer.parseInt(nigeriagc.getText()) + (Integer.parseInt(textF4_2.getText()))));
			bosniagc.setText(
					Integer.toString(Integer.parseInt(bosniagc.getText()) + (Integer.parseInt(textF4_1.getText()))));

			nigeriasg.setText(
					Integer.toString(Integer.parseInt(nigeriagp.getText()) - (Integer.parseInt(nigeriagc.getText()))));
			bosniasg.setText(
					Integer.toString(Integer.parseInt(bosniagp.getText()) - (Integer.parseInt(bosniagc.getText()))));

			if (Integer.parseInt(textF4_1.getText()) > Integer.parseInt(textF4_2.getText())) {
				nigeriav.setText(Integer.toString(Integer.parseInt(nigeriav.getText()) + 1));
				bosniad.setText(Integer.toString(Integer.parseInt(bosniad.getText()) + 1));
				nigeriap.setText(Integer.toString(Integer.parseInt(nigeriap.getText()) + 3));
			} else if (Integer.parseInt(textF4_2.getText()) > Integer.parseInt(textF4_1.getText())) {
				nigeriad.setText(Integer.toString(Integer.parseInt(nigeriad.getText()) + 1));
				bosniap.setText(Integer.toString(Integer.parseInt(bosniap.getText()) + 3));
				bosniav.setText(Integer.toString(Integer.parseInt(bosniav.getText()) + 1));
			} else {
				nigeriae.setText(Integer.toString(Integer.parseInt(nigeriae.getText()) + 1));
				bosniae.setText(Integer.toString(Integer.parseInt(bosniae.getText()) + 1));
				bosniap.setText(Integer.toString(Integer.parseInt(bosniap.getText()) + 1));
				nigeriap.setText(Integer.toString(Integer.parseInt(nigeriap.getText()) + 1));
			}

		}

		// nigeria x argentina
		if (!(textF5_1.getText().isEmpty() && textF5_2.getText().isEmpty())) {
			nigeriaj.setText(Integer.toString(Integer.parseInt(nigeriaj.getText()) + 1));
			argentinaj.setText(Integer.toString(Integer.parseInt(argentinaj.getText()) + 1));

			nigeriagp.setText(
					Integer.toString(Integer.parseInt(nigeriagp.getText()) + (Integer.parseInt(textF5_1.getText()))));
			argentinagp.setText(
					Integer.toString(Integer.parseInt(argentinagp.getText()) + (Integer.parseInt(textF5_2.getText()))));

			nigeriagc.setText(
					Integer.toString(Integer.parseInt(nigeriagc.getText()) + (Integer.parseInt(textF5_2.getText()))));
			argentinagc.setText(
					Integer.toString(Integer.parseInt(argentinagc.getText()) + (Integer.parseInt(textF5_1.getText()))));

			nigeriasg.setText(
					Integer.toString(Integer.parseInt(nigeriagp.getText()) - (Integer.parseInt(nigeriagc.getText()))));
			argentinasg.setText(Integer
					.toString(Integer.parseInt(argentinagp.getText()) - (Integer.parseInt(argentinagc.getText()))));

			if (Integer.parseInt(textF5_1.getText()) > Integer.parseInt(textF5_2.getText())) {
				nigeriav.setText(Integer.toString(Integer.parseInt(nigeriav.getText()) + 1));
				argentinad.setText(Integer.toString(Integer.parseInt(argentinad.getText()) + 1));
				nigeriap.setText(Integer.toString(Integer.parseInt(nigeriap.getText()) + 3));
			} else if (Integer.parseInt(textF5_2.getText()) > Integer.parseInt(textF5_1.getText())) {
				nigeriad.setText(Integer.toString(Integer.parseInt(nigeriad.getText()) + 1));
				argentinap.setText(Integer.toString(Integer.parseInt(argentinap.getText()) + 3));
				argentinav.setText(Integer.toString(Integer.parseInt(argentinav.getText()) + 1));
			} else {
				nigeriae.setText(Integer.toString(Integer.parseInt(nigeriae.getText()) + 1));
				argentinae.setText(Integer.toString(Integer.parseInt(argentinae.getText()) + 1));
				argentinap.setText(Integer.toString(Integer.parseInt(argentinap.getText()) + 1));
				nigeriap.setText(Integer.toString(Integer.parseInt(nigeriap.getText()) + 1));
			}

		}

		// bosnia x ira
		if (!(textF6_1.getText().isEmpty() && textF6_2.getText().isEmpty())) {
			bosniaj.setText(Integer.toString(Integer.parseInt(bosniaj.getText()) + 1));
			iraj.setText(Integer.toString(Integer.parseInt(iraj.getText()) + 1));

			bosniagp.setText(
					Integer.toString(Integer.parseInt(bosniagp.getText()) + (Integer.parseInt(textF6_1.getText()))));
			iragp.setText(Integer.toString(Integer.parseInt(iragp.getText()) + (Integer.parseInt(textF6_2.getText()))));

			bosniagc.setText(
					Integer.toString(Integer.parseInt(bosniagc.getText()) + (Integer.parseInt(textF6_2.getText()))));
			iragc.setText(Integer.toString(Integer.parseInt(iragc.getText()) + (Integer.parseInt(textF6_1.getText()))));

			bosniasg.setText(
					Integer.toString(Integer.parseInt(bosniagp.getText()) - (Integer.parseInt(bosniagc.getText()))));
			irasg.setText(Integer.toString(Integer.parseInt(iragp.getText()) - (Integer.parseInt(iragc.getText()))));

			if (Integer.parseInt(textF6_1.getText()) > Integer.parseInt(textF6_2.getText())) {
				bosniav.setText(Integer.toString(Integer.parseInt(bosniav.getText()) + 1));
				irad.setText(Integer.toString(Integer.parseInt(irad.getText()) + 1));
				argentinap.setText(Integer.toString(Integer.parseInt(argentinap.getText()) + 3));
			} else if (Integer.parseInt(textF6_2.getText()) > Integer.parseInt(textF6_1.getText())) {
				bosniad.setText(Integer.toString(Integer.parseInt(bosniad.getText()) + 1));
				irap.setText(Integer.toString(Integer.parseInt(irap.getText()) + 3));
				irav.setText(Integer.toString(Integer.parseInt(irav.getText()) + 1));
			} else {
				bosniae.setText(Integer.toString(Integer.parseInt(bosniae.getText()) + 1));
				irae.setText(Integer.toString(Integer.parseInt(irae.getText()) + 1));
				irap.setText(Integer.toString(Integer.parseInt(irap.getText()) + 1));
				bosniap.setText(Integer.toString(Integer.parseInt(bosniap.getText()) + 1));
			}

		}

		/**
		 * GRUPO G
		 */
		// alemanha x portugal
		if (!(textG1_1.getText().isEmpty() && textG1_2.getText().isEmpty())) {
			alemanhaj.setText(Integer.toString(Integer.parseInt(alemanhaj.getText()) + 1));
			portugalj.setText(Integer.toString(Integer.parseInt(portugalj.getText()) + 1));

			alemanhagp.setText(
					Integer.toString(Integer.parseInt(alemanhagp.getText()) + (Integer.parseInt(textG1_1.getText()))));
			portugalgp.setText(
					Integer.toString(Integer.parseInt(portugalgp.getText()) + (Integer.parseInt(textG1_2.getText()))));

			alemanhagc.setText(
					Integer.toString(Integer.parseInt(alemanhagc.getText()) + (Integer.parseInt(textG1_2.getText()))));
			portugalgc.setText(
					Integer.toString(Integer.parseInt(portugalgc.getText()) + (Integer.parseInt(textG1_1.getText()))));

			alemanhasg.setText(Integer
					.toString(Integer.parseInt(alemanhagp.getText()) - (Integer.parseInt(alemanhagc.getText()))));
			portugalsg.setText(Integer
					.toString(Integer.parseInt(portugalgp.getText()) - (Integer.parseInt(portugalgc.getText()))));

			if (Integer.parseInt(textG1_1.getText()) > Integer.parseInt(textG1_2.getText())) {
				alemanhav.setText(Integer.toString(Integer.parseInt(alemanhav.getText()) + 1));
				portugald.setText(Integer.toString(Integer.parseInt(portugald.getText()) + 1));
				alemanhap.setText(Integer.toString(Integer.parseInt(alemanhap.getText()) + 3));
			} else if (Integer.parseInt(textG1_2.getText()) > Integer.parseInt(textG1_1.getText())) {
				alemanhad.setText(Integer.toString(Integer.parseInt(alemanhad.getText()) + 1));
				portugalp.setText(Integer.toString(Integer.parseInt(portugalp.getText()) + 3));
				portugalv.setText(Integer.toString(Integer.parseInt(portugalv.getText()) + 1));
			} else {
				alemanhae.setText(Integer.toString(Integer.parseInt(alemanhae.getText()) + 1));
				portugale.setText(Integer.toString(Integer.parseInt(portugale.getText()) + 1));
				portugalp.setText(Integer.toString(Integer.parseInt(portugalp.getText()) + 1));
				alemanhap.setText(Integer.toString(Integer.parseInt(alemanhap.getText()) + 1));
			}

		}

		// gana x eua
		if (!(textG2_1.getText().isEmpty() && textG2_2.getText().isEmpty())) {
			ganaj.setText(Integer.toString(Integer.parseInt(ganaj.getText()) + 1));
			euaj.setText(Integer.toString(Integer.parseInt(euaj.getText()) + 1));

			ganagp.setText(
					Integer.toString(Integer.parseInt(ganagp.getText()) + (Integer.parseInt(textG2_1.getText()))));
			euagp.setText(Integer.toString(Integer.parseInt(euagp.getText()) + (Integer.parseInt(textG2_2.getText()))));

			ganagc.setText(
					Integer.toString(Integer.parseInt(ganagc.getText()) + (Integer.parseInt(textG2_2.getText()))));
			euagc.setText(Integer.toString(Integer.parseInt(euagc.getText()) + (Integer.parseInt(textG2_1.getText()))));

			ganasg.setText(Integer.toString(Integer.parseInt(ganagp.getText()) - (Integer.parseInt(ganagc.getText()))));
			euasg.setText(Integer.toString(Integer.parseInt(euagp.getText()) - (Integer.parseInt(euagc.getText()))));

			if (Integer.parseInt(textG2_1.getText()) > Integer.parseInt(textG2_2.getText())) {
				ganav.setText(Integer.toString(Integer.parseInt(ganav.getText()) + 1));
				euad.setText(Integer.toString(Integer.parseInt(euad.getText()) + 1));
				ganap.setText(Integer.toString(Integer.parseInt(ganap.getText()) + 3));
			} else if (Integer.parseInt(textG2_2.getText()) > Integer.parseInt(textG2_1.getText())) {
				ganad.setText(Integer.toString(Integer.parseInt(ganad.getText()) + 1));
				euap.setText(Integer.toString(Integer.parseInt(euap.getText()) + 3));
				euav.setText(Integer.toString(Integer.parseInt(euav.getText()) + 1));
			} else {
				ganae.setText(Integer.toString(Integer.parseInt(ganae.getText()) + 1));
				euae.setText(Integer.toString(Integer.parseInt(euae.getText()) + 1));
				euap.setText(Integer.toString(Integer.parseInt(euap.getText()) + 1));
				ganap.setText(Integer.toString(Integer.parseInt(ganap.getText()) + 1));
			}

		}

		// alemanha x gana
		if (!(textG3_1.getText().isEmpty() && textG3_2.getText().isEmpty())) {
			alemanhaj.setText(Integer.toString(Integer.parseInt(alemanhaj.getText()) + 1));
			ganaj.setText(Integer.toString(Integer.parseInt(ganaj.getText()) + 1));

			alemanhagp.setText(
					Integer.toString(Integer.parseInt(alemanhagp.getText()) + (Integer.parseInt(textG3_1.getText()))));
			ganagp.setText(
					Integer.toString(Integer.parseInt(ganagp.getText()) + (Integer.parseInt(textG3_2.getText()))));

			alemanhagc.setText(
					Integer.toString(Integer.parseInt(alemanhagc.getText()) + (Integer.parseInt(textG3_2.getText()))));
			ganagc.setText(
					Integer.toString(Integer.parseInt(ganagc.getText()) + (Integer.parseInt(textG3_1.getText()))));

			alemanhasg.setText(Integer
					.toString(Integer.parseInt(alemanhagp.getText()) - (Integer.parseInt(alemanhagc.getText()))));
			ganasg.setText(Integer.toString(Integer.parseInt(ganagp.getText()) - (Integer.parseInt(ganagc.getText()))));

			if (Integer.parseInt(textG3_1.getText()) > Integer.parseInt(textG3_2.getText())) {
				alemanhav.setText(Integer.toString(Integer.parseInt(alemanhav.getText()) + 1));
				ganad.setText(Integer.toString(Integer.parseInt(ganad.getText()) + 1));
				alemanhap.setText(Integer.toString(Integer.parseInt(alemanhap.getText()) + 3));
			} else if (Integer.parseInt(textG3_2.getText()) > Integer.parseInt(textG3_1.getText())) {
				alemanhad.setText(Integer.toString(Integer.parseInt(alemanhad.getText()) + 1));
				ganap.setText(Integer.toString(Integer.parseInt(ganap.getText()) + 3));
				ganav.setText(Integer.toString(Integer.parseInt(ganav.getText()) + 1));
			} else {
				alemanhae.setText(Integer.toString(Integer.parseInt(alemanhae.getText()) + 1));
				ganae.setText(Integer.toString(Integer.parseInt(ganae.getText()) + 1));
				ganap.setText(Integer.toString(Integer.parseInt(ganap.getText()) + 1));
				alemanhap.setText(Integer.toString(Integer.parseInt(alemanhap.getText()) + 1));
			}

		}

		// eua x portugual
		if (!(textG4_1.getText().isEmpty() && textG4_2.getText().isEmpty())) {
			euaj.setText(Integer.toString(Integer.parseInt(euaj.getText()) + 1));
			portugalj.setText(Integer.toString(Integer.parseInt(portugalj.getText()) + 1));

			euagp.setText(Integer.toString(Integer.parseInt(euagp.getText()) + (Integer.parseInt(textG4_1.getText()))));
			portugalgp.setText(
					Integer.toString(Integer.parseInt(portugalgp.getText()) + (Integer.parseInt(textG4_2.getText()))));

			euagc.setText(Integer.toString(Integer.parseInt(euagc.getText()) + (Integer.parseInt(textG4_2.getText()))));
			portugalgc.setText(
					Integer.toString(Integer.parseInt(portugalgc.getText()) + (Integer.parseInt(textG4_1.getText()))));

			euasg.setText(Integer.toString(Integer.parseInt(euagp.getText()) - (Integer.parseInt(euagc.getText()))));
			portugalsg.setText(Integer
					.toString(Integer.parseInt(portugalgp.getText()) - (Integer.parseInt(portugalgc.getText()))));

			if (Integer.parseInt(textG4_1.getText()) > Integer.parseInt(textG4_2.getText())) {
				euav.setText(Integer.toString(Integer.parseInt(euav.getText()) + 1));
				portugald.setText(Integer.toString(Integer.parseInt(portugald.getText()) + 1));
				euap.setText(Integer.toString(Integer.parseInt(euap.getText()) + 3));
			} else if (Integer.parseInt(textG4_2.getText()) > Integer.parseInt(textG4_1.getText())) {
				euad.setText(Integer.toString(Integer.parseInt(euad.getText()) + 1));
				portugalp.setText(Integer.toString(Integer.parseInt(portugalp.getText()) + 3));
				portugalv.setText(Integer.toString(Integer.parseInt(portugalv.getText()) + 1));
			} else {
				euae.setText(Integer.toString(Integer.parseInt(euae.getText()) + 1));
				portugale.setText(Integer.toString(Integer.parseInt(portugale.getText()) + 1));
				portugalp.setText(Integer.toString(Integer.parseInt(portugalp.getText()) + 1));
				euap.setText(Integer.toString(Integer.parseInt(euap.getText()) + 1));
			}

		}

		// eua x alemanha
		if (!(textG5_1.getText().isEmpty() && textG5_2.getText().isEmpty())) {
			euaj.setText(Integer.toString(Integer.parseInt(euaj.getText()) + 1));
			alemanhaj.setText(Integer.toString(Integer.parseInt(alemanhaj.getText()) + 1));

			euagp.setText(Integer.toString(Integer.parseInt(euagp.getText()) + (Integer.parseInt(textG5_1.getText()))));
			alemanhagp.setText(
					Integer.toString(Integer.parseInt(alemanhagp.getText()) + (Integer.parseInt(textG5_2.getText()))));

			euagc.setText(Integer.toString(Integer.parseInt(euagc.getText()) + (Integer.parseInt(textG5_2.getText()))));
			alemanhagc.setText(
					Integer.toString(Integer.parseInt(alemanhagc.getText()) + (Integer.parseInt(textG5_1.getText()))));

			euasg.setText(Integer.toString(Integer.parseInt(euagp.getText()) - (Integer.parseInt(euagc.getText()))));
			alemanhasg.setText(Integer
					.toString(Integer.parseInt(alemanhagp.getText()) - (Integer.parseInt(alemanhagc.getText()))));

			if (Integer.parseInt(textG5_1.getText()) > Integer.parseInt(textG5_2.getText())) {
				euav.setText(Integer.toString(Integer.parseInt(euav.getText()) + 1));
				alemanhad.setText(Integer.toString(Integer.parseInt(alemanhad.getText()) + 1));
				euap.setText(Integer.toString(Integer.parseInt(euap.getText()) + 3));
			} else if (Integer.parseInt(textG5_2.getText()) > Integer.parseInt(textG5_1.getText())) {
				euad.setText(Integer.toString(Integer.parseInt(euad.getText()) + 1));
				alemanhap.setText(Integer.toString(Integer.parseInt(alemanhap.getText()) + 3));
				alemanhav.setText(Integer.toString(Integer.parseInt(alemanhav.getText()) + 1));
			} else {
				euae.setText(Integer.toString(Integer.parseInt(euae.getText()) + 1));
				alemanhae.setText(Integer.toString(Integer.parseInt(alemanhae.getText()) + 1));
				alemanhap.setText(Integer.toString(Integer.parseInt(alemanhap.getText()) + 1));
				euap.setText(Integer.toString(Integer.parseInt(euap.getText()) + 1));
			}

		}

		// portugual x gana
		if (!(textG6_1.getText().isEmpty() && textG6_2.getText().isEmpty())) {
			portugalj.setText(Integer.toString(Integer.parseInt(portugalj.getText()) + 1));
			ganaj.setText(Integer.toString(Integer.parseInt(ganaj.getText()) + 1));

			portugalgp.setText(
					Integer.toString(Integer.parseInt(portugalgp.getText()) + (Integer.parseInt(textG6_1.getText()))));
			ganagp.setText(
					Integer.toString(Integer.parseInt(ganagp.getText()) + (Integer.parseInt(textG6_2.getText()))));

			portugalgc.setText(
					Integer.toString(Integer.parseInt(portugalgc.getText()) + (Integer.parseInt(textG6_2.getText()))));
			ganagc.setText(
					Integer.toString(Integer.parseInt(ganagc.getText()) + (Integer.parseInt(textG6_1.getText()))));

			portugalsg.setText(Integer
					.toString(Integer.parseInt(portugalgp.getText()) - (Integer.parseInt(portugalgc.getText()))));
			ganasg.setText(
					Integer.toString(Integer.parseInt(portugalgp.getText()) - (Integer.parseInt(ganagc.getText()))));

			if (Integer.parseInt(textG6_1.getText()) > Integer.parseInt(textG6_2.getText())) {
				portugalv.setText(Integer.toString(Integer.parseInt(portugalv.getText()) + 1));
				ganad.setText(Integer.toString(Integer.parseInt(ganad.getText()) + 1));
				portugalp.setText(Integer.toString(Integer.parseInt(portugalp.getText()) + 3));
			} else if (Integer.parseInt(textG6_2.getText()) > Integer.parseInt(textG6_1.getText())) {
				portugald.setText(Integer.toString(Integer.parseInt(portugald.getText()) + 1));
				ganap.setText(Integer.toString(Integer.parseInt(ganap.getText()) + 3));
				ganav.setText(Integer.toString(Integer.parseInt(ganav.getText()) + 1));
			} else {
				portugale.setText(Integer.toString(Integer.parseInt(portugale.getText()) + 1));
				ganae.setText(Integer.toString(Integer.parseInt(ganae.getText()) + 1));
				ganap.setText(Integer.toString(Integer.parseInt(ganap.getText()) + 1));
				portugalp.setText(Integer.toString(Integer.parseInt(portugalp.getText()) + 1));
			}

		}

		/**
		 * GRUPO H
		 */

		// belgica x argelia
		if (!(textH1_1.getText().isEmpty() && textH1_2.getText().isEmpty())) {
			belgicaj.setText(Integer.toString(Integer.parseInt(belgicaj.getText()) + 1));
			argeliaj.setText(Integer.toString(Integer.parseInt(argeliaj.getText()) + 1));

			belgicagp.setText(
					Integer.toString(Integer.parseInt(belgicagp.getText()) + (Integer.parseInt(textH1_1.getText()))));
			argeliagp.setText(
					Integer.toString(Integer.parseInt(argeliagp.getText()) + (Integer.parseInt(textH1_2.getText()))));

			belgicagc.setText(
					Integer.toString(Integer.parseInt(belgicagc.getText()) + (Integer.parseInt(textH1_2.getText()))));
			argeliagc.setText(
					Integer.toString(Integer.parseInt(argeliagc.getText()) + (Integer.parseInt(textH1_1.getText()))));

			belgicasg.setText(
					Integer.toString(Integer.parseInt(belgicagp.getText()) - (Integer.parseInt(belgicagc.getText()))));
			argeliasg.setText(
					Integer.toString(Integer.parseInt(argeliagp.getText()) - (Integer.parseInt(argeliagc.getText()))));

			if (Integer.parseInt(textH1_1.getText()) > Integer.parseInt(textH1_2.getText())) {
				belgicav.setText(Integer.toString(Integer.parseInt(belgicav.getText()) + 1));
				argeliad.setText(Integer.toString(Integer.parseInt(argeliad.getText()) + 1));
				belgicap.setText(Integer.toString(Integer.parseInt(belgicap.getText()) + 3));
			} else if (Integer.parseInt(textH1_2.getText()) > Integer.parseInt(textH1_1.getText())) {
				belgicad.setText(Integer.toString(Integer.parseInt(belgicad.getText()) + 1));
				argeliap.setText(Integer.toString(Integer.parseInt(argeliap.getText()) + 3));
				argeliav.setText(Integer.toString(Integer.parseInt(argeliav.getText()) + 1));
			} else {
				belgicae.setText(Integer.toString(Integer.parseInt(belgicae.getText()) + 1));
				argeliae.setText(Integer.toString(Integer.parseInt(argeliae.getText()) + 1));
				argeliap.setText(Integer.toString(Integer.parseInt(argeliap.getText()) + 1));
				belgicap.setText(Integer.toString(Integer.parseInt(belgicap.getText()) + 1));
			}

		}

		// russia x c do sul
		if (!(textH2_1.getText().isEmpty() && textH2_2.getText().isEmpty())) {
			russiaj.setText(Integer.toString(Integer.parseInt(russiaj.getText()) + 1));
			cdosulj.setText(Integer.toString(Integer.parseInt(cdosulj.getText()) + 1));

			russiagp.setText(
					Integer.toString(Integer.parseInt(russiagp.getText()) + (Integer.parseInt(textH2_1.getText()))));
			cdosulgp.setText(
					Integer.toString(Integer.parseInt(cdosulgp.getText()) + (Integer.parseInt(textH1_2.getText()))));

			russiagc.setText(
					Integer.toString(Integer.parseInt(russiagc.getText()) + (Integer.parseInt(textH2_2.getText()))));
			cdosulgc.setText(
					Integer.toString(Integer.parseInt(cdosulgc.getText()) + (Integer.parseInt(textH2_1.getText()))));

			russiasg.setText(
					Integer.toString(Integer.parseInt(russiagp.getText()) - (Integer.parseInt(russiagc.getText()))));
			cdosulsg.setText(
					Integer.toString(Integer.parseInt(cdosulgp.getText()) - (Integer.parseInt(cdosulgc.getText()))));

			if (Integer.parseInt(textH2_1.getText()) > Integer.parseInt(textH2_2.getText())) {
				russiav.setText(Integer.toString(Integer.parseInt(russiav.getText()) + 1));
				cdosuld.setText(Integer.toString(Integer.parseInt(cdosuld.getText()) + 1));
				russiap.setText(Integer.toString(Integer.parseInt(russiap.getText()) + 3));
			} else if (Integer.parseInt(textH2_2.getText()) > Integer.parseInt(textH2_1.getText())) {
				russiad.setText(Integer.toString(Integer.parseInt(russiad.getText()) + 1));
				cdosulp.setText(Integer.toString(Integer.parseInt(cdosulp.getText()) + 3));
				cdosulv.setText(Integer.toString(Integer.parseInt(cdosulv.getText()) + 1));
			} else {
				russiae.setText(Integer.toString(Integer.parseInt(russiae.getText()) + 1));
				cdosule.setText(Integer.toString(Integer.parseInt(cdosule.getText()) + 1));
				cdosulp.setText(Integer.toString(Integer.parseInt(cdosulp.getText()) + 1));
				russiap.setText(Integer.toString(Integer.parseInt(russiap.getText()) + 1));
			}

		}

		// belgica x russia
		if (!(textH3_1.getText().isEmpty() && textH3_2.getText().isEmpty())) {
			belgicaj.setText(Integer.toString(Integer.parseInt(belgicaj.getText()) + 1));
			russiaj.setText(Integer.toString(Integer.parseInt(russiaj.getText()) + 1));

			belgicagp.setText(
					Integer.toString(Integer.parseInt(belgicagp.getText()) + (Integer.parseInt(textH3_1.getText()))));
			russiagp.setText(
					Integer.toString(Integer.parseInt(russiagp.getText()) + (Integer.parseInt(textH3_2.getText()))));

			belgicagc.setText(
					Integer.toString(Integer.parseInt(belgicagc.getText()) + (Integer.parseInt(textH3_2.getText()))));
			russiagc.setText(
					Integer.toString(Integer.parseInt(russiagc.getText()) + (Integer.parseInt(textH3_1.getText()))));

			belgicasg.setText(
					Integer.toString(Integer.parseInt(belgicagp.getText()) - (Integer.parseInt(belgicagc.getText()))));
			russiasg.setText(
					Integer.toString(Integer.parseInt(russiagp.getText()) - (Integer.parseInt(russiagc.getText()))));

			if (Integer.parseInt(textH3_1.getText()) > Integer.parseInt(textH3_2.getText())) {
				belgicav.setText(Integer.toString(Integer.parseInt(belgicav.getText()) + 1));
				russiad.setText(Integer.toString(Integer.parseInt(russiad.getText()) + 1));
				belgicap.setText(Integer.toString(Integer.parseInt(belgicap.getText()) + 3));
			} else if (Integer.parseInt(textH3_2.getText()) > Integer.parseInt(textH3_1.getText())) {
				belgicad.setText(Integer.toString(Integer.parseInt(belgicad.getText()) + 1));
				russiap.setText(Integer.toString(Integer.parseInt(russiap.getText()) + 3));
				russiav.setText(Integer.toString(Integer.parseInt(russiav.getText()) + 1));
			} else {
				belgicae.setText(Integer.toString(Integer.parseInt(belgicae.getText()) + 1));
				russiae.setText(Integer.toString(Integer.parseInt(russiae.getText()) + 1));
				russiap.setText(Integer.toString(Integer.parseInt(russiap.getText()) + 1));
				belgicap.setText(Integer.toString(Integer.parseInt(belgicap.getText()) + 1));
			}

		}

		// c do sul x argelia
		if (!(textH4_1.getText().isEmpty() && textH4_2.getText().isEmpty())) {
			cdosulj.setText(Integer.toString(Integer.parseInt(cdosulj.getText()) + 1));
			argeliaj.setText(Integer.toString(Integer.parseInt(argeliaj.getText()) + 1));

			cdosulgp.setText(
					Integer.toString(Integer.parseInt(cdosulgp.getText()) + (Integer.parseInt(textH4_1.getText()))));
			argeliagp.setText(
					Integer.toString(Integer.parseInt(argeliagp.getText()) + (Integer.parseInt(textH4_2.getText()))));

			cdosulgc.setText(
					Integer.toString(Integer.parseInt(cdosulgc.getText()) + (Integer.parseInt(textH4_2.getText()))));
			argeliagc.setText(
					Integer.toString(Integer.parseInt(argeliagc.getText()) + (Integer.parseInt(textH4_1.getText()))));

			cdosulsg.setText(
					Integer.toString(Integer.parseInt(cdosulgp.getText()) - (Integer.parseInt(cdosulgc.getText()))));
			argeliasg.setText(
					Integer.toString(Integer.parseInt(argeliagp.getText()) - (Integer.parseInt(argeliagc.getText()))));

			if (Integer.parseInt(textH4_1.getText()) > Integer.parseInt(textH4_2.getText())) {
				cdosulv.setText(Integer.toString(Integer.parseInt(cdosulv.getText()) + 1));
				argeliad.setText(Integer.toString(Integer.parseInt(argeliad.getText()) + 1));
				cdosulp.setText(Integer.toString(Integer.parseInt(cdosulp.getText()) + 3));
			} else if (Integer.parseInt(textH4_2.getText()) > Integer.parseInt(textH4_1.getText())) {
				cdosuld.setText(Integer.toString(Integer.parseInt(cdosuld.getText()) + 1));
				argeliap.setText(Integer.toString(Integer.parseInt(argeliap.getText()) + 3));
				argeliav.setText(Integer.toString(Integer.parseInt(argeliav.getText()) + 1));
			} else {
				cdosule.setText(Integer.toString(Integer.parseInt(cdosule.getText()) + 1));
				argeliae.setText(Integer.toString(Integer.parseInt(argeliae.getText()) + 1));
				argeliap.setText(Integer.toString(Integer.parseInt(argeliap.getText()) + 1));
				cdosulp.setText(Integer.toString(Integer.parseInt(cdosulp.getText()) + 1));
			}

		}

		// c do sul x belgica
		if (!(textH5_1.getText().isEmpty() && textH5_2.getText().isEmpty())) {
			cdosulj.setText(Integer.toString(Integer.parseInt(cdosulj.getText()) + 1));
			belgicaj.setText(Integer.toString(Integer.parseInt(belgicaj.getText()) + 1));

			cdosulgp.setText(
					Integer.toString(Integer.parseInt(cdosulgp.getText()) + (Integer.parseInt(textH5_1.getText()))));
			belgicagp.setText(
					Integer.toString(Integer.parseInt(belgicagp.getText()) + (Integer.parseInt(textH5_2.getText()))));

			cdosulgc.setText(
					Integer.toString(Integer.parseInt(cdosulgc.getText()) + (Integer.parseInt(textH5_2.getText()))));
			belgicagc.setText(
					Integer.toString(Integer.parseInt(belgicagc.getText()) + (Integer.parseInt(textH5_1.getText()))));

			cdosulsg.setText(
					Integer.toString(Integer.parseInt(cdosulgp.getText()) - (Integer.parseInt(cdosulgc.getText()))));
			belgicasg.setText(
					Integer.toString(Integer.parseInt(belgicagp.getText()) - (Integer.parseInt(belgicagc.getText()))));

			if (Integer.parseInt(textH5_1.getText()) > Integer.parseInt(textH5_2.getText())) {
				cdosulv.setText(Integer.toString(Integer.parseInt(cdosulv.getText()) + 1));
				belgicad.setText(Integer.toString(Integer.parseInt(belgicad.getText()) + 1));
				cdosulp.setText(Integer.toString(Integer.parseInt(cdosulp.getText()) + 3));
			} else if (Integer.parseInt(textH5_2.getText()) > Integer.parseInt(textH5_1.getText())) {
				cdosuld.setText(Integer.toString(Integer.parseInt(cdosuld.getText()) + 1));
				belgicap.setText(Integer.toString(Integer.parseInt(belgicap.getText()) + 3));
				belgicav.setText(Integer.toString(Integer.parseInt(belgicav.getText()) + 1));
			} else {
				cdosule.setText(Integer.toString(Integer.parseInt(cdosule.getText()) + 1));
				belgicae.setText(Integer.toString(Integer.parseInt(belgicae.getText()) + 1));
				belgicap.setText(Integer.toString(Integer.parseInt(belgicap.getText()) + 1));
				cdosulp.setText(Integer.toString(Integer.parseInt(cdosulp.getText()) + 1));
			}

		}

		// argelia x russia
		if (!(textH6_1.getText().isEmpty() && textH6_2.getText().isEmpty())) {
			argeliaj.setText(Integer.toString(Integer.parseInt(argeliaj.getText()) + 1));
			russiaj.setText(Integer.toString(Integer.parseInt(russiaj.getText()) + 1));

			argeliagp.setText(
					Integer.toString(Integer.parseInt(argeliagp.getText()) + (Integer.parseInt(textH6_1.getText()))));
			russiagp.setText(
					Integer.toString(Integer.parseInt(russiagp.getText()) + (Integer.parseInt(textH6_2.getText()))));

			argeliagc.setText(
					Integer.toString(Integer.parseInt(argeliagc.getText()) + (Integer.parseInt(textH6_2.getText()))));
			russiagc.setText(
					Integer.toString(Integer.parseInt(russiagc.getText()) + (Integer.parseInt(textH6_1.getText()))));

			argeliasg.setText(
					Integer.toString(Integer.parseInt(argeliagp.getText()) - (Integer.parseInt(argeliagc.getText()))));
			russiasg.setText(
					Integer.toString(Integer.parseInt(russiagp.getText()) - (Integer.parseInt(russiagc.getText()))));

			if (Integer.parseInt(textH6_1.getText()) > Integer.parseInt(textH6_2.getText())) {
				argeliav.setText(Integer.toString(Integer.parseInt(argeliav.getText()) + 1));
				russiad.setText(Integer.toString(Integer.parseInt(russiad.getText()) + 1));
				argeliap.setText(Integer.toString(Integer.parseInt(argeliap.getText()) + 3));
			} else if (Integer.parseInt(textH6_2.getText()) > Integer.parseInt(textH6_1.getText())) {
				argeliad.setText(Integer.toString(Integer.parseInt(argeliad.getText()) + 1));
				russiap.setText(Integer.toString(Integer.parseInt(russiap.getText()) + 3));
				russiav.setText(Integer.toString(Integer.parseInt(russiav.getText()) + 1));
			} else {
				argeliae.setText(Integer.toString(Integer.parseInt(argeliae.getText()) + 1));
				russiae.setText(Integer.toString(Integer.parseInt(russiae.getText()) + 1));
				russiap.setText(Integer.toString(Integer.parseInt(russiap.getText()) + 1));
				argeliap.setText(Integer.toString(Integer.parseInt(argeliap.getText()) + 1));
			}

		}

	}
}
