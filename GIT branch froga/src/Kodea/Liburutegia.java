package Kodea;

import java.util.ArrayList;

public class Liburutegia {
		String izena;
		String helbidea;
		int ikasle_Kop;
		ArrayList<Liburua> liburuak;
		
		
		public String getIzena() {
			return izena;
		}
		public void setIzena(String izena) {
			this.izena = izena;
		}
		public String getHelbidea() {
			return helbidea;
		}
		public void setHelbidea(String helbidea) {
			this.helbidea = helbidea;
		}
		public int getIkasle_Kop() {
			return ikasle_Kop;
		}
		public void setIkasle_Kop(int ikasle_Kop) {
			this.ikasle_Kop = ikasle_Kop;
		}
		public ArrayList<Liburua> getLiburuak() {
			return liburuak;
		}
		public void setLiburuak(ArrayList<Liburua> liburuak) {
			this.liburuak = liburuak;
		}
}
