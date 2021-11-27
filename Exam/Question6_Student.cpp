/*
Write a C++ program to create a class Student having data members student roll no., name , age and percentage and a Test class (derived class of Student) representing the scores of the student  in  various  subjects  and  Sports  class  representing  the  score  in sports.  The Sports  and  Test class  should  be inherited  by a Result class having the functionality to add the scores, calculate the percentage. Maintain the records of student with details and find the student with highest percentage among the students. The number of students should be entered by the user at runtime.*/



#include<iostream>  
using namespace std;

class Student
{ 

    protected: 
        int Roll;
        string Name;
        int Age;
        float Percentage;
  
    public: 
        void Input_Student_Details()
        {
            cout<<"Enter student Details\n";
            cout<<"Enter the Student Name: ";
            cin>>Name;
            cout<<"Enter yhe Roll no: ";
            cin>>Roll;
            cout<<"Enter the Age : ";
            cin>>Age;
        }
        
        void Output_Student_Detail()
        {
            cout<<"Student's Name : "<<Name<<endl;
            cout<<"Student's Roll No : "<<Roll<<endl;
            cout<<"Student's Age : "<<Age<<endl;
        }
}; 

 

class test : public Student 
{ 
    protected: 

        float Sub1 , Sub2 , Sub3 , Sub4 , Sub5;

  
    public:
    
        void Input_marks() 
        {
            cout<<"Input the marks of the 5 subjects\n";
            cout<<"Enter Subject1 Marks: ";
            cin>>Sub1;
            cout<<"Enter Subject2 Marks: ";
            cin>>Sub2;
            cout<<"Enter Subject3 Marks: ";
            cin>>Sub3;
            cout<<"Enter Subject4 Marks: ";
            cin>>Sub4;
            cout<<"Enter Subject5 Marks: ";
            cin>>Sub5;
            cout<<endl;
        } 
        void Output_marks() 
        { 
    
            cout<<"Marks obtained in the 5 Subjects are as below"<<"\n";
            cout<<"Subject1 Marks = "<<Sub1<<"\n" ;
            cout<<"Subject2 Marks = "<<Sub2<<"\n" ;
            cout<<"Subject3 Marks = "<<Sub3<<"\n" ;
            cout<<"Subject4 Marks = "<<Sub4<<"\n" ;
            cout<<"Subject5 Marks = "<<Sub5<<"\n" ;
        } 

}; 

class sports 
{ 
    protected: 
        float Sport; 

  
    public: 
        void Input_Sports_score() 
        {
            cout<<"Enter Marks in Sports : \n";
            cin>>Sport;
        }
        void Output_Sports_score(void)
        { 
            cout<<"Marks in Sport: "<<Sport<<"\n"; 
        } 
};


class result : public test, public sports 
{ 

    float total; 
    public: 
        void display(void);
        float percent();

}; 

 
void result :: display() 
{
    total = Sub1 + Sub2 + Sub3 + Sub4 + Sub5 + Sport ;
    Percentage = ( total / 600 ) * 100 ;

    Output_Student_Detail();
    Output_marks(); 
    Output_Sports_score(); 
 

    cout<<"Total Score:"<<total<<"\n"; 
    cout<<"Percentage: "<<Percentage<<endl;

} 

float result :: percent()
{
    total = Sub1 + Sub2 + Sub3 + Sub4 + Sub5 + Sport ;
    Percentage = ( total / 600 ) * 100 ;
    return Percentage;
}


int main() 
{
    int Number;
    cout<<"Enter the Number of students : ";
    cin>>Number;
    cout<<"\n";
    result Arr[Number];
    float Var = 0.0;
    float Maxx = 0.0;
    result Top;
    int i = 0;
    while(Number--)
    {
        result students;
        students.Input_Student_Details();
        students.Input_marks(); 
        students.Input_Sports_score ();
        Var = students.percent();
        //students.display (); 
        Arr[i] = students;
        if(Var >= Maxx)
        {
            Maxx = Var;
            Top = students; 
        }
        i++;
        cout<<"\n";
    }
    Top.display();

    result Stu; 
    
    return 0; 

}