package com.example.bckj.sdfdsf;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    private final String tag = getClass().getSimpleName();
    private final String temp = "{\"taskId\":\"96f89757-d3ee-4b01-acae-d63b4156dfb5\",\"status\":\"done\",\"returnJSONStr\":\"\\\"\\\\n{\\\\\\\"errno\\\\\\\":101,\\\\\\\"errmsg\\\\\\\":\\\\\\\"\\\\\\\\u767b\\\\\\\\u5f55\\\\\\\\u5df2\\\\\\\\u8fc7\\\\\\\\u671f\\\\\\\\uff0c\\\\\\\\u8bf7\\\\\\\\u91cd\\\\\\\\u65b0\\\\\\\\u767b\\\\\\\\u5f55~ \\\\\\\"}\\\"\",\"errMsg\":\"\",\"spec\":{\"pkgName\":\"com.sdu.didi.psnger\",\"versionName\":\"5.1.4\",\"methodName\":\"callTaxi\",\"argsJSONStr\":\"{\\\"startAddress\\\":\\\"北京大学\\\",\\\"endAddress\\\":\\\"饺子馆\\\",\\\"index1\\\":1,\\\"index2\\\":2}\"}}";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new Gson();
        sdfsdf json = gson.fromJson(temp, sdfsdf.class);

        Log.d(tag, "json : " + json.returnJSONStr);

        StringBuilder sb = new StringBuilder(json.returnJSONStr);
        sb.delete(0,3);
        sb.deleteCharAt(sb.length()-1);

        for(int i = 0; i<sb.length() ; ){
            if(sb.charAt(i) == '"'){
                sb.deleteCharAt(i-1);
            } else {
                i++;
            }
        }

        Log.d(tag, "s : " + sb.toString());
        dfdf dfdf = gson.fromJson(sb.toString(), dfdf.class);

        Log.d(tag, "errmsg : " + dfdf.errmsg  );
        Log.d(tag, "errno : " + dfdf.errno  );

    }
}
