package javaPro;

import java.util.ArrayList;
import java.util.List;

public class Num implements Random{
	
	private int num;

	
	public Num() {
		
	}
	
	public Num(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public List<Integer> Random() {
	    List<Integer> nums = new ArrayList<>();
	    
	    while (nums.size() < 5) {
	        int randomValue = (int)(Math.random() * 45) + 1;

	        if (!nums.contains(randomValue)) {
	            setNum(randomValue);
	            nums.add(getNum());
	        }
	    }
	    return nums;
	}
	
	@Override
	public List<Integer> Random(int num) {
	    List<Integer> nums = new ArrayList<>();

	    while (nums.size() < num) {
	        int randomValue = (int)(Math.random() * 45) + 1;

	        if (!nums.contains(randomValue)) {
	            setNum(randomValue);
	            nums.add(getNum());
	        }
	    }

	    return nums;
	}

	
	
	
	
}
