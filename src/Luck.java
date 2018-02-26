import java.util.*;
public class Luck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int random = (int)(Math.random() * 4);
		String luck = "";
		switch (random){
		case 1:
			luck = "Very Lucky";
			break;
		case 2:
			luck = "Lucky";
			break;
		case 3:
			luck = "Unlucky";
			break;
		case 4:
			luck = "Very Unlucky";
			break;
		default:
			luck = "neither lucky or unlucky";
	}
		System.out.println("You were " + luck);
	}

}
