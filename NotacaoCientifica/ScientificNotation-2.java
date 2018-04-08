class ScientificNotation{	
		
	public static String getSE(String X){
		if(X.equals("+0.00"))
			return new String("+0.0000E+00");
		else if(X.equals("-0.00"))
			return new String("-0.0000E+00");
		else if (X.equals("-0.0000"))
			return new String("-0.0000E+00");
		else	
			return getE(Double.parseDouble(X));
	}	

	public static String getE(double X){		

		String s = Double.toString(X);
		String saida;

		if(X>0.0)
			saida = String.format("+%.4E",X);
		else
			saida = String.format("%.4E",X);
		if(saida.charAt(0)!='-' && saida.charAt(0)!='+')
			saida = '+'+saida;
		return saida;
	}

}