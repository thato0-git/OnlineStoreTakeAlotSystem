
// D Raphahlelo 223076058
// SM Swana 223430145
// MG MANAKA 223607436
// T Mokhuamathe 223569550
// BB MSIMANGA 223821411 


package vut.data;

import org.junit.Test;
import static org.junit.Assert.*;
import vut.EBook;
import vut.PrintBook;


public class ISBNTestClass {

    @Test

    public void testSetIsbnNo067001617B() {

        EBook objPrintBook = new EBook();
        objPrintBook.setIsbnNo("067001617B");
        assertEquals("067001617B", objPrintBook.getIsbnNo());
    }

    @Test

    public void testSetIsbnNo1367823245() {

        PrintBook objPrintBook = new PrintBook();
        objPrintBook.setIsbnNo("1367823245");
        assertEquals("1367823245", objPrintBook.getIsbnNo());
    }

    @Test

    public void testSetIsbnNo198734561B() {

        PrintBook objPrintBook = new PrintBook();
        objPrintBook.setIsbnNo("198734561B");
        assertEquals("198734561B", objPrintBook.getIsbnNo());
    }

    @Test

    public void testSetIsbnNo192156844() {

        PrintBook objPrintBook = new PrintBook();
        objPrintBook.setIsbnNo("192156844");
    }

    @Test

    public void testSetIsbnNo032156B840() {

        EBook objEBook = new EBook();
        objEBook.setIsbnNo("032156B840");
    }

    @Test

    public void testSetIsbnNo032156840b() {

        EBook objEBook = new EBook();
        objEBook.setIsbnNo("032156840b");
        assertEquals("032156840b", objEBook.getIsbnNo());
    }

    @Test 

    public void testSetIsbnNo198734561K() {

        PrintBook objPrintBook = new PrintBook();
        objPrintBook.setIsbnNo("198734561K");
    }

}
