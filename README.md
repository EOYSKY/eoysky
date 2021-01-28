# EOYSKY

### 使用手册



### 项目结构

```
eoysky---------------------------项目根目录
    ├── sso----------------------单点登录模块（core & server）
    │     ├── sso-server
    │     └── sso-core
    ├── resources----------------资源文件夹，如 sql、shell scripts
    ├── generator----------------代码生成器
    └── app----------------------功能模块
          ├── test---------------TEST bundle
          ├── home---------------前端 bundle
          ├── common-------------公共模块
          │         ├── tools----工具 bundle
          │         └── model----公共模型 bundle
          └── admin--------------后台管理工具
```