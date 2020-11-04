public class MainApplication {

	/**
	 * 运行方法
	 * @param iPratiseImpl
	 */
    private static void run(IPratiseInterface iPratiseImpl)
    {
    	iPratiseImpl.run();
    }
	
	public static void main(String[] args) {
    	//run(new MyPratise61());
    	//run(new MyPratise62());
    	//run(new MyPratise63());
    	//run(new MyPratise64());
    	run(new MyPratise65());
	}
}