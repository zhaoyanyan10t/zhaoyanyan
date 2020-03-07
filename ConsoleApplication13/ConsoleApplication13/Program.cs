using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication13
{
    class Program
    {
        static List<int> listArr = new List<int>();
        static void Main(string[] args)
        {
            int n = 0;
            Console.Write("Please Input a String:");
            string s = Console.ReadLine();
            string[] ss = s.Split(' ');
            Console.WriteLine("your Input:");
            int number = 0;
            for (int j = 0; j < ss.Length; j++)
            {
                char[] a = ss[j].ToCharArray();
                for (int i = 0; i < a.Length; i++)
                {
                    Console.Write("{0}", a[i]);
                }
                int y = a.Length;
                Console.Write(' ');
                n = fun(a, y);
                number += n;
            }
            Console.WriteLine();
            Console.WriteLine("整数个数是：{0}", number);
            Console.WriteLine("分别是：");
            for (int i = 0; i < listArr.Count; i++)
            {
                Console.Write(listArr[i].ToString() + ' ');
            }
            Console.WriteLine();
        }

        private static int fun(char[] a, int y)
        {
            throw new NotImplementedException();
        }
        static int fun(char[] a, int[] b, int y)
        {
            int i, n = 0;
            int digit = 0;
            int isDigit = 0;
            for (i = 0; i < y; i++)
            {
                int flag = 0;
                while ((a[i] >= '0') && (a[i] <= '9'))
                {
                    isDigit = 1;
                    flag = 1;
                    string tran = a[i].ToString();
                    digit = digit * 10 + Convert.ToInt32(tran);
                    break;
                }
                if ((flag != 1 || i == (y - 1)) && isDigit != 0)
                {
                    listArr.Add(digit);
                    digit = 0;
                    flag = 0;
                    isDigit = 0;
                    n++;
                }
            }
            return n;
        }

    }
}

