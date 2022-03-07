public class Prog82 {

	public static void main(String[] args) {

		Hero h;

		if (args.length == 0) {
			h = new Hero();
		} else if(args.length == 1) {
			h = new Hero(args[0]);
		} else {
			h = new Hero(args[0], Integer.parseInt(args[1]));
		}

		System.out.println("勇者" + h.name + "が誕生しました。HP:" + h.hp);
	}
}

