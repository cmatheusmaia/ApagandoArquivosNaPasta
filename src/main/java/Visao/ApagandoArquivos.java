package Visao;

import java.awt.EventQueue;

import javax.swing.JFrame;

import negocio.ApagandoFile;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.Window.Type;
import javax.swing.SwingConstants;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.Color;

public class ApagandoArquivos {

	private JFrame frmApagandoArquivosTemps;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ApagandoArquivos window = new ApagandoArquivos();
					window.frmApagandoArquivosTemps.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ApagandoArquivos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmApagandoArquivosTemps = new JFrame();
		frmApagandoArquivosTemps.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmApagandoArquivosTemps.setType(Type.UTILITY);
		frmApagandoArquivosTemps.setResizable(false);
		frmApagandoArquivosTemps.setTitle("APAGANDO ARQUIVOS TEMPS");
		frmApagandoArquivosTemps.setBounds(100, 100, 285, 96);
		frmApagandoArquivosTemps.setLocationRelativeTo(null);
		frmApagandoArquivosTemps.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmApagandoArquivosTemps.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("LIMPAR PASTA");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmApagandoArquivosTemps.setLocationRelativeTo(null);
				ApagandoFile.main(null);
			}
		});
		btnNewButton.setBounds(4, 10, 271, 33);
		frmApagandoArquivosTemps.getContentPane().add(btnNewButton);
		
		JTextPane txtpnDesenvolvidoPorMatheus = new JTextPane();
		txtpnDesenvolvidoPorMatheus.setBackground(Color.LIGHT_GRAY);
		txtpnDesenvolvidoPorMatheus.setFont(new Font("Tahoma", Font.BOLD, 8));
		txtpnDesenvolvidoPorMatheus.setEditable(false);
		txtpnDesenvolvidoPorMatheus.setText("DESENVOLVIDO POR MATHEUS MAIA");
		txtpnDesenvolvidoPorMatheus.setBounds(65, 45, 163, 20);
		frmApagandoArquivosTemps.getContentPane().add(txtpnDesenvolvidoPorMatheus);
		frmApagandoArquivosTemps.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{frmApagandoArquivosTemps.getContentPane(), btnNewButton, txtpnDesenvolvidoPorMatheus}));
	}
}
