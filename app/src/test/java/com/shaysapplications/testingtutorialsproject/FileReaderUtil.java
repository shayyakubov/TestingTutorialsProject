package com.shaysapplications.testingtutorialsproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;

public class FileReaderUtil {
    public static String readFile(ClassLoader classLoader, String fileName){
        String result="";
        try{
            URL resoure = classLoader.getResource(fileName);
            File f = new File(resoure.toURI());
            Scanner in = new Scanner(new FileReader(f));
            StringBuilder stringBuilder= new StringBuilder();
            while(in.hasNext()){
                stringBuilder.append(in.nextLine());
            }
            result = stringBuilder.toString();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (URISyntaxException e){
            e.printStackTrace();
        }

        return result;
    }
}
