import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class drive {
	public static void main (String [] arg)throws InterruptedException, IOException{
		ui game = new ui();
		while (game.play){Thread.sleep(game.speed);game.redraw();}
		game.win();
	}
}
class ui {
	int speed;
	boolean play=true;
	draw graph = new draw();
	ui() throws IOException{
		JFrame f= new JFrame();
		f.setTitle("4kbase");
		f.setSize(800,800);
		f.setResizable(false);
		f.add(graph);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	void redraw(){graph.repaint();}
	void win(){graph.win=true;}
}
class draw extends JPanel  implements  MouseListener    {
	private static final long serialVersionUID = -5198057352181829090L;
boolean win=false;
	public draw() throws IOException{
		ini();addMouseListener(this);setFocusable(true);
	}
	void ini(){}
	public void paint (Graphics g2d){
		g2d.setColor(Color.GRAY);
		g2d.fillRect(0,0,800,800);	
			}
	
	public void mouseClicked(MouseEvent click) {}
	public void mouseEntered(MouseEvent arg0){}
	public void mouseExited(MouseEvent arg0){}
	public void mousePressed(MouseEvent arg0){}
	public void mouseReleased(MouseEvent arg0){}
	int rnd(int n){return new Random().nextInt(n);}
}
