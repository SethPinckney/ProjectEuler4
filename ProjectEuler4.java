public class ProjectEuler4 {

	public static void main (String [] args) {
		
		//int palin1
		
		for (int palin1=10; palin1 <= 99; palin1++){
			
			for (int palinb=10; palinb <=99; palinb++){
					
				int answer = palin1 * palinb;
				
				//for (int i = 0; i <= 4; i++)
					
					int digit1 = answer % 10;
					answer = answer / 10;
					
					int digit2 = answer % 10;
					answer = answer / 10;
					
					int digit3 = answer % 10;
					answer = answer / 10;
					
					int digit4 = answer % 10;
					answer = answer / 10;
					
					
					
					System.out.println("__________________________________");
					
					System.out.println("  "+digit4+" "+digit3+" "+digit2+" "+digit1);
					
				System.out.println(answer);
					
			}
				
		}
		
	}


}