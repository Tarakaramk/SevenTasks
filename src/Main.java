public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        int num=5;
        int[] arr = {3,1,12,7,34,5,9,6,13,19};
        RandomDoubles ob = new RandomDoubles();
        ob.Numbers();
        System.out.println("");
        System.out.println("prime numbers:");
        PrimeNumbers pn = new PrimeNumbers();
        pn.prime();
        System.out.println("");
        System.out.println("array removing index");
        pn.removal(num,arr);
        System.out.println("");
        pn.frequency("tarakakoppada");
        System.out.println("Even Numbers");
        EvenIterator ei = new EvenIterator();
        ei.numberIterator();
        System.out.println("Unique Number first index");
        UniqueNumber un = new UniqueNumber();
        System.out.println((char)un.uniqueFrequency("welcome to the netcracker"));
    }
}