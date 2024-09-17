package br.edu.ifnmg.proxy;

/**
 *
 * @author analu
 */
public class RealInternet implements Internet{

    @Override
    public void connectTo(String host, User user) {
        System.out.println(user.getName()+ " is connecting to " + host);
    }   
}