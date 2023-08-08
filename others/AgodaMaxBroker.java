package others;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AgodaMaxBroker {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

       
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        //input.next();
        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<n;i++){
            //String s = input.next();
            char command = input.next().charAt(0);
            int bookerId = input.nextInt();
            //System.out.println(command+" "+bookerId);
            if(command!='P'){
               // System.out.println("inside if command "+command);
                if(map.containsKey(bookerId) && map.get(bookerId)>0){
                    if(command=='B'){
                        map.put(bookerId,map.get(bookerId)+1);
                    }else{
                        map.put(bookerId,map.get(bookerId)-1);
                    }
                    
                }else{
                    map.put(bookerId,1);
                }
            }else{
                System.out.println("inside else  "+map);
                int totalBooked=0;
                int totalBookerId=0;

                for(Map.Entry<Integer,Integer> entry:map.entrySet()){
                    if(entry.getValue()>=bookerId){
                        totalBooked+=entry.getValue();
                        totalBookerId++;
                    }
                }
                System.out.println(totalBookerId+" "+totalBooked);
            }
        }
    
    }
}