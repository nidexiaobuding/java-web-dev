quickstart起步模块
登录起步练习
login.html输入用户名和密码 ![Image text](https://github.com/nidexiaobuding/java-web-dev/blob/master/quick/11.jpg)
LoginServlet拦截到"/login.do"请求，判断用户名和密码是否匹配，是就将用户名记入session，跳转到index.jsp，否则继续跳回登录页 
index.jsp首页根据session中是否有登录信息，来显示用户名或显示去登陆 
![Image text](https://github.com/nidexiaobuding/java-web-dev/blob/master/quick/12.jpg)

