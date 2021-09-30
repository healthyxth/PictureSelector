package com.luck.picture.lib.dialog;

import android.app.Dialog;
import android.content.Context;
import android.view.Gravity;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

import com.luck.picture.lib.R;
import com.luck.picture.lib.tools.ScreenUtils;

public class PictureCustomDialog extends Dialog {

    public PictureCustomDialog(Context context, int layout) {
        super(context, R.style.Picture_Theme_Dialog);
        setContentView(layout);
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams params = window.getAttributes();
            params.width = (int) (ScreenUtils.getScreenWidth(context) * 0.7);
            params.height = ViewGroup.LayoutParams.WRAP_CONTENT;
            params.gravity = Gravity.CENTER;
            window.setAttributes(params);
        }
    }
}
