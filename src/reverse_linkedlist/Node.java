/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse_linkedlist;

class Node<T> implements Comparable<T> 
{
    private T value;
    private Node<T> next;
    
    public T getValue ()
    {
        return value;
    }
    
    public void setValue(T value)
    {
        this.value = value;
    }
    
    public Node<T> get_next ()
    {
        return next;
    }
    
    public void setNext (Node<T> next)
    {
        this.next = next;
    }

    @Override
    public int compareTo(T arg) 
    {
        if(arg == this.value)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
}
