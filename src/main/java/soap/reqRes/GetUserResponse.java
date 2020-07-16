package soap.reqRes;

import soap.model.User;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "user"
})
@XmlRootElement(name = "getUserResponse")
public class GetUserResponse {

    @XmlElement(required = true)
    protected User user;

    public User getUser() {
        return user;
    }

    public void setUser(User value) {
        this.user = value;
    }

}
