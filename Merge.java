package com.task;

import java.util.ArrayList;

public class Merge 
{
    ArrayList<Integer> a; 
    ArrayList<Integer> b;
    ArrayList<Integer> c;
    
    Merge()
    {        
        a = new ArrayList<Integer>();
        b = new ArrayList<Integer>();
        c = new ArrayList<Integer>();
        a.add(1);
        a.add(3);
        a.add(5);
        b.add(2);        
        b.add(6);
        b.add(8);
    }
    
    ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b)  
    {        
        int i = 0;
        int k = 0;
        c.addAll(a);
        a.clear();
        while((i < c.size()) && (c.get(i) <= b.get(k)))
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
                while((k < c.size()) && (c.get(i) > b.get(k)))
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
        return a;                     
    }   
}
