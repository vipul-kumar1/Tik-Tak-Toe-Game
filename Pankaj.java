import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

class Games implements ActionListener
{
    Frame f1;
    JLabel l1,l2;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;
    Panel p1,p2,p3;
    ButtonGroup g1;
    JRadioButton o1,o2;
    JComboBox cb1;
    int player1,player2,count=0;

    Font h2 = new Font("Arial",Font.BOLD,28);
    Games()
    {
        Font h1 = new Font("Arial",Font.BOLD,24);
        

        f1 = new Frame("Game");
        l1 = new JLabel("TIC-TOE GAME");

        g1 = new ButtonGroup();

        cb1=new JComboBox();

        o1 = new JRadioButton("player 1",true);
        o2 = new JRadioButton("player 2",false);

        g1.add(o1);
        g1.add(o2);

        b1 = new JButton();
        b2 = new JButton();
        b3 = new JButton();
        b4 = new JButton();
        b5 = new JButton();
        b6 = new JButton();
        b7 = new JButton();
        b8 = new JButton();
        b9 = new JButton();
        b10= new JButton("Exit");
        b11= new JButton("RESTART");

        p1 = new Panel();
        p2 = new Panel();
        p3 = new Panel();

        l2 = new JLabel("");

        player1=1;
        player2=0;

    
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);


        f1.setLayout(null);
        p1.setBounds(0,0,360,140);
        p1.setLayout(null);
        p1.setBackground(Color.red);
        l1.setFont(h1);
        l1.setBounds(90,30,250,30);
        p1.add(l1);
        f1.add(p1);
        
        p2.setLayout(null);
        p2.setBackground(Color.blue);
        p2.setBounds(0,142,360,320);
        b1.setBounds(30,25,80,80);
        b1.setBackground(Color.gray);
        b2.setBounds(140,25,80,80);
        b2.setBackground(Color.gray);
        b3.setBounds(250,25,80,80);
        b3.setBackground(Color.gray);
        b4.setBounds(30,125,80,80);
        b4.setBackground(Color.gray);
        b5.setBounds(140,125,80,80);
        b5.setBackground(Color.gray);
        b6.setBounds(250,125,80,80);
        b6.setBackground(Color.gray);
        b7.setBounds(30,225,80,80);
        b7.setBackground(Color.gray);
        b8.setBounds(140,225,80,80);
        b8.setBackground(Color.gray);
        b9.setBounds(250,225,80,80);
        b9.setBackground(Color.gray);
        p2.add(b1);p2.add(b4);
        p2.add(b2);p2.add(b5);
        p2.add(b3);p2.add(b6);
        p2.add(b7);p2.add(b8);
        p2.add(b9);f1.add(p2);

        p3.setLayout(null);
        p3.setBounds(0,465,360,160);
        
        o1.setBounds(20,10,120,40);
        o2.setBounds(220,10,120,40);

        l2.setFont(h1);
        l2.setBounds(95,60,200,35);
        l2.setForeground(Color.blue);
        p3.setBackground(Color.red);
        p3.add(o1);p3.add(o2);
        p3.add(l2);

        b10.setBounds(60,110,100,40);
        b11.setBounds(220,110,100,40);
        b1.setBorder(BorderFactory.createLineBorder(Color.pink));
        b2.setBorder(BorderFactory.createLineBorder(Color.pink));
        b3.setBorder(BorderFactory.createLineBorder(Color.pink));
        b4.setBorder(BorderFactory.createLineBorder(Color.pink));
        b5.setBorder(BorderFactory.createLineBorder(Color.pink));
        b6.setBorder(BorderFactory.createLineBorder(Color.pink));
        b7.setBorder(BorderFactory.createLineBorder(Color.pink));
        b8.setBorder(BorderFactory.createLineBorder(Color.pink));
        b9.setBorder(BorderFactory.createLineBorder(Color.pink));

