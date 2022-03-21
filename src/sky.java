public class sky {
    void method(){
        System.out.println("u r mine");
    }
}
class moon extends sky{
    @Override
    void method() {
        super.method();
        System.out.println("hey buddy");
    }
}
public class Main{
    public static void main(String[] args) {
        sky obj=new moon ();
        obj.method();
    }

}
