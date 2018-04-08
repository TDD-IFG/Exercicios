public class JogoPPTLS{	

	
	public String jogo(String j1, String j2){
		if(j1.equalsIgnoreCase("tesoura") && j2.equalsIgnoreCase("papel"))
			return new String("Bazinga!");
		if(j1.equalsIgnoreCase("papel") && j2.equalsIgnoreCase("tesoura"))
			return new String("Raj trapaceou!");
		if(j1.equalsIgnoreCase("papel") && j2.equalsIgnoreCase("pedra"))
			return new String("Bazinga!");
		if(j1.equalsIgnoreCase("pedra") && j2.equalsIgnoreCase("papel"))
			return new String("Raj trapaceou!");
		if(j1.equalsIgnoreCase("lagarto") && j2.equalsIgnoreCase("spock"))
			return new String("Bazinga!");
		if(j1.equalsIgnoreCase("spock") && j2.equalsIgnoreCase("lagarto"))
			return new String("Raj trapaceou!");
		if(j1.equalsIgnoreCase("spock") && j2.equalsIgnoreCase("tesoura"))
			return new String("Bazinga!");
		if(j1.equalsIgnoreCase("tesoura") && j2.equalsIgnoreCase("spock"))
			return new String("Raj trapaceou!");
		if(j1.equalsIgnoreCase("tesoura") && j2.equalsIgnoreCase("lagarto"))
			return new String("Bazinga!");
		if(j1.equalsIgnoreCase("lagarto") && j2.equalsIgnoreCase("tesoura"))
			return new String("Raj trapaceou!");
		if(j1.equalsIgnoreCase("lagarto") && j2.equalsIgnoreCase("papel"))
			return new String("Bazinga!");
		if(j1.equalsIgnoreCase("papel") && j2.equalsIgnoreCase("lagarto"))
			return new String("Raj trapaceou!");
		if(j1.equalsIgnoreCase("papel") && j2.equalsIgnoreCase("spock"))
			return new String("Bazinga!");
		if(j1.equalsIgnoreCase("spock") && j2.equalsIgnoreCase("papel"))
			return new String("Raj trapaceou!");
		if(j1.equalsIgnoreCase("spock") && j2.equalsIgnoreCase("pedra"))
			return new String("Bazinga!");
		if(j1.equalsIgnoreCase("pedra") && j2.equalsIgnoreCase("spock"))
			return new String("Raj trapaceou!");
		if(j1.equalsIgnoreCase("pedra") && j2.equalsIgnoreCase("tesoura"))
			return new String("Bazinga!");
		if(j1.equalsIgnoreCase("tesoura") && j2.equalsIgnoreCase("pedra"))
			return new String("Raj trapaceou!");
		if(j1.equalsIgnoreCase("pedra") && j2.equalsIgnoreCase("lagarto"))
			return new String("Bazinga!");
		//if(j1.equalsIgnoreCase("lagarto") && j2.equalsIgnoreCase("pedra"))
			//return new String("Raj trapaceou!");
		if(j1==j2)
			return new String("De novo!");
		return null;
	}

}
