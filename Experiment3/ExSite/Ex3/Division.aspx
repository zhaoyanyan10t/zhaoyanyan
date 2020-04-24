<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Division.aspx.cs" Inherits="ExSite.Ex3.Division" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        <asp:TextBox ID="txtDivsor" runat="server"></asp:TextBox>
        <asp:TextBox ID="txtDividend" runat="server"></asp:TextBox>
        <asp:Button ID="btnSubmit" runat="server" OnClick="btnSubmit_Click" Text="提交" />
    
    </div>
    </form>
</body>
</html>
