<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<title>信息管理系统</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link href="style/authority/basic_layout.css" rel="stylesheet" type="text/css">
<link href="style/authority/common_style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="js/jquery/jquery.js"></script>
<script type="text/javascript" src="js/jquery/jquery.validate.min.js"></script>
<script type="text/javascript" src="js/artDialog/artDialog.js?skin=blue"></script>
<script type="text/javascript" src="js/authority/commonAll.js"></script>
<script type="text/javascript" src="js/system/userinfo.js"></script>
</head>
<body>
<s:form name="editForm" action="employee_save" method="post" id="editForm">
	<div id="container">
		<div id="nav_links">
			<span style="color: #1A5CC6;">用户编辑</span>
			<div id="page_close">
				<a>
					<img src="images/common/page_close.png" width="20" height="20" style="vertical-align: text-top;"/>
				</a>
			</div>
		</div>
		<div class="ui_content">
			<table cellspacing="0" cellpadding="0" width="100%" align="left" border="0">
				<s:hidden name="employee.id" />
				<tr>
					<td class="ui_text_rt" width="140">用户名</td>
					<td class="ui_text_lt">
						<s:textfield name="employee.userName" cssClass="ui_input_txt02"/>
					</td>
				</tr>
				<s:if test="employee.id==null ">
					<tr>
						<td class="ui_text_rt" width="140">密码</td>
						<td class="ui_text_lt">
							<s:password name="employee.password" id="password" cssClass="ui_input_txt02"/>
						</td>
					</tr>
					<tr>
						<td class="ui_text_rt" width="140">验证密码</td>
						<td class="ui_text_lt">
							<input name="repassword" type="password" class="ui_input_txt02" />
						</td>
					</tr>
				</s:if>
				<tr>
					<td class="ui_text_rt" width="140">Email</td>
					<td class="ui_text_lt">
						<s:textfield name="employee.email" cssClass="ui_input_txt02"/>
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt" width="140">年龄</td>
					<td class="ui_text_lt">
						<s:textfield name="employee.age" cssClass="ui_input_txt02"/>
					</td>
				</tr>
				
				<tr>
					<td class="ui_text_rt" width="140">所属部门</td>
					<td class="ui_text_lt">
						<s:select list="#depts" listKey="id" listValue="name" name="employee.dept.id" cssClass="ui_select01"></s:select>
					</td>
				</tr>
			
				<s:if test="#isAdmin">
				<tr>
					<td class="ui_text_rt" width="140">超级管理员</td>
					<td class="ui_text_lt">
						<s:checkbox name="employee.admin" cssClass="ui_checkbox01"></s:checkbox>
					</td>
				</tr>
				</s:if>
				<tr>
					<td class="ui_text_rt" width="140">角色</td>
					<td class="ui_text_lt">
						<table>
							<tr>
								<td>
									<s:select list="#roles" listKey="id" listValue="name" multiple="true" cssClass="ui_multiselect01 all_roles"></s:select>
								</td>
								<td align="center">
									<input type="button" id="select" value="-->"/><br/>
									<input type="button" id="selectAll" value="==>"/><br/>
									<input type="button" id="deselect" value="<--"/><br/>
									<input type="button" id="deselectAll" value="<=="/>
								</td>
								<td>
									<s:select name="employee.roles.id" list="employee.roles" listKey="id" listValue="name" multiple="true" cssClass="ui_multiselect01 selected_roles"></s:select>
								</td>
							</tr>
						</table>
					</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td class="ui_text_lt">
						&nbsp;<input type="submit" value="确定编辑" class="ui_input_btn01"/>
						&nbsp;<input id="cancelbutton" type="button" value="重置" class="ui_input_btn01"/>
					</td>
				</tr>
			</table>
		</div>
	</div>
</s:form>
</body>
</html>