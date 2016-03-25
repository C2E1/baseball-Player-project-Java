import javax.swing.JFrame;
import java.awt.*;
import javax.swing.JTextArea;
/**
 * This class intializes a GUI that the lists can be printed to
 * It has 3 text area each holding its own list
 *
 */
public class PlayerGui extends JFrame {//playergui is now a jframe
	
	//three text areas
	
	JTextArea lefttextArea = new JTextArea();
	JTextArea righttextArea = new JTextArea();
	JTextArea centertextArea = new JTextArea();
	/**
	 * Constructor with no parameters that loads the default GUI
	 */
	public PlayerGui () {//gui and all parameters
		super("PlayerGUI");
		setSize(850,300);
	    setLocation(150, 150);
	    setTitle("BaseballPlayers");
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setLayout( new GridLayout(1,3) ); //1 by 3	
	    getContentPane();
	    
		lefttextArea.setEditable(false);
		lefttextArea.setText("Players\n"+"\n");
		add(lefttextArea,BorderLayout.EAST);
		lefttextArea.setBackground(Color.yellow );
		
		centertextArea.setEditable(false);
		centertextArea.setText("Fielders\n"+"\n");
		add(centertextArea,BorderLayout.CENTER);
		centertextArea.setBackground(Color.cyan);
		
		righttextArea.setEditable(false);
		righttextArea.setText("Pitchers\n"+"\n");
		add(righttextArea,BorderLayout.WEST);
		righttextArea.setBackground(Color.red );
		
		
		
		setVisible(true);
	}
	/**prints the list to the GUI
	 * @param list of baseballplayer objects 
	 * 
	 */
	public void printToLeft(PlayerList list) {
		
		
			lefttextArea.append(list.toString());
			
	 }
	/**prints the list to the GUI
	 * @param listof baseballplayer objects 
	 * 
	 */
    public void printToRight(PlayerList list) {
		
		
			righttextArea.append(list.toString());
	 }
    public void printToCenter(PlayerList list) {
		
		
		centertextArea.append(list.toString());
	}
    
}//PlayerGUI
