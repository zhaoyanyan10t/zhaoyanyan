using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication12
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

//            int a = 1, num1 = 0, num2 = 0;
//            float average = 0; //a存储输入的整数，num1表示正数个数，num2表示负数个数,average表示平均数
//            while (a != 0)
//            {
//                System.Console.Write("请输入一个整数(输入0表示输入结束):");
//                a = Int32.Parse(System.Console.ReadLine());
//                if (a > 0)
//                {
//                    num1++;
//                    average += a;
//                }
//                else if (a < 0)
//                {
//                    num2++;
//                    average += a;
//                }
//                else
//                {
//                    average = average / (num1 + num2);
//                }
//            }
//            System.Console.WriteLine("平均数为：" + average + "\t正数个数：" + num1 + "\t负数个数：" + num2 + "");
//            Console.ReadLine();
//        }
//    }
//}
//        {
//            Console.Write("请输入您所要判断的字符串：");
//            string s = Console.ReadLine();
//            char[] c = s.ToCharArray();
//            int i;
//            int j = c.Length - 1;
//            for (i = 0; i < j; i++, j--)
//            {
//                if (c[i] != c[j])
//                    break;
//            }

//            if (i >= j)
//            {
//                Console.WriteLine("字符串{0}回文", s);
//            }
//            else
//            {
//                Console.Write("字符串{0}不回文", s);
//            }

//            Console.ReadKey();
//        }
//    }
//}
