package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//Создать новую базу данных с помощью MySQLWorkbench. Создать Maven-проект и настроить его правильно.
// Создать файл с настройками hib.xml. И создать класс Animal(int age, String name, boolean tail)
// с методами get и set,
// как сущность к нашей таблице. И с помощью hibernate создать новую таблицу с начальным значением.
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setAge(31);
        animal.setName("Alyona");
        animal.setTail(true);


        SessionFactory factory = new Configuration()
                .configure("hib.xml")
                .buildSessionFactory();

        Session session = factory.openSession();

        session.beginTransaction();
        session.save(animal);
        session.getTransaction().commit();
        session.close();
    }



}
