
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class DoublesFrame extends JFrame implements ActionListener {
    // This class is only a starting point. You may wish to add members and 
    // fields to complete the implementation of this class as per the
    // question on the assignment sheet.
    
    // Constants
    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 260;
    
    // Instance variables -- GUI components
    private JPanel panel;
    private JLabel instructionLabel;
	private JComboBox<?> FormatBox;
    private JButton shortenButton;
    
    // Constructor
	public DoublesFrame() {
        super();
        
        //
        // Set up the frame
        setSize( FRAME_WIDTH, FRAME_HEIGHT );
        
        //
        // Set up the panel and layout manager
        panel = new JPanel();
        GridLayout grid = new GridLayout( 0, 1 );  // a one-column layout
        panel.setLayout( grid );
        
        add( panel );  // add panel to the JFrame

        //
        // Set up and add components
        instructionLabel = new JLabel( "Pick a format" );
        instructionLabel.setIcon(new ImageIcon("src\\Pokemon gifs\\"+ String.format("%03d", 342) + ".gif"));
        panel.add( instructionLabel );
        
        
        String[] FormatString = {"Singles", "2P Doubles", "4P Doubles", "Triples", "Rotation" };    
        FormatBox = new JComboBox<Object>(FormatString);
        panel.add( FormatBox );
        
        shortenButton = new JButton( "Go!" );
        panel.add( shortenButton );
        shortenButton.setActionCommand(FormatString[FormatBox.getSelectedIndex()]);
        shortenButton.addActionListener(this);
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Singles")){
			
		}else if(e.getActionCommand().equals("2P Doubles")){
			
		}else if(e.getActionCommand().equals("4P Doubles")){
			
		}else if(e.getActionCommand().equals("Triples")){
			
		}else{
			
		}
		
		
	}
}

