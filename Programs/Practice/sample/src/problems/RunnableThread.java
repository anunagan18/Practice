package problems;

public class RunnableThread implements Runnable{

	String seq = null;
	public RunnableThread(String seg){
		this.seq = seq;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int cnt =0;cnt<5;cnt++){
			System.out.println(seq+":" + cnt);
		}
		
	}

}
