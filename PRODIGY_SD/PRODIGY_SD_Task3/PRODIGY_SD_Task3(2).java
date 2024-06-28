package com.example;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class MyScrapper {
    public static void main(String[] args)
    {
        try {
            Document doc
                = Jsoup
                      .connect("https://w3.org/")
                      .get();
            Elements links = doc.select("a[href]");
            Elements images = doc.select("img[src]");
            System.out.println("Links: ");
            for (Element link : links) {
                System.out.println(link.attr("href"));
            }
            System.out.println("\n-----\n");
            System.out.println("Images:");
            for (Element image : images) {
                System.out.println(image.attr("src"));
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}