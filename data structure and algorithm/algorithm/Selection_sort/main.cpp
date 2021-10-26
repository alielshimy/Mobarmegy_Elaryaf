#include <iostream>

using namespace std;

template <class var>
class List{
public:
    int static const Length = 5 ;
    var List[Length];
    void selection_sort (void);
private:
    void Swap(var a ,var b);
    var select_min(int start , int last);

} ;
template <class var>
void  List<var>::selection_sort(void)
{

    for( int loc= 0 ; loc < Length-1 ; loc ++ )
    {
        // swap the new first location with the min of the array coming from func select_min
        Swap( loc ,select_min(loc , Length)  );
        cout<<"entered selection sort func \n";

    }
}
template <class var>
void  List<var>::Swap(var a , var b)
{
    cout<<"you entered swap\n";
    var temp ;
    temp = List[a];
    List[a] = List[b];
    List[b] = temp;
}
// loop through array to find minimum value index
template<class var>
var  List<var>::select_min(int start , int last)
{
    cout << "you entered select min func \n";
    int minimum = start ;
    for(int loc = start ; loc < last; loc++)
    {
        if(List[loc]<= List[minimum])
        {
            minimum = loc ;
        }
        else{;}
    }
    return(minimum);
}

int main()
{
    List<int> L;
    for(int i=0 ; i<5 ; i++)
    {
        cout<<"List["<< i+1 <<"] =  ";
        cin>>L.List[i];
    }
    L.selection_sort();
    for(int i=0 ; i<5 ; i++)
    {
        cout<< L.List[i] <<endl;
    }
    return 0;
}
