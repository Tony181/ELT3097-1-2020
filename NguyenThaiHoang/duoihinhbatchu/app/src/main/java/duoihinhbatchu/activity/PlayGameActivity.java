package nhom6.com.duoihinhbatchu.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.*;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import duoihinhbatchu.MainActivity;
import nhom6.com.duoihinhbatchu.R;
import nhom6.com.duoihinhbatchu.model.Question;
import nhom6.com.duoihinhbatchu.utils.Const;
import nhom6.com.duoihinhbatchu.utils.DatabaseManager;
import nhom6.com.duoihinhbatchu.utils.PlayMusic;
import nhom6.com.duoihinhbatchu.utils.SharePreferenceUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class PlayGameActivity extends AppCompatActivity implements RewardedVideoAdListener {

    @BindView(R.id.btn_back)
    RelativeLayout btnBack;
    @BindView(R.id.btn_help)
    RelativeLayout btnHelp;
    @BindView(R.id.btn_score)
    RelativeLayout btnScore;
    @BindView(R.id.btn_share)
    RelativeLayout btnShare;
    @BindView(R.id.img_ruby)
    ImageView imgRuby;
    @BindView(R.id.tv_ruby)
    TextView tvRuby;
    @BindView(R.id.linear_top)
    LinearLayout linearTop;
    @BindView(R.id.txt_dapan_1)
    TextView txtDapan1;
    @BindView(R.id.dapan_1)
    LinearLayout dapan1;
    @BindView(R.id.txt_dapan_2)
    TextView txtDapan2;
    @BindView(R.id.dapan_2)
    LinearLayout dapan2;
    @BindView(R.id.txt_dapan_3)
    TextView txtDapan3;
    @BindView(R.id.dapan_3)
    LinearLayout dapan3;
    @BindView(R.id.txt_dapan_4)
    TextView txtDapan4;
    @BindView(R.id.dapan_4)
    LinearLayout dapan4;
    @BindView(R.id.txt_dapan_5)
    TextView txtDapan5;
    @BindView(R.id.dapan_5)
    LinearLayout dapan5;
    @BindView(R.id.txt_dapan_6)
    TextView txtDapan6;
    @BindView(R.id.dapan_6)
    LinearLayout dapan6;
    @BindView(R.id.txt_dapan_7)
    TextView txtDapan7;
    @BindView(R.id.dapan_7)
    LinearLayout dapan7;
    @BindView(R.id.txt_dapan_8)
    TextView txtDapan8;
    @BindView(R.id.dapan_8)
    LinearLayout dapan8;
    @BindView(R.id.txt_dapan_9)
    TextView txtDapan9;
    @BindView(R.id.dapan_9)
    LinearLayout dapan9;
    @BindView(R.id.txt_dapan_10)
    TextView txtDapan10;
    @BindView(R.id.dapan_10)
    LinearLayout dapan10;
    @BindView(R.id.txt_dapan_11)
    TextView txtDapan11;
    @BindView(R.id.dapan_11)
    LinearLayout dapan11;
    @BindView(R.id.txt_dapan_12)
    TextView txtDapan12;
    @BindView(R.id.dapan_12)
    LinearLayout dapan12;
    @BindView(R.id.txt_dapan_13)
    TextView txtDapan13;
    @BindView(R.id.dapan_13)
    LinearLayout dapan13;
    @BindView(R.id.txt_dapan_14)
    TextView txtDapan14;
    @BindView(R.id.dapan_14)
    LinearLayout dapan14;
    @BindView(R.id.layout_dapan)
    LinearLayout layoutDapan;
    @BindView(R.id.tv_result)
    TextView tvResult;
    @BindView(R.id.txt_goiy_1)
    TextView txtGoiy1;
    @BindView(R.id.goiy_1)
    LinearLayout goiy1;
    @BindView(R.id.txt_goiy_2)
    TextView txtGoiy2;
    @BindView(R.id.goiy_2)
    LinearLayout goiy2;
    @BindView(R.id.txt_goiy_3)
    TextView txtGoiy3;
    @BindView(R.id.goiy_3)
    LinearLayout goiy3;
    @BindView(R.id.txt_goiy_4)
    TextView txtGoiy4;
    @BindView(R.id.goiy_4)
    LinearLayout goiy4;
    @BindView(R.id.txt_goiy_5)
    TextView txtGoiy5;
    @BindView(R.id.goiy_5)
    LinearLayout goiy5;
    @BindView(R.id.txt_goiy_6)
    TextView txtGoiy6;
    @BindView(R.id.goiy_6)
    LinearLayout goiy6;
    @BindView(R.id.txt_goiy_7)
    TextView txtGoiy7;
    @BindView(R.id.goiy_7)
    LinearLayout goiy7;
    @BindView(R.id.txt_goiy_8)
    TextView txtGoiy8;
    @BindView(R.id.goiy_8)
    LinearLayout goiy8;
    @BindView(R.id.txt_goiy_9)
    TextView txtGoiy9;
    @BindView(R.id.goiy_9)
    LinearLayout goiy9;
    @BindView(R.id.txt_goiy_10)
    TextView txtGoiy10;
    @BindView(R.id.goiy_10)
    LinearLayout goiy10;
    @BindView(R.id.txt_goiy_11)
    TextView txtGoiy11;
    @BindView(R.id.goiy_11)
    LinearLayout goiy11;
    @BindView(R.id.txt_goiy_12)
    TextView txtGoiy12;
    @BindView(R.id.goiy_12)
    LinearLayout goiy12;
    @BindView(R.id.txt_goiy_13)
    TextView txtGoiy13;
    @BindView(R.id.goiy_13)
    LinearLayout goiy13;
    @BindView(R.id.txt_goiy_14)
    TextView txtGoiy14;
    @BindView(R.id.goiy_14)
    LinearLayout goiy14;
    @BindView(R.id.img_question)
    ImageView imgQuestion;
    @BindView(R.id.tv_question)
    TextView tvQuestion;
    @BindView(R.id.adView)
    AdView adView;
    private String dapAn;
    private String ketQua;
    private DatabaseManager databaseManager;
    private Question question;
    private String filename;
    private String goiY;
    List<View> listViewDapAn = new ArrayList<>();
    List<View> listViewGoiY = new ArrayList<>();
    List<TextView> textViewsDapAn = new ArrayList<>();
    List<TextView> textViewsGoiY = new ArrayList<>();
    private int position = 0;
    private boolean canClickGoiY = false;
    private int countDapAn = 0;
    private int countHelp = 0;
    private int scoreRuby = 0;
    private int questionCount = 1;
    private RewardedVideoAd mRewardedVideoAd;
    private boolean isHelp = false;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_game);
        ButterKnife.bind(this);
        initAdmob();
        initWatchVideo();
        initViews();
        initData();
    }

    private void initWatchVideo() {
        mRewardedVideoAd = MobileAds.getRewardedVideoAdInstance(this);
        mRewardedVideoAd.setRewardedVideoAdListener(this);
        loadRewardedVideoAd();
    }

    private void loadRewardedVideoAd() {
        mRewardedVideoAd.loadAd(getResources().getString(R.string.app_id_video),//use this id for testing
                new AdRequest.Builder().build());
    }

    private void initAdmob() {
        AdRequest adRequest = new AdRequest.Builder()
                .build();
        adView.loadAd(adRequest);
    }

    private void initData() {
        try {
            InputStream is = getAssets().open("images/" + filename);
            imgQuestion.setImageBitmap(BitmapFactory.decodeStream(is));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void initViews() {
        databaseManager = new DatabaseManager(PlayGameActivity.this);
        question = databaseManager.getOneQuestion();
        dapAn = question.getDapAn();
        filename = question.getFileName();
        ketQua = question.getKetQua();
        goiY = question.getGoiY();
        questionCount = getIntent().getIntExtra(Const.KEY_QUESTION, 1);
        scoreRuby = getIntent().getIntExtra(Const.KEY_RUBY, 0);
        tvQuestion.setText(String.format("Câu %d", questionCount));
        tvRuby.setText(String.format("%d", scoreRuby));
        if (scoreRuby <= 5) {
            Toast.makeText(this, "Gợi ý bạn đáp án cho bạn có ít vốn. " + dapAn, Toast.LENGTH_LONG).show();
        }
        listViewDapAn.add(dapan1);
        listViewDapAn.add(dapan2);
        listViewDapAn.add(dapan3);
        listViewDapAn.add(dapan4);
        listViewDapAn.add(dapan5);
        listViewDapAn.add(dapan6);
        listViewDapAn.add(dapan7);
        listViewDapAn.add(dapan8);
        listViewDapAn.add(dapan9);
        listViewDapAn.add(dapan10);
        listViewDapAn.add(dapan11);
        listViewDapAn.add(dapan12);
        listViewDapAn.add(dapan13);
        listViewDapAn.add(dapan14);

        listViewGoiY.add(goiy1);
        listViewGoiY.add(goiy2);
        listViewGoiY.add(goiy3);
        listViewGoiY.add(goiy4);
        listViewGoiY.add(goiy5);
        listViewGoiY.add(goiy6);
        listViewGoiY.add(goiy7);
        listViewGoiY.add(goiy8);
        listViewGoiY.add(goiy9);
        listViewGoiY.add(goiy10);
        listViewGoiY.add(goiy11);
        listViewGoiY.add(goiy12);
        listViewGoiY.add(goiy13);
        listViewGoiY.add(goiy14);

        textViewsDapAn.add(txtDapan1);
        textViewsDapAn.add(txtDapan2);
        textViewsDapAn.add(txtDapan3);
        textViewsDapAn.add(txtDapan4);
        textViewsDapAn.add(txtDapan5);
        textViewsDapAn.add(txtDapan6);
        textViewsDapAn.add(txtDapan7);
        textViewsDapAn.add(txtDapan8);
        textViewsDapAn.add(txtDapan9);
        textViewsDapAn.add(txtDapan10);
        textViewsDapAn.add(txtDapan11);
        textViewsDapAn.add(txtDapan12);
        textViewsDapAn.add(txtDapan13);
        textViewsDapAn.add(txtDapan14);

        textViewsGoiY.add(txtGoiy1);
        textViewsGoiY.add(txtGoiy2);
        textViewsGoiY.add(txtGoiy3);
        textViewsGoiY.add(txtGoiy4);
        textViewsGoiY.add(txtGoiy5);
        textViewsGoiY.add(txtGoiy6);
        textViewsGoiY.add(txtGoiy7);
        textViewsGoiY.add(txtGoiy8);
        textViewsGoiY.add(txtGoiy9);
        textViewsGoiY.add(txtGoiy10);
        textViewsGoiY.add(txtGoiy11);
        textViewsGoiY.add(txtGoiy12);
        textViewsGoiY.add(txtGoiy13);
        textViewsGoiY.add(txtGoiy14);

        for (int i = 0; i <= 13; i++) {
            listViewDapAn.get(i).setVisibility(View.GONE);
        }
        for (int j = 0; j < dapAn.length(); j++) {
            listViewDapAn.get(j).setVisibility(View.VISIBLE);
        }
        for (int k = 0; k < goiY.length(); k++) {
            textViewsGoiY.get(k).setText(String.valueOf(goiY.charAt(k)));
        }


    }

    @OnClick({R.id.btn_back, R.id.btn_help, R.id.btn_share, R.id.dapan_1, R.id.dapan_2, R.id.dapan_3, R.id.dapan_4, R.id.dapan_5, R.id.dapan_6, R.id.dapan_7, R.id.dapan_8, R.id.dapan_9, R.id.dapan_10, R.id.dapan_11, R.id.dapan_12, R.id.dapan_13, R.id.dapan_14, R.id.goiy_1, R.id.goiy_2, R.id.goiy_3, R.id.goiy_4, R.id.goiy_5, R.id.goiy_6, R.id.goiy_7, R.id.goiy_8, R.id.goiy_9, R.id.goiy_10, R.id.goiy_11, R.id.goiy_12, R.id.goiy_13, R.id.goiy_14})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_back:
                PlayMusic.playClick(getApplicationContext());
                makeBack();
                break;
            case R.id.btn_help:
                PlayMusic.playClick(getApplicationContext());
                makeHelp();
                break;
            case R.id.btn_share:
                PlayMusic.playClick(getApplicationContext());
                makeVideo();
                break;
            case R.id.dapan_1:
                PlayMusic.playClick(getApplicationContext());
                makeDapAn(0);
                break;
            case R.id.dapan_2:
                PlayMusic.playClick(getApplicationContext());
                makeDapAn(1);
                break;
            case R.id.dapan_3:
                PlayMusic.playClick(getApplicationContext());
                makeDapAn(2);
                break;
            case R.id.dapan_4:
                PlayMusic.playClick(getApplicationContext());
                makeDapAn(3);
                break;
            case R.id.dapan_5:
                PlayMusic.playClick(getApplicationContext());
                makeDapAn(4);
                break;
            case R.id.dapan_6:
                PlayMusic.playClick(getApplicationContext());
                makeDapAn(5);
                break;
            case R.id.dapan_7:
                PlayMusic.playClick(getApplicationContext());
                makeDapAn(6);
                break;
            case R.id.dapan_8:
                PlayMusic.playClick(getApplicationContext());
                makeDapAn(7);
                break;
            case R.id.dapan_9:
                PlayMusic.playClick(getApplicationContext());
                makeDapAn(8);
                break;
            case R.id.dapan_10:
                PlayMusic.playClick(getApplicationContext());
                makeDapAn(9);
                break;
            case R.id.dapan_11:
                PlayMusic.playClick(getApplicationContext());
                makeDapAn(10);
                break;
            case R.id.dapan_12:
                PlayMusic.playClick(getApplicationContext());
                makeDapAn(11);
                break;
            case R.id.dapan_13:
                PlayMusic.playClick(getApplicationContext());
                makeDapAn(12);
                break;
            case R.id.dapan_14:
                PlayMusic.playClick(getApplicationContext());
                makeDapAn(13);
                break;
            case R.id.goiy_1:
                PlayMusic.playClick(getApplicationContext());
                makeGoiY(0);
                break;
            case R.id.goiy_2:
                PlayMusic.playClick(getApplicationContext());
                makeGoiY(1);
                break;
            case R.id.goiy_3:
                PlayMusic.playClick(getApplicationContext());
                makeGoiY(2);
                break;
            case R.id.goiy_4:
                PlayMusic.playClick(getApplicationContext());
                makeGoiY(3);
                break;
            case R.id.goiy_5:
                PlayMusic.playClick(getApplicationContext());
                makeGoiY(4);
                break;
            case R.id.goiy_6:
                PlayMusic.playClick(getApplicationContext());
                makeGoiY(5);
                break;
            case R.id.goiy_7:
                PlayMusic.playClick(getApplicationContext());
                makeGoiY(6);
                break;
            case R.id.goiy_8:
                PlayMusic.playClick(getApplicationContext());
                makeGoiY(7);
                break;
            case R.id.goiy_9:
                PlayMusic.playClick(getApplicationContext());
                makeGoiY(8);
                break;
            case R.id.goiy_10:
                PlayMusic.playClick(getApplicationContext());
                makeGoiY(9);
                break;
            case R.id.goiy_11:
                PlayMusic.playClick(getApplicationContext());
                makeGoiY(10);
                break;
            case R.id.goiy_12:
                PlayMusic.playClick(getApplicationContext());
                makeGoiY(11);
                break;
            case R.id.goiy_13:
                PlayMusic.playClick(getApplicationContext());
                makeGoiY(12);
                break;
            case R.id.goiy_14:
                PlayMusic.playClick(getApplicationContext());
                makeGoiY(13);
                break;
        }
    }

   