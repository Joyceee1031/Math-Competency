public class School {
    // attributes
    private String name;

    private Address address;

    private String principal;
    private Marks marks;

    // setter and getter
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public void setMarks(Marks marks){
        this.marks = marks;
    }

    public Marks getMarks(){
        return marks;
    }

    public String getName( ) {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public void setNumParticipants(int num) {
        marks = new Marks(num);
    }

}
