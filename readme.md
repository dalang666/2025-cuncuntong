# 村村通小程序后端项目

本项目是为村村通小程序开发的后端服务，基于Java 8和Spring Boot框架构建，使用MySQL作为主要数据存储。

## 技术栈

- 编程语言: Java 8
- 主框架: Spring Boot
- 数据库: MySQL
- 持久层框架: MyBatis Plus
- 构建工具: Maven

## 项目架构

```
project
├── src/main/java/com/cuncuntong
│   ├── CuncuntongApplication.java # Spring Boot启动类
│   ├── controller                 # 控制层（Controller）
│   ├── service                    # 业务层（Service）
│   ├── mapper                     # 数据访问层（Mapper）
│   ├── entity                     # 实体层（Entity）
│   │   ├── po                     # 数据库实体类
│   │   ├── dto                    # 数据传输对象
│   │   └── vo                     # 视图对象
│   └── utils                      # 工具类（包含MyBatis Plus代码生成器等工具）
├── src/main/resources
│   ├── application.yml            # 项目配置文件
│   └── mapper                     # MyBatis XML映射文件
├── pom.xml                        # Maven配置文件
└── README.md                      # 项目说明文档
```

### 项目分层设计思路

项目采用传统的Spring Boot三层架构设计：

#### 控制层（Controller）
- 负责接收HTTP请求
- 进行参数校验和转换
- 调用业务层处理业务逻辑
- 返回响应结果给前端

#### 业务层（Service）
- 负责处理核心业务逻辑
- 事务管理
- 调用数据访问层进行数据操作
- 对控制层提供业务接口

#### 数据访问层（Mapper）
- 负责与数据库交互
- 使用MyBatis Plus简化数据库操作
- 提供数据访问接口给业务层

#### 实体层（Entity）
- po包：数据库实体类，与数据库表一一对应
- dto包：数据传输对象，用于服务间或前后端数据传输
- vo包：视图对象，用于向前端展示数据

### 工具模块设计思路

工具模块包含项目所需的各类工具类，其中最重要的是MyBatis Plus代码生成器。

MyBatis Plus代码生成器将根据数据库表结构自动生成：
- Entity实体类
- Mapper接口
- Service接口及实现类
- Controller控制器类

这将大大提高开发效率，减少重复性工作。

数据库连接信息：
- 地址：8.137.98.119
- 用户名：root
- 密码：Liuhaiyang@1234

## 业务逻辑功能

### 首页模块

#### 村公告
- 上方留出一块公告区域，以滚动面板形式展示最新公告
- 公告支持查看详情，类似于黑板报的形式
- 公告详情页支持用户评论功能

#### 招聘信息
- 展示招聘信息列表，每条信息后方有查看按钮
- 详情页采用老式黑板样式设计
- 详情包含以下信息：
  - 招聘人数
  - 招聘要求
  - 工作地址
  - 薪资水平
  - 联系人电话
  - 一键投递按钮

#### 快递代取
- 快递广场功能，用户可以发布取件码信息
  - 快递码仅对带货人可见
  - 默认取货点为农村固定取货地点
  - 送达地点为发布人的详细地址
  - 发布人电话自动展示给带货人
- 在线求带功能（仅限熟人间）
  - 用户可发布求带请求
  - 其他用户点击"帮带服务"后自动扣除发布人的鸡蛋数
  - 点击帮带后自动将帮带人信息展示给发布人
  - 发布人可决定是否同意帮带请求
  - 同意后将快递取件码推送给帮带人
- 送达确认机制
  - 送货到达后默认一天自动完成帮带
  - 发布人也可主动点击"已收到"
  - 帮带人完成任务后获得相应鸡蛋奖励

#### 邻里邻外
- 农具租借信息发布
- 邻里帮忙事件发布
- 生活事件通知发布
  - 乔迁通知
  - 入学通知
  - 办周年庆典
  - 红白喜事通知

#### 免费领鸡蛋
- 广告观看奖励机制
  - 每观看一个广告可获得1/3个鸡蛋
  - 10个鸡蛋可实际领取
  - 每天最多观看5个广告
  - 每人每天最多可获得1个鸡蛋
- 用户界面设计
  - 最上方展示用户鸡蛋积累数量
  - 下方为广告观看入口，用于获取鸡蛋

#### 大转盘抽奖
- 进入抽奖页面时弹出广告
- 默认获得一个抽奖码
- 获取更多抽奖码方式：
  - 观看广告：额外获得一个抽奖码
  - 分享功能：额外获得一个抽奖码
  - 每人每次最多可获得3个抽奖码
- 奖池机制：每7天轮换一次奖池内容

## 数据库设计

使用MySQL数据库存储系统数据，主要包含以下数据表：

### 用户相关表
- 用户表 (cct_user)：存储用户基本信息
- 用户联系方式表 (user_contact)：存储用户的联系方式详情

### 公告相关表
- 公告表 (announcement)：存储村公告信息
- 公告评论表 (announcement_comment)：存储公告的评论信息

