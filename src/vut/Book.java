// D Raphahlelo 223076058
// SM Swana 223430145
// MG MANAKA 223607436
// T Mokhuamathe 223569550
// BB MSIMANGA 223821411 

package vut;


public abstract class Book implements BookSizeDetails {

    private String author;
    private String title;
    private String isbnNo;

    public Book() {
    }

    public Book(String author, String title, String isbnNo) {
        this.author = author;
        this.title = title;
        setIsbnNo(isbnNo);

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public String getIsbnNo() {
        return isbnNo;
    }

    public void setIsbnNo(String isbnNo) {

        //Checking the length of the isbn
        if (isbnNo.length() != 10) {
            throw new IllegalArgumentException("Invalid ISBN : Must be 10 characters.ISBN = " + isbnNo);
        }

        //Checking if the first 9 digits are numbers
        if (!isbnNo.substring(0, 9).matches("\\d{9}")) {
            throw new IllegalArgumentException("Invalid ISBN : The first 9 charatcters must be digits.ISBN = " + isbnNo);
        }

        //checking if the first digit is 0 or 1
        if (!isbnNo.startsWith("0") && !isbnNo.startsWith("1")) {
            throw new IllegalArgumentException("The ISBN number must start with 0 or 1 ");
        }

        //Checking if the last digit is B or b.
        if (!isbnNo.matches("\\d{9}[\\dBb]")) {
            throw new IllegalArgumentException("Invalid ISBN : The last character must be B or b. ISBN = " + isbnNo);
        }

        this.isbnNo = isbnNo;
    }

    @Override
    public abstract String getSizeDetails();

}
