package ua.mainacademy;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import ua.mainacademy.service.DocumentExtractorService;
import ua.mainacademy.service.ItemPageParsingService;

public class ApplicationRunner
{
    public static void main( String[] args )
    {
        String url = "https://www.amazon.com/GeForce-i7-10750H-Windows-Keyboard-15-dh1020nr/dp/B087YVJ44P";

        System.out.println(ItemPageParsingService.getItemFromPage(url));

    }
}
