package src.MagazineStuff;

public class MagazineRack {
    private Link head;
    public int displayCount = 1;
    
    public MagazineRack(Link head) {
        this.head = head;
    }
    
    public void displayRack(Link start) {
        boolean isNotNull = true;
   
        while (isNotNull) {
            if(start.getNext() == null) {
                isNotNull = false;
                System.out.println(displayCount + " -- " + ((Magazine)start.getItem()).getName());
                displayCount++;
            }
            else {
                System.out.println(displayCount + " -- " + ((Magazine)start.getItem()).getName());
                displayCount++;
                displayRack(start.getNext());
                isNotNull = false;
            }      
        }

        displayCount = 1;
    }

   public Link getNull(Link start) {
        if(start.getNext() == null) {
            return start;
        }
        else {
            return getNull(start.getNext());
        }
        

    }

    public Magazine chooseItem(Link start, int count) {
        if(count > 1) {
            count--;
            return chooseItem(start.getNext(), count);
            
        }
        return (Magazine)start.getItem();
        

    }
    public void removeItem() {

    }
    public void insertItem(Object item) {

    }
    public Link getHead() {
        return head;
    }

}
