using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication11
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
        