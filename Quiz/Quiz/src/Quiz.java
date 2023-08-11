public class Quiz {
    public static void main(String[] args) {
    	MultipleChoiceQuestion question1 = new MultipleChoiceQuestion(
        		"Do penguins have webbed feet?",
        		"yes and they are adorable",
        		"99",
        		"a duck",
        		"to get to the other side",
        		"To be or not to be, that is the question.",
        		"a");
        	MultipleChoiceQuestion question2 = new MultipleChoiceQuestion(
       			 "What is a duck?",
       			 "a test of knowledge, especially a brief informal test given to students",
       			 "beaver",
       			 "water fowl",
       			 "sarcasm",
       			 "is it a shoe Alex?",
       			 "c");
        	MultipleChoiceQuestion question3 = new MultipleChoiceQuestion(
       			 "how many stars ao tne walk of fame?",
       			 "a billion",
       			 "6",
       			 "flat beer",
       			 "none",
       			 "they are all stars.",
       			 "e");
        	MultipleChoiceQuestion question4 = new MultipleChoiceQuestion(
       			 "What is quark?",
       			 "a really small shoe",
       			 "Halva",
       			 "A bartender on DS9",
       			 "a very small particle",
       			 "a noise a duck makes.",
       			 "d");
        	MultipleChoiceQuestion question5 = new MultipleChoiceQuestion(
       			 "When will the sun come out?",
       			 "after I eat pizza",
       			 "on a rainy day",
       			 "when the switch is thrown",
       			 "when i'm happy",
       			 "tomorrow.",
       			 "e");
        question1.check();
        question2.check();
        question3.check();
        question4.check();
        question5.check();
        
        Question.showResults();
        
        
        Question question1TF = new TrueFalseQuestion("The water is wet.", "TRUE");
        Question question2TF = new TrueFalseQuestion("The sky is blue.", "TRUE");
        Question question3TF = new TrueFalseQuestion("Oil mixes with water.", "FALSE");
        Question question4TF = new TrueFalseQuestion("Meat never spoils.", "FALSE");
        Question question5TF = new TrueFalseQuestion("Vasiline tastes as good as mayonaise.", "FALSE");
        
        question1TF.check();
        question2TF.check();
        question3TF.check();
        question4TF.check();
        question5TF.check();
        
        Question.showResults();
        
    }
}