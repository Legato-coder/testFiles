package Tommy;

public class tikon {

	public tikon() {
	
	}

	public static void main(String[] args) {
		
		String roma = "MANIKANATA";
		System.out.println(roma.toLowerCase());
		
		String keep ="neeharika";
		System.out.println(keep.toUpperCase());
		
		String Need = "Tankband";
		System.out.println(Need.toUpperCase());
		
		String neo ="seema";
		System.out.println(neo.replace('s', 't'));
		
		String keeper = "dosa";
		System.out.println(keeper.replace("d", "p"));
		
		String bed ="Ameena";
		System.out.println(bed.replace("m", "k"));
	
		String mrs = "monica";
		System.out.println(mrs.replace("m", "s"));
		
		///now we will work on SUB string - which is side string
		
		String me = "java python";
		System.out.println(me.replace("python", "datascience"));
		
		String mona = "bigdata AI";
		System.out.println(mona.replace("AI", "coreJ"));
		
		String kissy = "PuNjab Haryana";
		System.out.println(kissy.replace("Haryana", "Srinagar"));
	}

}
