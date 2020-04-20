<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="TableLayout.aspx.cs" Inherits="ExSite.Ex2.TableLayout" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title></title>
    <style type="text/css">
        .auto-style1 {
            width: 100%;
            margin-top: 0px;
        }

        .auto-style2 {
        }

        .auto-style3 {
            width: 286px;
        }

        .auto-style5 {
            width: 219px;
        }

        .auto-style6 {
            width: 185px;
        }

        .auto-style7 {
            width: 136px;
        }

        .auto-style8 {
            width: 133px;
        }
    </style>
    <style>
        a {
            text-decoration: none;
        }
    </style>
</head>
<body style="background-color: #616378; font-size: 12px; text-align: center; margin: 0px">
    <form id="form1" runat="server">
        <div>
        </div>
        <table class="auto-style1" style="background-color: #fff; height: 86px; margin-top: 0auto; margin-right: 0auto; margin-bottom: 0auto; margin-left: 0auto; padding: 4px 2px 2px 10px; text-align: left; width: 778px">
            <tr>
                <td rowspan="3">
                    <asp:Image ID="imgLogo" runat="server" ImageUrl="~/Images/logo.gif" />
                </td>
                <td class="auto-style7" style="background-color: #8c8ea3; text-align: center; width: 96.4px">
                    <asp:LinkButton ID="InkbtnDefault" runat="server" ForeColor="White">首页</asp:LinkButton>
                </td>
                <td class="auto-style3" style="background-color: #8c8ea3; text-align: center; width: 96.4px">
                    <asp:LinkButton ID="InkbtnRegisteer" runat="server" ForeColor="White">注册</asp:LinkButton>
                </td>
                <td class="auto-style6" style="text-align: center; background-color: #8c8ea3; width: 96.4px">
                    <asp:LinkButton ID="InkbtnLogin" runat="server" ForeColor="White">登录</asp:LinkButton>
                </td>
                <td class="auto-style5" style="text-align: center; background-color: #8c8ea3; width: 96.4px">
                    <asp:LinkButton ID="InkbtnCart" runat="server" ForeColor="White">购物车</asp:LinkButton>
                </td>
                <td class="auto-style8" style="text-align: center; background-color: #8c8ea3; width: 96.4px">
                    <asp:LinkButton ID="InkbtnSiteMap" runat="server" ForeColor="White">网站地图</asp:LinkButton>
                </td>
            </tr>
            <tr>
                <td class="auto-style2" colspan="5" style="background-color: #666688; color: #fff">登录状态</td>
            </tr>
            <tr>
                <td class="auto-style2" colspan="5" style="background-color: #ccccd4; margin-top: 0auto; margin-right: 0auto; margin-bottom: 0auto; margin-left: 0auto; padding-left: 6px; text-align: left; width: 778px">您的位置</td>
            </tr>
        </table>
    </form>
</body>
</html>
