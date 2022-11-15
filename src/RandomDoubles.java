public class RandomDoubles {
    double[] arr = new double[10];

    public void Numbers(){
        double a;
        double mean=0;
        double temp=0;
        double length=arr.length;
        double max= arr[0];
        for(int i=0;i<10;i++){
            a=Math.random();
            arr[i]=a;
            System.out.println(arr[i]);
            if(arr[i]>max)
                max = arr[i];

            mean=mean+arr[i];
        }
        double min=arr[0];
        for(int i=1;i<length;i++){
            if(arr[i]<min) {
                min = arr[i];
            }
        }

        mean=mean/ arr.length;
        System.out.println("Maximum: "+max);
        System.out.println("Minimum: "+min);
        System.out.println("Mean: "+mean);

        for(int i=0;i<length;i++)
            for(int j=1;j<length-i;j++){
                if(arr[j-1]>arr[j]){
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        System.out.println("Bubble sort");
        for(int i=0;i<length;i++){
            System.out.print(arr[i]+" ");
        }

    }


}
