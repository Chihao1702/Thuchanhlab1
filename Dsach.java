package bai1a;

import java.util.ArrayList;
import java.util.Scanner;

public class Dsach {
	ArrayList<Xe> List = new ArrayList<Xe>();
	Xe v = new Xe();
	Scanner sc = new Scanner(System.in);
	public void Them() {
	/*	System.out.println("nhap chu tai xe:"); v.chuTaiXe=sc.nextLine();
		System.out.println("nhap loai xe:");
		v.setLoaiXe(sc.nextLine());
		System.out.println("nhap dung tich:");
		v.setDungTich(sc.nextInt());
		System.out.println("nhap don gia");
		v.setGia(sc.nextDouble());;*/
		while(true) {
			System.out.println("chon 1 de nhap");
		int chon=sc.nextInt();
		
		if(chon==1) {
		v.nhap();
		List.add(v);
		
		}
		else
			break;
		}
	}
	public void xuat() {
	
		for(Xe i : List) {
			i.xuat();
			
		}
	}
}
