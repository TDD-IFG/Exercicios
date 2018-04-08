public class Heroi{	
		
    public static char[] hasCaptured(String vilains[]){
        char saida[] = new char[vilains.length]; 
        int i=0;        
        for(String v:vilains){
            saida[i++] = 'Y';
        }   
        return saida;
    }
	public static char hasCaptured(String vilain){
		return 'Y';
	}		


}
