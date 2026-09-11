public class LinkedList{
    Session first;
    LinkedList rest;
    private Session head;

    //constructor
    public LinkedList(){}
    public LinkedList(Session first, LinkedList rest){
        this.first = first;
        this.rest = rest;
    }
    public LinkedList(Session first){
        this.first = first;
        this.rest = null;
    }


    //adds new session to beginning
    public static LinkedList addFirst(Session added, LinkedList list){
        if(list==null)
            return new LinkedList(added);
        return new LinkedList(added, list);
    }
    //adds new session to end
    public static LinkedList addLast(Session added, LinkedList list){
        if(list==null)
            return new LinkedList(added, null);
        return new LinkedList(list.first, LinkedList.addLast(added, list.rest));
    }
    //adds session after another session
    public static LinkedList insertAfter(Session added, LinkedList list){
        if(list==null){
            return new LinkedList(added, null);
        }
        Session session = list.first;
        Session after = list.rest.first;
        if((session.getSessionID() < added.getSessionID())&&(added.getSessionID()<after.getSessionID())){
            return new LinkedList(session, new LinkedList(added, list.rest));
        }
        return new LinkedList(list.first, LinkedList.insertAfter(added, list.rest));
    }
    //cancels session
    public static LinkedList cancel(Session session, LinkedList list){
        if(list.first == session)
            return new LinkedList(list.rest.first, list.rest.rest);
        return new LinkedList(list.first, LinkedList.cancel(session, list.rest));
    }
    //returns length of list
    public static int listLen(LinkedList list){
        if (list == null)
            return 0;
        return 1 + listLen(list.rest);
    }
    //find minimum session ID
    public static Session min(LinkedList list){
        if (list.rest == null){
            return list.first;
        }
        Session minimum = min(list.rest);
        if (list.first.getSessionID() < minimum.getSessionID()){
            return list.first;
        }
        return minimum;
    }
    //find maximum session ID
    public static Session max(LinkedList list){
        if (list.rest == null){
            return list.first;
        }
        Session maximum = max(list.rest);
        if (list.first.getSessionID()<maximum.getSessionID()){
            return maximum;
        }
        return list.first;
    }
    //search by mentor name
    public static Session searchMentor(String mName, LinkedList list){
        Session session = list.first;
        //search how to equals string
        if(mName == session.getMentor())
            return session;
        return LinkedList.searchMentor(mName, list.rest);
    }
    //search by session ID
    public static Session searchID(int id, LinkedList list){
        Session session = list.first;
        if(id == session.getSessionID()){
            return session;
        }
        return LinkedList.searchID(id, list.rest);
    }
    //display sessions



}
