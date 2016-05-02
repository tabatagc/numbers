/* 
 Codificar uma classe chamada COMPLEXO para modelar os números complexos

ex: 2(real)+3(img);
    5(real)+6(img)
------------------------
      7  +   9
 
 */
public class Numbers {

	double real, imaginario;
	
    public Numbers(double real, double imaginario)
    {
        this.real = real;
    	this.imaginario = imaginario;
    }
    public Numbers(){
    	
    }
    public Numbers somar(Complexo c)//classe eh um tipo de dado
    {
    	double ar, ai,com;
    	ar = c.real + real;
    	ai = c.imaginario + imaginario;
    	//com = new Complexo (ar, ai);
    	 	return new Complexo(ar, ai);
    }
    
    public String getNumbers()
    {
    	String aux="";
    	aux += real;
    	if(imaginario >=0)
    		aux+= " + ";
    	
    	aux += imaginario + "i\n";
    	return aux;
        	
    }
public double getMaior(Complexo c[])
	{
		double aux=0;
		for(int i=0; i < c.length; i++)
		{
			if (c[i].real > aux)
				 {
				 aux= c[i].real;
				 }
		
		}
	return aux;
	}

}
