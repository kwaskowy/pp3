public class Sms extends Message {
    private String phone; 

    @Override
    public String send() {
        return String.format("Sent from: %s\nMessage:%s",phone,getText());
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public Sms(String content, String phoneNumber){
        super(content);
        this.setPhone(phoneNumber);
    }

    public static void main(String[] args) {
        Sms sms1 = new Sms("Siema eniu", "+48234561987");
        Sms sms2 = new Sms("Dobrze jes, dobrze robiom chlopaki", "+123732470");
        System.out.println(sms1.send());
        System.out.println(sms2.send());

    }
}
