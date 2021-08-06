package com.striptrips.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

import com.striptrips.model.Package;

public class ResourcesUtil {

    public static final String DRAWABLE = "drawable";

    public static Drawable getDrawable(Context context, String resource) {
        Resources resources = context.getResources();
        int drawableId = resources.getIdentifier(resource,
                DRAWABLE,
                context.getPackageName());
        return resources.getDrawable(drawableId);
    }
}
