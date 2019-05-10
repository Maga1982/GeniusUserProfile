package plaza.genius.lakshmi.geniususerprofile;

public class Users {
    private String firstName;
    private String lastName;
    private String imageUrl;

    public Users(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }
    public Users(String firstName, String lastName, String imageUrl) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.imageUrl = imageUrl;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
