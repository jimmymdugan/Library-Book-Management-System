package LibrarySystem;//import org.junit.Test;

//import static org.junit.Assert.*;

import Model.Visit;
import Model.Visitor;

public class VisitTest {

    Visitor visitor1 = new Visitor("Ryan11", "Ryan", "Doe",
            "Global Village", "000000000", 0,false, "");

    Visitor visitor2 = new Visitor("Ryan11", "John", "Apple",
            "UC", "111111111", 2, false, "");


    private Visit visit = new Visit(visitor1, "11", "12", "02/28/2019");

//    @Test
    public void getVisitor() {
//        assertEquals("Ryan", visit.getVisitor().getFirstName());
    }


//    @Test
    public void getTimeIn() {
//        assertEquals(1, visit.getTimeIn());
    }

//    @Test
    public void setTimeIn() {
        visit.setTimeIn("3");
//        assertEquals(3, visit.getTimeIn());
    }

//    @Test
    public void getTimeOut() {
//        assertEquals(2, visit.getTimeOut());
    }

//    @Test
    public void setTimeOut() {
        visit.setTimeOut("6");
//        assertEquals(6, visit.getTimeOut());
    }

//    @Test
    public void getDate() {
//        assertEquals("02/28/2019", visit.getDate());
    }

//    @Test
    public void setDate() {
        visit.setDate("03/01/2019");
//        assertEquals("03/01/2019", visit.getDate());
    }

//    @Test
    public void setVisitor() {
        visit.setVisitor(visitor2);
//        assertEquals("John", visit.getVisitor().getFirstName());
    }
}