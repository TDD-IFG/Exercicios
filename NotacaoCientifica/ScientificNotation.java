public class ScientificNotation{	
		
	public static String getE(double X){
		if(X>=0.0)
			return String.format("+%.4E",X);
		else
			return String.format("%.4E",X);
	}

}