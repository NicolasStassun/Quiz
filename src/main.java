import javax.swing.*;

public class main {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,"Seja bem-vindo ao quiz sobre NBA");
        int jogar = Integer.parseInt(JOptionPane.showInputDialog("""
                1 - Jogar
                2 - Sair
                """));
        if (jogar == 1){

            quiz();

        }


    }
    public static void quiz(){

        int acertos=0;

        //Questão 1

        int quiz1 = Integer.parseInt(JOptionPane.showInputDialog("""
                Qual o maior pontuador da NBA:
                1 - Lebron James   2 - Kobe Bryant
                3 - Michael Jordan 4 - Kareem Abdul-Jabbar
                """));
        if (quiz1==1){

            JOptionPane.showMessageDialog(null,"Correto");
            acertos++;

        }
        else{
            JOptionPane.showMessageDialog(null,"Incorreto");
        }

        //Questão 2

        int quiz2 = Integer.parseInt(JOptionPane.showInputDialog("""
                Qual o maior arremeçador de 3 pontos da NBA:
                1 - Michael Jordan 2 - Klay Thompson
                3 - Stephen Curry  4 - Ray Allen
                """));
        if (quiz2==3){

            JOptionPane.showMessageDialog(null,"Correto");
            acertos++;

        }
        else{
            JOptionPane.showMessageDialog(null,"Incorreto");
        }

        //Questão 3

        int quiz3 = Integer.parseInt(JOptionPane.showInputDialog("""
                Qual o time com mais títulos da NBA:
                1 - Lakers     2 - Celtics
                3 - Warriors   4 - Lakers e Celtics
                """));
        if (quiz3==4){

            JOptionPane.showMessageDialog(null,"Correto");
            acertos++;

        }
        else{
            JOptionPane.showMessageDialog(null,"Incorreto");
        }

        //Questão 4

        int quiz4 = Integer.parseInt(JOptionPane.showInputDialog("""
                Qual o maior pontuador em uma partida da NBA:
                1 - Lebron James     2 - Kobe Bryant
                3 - Donovan Mitchell 4 - Wilt Chamberlain
                """));
        if (quiz4==4){

            JOptionPane.showMessageDialog(null,"Correto");
            acertos++;

        }
        else{
            JOptionPane.showMessageDialog(null,"Incorreto");
        }

        //Questão 5

        int quiz5 = Integer.parseInt(JOptionPane.showInputDialog("""
                Qual desses jogadores jogou pelo Cavaliers:
                1 - Lebron James     2 - Kobe Bryant
                3 - Michael Jordan   4 - Wilt Chamberlain
                """));
        if (quiz5==1){

            JOptionPane.showMessageDialog(null,"Correto");
            acertos++;

        }
        else{
            JOptionPane.showMessageDialog(null,"Incorreto");
        }

        //Questão 6

        int quiz6 = Integer.parseInt(JOptionPane.showInputDialog("""
                Qual desses jogadores jogou pelo Bucks:
                1 - Michael Jordan   2 - Giannis Antetokoumpo
                3 - Damian Lillard   4 - Wilt Chamberlain
                """));
        if (quiz6==2){

            JOptionPane.showMessageDialog(null,"Correto");
            acertos++;

        }
        else{
            JOptionPane.showMessageDialog(null,"Incorreto");
        }

        //Questão 7

        int quiz7 = Integer.parseInt(JOptionPane.showInputDialog("""
                Qual desses jogadores jogou pelo Bulls:
                1 - Michael Jordan   2 - Giannis Antetokoumpo
                3 - Damian Lillard   4 - Wilt Chamberlain
                """));
        if (quiz7==1){

            JOptionPane.showMessageDialog(null,"Correto");
            acertos++;

        }
        else{
            JOptionPane.showMessageDialog(null,"Incorreto");
        }
        //Questão 8

        int quiz8 = Integer.parseInt(JOptionPane.showInputDialog("""
                Qual desses jogadores jogou pelo Nuggets:
                1 - Michael Jordan   2 - Giannis Antetokoumpo
                3 - Nikola Jokic     4 - Wilt Chamberlain
                """));
        if (quiz8==3){

            JOptionPane.showMessageDialog(null,"Correto");
            acertos++;

        }
        else{
            JOptionPane.showMessageDialog(null,"Incorreto");
        }

        //Questão 9

        int quiz9 = Integer.parseInt(JOptionPane.showInputDialog("""
                Qual desses jogadores jogou pelo Suns:
                1 - Michael Jordan   2 - Giannis Antetokoumpo
                3 - Devin Booker     4 - Wilt Chamberlain
                """));
        if (quiz9==3){

            JOptionPane.showMessageDialog(null,"Correto");
            acertos++;

        }
        else{
            JOptionPane.showMessageDialog(null,"Incorreto");
        }

        //Questão 10

        int quiz10 = Integer.parseInt(JOptionPane.showInputDialog("""
                Qual desses jogadores jogou pelo Mavericks:
                1 - Michael Jordan   2 - Giannis Antetokoumpo
                3 - Nikola Jokic     4 - Kyrie Irving
                """));
        if (quiz10==4){

            JOptionPane.showMessageDialog(null,"Correto");
            acertos++;

        }
        else{
            JOptionPane.showMessageDialog(null,"Incorreto");
        }

        JOptionPane.showMessageDialog(null,"Você acertou: "+acertos+"\n" +
                "Você errou: "+ (-0)+(acertos-10)+"\n");

    }


}
