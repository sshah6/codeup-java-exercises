package AbstractMiniEx;

public class News extends Media{
    @Override
    public void accessType() {
        System.out.println("Through a TV or log-in to their website ...");
    }

    @Override
    public void ProductUse() {
        System.out.println("You can read it or watch it...");
    }


}
