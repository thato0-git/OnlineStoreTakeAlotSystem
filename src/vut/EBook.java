
// D Raphahlelo 223076058
// SM Swana 223430145
// MG MANAKA 223607436
// T Mokhuamathe 223569550
// BB MSIMANGA 223821411 

package vut;


public class EBook extends Book {

    private int fileSize;

    public EBook() {
    }
    

    public EBook(String author, String title, String isbnNo, int fileSize) {
        super(author, title, isbnNo);
        this.fileSize = fileSize;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    @Override
    public String getSizeDetails() {
        return "EBook : " + getTitle() + ", " + fileSize + "KB";
    }

    @Override
    public String toString() {
        return  getTitle() + ", " + getAuthor() + ", " + getIsbnNo() + ", " + fileSize + "KB";
    }
}
