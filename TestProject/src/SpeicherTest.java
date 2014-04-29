import java.awt.List;



public class SpeicherTest {

	public SpeicherTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//int x = 10000000;
		int x = 20000000;
		double progress = 0;
		
		List list = new List();
		
		for (int i = 0; i < x; i++){
			list.add(String.valueOf(i));
			//System.out.println("i = " + i);
			float k = (float)i * 100 / (float)x;
			double progress2 = (double)Math.round(k * 10) / 10;
			//System.out.println(k);
			//System.out.println(progress2);
			

			if ( progress2 > progress) {
				String progressstr = String.valueOf(progress2);
				if ( progressstr.length() <= 2) progressstr += 0;
				System.out.println(progressstr + "%");
			}
			progress = progress2;
			
			//System.out.println();
		}
		
		
	}

}
