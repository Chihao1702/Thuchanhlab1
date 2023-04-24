package bai1b;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

public class HangThucPham {
	private String maHang;
    private String tenHang;
    private double donGia;
    private LocalDate NSX;
    private LocalDate NHH;
	public HangThucPham(String maHang) {
		this.maHang = maHang;
	}
	public HangThucPham(String maHang, String tenHang, double donGia, LocalDate nSX, LocalDate nHH) {
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.donGia = donGia;
		NSX = nSX;
		NHH = nHH;
	}
	public String getMaHang() {
		return maHang;
	}
	public void setMaHang(String maHang) {
		this.maHang = maHang;
	}
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public LocalDate getNSX() {
		return NSX;
	}
	public void setNSX(LocalDate nSX) {
		NSX = nSX;
	}
	public LocalDate getNHH() {
		return NHH;
	}
	public void setNHH(LocalDate nHH) {
		NHH = nHH;
	}
	public boolean daHetHan() {
		return LocalDate.now().isAfter(ngayHetHan);
    }
	
    public static void main(String[] args) {
    	
    	
    	        Scanner scanner = new Scanner (System.in);
    	        ArrayList<HangThucPham> danhSachHangHoa = new ArrayList<>();

    	        System.out.print("Nhap so lượng hang hoa: ");
    	        int soLuong = scanner.nextInt();
    	        scanner.nextLine(); 

    	        for (int i = 0; i < soLuong; i++) {
    	            System.out.printf("Nhap thong tin hang hoa thu %d:\n", i + 1);

    	            System.out.print("Nhap ma hang: ");
    	            String maHang = scanner.nextLine();

    	            System.out.print("Nhap ten hang: ");
    	            String tenHang = scanner.nextLine();

    	            System.out.print("Nhap đon gia: ");
    	            double donGia = scanner.nextDouble();
    	            scanner.nextLine();

    	            System.out.print("Nhap ngay san xuat (yyyy-MM-dd): ");
    	            LocalDate ngaySanXuat = LocalDate.parse(scanner.nextLine());

    	            System.out.print("Nhap ngay het han (yyyy-MM-dd): ");
    	            LocalDate ngayHetHan = LocalDate.parse(scanner.nextLine());

    	            HangThucPham hangHoa = new HangThucPham(maHang, tenHang, donGia, ngaySanXuat, ngayHetHan);
    	            danhSachHangHoa.add(hangHoa);
    	        }
    	        System.out.println("Danh sach hang hoa:");
    	        for (HangThucPham hangHoa : danhSachHangHoa) {
    	            System.out.printf("- Ma hang: %s, ten hang: %s, đon gia: %.0f, ngay san xuat: %s, ngay het han: %s\n",
    	                    hangHoa.getMaHang(), hangHoa.getTenHang(), hangHoa.getDonGia(),
    	                    hangHoa.getNgaySanXuat(), hangHoa.getNgayHetHan());
    	        }   	
    }
    
}
