using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication6
{
    class Program
    {
        static void Main(string[] args)
        {
            int a = 1;
            int b = 1;
            int c = 1;
            int n = 30;
            int count = 2;
            Console.Write(a + "\t");
            Console.Write(b + "\t");
            for (int i = 3; i <= n; i++)
            {
                c = a + b;
                a = b;
                b = c;
                Console.Write(c+"\t");
                count++;
                if (count % 5 == 0)
                {
                    Console.WriteLine();
                }

            }
            Console.ReadLine();
        }
    }
}

//namespace ConsoleApplication6
//{
//     class CPoint
//    {
//        private double x;
//        private double y;
//        public CPoint() { }
//        public CPoint(double x, double y) { this.x = x; this.y = y; }
//        public static double Distance(CPoint n1, CPoint n2)
//        {
//            return Math.Abs(Math.Pow(n1.x - n2.x, 2) + Math.Pow(n1.y - n2.y, 2));
//        }
 
//    }
//    class Cline : CPoint
//    {
//        private CPoint n1 ;
//        private CPoint n2 ;
//        public static double operator *(Cline a, Cline b)
//        {
//            return CPoint.Distance(a.n1, a.n2) * CPoint.Distance(a.n1, a.n2);
 
//        }
//        public static double operator +(Cline a, Cline b)
//        {
//            return CPoint.Distance(a.n1, a.n2) + CPoint.Distance(a.n1, a.n2);
//        }
//        public Cline() { }
//        public Cline(CPoint n1, CPoint n2) { this.n1 = n1; this.n2 = n2; }
 
//    }
//    class CRect : Cline
//    {
//        Cline a;
//        Cline b;
//        public CRect() { }
//        public CRect(Cline a, Cline b) { this.a = a; this.b = b; }
//        public double Perimeter( )
//        {
//            return (a + b)*2;
//        }
//        public double Area( )
//        {
//            return a * b;
//        }
//    }
 
