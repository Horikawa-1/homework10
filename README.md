# 第10回の課題（MyBatisでCRUD処理と例外処理の実装）
---

使うデータベースはname_managementコンテナのname_databaseデータベース内のnamesテーブルで、以下がテーブルの詳細で、ID1~ID5までのレコードがあります。

![image](https://user-images.githubusercontent.com/111167638/224326770-2f30b21f-3b38-4e7b-8f82-d55173e92593.png)

* localhost:8080/namesでNameControllerクラスのgetUsersメソッドより、データベースの全レコードが表示されます。

![スクリーンショット (213)](https://user-images.githubusercontent.com/111167638/224325106-2db72af1-7d64-49a5-a861-a1d964dac88b.png)

* localhost:8080/names/{id}でgetUserByIdメソッドより、指定したIDのレコードがJSON形式で返されます。以下ID5の例です。

![image](https://user-images.githubusercontent.com/111167638/224325592-961ffb8c-753e-478c-8f90-6b963ec09355.png)

* getUserByIdメソッドで指定されたIDがテーブルになかった場合、例外処理で 「"message": "ID:{指定されたID} Not Found"」、ステータスコード404が返されます。以下、ID6の例です。

![スクリーンショット (221)](https://user-images.githubusercontent.com/111167638/224542421-1b0b268d-48af-4a27-8abf-a8a8f96b7fe8.png)

* 



【環境】


・IntelliJ IDEA Community Edition 2022.1.2

・SDK:Amazon Corretto 17
