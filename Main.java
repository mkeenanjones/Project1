public class Main {
    public static void main(String[] args){
        Session s1 = new Session(1, null, null, null, null, null, null, 0);
        Session s2 = new Session(2, null, null, null, null, null, null, 0);
        Session s3 = new Session(3, null, null, null, null, null, null, 0);
        LinkedList l1 = new LinkedList(s1, new LinkedList(s2, new LinkedList(s3)));


        /*
        IO.println("Original list:");
        printer(l1);
        //test to add session to beginning of list
        l1 = LinkedList.addFirst(s1, l1);
        IO.println("Added session to beginning:");
        printer(l1);
        //test to add session to end of list
        IO.println("Added session to end:");
        l1 = LinkedList.addEnd(s1, l1);
        printer(l1);
        //test to add session
        IO.println("Added session after another:");
        l1 = LinkedList.addAfter(s2,s3, l1);
        printer(l1);
        //test to cancel session
        IO.println("Cancel session");
        l1 = LinkedList.cancel(s2, l1);
        printer(l1);
        //test for minimum session ID
        IO.println(LinkedList.min(l1));
        //test for maximum session ID
        IO.println(LinkedList.max(l1));


    }
    public static void printer(LinkedList list){
        if(list!= null){
            Session current=list.first;
            IO.println(current.toString());
        }
        if(list.rest!=null)
            printer(list.rest);
        */
    }
}
