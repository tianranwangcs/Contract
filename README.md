# Contract Management System (Java EE)

## 目录(Content)
- [项目概述(Introduction)](https://github.com/BIOTONIC/Contract/blob/master/README.md#项目概述introduction)
- [需求分析(Requirement Analysis)](https://github.com/BIOTONIC/Contract/blob/master/README.md#需求分析requirement-analysis)
- [功能概述(Function)](https://github.com/BIOTONIC/Contract/blob/master/README.md#功能概述function)
- [设计实现(Implementation)](https://github.com/BIOTONIC/Contract/blob/master/README.md#设计实现implementation)
- [重点细节(Detail)](https://github.com/BIOTONIC/Contract/blob/master/README.md#重点细节detail)

## 项目概述(Introduction)
本项目通过Java EE、Tomcat和MySQL等工具，创建一个基于B/S架构的联系人管理系统。
  ![](https://github.com/BIOTONIC/Contract/blob/master/web/screenshots/bsjg.PNG)

## 需求分析(Requirement Analysis)
- 功能模块如下：
   ![](https://github.com/BIOTONIC/Contract/blob/master/web/screenshots/rjjg.PNG)

- 业务流程如下：  
   ![](https://github.com/BIOTONIC/Contract/blob/master/web/screenshots/ywlc.PNG)

- 系统拥有三种用户：
 1. 管理者 管理整个系统，拥有最高权限
 2. 操作者 管理合同，拥有部分权限   
 3. 新用户 必须等待管理者分配权限后，才能使用系统  
这里插入yhqx图片 

##功能概述(Function)
### 注册操作(Register)
这里插入zccz图片  
- 注册信息不能为空，否则错误提示  
- 两次密码不一致，错误提示  
- 去数据库里检查是否重名  
- 注册成功跳转到登陆界面

### 登录操作(Login)
这里插入dlcz  
- 登录信息不能为空，否则错误提示  
- 登录成功跳转到新用户界面

### 登出操作(Logut)
这里插入dccz  
- 登录后的用户点击登出按钮，清除用户登录状态，回到登录界面

### 合同管理(Contract Management)
- 一个操作者在登录后，可以进行下列合同管理功能：  
  ![](https://github.com/BIOTONIC/Contract/blob/master/web/screenshots/htgl.PNG)

### 起草合同(Draft Contract)
- 操作员在登录后有起草合同的权限  
- 填写合同的以下信息：合同名称、开始时间、结束时间、内容、顾客等  
- 输入的信息不能为空，且要满足条件，否则错误提示 
- 起草合同结束后，需要管理者将合同状态变为Drafted  
- 合同几个状态如下：  
  1. Drafted
  2. Countersigned
  3. Finalized
  4. Approved
  5. Signed  
- 输入后的信息保存在t_contract表中 状态保存在t_contract_state表中
- 起草成功、失败，都提示信息，发生错误的话，跳转到异常页
这里插入qcht

### 会签合同(Coutersign Contract)
- 管理员检查等待会签的合同，从中选择合同会签
- 这里包括合同预览界面和合同会签界面
- 可以输入合同id查询或者直接手动查询
- 填写的会签观点不能为空，否则错误提示
这里插入hqht

### 敲定合同(Finalize Contract)
- 合同会签通过后，签署人可以查看等待被签定的合同，从中选择合同添加评论并签字
- 可以输入合同id查询或者直接手动查询
- 填写的会签观点不能为空，否则错误提示
这里插入qdht

## 设计实现(Implementation)
### 结构设计(Structure Design)
- 本系统本来采用JSP+Tomcat+MySQL的模型
  JSP同时负责界面和逻辑处理，但这样JSP部分过于臃肿
  ![](https://github.com/BIOTONIC/Contract/blob/master/web/screenshots/xtjg1.PNG)
- 于是采用JSP+Servlet+Tomcat+MySQL的模型
  JSP只负责界面，逻辑处理交给Servlet
  这也更加符合MVC模型
  ![](https://github.com/BIOTONIC/Contract/blob/master/web/screenshots/xtjg2.PNG)
- 本系统遵从三层架构设计模式，系统可以被分成用户界面层(User Interface Layer)、业务逻辑层(Business Logic Layer)和数据访问层(Data Access Layer)   
- *三层架构与MVC不是同一个概念，MVC指模型层(Model Layer)、视图层(View Layer)和控制层(Controll Layer)*
  ![](https://github.com/BIOTONIC/Contract/blob/master/web/screenshots/scjg.PNG)
- source文件也就可以分成相应的三个包，com.lovejoy.web、com.lovejoy.service和com.lovejoy.dao
- 用图表表示如下：  
   ![](https://github.com/BIOTONIC/Contract/blob/master/web/screenshots/bjg.PNG)
  
  |Project Structure      |Directory			            |
  |:---------------------:|:-----------------------------:|
  |User Interface Layer	|JSP files & com.lovejoy.web	|
  |Business Logic Layer	|com.lovejoy.service		    |
  |Data Access Layer	    |com.lovejoy.dao		        |
  |Entity			        |com.lovejoy.model		        |
  |Utility|com.lovejoy.util|
- 其他文件夹及用途：

  |Folder|Description|
  |:-------------:|:------------:|
  |css|to store css files|
  |images|to store picture files|
  |screenshots|to store screenshots for reade.me|
  |sql|to store DDL & DML sentence|
  |upload|to store files to be loaded|
- 异常处理：
  为三层创建统一的自定义异常处理层————ApplicationException  
  遇到异常，从底层依次向上抛出，直至在用户界面层显示出来
  ![](https://github.com/BIOTONIC/Contract/blob/master/web/screenshots/yccl.PNG)

### 数据库设计(Database Design)
采用PowerDesigner进行快捷的数据库设计
- 概念数据模型如下：  
  ![](https://github.com/BIOTONIC/Contract/blob/master/web/screenshots/gnmx.PNG)
- 物理模型如下：  
  ![](https://github.com/BIOTONIC/Contract/blob/master/web/screenshots/wlmx.PNG)
- spl文件如下：  
  [自动生成的DDL.sql](https://github.com/BIOTONIC/Contract/blob/master/web/sql/DDL.sql)  
  [自己添加的DML.sql](https://github.com/BIOTONIC/Contract/blob/master/web/sql/DML.sql)

### 界面设计(UI Design)
- 界面最后是用jsp来显示的，但是先用htm来展示，这里列出部分文件，其他文件请前去[htm目录](https://github.com/BIOTONIC/Contract/tree/master/web/htm/)寻找
  1. [注册界面](https://github.com/BIOTONIC/Contract/blob/master/web/htm/register.htm)
  2. [登陆界面](https://github.com/BIOTONIC/Contract/blob/master/web/htm/login.htm)
  3. [管理员管理界面](https://github.com/BIOTONIC/Contract/blob/master/web/htm/frame1.htm)
  4. [操作员管理界面](https://github.com/BIOTONIC/Contract/blob/master/web/htm/frame2.htm)
  5. [新增合同界面](https://github.com/BIOTONIC/Contract/blob/master/web/htm/addContract.htm)
  6. [分配合同界面](https://github.com/BIOTONIC/Contract/blob/master/web/htm/assignContract.htm)
  7. [合同详情界面](https://github.com/BIOTONIC/Contract/blob/master/web/htm/contractDetail.htm)
  8. [待会签合同列表界面](https://github.com/BIOTONIC/Contract/blob/master/web/htm/dhqhtList.htm)

## 重点细节(Detail)
以下部分会选取整个开发中较为重点的部分进行详细分析
### 注册环节(Register)
- 在[web.xml](https://github.com/BIOTONIC/Contract/blob/master/web/WEB-INF/web.xml)中添加ToRegister和Register两个配置
- [ToRegister.java](https://github.com/BIOTONIC/Contract/blob/master/src/com/lovejoy/web/ToRegisterServlet.java)重写了HttpServlet的doPost()和doGet()方法
   通过  

> request.getRequestDispatcher("/register.jsp").forward(request,response)

   将请求转发到register.jsp,完成加载注册界面的逻辑
- [Register.java](https://github.com/BIOTONIC/Contract/blob/master/src/com/lovejoy/web/RegisterServlet.java)也是重写了HttpServelt的doPost()方法
   用于接收从register.jsp提交的action，通过 

> String name = request.getParameter("name");  
> String password = request.getParameter("password");  
> String password2 = request.getParameter("password2");  

   获取注册信息
   之后验证用户名密码不为空且两次密码一致，再封装成User类，交给UserService类来处理
   如果注册失败，跳转到自定义异常的界面，否则带回成功的消息返回到ToRegister界面  
- service包中的[UserService.java](https://github.com/BIOTONIC/Contract/blob/master/src/com/lovejoy/service/UserService.java)用于处理用户的各种业务逻辑，其中有关注册部分的代码如下：

> public boolean register(User user) throws AppException {
>       boolean flag = false;
>       try {
>           if (!userdao.isExist(user.getName())) {
>               flag = userdao.add(user);
>               System.out.println("register success");
>           }
>       } catch (AppException e) {
>           e.printStackTrace();
>           throw new AppException("com.lovejoy.dao.service.UserService.register");
>       }
>       return flag;
>   }

   简单来说，就是访问数据访问层来获得返回值，如果新用户名尚不存在，那么添加一条
- dao包中与之相关的是接口[UserDao.java](https://github.com/BIOTONIC/Contract/blob/master/src/com/lovejoy/dao/UserDao.java)和具体实现文件[UserDaoImpl.java](https://github.com/BIOTONIC/Contract/blob/master/src/com/lovejoy/dao/impl/UserDaoImpl.java)
- UserDaoImpl.java中的add()方法与注册相关，代码如下：

>   public boolean add(User user) throws AppException {
>       boolean flag = false;
>       Connection conn = null;
>       PreparedStatement psmt = null;
>       try {
>           conn = DBUtil.getConnection();
>           String sql = "insert into t_user(name,password)" + "values(?,?)";
>           psmt = conn.prepareStatement(sql);
>           psmt.setString(1, user.getName());
>           psmt.setString(2, user.getPassword());
>           int result = -1;
>           result = psmt.executeUpdate();
>           if (result > 0) {
>               flag = true;
>           }
>       } catch (SQLException e) {
>           e.printStackTrace();
>           throw new AppException("com.lovejoy.dao.impl.UserDaoImpl.add");
>       } finally {
>           DBUtil.closeStatement(psmt);
>           DBUtil.closeConnection(conn);
>       }
>       return flag;
>   }

   连接数据库后，向t_user表添加新的用户记录，并返回成功与否信息
   另一个相关的方法是isExists()，检查数据库中是否已经存在当前的用户名
- 连接数据库的方法在Utils包的[DBUtil.java](https://github.com/BIOTONIC/Contract/blob/master/src/com/lovejoy/utils/DBUtil.java)文件中，通过使用[驱动](https://github.com/BIOTONIC/Contract/blob/master/web/WEB-INF/lib/mysql-connector-java-5.1.39-bin.jar)连接MySQL中的数据库，核心代码如下：

> private static String URL = "jdbc:mysql://127.0.0.1:3306/db_contract?useUnicode=true&amp;"
>           + "characterEncoding=utf8";
>   private static String user = "root";
>   private static String password = "";
>
>   static {
>       try {
>           Class.forName("com.mysql.jdbc.Driver");
>       } catch (ClassNotFoundException e) {
>           e.printStackTrace();
>       }
>   }
>
>   public static Connection getConnection() {
>       Connection conn = null;
>       try {
>           conn = DriverManager.getConnection(URL, user, password);
>       } catch (SQLException e) {
>           e.printStackTrace();
>       }
>       return conn;
>   }

