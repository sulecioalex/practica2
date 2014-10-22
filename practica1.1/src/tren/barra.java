package tren;
import javax.swing.*;
import java.util.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.swing.JOptionPane;


public class barra extends JFrame implements ActionListener{
	   ArrayList<String> doc = new ArrayList<String>();
	   ArrayList<String> cl = new ArrayList<String>();
	   int i;
	   int r;
	static JMenuBar barra;
	JMenu menu1;
	JButton boton1;
	JButton boton2;
	JButton boton3;
public barra (String titulo ){
	super (titulo);
	setBounds(14,14,500,500 );
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	


	metodos();
	
	
	paintComponents(getGraphics());
	
}
@Override
public void actionPerformed(ActionEvent e) {
	
	if(e.getSource() == boton1)
	{
		

		JOptionPane.showMessageDialog(null,"su archivo cargo" );//aca va la direccion de la localizacion del documento
		cargar();
		
	}
	else  if(e.getSource() == boton2)
	{
		JOptionPane.showMessageDialog(null, "2");//aca va el proceso de adelate
		leermas4();
	
	} 
	else  if(e.getSource() == boton3)
	{
		JOptionPane.showMessageDialog(null, "3");//aca va el proceso de atras
	
	} 
	

	
}




public void metodos()
{
	barra=new JMenuBar();
	menu1= new JMenu("archivo");
	boton1 = new JButton("cargar");
	boton2= new JButton("siguinte");
	boton3= new JButton("atras");
	boton1.addActionListener(this);
	boton2.addActionListener(this);
	boton3.addActionListener(this);
	menu1.add(boton1);
	barra.add(menu1);
	barra.add(boton2);
	barra.add(boton3);

	
	setJMenuBar(barra);

	dibujar db=new dibujar();
	this.add(db);
	
	
}
//leemos linea por linea y transformamos a entero el valor 
public void leermas4() 
{
	int distancia=0;
	int subena=0;
	int subenb=0;
	int bajana=0;
	int bajanb=0;
	String l1="";
	i=r+4;
	for(int x=0+r;x<=i;x++){
	r=i+1;
	StringTokenizer st=new StringTokenizer(doc.get(x));
while (st.hasMoreTokens()){ // hacemos linea por linea linea 1
	l1=st.nextToken();
	System.out.println(l1);	
}
cl.add(l1);
}
	// combertimos los string a enteros par alas comparaciones

int gua= Integer.parseInt(cl.get(i-4));
distancia=gua;
int guas=Integer.parseInt(cl.get(i-3));
bajana=guas;
int guab=Integer.parseInt(cl.get(i-2));
bajanb=guab;
int guac=Integer.parseInt(cl.get(i-1));
subena=guac;
int guad=Integer.parseInt(cl.get(i));
subenb=guad;
System.out.println(distancia);
System.out.println(subena);



dibujar pr=new dibujar();
this.add(pr);
}

public void cargar (){
	
	
	try{
        // Abrimos el archivo
        FileInputStream fstream = new FileInputStream("C:\\Users\\alex\\Desktop\\instrucciones.txt");
        // Creamos el objeto de entrada
        DataInputStream entrada = new DataInputStream(fstream);
        // Creamos el Buffer de Lectura
        BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
        String strLinea;
        
        // Leer el archivo linea por linea
        
        while ((strLinea = buffer.readLine()) != null)   {
            // Imprimimos la línea por pantalla
       
            System.out.println (strLinea);
              
        doc.add(strLinea);
       
        
        }
      
		
        // Cerramos el archivo
        entrada.close();
    }catch (Exception e){ //Catch de excepciones
        System.err.println("Ocurrio un error: " + e.getMessage());
    }
	
	System.out.println (doc.get(3));
	
}


	public static void main(String[] args) {
		
		new barra ("practica 2");
	

		
	
		

	}



}
