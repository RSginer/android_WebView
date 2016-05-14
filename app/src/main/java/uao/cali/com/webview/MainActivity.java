package uao.cali.com.webview;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class MainActivity extends Activity {

    WebView la_web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.skin);

        la_web = (WebView) findViewById(R.id.la_web);
        la_web.setWebViewClient(new WebViewClient());
        la_web.getSettings().setJavaScriptEnabled(true);
        la_web.loadUrl("https://www.facebook.com");
    }

    @Override
    public void onBackPressed() {
        //se quita el super para evitar que la aplicacion vaya atras
        //super.onBackPressed();

        //si quiero cambiar el funcionamiento del boton atras para que sea el atras del navegador
        if (la_web.canGoBack()){
            la_web.goBack();
        }

    }
}
