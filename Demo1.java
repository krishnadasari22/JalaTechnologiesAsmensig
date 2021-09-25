interface A
{
void test();
}

interface B 
{
void test();
}
class C implements A, B {

    public void test() 
    {
        System.out.println("common to all");
    }
    public A choose(A a){
        return new A(){
           public void test() {
                System.out.println("test of A");
           }
        };
    }
    public B choose(B b){
        return new B(){
           public void test() {
            System.out.println("test of B");
           }
        };
    }
}
class Demo1 {
   public static void main(String[] args) {
   C c =new C();

   A a = new C();
   B b = new B();

   a = c.choose(a);
   b = c.choose(b);

   a.test();
   b.test();
   }
}