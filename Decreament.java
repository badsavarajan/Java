class Decreament{
public static void main(String[] arg){

int a=10;
int b=20;
int c=(--b)+(--a);
c--;
--a;
b--;
System.out.println("a : "+ (a--));
System.out.println("b+c: "+  (b+c));
System.out.println("b :  "+  (--b));
System.out.println("a+b: "+ (a+b));

}
}