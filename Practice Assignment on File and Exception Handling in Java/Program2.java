import java.util.*;
import java.io.*;
class Program2{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        try{
            File name=new File("Text.txt");
            FileInputStream file=new FileInputStream(name);
            BufferedReader br=new BufferedReader(new InputStreamReader(file));
            String Line;
            int result=0;
            while((Line=br.readLine())!=null)
            {
                if(Line=="")
                {
                    result+=1;
                }
                result+=Line.length();
            }
            System.out.println("Total number of characters in file are:"+result);
            br.close();
            file.close();
        }
        catch(IOException e)
        {
            System.err.println("Error: "+e.getMessage());
        }
    }
}