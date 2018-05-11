package br.com.bandtec.app;

// trabalhando com Datas até o Java 7
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasJava7App {

    public static void main(String[] args) throws ParseException {

        // formatando Data
        Date agora = new Date();

        //formatando para dd/mm/aaaa
        //MM em maisculo para ser Mês. mm minusculo é de minutos
        // M ou MM = numero do mês
        // MMM = nome do mês abreviado
        // MMMMM = nome completo do mês
        // hh minusculo = hora em 12hs
        // HH maiusculo = hora em 24hs
        String agoraBonito = new SimpleDateFormat("EEEE dd/MMMM/yy hh:mm a").format(agora);

        System.out.println("Agora: " + agoraBonito);

        //criando uma data a partir de um texto
        String nascimento = "10/05/1995";
        Date dataNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(nascimento);

        System.out.println("nascimento : " + dataNascimento);

        //extraindo informações da data
        Calendar calNascimento = Calendar.getInstance();
        calNascimento.setTime(dataNascimento);

        //recuparando o dia da semana, a partir de 0
        System.out.println("Dia da semana : " + calNascimento.get(Calendar.DAY_OF_WEEK));

        //recuparando o mês do ano, a partir de 0
        System.out.println("Mês : " + calNascimento.get(Calendar.MONTH));

        //operações com datas
        //adcionando 30 dias à data
        calNascimento.add(Calendar.DATE, 30);
        // retorna a data, convertida em tempo legivel
        System.out.println(calNascimento.getTime());

        //adicionando 2 meses à data
        calNascimento.add(Calendar.MONTH, 2);
        // retorna a data, convertida em tempo legivel
        System.out.println(calNascimento.getTime());

        //tirando 15 dias da data
        calNascimento.add(Calendar.DATE, -15);
        System.out.println(calNascimento.getTime());
        
        //diferença entre datas
        Long diferencaMilissegundos = agora.getTime() - dataNascimento.getTime();
        
        System.out.println("Você nasceu há "+diferencaMilissegundos+" milissegundos");

        Long anosDeVida = ((((diferencaMilissegundos/1000)/60)/60)/24)/365;
        
        System.out.println("anos de vida: "+anosDeVida);
    }

}