        p3.add(b10);
        p3.add(b11);
        f1.add(p3);
        f1.setSize(370,640);
        
    }
    void display()
    {
        f1.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
     
     if(e.getSource() == b10)
     {
      f1.dispose();
     }
     else if(e.getSource()==b11)
      {
       b1.setBackground(Color.gray);
       b2.setBackground(Color.gray);
       b3.setBackground(Color.gray);
       b4.setBackground(Color.gray);
       b5.setBackground(Color.gray);
       b6.setBackground(Color.gray);
       b7.setBackground(Color.gray);
       b8.setBackground(Color.gray);
       b9.setBackground(Color.gray);
       b1.setEnabled(true);
       b2.setEnabled(true);
       b3.setEnabled(true);
       b4.setEnabled(true);
       b5.setEnabled(true);
       b6.setEnabled(true);
       b7.setEnabled(true);
       b8.setEnabled(true);
       b9.setEnabled(true);
       b1.setText(null);
       b2.setText(null);
       b3.setText(null);
       b4.setText(null);
       b5.setText(null);
       b6.setText(null);
       b7.setText(null);
       b8.setText(null);
       b9.setText(null);
       count=0;
       l2.setText(null);
       }
       else{}
     
      
      if (o1.isSelected()== true)
        {
        if (e.getSource()==b1 && b1.getBackground()==Color.gray)
        {
            b1.setBackground(Color.red);
            b1.setFont(h2);
            b1.setText("X");
            if((b1.getBackground()==Color.red && b2.getBackground()==Color.red && b3.getBackground()==Color.red) || 
            (b1.getBackground()==Color.red && b5.getBackground()==Color.red && b9.getBackground()==Color.red) ||
            (b1.getBackground()==Color.red && b4.getBackground()==Color.red && b6.getBackground()==Color.red))
            {
                l2.setText("Player 1 is winner");
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);
                b7.setEnabled(false);
                b8.setEnabled(false);
                b9.setEnabled(false);
            }
            count++;
            o2.setSelected(true);
            o1.setSelected(false);

        }
        else if (e.getSource()==b2 && b2.getBackground()==Color.gray)
        {
            b2.setBackground(Color.red);
            b2.setText("X");
            b2.setFont(h2);
            if((b1.getBackground()==Color.red && b2.getBackground()==Color.red && b3.getBackground()==Color.red) || 
            (b2.getBackground()==Color.red && b5.getBackground()==Color.red && b8.getBackground()==Color.red))
            {
                l2.setText("Player 1 is winner");

                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);
                b7.setEnabled(false);
                b8.setEnabled(false);
                b9.setEnabled(false);
            }
           
            count++;
            o2.setSelected(true);
            o1.setSelected(false);
        }
        else if (e.getSource()==b3 && b3.getBackground()==Color.gray)
        {
            b3.setBackground(Color.red);
            b3.setText("X");
            b3.setFont(h2);
            if((b3.getBackground()==Color.red && b2.getBackground()==Color.red && b1.getBackground()==Color.red) || 
            (b3.getBackground()==Color.red && b6.getBackground()==Color.red && b9.getBackground()==Color.red) ||
            (b3.getBackground()==Color.red && b5.getBackground()==Color.red && b7.getBackground()==Color.red))
            {
                l2.setText("Player 1 is winner");

                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);
                b7.setEnabled(false);
                b8.setEnabled(false);
                b9.setEnabled(false);
            }
            
            count++;
            o2.setSelected(true);
            o1.setSelected(false);
        }
         else if (e.getSource()==b4 && b4.getBackground()==Color.gray)
        {
            b4.setBackground(Color.red);
            b4.setText("X");
            b4.setFont(h2);
            if((b1.getBackground()==Color.red && b4.getBackground()==Color.red && b7.getBackground()==Color.red) || 
            (b4.getBackground()==Color.red && b5.getBackground()==Color.red && b6.getBackground()==Color.red) )
            {
                l2.setText("Player 1 is winner");

                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);
                b7.setEnabled(false);
                b8.setEnabled(false);
                b9.setEnabled(false);
            }
           
            count++;
            o2.setSelected(true);
            o1.setSelected(false);
        }
        else if (e.getSource()==b5 && b5.getBackground()==Color.gray)
        {
            b5.setBackground(Color.red);
            b5.setText("X");
            b5.setFont(h2);
            if((b1.getBackground()==Color.red && b5.getBackground()==Color.red && b9.getBackground()==Color.red) || 
            (b4.getBackground()==Color.red && b5.getBackground()==Color.red && b6.getBackground()==Color.red) ||
            (b2.getBackground()==Color.red && b5.getBackground()==Color.red && b8.getBackground()==Color.red)||
            (b3.getBackground()==Color.red && b5.getBackground()==Color.red && b7.getBackground()==Color.red))
            {
                l2.setText("Player 1 is winner");

                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);
                b7.setEnabled(false);
                b8.setEnabled(false);
                b9.setEnabled(false);
            }
           
            count++;
            o2.setSelected(true);
            o1.setSelected(false);
        }
        else if (e.getSource()==b6 && b6.getBackground()==Color.gray)
        {
            b6.setBackground(Color.red);
            b6.setText("X");
            b6.setFont(h2);
            if((b3.getBackground()==Color.red && b6.getBackground()==Color.red && b9.getBackground()==Color.red) || 
            (b4.getBackground()==Color.red && b5.getBackground()==Color.red && b6.getBackground()==Color.red) )
            {
                l2.setText("Player 1 is winner");
                
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);
                b7.setEnabled(false);
                b8.setEnabled(false);
                b9.setEnabled(false);
            }
           
            count++;
            o2.setSelected(true);
            o1.setSelected(false);
        }
        else if (e.getSource()==b7 && b7.getBackground()==Color.gray)
        {
            b7.setBackground(Color.red);
            b7.setText("X");
            b7.setFont(h2);
            if((b7.getBackground()==Color.red && b5.getBackground()==Color.red && b3.getBackground()==Color.red) || 
            (b7.getBackground()==Color.red && b4.getBackground()==Color.red && b1.getBackground()==Color.red) ||
            (b7.getBackground()==Color.red && b8.getBackground()==Color.red && b9.getBackground()==Color.red))
            {
                l2.setText("Player 1 is winner");
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);
                b7.setEnabled(false);
                b8.setEnabled(false);
                b9.setEnabled(false);
            }
            
            count++;
            o2.setSelected(true);
            o1.setSelected(false);
        }
        else if (e.getSource()==b8 && b8.getBackground()==Color.gray)
        {
            b8.setBackground(Color.red);
            b8.setText("X");
            b8.setFont(h2);
            if((b8.getBackground()==Color.red && b5.getBackground()==Color.red && b2.getBackground()==Color.red) || 
            (b7.getBackground()==Color.red && b8.getBackground()==Color.red && b9.getBackground()==Color.red) )
            {
                l2.setText("Player 1 is winner");
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);
                b7.setEnabled(false);
                b8.setEnabled(false);
                b9.setEnabled(false);
            }
            
            count++;
            o2.setSelected(true);
            o1.setSelected(false);
        }
        else if (e.getSource()==b9 && b9.getBackground()==Color.gray)
        {
            b9.setBackground(Color.red);
            b9.setText("X");
            b9.setFont(h2);
            if((b9.getBackground()==Color.red && b5.getBackground()==Color.red && b1.getBackground()==Color.red) || 
            (b9.getBackground()==Color.red && b6.getBackground()==Color.red && b3.getBackground()==Color.red) ||
            (b9.getBackground()==Color.red && b8.getBackground()==Color.red && b7.getBackground()==Color.red))
            {
                l2.setText("Player 1 is winner");
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);
                b7.setEnabled(false);
                b8.setEnabled(false);
                b9.setEnabled(false);
            }
            
            count++;
            o2.setSelected(true);
            o1.setSelected(false);
        }
        else{}
    }

    else if(o2.isSelected()== true)
    {
      if (e.getSource()==b1 && b1.getBackground()==Color.gray)
        {
            b1.setBackground(Color.green);
            b1.setText("0");
            b1.setFont(h2);
            if((b1.getBackground()==Color.green && b2.getBackground()==Color.green && b3.getBackground()==Color.green) || 
            (b1.getBackground()==Color.green && b5.getBackground()==Color.green && b9.getBackground()==Color.green) ||
            (b1.getBackground()==Color.green && b4.getBackground()==Color.green && b6.getBackground()==Color.green) )
            {
                l2.setText("Player 2 is winner");
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);
                b7.setEnabled(false);
                b8.setEnabled(false);
                b9.setEnabled(false);
            }
            
            count++;
            o2.setSelected(false);
            o1.setSelected(true);
        }
        else if (e.getSource()==b2 && b2.getBackground()==Color.gray)
        {
            b2.setBackground(Color.green);
            b2.setText("0");
            b2.setFont(h2);
            if((b1.getBackground()==Color.green && b2.getBackground()==Color.green && b3.getBackground()==Color.green) || 
            (b2.getBackground()==Color.green && b5.getBackground()==Color.green && b8.getBackground()==Color.green))
            {
                l2.setText("Player 2 is winner");
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);
                b7.setEnabled(false);
                b8.setEnabled(false);
                b9.setEnabled(false);
            }
            count++;
            o2.setSelected(false);
            o1.setSelected(true);
        }
        else if (e.getSource()==b3 && b3.getBackground()==Color.gray)
        {
            b3.setBackground(Color.green);
            b3.setText("0");
            b3.setFont(h2);
            if((b1.getBackground()==Color.green && b2.getBackground()==Color.green && b3.getBackground()==Color.green) || 
            (b3.getBackground()==Color.green && b5.getBackground()==Color.green && b7.getBackground()==Color.green) ||
            (b3.getBackground()==Color.green && b6.getBackground()==Color.green && b9.getBackground()==Color.green) )
            {
                l2.setText("Player 2 is winner");
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);
                b7.setEnabled(false);
                b8.setEnabled(false);
                b9.setEnabled(false);
            }
            count++;
            o2.setSelected(false);
            o1.setSelected(true);
        }
        else if (e.getSource()==b4 && b4.getBackground()==Color.gray)
        {
            b4.setBackground(Color.green);
            b4.setText("0");
            b4.setFont(h2);
            if((b4.getBackground()==Color.green && b5.getBackground()==Color.green && b6.getBackground()==Color.green) || 
            (b1.getBackground()==Color.green && b4.getBackground()==Color.green && b7.getBackground()==Color.green))
              {
                l2.setText("Player 2 is winner");
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);
                b7.setEnabled(false);
                b8.setEnabled(false);
                b9.setEnabled(false);
              }
              count++;
              o2.setSelected(false);
              o1.setSelected(true);
        }
        else if (e.getSource()==b5 && b5.getBackground()==Color.gray)
        {
            b5.setBackground(Color.green);
            b5.setText("0");
            b5.setFont(h2);
            if((b1.getBackground()==Color.green && b5.getBackground()==Color.green && b9.getBackground()==Color.green) || 
            (b4.getBackground()==Color.green && b5.getBackground()==Color.green && b6.getBackground()==Color.green) ||
            (b2.getBackground()==Color.green && b5.getBackground()==Color.green && b8.getBackground()==Color.green)||
            (b3.getBackground()==Color.green && b5.getBackground()==Color.green && b7.getBackground()==Color.green))
            {
                l2.setText("Player 2 is winner");
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);
                b7.setEnabled(false);
                b8.setEnabled(false);
                b9.setEnabled(false);
            }
            count++;
            o2.setSelected(false);
            o1.setSelected(true);
        }
        else if (e.getSource()==b6 && b6.getBackground()==Color.gray)
        {
            b6.setBackground(Color.green);
            b6.setText("0");
            b6.setFont(h2);
            if((b4.getBackground()==Color.green && b5.getBackground()==Color.green && b6.getBackground()==Color.green) || 
            (b3.getBackground()==Color.green && b6.getBackground()==Color.green && b9.getBackground()==Color.green))
            {
                l2.setText("Player 2 is winner");
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);
                b7.setEnabled(false);
                b8.setEnabled(false);
                b9.setEnabled(false);
            }
            count++;
            o2.setSelected(false);
            o1.setSelected(true);
        }
        else if (e.getSource()==b7 && b7.getBackground()==Color.gray)
        {
            b7.setBackground(Color.green);
            b7.setText("0");
            b7.setFont(h2);
            if((b1.getBackground()==Color.green && b4.getBackground()==Color.green && b7.getBackground()==Color.green) || 
            (b7.getBackground()==Color.green && b8.getBackground()==Color.green && b9.getBackground()==Color.green)||
            (b7.getBackground()==Color.green && b5.getBackground()==Color.green && b3.getBackground()==Color.green))
            {
                l2.setText("Player 2 is winner");
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);
                b7.setEnabled(false);
                b8.setEnabled(false);
                b9.setEnabled(false);
            }
            count++;
            o2.setSelected(false);
            o1.setSelected(true);
        }
        else if (e.getSource()==b8 && b8.getBackground()==Color.gray)
        {
            b8.setBackground(Color.green);
            b8.setText("0");
            b8.setFont(h2);
            if((b2.getBackground()==Color.green && b5.getBackground()==Color.green && b8.getBackground()==Color.green) || 
            (b7.getBackground()==Color.green && b8.getBackground()==Color.green && b9.getBackground()==Color.green))
            {
                l2.setText("Player 2 is winner");
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);
                b7.setEnabled(false);
                b8.setEnabled(false);
                b9.setEnabled(false);
            }
            count++;
            o2.setSelected(false);
            o1.setSelected(true);
        }
        else if (e.getSource()==b9 && b9.getBackground()==Color.gray)
        {
            b9.setBackground(Color.green);
            b9.setText("0");
            b9.setFont(h2);
            if((b1.getBackground()==Color.green && b5.getBackground()==Color.green && b9.getBackground()==Color.green) || 
            (b3.getBackground()==Color.green && b6.getBackground()==Color.green && b9.getBackground()==Color.green)||
            (b7.getBackground()==Color.green && b8.getBackground()==Color.green && b9.getBackground()==Color.green))
            {
                l2.setText("Player 2 is winner");
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);
                b7.setEnabled(false);
                b8.setEnabled(false);
                b9.setEnabled(false);
            }
            count++;
            o2.setSelected(false);
            o1.setSelected(true);
        } 
        else{}  
    }
if(count==9)
      {
        JOptionPane.showMessageDialog(f1, "Game Over","Alert",JOptionPane.OK_OPTION);
      }
}
}

class Pankaj
{
    public static void main(String q[]) 
    {
        Games y = new Games();
        y.display();    
    }
}