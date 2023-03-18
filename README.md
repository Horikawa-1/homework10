# 第10回の課題（CRUD処理と例外処理を実装する）

---

データベースのレコードを取得するGETメソッドの内容については長くなるのでこちらのREADMEをご覧くださいhttps://github.com/Horikawa-1/homework9

データベースにレコードを追加するときは、POSTで「http://localhost:8080/names 」で、NameServiceImplクラスのcreateNameメソッドよりレコードを追加できます。

データベースのレコードを指定して更新する時は、PATCHで「http://localhost:8080/names/{指定のID} 」で、NameServiceImplクラスのupdateNameメソッドより指定のレコードを更新できます。

データベースのレコードを指定して削除する時は、DELETEで「http://localhost:8080/names/{指定のID} 」で、NameServiceImplクラスのdeleteNameメソッドより指定のレコードを削除できます。
