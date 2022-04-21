package u.pankratova.ch3;

public class Student {

    private String name;
    private int totalScore;
    private int numberOfQuizzes = 0;

    public Student(String name) {
        this.name = name;
    }

    public void addQuiz(int score){
        totalScore += score;
        numberOfQuizzes++;
        System.out.println("Test " + numberOfQuizzes + ": " + score + " points");
    }

    public int getTotalScore(){
        return totalScore;
    }

    public double getAverageScore(){
        return ((double) totalScore / (double) numberOfQuizzes);
    }


    public String getName() {
        return name;
    }
}

/* test
*
* Test 1: 71 points
* Test 2: 29 points
* Test 3: 53 points
* Test 4: 98 points
* name: Alexander
* total: 251
* average: 62.75
*
* */
