package com.arman.gambit.objects;

import com.arman.gambit.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by arman on 3/12/16.
 */
public class CustomCard {

    private String title = "No Title";
    private int image;
    private int icon;

    public CustomCard(String title, int image, int icon) {
        this.title = title;
        this.image = image;
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public static List<CustomCard> generateCards() {
        List<CustomCard> cards = new ArrayList<>();
        cards.add(new CustomCard("A title for card", R.drawable.canada, android.R.drawable.ic_lock_idle_lock));
        cards.add(new CustomCard("Another title for card", R.drawable.germany, android.R.drawable.stat_sys_speakerphone));
        cards.add(new CustomCard("Another long title for the third card", R.drawable.sweden, android.R.drawable.btn_dialog));
        return cards;
    }
}
