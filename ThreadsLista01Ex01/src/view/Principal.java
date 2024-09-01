package view;
	import controller.ThreadIdController;
public class Principal {
	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			ThreadIdController t = new ThreadIdController();
			t.start();
		}
	}
}
