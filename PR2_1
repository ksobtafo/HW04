import java.awt.*;
import java.io.*;
import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.util.Scanner;
import java.util.Random;
import java.net.URL;
import java.util.ArrayList;
public class proj1 extends JFrame{

	private JFrame frame;
	private final JButton button = new JButton("New button");
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					proj1 window = new proj1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public proj1() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 910, 377);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Okay !");
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
                // put class here after 
			}
		});
		btnNewButton.setBounds(795, 144, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		label_2 = new JLabel("");
		label_2.setBounds(10, 69, 149, 204);
		frame.getContentPane().add(label_2);
		Image img = new ImageIcon(this.getClass().getResource("side1.png")).getImage();
		label_2.setIcon(new ImageIcon(img));

///////////////////////////////////////////
        Mixer[] mx1 = new Mixer[5];
        for (int i =0; i<mx1.length; i++)
        {
            JLabel l1 = new JLabel();
            mx1[i] = new Mixer(l1);
            this.add(l1); 
        }
////////////////////////////////////////////
         this.setVisible(true); 

         for (int i =0; i< mx1.length;i++)
         {
             Thread t = new Thread(mx1[i]);
             t.start();
             try {
                 Thread.sleep(100);
             }
             catch (InterruptedException ex) {;}
         }
////////////////////////////////////////////

		label_3 = new JLabel("");
		label_3.setBounds(169, 69, 149, 204);
		frame.getContentPane().add(label_3);
		Image img1 = new ImageIcon(this.getClass().getResource("side2.png")).getImage();
		label_3.setIcon(new ImageIcon(img1));
		
		label_4 = new JLabel("");
		label_4.setBounds(328, 69, 133, 204);
		frame.getContentPane().add(label_4);
		Image img2 = new ImageIcon(this.getClass().getResource("side3.png")).getImage();
		label_4.setIcon(new ImageIcon(img2));
		
		label_5 = new JLabel("");
		label_5.setBounds(471, 69, 140, 204);
		frame.getContentPane().add(label_5);
		Image img3 = new ImageIcon(this.getClass().getResource("side4.png")).getImage();
		label_5.setIcon(new ImageIcon(img3));
		
		label_6 = new JLabel("");
		label_6.setBounds(621, 69, 149, 204);
		frame.getContentPane().add(label_6);
		Image img4 = new ImageIcon(this.getClass().getResource("side5.png")).getImage();
		label_6.setIcon(new ImageIcon(img4));

        // array of images
        ArrayList<Image> ImArr = new ArrayList<Image>();
        ImArr.add(img);
        ImArr.add(img1);
        ImArr.add(img2);
        ImArr.add(img3);
        ImArr.add(img4);
       
	}
    
   

    class Mixer extends proj1 implements Runnable  {
    
        proj1 p = new proj1();
        private JLabel _label;
	
        public Mixer (JLabel label)
        {
            _label = label;
        }

    public void run() {
    
for (int i=0; i<6; i++ )
{
	Random rand = new Random();
	int num = rand.nextInt(6)+1;
   	 //try this instead
  	 //_label.setImage(ImArr.get(num));
  label_2.setIcon(new ImageIcon(ImArr.get(num)));
  label_3.setIcon(new ImageIcon(ImArr.get(num)));
  label_4.setIcon(new ImageIcon(ImArr.get(num)));
   label_5.setIcon(new ImageIcon(ImArr.get(num)));
   label_6.setIcon(new ImageIcon(ImArr.get(num)));
   
    try {
        Thread.sleep(1000);
        }   
    catch (InterruptedException ex) {;}
}

   // _label.setImage(img);
   label_6.setImage(new ImageIcon(img));

                    }
    }
}


//output random images 
