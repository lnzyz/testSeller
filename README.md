项目名称：testSeller
这个项目的意义在于论证BASE分布式事务设计思想中的服务者端。
项目采用Dubbo + Zookeeper + RocketMQ + Spring + Hibernate
本项目论证内容请参考:http://hehaoyisheng.com/?p=135
详情如下：
    持久化层接口：StockDAO， TransDAO。分别代表了对库存表和去重表的操作。
    逻辑层接口：QueryStock，UpdateStockImpl。前者为Dubbo服务暴露的接口供RPC调用，后者是本地调用的逻辑方法。包括添加，减少库存等
    实体类： Stock，Trans分别对应库存和去重记录
    MQ的配置以及Dubbo的配置在Application.xml中
    ConsumerMessageListener类为RocketMQ消息处理类，负责处理RocketMQ发来的事务消息。
    pom.xml中对应的2.5.4版本的Duboo并不在maven中，无法查到。请自行添加相关类包。
本项目仅仅简单对分布式事务进行讨论。而且暂时没有实现跨应用事务回滚，后续会更新。
项目对应的还有项目testUser，承担本次试验中的消费者角色。
运行项目前请先运行Zookeeper，不会配置Zookeeper的请看作者博客：http://hehaoyisheng.com/?p=121
