package lovepower.hellospring.concept;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;

/*
public class JavaIOExam01 {
    public static void main(String[] args) {
        String filepath = "C:\\Users\\EUNJILEE\\Desktop\\readertest.txt";
//        String outPath = ;

        //1. BufferReader의 readLine()
        //2. 화면출력 : System.out
        //3. IO객체는 다 사용하면 close
        //4. 3번의 close > try with resources -> 자동close

        URL url = null;
        try {
            new URL("https://www.naver.com");

        }catch (Exception e){

        }
        try(
            */
/*BufferedReader br = new BufferedReader(new FileReader(filepath));*//*

            PrintWriter pw = new PrintWriter(new File(filepath));
            ){
            String line = null;
            while ((line = br.readLine()) !=null){
                System.out.println(line);
            }
        }catch(IOException ioe){
            System.out.println("finally block");
        }


    }
}*/
