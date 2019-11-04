
public class Bubblesort{

public static void main(String[] args) {
        // TODO code application logic here     
        int max = 150000; 
        int min = 1; 
        int range = max - min + 1; 
        int sizeVet = 10;
        
        int vet[] = new int[sizeVet];
        //creates a random 
        for (int i = 0; i < sizeVet; i++) {
            vet[i] = (int)(Math.random() * range) + min;            
        }  
        for (int i = 0; i < sizeVet ; i++) {
             vet[i] = tamVet -i;            
        }
        imprimeVet(vet);
        Bubblesort bubble = new Bubblesort();
        bubble.printArr(vet);
        bubble.bublesort(vet); 
        bubble.printArr(vet);
    }
    
    public static void printArr(int arr[]){
        System.out.println("");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(""+arr[i]+"|");            
        }        
    }
    
    public int[] bubblesort(int arr[]){
        System.out.println("\n ...Bubble Sort...");
        int tam = arr.length;        
        for (int out = (tam-1); out > 0; out--) {
            for (int in = 0; in < out; in++) {
                if(arr[in]>arr[in+1]){                    
                    arr = swap(in,(in+1),arr);                    
                }                
            }            
        }        
        return arr;
    }
    public int[] swap(int a, int b, int arr[]){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return arr;
    }
}
