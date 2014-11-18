package Pucrs.Apro2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;

public class FaceInicial extends JFrame {

	private JPanel contentPane;
	private JTextField texBuscaArq;
	private JTextField txtDtIni;
	private JTextField txtDtFim;
	private JTextField txtNumAc;
	private JTextField txtTaAb;
	private JTextField txtTaCh;
	private JTextField txtTaAt;
	private JTextField txtTaCo;
	private JTextField txtTaQu;
	private JTextField txtTaCa;
	private JTextField txtTaEv;
	private JTextField txtTaTo;
	private JTextField txtTaIn;
	private JTextField txtTaNC;
	private JTextField txtDtSeg;
	private JTextField txtDtTer;
	private JTextField txtDtQua;
	private JTextField txtDtQui;
	private JTextField txtDtSex;
	private JTextField txtDtSab;
	private JTextField txtDtDom;
	private JTextField txtDNDia;
	private JTextField txtDNNoi;
	private JTextField txtTemBom;
	private JTextField txtTemChu;
	private JTextField txtTemNub;
	private JTextField txtTemNC;
	private JTextField txtRegNor;
	private JTextField txtRegSul;
	private JTextField txtRegLes;
	private JTextField txtRegCen;
	private JTextField txtRegNI;
	private JTextField txtViAut;
	private JTextField txtViTax;
	private JTextField txtViLot;
	private JTextField txtViOniUrb;
	private JTextField txtViOniInt;
	private JTextField txtViCam;
	private JTextField txtViMot;
	private JTextField txtViBic;
	private JTextField txtViCar;
	private JTextField txtFer;
	private JTextField txtMor;
	private JTextField txtMorPos;
	private JTextField txtFat;
	private final Action action = new SwingAction();
	private Acidentes<String> acid;
	private final Action action_1 = new SwingAction_1();
	private JButton btnVerNun;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FaceInicial frame = new FaceInicial();
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
	public FaceInicial() {
		acid = new Acidentes<String>();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1091, 603);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Arquivo");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Novo");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Abrir");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("Editar");
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("Ajuda");
		menuBar.add(mnNewMenu_2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel PayIni = new JPanel();
		PayIni.setBounds(0, 0, 1075, 543);
		contentPane.add(PayIni);
		PayIni.setLayout(null);
		
		texBuscaArq = new JTextField();
		texBuscaArq.setBounds(10, 27, 345, 20);
		PayIni.add(texBuscaArq);
		texBuscaArq.setColumns(10);
		
		JLabel lblArquivo = new JLabel("ARQUIVO");
		lblArquivo.setBounds(10, 11, 69, 14);
		PayIni.add(lblArquivo);
		
		JButton btnNewButton = new JButton("BUSCA");
		btnNewButton.setBounds(10, 52, 89, 23);
		PayIni.add(btnNewButton);
		
		JLayeredPane laPa1 = new JLayeredPane();
		laPa1.setBounds(10, 86, 1055, 446);
		PayIni.add(laPa1);
		
		txtDtIni = new JTextField();
		txtDtIni.setBounds(10, 33, 86, 20);
		laPa1.add(txtDtIni);
		txtDtIni.setColumns(10);
		
		txtDtFim = new JTextField();
		txtDtFim.setBounds(106, 33, 86, 20);
		laPa1.add(txtDtFim);
		txtDtFim.setColumns(10);
		
		JLabel lblDataInicial = new JLabel("Data Inicial");
		lblDataInicial.setBounds(10, 21, 86, 14);
		laPa1.add(lblDataInicial);
		
		JLabel lblDataFinal = new JLabel("Data Final");
		lblDataFinal.setBounds(106, 21, 86, 14);
		laPa1.add(lblDataFinal);
		
		txtNumAc = new JTextField();
		txtNumAc.setBounds(10, 75, 182, 20);
		laPa1.add(txtNumAc);
		txtNumAc.setColumns(10);
		
		JLabel lblNumeroTotalDe = new JLabel("Numero Total de Acidentes");
		lblNumeroTotalDe.setBounds(10, 60, 182, 14);
		laPa1.add(lblNumeroTotalDe);
		
		JLabel lblTiposDeAcidentes = new JLabel("TIPOS DE ACIDENTES");
		lblTiposDeAcidentes.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTiposDeAcidentes.setHorizontalAlignment(SwingConstants.CENTER);
		lblTiposDeAcidentes.setBounds(10, 106, 182, 14);
		laPa1.add(lblTiposDeAcidentes);
		
		txtTaAb = new JTextField();
		txtTaAb.setBounds(10, 142, 86, 20);
		laPa1.add(txtTaAb);
		txtTaAb.setColumns(10);
		
		txtTaCh = new JTextField();
		txtTaCh.setBounds(10, 183, 86, 20);
		laPa1.add(txtTaCh);
		txtTaCh.setColumns(10);
		
		txtTaAt = new JTextField();
		txtTaAt.setBounds(10, 225, 86, 20);
		laPa1.add(txtTaAt);
		txtTaAt.setColumns(10);
		
		txtTaCo = new JTextField();
		txtTaCo.setBounds(10, 271, 86, 20);
		laPa1.add(txtTaCo);
		txtTaCo.setColumns(10);
		
		txtTaQu = new JTextField();
		txtTaQu.setBounds(10, 317, 86, 20);
		laPa1.add(txtTaQu);
		txtTaQu.setColumns(10);
		
		txtTaCa = new JTextField();
		txtTaCa.setBounds(134, 142, 86, 20);
		laPa1.add(txtTaCa);
		txtTaCa.setColumns(10);
		
		txtTaEv = new JTextField();
		txtTaEv.setBounds(134, 183, 86, 20);
		laPa1.add(txtTaEv);
		txtTaEv.setColumns(10);
		
		txtTaTo = new JTextField();
		txtTaTo.setBounds(134, 225, 86, 20);
		laPa1.add(txtTaTo);
		txtTaTo.setColumns(10);
		
		txtTaIn = new JTextField();
		txtTaIn.setBounds(134, 271, 86, 20);
		laPa1.add(txtTaIn);
		txtTaIn.setColumns(10);
		
		txtTaNC = new JTextField();
		txtTaNC.setBounds(134, 317, 86, 20);
		laPa1.add(txtTaNC);
		txtTaNC.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ABALROAMENTO");
		lblNewLabel.setBounds(10, 128, 103, 14);
		laPa1.add(lblNewLabel);
		
		JLabel lblChoque = new JLabel("CHOQUE");
		lblChoque.setBounds(10, 169, 66, 14);
		laPa1.add(lblChoque);
		
		JLabel lblAtropelamento = new JLabel("ATROPELAMENTO");
		lblAtropelamento.setBounds(10, 210, 103, 14);
		laPa1.add(lblAtropelamento);
		
		JLabel lblColisao = new JLabel("COLIS\u00C3O");
		lblColisao.setBounds(10, 256, 66, 14);
		laPa1.add(lblColisao);
		
		JLabel lblQueda = new JLabel("QUEDA");
		lblQueda.setBounds(10, 302, 46, 14);
		laPa1.add(lblQueda);
		
		JLabel lblCapotagem = new JLabel("CAPOTAGEM");
		lblCapotagem.setBounds(134, 128, 86, 14);
		laPa1.add(lblCapotagem);
		
		JLabel lblEventual = new JLabel("EVENTUAL");
		lblEventual.setBounds(134, 169, 86, 14);
		laPa1.add(lblEventual);
		
		JLabel lblTombamento = new JLabel("TOMBAMENTO");
		lblTombamento.setBounds(134, 210, 86, 14);
		laPa1.add(lblTombamento);
		
		JLabel lblIncendio = new JLabel("INC\u00CANDIO");
		lblIncendio.setBounds(134, 256, 86, 14);
		laPa1.add(lblIncendio);
		
		JLabel lblNaoCadastrado = new JLabel("N\u00C3O CADASTR.");
		lblNaoCadastrado.setBounds(134, 302, 103, 14);
		laPa1.add(lblNaoCadastrado);
		
		txtDtSeg = new JTextField();
		txtDtSeg.setBounds(263, 142, 86, 20);
		laPa1.add(txtDtSeg);
		txtDtSeg.setColumns(10);
		
		txtDtTer = new JTextField();
		txtDtTer.setBounds(263, 183, 86, 20);
		laPa1.add(txtDtTer);
		txtDtTer.setColumns(10);
		
		txtDtQua = new JTextField();
		txtDtQua.setBounds(263, 225, 86, 20);
		laPa1.add(txtDtQua);
		txtDtQua.setColumns(10);
		
		txtDtQui = new JTextField();
		txtDtQui.setBounds(263, 271, 86, 20);
		laPa1.add(txtDtQui);
		txtDtQui.setColumns(10);
		
		txtDtSex = new JTextField();
		txtDtSex.setBounds(263, 317, 86, 20);
		laPa1.add(txtDtSex);
		txtDtSex.setColumns(10);
		
		txtDtSab = new JTextField();
		txtDtSab.setBounds(263, 363, 86, 20);
		laPa1.add(txtDtSab);
		txtDtSab.setColumns(10);
		
		txtDtDom = new JTextField();
		txtDtDom.setBounds(263, 404, 86, 20);
		laPa1.add(txtDtDom);
		txtDtDom.setColumns(10);
		
		JLabel lblSegunda = new JLabel("SEGUNDA");
		lblSegunda.setBounds(263, 128, 86, 14);
		laPa1.add(lblSegunda);
		
		JLabel lblTerca = new JLabel("TER\u00C7A");
		lblTerca.setBounds(263, 169, 46, 14);
		laPa1.add(lblTerca);
		
		JLabel lblQuarta = new JLabel("QUARTA");
		lblQuarta.setBounds(263, 210, 46, 14);
		laPa1.add(lblQuarta);
		
		JLabel lblQuinta = new JLabel("QUINTA");
		lblQuinta.setBounds(263, 256, 46, 14);
		laPa1.add(lblQuinta);
		
		JLabel lblSexta = new JLabel("SEXTA");
		lblSexta.setBounds(263, 302, 46, 14);
		laPa1.add(lblSexta);
		
		JLabel lblSabado = new JLabel("S\u00C1BADO");
		lblSabado.setBounds(263, 348, 46, 14);
		laPa1.add(lblSabado);
		
		JLabel lblDomingo = new JLabel("DOMINGO");
		lblDomingo.setBounds(263, 390, 86, 14);
		laPa1.add(lblDomingo);
		
		JLabel lblDiaDaSemana = new JLabel("DIA DA SEMANA");
		lblDiaDaSemana.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDiaDaSemana.setBounds(263, 107, 103, 14);
		laPa1.add(lblDiaDaSemana);
		
		txtDNDia = new JTextField();
		txtDNDia.setBounds(384, 142, 86, 20);
		laPa1.add(txtDNDia);
		txtDNDia.setColumns(10);
		
		txtDNNoi = new JTextField();
		txtDNNoi.setBounds(384, 183, 86, 20);
		laPa1.add(txtDNNoi);
		txtDNNoi.setColumns(10);
		
		txtTemBom = new JTextField();
		txtTemBom.setBounds(384, 271, 86, 20);
		laPa1.add(txtTemBom);
		txtTemBom.setColumns(10);
		
		txtTemChu = new JTextField();
		txtTemChu.setBounds(384, 317, 86, 20);
		laPa1.add(txtTemChu);
		txtTemChu.setColumns(10);
		
		txtTemNub = new JTextField();
		txtTemNub.setBounds(384, 363, 86, 20);
		laPa1.add(txtTemNub);
		txtTemNub.setColumns(10);
		
		txtTemNC = new JTextField();
		txtTemNC.setBounds(384, 404, 86, 20);
		laPa1.add(txtTemNC);
		txtTemNC.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("DIA");
		lblNewLabel_1.setBounds(384, 128, 46, 14);
		laPa1.add(lblNewLabel_1);
		
		JLabel lblNoite = new JLabel("NOITE");
		lblNoite.setBounds(384, 169, 46, 14);
		laPa1.add(lblNoite);
		
		JLabel lblNorte = new JLabel("BOM");
		lblNorte.setBounds(384, 256, 46, 14);
		laPa1.add(lblNorte);
		
		JLabel lblSul = new JLabel("CHUVOSO");
		lblSul.setBounds(384, 302, 86, 14);
		laPa1.add(lblSul);
		
		JLabel lblLeste = new JLabel("NUBLADO");
		lblLeste.setBounds(384, 348, 74, 14);
		laPa1.add(lblLeste);
		
		JLabel lblCentro = new JLabel("N\u00C3O CADASTR.");
		lblCentro.setBounds(384, 390, 103, 14);
		laPa1.add(lblCentro);
		
		JLabel lblDiaOuNoite = new JLabel("DIA OU NOITE");
		lblDiaOuNoite.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDiaOuNoite.setBounds(384, 107, 86, 14);
		laPa1.add(lblDiaOuNoite);
		
		JLabel lblTempo = new JLabel("TEMPO");
		lblTempo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTempo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTempo.setBounds(384, 228, 86, 14);
		laPa1.add(lblTempo);
		
		txtRegNor = new JTextField();
		txtRegNor.setBounds(500, 142, 86, 20);
		laPa1.add(txtRegNor);
		txtRegNor.setColumns(10);
		
		txtRegSul = new JTextField();
		txtRegSul.setBounds(500, 183, 86, 20);
		laPa1.add(txtRegSul);
		txtRegSul.setColumns(10);
		
		txtRegLes = new JTextField();
		txtRegLes.setBounds(500, 225, 86, 20);
		laPa1.add(txtRegLes);
		txtRegLes.setColumns(10);
		
		txtRegCen = new JTextField();
		txtRegCen.setBounds(500, 271, 86, 20);
		laPa1.add(txtRegCen);
		txtRegCen.setColumns(10);
		
		txtRegNI = new JTextField();
		txtRegNI.setBounds(500, 317, 86, 20);
		laPa1.add(txtRegNI);
		txtRegNI.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("NORTE");
		lblNewLabel_2.setBounds(500, 128, 46, 14);
		laPa1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("SUL");
		lblNewLabel_3.setBounds(500, 169, 46, 14);
		laPa1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("LESTE");
		lblNewLabel_4.setBounds(500, 210, 46, 14);
		laPa1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("CENTRO");
		lblNewLabel_5.setBounds(500, 256, 46, 14);
		laPa1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("N\u00C3O IDENTIFIC.");
		lblNewLabel_6.setBounds(500, 302, 86, 14);
		laPa1.add(lblNewLabel_6);
		
		JLabel lblRegiao = new JLabel("REGI\u00C3O");
		lblRegiao.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblRegiao.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegiao.setBounds(500, 107, 86, 14);
		laPa1.add(lblRegiao);
		
		txtViAut = new JTextField();
		txtViAut.setBounds(622, 142, 86, 20);
		laPa1.add(txtViAut);
		txtViAut.setColumns(10);
		
		txtViTax = new JTextField();
		txtViTax.setBounds(622, 183, 86, 20);
		laPa1.add(txtViTax);
		txtViTax.setColumns(10);
		
		txtViLot = new JTextField();
		txtViLot.setBounds(622, 225, 86, 20);
		laPa1.add(txtViLot);
		txtViLot.setColumns(10);
		
		txtViOniUrb = new JTextField();
		txtViOniUrb.setBounds(622, 271, 86, 20);
		laPa1.add(txtViOniUrb);
		txtViOniUrb.setColumns(10);
		
		txtViOniInt = new JTextField();
		txtViOniInt.setBounds(622, 317, 86, 20);
		laPa1.add(txtViOniInt);
		txtViOniInt.setColumns(10);
		
		txtViCam = new JTextField();
		txtViCam.setBounds(744, 142, 86, 20);
		laPa1.add(txtViCam);
		txtViCam.setColumns(10);
		
		txtViMot = new JTextField();
		txtViMot.setBounds(744, 183, 86, 20);
		laPa1.add(txtViMot);
		txtViMot.setColumns(10);
		
		txtViBic = new JTextField();
		txtViBic.setBounds(744, 225, 86, 20);
		laPa1.add(txtViBic);
		txtViBic.setColumns(10);
		
		txtViCar = new JTextField();
		txtViCar.setBounds(744, 271, 86, 20);
		laPa1.add(txtViCar);
		txtViCar.setColumns(10);
		
		JLabel lblAutomovel = new JLabel("AUTOMOVEL");
		lblAutomovel.setBounds(623, 128, 85, 14);
		laPa1.add(lblAutomovel);
		
		JLabel lblTaxi = new JLabel("TAXI");
		lblTaxi.setBounds(622, 169, 46, 14);
		laPa1.add(lblTaxi);
		
		JLabel lblLotacao = new JLabel("LOTACAO");
		lblLotacao.setBounds(622, 210, 86, 14);
		laPa1.add(lblLotacao);
		
		JLabel lblOnibusUrb = new JLabel("\u00D4NIBUS URB.");
		lblOnibusUrb.setBounds(622, 256, 74, 14);
		laPa1.add(lblOnibusUrb);
		
		JLabel lblnibusInt = new JLabel("\u00D4NIBUS INT.");
		lblnibusInt.setBounds(622, 302, 86, 14);
		laPa1.add(lblnibusInt);
		
		JLabel lblCaminho = new JLabel("CAMINH\u00C3O");
		lblCaminho.setBounds(744, 128, 86, 14);
		laPa1.add(lblCaminho);
		
		JLabel lblMoto = new JLabel("MOTO");
		lblMoto.setBounds(744, 169, 46, 14);
		laPa1.add(lblMoto);
		
		JLabel lblBicicleta = new JLabel("BICICLETA");
		lblBicicleta.setBounds(744, 210, 86, 14);
		laPa1.add(lblBicicleta);
		
		JLabel lblCarroa = new JLabel("CARRO\u00C7A");
		lblCarroa.setBounds(744, 256, 86, 14);
		laPa1.add(lblCarroa);
		
		JLabel lblVeculosEnvolvidos = new JLabel("VE\u00CDCULOS ENVOLVIDOS");
		lblVeculosEnvolvidos.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblVeculosEnvolvidos.setHorizontalAlignment(SwingConstants.CENTER);
		lblVeculosEnvolvidos.setBounds(622, 107, 208, 14);
		laPa1.add(lblVeculosEnvolvidos);
		
		txtFer = new JTextField();
		txtFer.setBounds(885, 142, 86, 20);
		laPa1.add(txtFer);
		txtFer.setColumns(10);
		
		txtMor = new JTextField();
		txtMor.setBounds(885, 183, 86, 20);
		laPa1.add(txtMor);
		txtMor.setColumns(10);
		
		txtMorPos = new JTextField();
		txtMorPos.setBounds(885, 225, 86, 20);
		laPa1.add(txtMorPos);
		txtMorPos.setColumns(10);
		
		txtFat = new JTextField();
		txtFat.setBounds(885, 271, 86, 20);
		laPa1.add(txtFat);
		txtFat.setColumns(10);
		
		JLabel lblFeridos = new JLabel("FERIDOS");
		lblFeridos.setBounds(885, 128, 66, 14);
		laPa1.add(lblFeridos);
		
		JLabel lblMortes = new JLabel("MORTES");
		lblMortes.setBounds(885, 169, 66, 14);
		laPa1.add(lblMortes);
		
		JLabel lblMortesPs = new JLabel("MORTES P\u00D3S");
		lblMortesPs.setBounds(885, 210, 86, 14);
		laPa1.add(lblMortesPs);
		
		JLabel lblFatais = new JLabel("FATAIS");
		lblFatais.setBounds(885, 256, 66, 14);
		laPa1.add(lblFatais);
		
		btnVerNun = new JButton("Ver n\u00FAmeros");
		btnVerNun.setAction(action_1);
		btnVerNun.setBounds(220, 32, 114, 42);
		laPa1.add(btnVerNun);
		
		JButton btnAbrir = new JButton("ABRIR");
		btnAbrir.setAction(action);
		btnAbrir.setBounds(266, 52, 89, 23);
		PayIni.add(btnAbrir);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "ABRIR");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			
			acid.leArquivo();
			txtDtIni.setText(acid.dataini());
			txtDtFim.setText(acid.dataFim());
			txtNumAc.setText(acid.size() + "");
			btnVerNun.setEnabled(true);
			
			}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "VER NÚMEROS");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			acid.setCorrigeData();
			txtTaAb.setText(acid.contador(1,"ABALROAMENTO") + "");
			txtTaCh.setText(acid.contador(1,"CHOQUE") + "");
			txtTaAt.setText(acid.contador(1,"ATROPELAMENTO")+ "");
			txtTaCo.setText(acid.contador(1,"COLISAO") + "");
			txtTaQu.setText(acid.contador(1,"QUEDA") + "");
			txtTaCa.setText(acid.contador(1,"CAPOTAGEM") + "");
			txtTaEv.setText(acid.contador(1,"EVENTUAL") + "");
			txtTaTo.setText(acid.contador(1,"TOMBAMENTO") + "");
			txtTaIn.setText(acid.contador(1,"INCENDIO") + "");
			txtTaNC.setText(acid.contador(1,"NAO CADASTRADO") + "");
			
			txtDtSeg.setText(acid.contador(3, "SEGUNDA-FEIRA")+ "");
			txtDtTer.setText(acid.contador(3, "TERCA-FEIRA")+ "");
			txtDtQua.setText(acid.contador(3, "QUARTA-FEIRA")+ "");
			txtDtQui.setText(acid.contador(3, "QUINTA-FEIRA")+ "");
			txtDtSex.setText(acid.contador(3, "SEXTA-FEIRA")+ "");
			txtDtSab.setText(acid.contador(3, "SABADO")+ "");
			txtDtDom.setText(acid.contador(3, "DOMINGO")+ "");
			
			txtDNDia.setText(acid.contador(18, "DIA")+ "");
			txtDNNoi.setText(acid.contador(18, "NOITE")+ "");
			
			txtTemBom.setText(acid.contador(17, "BOM")+ "");
			txtTemChu.setText(acid.contador(17, "CHUVOSO")+ "");
			txtTemNub.setText(acid.contador(17, "NUBLADO")+ "");
			txtTemNC.setText(acid.contador(17, "NAO CADAST")+ "");
			
			txtRegNor.setText(acid.contador("NO")+ "");
			txtRegSul.setText(acid.contador("SU")+ "");
			txtRegLes.setText(acid.contador("LE")+ "");
			txtRegCen.setText(acid.contador("CE")+ "");
			txtRegNI.setText(acid.contador("NA")+ "");
			
			txtViAut.setText(acid.contador(8)+ "");
			txtViTax.setText(acid.contador(9)+ "");
			txtViLot.setText(acid.contador(10)+ "");
			txtViOniUrb.setText(acid.contador(11)+ "");
			txtViOniInt.setText(acid.contador(12)+ "");
			txtViCam.setText(acid.contador(13)+ "");
			txtViMot.setText(acid.contador(14)+ "");
			txtViCar.setText(acid.contador(15)+ "");
			txtViBic.setText(acid.contador(16)+ "");
			
			txtFer.setText(acid.contador(4)+ "");
			txtMor.setText(acid.contador(5)+ "");
			txtMorPos.setText(acid.contador(6)+ "");
			txtFat.setText(acid.contador(7)+ "");
			
			
			
			
		}
	}
}
