using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication7
{
    class Program
    {
        static void Main(string[] args)
        {

            int x = Convert.ToInt32(Console.ReadLine());
            float y = 0;
            for (int i = 1; i <= x; i++)
            {
                float a = 1;
                for (int j = 1; j <= i; j++)
                {
                    a = j * a;
                }
                y += a;
            }
            Console.Write(y.ToString());
            Console.Read();
            // int x = Convert.ToInt32(Console.ReadLine());
            //float y = 0;
            //for (int i = 1; i <= x; i++)
            //{
            //    float a = 1;
            //    for (int j = 1; j <= i; j++)
            //    {
            //        a = j * a;
            //    }
            //    y += a;
            //}        
            //Console.Write(y.ToString());
            //Console.Read();
   
             
            //int a = 1;
            //int b = 1;
            //int c = 1;
            //int n = 30;
            //int count = 2;
            //Console.Write(a + "\t");
            //Console.Write(b + "\t");
            //for (int i = 3; i <= n; i++)
            //{
            //    c = a + b;
            //    a = b;
            //    b = c;
            //    Console.Write(c+"\t");
            //    count++;
            //    if (count % 5 == 0)
            //    {
            //        Console.WriteLine();
            //    }

            //}
            //Console.ReadLine();
        }
    }
}
