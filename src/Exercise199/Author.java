package Exercise199;

public class Author {
   private String surname;
   private String nationality;


   public Author(String surname, String nationality) {
      this.surname = surname;
      this.nationality = nationality;
   }

   public String getNationality() {
      return nationality;
   }

   public String getSurname() {
      return surname;
   }
}

