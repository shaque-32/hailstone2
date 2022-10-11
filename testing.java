public class testing {
    
    
    public static void main (String[]args){
        hailstone();
    }


    public static void hailstone(){
        int check = 0;
        int max = 0;
        int place = 0;
        for (int i=1; i<=200;i++){
            int x = i;
            int counter = 0;

            while(x != 1){
            if (x % 2 == 0){
                check = x/2;
                x=check;
                counter ++;
    
            } else if(x % 2 == 1){
                check = (x*3) + 1;
                x = check;
                counter++;
            }

            
        }
        if (counter > max){
            place = i;
            max = counter;
            
            
        }
        //System.out.println(i + ") Number of Iterations: " + counter);

    
        }
        System.out.println( "The Max interations happens with " + max + " it has " + place + " iterations.");

    }
        
    
    }
    