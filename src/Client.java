public class Client {
    RandomListFacade randomListFacade;

    public Client() {
        this.randomListFacade = new RandomListFacade();
    }
    public void getEvenList(int size, int min, int max){
        randomListFacade.printRandomEvenList(size, min, max);
    }
}
