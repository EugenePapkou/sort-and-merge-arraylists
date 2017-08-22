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
        Merge obj = new Merge();        
        System.out.println(obj.merge(obj.a, obj.b)); 
    }
}
