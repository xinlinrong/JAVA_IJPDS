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
		//run(new MyPractise701());
		//run(new MyPractise702());
		run(new MyPractise703());
	}
}