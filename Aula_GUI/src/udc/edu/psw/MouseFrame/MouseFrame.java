package udc.edu.psw.MouseFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private JPanel mousePanel;
	
	public MouseFrame() {
		super("Tratamento dos eventos de mouse");
		
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mousePanel = new JPanel();
		add(mousePanel, BorderLayout.CENTER);
		JLabel status = new JLabel("Mensagens de evento do mouse");
		add(status, BorderLayout.SOUTH);
		
		mousePanel.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent event) {
				String detalhe;
				
				if (event.isMetaDown()) //Botão direito do mouse
					detalhe = "com o botão direito";
				if (event.isAltDown()) //Botão do meio do mouse
					detalhe = "com o botão do meio";
				else //Botão esquerdo do mouse
					detalhe = "com o botão esquerdo";
				
				status.setText(String.format("Mouse foi \"clicado\" no ponto (%d; %d) %s", event.getX(), event.getY(), detalhe));
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				mousePanel.setBackground(Color.WHITE);
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				mousePanel.setBackground(Color.RED);
				
			}

			@Override
			public void mousePressed(MouseEvent event) {
				status.setText(String.format("Mouse foi \"pressionado\" no ponto (%d; %d)", event.getX(), event.getY()));
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				status.setText("Mouse foi \"solto\"");
				
			}
			
		});
		
		mousePanel.addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseDragged(MouseEvent event) {
				status.setText(String.format("Mouse foi \"arrastado\" no ponto (%d; %d)", event.getX(), event.getY()));
				
			}

			@Override
			public void mouseMoved(MouseEvent event) {
				status.setText(String.format("Mouse foi \"movimentado\" no ponto (%d; %d)", event.getX(), event.getY()));
				
			}
			
			
		});
		
		setVisible(true);
	}
}
