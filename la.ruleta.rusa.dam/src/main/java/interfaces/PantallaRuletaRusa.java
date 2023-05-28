package interfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PantallaRuletaRusa extends JPanel implements ActionListener {
    private JButton btnGirar;
    private JLabel lblResultado;
    private Timer timer;
    private int angle;
    private Color[] colores = {Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.ORANGE, Color.MAGENTA};
    private Color colorCursor;
    private Ventana ventana;
    
    public PantallaRuletaRusa(Ventana v) {
    	this.ventana=v;
        setLayout(new BorderLayout());

        JPanel panelSuperior = new JPanel(new FlowLayout());
        btnGirar = new JButton("Girar");
        btnGirar.addActionListener(this);
        panelSuperior.add(btnGirar);
        
        JButton buttonCancelar = new JButton("Cancelar");
        buttonCancelar.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		ventana.cambiarPantalla(PantallaRuletaRusa.class);
        	}
        });
        panelSuperior.add(buttonCancelar);

        lblResultado = new JLabel("");
        panelSuperior.add(lblResultado);

        add(panelSuperior, BorderLayout.NORTH);

        JPanel panelCentral = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g.create();

                int width = getWidth();
                int height = getHeight();

                int centerX = width / 2;
                int centerY = height / 2;

                int radius = Math.min(width, height) / 2 - 20;

                // Dibujar la mitad izquierda de la ruleta
                for (int i = 0; i < colores.length / 2; i++) {
                    g2d.setColor(colores[i]);
                    g2d.fillArc(centerX - radius, centerY - radius, radius * 2, radius * 2, angle + i * 60, 60);
                }

                // Dibujar la mitad derecha de la ruleta
                for (int i = colores.length / 2; i < colores.length; i++) {
                    g2d.setColor(colores[i]);
                    g2d.fillArc(centerX - radius, centerY - radius, radius * 2, radius * 2, angle + i * 60, 60);
                }

                // Dibujar el cursor en forma de flecha
                g2d.setColor(Color.BLACK);
                int cursorSize = 20;

                int[] xPoints = { centerX, centerX - cursorSize / 2, centerX + cursorSize / 2 };
                int[] yPoints = { centerY - cursorSize / 2, centerY + cursorSize / 2, centerY + cursorSize / 2 };
                int numPoints = xPoints.length;

                Polygon arrow = new Polygon(xPoints, yPoints, numPoints);
                g2d.fill(arrow);

                g2d.dispose();
            }
        };

        add(panelCentral, BorderLayout.CENTER);

        timer = new Timer(10, this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnGirar) {
            if (!timer.isRunning()) {
                angle = 0;
                timer.start();
                btnGirar.setEnabled(false);
            }
        } else if (e.getSource() == timer) {
            angle += 5;
            repaint();
            Random r=new Random();
            if (angle >= r.nextInt(720,9777)) {
                timer.stop();
                btnGirar.setEnabled(true);

                // Lógica para determinar el resultado de la ruleta
                //int resultado = (int) (Math.random() * 37);
                //lblResultado.setText("El resultado es: ");

                // Seleccionar un color aleatorio para el cursor
                colorCursor = colores[(int) (Math.random() * colores.length)];
            }
        }

    }
}