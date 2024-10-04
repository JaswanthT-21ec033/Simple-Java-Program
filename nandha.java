class nandha {
    private int students =3000;
    String str="engineering";
    void print(){
        System.out.println("Nandha engineering students");
    }
    class product {
        void print1(){
            System.out.println("Product batch "+students);
        }
    }
}
class Main{
    public static void main(String[]args){
        nandha obj = new nandha();
        System.out.println(obj.str);
        obj.print();
        nandha.product obj1=obj.new product();
        obj1.print1();
    }
}