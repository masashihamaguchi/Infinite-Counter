# Infinite Counterを完成させよう

Friday Android チェックワーク

## Infinite Counterとは？
1つの画面にいくつもカウンターを並べられるアプリです。

<img src="https://github.com/masashihamaguchi/Infinite-Counter/blob/master/image.png" width="320px" alt="完成イメージ">

アプリはほとんど完成しているのでチェックワークを行って最後まで完成させましょう！

## 準備・進め方

まずローカルにプロジェクトをクローンします。
ターミナルもしくはCMDを開いて、任意のプロジェクトをクローンするディレクトリーに移動します。
下のコードを入れます。
```
git clone https://github.com/masashihamaguchi/Infinite-Counter
```
クローンできたらAndroid Studioでプロジェクトを開きます。

※Githubから直接zipでダウンロードもできます。

## チェックワーク
準備ができたら順番にチェックワークを進めよう！

### 1. Counterクラスを完成させよう
ファイル名：`Counter.java`
CounterクラスはString型の`name`変数とint型の`number`変数を持っています。
`plus`メソッドと`minus`メソッドを作って、それぞれ`number`変数の数字を足したり引いたりできるようにしましょう。

### 2. firstSetメソッドを作ろう
ファイル名：`MainActivity.java`
アクティビティーが起動したときに呼び出されるメソッドを作ります。
`firstSet`メソッドの中で、for文を使って`counterList`に新しく`Counter`を3つ追加してください。（`counterList`は初期化済みです。）

### 3. CounterAdapterを初期化しよう
ファイル名：`MainActivity.java`
`CounterAdapter`を初期化します。`CounterAdapter`は`adapter`という名前の変数で宣言されているので`adapter`変数を初期化してください。`CounterAdapter`を初期化するときの引数は`Context`と`Counter`クラスのArrayListです。
**※ここは少し難しいので分からなかったら質問orいったんスキップ**

### 4. RecyclerViewにAdapterをセットしよう。
ファイル名：`MainActivity.java`
`RecyclerView`に3で初期化した`CounterAdapter`をセットしてください。

ここまでできたら完成！

## 完成したら動作チェック！
Runして動くか確かめてみよう！
- このアプリにはどんな機能があるか調べてみよう！
- どんな技術が使われてるのか調べてみよう！
- さらにオリジナルの機能を加えてみよう！
- 余力があったらGithubにアップしてみよう！

**分からなかったら考え過ぎずに質問すること！**
