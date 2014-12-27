package mironyuk.roma.guessbrands.guessbrandsm.Models;

/**
 * Created by Roma on 13.12.2014.
 */
public class ItemProgress {
    private String level;
    private int progress;


    public ItemProgress(String l, int p) {
        this.level = l;
        this.progress = p;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String details) {
        this.level = details;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int price) {
        this.progress = price;
    }

}