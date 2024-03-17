public class Person {

        private String name;
        private String surname;
        private String city;
        private String phoneNumber;
        public Person (String name, String surname, String city, String phoneNumber) {
            this.name = name;
            this.surname = surname;
            this.city = city;
            this.phoneNumber = phoneNumber;
        }
        public String personInfo() {
            return "Позвонить гражданину "
                    + name + " " + surname + " из города " + city + " можно по номеру " + phoneNumber + ".";
        }

        public static void main(String[] args) {
            Person person1 = new Person("Will", "Smith", "Нью-Йорк", "2936729462846");
            Person person2 = new Person("Jackie", "Chan", "Шанхай", "12312412412");
            Person person3 = new Person("Sherlock", "Holmes", "London", "37742123513");
            System.out.println(person1.personInfo());
            System.out.println(person2.personInfo());
            System.out.println(person3.personInfo());
        }
    }



