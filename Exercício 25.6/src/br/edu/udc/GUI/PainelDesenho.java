package br.edu.udc.GUI;

import javax.swing.JPanel;

import br.edu.udc.Modelo.FormaGeometrica;
import br.edu.udc.Modelo.Linha;
import br.edu.udc.Modelo.Ponto2D;
import br.edu.udc.Modelo.manipulador.ManipuladorFormaGeometrica;
import br.edu.udc.Colecao.Iterador;
import br.edu.udc.Colecao.ListaEncadeada;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class PainelDesenho extends JPanel implements MouseListener, MouseMotionListener {
	private static final long serialVersionUID = 1L;

	private boolean desenhando = false;
	private ManipuladorFormaGeometrica manipulador;
	private FormaGeometrica forma;
	private ListaEncadeada<FormaGeometrica> listaFormaGeometrica;

	public PainelDesenho() {
		listaFormaGeometrica = new ListaEncadeada<FormaGeometrica>();

		addMouseListener(this);
		addMouseMotionListener(this);
	}

	public void setFormaGeometrica(FormaGeometrica forma) {
		this.forma = forma;
		manipulador = forma.getManipulador();
	}

	public boolean isDesenhando() {
		return desenhando;
	}

	public void setDesenhando(boolean desenhando) {
		this.desenhando = desenhando;
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		if (forma != null)
			manipulador.paint(g);

		FormaGeometrica formaAux;
		Iterador<FormaGeometrica> it = listaFormaGeometrica.getInicio();

		formaAux = it.getObjeto();
		while (formaAux != null) {
			formaAux.getManipulador().paint(g);
			formaAux = it.proximo();
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (manipulador != null) {
			manipulador.click(e.getX(), e.getY());
			repaint();
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if (manipulador != null) {
			manipulador.press(e.getX(), e.getY());

			desenhando = true;
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if (desenhando) {
			manipulador.release(e.getX(), e.getY());

			listaFormaGeometrica.inserirFim(forma);

			desenhando = false;

			forma = forma.clone();
			manipulador = forma.getManipulador();

			repaint();
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		if (desenhando) {
			manipulador.drag(e.getX(), e.getY());

			repaint();
		}
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}
}