class  TypcastingExample{

public static void main(String args[]) {
//Widoning
int x=890;
long z=x;//automitically convert int to long
System.out.println(x);
System.out.println(z);
double y=x;//automitically convert int to double
System.out.println(y);
//Narrowing
double a=87977.45;
int b=(int)a;//coverting double into int
System.out.println(a);
System.out.println(b);
}
}


