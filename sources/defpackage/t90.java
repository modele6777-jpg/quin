package defpackage;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.widget.TextView;
import com.adjust.sdk.Constants;
import io.sentry.android.core.b1;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class t90 {
    public final TextView a;
    public final yl2 b;
    public Typeface c;
    public Typeface d;
    public String e;

    public t90(TextView textView, yl2 yl2Var) {
        this.a = textView;
        this.b = yl2Var;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0070  */
    public final boolean a(String str) {
        int i;
        String fontVariationSettings;
        boolean z;
        FontVariationAxis[] fontVariationAxisArrFromFontVariationSettings;
        Typeface typeface = this.c;
        TextView textView = this.a;
        TextPaint paint = textView.getPaint();
        if (this.d != paint.getTypeface()) {
            b1.l("FontVarSettings", "getPaint().getTypeface() changed unexpectedly. App code should not modify the result of getPaint().");
            typeface = paint.getTypeface();
        }
        if (Build.VERSION.SDK_INT < 31 || (i = textView.getContext().getResources().getConfiguration().fontWeightAdjustment) == Integer.MAX_VALUE) {
            i = 0;
        }
        if (i == Integer.MAX_VALUE) {
            i = 0;
        }
        r90 r90Var = new r90(typeface, str, i);
        ej8 ej8Var = s90.a;
        Typeface typeface2 = (Typeface) ej8Var.c(r90Var);
        if (typeface2 != null) {
            z = true;
        } else {
            Paint paint2 = s90.b;
            if (paint2 == null) {
                paint2 = new Paint();
                s90.b = paint2;
            }
            if (i != 0) {
                if (TextUtils.isEmpty(str)) {
                    fontVariationAxisArrFromFontVariationSettings = new FontVariationAxis[0];
                } else {
                    fontVariationAxisArrFromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(str);
                    if (fontVariationAxisArrFromFontVariationSettings == null) {
                        fontVariationSettings = str;
                        z = true;
                    }
                }
                int i2 = 0;
                boolean z2 = false;
                while (true) {
                    if (i2 >= fontVariationAxisArrFromFontVariationSettings.length) {
                        break;
                    }
                    FontVariationAxis fontVariationAxis = fontVariationAxisArrFromFontVariationSettings[i2];
                    if ("wght".equals(fontVariationAxis.getTag())) {
                        float styleValue = fontVariationAxis.getStyleValue() + i;
                        fontVariationAxisArrFromFontVariationSettings[i2] = new FontVariationAxis("wght", styleValue >= 1.0f ? Math.min(styleValue, 1000.0f) : 1.0f);
                        z2 = true;
                    }
                    i2++;
                }
                z = true;
                if (!z2) {
                    FontVariationAxis[] fontVariationAxisArr = new FontVariationAxis[fontVariationAxisArrFromFontVariationSettings.length + 1];
                    System.arraycopy(fontVariationAxisArrFromFontVariationSettings, 0, fontVariationAxisArr, 0, fontVariationAxisArrFromFontVariationSettings.length);
                    int length = fontVariationAxisArrFromFontVariationSettings.length;
                    float f = i + Constants.MINIMAL_ERROR_STATUS_CODE;
                    fontVariationAxisArr[length] = new FontVariationAxis("wght", f >= 1.0f ? Math.min(f, 1000.0f) : 1.0f);
                    fontVariationAxisArrFromFontVariationSettings = fontVariationAxisArr;
                }
                fontVariationSettings = FontVariationAxis.toFontVariationSettings(fontVariationAxisArrFromFontVariationSettings);
            } else {
                fontVariationSettings = str;
                z = true;
            }
            if (Objects.equals(paint2.getFontVariationSettings(), fontVariationSettings)) {
                paint2.setFontVariationSettings(null);
            }
            paint2.setTypeface(typeface);
            if (paint2.setFontVariationSettings(fontVariationSettings)) {
                typeface2 = paint2.getTypeface();
                ej8Var.d(r90Var, typeface2);
            } else {
                typeface2 = null;
            }
        }
        if (typeface2 == null) {
            return false;
        }
        this.d = typeface2;
        this.b.accept(typeface2);
        this.e = str;
        return z;
    }
}
