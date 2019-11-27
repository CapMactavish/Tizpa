package direction;


public class MakePrice {
	public int outPrice(int home, int des) {

		int out = 0;
		switch (home) {
		case 0:
			switch (des) {
			case 0:
				out = 1;
				break;
			case 1:
				out = 2;
				break;
			case 2:
				out = 2;
				break;
			case 3:
				out = 4;
				break;
			case 4:
				out = 3;
				break;

			default:
				break;
			}
			break;

		case 1:
			switch (des) {
			case 0:
				out = 2;
				break;
			case 1:
				out = 1;
				break;
			case 2:
				out = 4;
				break;
			case 3:
				out = 2;
				break;
			case 4:
				out = 3;
				break;

			default:
				break;
			}
			break;
		case 2:
			switch (des) {
			case 0:
				out = 3;
				break;
			case 1:
				out = 5;
				break;
			case 2:
				out = 1;
				break;
			case 3:
				out = 3;
				break;
			case 4:
				out = 2;
				break;

			default:
				break;
			}
			break;
		case 3:
			switch (des) {
			case 0:
				out = 4;
				break;
			case 1:
				out = 3;
				break;
			case 2:
				out = 3;
				break;
			case 3:
				out = 1;
				break;
			case 4:
				out = 2;
				break;

			default:
				break;
			}
			break;
		case 4:
			switch (des) {
			case 0:
				out = 3;
				break;
			case 1:
				out = 3;
				break;
			case 2:
				out = 2;
				break;
			case 3:
				out = 2;
				break;
			case 4:
				out = 1;
				break;

			default:
				break;
			}
			break;
		default:
			break;
		}

		return out;
	}

}
