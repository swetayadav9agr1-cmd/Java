class program2{
   int a,b,c;
   program2(){
    System.out.println("Default");
   } 
   program2(int a){
    this.a=a;
   }
   program2(int a,int b){
    this.a=a;
    this.b=b;
   }
   program2(int a,int b,int c){
    this.a=a;
    this.b=b;
    this.c=c;
   }
   public static void main(String[] args){
    program2 obj1=new program2();
    program2 obj2=new program2(10);
    System.out.println(obj2.a+" "+obj2.b+" "+obj2.c);
    program2 obj3=new program2(10,20);
    System.out.println(obj3.a+" "+obj3.b+" "+obj3.c);
    program2 obj4=new program2(10,20,30);
    System.out.println(obj4.a+" "+obj4.b+" "+obj4.c);
   }
}