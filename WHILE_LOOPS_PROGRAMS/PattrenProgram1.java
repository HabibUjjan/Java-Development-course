class PattrenProgram1{
    public static void main(String Args[]){
    int number = 5;
    int num = 1;    
    while(num<=number){
    int firstColumn = num * num;
    int  secondColumn = num * num * num * num;
    System.out.println(firstColumn + "          " + secondColumn);
    num++; 
    }   
  }
}