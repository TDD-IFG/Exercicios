public class Evento{

	int X;
	long M;

	public Evento(int X, long M){
		this.X = X;
		this.M = M;
	}

	public long executa(){
		return this.X * this.M;
	}
}