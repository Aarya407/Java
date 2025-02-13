class Slip15_1
{
public static void main(String a[])
{
String t_name;
int t_priority;
Thread t=Thread.currentThread();
t_name=t.getName();
System.out.println("\nCurrent thread name:"+t_name);
t_priority=t.getPriority();
System.out.println("\n current thread prirority:"+t_priority);
t.setName("This is my Thread");
t_name=t.getName();
System.out.println("\nNew name is:"+t_name);
}
}
