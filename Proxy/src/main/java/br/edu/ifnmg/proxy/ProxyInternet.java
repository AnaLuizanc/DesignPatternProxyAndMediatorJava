package br.edu.ifnmg.proxy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author analu
 */
public class ProxyInternet extends User implements Internet {

    private static final List<String> bannedSites;
    private final Internet internet = new RealInternet();

    static {
        bannedSites = new ArrayList<>() {
            {
                add("twitter.com");
                add("github.com");
                add("instagram.com");
                add("linkedin.com");
            }
        };
    }

    //<editor-fold defaultstate="collapsed" desc="Construtores">

    public ProxyInternet() {
    }
    
    public ProxyInternet(User user) {
    }
//</editor-fold>

    @Override
    public void connectTo(String host, User user) {
        if (bannedSites.contains(host)) {
            System.out.println("Access denied to " + user.getName() + " to " + host);
            return;
        }
        internet.connectTo(host, user);
    }

}
