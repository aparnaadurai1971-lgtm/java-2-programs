public class main{
public static void main(String[]args){
int marks[]={50,60,70,80,90};
int max = marks[0];
int sum=0;
int failed=0;

for(int m :marks){

sum +=m; 

if(m > max){
   max=m;
}
if(m<35){
    faild++;
   }   
}

double average = (double)sum/marks.length;

System.out.println("Height="+max);
System.out.println("Average="(sum/marks lengths);
System.out.println("Faild="+fail);
}
}