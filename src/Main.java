public class Main {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();

        listInteger.add(0,1);
        listInteger.add(1,2);
        listInteger.add(2,3);

        System.out.println(listInteger.size());
        System.out.println(listInteger.get(1));

        listInteger.remove(1);
        System.out.println( listInteger.indexOf(3));

        System.out.println(listInteger.contains(5));

        listInteger.clear();

        System.out.println(listInteger.size());
    }
}