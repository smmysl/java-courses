public class Calculate {
	public static void main(String[] arg) {
		System.out.println ("Calculate...");
		int first = Integer.valueOf(arg[0]);
		int second = Integer.valueOf(arg[1]);
		int summ = first+second;
		int pro = first*second;
		int raz = first-second;
		System.out.println ("sum " + summ);
		System.out.println ("proizv " + pro);
		System.out.println ("raaznitsa " + raz);
	}
}