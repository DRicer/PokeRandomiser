

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class FormatFrame extends JFrame implements ActionListener {
    // This class is only a starting point. You may wish to add members and 
    // fields to complete the implementation of this class as per the
    // question on the assignment sheet.
    
    // Constants
    private static final int FRAME_WIDTH = 200;
    private static final int FRAME_HEIGHT = 150;
    
    // Instance variables -- GUI components
    private JPanel panel;
    private JLabel instructionLabel;
	private JComboBox<?> FormatBox;
    private JButton shortenButton;
    
    // Constructor
	public FormatFrame() {
        super();
        
        //
        // Set up the frame
        setSize( FRAME_WIDTH, FRAME_HEIGHT );
        setTitle("Format");
        setLocationRelativeTo(null);
        setResizable(false);
        //
        // Set up the panel and layout manager
        panel = new JPanel();
        FlowLayout grid = new FlowLayout( 5, 5, 5 );  // a one-column layout
        panel.setLayout( grid );
        
        add( panel );  // add panel to the JFrame

        //
        // Set up and add components
        instructionLabel = new JLabel( "Pick a format");
        panel.add( instructionLabel );
        
        instructionLabel = new JLabel( "" );
        instructionLabel.setPreferredSize(new Dimension(50,10));
        panel.add( instructionLabel );
        
        
        String[] FormatString = {"2 Players", "4 Players", "Team Builder"};    
        FormatBox = new JComboBox<Object>(FormatString);
        panel.add( FormatBox );
        
        instructionLabel = new JLabel( "" );
        instructionLabel.setPreferredSize(new Dimension(50,10));
        panel.add( instructionLabel );
        
        shortenButton = new JButton( "Go!" );
        panel.add( shortenButton );
        shortenButton.setActionCommand(FormatString[FormatBox.getSelectedIndex()]);
        shortenButton.addActionListener(this);
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		if(FormatBox.getSelectedItem().equals("2 Players")){
			JFrame Frame = new SinglesFrame();
			Frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	        Frame.setVisible( true );
	        setVisible(false);
		}else if(FormatBox.getSelectedItem().equals("4 Players")){
			JFrame Frame = new DoublesFrame();
			Frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	        Frame.setVisible( true );
	        setVisible(false);
		}else if(FormatBox.getSelectedItem().equals("Team Builder")){
			JFrame Frame = new TeamBuilderFrame();
			Frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	        Frame.setVisible( true );
	        setVisible(false);
		}
		
		
	}
}

