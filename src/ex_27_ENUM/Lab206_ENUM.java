package ex_27_ENUM;

public class Lab206_ENUM {



    public static void main(String[] args) {

        System.out.println(Locators.page_button.getLocators());
        System.out.println(Locators.page_input.getLocators());

        System.out.println(" -- ");
        System.out.println(Colors.RED.getHexCode());
        System.out.println(Colors.GREEN.getHexCode());


        System.out.println(" -- ");
        System.out.println(APIURLs.google.getUrl());
        System.out.println(APIURLs.vwo.getUrl());
        System.out.println(APIURLs.katalon.getUrl());


    }
}
