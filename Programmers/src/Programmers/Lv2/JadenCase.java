package Programmers.Lv2;

public class JadenCase {
    public static void main(String[] args) {
        String s = "3people unFollowed me";
        String result = "";
        boolean flag = true;
        for(String str : s.toLowerCase().split("")){
            
            if(flag){
                result += str.toUpperCase();
            } else {
                result += str;
            }
            
            flag = false;

            if(str.equals(" ")){
                flag = true;
            }
            

        }
        System.out.println(result);

    }
}


/*s = s.toLowerCase();
String[] arr = s.split(" ");
String result = "";
for(int i=0; i<arr.length; i++){
    if(arr[i].charAt(0) >='a' && arr[i].charAt(0)<='z'){
        String temp = "";
        temp += arr[i].substring(0,1).toUpperCase();
        temp += arr[i].substring(1,arr[i].length());
        result += temp+ " ";
    } else {
        result +=arr[i]+ " ";
    }
    
}
result = result.substring(0,result.length()-1);
System.out.println(result);*/