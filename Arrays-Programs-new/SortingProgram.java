class SortingProgram{
    public static void main(String args[]){
        int myArray [] = {10,20,5,6,1};  
        for(int i=0; i<myArray.length; i++){
            for(int j=i+1; j<myArray.length; j++){
                int temp = 0; 
                if(myArray[i]>myArray[j]){
                    temp = myArray[i];    
                    myArray[i] = myArray[j];      
                    myArray[j] = temp;        
                }    
            }
            System.out.println(myArray[i]);            
        }
    }
}