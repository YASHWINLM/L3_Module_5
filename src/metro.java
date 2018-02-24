import java.util.ArrayList;

public class metro {

	static int countPassengers(ArrayList<int[]> list) {
		int x = 0;
		int y = 0;
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < 1; j++) {
				x += list.get(i)[0];
				y += list.get(i)[1];
			}

		}

		return x - y;
	}

}
