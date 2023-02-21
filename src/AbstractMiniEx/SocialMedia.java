package AbstractMiniEx;

import com.sun.security.jgss.GSSUtil;

public class SocialMedia extends Media {

    protected String name;
    protected int subscriptionPrice;

    public SocialMedia(String name, int subscriptionPrice){
        this.name = name;
        this.subscriptionPrice = subscriptionPrice;
    }

    @Override
    public void accessType() {
        System.out.println("Download the application adn go online...");
    }

    @Override
    public void ProductUse() {
        System.out.println("Can be heard, readable or watchable...");
    }


}
