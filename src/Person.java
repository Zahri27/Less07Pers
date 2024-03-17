public class Person {

        private String name;
        private String surname;
        private String city;
        private String phoneNumber;


        public Person(String name, String surname, String city, String phoneNumber) {
            this.name = name;
            this.surname = surname;
            this.city = city;
            this.phoneNumber = phoneNumber;
        }
        public static String personInfo(String name, String surname, String city, String phoneNumber) {
            return "Позвонить гражданину "
                    + name + " " + surname + " из города " + city + " можно по номеру " + phoneNumber + ".";
        }

        public static void main(String[] args) {
          String person1Info =  Person.personInfo ("Will", "Smith", "Нью-Йорк", "2936729462846");
            String person2Info =  Person.personInfo ("Jackie", "Chan", "Шанхай", "12312412412");
            String person3Info =  Person.personInfo("Sherlock", "Holmes", "London", "37742123513");
            System.out.println(person1Info);
            System.out.println(person2Info);
            System.out.println(person3Info);
        }
    }



