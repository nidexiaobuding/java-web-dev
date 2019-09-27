登录起步练习
login.html输入用户名和密码 ![Image text](https://github.com/nidexiaobuding/java-web-dev/blob/master/quick/11.jpg)
LoginServlet拦截/login.do请求，取得参数，判定是否和指定值相等，相等就将用户名存入session，然后重定向到index.jsp主页
主页通过jsp表达式<%= %>，用session内置对象取出用户名显示 
![Image text](https://github.com/nidexiaobuding/java-web-dev/blob/master/quick/12.jpg)

