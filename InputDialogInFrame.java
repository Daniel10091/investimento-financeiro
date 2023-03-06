import java.awt.Color;
import javax.swing.JFrame;

public class InputDialogInFrame extends JFrame {
  
  public InputDialogInFrame() {
    getContentPane().setBackground(Color.DARK_GRAY);
    setTitle("Investimento");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    setResizable(false);
    setSize(400, 300);
    getContentPane().setLayout(null);
  }

  public void closeIt() {
    this.getContentPane().setVisible(false);
    this.dispose();
  }

}
