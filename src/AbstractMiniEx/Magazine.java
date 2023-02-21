package AbstractMiniEx;

public class Magazine extends Media{
    @Override
    public void accessType() {
        System.out.println("Get it from your nearest corner store...");
    }

    @Override
    public void ProductUse() {
        System.out.println("Can be read on a paper or dotted papers for blind people.");
    }


}
