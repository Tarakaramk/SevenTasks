public class PrimeNumbers {
    public void prime(){
        int count,i=0,j=0;
        for(i=2;i<=100;i++){
            count=0;
            for(j=1;j<=i;j++){
                if(i%j==0)
                    count++;
            }
            if(count==2)
                System.out.print(i+" ");
        }
    }
    public void removal(int num,int arr[]){

        int[] array = new int[arr.length-1];
        for(int i=0,k=0;i<arr.length;i++){
            if(i!=num){
            array[k]=arr[i];
            k++;
            }
        }
        for(int i=0;i<array.length;i++) {
            System.out.print(array[i]+" ");
        }
    }
   public void frequency(String name){
        int[] freq = new int[name.length()];
        char ar[] = name.toCharArray();
        int i,j;
        for(i=0;i<name.length();i++) {
            freq[i] = 1;
            for (j = i + 1; j < name.length(); j++) {
                if (ar[i] == ar[j]) {
                    freq[i]++;

                    ar[j] = '0';
                }
            }
        }
       System.out.println("Characters and their corresponding frequencies");
       for(i = 0; i <freq.length; i++) {
           if(ar[i] != ' ' && ar[i] != '0')
               System.out.println(ar[i] + "-" + freq[i]);
       }
   }
}


