# 第10回の課題（MyBatisでCRUD処理と例外処理の実装）
---

使うデータベースはname_managementコンテナのname_databaseデータベース内のnamesテーブルで、以下がテーブルの詳細で、ID1~ID5までのレコードがあります。

![image](https://user-images.githubusercontent.com/111167638/224326770-2f30b21f-3b38-4e7b-8f82-d55173e92593.png)

* GETでlocalhost:8080/namesでNameControllerクラスのgetUsersメソッドより、データベースの全レコードが返されます。

![スクリーンショット (213)](https://user-images.githubusercontent.com/111167638/224325106-2db72af1-7d64-49a5-a861-a1d964dac88b.png)

* GETでlocalhost:8080/names/{id}でgetUserByIdメソッドより、指定したIDのレコードが返されます。以下ID5の例です。

![image](https://user-images.githubusercontent.com/111167638/224325592-961ffb8c-753e-478c-8f90-6b963ec09355.png)

* getUserByIdメソッドで指定されたIDがテーブルになかった場合、例外処理で 「"message": "ID:{指定されたID} Not Found"」、ステータスコード404が返されます。以下、ID6の例です。

![スクリーンショット (221)](https://user-images.githubusercontent.com/111167638/224542421-1b0b268d-48af-4a27-8abf-a8a8f96b7fe8.png)

* POSTでlocalhost:8080/namesでCreateUserメソッドより、入力されたnameの値が新しくレコードに追加されます。ただし、nameの値がnull、空文字、21字以上の時はエラーになります。以下ID6のレコードを追加したスクリーンショットです。

![スクリーンショット (241)](https://user-images.githubusercontent.com/111167638/228142098-75995790-4747-423f-914a-548a0da96ed2.png)

![スクリーンショット (242)](https://user-images.githubusercontent.com/111167638/228142130-34c89095-2901-476a-9828-3af215d2b3be.png)

* 以下nameの値がnull、空白、19,20,21字の場合のスクリーンショットです。

![スクリーンショット (243)](https://user-images.githubusercontent.com/111167638/228142883-fae4e0ca-f538-488a-995a-73568a8221cc.png)

![スクリーンショット (244)](https://user-images.githubusercontent.com/111167638/228142806-b2007674-cc13-4eb6-bd47-8e95e3b3decc.png)

![スクリーンショット (245)](https://user-images.githubusercontent.com/111167638/228143084-63180150-6d45-4ece-b0da-c809af998fea.png)

![スクリーンショット (246)](https://user-images.githubusercontent.com/111167638/228143117-12f09455-3262-4daa-817a-f39dcf4c4b06.png)

![スクリーンショット (247)](https://user-images.githubusercontent.com/111167638/228143049-61fb7c18-c5f8-44f7-839c-8f181568fd34.png)

* PATCHでlocalhost:8080/names/{id}でupdateNameメソッドより、指定したIDのレコードのnameを更新できます。以下ID11のレコードを更新する例です。

![スクリーンショット (248)](https://user-images.githubusercontent.com/111167638/228144287-b4fb0855-6704-4d16-a25f-c2f6e540cc85.png)

![スクリーンショット (249)](https://user-images.githubusercontent.com/111167638/228144309-ccf87ccc-0a0a-47b5-9b9f-0f5fc1d4d31f.png)

![スクリーンショット (250)](https://user-images.githubusercontent.com/111167638/228144265-8032fa11-5eac-485d-9ed5-b6d7d19bd3c9.png)

* DELETEでlocalhost:8080/names/{id}でdeleteUserメソッドより、指定したIDのレコードを消去できます。以下ID11のレコードを消去する例です。

![スクリーンショット (255)](https://user-images.githubusercontent.com/111167638/228145299-6569aa49-9266-4369-b6d3-46a63f2a5de2.png)

![スクリーンショット (256)](https://user-images.githubusercontent.com/111167638/228145312-31323526-4480-4d36-8df8-953d69f6f75a.png)

![スクリーンショット (257)](https://user-images.githubusercontent.com/111167638/228145325-72e07046-8b9d-4b3e-af47-2a8d2814f3df.png)


【環境】


・IntelliJ IDEA Community Edition 2022.1.2

・SDK:Amazon Corretto 17
