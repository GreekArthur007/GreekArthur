class Lcm
{
public static void main(String[] args)
{
int n1=22,n2=12,lcm;
lcm=(n1>n2)?n1:n2;
while(true){
if(lcm % n1==0 && lcm % n2==0)
{
System.out.println("the lcm of is "+lcm);
break;
}
++lcm;
}
}
}
