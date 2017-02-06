package reverse_linkedlist;

public class Reverse_LinkedList<T> {
    
    //this will be the head of the linked list 
    private Node<T> head;

    public void add (T element)
    {
        Node<T> node = new Node<T>();
        node.setValue(element);
        System.out.println("Element added to list: " + element);
        
        Node<T> temp = head;
        
        while(true)
        {
            //since the temp is the head right now, if the list is empty, then the head and tail are equal
            if(temp==null)
            {
                temp = node; 
                break;
            }
            //if the next value is null, then set the node to the next value!
            else if (temp.get_next()==null)
            {
                temp.setNext(node);
                break;
            }
            else
            {
                //or just get the next one!
                temp.get_next();
            }
        }   
    }
    
    public void traverse()
    {
        Node<T> temp = head;
        while(true)
        {
            if(temp==null)
            {
                break;
            }
            System.out.print(temp.getValue()+ "\t");
            temp = temp.get_next();
        }
    }
    
    public void reverse()
    {
        System.out.println("Reversed List: ");
        Node<T> previous = null;
        //because you want to start at the beginning!
        Node<T> current = head;
        Node<T> next = null;
        
        while(current != null)
        {
            //next gets the next value after current
            next = current.get_next();
            //the previous value is now set as current
            current.setNext(previous);
            previous = current;
            current = next;
        }
        head = previous;
    }
    
    public static void main(String[] args) 
    {
        //Declare a linked list:
        Reverse_LinkedList<Integer> linked_list = new Reverse_LinkedList<Integer>();
        
        linked_list.add(1);
        linked_list.add(2);
        linked_list.add(3);
        linked_list.add(4);
        linked_list.add(5);

       linked_list.traverse();
        
       linked_list.reverse();
       linked_list.traverse();
    }
    
}

