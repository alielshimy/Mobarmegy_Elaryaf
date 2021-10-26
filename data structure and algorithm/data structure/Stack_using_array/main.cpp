#include <iostream>
using namespace std;

#include<stdio.h>

class stack_using_array{
private:
    int top ;
    int max_size;
    int *arr ;
public:
    stack_using_array(void)
    {
        top=0;
        max_size = 5 ;
        arr = new int [max_size];
    }
    stack_using_array(int Size)
    {
        top =0;
        max_size = Size ;
        arr = new int[Size] ;
    }
    void push(int element)
    {
        arr[top] = element;
        top++;
    }
    int pop (void)
    {
        top -- ;
        return(arr[top]);
    }
    bool is_full(void)
    {
        bool Flag;
        if (top == max_size)
        {
            Flag = true;
        }
        else{Flag = false;}
        return(Flag);
    }
    bool is_Empty (void)
    {
        bool Flag;
        if (top==0)
        {
            Flag = true;
        }
        else{Flag = false;}
        return(Flag);
    }
    int get_element_no(void)
        { return top ; }
    void double_size (void)
    {
        int *temp;
        temp = new int [max_size*2];
        for(int i=0 ; i<top; i++)
        {
            temp[i]=arr[i];

        }
        max_size*=2;
        delete arr ;
        arr = temp;
    }
};
int main()
{
    int num , odd_size , even_size , k , se;
    cout << "Please enter size of even stack: ";
    cin >> se;
    stack_using_array odd(3) , even(se) ;
    for(k = 0 ; k < se ; k++)
    {
    cout << "Enter a number[" << k << "]=";
    cin >> num ;

    if(num % 2 == 0)
    {
    if(even.is_full()) even.double_size();
    even.push(num);
    }
    else
    {
    if(odd.is_full()) odd.double_size();
    odd.push(num);

    }
    }

    cout << "\n even Numbers are: ";
     even_size = even.get_element_no();

    while(even.is_Empty() == false)
    {cout << even.pop() << "\t" ;}

    cout << "\n Odd Numbers are: ";
     odd_size = odd.get_element_no();

   while(odd.is_Empty()==false)
    {cout << odd.pop() << "\t" ;}




    return 0;
}

