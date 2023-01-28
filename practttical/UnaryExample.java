class UnaryExample{
public void calcincrement(){
int x=10;
System.out.println(x++);
System.out.println(x++);
System.out.println(++x);
System.out.println(x++);
System.out.println(x);
}
public void calcdecrement(){
int x=10;
System.out.println(x--);
System.out.println(x--);
System.out.println(--x);
System.out.println(--x);
System.out.println(x--);
System.out.println(x);
}
public static void main(String args[]){
UnaryExample id = new UnaryExample();
id.calcincrement();
id.calcdecrement();
}
}
