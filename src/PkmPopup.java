import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.Timer;


@SuppressWarnings("serial")
public class PkmPopup extends JPopupMenu implements ActionListener {
	    JMenuItem btnReRoll;
	    JMenu btnEvolve;
	    JMenuItem btnDevolve;
	    Timer timer;
	    JLabel RerollSlot;
	    int iterate = 0;
	    int Evolvable[][];
	    int Devolvable[][];
	    
	    public PkmPopup(JLabel Slot, int Slotnum, int Dexnum){
	    	Evolvable = new int[337][9];
	    	Devolvable = new int[354][2];
	    	GetEvolvable();
	    	GetDevolvable();
	        RerollSlot = Slot;
	        btnReRoll = new JMenuItem("ReRoll");
	        add(btnReRoll);

	        if( Dexnum != 0){
	        	for(int i = 0; i < Devolvable.length; ++i){
		        	if(Devolvable[i][0] == Dexnum ){
		        		
		    	        btnDevolve = new JMenu("Devolve");
		    	        add(btnDevolve);
		    	        
		        		JMenuItem Poke1 = new JMenuItem("");
		        		btnDevolve.add(Poke1);
		        		
		        		Poke1.addActionListener(this);
		        		Poke1.setActionCommand("" + Devolvable[i][1]);
		        		Poke1.setIcon(new ImageIcon("src\\Pokemon gifs\\"+ String.format("%03d", Devolvable[i][1]) + ".gif"));
		        		
		        		}
		        	}
		        }
		        for(int i = 0; i < Evolvable.length; ++i){
		        	if(Evolvable[i][0] == Dexnum ){
	        		
		        		btnEvolve = new JMenu("Evolve");
		        		add(btnEvolve);
	    	        
		        		JMenuItem Poke1 = new JMenuItem("");
		        		btnEvolve.add(Poke1);
	        		
	        		Poke1.addActionListener(this);
	        		Poke1.setActionCommand("" + Evolvable[i][1]);
	        		Poke1.setIcon(new ImageIcon("src\\Pokemon gifs\\"+ String.format("%03d", Evolvable[i][1]) + ".gif"));
	        		
	        		if( Evolvable[i][2] > 0){
	        			
		        		JMenuItem Poke2 = new JMenuItem("");
		        		btnEvolve.add(Poke2);
		        		
		        		Poke2.addActionListener(this);
		        		Poke2.setActionCommand("" + Evolvable[i][2]);
		        		Poke2.setIcon(new ImageIcon("src\\Pokemon gifs\\"+ String.format("%03d", Evolvable[i][2]) + ".gif"));
		        		
		        		if( Evolvable[i][3] > 0){
		        			
			        		JMenuItem Poke3 = new JMenuItem("");
			        		btnEvolve.add(Poke3);
			        		
			        		Poke3.addActionListener(this);
			        		Poke3.setActionCommand("" + Evolvable[i][3]);
			        		Poke3.setIcon(new ImageIcon("src\\Pokemon gifs\\"+ String.format("%03d", Evolvable[i][3]) + ".gif"));
			        		
			        		if( Evolvable[i][4] > 0){
			        			
				        		JMenuItem Poke4 = new JMenuItem("");
				        		btnEvolve.add(Poke4);
				        		
				        		Poke4.addActionListener(this);
				        		Poke4.setActionCommand("" + Evolvable[i][4]);
				        		Poke4.setIcon(new ImageIcon("src\\Pokemon gifs\\"+ String.format("%03d", Evolvable[i][4]) + ".gif"));
				        		
				        		if( Evolvable[i][5] > 0){
				        			
					        		JMenuItem Poke5 = new JMenuItem("");
					        		btnEvolve.add(Poke5);
					        		
					        		Poke5.addActionListener(this);
					        		Poke5.setActionCommand("" + Evolvable[i][5]);
					        		Poke5.setIcon(new ImageIcon("src\\Pokemon gifs\\"+ String.format("%03d", Evolvable[i][5]) + ".gif"));
					        		
					        		if( Evolvable[i][6] > 0){
					        			
						        		JMenuItem Poke6 = new JMenuItem("");
						        		btnEvolve.add(Poke6);
						        		
						        		Poke6.addActionListener(this);
						        		Poke6.setActionCommand("" + Evolvable[i][6]);
						        		Poke6.setIcon(new ImageIcon("src\\Pokemon gifs\\"+ String.format("%03d", Evolvable[i][6]) + ".gif"));
						        		
						        		if( Evolvable[i][7] > 0){
						        			
							        		JMenuItem Poke7 = new JMenuItem("");
							        		btnEvolve.add(Poke7);
							        		
							        		Poke7.addActionListener(this);
							        		Poke7.setActionCommand("" + Evolvable[i][1]);
							        		Poke7.setIcon(new ImageIcon("src\\Pokemon gifs\\"+ String.format("%03d", Evolvable[i][7]) + ".gif"));
							        		
							        		if( Evolvable[i][8] > 0){
							        			
								        		JMenuItem Poke8 = new JMenuItem("");
								        		btnEvolve.add(Poke8);
								        		
								        		Poke8.addActionListener(this);
								        		Poke8.setActionCommand("" + Evolvable[i][1]);
								        		Poke8.setIcon(new ImageIcon("src\\Pokemon gifs\\"+ String.format("%03d", Evolvable[i][8]) + ".gif"));
								        		
							        		}
						        		}
					        		}
				        		}
			        		}
		        		}
	        		}
	        	}
	        }

	        btnReRoll.addActionListener(this);
	        btnReRoll.setActionCommand("ReRoll");
	    }
	        
