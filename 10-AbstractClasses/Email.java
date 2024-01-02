public class Email extends Message {
    private String subject;
    private String mailTo;
    @Override
    public String send() {
        return String.format("Mail to: %s\nSubject: %s\nMessage: %s", mailTo, subject, getText());
    }
    public Email(String text, String subject, String mailTo) {
        super(text);
        this.subject = subject;
        this.mailTo = mailTo;
    }
    
    public static void main(String[] args) {
        Email email1 = new Email("Google mail delivery subsystem couldn`t delivery your message because remote server is misconfigured", "message could not be delivered", "biuro@firma.pl");
        Email email2 = new Email("WIN BRAND NEW IPHONE MAN FREEE MONEY HERE", "WE MAKIN IT OUTTA HOOD WIT THIS ONE", "yoursoldemail@gmail.com");
        System.out.println(email1.send());
        System.out.println();
        System.out.println(email2.send());
    }
    
    
    
}
