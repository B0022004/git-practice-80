package application;

import javafx.application.Application;
//Scene
import javafx.scene.Scene;
//Button, Label
import javafx.scene.control.Button;
import javafx.scene.control.Label;
//BorderPane
import javafx.scene.layout.BorderPane;
//Stage
import javafx.stage.Stage;

public class Hello extends Application {
	@Override
	public void start(Stage pstage) {
		Button b1 = new Button("ボタン１");        //ボダン作成
		Button b2 = new Button("ボタン２");        //ボタン作成
		Label label = new Label("こんにちは");     //ラベル作成
		BorderPane root = new BorderPane();        //レイアウトコンテナ作成
		root.setTop(label);                        //レイアウトコンテナへ配置
		root.setLeft(b1);
		root.setRight(b2);
		Scene scene = new Scene(root);             //ルートノードを指定しシーンを作成
		pstage.setScene(scene);                    //ステージ（ウインドウ）にシーンを入れる
		pstage.setTitle("Hello");                  //ウインドウタイトルの設定
		pstage.sizeToScene();                      //ウインドウサイズをシーンに合わせる
		pstage.show();                             //ウインドウを表示
	}
	public static void main(String[] args) {
		launch(args);                             //アプリケーションを起動
	}

}

