package test1;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;
import java.util.Set;

public class TsetDdz {

	public static void main(String[] args) {
		random();
	}
	
	public static void random() {
		Random random = new Random();
		for(int i=1;i<55;i++) {
			System.out.println(random.nextInt(54));
		}
	}

	
	public static Map<Integer,Integer> generatePlayingCards(){
		Map<Integer,Integer> pc = new HashMap<Integer, Integer>();
		Integer i =1;
				for(int k=1;k<5;k++) {
					for(int j=1;j<14;j++) {
						pc.put(i, j);
						i++;
				}
		}
		pc.put(53, 99);
		pc.put(54, 100);
		return pc;
	}
}
