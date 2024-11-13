# Side Project -- 會員登入系統

## 專案概述：
設計並開發一套完整的會員登入系統，包含從使用者註冊、登入到會話管理的所有流程。系統採用分層架構設計，提升程式的可讀性、可維護性及擴展性

## 使用技術
* 後端技術：Java / Spring Boot 3.2.3
* 資料層技術：JDBC、JPA、MyBatis
* Database：MySQL
* 前端技術：Thymeleaf

## 主要功能與技術細節：
*	資料庫操作：使用JDBC、JPA、MyBatis三種ORM工具進行資料庫操作，並整合MySQL進行數據持久化
* 前端頁面生成：透過Thymeleaf動態生成HTML頁面，實現伺服器端渲染，確保頁面資料的即時性與一致性
* API 開發：基於Spring Boot框架，開發RESTful API，支持前後端的數據傳輸及服務整合
