<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="LinqXmlInsert.aspx.cs" Inherits="Ex7LinqSqlSite.LinqXmlInsert" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        分类Id：<asp:TextBox ID="txtCategoryId" runat="server"></asp:TextBox>
        <br />
        分类名：<asp:TextBox ID="txtName" runat="server"></asp:TextBox>
        <br />
        描述：<asp:TextBox ID="txtDescn" runat="server"></asp:TextBox>
        <br />
        <asp:Button ID="btnInsert" runat="server" OnClick="btnInsert_Click" Text="插入" />
        <asp:Button ID="btnReturn" runat="server" OnClick="btnReturn_Click" Text="返回" />
    
    </div>
    </form>
</body>
</html>
