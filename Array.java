class Array{
    void display (){
        try {
            int a[] = new int [5];
            a[6] = 5;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("EXCEPTION HANDELED");
    }
    public static void main (String args []){
        Array obj = new Array();
        obj.display();
     }
}
