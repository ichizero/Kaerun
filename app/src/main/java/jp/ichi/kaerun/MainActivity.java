package jp.ichi.kaerun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private SeekBar seekBar;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int progressVal = 0;

        textView = (TextView)findViewById(R.id.text_view);

        // SeekBar
        seekBar = (SeekBar)findViewById(R.id.seekbar);
        // 初期値
        seekBar.setProgress(0);
        // 最大値
        seekBar.setMax(100);
        seekBar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    //ツマミがドラッグされると呼ばれる
                    @Override
                    public void onProgressChanged(SeekBar seekBar,
                                                  int progress, boolean fromUser) {
                        textView.setText(String.valueOf(progress)+" %");
                    }

                    //ツマミがタッチされた時に呼ばれる
                    public void onStartTrackingTouch(SeekBar seekBar) {
                    }

                    //ツマミがリリースされた時に呼ばれる
                    public void onStopTrackingTouch(SeekBar seekBar) {
                    }

                });

        button = (Button)findViewById(R.id.a_button);
        button.setText("Kaeru!");
        // リスナーをボタンに登録
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seekBar.setProgress(50);
            }
        });

    }


}