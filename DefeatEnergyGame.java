import java.util.*;
public class DefeatEnergyGame{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int noofcities=sc.nextInt();
        int defeatenergy=sc.nextInt();
        int E[]=new int[noofcities];
        int F[]=new int[noofcities-1];
        for(int i=0;i<noofcities;i++){
            E[i]=sc.nextInt();
        }
        for(int j=0;j<noofcities-1;j++){
            F[j]=sc.nextInt();
        }

        int energy=0;
        int city=0;
        int time=0;
        while(energy<defeatenergy && city<noofcities-1){
            energy+=E[city];
            if(energy>=defeatenergy ){
                break;
            }
            time++;
            if(energy>=F[city]){
                energy-=F[city];
                city++;
            }
        }
        time+=(defeatenergy-energy+E[city]-1)/E[city];
System.out.print(time+1);
        }
}