#include <iostream>

using namespace std;

typedef struct node
{
    int Data ;
    node * Head  = NULL;
    node * Tail = NULL ;
    /* double linked list */
};



class ADV_linkedList
{
private: /*List modifiers */
    node * FRONT ;
    node  * REAR ;

public:
    ADV_linkedList(/* NO Args. setting H & T to null */)
    {
        FRONT = REAR = NULL ;
    }
    void addFront (int dd)
    {
        node * Temp ;
        Temp = new node ;
        if (Temp == NULL)   cout<<"No enough memory...!";
        Temp ->Data = dd;
        Temp ->Tail = FRONT ;
        if (/*if there are values inside list just link new element with previous*/FRONT != NULL){ FRONT ->Head = Temp ;}
        /*else set rear one last element in list */
        else{ REAR = Temp ;}
        /*update front*/
        FRONT = Temp ;

    }
    int removeFront(void)
    {
        node * Temp ;
        int dd;
        if (FRONT == NULL) {cout << "The list is empty.....!" ; return(0);}
        dd = FRONT ->Data ;
        Temp = FRONT ;
        FRONT = Temp ->Tail ;
        if (FRONT != NULL)   {FRONT ->Head =NULL;}
        /*to make sure rear is updated to null if list is emptied by Front pointer*/
        else{REAR = FRONT ;}
        delete Temp ;
        return (dd) ;
    }
    void addRear (int dd)
    {
        node *Temp ;
        Temp = new node ;
        if (Temp == NULL)   cout<<"No enough memory...!";
        Temp ->Data = dd;
        Temp ->Head = REAR ;
        if (REAR != NULL)   { REAR ->Tail = Temp; }
        else{FRONT = Temp ;}
        REAR = Temp ;
    }
    int removeRear(void)
    {
        node * Temp ;
        int dd ;
        if (REAR == NULL) {cout << "The list is empty.....!" ; return(0);}
        dd = REAR ->Data ;
        Temp = REAR ;
        REAR = Temp->Head ;
        if(REAR != NULL)    {REAR->Tail = NULL ;}
        /*to make sure front is updated to null if list is emptied by rear pointer*/
        else{FRONT = REAR ;}
        delete Temp ;
        return(dd);
    }
    void addIndex(/*data*/int dd ,/*index*/ int index)
    {
        node * Here ;
        node * previous ;
        Here = FRONT ;
        int i;
        for(i=0 ; i< index ;i++)
        {
            if(Here == NULL)    break ;
            Here = Here ->Tail;
        }
        if(i != index )  cout<<"The List size is smaller than that index" ;
        else{
            if(Here == NULL ) { addRear(dd); return ;}
            previous = Here->Head;
            node * Temp ;
            Temp = new node ;
            Temp ->Data = dd;
            Temp ->Head = previous ;
            Temp ->Tail = Here ;
            if(previous != NULL)    previous->Tail = Temp ;
            else{FRONT = Temp ;}
            Here->Head = Temp ;
            if(Here->Tail == NULL)  {REAR = Here ; }
            cout<<"done .....";

        }
    }
    void deleteIndex(int index)
    {
        node * Here ;
        node * previous ;
        node * next ;
        Here = FRONT ;
        int i;
        for(i=0 ; i< index ;i++)
        {
            Here = Here ->Tail;
            if(Here == NULL)    break ;

        }
        if(i != index )  cout<<"The List size is smaller than that index" ;
        else{
                previous = Here->Head ;
                next = Here->Tail;
                cout<<"the data in that index is :\t"<<Here  ->Data<<'\n';
                if(/*Normal case*/previous != NULL && next != NULL)    {previous->Tail = next; next->Head =previous ;}
                else if(/*empty list*/previous==NULL && next == NULL)   { FRONT =NULL ;  REAR = NULL;}
                else if(/*delete first element*/previous==NULL)  { next->Head = NULL; FRONT = next ;}
                else if (/*delete last element*/next == NULL)  {  previous->Tail = NULL ; REAR = previous;}
                }
                delete Here ;
        }
    int getListSize(void)
    {
        int counter =0 ;
        node * Here =NULL;
        Here = FRONT;

        while(1)
        {
            node * next ;
            if(Here->Tail == NULL)  break ;
            counter++;
            next = Here->Tail;
            Here = next ;
        }
        return(counter) ;
    }
   /* void sortList(void)
    {
        for(i=0<i)
    }*/

};
int main (void)
{
    int X ;
    ADV_linkedList L1 ;
    for(int i = 0 ;  i< 5 ; i++)
    {
        cout<<"Enter the numbers\n =>";
        cin>>X ;
        L1.addRear(X) ;
    }
   // L1.deleteIndex(2);

    for(int i = 0 ; i< 6 ; i++)
    {
        cout<<"\n";
        cout<<L1.removeFront();

    }
    cout<<L1.getListSize()<<"is the list size :)";

    return(0);
}



