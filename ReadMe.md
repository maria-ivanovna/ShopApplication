В приложение реализован следующий функционал

1)Предоставление товара, что есть в наличие (в БД)
2)Выбор товара в неограничном количестве
3)Формирование общей корзины заказа
4)Расчёз за общий заказ с учётом скидки на товар

Приложение состоит из двух частей. 
Spring Boot бекенда и Angular фронтенда. В качестве БД используэться H2 в режиме работы embedded.
Для реализации бекенда была использована такая технология как JPA в спецификации Hibernate.

Сам бек состоит из сущностей, серисов для роботы с сущностями и контроллерами что взаимодействуют через RESTАpi с фронтом.

Сущности что были использованы:

Order - отвечает за заказ в целом.
OrderProduct - отвечает за заказаный продук.
OrderProduckPK - вспомагательная сущьность, первичный ключ
OrderStatus - enum статуса покупки
Product - Отвечает за представление самого продукта

Сервисы реализуют базовую CRUD логику для работы с сущностями общего заказа, продукта, единичного заказа для продукта.

Для обработки функционала приложения присудствуют 2 контроллера.
ProductController - отвечает за предоставления всего перечня продуктов пользователю

OrderController - отвечает за сам заказ. Как каждого товара по отдельности так и всего заказа в частности. Так же осуществляет валидацию заказа и проводит общий расчёт стоимости.

Для работы фронтенда были реализованы следующие компоненты
ecommerce - для работы с общей формой SPA
order - для предсатвления конечного заказа
products - компонент для работы с предсавлением каждого продукта.
shoping-cart - для работы компонентом что отвечает за представление корзины.

В качестве связующего звена меджу фронтом и беком выступает EcommerceService.

Для работы приложения необходимо:
1) запустить с папки Hrudovych_TestTask/ShopAppTest/AngularFront через консоль выполнить команду npm start (для активации Angular Cli)
2) запустить файл Hrudovych_TestTask/ShopAppTest/JavaBack/ShopApp/src/main/java/shopApp/SpringBootShopApplication.java
3) откыть браузер и ввести адресс порта localhost:4200
4) приложение запущено и готово к действию

