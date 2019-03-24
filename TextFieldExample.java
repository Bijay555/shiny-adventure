import java.awt.*;  
    import java.awt.event.*;  
    import java.util.Hashtable;
    import java.util.*;
    import java.lang.*;
    import java.*;
    public class TextFieldExample extends Frame implements ActionListener{  
        TextField tf1,tf2,tf3; 
	 Label l1,l2;  
        Button b1,b2; 
        Enumeration names;
        String key; 
        Hashtable<String, String> hashtable = new Hashtable<String, String>();

        TextFieldExample(){  

            hashtable.put("zenith","the point above the observer directly opposite the nadir");
            hashtable.put("zealot","a fervent and even militant proponent of something");
            hashtable.put("yearn","desire strongly or persistently");
            hashtable.put("yawner","a person who yawns");
            hashtable.put("xenophobia","a fear of foreigners or strangers");
	    hashtable.put("orange","fruit; colour");
	    hashtable.put("tarnish","lose or cause to lose lustre, especially as a result of exposure to air or moisture.");


	 l1=new Label("First Label");  
    	l1.setBounds(50,50, 100,30);  
            tf1=new TextField();  
            tf1.setBounds(50,50,100,20);  
            tf2=new TextField();  
            tf2.setBounds(50,100,500,20);  
            tf2.setEditable(false);
            b1=new Button("Meaning");  
            b1.setBounds(50,200,100,80);  
             
            b1.addActionListener(this);  
            tf1.addActionListener(this);
            
            add(tf1);add(tf2);;add(b1);  
            setSize(300,300);  
            setLayout(null);  
            setVisible(true);  
        }         
        public void actionPerformed(ActionEvent awt) {  
        
            if(awt.getSource()==b1)
            {  String var = tf1.getText(); 
                names = hashtable.keys();
                while(names.hasMoreElements())
              {
                   key = (String) names.nextElement();
                   if(key.toString().equalsIgnoreCase(var.toString()))
                   {
                      tf2.setText(" Meaning :" + hashtable.get(key));
                      break;
                   }
                   else
                   {
                      tf2.setText("Word Not Found");
                   }
              }
            }
        }  
    public static void main(String[] args) {  
        new TextFieldExample();  
    }  
    }  