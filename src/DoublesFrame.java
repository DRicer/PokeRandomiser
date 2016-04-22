
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.Timer;

import java.util.Random;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class DoublesFrame extends JFrame implements ActionListener {
    // This class is only a starting point. You may wish to add members and 
    // fields to complete the implementation of this class as per the
    // question on the assignment sheet.
    
    // Constants
    private static final int FRAME_WIDTH = 840;
    private static final int FRAME_HEIGHT = 840;
    
    // Instance variables -- GUI components
    private JPanel panel;
    private JLabel Title;
    private JLabel P1PokesLabel;
    private JLabel P2PokesLabel;
    private JLabel P3PokesLabel;
    private JLabel P4PokesLabel;
    private JLabel P1Pokes1;
    private JLabel P1Pokes2;
    private JLabel P1Pokes3;
    private JLabel P3Pokes1;
    private JLabel P3Pokes2;
    private JLabel P3Pokes3;
    private JLabel P2Pokes1;
    private JLabel P2Pokes2;
    private JLabel P2Pokes3;
    private JLabel P4Pokes1;
    private JLabel P4Pokes2;
    private JLabel P4Pokes3;
    private JLabel Filler;
    private JButton P1Button;
    private JButton P2Button;
    private JButton P3Button;
    private JButton P4Button;
    private JButton Back;
    private Timer P1timer;
    private Timer P2timer;
    private Timer P3timer;
    private Timer P4timer;
    public int P1Pokenums[];
    public int P2Pokenums[];
    public int P3Pokenums[];
    public int P4Pokenums[];
    // Constructor
	public DoublesFrame() {
        super();
        
        //
        // Set up the frame
        setSize( FRAME_WIDTH, FRAME_HEIGHT );
        setTitle("4P Randomiser");
        setLocationRelativeTo(null);
        setResizable(false);
        //
        // Set up the panel and layout manager
        panel = new JPanel();
        FlowLayout grid = new FlowLayout( 5, 5, 5 );  // a one-column layout
        panel.setLayout( grid );
        add( panel );  // add panel to the JFrame
        
        P1Pokenums = new int[3];
        P2Pokenums = new int[3];
        P3Pokenums = new int[3];
        P4Pokenums = new int[3];
        //
        // Set up and add components
        
        Back = new JButton("< Back");
        panel.add(Back);
        Back.addActionListener(this);
        Back.setActionCommand("back");
        
        Filler = new JLabel("        ");
        Filler.setPreferredSize(new Dimension(250,50));
        panel.add(Filler);
        
        Title = new JLabel("4P Pokemon Randomiser");
        
        panel.add(Title);
        
        Filler = new JLabel("        ");
        Filler.setPreferredSize(new Dimension(340,50));
        panel.add(Filler);
        
        P1PokesLabel = new JLabel( "P1:" );
        panel.add(P1PokesLabel);
        
        Filler = new JLabel("        ");
        Filler.setPreferredSize(new Dimension(490,50));
        panel.add(Filler);
        
        P2PokesLabel = new JLabel("P2:");
        panel.add(P2PokesLabel);
        
        Filler = new JLabel("        ");
        Filler.setPreferredSize(new Dimension(200,50));
        panel.add(Filler);
        
        ImageIcon icon = new ImageIcon("src\\Default.bmp");
        P1Pokes1 = new JLabel(icon, JLabel.CENTER);
        P1Pokes1.setPreferredSize(new Dimension(150,150));
        panel.add(P1Pokes1);
        P1Pokes2 = new JLabel(icon, JLabel.CENTER);
        P1Pokes2.setPreferredSize(new Dimension(150,150));
        panel.add(P1Pokes2);
        
        Filler = new JLabel("        ");
        Filler.setPreferredSize(new Dimension(200,150));
        panel.add(Filler);
        
        P2Pokes1 = new JLabel(icon, JLabel.CENTER);
        P2Pokes1.setPreferredSize(new Dimension(150,150));
        panel.add(P2Pokes1);
        P2Pokes2 = new JLabel(icon, JLabel.CENTER);
        P2Pokes2.setPreferredSize(new Dimension(150,150));
        panel.add(P2Pokes2);
        
        P1Pokes3 = new JLabel(icon, JLabel.CENTER);
        P1Pokes3.setPreferredSize(new Dimension(150,150));
        panel.add(P1Pokes3);
        
        P1Button = new JButton( "Randomise P1's Pokemon" );
        P1Button.setSize(new Dimension(20, 20));
        panel.add( P1Button );
        P1Button.setSize(new Dimension(20, 20));
        P1Button.addActionListener(this);
        P1Button.setActionCommand("P1");
        
        Filler = new JLabel("        ");
        panel.add(Filler);
        Filler.setPreferredSize(new Dimension(134,50));
        
        
        P2Button = new JButton( "Randomise P2's Pokemon" );
        panel.add( P2Button );
        P2Button.addActionListener(this);
        P2Button.setActionCommand("P2");
        
        P2Pokes3 = new JLabel(icon, JLabel.CENTER);
        P2Pokes3.setPreferredSize(new Dimension(150,150));
        panel.add(P2Pokes3);
        
        
        P3PokesLabel = new JLabel( "P3:" );
        panel.add(P3PokesLabel);
        
        Filler = new JLabel("        ");
        Filler.setPreferredSize(new Dimension(490,50));
        panel.add(Filler);
        
        P4PokesLabel = new JLabel("P4:");
        panel.add(P4PokesLabel);
        
        Filler = new JLabel("        ");
        Filler.setPreferredSize(new Dimension(200,50));
        panel.add(Filler);
       
        P3Pokes1 = new JLabel(icon, JLabel.CENTER);
        P3Pokes1.setPreferredSize(new Dimension(150,150));
        panel.add(P3Pokes1);
        
        P3Button = new JButton( "Randomise P3's Pokemon" );
        P3Button.setSize(new Dimension(20, 20));
        panel.add( P3Button );
        P3Button.setSize(new Dimension(20, 20));
        P3Button.addActionListener(this);
        P3Button.setActionCommand("P3");
        
        Filler = new JLabel("        ");
        panel.add(Filler);
        Filler.setPreferredSize(new Dimension(134,50));
        
        
        P4Button = new JButton( "Randomise P4's Pokemon" );
        panel.add( P4Button );
        P4Button.addActionListener(this);
        P4Button.setActionCommand("P4");
        
        P4Pokes1 = new JLabel(icon, JLabel.CENTER);
        P4Pokes1.setPreferredSize(new Dimension(150,150));
        panel.add(P4Pokes1);
        
        P3Pokes2 = new JLabel(icon, JLabel.CENTER);
        P3Pokes2.setPreferredSize(new Dimension(150,150));
        panel.add(P3Pokes2);
        P3Pokes3 = new JLabel(icon, JLabel.CENTER);
        P3Pokes3.setPreferredSize(new Dimension(150,150));
        panel.add(P3Pokes3);
        
        Filler = new JLabel("        ");
        Filler.setPreferredSize(new Dimension(200,150));
        panel.add(Filler);
        
        P4Pokes2 = new JLabel(icon, JLabel.CENTER);
        P4Pokes2.setPreferredSize(new Dimension(150,150));
        panel.add(P4Pokes2);
        P4Pokes3 = new JLabel(icon, JLabel.CENTER);
        P4Pokes3.setPreferredSize(new Dimension(150,150));
        panel.add(P4Pokes3);
        
        P1Pokes1.setBorder(BorderFactory.createLineBorder(Color.black));
        P1Pokes2.setBorder(BorderFactory.createLineBorder(Color.black));
        P1Pokes3.setBorder(BorderFactory.createLineBorder(Color.black));
        P3Pokes1.setBorder(BorderFactory.createLineBorder(Color.black));
        P3Pokes2.setBorder(BorderFactory.createLineBorder(Color.black));
        P3Pokes3.setBorder(BorderFactory.createLineBorder(Color.black));
        
        
        
        P2Pokes1.setBorder(BorderFactory.createLineBorder(Color.black));
        P2Pokes2.setBorder(BorderFactory.createLineBorder(Color.black));
        P2Pokes3.setBorder(BorderFactory.createLineBorder(Color.black));
        P4Pokes1.setBorder(BorderFactory.createLineBorder(Color.black));
        P4Pokes2.setBorder(BorderFactory.createLineBorder(Color.black));
        P4Pokes3.setBorder(BorderFactory.createLineBorder(Color.black));
        
        Filler = new JLabel("        ");
        panel.add(Filler);
        Filler.setPreferredSize(new Dimension(58,50));
        
        
    }
	int P1iterate = 0;
	int P2iterate = 0;
	int P3iterate = 0;
	int P4iterate = 0;
	int P1Slot = 1;
	int P2Slot = 1;
	int P3Slot = 1;
	int P4Slot = 1;
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("P1")){
			P1Button.setEnabled(false);
			P1timer = new Timer(100, this);
			P1timer.setActionCommand("P1Timer");
			P1timer.start();
			
		}else if(e.getActionCommand().equals("P2")){
			P2Button.setEnabled(false);
			P2timer = new Timer(100, this);
			P2timer.setActionCommand("P2Timer");
			P2timer.start();
		}else if(e.getActionCommand().equals("P3")){
			P3Button.setEnabled(false);
			P3timer = new Timer(100, this);
			P3timer.setActionCommand("P3Timer");
			P3timer.start();
		}else if(e.getActionCommand().equals("P4")){
			P4Button.setEnabled(false);
			P4timer = new Timer(100, this);
			P4timer.setActionCommand("P4Timer");
			P4timer.start();
		}else if(e.getActionCommand().equals("P1Timer")){
			if(P1iterate < 20){
				RandompokeP1();
			}else{
				P1iterate = 0;
				if(P1Slot < 3){
					P1Slot += 1;
				}else{
				P1Slot = 1;
				P1timer.stop();
				P1Button.setEnabled(true);
				}
			}
		}else if(e.getActionCommand().equals("P2Timer")){
			if(P2iterate < 20){
				RandompokeP2();
			}else{
				P2iterate = 0;
				if(P2Slot < 3){
					P2Slot += 1;
				}else{
				P2Slot = 1;
				P2timer.stop();
				P2Button.setEnabled(true);
				}
			}	
		}else if(e.getActionCommand().equals("P3Timer")){
			if(P3iterate < 20){
				RandompokeP3();
			}else{
				P3iterate = 0;
				if(P3Slot < 3){
					P3Slot += 1;
				}else{
				P3Slot = 1;
				P3timer.stop();
				P3Button.setEnabled(true);
				}
			}	
		}else if(e.getActionCommand().equals("P4Timer")){
			if(P4iterate < 20){
				RandompokeP4();
			}else{
				P4iterate = 0;
				if(P4Slot < 3){
					P4Slot += 1;
				}else{
				P4Slot = 1;
				P4timer.stop();
				P4Button.setEnabled(true);
				}
			}	
		}else if(e.getActionCommand().equals("back")){
			JFrame Frame = new FormatFrame();
			Frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	        Frame.setVisible( true );
	        setVisible(false);
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
			}
	}
	public void RandompokeP3(){
		Random random = new Random();
		int randomInt = random.nextInt(738) + 1;
		if(P3iterate == 19){
			P3Pokenums[P3Slot - 1] = randomInt;
		}
		if(P3Slot == 1){
			P3Pokes1.setIcon(new ImageIcon("src\\Pokemon gifs\\"+ String.format("%03d", randomInt) + ".gif"));
			P3iterate += 1;
			if(P3iterate == 20){
				P3Pokes1.setComponentPopupMenu(new PkmPopup(P3Pokes1, 1, P3Pokenums[0]));
			}
		}else if(P3Slot == 2){
			P3Pokes2.setIcon(new ImageIcon("src\\Pokemon gifs\\"+ String.format("%03d", randomInt) + ".gif"));
			P3iterate += 1;
			if(P3iterate == 20){
	        P3Pokes2.setComponentPopupMenu(new PkmPopup(P3Pokes2, 2, P3Pokenums[1]));
			}
		}else if(P3Slot == 3){
			P3Pokes3.setIcon(new ImageIcon("src\\Pokemon gifs\\"+ String.format("%03d", randomInt) + ".gif"));
			P3iterate += 1;
			if(P3iterate == 20){
	        P3Pokes3.setComponentPopupMenu(new PkmPopup(P3Pokes3, 3, P3Pokenums[2]));
			}
		}
}
	public void RandompokeP4(){
		Random random = new Random();
		int randomInt = random.nextInt(738) + 1;
		if(P4iterate == 19){
			P4Pokenums[P4Slot - 1] = randomInt;
		}
		if(P4Slot == 1){
			P4Pokes1.setIcon(new ImageIcon("src\\Pokemon gifs\\"+ String.format("%03d", randomInt) + ".gif"));
			P4iterate += 1;
			if(P4iterate == 20){
				P4Pokes1.setComponentPopupMenu(new PkmPopup(P4Pokes1, 1, P4Pokenums[0]));
			}
		}else if(P4Slot == 2){
			P4Pokes2.setIcon(new ImageIcon("src\\Pokemon gifs\\"+ String.format("%03d", randomInt) + ".gif"));
			P4iterate += 1;
			if(P4iterate == 20){
	        P4Pokes2.setComponentPopupMenu(new PkmPopup(P4Pokes2, 2, P4Pokenums[1]));
			}
		}else if(P4Slot == 3){
			P4Pokes3.setIcon(new ImageIcon("src\\Pokemon gifs\\"+ String.format("%03d", randomInt) + ".gif"));
			P4iterate += 1;
			if(P4iterate == 20){
	        P4Pokes3.setComponentPopupMenu(new PkmPopup(P4Pokes3, 3, P4Pokenums[2]));
			}
		}
}
	
}

