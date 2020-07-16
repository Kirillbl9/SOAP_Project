package soap.model;

import javax.xml.bind.annotation.*;

/*@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "user", propOrder = {
    "name",
    "empId",
    "salary",
        "age"
})*/
@XmlRootElement
public class User {

  //  @XmlElement(required = true)
    protected String name;
    protected int empId;
    protected double salary;
    protected double age;

    public String getName() {
        return name;
    }
    @XmlElement
    public void setName(String value) {
        this.name = value;
    }

    public int getEmpId() {
        return empId;
    }
    @XmlElement
    public void setEmpId(int value) {
        this.empId = value;
    }

    public double getSalary() {
        return salary;
    }
    @XmlElement
    public void setSalary(double value) {
        this.salary = value;
    }

    public double getAge() {
        return age;
    }
    @XmlElement
    public void setAge(double age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", empId=" + empId +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
