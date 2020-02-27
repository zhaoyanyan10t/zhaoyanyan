using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication8
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = 1000;
            double pi = 0d;
            double tempPi = 1d;
            double fz, fm1, fm2;
            for (int i = 1; i <= n; i++)
            {
                fz = 2 * i;
                fm1 = fz - 1;
                fm2 = fz + 1;
                tempPi *= fz / fm1 * fz / fm2;
            }
            pi = tempPi * 2;
            Console.WriteLine(pi);
            Console.Read();
        }
    }
}
