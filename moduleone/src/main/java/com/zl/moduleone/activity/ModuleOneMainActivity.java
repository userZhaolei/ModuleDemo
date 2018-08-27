package com.zl.moduleone.activity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.zl.modulelib.base.BaseActivity;
import com.zl.moduleone.R;

/**
 * Zhaolei
 * 时间:2018/8/22
 */

@Route(path = "/moduleone/main")
public class ModuleOneMainActivity extends BaseActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_module_one_main;
    }

}

