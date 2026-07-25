import java.util.HashSet;

public class Repeat {
	
	public static void main(String[] args) throws Exception{
		
		String s = "Java is a programming language is a";
		
		String[] a = s.split(" ");
		
		HashSet<String> b = new HashSet<>();
		
		for(String w: a) {
			
			if(b.contains(w)) {
				
				System.out.println(w);
				break;
				
			}
			
			else {
				
				b.add(w);
			}
		}
	}

}
