package com.zl.moduletwo.activity;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.zl.modulelib.base.BaseActivity;
import com.zl.moduletwo.R;
import com.zl.moduletwo.R2;

import butterknife.BindView;

/**
 * Zhaolei
 * 时间:2018/8/22
 */
@Route(path = "/moduletwo/main")
public class ModuleTwoMainActivity extends BaseActivity {

    @BindView(R2.id.tv_parameter)
    TextView tv_parameter;

    @Autowired
    String name;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_module_two_main;
    }

    @Override
    protected void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);

    }

    @Override
    protected void initData() {
        super.initData();
        DisplayMetrics DM = getResources().getDisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(DM);
        tv_parameter.setText("我是接收到的参数name:" + DM.densityDpi+"/n"+"width-display :" + DM.widthPixels+"  "+"heigth-display :" + DM.heightPixels);
    }

}
