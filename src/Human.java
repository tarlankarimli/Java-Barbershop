import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Human {
private  String name, surname, email;
private Integer age, phone;
private Date birthdate;

    //----------------------Contructor-------------------
    public Human(String name, String surname, String email, String birthdate, Integer phone) throws InfoException {
        if (!(email.contains("@") && email.contains("."))) {
            throw new InfoException("Email doesnt contain '@' symbol ");
        }
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        setBirthdate(birthdate);
    }

    // -------------- Setters-----------------
    public void setName(String name) {
        this.name = name;
    }

    public void getBirthday() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.mm.yyyy");
        System.out.println("Birthdate: " + sdf.format(this.birthdate));
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(Integer age) {
        this.birthdate = birthdate;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }
    //---------------------Set birthdate --------------------
    public void setBirthdate (String birthdate) {
        if(isDateValide(birthdate, "dd.mm.yyyy")) {
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("dd.mm.yyyy");
                this.birthdate = sdf.parse(birthdate);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Date is invalid");
        }
        setAge();
    }
    //-----------------Check date is valid or not ------------------
    public boolean isDateValide (String birthdate, String format) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            sdf.setLenient(false);
            sdf.parse(birthdate);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
    //------------------Set age ----------------------
    public void setAge () {
        SimpleDateFormat sdfBirthYear = new SimpleDateFormat("yyyy");
        int birthYear = Integer.parseInt(sdfBirthYear.format(birthdate));
        Date currentDate = new Date();
        SimpleDateFormat sdfCurrentYear = new SimpleDateFormat("yyyy");
        Integer currentYear = Integer.parseInt(sdfCurrentYear.format(currentDate));
        this.age = currentYear - birthYear;
    }


    //-----------------Getters----------------------

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public Integer getPhone() {
        return phone;
    }

    public Integer getAge () {
        return age;
    }
    public Date getBirthdate () {
        return birthdate;
    }

    public String toString () {
        return "Fullname: "  + getName() +" "+getSurname()+
                "\nEmail: " + getEmail() +
                "\nAge: " + getAge() +
                "\nContact: " + getPhone();
    }
}

