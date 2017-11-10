package problems;

import java.util.concurrent.Executor;

public class SimpleExecutor implements Executor {
	

	@Override
	public void execute(Runnable r) {
		// TODO Auto-generated method stub
		r.run();
	}
}
