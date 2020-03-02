using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication10
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] intArray = { 1, 3, 7, 12, 12, 6, 1, 8 };
            MyClass max = new MyClass(intArray[0]);
            MyClass min = new MyClass(intArray[0]);
            for (int i = 0; i < intArray.Length; i++)
            {
                int j = intArray[i];
                if (j > max.Value)
                {
                    max.Value = j;
                    max.Indexes.Clear();
                    max.Indexes.Add(i);
                }
                else if (j < min.Value)
                {
                    min.Value = j;
                    min.Indexes.Clear();
                    min.Indexes.Add(i);
                }
                else if (j == max.Value)
                    max.Indexes.Add(i);
                else if (j == min.Value)
                    min.Indexes.Add(i);
            }
            Console.WriteLine("最大值为:{0},下标为:", max.Value);
            foreach (int i in max.Indexes)
                Console.Write("{0} ", i);
            Console.WriteLine();
            Console.Read();
        }

        class MyClass
        {
            private int value;
            public int Value
            {
                get { return value; }
                set { this.value = value; }
            }

            private List<int> indexes;
            public List<int> Indexes
            {
                get { return indexes; }
                set { indexes = value; }
            }

            public MyClass(int value)
            {
                this.value = value;
                indexes = new List<int>();
                indexes.Add(0);
            }

        }
    }
}
//        static double H(double x, int n)
//        {
//            double s = 0;
//            if (n == 0)
//                s = 1;
//            else if (n == 1)
//                s = 2 * x;
//            else
//                if (n > 1)
//                    s = 2 * x * H(x, n - 1) - 2 * (n - 1) * H(x, n - 2);
//            return s;
//        }
//        static void Main(string[] args)
//        {
//            double x;
//            int n;
//            Console.WriteLine("请分别输入x与n的值并回车：");
//            x = Convert.ToDouble(Console.ReadLine());
//            n = Convert.ToInt32(Console.ReadLine());
//            Console.WriteLine(H(x, n));
//            Console.Read();

//        }
//    }
//}
