package javaPro;

import java.util.List;

public class RandomMain {
	public static void main(String[] args) {
		
		Num numObj = new Num();
		Num numObj2 = new Num();
        List<Integer> randomNumbers = numObj.Random(); 
        List<Integer> randomNumbers2 = numObj.Random(6); 
        
        for (int n : randomNumbers) {
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println("====================");
        for (int n : randomNumbers2) {
            System.out.print(n + " ");
        }
        
	}
}
