public class FalhaMotor{
	int N;
	Integer rpms[];
	public FalhaMotor(Integer N, Integer rpms[]){
		this.N = N;
		this.rpms = rpms;
	}
	public Integer executa(){
		int queda = 0;
		int maior = Integer.MIN_VALUE;
		int t = this.rpms.length;
		for(int i=0;i<t;i++){
			if(maior<=this.rpms[i]){
				maior = this.rpms[i];
			}else{
				if(i>0){
					queda = i+1;
					break;
				}	
			}
		}
		return queda;
	}
}