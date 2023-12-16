public class Sms extends Message {
    private String phone; 

    @Override
    public String send() {
        return String.format("Sent from: %s\nMessage:%s",phone);
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.setPhone(phone);
    }


    
}
