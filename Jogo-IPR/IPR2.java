class IPR{	
	
	/**
	* define o ganhador, sendo o inteiro retornado o número do jogador vencedor
	**/
	public int calcula(int p, int j1, int j2, int r, int a){
		int total = j1+j2;
		if(p==1 && total%2==0 && r==1 && a==1)		
			return 2;

		if(p==0 && total%2==0 && r==0 && a==0)		
			return 2;

		if(p==0 && total%2==0 && r==1 && a==1)		
			return 2;

		if(p==0 && total%2!=0 && r==1 && a==1)		
			return 2;

		if(p==1 && total%2!=0 && r==0 && a==0)		
			return 2;

		if(p==1 && total%2!=0 && r==1 && a==1)		
			return 2;

		return 1;
	}

}
