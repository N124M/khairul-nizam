# khairul-nizam
public class persegi {
   int panjang;
   int lebar;
    
   public int getLebar(){
       return lebar;
   }
   public void setLebar(int lebar){
       this.lebar = lebar;
   }
   public int getPanjang(){
       return panjang;
   }
   public void setPanjang(int panjang){
       this.panjang = panjang;
   }
   public persegi(){
       int p = 0;
       int l = 0;
   }
   
   public int luas(int p, int l){
       return p * l;
   }
   public int getLuas(){
       return luas(panjang, lebar);
   }
  public class hasilpersegi {
  public static void main(String[] args){
      persegi p = new persegi();
      p.setPanjang(10);
      p.setLebar(60);
      System.out.println("panjang : "+p.getPanjang());
      System.out.println("lebar : "+p.getLebar());
      System.out.println("luas persegi : "+p.getLuas());
  }
}
