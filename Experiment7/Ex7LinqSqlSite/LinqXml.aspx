﻿<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="LinqXml.aspx.cs" Inherits="Ex7LinqSqlSite.LinqXml" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        分类名：<asp:TextBox ID="txtName" runat="server">只用于“查询”</asp:TextBox>
        <br />
        <asp:Button ID="btnQueryAll" runat="server" OnClick="btnQueryAll_Click" Text="显示全部" />
        <asp:Button ID="btnQuery" runat="server" OnClick="btnQuery_Click" Text="查询" />
        <asp:Button ID="btnInsert" runat="server" OnClick="btnInsert_Click" Text="插入" />
        <br />
        <asp:Label ID="lblMsg" runat="server"></asp:Label>
    
    </div>
    </form>
</body>
</html>
