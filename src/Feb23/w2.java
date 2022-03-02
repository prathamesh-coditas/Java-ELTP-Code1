package Feb23;

public class w2 {
    public static void main(String[] args) {
        int[] arr = new int[]{ 65,29,56,34};
        int n= arr.length;
        int [] arr1= new int[n];
        int input;
        String out="";
        for( int i=0;i<n-1;i++){
            input=arr[i];
            String result = Integer.toBinaryString(input);
            String result1="";
            if(result.charAt(i) == '0'){
                result1 += '1';}
            else if(result.charAt(i) == '1'){
                result1 +='0';}
            System.out.println(result);
            int number = Integer.parseInt(result,2);
            arr1[i]+=number;
        }
     for( int i=0;i<n-1;i++){
         System.out.println(arr1[i]);
      }
    }
}
