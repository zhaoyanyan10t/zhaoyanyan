﻿<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Course.aspx.cs" Inherits="ExSite.Ex4.Course" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        学年：<asp:DropDownList ID="ddlYear" runat="server" AutoPostBack="True">
        </asp:DropDownList>
        学期：<asp:DropDownList ID="ddlTerm" runat="server" AutoPostBack="True">
        </asp:DropDownList>
        分院：<asp:DropDownList ID="ddlCollege" runat="server" AutoPostBack="True" OnSelectedIndexChanged="DropDownList3_SelectedIndexChanged">
        </asp:DropDownList>
        教师：<asp:DropDownList ID="ddlTeacher" runat="server" AutoPostBack="True">
        </asp:DropDownList>
    
    </div>
    </form>
</body>
</html>
