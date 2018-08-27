package com.zl.moduleone.fragment;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.zl.modulelib.base.BaseFragment;
import com.zl.moduleone.R;

/**
 * Zhaolei
 * 时间:2018/8/22
 */
@Route(path = "/moduleone/showfragment")
public class ModuleOneShowFragment  extends BaseFragment {

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_module_one_show;
    }
}
