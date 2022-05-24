package practicas;

public class Emprestimo {
    public static int getDuasParcelas(){
        return 2;
    }
    public static int getTresParcelas(){
        return 3;
    }
    public static double getTaxaDuasParcelas(){
        return 0.5;
    }
    public static double getTaxaTresparcelas(){
        return 0.45;
    }
    public static void calcular(double valor, int parcelas){
        if(parcelas ==2){
            double valorfinal=valor + (valor * getTaxaDuasParcelas());
            System.out.println("valor final de emprestimo para 2 parcelas es: " +valorfinal);

        }else if (parcelas==3){
            double valorfinal= valor + (valor * getTaxaTresparcelas());
            System.out.println("valor final de emprestimo para 3 parcelas es: " +valorfinal);
        }else {
            System.out.println("Quantidade de parcelas não aceita");
        }


    }

}
