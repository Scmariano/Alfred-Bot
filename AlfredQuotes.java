import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name, String dayPeriod) {
        // YOUR CODE HERE
        return String.format("Hi %s, nice to see you in this beautiful %s!", name,dayPeriod );
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        Date  date = new Date();
        return "Current date is:" + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        if(conversation.indexOf("Alexis") > -1){
            return "What can I get for you?";
        }
        if(conversation.indexOf("Alfred") > -1){
            return "Ready to be at your service";
        }
        return "Well I will now serve a different Master!";
    }
}

