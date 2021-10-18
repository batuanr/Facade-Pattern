public class RandomListFacade {
    private ListFilter listFilter;
    private ListPrinter listPrinter;
    private RandomList randomList;
    private RandomNumber randomNumber;

    public RandomListFacade() {
        this.listFilter = new ListFilter();
        this.listPrinter = new ListPrinter();
        this.randomList = new RandomList();
        this.randomNumber = new RandomNumber();
    }

    public void printRandomEvenList(int size,int min, int max){
        listPrinter.printList(listFilter.filterOdd(randomList.generateList(size,min, max)));
    }
}
