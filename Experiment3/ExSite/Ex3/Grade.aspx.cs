﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace ExSite.Ex3
{
    public partial class Grade : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void btnSubmit_Click(object sender, EventArgs e)
        {
            float fGrade = float.Parse(txtInput.Text);
            int iGrade = (int)(fGrade / 10);
            switch (iGrade)
            {
                case 10:
                case 9:
                    lblDisplay.Text = "优秀";
                    break;
                case 8:
                    lblDisplay.Text = "良好";
                    break;
                case 7:
                    lblDisplay.Text = "中等";
                    break;
                case 6:
                    lblDisplay.Text = "及格";
                    break;
                default:
                    lblDisplay.Text = "不及格";
                    break;
            }

        }
    }
}