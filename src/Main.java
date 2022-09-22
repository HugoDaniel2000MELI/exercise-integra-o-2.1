import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String cidade[] = {"São Paulo","Nova York", "Rio de Janeiro"};
        int temperatura[][]= {{28, 32}, {23, 30}, {20, 28}};
        int maiorTemperatura = 0;
        int menorTemperatura = 1000;
        int indMaiorTemperatura = 0;
        int indMenorTemperatura = 0;

        for(int a = 0 ; a < temperatura.length; a++ ) {
            for(int b = 0; b < temperatura[a].length; b++){
                if(menorTemperatura > temperatura[a][b]){
                    menorTemperatura = temperatura[a][b];
                    indMenorTemperatura = a;
                }
                if(maiorTemperatura < temperatura[a][b]){
                    maiorTemperatura = temperatura[a][b];
                    indMaiorTemperatura = a;
                }
            }
        }
        System.out.println("Cidade com maior temperatura:" + cidade[indMaiorTemperatura] + " - " + maiorTemperatura);
        System.out.println("Cidade com menor temperatura:" + cidade[indMenorTemperatura] + " - " + menorTemperatura);
    }
}
