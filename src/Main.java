public class Main {
    public static void main(String[] args) {
//        Pair<Integer,String> p1 = new Pair(3,"gaurav");
//        Pair<String,String> p2 = new Pair<String,String>("a","gaurav");
//        System.out.println(p1.getX());
//        System.out.println(p1.getY());
//        System.out.println(p2.getX());
//        System.out.println(p2.getY());

//        int[] arr= {1,2,3};
//        for(int i=0;i<arr.length;i++){
//            for(int j=i;j<arr.length;j++){
//                Pair<Integer,Integer> p = new Pair<>(arr[i],arr[j]);
//                System.out.print(p.getX()+" "+p.getY());
//                System.out.println();
//            }
//        }

        Pair<Integer,Integer>  passingPair = new Pair<>(2,3);
        Pair<Pair<Integer,Integer>,Integer> p1=  new Pair<>(passingPair,5);
        System.out.print(p1.getY());
        System.out.print(p1.getX().getX());
        System.out.println(p1.getY());

    }
}
