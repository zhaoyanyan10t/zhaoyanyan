<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="TableCss.aspx.cs" Inherits="ExSite.Ex2.TableCss" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
    <style type="text/css">
        .auto-style1 {
            width: 100%;
        }
        .auto-style2 {
        }
        .auto-style3 {
            width: 182px;
        }
        .auto-style4 {
            width: 157px;
        }
        .auto-style5 {
            width: 204px;
        }
    </style>
    <link href="../Styles/Table.css" rel="stylesheet" type="text/css" />
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
    </div>
        <table class="auto-style1">
            <tr>
                <td rowspan="3">
                    <asp:Image ID="imgLogo" runat="server" ImageUrl="~/Images/logo.gif" />
                </td>
                <td class="navigation">
                    <asp:LinkButton ID="InkbtnDefault" runat="server" ForeColor="White">首页</asp:LinkButton>
                </td>
                <td class="navigation">
                    <asp:LinkButton ID="InkbtnRegister" runat="server" ForeColor="White">注册</asp:LinkButton>
                </td>
                <td class="navigation">
                    <asp:LinkButton ID="InkbtnLogin" runat="server" ForeColor="White">登录</asp:LinkButton>
                </td>
                <td class="navigation">
                    <asp:LinkButton ID="InkbtnCart" runat="server" ForeColor="White">购物车</asp:LinkButton>
                </td>
                <td class="navigation">
                    <asp:LinkButton ID="InkbtnSiteMap" runat="server" ForeColor="White" OnClick="LinkButton5_Click">网站地图</asp:LinkButton>
                </td>
            </tr>
            <tr>
                <td class="auto-style2" colspan="5">登录状态</td>
            </tr>
            <tr>
                <td class="auto-style2" colspan="5">您的位置</td>
            </tr>
        </table>
    </form>
</body>
</html>
