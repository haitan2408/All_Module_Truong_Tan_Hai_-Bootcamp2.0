package SS11.DSA_Stack_Queue;

import java.util.*;

public class Dem_So_Luong_Tu_Co_Trong_Chuoi {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sn=new Scanner(System.in);
        System.out.print("Enter String: ");
        String s=sn.nextLine();
        s=s.toLowerCase();
        List<String> arr=new ArrayList<>();
        for(int i=0;i<s.length();i++) {
            arr.add(String.valueOf(s.charAt(i)));
        }
        Map<String,Integer> map=new TreeMap<>();
        for(String x: arr){
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }else{
                map.put(x,1);
            }
        }
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            System.out.print(entry.getKey()+":"+entry.getValue()+" ");
        }
    }
}
