package Buybook;

public class Book {
  private String tbookName;
  private double bookPrice;
  private int mun;

    public int getMun() {
        return mun;
    }

    public void setMun(int mun) {
        this.mun = mun;
    }

    public Book(String tbookName, double bookPrice,int mun) {
        this.tbookName = tbookName;
        this.bookPrice = bookPrice;
        this.mun=mun;
    }

    public String getTbookName() {
        return tbookName;
    }

    public void setTbookName(String tbookName) {
        this.tbookName = tbookName;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public void show(){
        System.out.println(this.tbookName+"\t"+this.bookPrice+"\t"+this.mun);
    }
}
