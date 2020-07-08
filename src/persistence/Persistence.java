package persistence;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Grupo;
import model.Jogo;
import model.Selecao;

public class Persistence {

	private static JdbcConnection BD = new JdbcConnection();
	private static Connection con;
	private static Statement stm;
	private static ResultSet rs;

	public static boolean save(Selecao selecao) {
		System.out.println("Salvo com sucesso!");
		con = BD.getConnection();
		try {
			stm = con.createStatement();
			stm.execute("INSERT INTO copa.Selecao (nome,pontos,golsPro,golsContra,saldoGol)" + "VALUES (\""
					+ selecao.getNome() + "\"," + " \"" + selecao.getPontos() + "\"," + " \"" + selecao.getGolsPro()
					+ "\"," + " \"" + selecao.getGolsContra() + "\"," + " \"" + selecao.getSaldoGol() + "\" );");
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public static boolean save(Grupo grupo) {
		System.out.println("Salvo com sucesso!");
		con = BD.getConnection();
		try {
			stm = con.createStatement();
			stm.execute("INSERT INTO copa.Grupo (letra,selecao1,selecao2,selecao3,selecao4) VALUES " + "(\""
					+ grupo.getLetra() + "\"," + " \"" + grupo.getSelecao1() + "\"," + " \"" + grupo.getSelecao2()
					+ "\"," + " \"" + grupo.getSelecao3() + "\"," + " \"" + grupo.getSelecao4() + "\" );");
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public static boolean save(Jogo jogo) {
		// System.out.println("Salvo com sucesso!");
		con = BD.getConnection();
		try {
			stm = con.createStatement();
			String stmt = "INSERT INTO copa.Jogo (selecao1,valor1,selecao2,valor2) VALUES " + "(\"" + jogo.getSelecao1()
					+ "\"," + " \"" + jogo.getValor1() + "\"," + " \"" + jogo.getSelecao2() + "\"," + " \""
					+ jogo.getValor2() + "\");";
			System.out.println(stmt);
			stm.execute(stmt);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public static List<Selecao> listSelecao() {
		List<Selecao> selecao = new ArrayList<Selecao>();

		try {
			con = BD.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery("select * from copa.Selecao;");
			while (rs.next()) {
				Selecao selecoes = new Selecao(null, 0, 0, 0, 0);

				String nome = rs.getString("nome");
				selecoes.setNome(nome);

				int pontos = rs.getInt("pontos");
				selecoes.setPontos(pontos);

				int golsPro = rs.getInt("golsPro");
				selecoes.setGolsPro(golsPro);

				int golsContra = rs.getInt("golsContra");
				selecoes.setGolsContra(golsContra);

				int saldoGol = rs.getInt("saldoGol");
				selecoes.setSaldoGol(saldoGol);

				selecao.add(selecoes);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return selecao;

	}

	public static List<Grupo> listGrupo() {
		List<Grupo> grupo = new ArrayList<Grupo>();

		try {
			con = BD.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery("select * from copa.Grupo;");
			while (rs.next()) {
				Grupo grupos = new Grupo(null, null, null, null, null);

				String letra = rs.getString("letra");
				grupos.setLetra(letra);

				String selecao1 = rs.getString("selecao1");
				grupos.setSelecao1(selecao1);

				String selecao2 = rs.getString("selecao2");
				grupos.setSelecao2(selecao2);

				String selecao3 = rs.getString("selecao3");
				grupos.setSelecao3(selecao3);

				String selecao4 = rs.getString("selecao4");
				grupos.setSelecao4(selecao4);

				grupo.add(grupos);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return grupo;
	}

	public static List<Jogo> listJogo() {
		List<Jogo> jogo = new ArrayList<Jogo>();

		try {
			con = BD.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery("select * from copa.Jogo;");
			while (rs.next()) {
				Jogo jogos = new Jogo(null, 0, null, 0);

				String selecao1 = rs.getString("selecao1");
				jogos.setSelecao1(selecao1);

				int valor1 = rs.getInt("valor1");
				jogos.setValor1(valor1);

				String selecao2 = rs.getString("selecao2");
				jogos.setSelecao2(selecao2);

				int valor2 = rs.getInt("valor2");
				jogos.setValor2(valor2);

				jogo.add(jogos);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return jogo;
	}
}