//    class Program
//    {
//        static void Main(string[] args)
//        {
//            CPoint n1 = new CPoint(5, 6);
//            CPoint n2 = new CPoint(9, 9);
//            Console.WriteLine("两点之间的距离为:{0}", CPoint.Distance(n1, n2));
//            CPoint n3 = new CPoint(5, 10);
//            CPoint n4 = new CPoint(9, 14);
//            Cline a = new Cline(n1, n2);
//            Cline b = new Cline(n2, n4);
//            CRect rect = new CRect(a, b);
//            Console.WriteLine("矩形的长为:{0}", CPoint.Distance(n1, n2));
//            Console.WriteLine("矩形的宽为:{0}", CPoint.Distance(n2, n4));
//            Console.WriteLine("矩形的面积为:{0}",rect.Area() );
//            Console.WriteLine("矩形的周长为:{0}",rect.Perimeter());
//                Console.ReadKey();
//        }
//    }
//}

    //    class Program
    //    {
    //        static void Main(string[] args)
    //        {
                
    //            //        Cperson cp1 = new Cperson();
    //            //        cp1.output_data();
    //            //        Cperson cp2 = new Cperson("小王", 10001, "男");
    //            //        cp2.output_data();
    //            //        CStudent cs1 = new CStudent();
    //            //        cs1.output_data();
    //            //        CStudent cs2 = new CStudent("小李", 10002, "男", 100);
    //            //        cs2.output_data();
    //            //        CTeacher ct1 = new CTeacher();
    //            //        ct1.output_data();
    //            //        CTeacher ct2 = new CTeacher("小陈", 10003, "女", 32);
    //            //        ct2.output_data();
    //            //        Console.ReadKey(true);
    //            //    }
    //            //}

    //            //class Cperson
    //            //{
    //            //    private string name;
    //            //    private int number;
    //            //    private string sex;

    //            //    public Cperson(string name1, int number1, string sex1)
    //            //    {
    //            //        name = name1;
    //            //        number = number1;
    //            //        sex = sex1;
    //            //    }


    //            //    public Cperson()
    //            //    {
    //            //        name = "";
    //            //        number = 0;
    //            //        sex = "";

    //            //    }

    //            //    public virtual void input_data()
    //            //    {
    //            //        Console.WriteLine("请输入您的姓名：");
    //            //        string name = Console.ReadLine();
    //            //        set_name(name);
    //            //        Console.WriteLine("请输入您的姓别：");
    //            //        string sex = Console.ReadLine();
    //            //        set_sex(sex);
    //            //        Console.WriteLine("请输入您的编号：");
    //            //        int number = int.Parse(Console.ReadLine());
    //            //        set_number(number);
    //            //    }
    //            //    public virtual void output_data()
    //            //    {
    //            //        //Console.WriteLine("您的姓名为：{0}  ","您的编号为：{1}  ","您的性别为：{2}",this.get_name(),this.get_number(),this.get_sex());
    //            //        Console.WriteLine("您的姓名为：{0}   您的编号为：{1}   您的性别为：{2}", this.get_name(), this.get_number(), this.get_sex());
    //            //        Console.WriteLine();
    //            //    }
    //            //    public string get_name()
    //            //    {
    //            //        return name;
    //            //    }
    //            //    public int get_number()
    //            //    {
    //            //        return number;
    //            //    }
    //            //    public string get_sex()
    //            //    {
    //            //        return sex;
    //            //    }
    //            //    public void set_name(string name1)
    //            //    {
    //            //        name = name1;
    //            //    }
    //            //    public void set_number(int number1)
    //            //    {
    //            //        number = number1;
    //            //    }
    //            //    public void set_sex(string sex1)
    //            //    {
    //            //        sex = sex1;
    //            //    }
    //            //}

    //            //class CStudent : Cperson
    //            //{
    //            //    public double score;
    //            //    public CStudent(string name1, int number1, string sex1, double score1)
    //            //        : base(name1, number1, sex1)
    //            //    {
    //            //        score = score1;
    //            //    }
    //            //    public CStudent()
    //            //        : base()
    //            //    {
    //            //        score = 0;
    //            //    }
    //            //    public double get_score()
    //            //    {
    //            //        return score;
    //            //    }
    //            //    public void set_score(double score1)
    //            //    {
    //            //        score = score1;
    //            //    }
    //            //    public override void input_data()
    //            //    {

    //            //        Console.WriteLine("请输入学生的姓名：");
    //            //        string name = Console.ReadLine();
    //            //        set_name(name);
    //            //        Console.WriteLine("请输入学生的姓别：");
    //            //        string sex = Console.ReadLine();
    //            //        set_sex(sex);
    //            //        Console.WriteLine("请输入学生的编号：");
    //            //        int number = int.Parse(Console.ReadLine());
    //            //        set_number(number);
    //            //        Console.WriteLine("请输入学生的成绩：");
    //            //        double score = double.Parse(Console.ReadLine());
    //            //        set_score(score);
    //            //    }
    //            //    public override void output_data()
    //            //    {
    //            //        //Console.WriteLine("学生的姓名为：{0}", this.get_name(), "学生的编号为：{1}", this.get_number(), "学生的性别为：{2}", this.get_sex(), "学生的成绩为：{3}", this.get_score());
    //            //        Console.WriteLine("学生的姓名为：{0}  学生的编号为：{1}  学生的性别为：{2}  学生的成绩为：{3}", this.get_name(), this.get_number(), this.get_sex(), this.get_score());
    //            //        Console.WriteLine();
    //            //    }
    //            //}
    //            //class CTeacher : Cperson
    //            //{
    //            //    public int teach_age;
    //            //    public CTeacher(string name1, int number1, string sex1, int teach_age1)
    //            //        : base(name1, number1, sex1)
    //            //    {
    //            //        teach_age = teach_age1;
    //            //    }
    //            //    public CTeacher()
    //            //        : base()
    //            //    {
    //            //        teach_age = 0;
    //            //    }
    //            //    public int get_teach_age()
    //            //    {
    //            //        return teach_age;
    //            //    }
    //            //    public void set_teach_age(int teach_age1)
    //            //    {
    //            //        teach_age = teach_age1;
    //            //    }
    //            //    public override void input_data()
    //            //    {
    //            //        Console.WriteLine("请输入老师的姓名：");
    //            //        string name = Console.ReadLine();
    //            //        set_name(name);
    //            //        Console.WriteLine("请输入老师的姓别：");
    //            //        string sex = Console.ReadLine();
    //            //        set_sex(sex);
    //            //        Console.WriteLine("请输入老师的编号：");
    //            //        int number = int.Parse(Console.ReadLine());
    //            //        set_number(number);
    //            //        Console.WriteLine("请输入老师的教龄：");
    //            //        int teach_age = int.Parse(Console.ReadLine());
    //            //        set_teach_age(teach_age);
    //            //    }
    //            //    public override void output_data()
    //            //    {
    //            //        //Console.WriteLine("老师的姓名为：{0}", this.get_name(), "老师的编号为：{1}", this.get_number(), "老师的性别为：{2}",this.get_number(),  "老师的教龄为：{3}", this.get_teach_age());
    //            //        Console.WriteLine("老师的姓名为：{0}  老师的编号为：{1}  老师的性别为：{2}  老师的教龄为：{3}", this.get_name(), this.get_number(), this.get_number(), this.get_teach_age());
    //            //        Console.WriteLine();
    //            //    }
    //        }
    //    }
    //}

