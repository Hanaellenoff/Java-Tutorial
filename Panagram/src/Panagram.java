
public class Panagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "The quick brown fox jumps over the lazy dog";
		boolean[] mark = new boolean[26];
		boolean panagram = true;
		int index = 0;
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c >= 'A' && c <= 'Z') {
				index = c - 'A';
			} else if (c >= 'a' && c <= 'z') {
				index = c - 'a';
			}
			
			mark[index] = true;
		}
		
		
		for(int i = 0; i < mark.length; i++) {
			if(mark[i] == false) {
				panagram = false;
			}
		}
		if (panagram) {
			System.out.println("This is a panagram fam");
		} else {
			System.out.println("Sorry not a panagram");
		}

			System.out.println(panagram );
		
		
	}

}
