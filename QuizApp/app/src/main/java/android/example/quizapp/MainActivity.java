package android.example.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int score = 0;
    private int count = 0;

    /**
     * List of variables that contain answers for the Quiz
     */

    private String incorrectAnswer = "Sorry, wrong answer. Try the next question";
    private String incorrectFinal = "Sorry, wrong answer. You have now completed the Quiz";
    private String correctAnswer = "Correct, now try the next question!";
    private String correctAnswerFinal = "Correct. You have now completed the Quiz";
    private String answer1 = "London";
    private String answer2 = "9,000,000";
    private String answer6 = "Channel";
    private String answer7 = "Snowdon";
    private String answer8 = "Manchester United";
    private String correct = "Correct";
    private String incorrect = "Incorrect";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /** Quiz questions */

            displayQuestion1();
            displayQuestion2();
            displayQuestion3();
            displayQuestion4();
            displayQuestion5();
            displayQuestion6();
            displayQuestion7();
            displayQuestion8();
            scoreTitle();
    }

    /**
     * @View pressme onClick button method for question 1
     */

    public void pressme1(View v) {
        EditText answer = findViewById(R.id.answer1);
        String ans = answer.getText().toString().toLowerCase().trim();
        /** If the answer equals the value in the variable answer1. Text entry is trimmed and changed to lower case, as the input may contain capital letters
         *  which will result in an incorrect ans as it will not equal the same word.
         *  Show Toast message and update the score and count whether the answer is correct or not. Make the button inactive to stop the score from being increased. */
        if (ans.equals(answer1.toLowerCase().trim())) {
            score += 1;
            count += 1;
            displayScore(score);
            displayCorrectMark();
            Toast.makeText(this, correctAnswer, Toast.LENGTH_SHORT).show();
            v.setEnabled(false);
        } else {
            Toast.makeText(this, incorrectAnswer, Toast.LENGTH_LONG).show();
            score += 0;
            count += 1;
            displayScore(score);
            displayInCorrectMark();
            v.setEnabled(false);
        }
    }

    /**
     * @View pressme2 onClick button method for question 2
     */

    public void pressme2(View v) {
        RadioButton btn1 = findViewById(R.id.question2_btn1);
        boolean ans1 = btn1.isChecked();
        /** If the correct radio button is selected (which is set to button 1 in this case, show the Toast message. Else show the message, 'answer is incorrect'.
         *  Update the score and also count. Make the button inactive. */
        if (ans1) {
            Toast.makeText(this, "Correct it is approximately " + answer2 + ". Try the next question", Toast.LENGTH_SHORT).show();
            score += 1;
            count += 1;
            displayScore(score);
            displayCorrectMark2();
            v.setEnabled(false);
        } else {
            Toast.makeText(this, incorrectAnswer, Toast.LENGTH_LONG).show();
            score = score + 0;
            count += 1;
            displayScore(score);
            displayInCorrectMark2();
            v.setEnabled(false);
        }
    }

    /**
     * @View pressme3 onClick button method for question 3
     */

    public void pressme3(View v) {
        /** All options provide the correct answer
         *  Update the score and also count. Make the button inactive. */
        CheckBox box1 = findViewById(R.id.question3_box1);
        boolean ans1 = box1.isChecked();

        CheckBox box2 = findViewById(R.id.question3_box2);
        boolean ans2 = box2.isChecked();

        CheckBox box3 = findViewById(R.id.question3_box3);
        boolean ans3 = box3.isChecked();

        if ((ans1) && (ans2) && (ans3)) {
            Toast.makeText(this, correctAnswer, Toast.LENGTH_SHORT).show();
            score += 1;
            count += 1;
            displayScore(score);
            displayCorrectMark3();
            v.setEnabled(false);
        } else {
            Toast.makeText(this, incorrectAnswer, Toast.LENGTH_LONG).show();
            score = score + 0;
            count += 1;
            displayScore(score);
            displayInCorrectMark3();
            v.setEnabled(false);
        }
    }

    /**
     * @View pressme4 onClick button method for question 4
     */

    public void pressme4(View v) {
        /** Question 4 - Option 2 provide the correct answer
         *  Update the score and also count. Make the button inactive. */
        RadioButton btn2 = findViewById(R.id.question4_btn2);
        boolean ans1 = btn2.isChecked();
        if (ans1) {
            Toast.makeText(this, correctAnswer, Toast.LENGTH_SHORT).show();
            score += 1;
            count += 1;
            displayScore(score);
            displayCorrectMark4();
            v.setEnabled(false);
        } else {
            Toast.makeText(this, incorrectAnswer, Toast.LENGTH_LONG).show();
            score = score + 0;
            count += 1;
            displayScore(score);
            displayInCorrectMark4();
            v.setEnabled(false);
        }
    }

    /**
     * @View pressme5 onClick button method for question 5
     */

    public void pressme5(View v) {
        RadioButton btn1 = findViewById(R.id.question5_btn1);
        boolean ans1 = btn1.isChecked();
        /** Question 5 - Option 1 provides the correct answer
         *  Update the score and also the count. Make the button inactive. */
        if (ans1) {
            Toast.makeText(this, correctAnswer, Toast.LENGTH_SHORT).show();
            score += 1;
            count += 1;
            displayScore(score);
            displayCorrectMark5();
            v.setEnabled(false);
        } else {
            Toast.makeText(this, incorrectAnswer, Toast.LENGTH_LONG).show();
            score = score + 0;
            count += 1;
            displayScore(score);
            displayInCorrectMark5();
            v.setEnabled(false);
        }
    }

    /**
     * @View pressme6 onClick button method for question 6
     */

    public void pressme6(View v) {
        EditText answer = findViewById(R.id.answer6);
        String ans = answer.getText().toString().toLowerCase().trim();
        /** Check if the answer equals @variable answer 6 . If the answer contains the value.
         *  Update the score and also the count. */
        if (ans.contains(answer6.toLowerCase().trim()) || (ans.equals(answer6))) {
            score += 1;
            count += 1;
            displayScore(score);
            displayCorrectMark6();
            Toast.makeText(this, correctAnswer, Toast.LENGTH_SHORT).show();
            v.setEnabled(false);
        } else {
            Toast.makeText(this, incorrectAnswer, Toast.LENGTH_LONG).show();
            score += 0;
            count += 1;
            displayScore(score);
            displayInCorrectMark6();
            v.setEnabled(false);
        }
    }

    /**
     * @View pressme7 onClick button method for question 7
     */

    public void pressme7(View v) {
        EditText answer = findViewById(R.id.answer7);
        String ans = answer.getText().toString().toLowerCase().trim();
        /** Check if the answer equals @variable = answer7
         *  Update the score and also the count. */
        if (ans.equals(answer7.toLowerCase().trim()) || (ans.contains(answer7))) {
            score += 1;
            count += 1;
            displayScore(score);
            displayCorrectMark7();
            Toast.makeText(this, correctAnswer, Toast.LENGTH_SHORT).show();
            v.setEnabled(false);
        } else {
            Toast.makeText(this, incorrectAnswer, Toast.LENGTH_LONG).show();
            score += 0;
            count += 1;
            displayScore(score);
            displayInCorrectMark7();
            v.setEnabled(false);
        }
    }

    /**
     * @View pressme7 onClick button method for question 7
     */

    public void pressme8(View v) {

        EditText answer = findViewById(R.id.answer8);
        String ans = answer.getText().toString().toLowerCase().trim();
        /** Check if the answer equals @variable = answer8
         *  Update the score and also the count. */
        if (ans.equals(answer8.toLowerCase().trim()) || (ans.contains(answer8))) {
            score += 1;
            count += 1;
            Log.i("MainActivity", "The score is " + score);
            displayScore(score);
            displayCorrectMark8();
            Toast.makeText(this, correctAnswerFinal, Toast.LENGTH_SHORT).show();
            v.setEnabled(false);
        } else {
            Toast.makeText(this, incorrectFinal, Toast.LENGTH_LONG).show();
            score += 0;
            count += 1;
            displayScore(score);
            displayInCorrectMark8();
            v.setEnabled(false);
        }
        finalScore();
    }

    /**
     * these methods inflate the view, TextView for the questions
     */
    public void displayQuestion1() {
        TextView question1 = findViewById(R.id.question1);
        question1.setText(getString(R.string.question1));
    }

    public void displayQuestion2() {
        TextView question2 = findViewById(R.id.question2);
        question2.setText(getString(R.string.question2));
    }

    public void displayQuestion3() {
        TextView question2 = findViewById(R.id.question3);
        question2.setText(getString(R.string.question3));
    }

    public void displayQuestion4() {
        TextView question4 = findViewById(R.id.question4);
        question4.setText(getString(R.string.question4));
    }

    public void displayQuestion5() {
        TextView question5 = findViewById(R.id.question5);
        question5.setText(getString(R.string.question5));
    }

    public void displayQuestion6() {
        TextView question6 = findViewById(R.id.question6);
        question6.setText(getString(R.string.question6));
    }

    public void displayQuestion7() {
        TextView question7 = findViewById(R.id.question7);
        question7.setText(getString(R.string.question7));
    }

    public void displayQuestion8() {
        TextView question8 = findViewById(R.id.question8);
        question8.setText(getString(R.string.question8));
    }

    public void scoreTitle() {
        TextView scoreTitle = findViewById(R.id.scorelayout);
        scoreTitle.setText(getString(R.string.scorelayout));
    }

    public void displayScore(int score) {
        TextView scoreval = findViewById(R.id.scorevalue);
        scoreval.setText(String.valueOf(score));
    }

    /**
     * TextView is activated once check button is pressed. These present a successful mark or otherwise
     */

    public void displayCorrectMark() {
        TextView markCorrect = findViewById(R.id.mark);
        markCorrect.setTextColor(getResources().getColor(R.color.correctmark));
        markCorrect.setText(correct);
    }

    public void displayInCorrectMark() {
        TextView markInCorrect = findViewById(R.id.mark);
        markInCorrect.setTextColor((getResources().getColor(R.color.incorrectmark)));
        markInCorrect.setText(incorrect);
    }

    public void displayCorrectMark2() {
        TextView markCorrect = findViewById(R.id.mark2);
        markCorrect.setText(correct);
        markCorrect.setTextColor(getResources().getColor(R.color.correctmark));
    }

    public void displayInCorrectMark2() {
        TextView markInCorrect = findViewById(R.id.mark2);
        markInCorrect.setText(incorrect);
        markInCorrect.setTextColor((getResources().getColor(R.color.incorrectmark)));
    }

    public void displayCorrectMark3() {
        TextView markCorrect = findViewById(R.id.mark3);
        markCorrect.setText(correct);
        markCorrect.setTextColor(getResources().getColor(R.color.correctmark));
    }

    public void displayInCorrectMark3() {
        TextView markInCorrect = findViewById(R.id.mark3);
        markInCorrect.setText(incorrect);
        markInCorrect.setTextColor((getResources().getColor(R.color.incorrectmark)));
    }

    public void displayCorrectMark4() {
        TextView markCorrect = findViewById(R.id.mark4);
        markCorrect.setText(correct);
        markCorrect.setTextColor(getResources().getColor(R.color.correctmark));
    }

    public void displayInCorrectMark4() {
        TextView markInCorrect = findViewById(R.id.mark4);
        markInCorrect.setText(incorrect);
        markInCorrect.setTextColor((getResources().getColor(R.color.incorrectmark)));
    }


    public void displayCorrectMark5() {
        TextView markCorrect = findViewById(R.id.mark5);
        markCorrect.setText(correct);
        markCorrect.setTextColor(getResources().getColor(R.color.correctmark));
    }

    public void displayInCorrectMark5() {
        TextView markInCorrect = findViewById(R.id.mark5);
        markInCorrect.setText(incorrect);
        markInCorrect.setTextColor((getResources().getColor(R.color.incorrectmark)));
    }


    public void displayCorrectMark6() {
        TextView markCorrect = findViewById(R.id.mark6);
        markCorrect.setText(correct);
        markCorrect.setTextColor(getResources().getColor(R.color.correctmark));
    }

    public void displayInCorrectMark6() {
        TextView markInCorrect = findViewById(R.id.mark6);
        markInCorrect.setText(incorrect);
        markInCorrect.setTextColor((getResources().getColor(R.color.incorrectmark)));
    }

    public void displayCorrectMark7() {
        TextView markCorrect = findViewById(R.id.mark7);
        markCorrect.setText(correct);
        markCorrect.setTextColor(getResources().getColor(R.color.correctmark));
    }

    public void displayInCorrectMark7() {
        TextView markInCorrect = findViewById(R.id.mark7);
        markInCorrect.setText(incorrect);
        markInCorrect.setTextColor((getResources().getColor(R.color.incorrectmark)));
    }

    public void displayCorrectMark8() {
        TextView markCorrect = findViewById(R.id.mark8);
        markCorrect.setText(getResources().getText(R.string.correct));
        markCorrect.setTextColor(getResources().getColor(R.color.correctmark));
    }

    public void displayInCorrectMark8() {
        TextView markInCorrect = findViewById(R.id.mark8);
        markInCorrect.setText(incorrect);
        markInCorrect.setTextColor((getResources().getColor(R.color.incorrectmark)));
    }

    public void finalScore() {
        Toast.makeText(this, "You're final score is " + score + ". You answered " + count + " questions out of 8", Toast.LENGTH_LONG).show();
    }
}

