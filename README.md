RPC:远程过程调用

微服务架构--流动计算架构SOA

Apache Dubbo 是一款高性能、轻量级的开源Java RPC框架，它提供了三大核心能力：面向接口的远程方法调用，智能容错和负载均衡，以及服务自动注册和发现
远程通讯、集群容错、自动发现
soa = rpc + 服务治理

负载均衡
RandomLoadBalance	加权随机	默认算法，默认权重相同
RoundRobinLoadBalance	加权轮询	借鉴于 Nginx 的平滑加权轮询算法，默认权重相同，
LeastActiveLoadBalance	最少活跃优先 + 加权随机	背后是能者多劳的思想
ShortestResponseLoadBalance	最短响应优先 + 加权随机	更加关注响应速度
ConsistentHashLoadBalance	一致性 Hash	确定的入参，确定的提供者，适用于有状态请求


DNS：dubbo nacos sentinel
2181