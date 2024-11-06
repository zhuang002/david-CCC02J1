import java.util.Scanner;

public class Main {

	
	static char[][] canvas = new char[9][7];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		printNumber(num);
	
	}

	private static void printNumber(int num) {
		clearCanvas();
		
		/*if (num==0) {
			
		} else if (num==1) {
			
		} else if (num == 2) {
			
		}
		..*/
		
		switch (num) {
		case 0:
			draw0();
			draw1();
			draw2();
			draw4();
			draw5();
			draw6();
			break;
		case 1:
			draw2();
			draw5();
			break;
		case 2:
			draw0();
			draw2();
			draw3();
			draw4();
			draw6();
			break;
		case 3:
			draw0();
			draw2();
			draw3();
			draw5();
			draw6();
			break;
		case 4:
			draw1();
			draw2();
			draw3();
			draw5();
			break;
		case 5:
			draw0();
			draw1();
			draw3(); 
			draw5();
			draw6();
			break;
		case 6:
			draw0();
			draw1();
			draw3();
			draw4();
			draw5();
			draw6();
			break;
		case 7:
			draw0();
			draw2();
			draw5();
			break;
		case 8:
			draw0();
			draw1();
			draw2();
			draw3();
			draw4();
			draw5();
			draw6();
			break;
		case 9:
			draw0();
			draw1();
			draw2();
			draw3();
			draw5();
			draw6();
			break;
		default:
			break;
			
		}
		printCanvas();
	}
	
	

	private static void printCanvas() {
		for (int i=0;i<canvas.length;i++) {
			String s = "";
			for (int j=0;j<canvas[0].length;j++) {
				s += canvas[i][j];
			}
			System.out.println(s.stripTrailing());
		}
		
	}

	private static void draw4() {
		canvas[5][0] = '*';
		canvas[6][0] = '*';
		canvas[7][0] = '*';
		
	}

	private static void draw6() {
		
		canvas[8][1]='*';
		canvas[8][3]='*';
		canvas[8][5] = '*';
	}

	private static void draw5() {
		
		canvas[5][6] = '*';
		canvas[6][6] = '*';
		canvas[7][6] = '*';
	}

	private static void draw3() {
		canvas[4][1]='*';
		canvas[4][3]='*';
		canvas[4][5] = '*';
		
	}

	private static void draw2() {
		canvas[1][6] = '*';
		canvas[2][6] = '*';
		canvas[3][6] = '*';
		
	}

	private static void draw1() {
		canvas[1][0] = '*';
		canvas[2][0] = '*';
		canvas[3][0] = '*';
		
	}

	private static void clearCanvas() {
		for (int i=0;i<canvas.length;i++) {
			for (int j=0;j<canvas[0].length;j++) {
				canvas[i][j] = ' ';
			}
		}
		
	}

	private static void draw0() {
		canvas[0][1]='*';
		canvas[0][3]='*';
		canvas[0][5] = '*';
	}

}
