package classes;

import java.util.Random;

public class Quiz {

    public int[] fiveQuestions = {-1, -1, -1, -1, -1};
    public String[][] questions = {{"Jakie miasto jest stolicą Hiszpanii?", "Madryt"}, {"Ile nóg ma pająk?", "8"}, {"Ile jest języków urzędowych w Szwajcarii?", "4"}, {"Czym Helge Meyer dostarczał pomoc humanitarną do obleganych miast podczas wojny w Jugosławii?", "Chevroletem Camaro"}, {"Co jaki okres czasu mamy rok przestępny?", "4 lata"}, {"Ile lat ma Maryla Rodowicz?", "Wszystkie"}};
    public String[][] wrongAnswers = {{"Barcelona", "Kordoba"}, {"6", "10"}, {"1", "3"}, {"Śmigłowcem", "Zdobycznym wozem opancerzonym"}, {"3 lata", "5 lat"}, {"84", "78"}};

    public void Losuj(){
        var random = new Random();
        int i = 0;
        while(i>fiveQuestions.length){
            int randomQuestion = random.nextInt(4);
            for(int j=0; j<fiveQuestions.length; j++){
                if (fiveQuestions[j] == randomQuestion) {
                    continue;
                }
                else
                {
                    fiveQuestions[j] = randomQuestion;
                    break;
                }
            }
        }
    }
}
