import java.util.*;
public class UltrapassaValor{

	List<Integer> entrada;
	

	public UltrapassaValor(List<Integer> entrada){
		this.entrada = entrada;
	}

	public int executa(){
		int soma=0,y=0;
		int X,Z;
		X = (int) entrada.get(0);
		Z = (int) entrada.get(entrada.size()-1);
		do{
			soma=soma+X; // -5 -9 -12 -14 -15 -15 -14 -12 -9 -5 0
            y=y+1; // 1 2 3 4 5 6 7 8 9 10 11
            X=X+1; // -4 -3 -2 -1 0 1 2 3 4 5
		}while(soma<=Z);
            
      
        return y;	
	}
}
