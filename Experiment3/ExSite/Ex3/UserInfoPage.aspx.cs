using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace ExSite.Ex3
{
    public partial class UserInfoPage : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void btnSubmit_Click(object sender, EventArgs e)
        {
            string name = txtName.Text;
            string birthday = txtBirthday.Text;
            UserInfo userInfo = new UserInfo(name, DateTime.ParseExact(birthday, "yyyyMMdd", null));
            Response.Write(userInfo.DecideAge());
        }
    }
}