public class PenggunaanSuperKonstruktorChild extends PenggunaanSuperKonstruktor{
	
	public PenggunaanSuperKonstruktorChild(int umur){
		super(umur);
	}
	public static void main(String args []){
		PenggunaanSuperKonstruktorChild s = new PenggunaanSuperKonstruktorChild (24);
		s.getAge();
	}
}