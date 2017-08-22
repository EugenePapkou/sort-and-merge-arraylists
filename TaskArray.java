/*
    There're two sorted "ArrayList a" and "ArrayList b". 
    The function "merge" merges given "a" and "b" into one "ArrayList a" 
    which contains sorted elements both of the "ArrayList a" and "ArrayList b".
*/

package com.task;

import java.util.ArrayList;

public class TaskArray 
{          
    public static void main(String[] args) 
    {                
        ArrayList a = new ArrayList();
        ArrayList b = new ArrayList();
        a.add(1);
        a.add(3);
        a.add(555);
        b.add(2);        
        b.add(6);
        b.add(888);
        TaskArray obj = new TaskArray();
        obj.merge(a, b);       
    }
    
    void merge(ArrayList a, ArrayList b)
    {        
        ArrayList c = new ArrayList();
        int i = 0;
        int k = 0;
        c.addAll(a);
        a.clear();
        while((i < c.size()) && ((int)c.get(i) <= (int)b.get(k)))
        {
            a.add(c.get(i));
            i++;
            if (i == c.size())
            {
                while(k < c.size())
                {
                    a.add(b.get(k));
                    k++;
                }
            }
            else
            {
                while((k < c.size()) && ((int)c.get(i) > (int)b.get(k)))
                {
                    a.add(b.get(k));
                    k++;
                }
                if (k == c.size())
                {
                    while(i < c.size())
                    {
                        a.add(c.get(i));
                        i++;
                    }
                }
            }
        }    
        System.out.println(a);
    }
    
}
