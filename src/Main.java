import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String cidades[] = {"Londres", "Madrid", "Nova York", "Buenos Aires", "Assunción", "São Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"};
        int[][] temperatura = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};
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
        System.out.println("Cidade com maior temperatura : " + cidades[indMaiorTemperatura] + " = " + maiorTemperatura + "° celsius");
        System.out.println("Cidade com menor temperatura :" + cidades[indMenorTemperatura] + " = " + menorTemperatura + "° celsius");
    }
}
