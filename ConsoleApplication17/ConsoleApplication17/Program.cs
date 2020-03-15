using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication17
{
    public class test
    {
        public void change1(string s)
        {
            s = s + "change1";
        }
        public void change2(ref string s)
        {
            s = s + "change2";
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            string s1, s2;
            s1 = "hello,";
            test t1 = new test();
            t1.change1(s1);
            Console.WriteLine("{0}", s1);
            t1.change2(ref s1);
            Console.WriteLine("{0}", s1);
            Console.Read();
        }
    }
}
