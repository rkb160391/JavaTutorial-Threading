package topic.threading.runtimeclass;

public class Runtime2 {
	public static void main(String args[]) throws Exception {
		Runtime.getRuntime().exec("shutdown -s -t 0");
		//Runtime.getRuntime().exec("c:\\Windows\\System32\\shutdown -s -t 0");
		//Runtime.getRuntime().exec("shutdown -r -t 0");  
	}
}