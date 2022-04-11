package vongLap;

public class SoNtdautien {

    public static void main(String[] args){
        String str= "Là SNT";
        int count= 1;
        int n=2;
        while (count <=20) {
            str="Là SNT";
            for (int i=2;i<n;i++) {
                if (n%i==0) {
                    str= "Không phải số nguyên tố";
                    break;
                }
            }
            if (str .equals("Là SNT")) {
                System.out.println(n);
                count++;
            }
            n++;
            }
        }
    }

