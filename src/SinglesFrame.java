
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.Timer;

import java.util.Random;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class SinglesFrame extends JFrame implements ActionListener {
    // This class is only a starting point. You may wish to add members and 
    // fields to complete the implementation of this class as per the
    // question on the assignment sheet.
    
    // Constants
    private static final int FRAME_WIDTH = 1100;
    private static final int FRAME_HEIGHT = 780;
    
    // Instance variables -- GUI components
    private JPanel panel;
    private JLabel P1PokesLabel;
    private JLabel P2PokesLabel;
    private JLabel P1Pokes1;
    private JLabel P1Pokes2;
    private JLabel P1Pokes3;
    private JLabel P1Pokes4;
    private JLabel P1Pokes5;
    private JLabel P1Pokes6;
    private JLabel P2Pokes1;
    private JLabel P2Pokes2;
    private JLabel P2Pokes3;
    private JLabel P2Pokes4;
    private JLabel P2Pokes5;
    private JLabel P2Pokes6;
    private JLabel Filler;
    private JButton P1Button;
    private JButton P2Button;
    private Timer P1timer;
    private Timer P2timer;
    public int P1Pokenums[];
    public int P2Pokenums[];
    // Constructor
	public SinglesFrame() {
        super();
        
        //
        // Set up the frame
        setSize( FRAME_WIDTH, FRAME_HEIGHT );
        
        //
        // Set up the panel and layout manager
        panel = new JPanel();
        GridLayout grid = new GridLayout( 0, 5 );  // a one-column layout
        panel.setLayout( grid );
        
        add( panel );  // add panel to the JFrame
        P1Pokenums = new int[6];
        P2Pokenums = new int[6];
        //
        // Set up and add components
        P1PokesLabel = new JLabel( "P1:" );
        panel.add(P1PokesLabel);
        
        Filler = new JLabel("        ");
        panel.add(Filler);
        Filler = new JLabel("        ");
        panel.add(Filler);
        
        P2PokesLabel = new JLabel("P2:");
        panel.add(P2PokesLabel);
        
        Filler = new JLabel("        ");
        panel.add(Filler);
        ImageIcon icon = new ImageIcon("src\\Default.bmp");
        P1Pokes1 = new JLabel(icon, JLabel.CENTER);
        panel.add(P1Pokes1);
        P1Pokes2 = new JLabel(icon, JLabel.CENTER);
        panel.add(P1Pokes2);
        
        Filler = new JLabel("        ");
        panel.add(Filler);
        
        P2Pokes1 = new JLabel(icon, JLabel.CENTER);
        panel.add(P2Pokes1);
        P2Pokes2 = new JLabel(icon, JLabel.CENTER);
        panel.add(P2Pokes2);
        
        P1Pokes3 = new JLabel(icon, JLabel.CENTER);
        panel.add(P1Pokes3);
        P1Pokes4 = new JLabel(icon, JLabel.CENTER);
        panel.add(P1Pokes4);
        
        Filler = new JLabel("        ");
        panel.add(Filler);
        
        P2Pokes3 = new JLabel(icon, JLabel.CENTER);
        panel.add(P2Pokes3);
        P2Pokes4 = new JLabel(icon, JLabel.CENTER);
        panel.add(P2Pokes4);
        
        P1Pokes5 = new JLabel(icon, JLabel.CENTER);
        panel.add(P1Pokes5);
        P1Pokes6 = new JLabel(icon, JLabel.CENTER);
        panel.add(P1Pokes6);
        
        Filler = new JLabel("        ");
        panel.add(Filler);
        
        P2Pokes5 = new JLabel(icon, JLabel.CENTER);
        panel.add(P2Pokes5);
        P2Pokes6 = new JLabel(icon, JLabel.CENTER);
        panel.add(P2Pokes6);
        
        P1Pokes1.setBorder(BorderFactory.createLineBorder(Color.black));
        P1Pokes2.setBorder(BorderFactory.createLineBorder(Color.black));
        P1Pokes3.setBorder(BorderFactory.createLineBorder(Color.black));
        P1Pokes4.setBorder(BorderFactory.createLineBorder(Color.black));
        P1Pokes5.setBorder(BorderFactory.createLineBorder(Color.black));
        P1Pokes6.setBorder(BorderFactory.createLineBorder(Color.black));
        
        
        
        P2Pokes1.setBorder(BorderFactory.createLineBorder(Color.black));
        P2Pokes2.setBorder(BorderFactory.createLineBorder(Color.black));
        P2Pokes3.setBorder(BorderFactory.createLineBorder(Color.black));
        P2Pokes4.setBorder(BorderFactory.createLineBorder(Color.black));
        P2Pokes5.setBorder(BorderFactory.createLineBorder(Color.black));
        P2Pokes6.setBorder(BorderFactory.createLineBorder(Color.black));
        

        
        P1Button = new JButton( "Randomise P1's Pokemon" );
        panel.add( P1Button );
        P1Button.addActionListener(this);
        P1Button.setActionCommand("P1");
        
        Filler = new JLabel("        ");
        panel.add(Filler);
        Filler = new JLabel("        ");
        panel.add(Filler);
        
        
        P2Button = new JButton( "Randomise P2's Pokemon" );
        panel.add( P2Button );
        P2Button.addActionListener(this);
        P2Button.setActionCommand("P2");
    }
	int P1iterate = 0;
	int P2iterate = 0;
	int P1Slot = 1;
	int P2Slot = 1;
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("P1")){
			P1timer = new Timer(100, this);
			P1timer.setActionCommand("P1Timer");
			P1timer.start();
			
		}else if(e.getActionCommand().equals("P2")){
			P2timer = new Timer(100, this);
			P2timer.setActionCommand("P2Timer");
			P2timer.start();
		}else if(e.getActionCommand().equals("P1Timer")){
			if(P1iterate < 20){
				RandompokeP1();
			}else{
				P1iterate = 0;
				if(P1Slot < 6){
					P1Slot += 1;
				}else{
				P1Slot = 1;
				P1timer.stop();
				}
			}
		}else if(e.getActionCommand().equals("P2Timer")){
			if(P2iterate < 20){
				RandompokeP2();
			}else{
				P2iterate = 0;
				if(P2Slot < 6){
					P2Slot += 1;
				}else{
				P2Slot = 1;
				P2timer.stop();
				}
			}	
		}
		
		
	}
	private void RandompokeP2() {
		Random random = new Random();
		int randomInt = random.nextInt(738) + 1;
		if(P2iterate == 19){
			P2Pokenums[P2Slot - 1] = randomInt;
		}
		if(P2Slot == 1){
			P2Pokes1.setIcon(new ImageIcon("src\\Pokemon gifs\\"+ String.format("%03d", randomInt) + ".gif"));
			P2iterate += 1;
			if(P2iterate == 20){
	        P2Pokes1.setComponentPopupMenu(new PkmPopup(P2Pokes1, 1, P2Pokenums[0]));
			}
		}else if(P2Slot == 2){
			P2Pokes2.setIcon(new ImageIcon("src\\Pokemon gifs\\"+ String.format("%03d", randomInt) + ".gif"));
			P2iterate += 1;
			if(P2iterate == 20){
	        P2Pokes2.setComponentPopupMenu(new PkmPopup(P2Pokes2, 2, P2Pokenums[1]));
			}
		}else if(P2Slot == 3){
			P2Pokes3.setIcon(new ImageIcon("src\\Pokemon gifs\\"+ String.format("%03d", randomInt) + ".gif"));
			P2iterate += 1;
			if(P2iterate == 20){
	        P2Pokes3.setComponentPopupMenu(new PkmPopup(P2Pokes3, 3, P2Pokenums[2]));
			}
		}else if(P2Slot == 4){
			P2Pokes4.setIcon(new ImageIcon("src\\Pokemon gifs\\"+ String.format("%03d", randomInt) + ".gif"));
			P2iterate += 1;
			if(P2iterate == 20){
	        P2Pokes4.setComponentPopupMenu(new PkmPopup(P2Pokes4, 4, P2Pokenums[3]));
			}
		}else if(P2Slot == 5){
			P2Pokes5.setIcon(new ImageIcon("src\\Pokemon gifs\\"+ String.format("%03d", randomInt) + ".gif"));
			P2iterate += 1;
			if(P2iterate == 20){
	        P2Pokes5.setComponentPopupMenu(new PkmPopup(P2Pokes5, 5, P2Pokenums[4]));
			}
		}else if(P2Slot == 6){
			P2Pokes6.setIcon(new ImageIcon("src\\Pokemon gifs\\"+ String.format("%03d", randomInt) + ".gif"));
			P2iterate += 1;
			if(P2iterate == 20){
	        P2Pokes6.setComponentPopupMenu(new PkmPopup(P2Pokes6, 6, P2Pokenums[5]));
			}
		}
		
	}
	public void RandompokeP1(){
			Random random = new Random();
			int randomInt = random.nextInt(738) + 1;
			if(P1iterate == 19){
				P1Pokenums[P1Slot - 1] = randomInt;
			}
			if(P1Slot == 1){
				P1Pokes1.setIcon(new ImageIcon("src\\Pokemon gifs\\"+ String.format("%03d", randomInt) + ".gif"));
				P1iterate += 1;
				if(P1iterate == 20){
					P1Pokes1.setComponentPopupMenu(new PkmPopup(P1Pokes1, 1, P1Pokenums[0]));
				}
			}else if(P1Slot == 2){
				P1Pokes2.setIcon(new ImageIcon("src\\Pokemon gifs\\"+ String.format("%03d", randomInt) + ".gif"));
				P1iterate += 1;
				if(P1iterate == 20){
		        P1Pokes2.setComponentPopupMenu(new PkmPopup(P1Pokes2, 2, P1Pokenums[1]));
				}
			}else if(P1Slot == 3){
				P1Pokes3.setIcon(new ImageIcon("src\\Pokemon gifs\\"+ String.format("%03d", randomInt) + ".gif"));
				P1iterate += 1;
				if(P1iterate == 20){
		        P1Pokes3.setComponentPopupMenu(new PkmPopup(P1Pokes3, 3, P1Pokenums[2]));
				}
			}else if(P1Slot == 4){
				P1Pokes4.setIcon(new ImageIcon("src\\Pokemon gifs\\"+ String.format("%03d", randomInt) + ".gif"));
				P1iterate += 1;
				if(P1iterate == 20){
		        P1Pokes4.setComponentPopupMenu(new PkmPopup(P1Pokes4, 4, P1Pokenums[3]));
				}
			}else if(P1Slot == 5){
				P1Pokes5.setIcon(new ImageIcon("src\\Pokemon gifs\\"+ String.format("%03d", randomInt) + ".gif"));
				P1iterate += 1;
				if(P1iterate == 20){
		        P1Pokes5.setComponentPopupMenu(new PkmPopup(P1Pokes5, 5, P1Pokenums[4]));
				}
			}else if(P1Slot == 6){
				P1Pokes6.setIcon(new ImageIcon("src\\Pokemon gifs\\"+ String.format("%03d", randomInt) + ".gif"));
				P1iterate += 1;
				if(P1iterate == 20){
		        P1Pokes6.setComponentPopupMenu(new PkmPopup(P1Pokes6, 6, P1Pokenums[5]));
				}
			}
	}
	
}