	    public void actionPerformed(ActionEvent e) {
	    	if( e.getActionCommand().equals("ReRoll")){
	    		timer = new Timer(100, this);
				timer.setActionCommand("timer");
				timer.start();
	    	}else if(e.getActionCommand().equals("Devolve")){
	    		
	    	}else if(e.getActionCommand().equals("timer")){
	    		if(iterate < 20){
					RerollPoke();
				}else{
					iterate = 0;
					timer.stop();
					}
			}else{
				RerollSlot.setIcon(new ImageIcon("src\\Pokemon gifs\\"+ String.format("%03d", Integer.parseInt(e.getActionCommand())) + ".gif"));
				RerollSlot.setComponentPopupMenu(new PkmPopup(RerollSlot, 1, Integer.parseInt(e.getActionCommand())));
			}
	    }
	    
	    
	    public void RerollPoke(){
			Random random = new Random();
			int randomInt = random.nextInt(738) + 1;
			if(iterate == 19){
				RerollSlot.setComponentPopupMenu(new PkmPopup(RerollSlot, 1, randomInt));
			}
				RerollSlot.setIcon(new ImageIcon("src\\Pokemon gifs\\"+ String.format("%03d", randomInt) + ".gif"));
				iterate += 1;
	}
	    
	    
		public void GetEvolvable(){
			try {
				FileReader reader = new FileReader("evolutions.txt");
				BufferedReader in = new BufferedReader( reader );
				String Line;
				int i = 0;
				while ((Line = in.readLine()) != null){
					String Lines[] = Line.split(",");
					int k = 0;
					while( k < (Lines.length)){
						Evolvable[i][k] = Integer.parseInt(Lines[k]);
						++k;
					}
					i += 1;
				}
				in.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
		
		public void GetDevolvable(){
			try {
				FileReader reader = new FileReader("devolutions.txt");
				BufferedReader in = new BufferedReader( reader );
				String Line;
				int i = 0;
				while ((Line = in.readLine()) != null){
					String Lines[] = Line.split(",");
					int k = 0;
					while( k < (Lines.length)){
						Devolvable[i][k] = Integer.parseInt(Lines[k]);
						++k;
					}
					i += 1;
				}
				in.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
}

