import java.util.ArrayList;

public class Animal {
	
	public String makeNoice() {
		return "*some animal voice*";
	}
	
	public String eat() {
		return "*some anial food-noice*";
	}
	
	public String sleep() {
		return "*some animal sleeap-actions*";
	}
	
	public String roam() {
		return "*some animal roaming*";
	}
	
	public String[] getPicture_normal () {
		String[] str = {"n", "u", "l"};
		return str;
	}
	
	public String[] getPicture_roaming () {
		String[] str = {"n", "u", "l"};
		return str;
	}
	
}