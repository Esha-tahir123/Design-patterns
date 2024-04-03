package Task1;



public class Test {

	public static void main(String[] args) {
		ThreadSafe config = ThreadSafe.getInstance();
		System.out.println(config.getValue("mode"));
		System.out.println(config.getValue("font-size"));
		System.out.println(config.getValue("font-type"));
        Singleton sinstance= Singleton.getInstance();
         sinstance.getData();


	}

}