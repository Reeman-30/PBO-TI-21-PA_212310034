public class Kerucut
		
	public static void main(String[] args) {
		//segitiga kerucut
		  double phi, luas, r,s, t, volS, volT, R, T;
		  phi = 3.14;
		  r = 50;
		  s = 20;
		  t = 35;
		  luas = (phi * (r * r)) + (phi * r * s);
		  volS = 0.33 * phi * (r * r) * t;
		  System.out.println("Luas segitiga kerucut = " + luas);
		  System.out.println("Volume segitiga kerucut = " + volS);
		  
		  //tabung
		  R = 15;
		  T = 20;
		  volT = phi * (r * r) * t;
		  System.out.println("volume tabung = " + volT);
	}
	
}