### 招聘相关表
- 招聘信息表 (recruitment_info)：存储招聘信息基本信息
- 招聘详情表 (recruitment_detail)：存储招聘的详细要求信息

### 快递代取相关表
- 邻里服务表 (neighbor_service)：存储快递代取、帮带服务等邻里服务信息
- 邻里消息表 (neighbor_message)：存储邻里服务相关的消息、沟通记录

### 鸡蛋奖励相关表
- 鸡蛋奖励记录表 (egg_reward)：存储用户观看广告获取鸡蛋的记录

### 抽奖活动相关表
- 抽奖码表 (user_lottery_code)：存储用户获取的抽奖码信息
- 抽奖记录表 (lottery_record)：存储用户抽奖记录
- 奖品表 (lottery_prize)：存储奖品信息

### 数据表详细结构

#### 用户表 (cct_user)
- user_id: 用户ID，主键
- username: 用户名
- nickname: 昵称
- avatar: 头像URL
- egg_count: 鸡蛋数量
- create_time: 创建时间
- update_time: 更新时间

#### 用户联系方式表 (user_contact)
- contact_id: 联系方式ID，主键
- user_id: 用户ID，外键
- phone: 手机号码
- address: 地址
- wechat: 微信
- qq: QQ号
- create_time: 创建时间
- update_time: 更新时间

#### 公告表 (announcement)
- announcement_id: 公告ID，主键
- title: 公告标题
- content: 公告内容
- author_id: 发布者ID
- status: 公告状态 (0:草稿, 1:发布, 2:下架)
- view_count: 浏览次数
- create_time: 创建时间
- update_time: 更新时间

#### 公告评论表 (announcement_comment)
- comment_id: 评论ID，主键
- announcement_id: 公告ID，外键
- user_id: 评论用户ID
- content: 评论内容
- parent_id: 父评论ID（用于回复功能）
- create_time: 创建时间
- update_time: 更新时间

#### 招聘信息表 (recruitment_info)
- recruitment_id: 招聘ID，主键
- title: 招聘标题
- company_name: 公司/单位名称
- salary: 薪资水平
- work_address: 工作地址
- contact_user_id: 联系人用户ID
- status: 招聘状态 (0:招聘中, 1:已结束)
- view_count: 浏览次数
- create_time: 创建时间
- update_time: 更新时间

#### 招聘详情表 (recruitment_detail)
- detail_id: 详情ID，主键
- recruitment_id: 招聘ID，外键
- recruit_count: 招聘人数
- requirement: 招聘要求（文本）
- description: 岗位描述
- create_time: 创建时间
- update_time: 更新时间

#### 邻里服务表 (neighbor_service)
- service_id: 服务ID，主键
- service_type: 服务类型 (1:快递代取, 2:农具租借, 3:邻里帮忙, 4:事件通知)
- title: 服务标题
- description: 服务描述
- publisher_id: 发布者ID
- deliver_id: 带货人ID（快递代取专用）
- pickup_code: 取件码（快递代取专用）
- pickup_location: 取货地点
- delivery_address: 送达地址
- egg_cost: 消耗鸡蛋数
- status: 服务状态 (0:待接单, 1:进行中, 2:已完成, 3:已取消)
- create_time: 创建时间
- update_time: 更新时间

#### 邻里消息表 (neighbor_message)
- message_id: 消息ID，主键
- service_id: 服务ID，外键
- sender_id: 发送者ID
- receiver_id: 接收者ID
- content: 消息内容
- create_time: 创建时间

#### 鸡蛋奖励记录表 (egg_reward)
- reward_id: 奖励ID，主键
- user_id: 用户ID
- ad_id: 广告ID
- egg_count: 获得鸡蛋数
- create_time: 创建时间

#### 抽奖码表 (user_lottery_code)
- code_id: 抽奖码ID，主键
- user_id: 用户ID
- code: 抽奖码
- source: 获取来源 (1:观看广告, 2:分享)
- status: 状态 (0:未使用, 1:已使用)
- create_time: 创建时间
- expire_time: 过期时间

#### 抽奖记录表 (lottery_record)
- record_id: 记录ID，主键
- user_id: 用户ID
- code_id: 抽奖码ID
- prize_id: 奖品ID
- create_time: 抽奖时间

#### 奖品表 (lottery_prize)
- prize_id: 奖品ID，主键
- name: 奖品名称
- description: 奖品描述
- image_url: 奖品图片URL
- probability: 中奖概率
- inventory: 库存数量
- status: 状态 (0:下架, 1:上架)
- create_time: 创建时间
- update_time: 更新时间

## 部署说明

1. 环境要求:
   - JDK 8
   - MySQL 8.0+

2. 配置文件修改:
   - 修改各服务模块的application.yml配置文件
   - 配置数据库连接信息

3. 项目启动:
   - 运行 [CuncuntongApplication.java](file:///E:/project/2025-cuncuntong/src/main/java/com/cuncuntong/CuncuntongApplication.java) 启动项目
   - 或使用 Maven 命令: `mvn spring-boot:run`