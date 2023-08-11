import javax.swing.JOptionPane;


public class TrueFalseQuestion extends Question {
	String ask() {
		while (true) {
			String answer = JOptionPane.showInputDialog(question);
            answer = answer.toUpperCase();
            if (answer.equals("F") || answer.equals("f")||answer.equals("false")||answer.equals("FALSE") ||answer.equals("n") ||answer.equals("no")|| answer.equals("N") || answer.equals("NO")) {
                answer = "FALSE";
            } else if (answer.equals("t") || answer.equals("true") || answer.equals("T")||answer.equals("True") ||answer.equals("TRUE") ||answer.equals("y")||answer.equals("yes") ||answer.equals("Y") ||answer.equals("Yes") ||answer.equals("YES")) {
                answer = "TRUE";
            } else {
                System.out.println("Invalid answer. Please enter TRUE or FALSE.");
            }		return answer;
        }
    }
	
TrueFalseQuestion(String question, String answer) {
	this.question = "TRUE or FALSE: " + question;
	answer = answer.toUpperCase();
	if (answer.equals("F") || answer.equals("f")||answer.equals("false")||answer.equals("FALSE") ||answer.equals("n") ||answer.equals("no")|| answer.equals("N") || answer.equals("NO")) {
        correctAnswer = "FALSE";
    } else if (answer.equals("t") || answer.equals("true") || answer.equals("T")||answer.equals("True") ||answer.equals("TRUE") ||answer.equals("y")||answer.equals("yes") ||answer.equals("Y") ||answer.equals("Yes") ||answer.equals("YES")) {
        correctAnswer = "TRUE";
    } else {
        System.out.println("Invalid answer. Please enter TRUE or FALSE.");
        
    }
  } 
}

