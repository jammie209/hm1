<div id="addAccountForm" align="center"><!--录入试题表单-->
				<form action="AccountAddServlet" method="post">
				<table border="0" cellspacing="10" cellpadding="0">
				  <tr>
					<td colspan="2"><FONT color="red"><s:actionerror/></FONT></td>
				  </tr>
				  <tr>
					<td>用户ID:</td>
					<td><input type="text" name="personID" size="20" ></td>
				  </tr>
				   <tr>
					<td>账户ID:</td>
					<td><input type="text" name="accID" size="20" ></td>
				  </tr>
				   <tr>
					<td>余额:</td>
					<td><input type="text" name="balance" size="20" ></td>
				  </tr>
				  <tr>
				  	<td colspan="2"><div align="center">
				  	  <input type="submit" value="录入">				  	  
				  	  <input type="reset" value="重置">
			  	  </div>
				</td>
				  </tr>
			</table>
			</form>