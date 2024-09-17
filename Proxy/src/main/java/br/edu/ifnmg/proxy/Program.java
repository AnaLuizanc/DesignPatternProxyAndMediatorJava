package br.edu.ifnmg.proxy;

/**
 *
 * @author analu
 */
public class Program {

    public static void main(String[] args) {
        User user1 = new User("Ana Zaira");

        Internet internet = new ProxyInternet(user1);
        internet.connectTo("google.com", user1);
        internet.connectTo("instagram.com", user1);
        internet.connectTo("classroom.com", user1);
        internet.connectTo("xbox.com", user1);

        User user2 = new User("Joao Carlos");

        Internet internet2 = new ProxyInternet(user2);
        internet2.connectTo("twitter.com", user2);
        internet2.connectTo("classroom.com", user2);
        internet2.connectTo("cajui.com", user2);

        
    }
}
