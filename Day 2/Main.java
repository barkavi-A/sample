public class Main {

    public static void main(String[] args) {
       

        String arr[] ={"Flower","Flight","Flow"};

        String firstIndex = arr[0];
        String lastIndex = arr[arr.length-1];
        int count =0;
        int loopCount = firstIndex.length()-1;

        while(true){
        
            for(int i=0;i<loopCount;i++){
                if(firstIndex.charAt(i)== lastIndex.charAt(i)){
                    count +=1;
                }
                else{
                    
                }
            }
        }
    


    }
    
}
