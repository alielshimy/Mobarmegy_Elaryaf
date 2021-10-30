#include <iostream>
using namespace std;
#include<stdio.h>
class queue_using_array
{
private:
    int FRONT , REAR , MaxSize ,Counter, *arr ;
public:
    queue_using_array()
    {
        FRONT = 0 ;
        Counter=0;
        REAR = 0;
        MaxSize = 5 ;
        arr = new int [MaxSize];

    }
    queue_using_array(int Size)
    {
        FRONT = 0 ;
        REAR = 0;
        Counter =0;
        if(Size<=0) Size = 5 ;
        MaxSize = Size ;
        arr = new int [MaxSize];
    }
    bool IsFull (void)
    {
        return(MaxSize <= Counter);
    }
    bool IsEmpty(void)
    {
        return(Counter <= 0);
    }

    void Enqueue(int e)
    {
        if(IsFull())
        {
            cout<<" \nTHE QUEUE  IS FULL DOUBLING IT ..\n";
            DoubleSize();
        }
        arr[REAR] = e ;
        Counter ++ ;
        REAR = (REAR+1)% MaxSize ;

    }
    int Dequeue(void)
    {
        if(IsEmpty())
        {
            cout<<" THE QUEUE IS EMPTY.....!"<<endl;
            return(0);
        }
        else{
            Counter--;
            int Temp = FRONT ;
            FRONT = (FRONT+1)% MaxSize ;
            return(arr[Temp]);
        }
    }
    int GetElementNo(void)
    {
        return(Counter);
    }
    int GetMaxSize(void)
    {
        return (MaxSize);
    }

    void DoubleSize (void)
    {
        int *Temp;
        Temp = new int [MaxSize*2];
        for(int i=0 ; i < Counter ;i++)
        {
            // puting FRONT in 0 index in the new array and put all other values after it

            Temp[i] = arr[(FRONT+i)%MaxSize];

        }
        FRONT = 0 ;
        //REAR = counter all  values are p;aced after 0 index in successive manner ending with counter
        REAR = Counter ;
        MaxSize*=2;
        delete arr ;
        arr = Temp ;
    }

};


int main()
{
    int i=0;
    queue_using_array Even(10) , Odd(3) ;
    for (i=10 ; i < 20 ;i++ )
    {
        if(i%2==0)
        {
            Even.Enqueue(i);
        }
        else{
            Odd.Enqueue(i);
        }
    }
    cout<<"EVEN :";
    for(i=0;i<6;i++)
    {
        cout<<"\t"<<Even.Dequeue();
    }
    cout<<'\n';
    cout<<"ODD :";
     for(i=0;i<6;i++)
    {
        cout<<"\t"<<Odd.Dequeue();
    }

    return 0;
}
