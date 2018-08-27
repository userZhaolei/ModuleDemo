package com.zl.moduletwo.fragment;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.zl.modulelib.base.BaseFragment;
import com.zl.moduletwo.R;

/**
 * Zhaolei
 * 时间:2018/8/22
 */
@Route(path = "/moduletwo/showfragment")
public class ModuleTwoShowFragment extends BaseFragment {

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_module_two_show;
    }
}
