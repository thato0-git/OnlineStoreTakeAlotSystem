
// D Raphahlelo 223076058
// SM Swana 223430145
// MG MANAKA 223607436
// T Mokhuamathe 223569550
// BB MSIMANGA 223821411 

package vut;


public class PrintBook extends Book {
    
    private int numberOfPages;
    private float weight;

    public PrintBook() {
    }
    
    public PrintBook(String author, String title, String isbnNo, int numberOfPages, float weight) {
        super(author, title, isbnNo);
        
        this.numberOfPages = numberOfPages;
        this.weight = weight;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

   
    @Override
   public String getSizeDetails(){
        return "PrinteBook : " + getTitle() + ", " + numberOfPages + " pages , " + weight + "g";
    }
    
    @Override
    public String toString(){
        return  getTitle() + ", " +getAuthor()+ ", " + getIsbnNo() + ", " + numberOfPages + ", " + weight + "g";
    }
    
}
