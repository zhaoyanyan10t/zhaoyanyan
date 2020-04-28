<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Default.aspx.cs" Inherits="Ex6Card.aspx.Default" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        <asp:CheckBoxList ID="chklsPet" runat="server">
        </asp:CheckBoxList>
        <asp:Button ID="btnBuy" runat="server" OnClick="btnBuy_Click" Text="放入购物车" />
        <asp:Button ID="btnView" runat="server" OnClick="btnView_Click" Text="查看购物车" />
    
    </div>
    </form>
</body>
</html>
