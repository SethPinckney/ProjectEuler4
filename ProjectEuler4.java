public class ProjectEuler4 {

	public static void main (String [] args) {
		int largestanswer = 0;
		for (int palin1=100; palin1 <= 999; palin1++){
			
			for (int palinb=100; palinb <=999; palinb++){
					
				int answer = palin1 * palinb;
				int saveanswer = answer;
				int digit1 = answer % 10;
				answer = answer / 10;
					
				int digit2 = answer % 10;
				answer = answer / 10;
					
				int digit3 = answer % 10;
				answer = answer / 10;
					
				int digit4 = answer % 10;
				answer = answer / 10;
					
				int digit5 = answer % 10;
				answer = answer / 10;
					
				int digit6 = answer % 10;
				answer = answer / 10;
					
				if (digit6 == digit1 && digit5 == digit2 && digit3 == digit4){
					if (saveanswer > largestanswer) {
						//System.out.println("__________________________________");
						//System.out.println(digit6+""+digit5+""+digit4+""+digit3+""+digit2+""+digit1);
						//System.out.println(palin1+ " X "+palinb);
						largestanswer = saveanswer;
					}	
				}	
					
			}
				
		}
		System.out.println(largestanswer);
		
	}


}