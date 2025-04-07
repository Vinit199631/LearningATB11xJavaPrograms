package ex_18_OOPs_Inheritance.single_inheritance;

public class TestCase1 extends CommonToAll {

    void runningTC1(){
        startBrowser();
        readDataBAseFile();
        readExcelFile();
        System.out.println("Running TC1");
        closeBrowser();
    }


}
