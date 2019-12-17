package com.company;

public class Main {

    public static void main(String[] args) {

        //4
        Book[] books = new Book[9500];
        Book book1 = new Book("БИ1", 280, 1994);
        Book book2 = new Book("БИ2", 270, 1994);
        Book book3 = new Book("БИ3", 262, 1994);
        Book book4 = new Book("БИ4", 247, 1994);
        Book book5 = new Book("БИ5", 190, 1994);
        Book book6 = new Book("БИ6", 210, 1994);
        Book book7 = new Book("БИ7", 189, 1994);
        Book book8 = new Book("БИ8", 210, 1994);
        Book book9 = new Book("БИ9", 220, 1994);
        Book book10 = new Book("БИ10", 175, 1994);
        Book book9500 = new Book("БИ9500", 540, 2019);
        for (int i = 1; i <= 10; i++) {
            if (i <= 10)
                System.out.println(book1.price * 50 / 100);
            System.out.println(book2.price * 50 / 100);
            System.out.println(book3.price * 50 / 100);
            System.out.println(book4.price * 50 / 100);
            System.out.println(book5.price * 50 / 100);
            System.out.println(book6.price * 50 / 100);
            System.out.println(book7.price * 50 / 100);
            System.out.println(book8.price * 50 / 100);
            System.out.println(book9.price * 50 / 100);
            System.out.println(book10.price * 50 / 100);
        }

    }
}

class Book {
    String id;
    double price;
    int year;

    public Book(String id, double price, int year) {
        this.id = id;
        this.price = price;
        this.year = year;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }
}


//3

//        BackPack[] backPacks = new BackPack[3];
//        BackPack backPack1 = new BackPack("I contain 20 apples,book and Coca-Cola ");
//        BackPack backPack2 = new BackPack("I have 50 balls for tennis, a folder and a bottle of water");
//        BackPack backPack3 = new BackPack("I have 10 apples, 3 balls for tennis, a folder and Coca-Cola");
//        System.out.println(backPack1.contain);
//        System.out.println(backPack2.contain);
//        System.out.println(backPack3.contain);
//    }
//    }
//
//    class BackPack {
//        String contain;
//
//        public BackPack(String contain) {
//            this.contain = contain;
//        }
//    }


//2
//        LinkedList<Person> list = new LinkedList<>();
//        Person[] people = new Person[4];
//        Person Karina = new Person("Karina", "Kokosova", "Daniyarovna");
//        Person Karina2 = new Person("Karina", "Kokosova", "Daniyarovna");
//        Person Vlad = new Person("Vlad", "Pavlov", "Igorevich");
//        Person Artur = new Person("Artur", "Yanetskiy", "Andreevich");
//        list.add(Karina);
//        list.add(Karina2);
//        list.add(Vlad);
//        list.add(Artur);
//        System.out.println(list.contains(Karina));
//        System.out.println(list.contains(Karina2));
//        System.out.println(list.contains(Vlad));
//        System.out.println(list.contains(Artur));
//        for (int i = 1; i <= people.length; i++) {
//            try {
//                System.out.println(people[i].getFirstName());
//                System.out.println(people[i].getLastName());
//                System.out.println(people[i].getPatronymic());
//            } catch (DoubleInformationException ex) {
//                System.out.println(ex.getMessage());
//            }
//        }
//    }
//}
//class DoubleInformationException extends Exception{
//
//}
//
//class Person{
//    String FirstName;
//    String LastName;
//    String Patronymic;
//
//    public Person(String firstName, String lastName, String patronymic) {
//        FirstName = firstName;
//        LastName = lastName;
//        Patronymic = patronymic;
//    }
//
//    public String getFirstName() {
//        return FirstName;
//    }
//
//    public void setFirstName(String firstName) {
//        FirstName = firstName;
//    }
//
//    public String getLastName() {
//        return LastName;
//    }
//
//    public void setLastName(String lastName) {
//        LastName = lastName;
//    }
//
//    public String getPatronymic() {
//        return Patronymic;
//    }
//
//    public void setPatronymic(String patronymic) {
//        Patronymic = patronymic;
//    }
//
//
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (obj instanceof Person){
//        return ((Person) obj).FirstName.equals(FirstName) && ((Person) obj).LastName == LastName && ((Person) obj).Patronymic == Patronymic;
//    }
//    return false;
//    }
//    @Override
//    public int hashCode() {
//        return Objects.hash(FirstName, LastName, Patronymic);
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "FirstName='" + FirstName + '\'' +
//                ", LastName='" + LastName + '\'' +
//                ", Patronymic='" + Patronymic + '\'' +
//                '}';
//    }
//}


//5
//class LeftPocket {
//}
//class something1 extends LeftPocket{
//   void ring(){
//
//    }
//}
//
//class RightPocket{
//}
//class something2 extends RightPocket implements Rustling{
//
//    @Override
//    public void Rustle() {
//        System.out.println("I feel it's rustling");
//    }
//}
//interface Rustling{
//    void Rustle();
//}


