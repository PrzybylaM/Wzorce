package cebulaDeal;

import javax.security.auth.Subject;

public class AdultObserver {
    private ShopBasket subject;

    public AdultObserver(ShopBasket shopBasket) {
        this.subject = shopBasket;
        this.subject.subscribeAdultObserver(this);
    }


    void onUpdate(User user) {
        if (user.getUserAge() > 18){
            System.out.println("User is adult");
        }else{
            System.out.println("User is underage");
        }
    }
}
