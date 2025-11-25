public class Iterator {
    public static void main(String[] args){
        ListIterator = list.listIterator();
        System.out.println("Forword traversal-->");
        while(listiterator.hasnext()){
            System.out.println(listIterator.next()+" ");
        }
        System.out.println();
        System.out.println("Backword traversal-->");
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous()+ " ");
        }
    }
}
