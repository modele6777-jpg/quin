package defpackage;

import ai.askquin.MainActivity;
import ai.askquin.R;
import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.widget.QuickDecisionWidgetReceiver;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class c7b {
    public static final c7b a = new c7b();
    public static final int b = Color.parseColor("#2A204C");
    public static final List c = t72.I(new a7b(12.05f, 92.25f, 20.0f, 855638016), new a7b(12.0f, 95.25f, 30.0f, 436207616), new a7b(12.0f, 97.8f, 40.0f, 0));
    public static final List d = t72.I("no", "yes", "maybe");

    public static final void b(Map map, Paint paint, int i, float f, Canvas canvas, float f2, String str, float f3, float f4, int i2) {
        String str2;
        if (str == null || (str2 = (String) map.get(str)) == null) {
            return;
        }
        paint.clearShadowLayer();
        paint.setShader(null);
        paint.setColor(i);
        paint.setAlpha(255);
        float f5 = f4 * f;
        paint.setTextSize(f5);
        Rect rect = new Rect();
        paint.getTextBounds(str2, 0, str2.length(), rect);
        float fExactCenterY = f3 - rect.exactCenterY();
        if (i2 == 0) {
            paint.setShadowLayer(16.0f * f, 0.0f, 0.0f, -1);
        } else {
            int i3 = i & 16777215;
            int i4 = i3 | 1073741824;
            float f6 = fExactCenterY + rect.top;
            float f7 = fExactCenterY + rect.bottom;
            float f8 = f5 * 1.0f;
            paint.setShader(i2 == 1 ? new LinearGradient(0.0f, f7 - f8, 0.0f, f7, i3, i4, Shader.TileMode.CLAMP) : new LinearGradient(0.0f, f6, 0.0f, f6 + f8, i4, i3, Shader.TileMode.CLAMP));
        }
        canvas.drawText(str2, f2, fExactCenterY, paint);
    }

    public static TarotSkinIdentify c(Context context) {
        try {
            Object obj = null;
            String string = context.getSharedPreferences("daily_fortune_widget", 0).getString("skin_folder", null);
            for (Object obj2 : TarotSkinIdentify.getEntries()) {
                if (pa7.t(((TarotSkinIdentify) obj2).getFolder(), string)) {
                    obj = obj2;
                    break;
                }
            }
            TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) obj;
            return tarotSkinIdentify == null ? TarotSkinIdentify.Classic : tarotSkinIdentify;
        } catch (Exception e) {
            tec.t(hf8.Q, "QDWidgetHelper", "currentSkin failed", e);
            return TarotSkinIdentify.Classic;
        }
    }

    public static Bitmap d(x16 x16Var) {
        if (x16Var == null) {
            return null;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            Closeable closeable = (Closeable) x16Var.invoke();
            try {
                BitmapFactory.decodeStream((InputStream) closeable, null, options);
                ym8.t(closeable, null);
                options.inSampleSize = jzb.h(options);
                options.inJustDecodeBounds = false;
                Closeable closeable2 = (Closeable) x16Var.invoke();
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream((InputStream) closeable2, null, options);
                    ym8.t(closeable2, null);
                    return bitmapDecodeStream;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ym8.t(closeable2, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    ym8.t(closeable, th3);
                    throw th4;
                }
            }
        } catch (Exception e) {
            tec.t(hf8.Q, "QDWidgetHelper", "decodeDownsampledCard failed", e);
            return null;
        }
    }

    public static void e(Canvas canvas, Bitmap bitmap, float f, float f2, float f3, float f4, float f5, float f6, Paint paint, Paint paint2, Paint paint3, int i) {
        canvas.save();
        canvas.rotate(f5, f, f2);
        float f7 = f3 / 2.0f;
        float f8 = f4 / 2.0f;
        RectF rectF = new RectF(f - f7, f2 - f8, f + f7, f2 + f8);
        canvas.drawRoundRect(rectF, f6, f6, paint);
        canvas.save();
        Path path = new Path();
        path.addRoundRect(rectF, f6, f6, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawBitmap(bitmap, (Rect) null, rectF, paint2);
        if (i != 0) {
            canvas.drawColor(i);
        }
        canvas.restore();
        canvas.drawRoundRect(rectF, f6, f6, paint3);
        canvas.restore();
    }

    public static iy9 f(Context context, AppWidgetManager appWidgetManager, int i) {
        Bundle appWidgetOptions = appWidgetManager.getAppWidgetOptions(i);
        float f = context.getResources().getDisplayMetrics().density;
        return new iy9(Integer.valueOf((int) (appWidgetOptions.getInt("appWidgetMinWidth", 250) * f)), Integer.valueOf((int) (appWidgetOptions.getInt("appWidgetMaxHeight", 110) * f)));
    }

    public static Bitmap g(Context context, int i) {
        try {
            Bitmap bitmapI = i(context);
            if (bitmapI == null) {
                return null;
            }
            float f = i / 158.0f;
            float f2 = 56.0f * f;
            float f3 = 98.0f * f;
            float f4 = 5.0f * f;
            float f5 = 12.0f * f;
            float f6 = f * 2.0f;
            float f7 = 0.25f * f5;
            int i2 = (int) ((2.0f * f5) + f2);
            float f8 = f3 + f7;
            int i3 = (int) (f5 + f6 + f8);
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapI, (int) f2, (int) f3, true);
            bitmapCreateScaledBitmap.getClass();
            if (bitmapCreateScaledBitmap != bitmapI) {
                bitmapI.recycle();
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.getClass();
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            RectF rectF = new RectF(f5, f7, f2 + f5, f8);
            Paint paint = new Paint(1);
            paint.setColor(-16777216);
            paint.setShadowLayer(f5, 0.0f, f6, 1078343290);
            canvas.drawRoundRect(rectF, f4, f4, paint);
            canvas.save();
            Path path = new Path();
            path.addRoundRect(rectF, f4, f4, Path.Direction.CW);
            canvas.clipPath(path);
            canvas.drawBitmap(bitmapCreateScaledBitmap, (Rect) null, rectF, new Paint(3));
            canvas.restore();
            bitmapCreateScaledBitmap.recycle();
            Paint paint2 = new Paint(1);
            paint2.setStyle(Paint.Style.STROKE);
            float f9 = f * 0.5f;
            if (f9 < 1.0f) {
                f9 = 1.0f;
            }
            paint2.setStrokeWidth(f9);
            paint2.setColor(855638016);
            canvas.drawRoundRect(rectF, f4, f4, paint2);
            return bitmapCreateBitmap;
        } catch (Exception e) {
            tec.t(hf8.Q, "QDWidgetHelper", "loadCardBackWithBorder failed", e);
            return null;
        }
    }

    public static Bitmap h(Context context, String str) {
        x16 e5bVar = null;
        if (str.length() == 0) {
            return null;
        }
        Object objC = new kmd(context).c(c(context), str);
        int i = 1;
        if (objC instanceof File) {
            e5bVar = new rd5((File) objC, i);
        } else if (objC instanceof String) {
            e5bVar = new e5b(1, context, v4e.Y("file:///android_asset/", (String) objC));
        }
        Bitmap bitmapD = d(e5bVar);
        return bitmapD == null ? d(new e5b(2, context, str)) : bitmapD;
    }

    public static Bitmap i(Context context) {
        int iC;
        try {
            iC = hfc.q(c(context)).c();
        } catch (Exception e) {
            tec.t(hf8.Q, "QDWidgetHelper", "resolveSkinCardCover failed", e);
            iC = R.drawable.card_cover;
        }
        try {
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), iC);
            return bitmapDecodeResource == null ? BitmapFactory.decodeResource(context.getResources(), R.drawable.card_cover) : bitmapDecodeResource;
        } catch (Exception e2) {
            tec.t(hf8.Q, "QDWidgetHelper", "decode skin card cover failed", e2);
            return null;
        }
    }

    public static void j(Context context, int i, int i2, RemoteViews remoteViews, int i3, Bitmap bitmap) {
        Context context2;
        int i4;
        int width;
        int height;
        remoteViews.setOnClickPendingIntent(R.id.widget_qd_root, null);
        if (bitmap == null) {
            bitmap = g(context, i2);
        }
        Bitmap bitmap2 = bitmap;
        float f = context.getResources().getDisplayMetrics().density;
        if (bitmap2 != null) {
            context2 = context;
            i4 = i2;
            remoteViews.setImageViewBitmap(R.id.widget_qd_transition_canvas, o(context2, bitmap2, i, i4, f, 1.0f));
        } else {
            context2 = context;
            i4 = i2;
        }
        if (bitmap2 != null) {
            width = bitmap2.getWidth();
        } else {
            width = (int) ((i4 * 56.0f) / 158.0f);
            if (width < 1) {
                width = 1;
            }
        }
        if (bitmap2 != null) {
            height = bitmap2.getHeight();
        } else {
            height = (int) ((i4 * 98.0f) / 158.0f);
            if (height < 1) {
                height = 1;
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.getClass();
        int[] iArr = {R.id.widget_qd_card_0, R.id.widget_qd_card_1, R.id.widget_qd_card_2};
        for (int i5 = 0; i5 < 3; i5++) {
            remoteViews.setImageViewBitmap(iArr[i5], bitmapCreateBitmap);
            Intent intent = new Intent(context2, (Class<?>) QuickDecisionWidgetReceiver.class);
            intent.setAction("ai.askquin.widget.QD_CARD_SELECTED");
            intent.putExtra("card_position", i5);
            intent.putExtra("appWidgetId", i3);
            remoteViews.setOnClickPendingIntent(iArr[i5], PendingIntent.getBroadcast(context2, (i3 * 10) + i5 + 1, intent, 201326592));
        }
        String string = context2.getString(R.string.widget_quick_decision_selecting_hint);
        string.getClass();
        remoteViews.setTextViewText(R.id.widget_qd_selecting_hint, "");
        remoteViews.setContentDescription(R.id.widget_qd_selecting_hint, string);
    }

    public static void k(Context context, AppWidgetManager appWidgetManager, int i) {
        context.getClass();
        iy9 iy9VarF = f(context, appWidgetManager, i);
        Bitmap bitmapM = m(context, ((Number) iy9VarF.a()).intValue(), ((Number) iy9VarF.b()).intValue());
        if (bitmapM == null) {
            return;
        }
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_quick_decision);
        remoteViews.setImageViewBitmap(R.id.widget_qd_card_stack, bitmapM);
        appWidgetManager.partiallyUpdateAppWidget(i, remoteViews);
    }

    public static Bitmap l(Context context, int i, int i2) {
        Bitmap bitmapDecodeResource;
        try {
            bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.widget_qd_fan);
        } catch (Exception e) {
            tec.t(hf8.Q, "QDWidgetHelper", "decode widget_qd_fan failed", e);
            bitmapDecodeResource = null;
        }
        if (bitmapDecodeResource == null) {
            return null;
        }
        try {
            float fN = n(context);
            int i3 = (int) (i * fN);
            int i4 = 1;
            if (i3 < 1) {
                i3 = 1;
            }
            float f = i2;
            int i5 = (int) (f * fN);
            if (i5 >= 1) {
                i4 = i5;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.getClass();
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.scale(fN, fN);
            float f2 = 1.6535f * f;
            float f3 = (-0.645f) * f;
            float f4 = f * (-0.1895f);
            canvas.drawBitmap(bitmapDecodeResource, (Rect) null, new RectF(f3, f4, ((bitmapDecodeResource.getWidth() * f2) / bitmapDecodeResource.getHeight()) + f3, f2 + f4), new Paint(3));
            return bitmapCreateBitmap;
        } catch (Exception e2) {
            hf8.Q.getClass();
            ef8.a("QDWidgetHelper").c("renderBakedFanBitmap failed", e2);
            return null;
        } finally {
            bitmapDecodeResource.recycle();
        }
    }

    public static Bitmap m(Context context, int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return null;
        }
        Bitmap bitmapI = i(context);
        if (bitmapI == null) {
            return l(context, i, i2);
        }
        try {
            float fN = n(context);
            float f = i2;
            float f2 = f / 158.0f;
            int i3 = (int) (i * fN);
            if (i3 < 1) {
                i3 = 1;
            }
            int i4 = (int) (f * fN);
            if (i4 < 1) {
                i4 = 1;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.getClass();
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.scale(fN, fN);
            float f3 = f2 * 108.0f;
            float f4 = f2 * 189.0f;
            float f5 = f2 * 10.0f;
            Paint paint = new Paint(1);
            paint.setColor(-16777216);
            paint.setShadowLayer(24.0f * f2, 0.0f, 12.0f * f2, 1076502604);
            Paint paint2 = new Paint(3);
            Paint paint3 = new Paint(1);
            paint3.setStyle(Paint.Style.STROKE);
            float f6 = 0.5f * f2;
            if (f6 < 1.0f) {
                f6 = 1.0f;
            }
            paint3.setStrokeWidth(f6);
            paint3.setColor(855638016);
            for (a7b a7bVar : c) {
                Bitmap bitmap = bitmapCreateBitmap;
                Canvas canvas2 = canvas;
                e(canvas2, bitmapI, a7bVar.a * f2, a7bVar.b * f2, f3, f4, a7bVar.c, f5, paint, paint2, paint3, a7bVar.d);
                canvas = canvas2;
                bitmapCreateBitmap = bitmap;
            }
            return bitmapCreateBitmap;
        } catch (Exception e) {
            hf8.Q.getClass();
            ef8.a("QDWidgetHelper").c("renderInitialStackBitmap failed", e);
            return l(context, i, i2);
        } finally {
            bitmapI.recycle();
        }
    }

    public static float n(Context context) {
        float f = context.getResources().getDisplayMetrics().density;
        return (f <= 2.0f ? f : 2.0f) / f;
    }

    public static Bitmap o(Context context, Bitmap bitmap, int i, int i2, float f, float f2) {
        float f3 = f2;
        float fN = n(context);
        float f4 = i;
        int i3 = (int) (f4 * fN);
        if (i3 < 1) {
            i3 = 1;
        }
        float f5 = i2;
        int i4 = (int) (f5 * fN);
        if (i4 < 1) {
            i4 = 1;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.getClass();
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.scale(fN, fN);
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        Paint paint = new Paint(1);
        paint.setTextSize(12.0f * f);
        paint.setColor(b);
        paint.setTextAlign(Paint.Align.CENTER);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f6 = f * 2.0f;
        float f7 = (f5 - ((height + f6) + (fontMetrics.descent - fontMetrics.ascent))) / 2.0f;
        float f8 = (f4 - (3.0f * width)) / 2.0f;
        float f9 = (-width) * 0.18f;
        float f10 = 0.1f * width;
        Paint paint2 = new Paint(3);
        paint2.setAlpha((int) (mh3.n(f3, 0.0f, 1.0f) * 255.0f));
        int i5 = 0;
        while (i5 < 3) {
            float f11 = i5;
            float f12 = (f11 * f10) + f9;
            canvas.drawBitmap(bitmap, ((((f11 * width) + f8) - f12) * f3) + f12, f7, paint2);
            i5++;
            f3 = f2;
        }
        float fN2 = mh3.n((f2 - 0.6f) / 0.4f, 0.0f, 1.0f);
        if (fN2 > 0.0f) {
            paint.setAlpha((int) (fN2 * 255.0f));
            canvas.drawText(context.getString(R.string.widget_quick_decision_selecting_hint), f4 / 2.0f, ((f7 + height) + f6) - fontMetrics.ascent, paint);
        }
        return bitmapCreateBitmap;
    }

    public static void p(RemoteViews remoteViews, String str) {
        remoteViews.setViewVisibility(R.id.widget_qd_transition_canvas, str.equals("selecting") ? 0 : 8);
        remoteViews.setViewVisibility(R.id.widget_qd_initial_group, str.equals("initial") ? 0 : 8);
        remoteViews.setViewVisibility(R.id.widget_qd_selecting_cards, str.equals("selecting") ? 0 : 8);
        remoteViews.setViewVisibility(R.id.widget_qd_answer_column, str.equals("result") ? 0 : 8);
        remoteViews.setViewVisibility(R.id.widget_qd_result_bar, str.equals("result") ? 0 : 8);
        remoteViews.setDisplayedChild(R.id.widget_qd_card_flipper, str.equals("result") ? 1 : 0);
        remoteViews.setViewVisibility(R.id.widget_qd_bg_image, str.equals("result") ? 0 : 8);
        remoteViews.setFloat(R.id.widget_qd_title, "setAlpha", 1.0f);
        remoteViews.setFloat(R.id.widget_qd_subtitle, "setAlpha", 1.0f);
        remoteViews.setFloat(R.id.widget_qd_draw_btn, "setAlpha", 1.0f);
        remoteViews.setFloat(R.id.widget_qd_selecting_hint, "setAlpha", 1.0f);
        remoteViews.setFloat(R.id.widget_qd_card_stack, "setAlpha", 1.0f);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x03fb A[Catch: Exception -> 0x040c, TryCatch #2 {Exception -> 0x040c, blocks: (B:100:0x03cb, B:101:0x03f5, B:103:0x03fb, B:105:0x0408, B:109:0x0412, B:113:0x042c), top: B:178:0x03cb }] */
    /* JADX WARN: Code duplicated, block: B:111:0x0429  */
    /* JADX WARN: Code duplicated, block: B:112:0x042a  */
    /* JADX WARN: Code duplicated, block: B:118:0x0475  */
    /* JADX WARN: Code duplicated, block: B:121:0x047b  */
    /* JADX WARN: Code duplicated, block: B:122:0x047d  */
    /* JADX WARN: Code duplicated, block: B:143:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:146:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:199:0x0408 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x03f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x020f  */
    /* JADX WARN: Code duplicated, block: B:59:0x022b  */
    /* JADX WARN: Code duplicated, block: B:87:0x036e  */
    /* JADX WARN: Code duplicated, block: B:91:0x0394  */
    /* JADX WARN: Code duplicated, block: B:94:0x039a  */
    /* JADX WARN: Code duplicated, block: B:97:0x03a1  */
    public static void q(Context context, AppWidgetManager appWidgetManager, int i) {
        Bitmap bitmap;
        Bitmap bitmapH;
        String str;
        Class cls;
        Bitmap bitmap2;
        float f;
        float f2;
        float f3;
        float f4;
        Bitmap bitmapCreateBitmap;
        List list;
        float f5;
        int i2;
        Bitmap bitmap3;
        Bitmap bitmapCreateBitmap2;
        long j;
        int i3;
        int i4;
        int i5;
        int i6;
        Canvas canvas;
        String lowerCase;
        ArrayList arrayList;
        float f6;
        int i7;
        int i8;
        int i9;
        int i10;
        Drawable drawable;
        Drawable drawableMutate;
        Bitmap bitmap4;
        int i11 = i;
        context.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences("quick_decision_widget", 0);
        String string = sharedPreferences.getString(d7b.a(i11, "qd_state"), "initial");
        String str2 = string != null ? string : "initial";
        hf8.Q.getClass();
        ef8.a("QDWidgetHelper").e("updateWidget id=" + i11 + " state=" + str2);
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_quick_decision);
        p(remoteViews, str2);
        if (str2.equals("selecting")) {
            iy9 iy9VarF = f(context, appWidgetManager, i);
            j(context, ((Number) iy9VarF.a()).intValue(), ((Number) iy9VarF.b()).intValue(), remoteViews, i11, null);
        } else if (str2.equals("result")) {
            String string2 = sharedPreferences.getString(d7b.a(i11, "qd_answer"), "");
            if (string2 == null) {
                string2 = "";
            }
            String string3 = sharedPreferences.getString(d7b.a(i11, "qd_card_name"), "");
            if (string3 == null) {
                string3 = "";
            }
            String string4 = sharedPreferences.getString(d7b.a(i11, "qd_selected_card_key"), "");
            String str3 = string4 != null ? string4 : "";
            long j2 = sharedPreferences.getLong(d7b.a(i11, "qd_db_id"), -1L);
            remoteViews.setTextViewText(R.id.widget_qd_card_info, string3);
            try {
                bitmapH = h(context, str3);
            } catch (Exception e) {
                tec.t(hf8.Q, "QDWidgetHelper", "Failed to load card bitmap", e);
                bitmapH = null;
            }
            if (bitmapH == null) {
                str = "appWidgetId";
                cls = QuickDecisionWidgetReceiver.class;
                j = j2;
                i3 = 201326592;
                i4 = R.id.widget_qd_refresh;
            } else {
                int iA = a4g.a(bitmapH);
                float[] fArr = new float[3];
                Color.colorToHSV(iA, fArr);
                int iC = a4g.c(fArr[0], 0.55f, 0.18f);
                float[] fArr2 = new float[3];
                Color.colorToHSV(iA, fArr2);
                float f7 = fArr2[0];
                iy9 iy9Var = new iy9(Integer.valueOf(a4g.c(f7, 0.12f, 0.97f)), Integer.valueOf(a4g.c(f7, 0.22f, 0.86f)));
                int iIntValue = ((Number) iy9Var.a()).intValue();
                int iIntValue2 = ((Number) iy9Var.b()).intValue();
                float f8 = context.getResources().getDisplayMetrics().density;
                float f9 = f8 > 2.0f ? 2.0f : f8;
                iy9 iy9VarF2 = f(context, appWidgetManager, i);
                int iIntValue3 = ((Number) iy9VarF2.a()).intValue();
                int iIntValue4 = ((Number) iy9VarF2.b()).intValue();
                float f10 = f9 / f8;
                float f11 = iIntValue3;
                int i12 = (int) (f11 * f10);
                int i13 = (int) (iIntValue4 * f10);
                float f12 = f9 * 16.0f;
                int i14 = i12 < 1 ? 1 : i12;
                int i15 = i13 < 1 ? 1 : i13;
                try {
                    Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(i14, i15, Bitmap.Config.ARGB_8888);
                    bitmapCreateBitmap3.getClass();
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap3);
                    float f13 = i14;
                    float f14 = i15;
                    str = "appWidgetId";
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            RectF rectF = new RectF(0.0f, 0.0f, f13, f14);
                                            Path path = new Path();
                                            path.addRoundRect(rectF, f12, f12, Path.Direction.CW);
                                            canvas2.clipPath(path);
                                            float f15 = f13 / 2.0f;
                                            float f16 = f14 / 2.0f;
                                            double radians = Math.toRadians(115.0d);
                                            cls = QuickDecisionWidgetReceiver.class;
                                            try {
                                                float fSin = f13 * ((float) (Math.sin(radians) / 2.0d));
                                                float f17 = ((float) ((-Math.cos(radians)) / 2.0d)) * f14;
                                                LinearGradient linearGradient = new LinearGradient(f15 - fSin, f16 - f17, f15 + fSin, f16 + f17, iIntValue, iIntValue2, Shader.TileMode.CLAMP);
                                                Paint paint = new Paint(1);
                                                paint.setShader(linearGradient);
                                                canvas2.drawRect(rectF, paint);
                                                bitmap2 = bitmapCreateBitmap3;
                                            } catch (Exception e2) {
                                                e = e2;
                                                tec.t(hf8.Q, "QDWidgetHelper", "buildAngledGradientBitmap failed", e);
                                                bitmap2 = null;
                                            }
                                        } catch (Exception e3) {
                                            e = e3;
                                            cls = QuickDecisionWidgetReceiver.class;
                                            tec.t(hf8.Q, "QDWidgetHelper", "buildAngledGradientBitmap failed", e);
                                            bitmap2 = null;
                                            if (bitmap2 != null) {
                                                remoteViews.setImageViewBitmap(R.id.widget_qd_bg_image, bitmap2);
                                            }
                                            f = ((f11 * 0.55f) - (18.0f * f8)) / 166.1f;
                                            f2 = f11 * 0.45f;
                                            if (iIntValue3 > 0) {
                                                f3 = 12.0f;
                                                f4 = f2;
                                                bitmapCreateBitmap = null;
                                            } else {
                                                f3 = 12.0f;
                                                f4 = f2;
                                                bitmapCreateBitmap = null;
                                            }
                                            bitmapH.recycle();
                                            if (bitmapCreateBitmap != null) {
                                                remoteViews.setImageViewBitmap(R.id.widget_qd_card_image, bitmapCreateBitmap);
                                            }
                                            list = d;
                                            float f18 = context.getResources().getDisplayMetrics().density;
                                            Typeface typefaceA = hyb.a(context, R.font.notoserif_medium);
                                            float fN = n(context);
                                            int i16 = (int) (174.0f * f18);
                                            if (iIntValue4 < 1) {
                                                iIntValue4 = 1;
                                            }
                                            i5 = (int) (i16 * fN);
                                            if (i5 < 1) {
                                                i5 = 1;
                                            }
                                            float f19 = iIntValue4;
                                            i6 = (int) (f19 * fN);
                                            if (i6 < 1) {
                                                i6 = 1;
                                            }
                                            bitmapCreateBitmap2 = Bitmap.createBitmap(i5, i6, Bitmap.Config.ARGB_8888);
                                            bitmapCreateBitmap2.getClass();
                                            canvas = new Canvas(bitmapCreateBitmap2);
                                            canvas.scale(fN, fN);
                                            f5 = f;
                                            Map mapH = bm8.H(new iy9("no", "No"), new iy9("yes", "Yes"), new iy9("maybe", "Maybe"));
                                            String string5 = v4e.o0(string2).toString();
                                            Locale locale = Locale.ROOT;
                                            locale.getClass();
                                            lowerCase = string5.toLowerCase(locale);
                                            lowerCase.getClass();
                                            arrayList = new ArrayList();
                                            for (Object obj : list) {
                                                if (!pa7.t((String) obj, lowerCase)) {
                                                    arrayList.add(obj);
                                                }
                                            }
                                            String str4 = (String) s72.y0(0, arrayList);
                                            String str5 = (String) s72.y0(1, arrayList);
                                            if (list.contains(lowerCase)) {
                                                lowerCase = "yes";
                                            }
                                            float f20 = f18 * 44.0f;
                                            float f21 = 43.5f * f18;
                                            f6 = f19 / 2.0f;
                                            float f22 = f6 - f21;
                                            float f23 = f21 + f6;
                                            Paint paint2 = new Paint(1);
                                            paint2.setTypeface(typefaceA);
                                            b(mapH, paint2, iC, f18, canvas, f20, str4, f22, 27.0f, 1);
                                            b(mapH, paint2, iC, f18, canvas, f20, str5, f23, 27.0f, 2);
                                            b(mapH, paint2, iC, f18, canvas, f20, lowerCase, f6, 32.0f, 0);
                                            i2 = iC;
                                            i7 = (int) (f18 * 20.0f);
                                            i8 = (int) (f18 * f3);
                                            if (i8 < 1) {
                                                i8 = 1;
                                            }
                                            i9 = (int) (f18 * 16.0f);
                                            if (i9 < 1) {
                                                i10 = 1;
                                            } else {
                                                i10 = i9;
                                            }
                                            Resources resources = context.getResources();
                                            ThreadLocal threadLocal = hyb.a;
                                            bitmap3 = null;
                                            drawable = resources.getDrawable(R.drawable.ic_widget_qd_answer_marker, null);
                                            if (drawable != null) {
                                                drawableMutate.setTint(i2);
                                                int i17 = (int) (f6 - (i10 / 2.0f));
                                                drawableMutate.setBounds(i7, i17, i8 + i7, i10 + i17);
                                                drawableMutate.draw(canvas);
                                            }
                                            if (bitmapCreateBitmap2 != null) {
                                                remoteViews.setImageViewBitmap(R.id.widget_qd_answer_column, bitmapCreateBitmap2);
                                            }
                                            if (string2.length() > 0) {
                                                remoteViews.setContentDescription(R.id.widget_qd_answer_column, string2);
                                            }
                                            j = j2;
                                            i3 = 201326592;
                                            i4 = R.id.widget_qd_refresh;
                                            remoteViews.setViewPadding(R.id.widget_qd_result_bar, (int) ((f5 * 7.5f) + f4), 0, 0, 0);
                                            remoteViews.setTextColor(R.id.widget_qd_card_info, i2);
                                            remoteViews.setInt(R.id.widget_qd_card_info, "setBackgroundResource", R.drawable.widget_qd_capsule_frosted);
                                            remoteViews.setImageViewResource(R.id.widget_qd_refresh, R.drawable.ic_widget_qd_reset_glyph);
                                            remoteViews.setInt(R.id.widget_qd_refresh, "setBackgroundResource", R.drawable.widget_qd_capsule_frosted);
                                            remoteViews.setInt(R.id.widget_qd_refresh, "setColorFilter", i2);
                                            Intent intent = new Intent(context, (Class<?>) MainActivity.class);
                                            intent.putExtra("source", "quick_decision_widget");
                                            intent.putExtra("qd_id", j);
                                            int i18 = i * 10;
                                            remoteViews.setOnClickPendingIntent(R.id.widget_qd_root, PendingIntent.getActivity(context, i18 + 5, intent, i3));
                                            Intent intent2 = new Intent(context, (Class<?>) cls);
                                            intent2.setAction("ai.askquin.widget.QD_RESET");
                                            i11 = i;
                                            intent2.putExtra(str, i11);
                                            remoteViews.setOnClickPendingIntent(i4, PendingIntent.getBroadcast(context, i18 + 6, intent2, i3));
                                            appWidgetManager.updateAppWidget(i11, remoteViews);
                                        }
                                        drawable = resources.getDrawable(R.drawable.ic_widget_qd_answer_marker, null);
                                        if (drawable != null && (drawableMutate = drawable.mutate()) != null) {
                                            drawableMutate.setTint(i2);
                                            int i19 = (int) (f6 - (i10 / 2.0f));
                                            drawableMutate.setBounds(i7, i19, i8 + i7, i10 + i19);
                                            drawableMutate.draw(canvas);
                                        }
                                    } catch (Exception e4) {
                                        e = e4;
                                        tec.t(hf8.Q, "QDWidgetHelper", "createAnswerColumnBitmap failed", e);
                                        bitmapCreateBitmap2 = bitmap3;
                                    }
                                    Resources resources2 = context.getResources();
                                    ThreadLocal threadLocal2 = hyb.a;
                                    bitmap3 = null;
                                } catch (Exception e5) {
                                    e = e5;
                                    bitmap3 = null;
                                    tec.t(hf8.Q, "QDWidgetHelper", "createAnswerColumnBitmap failed", e);
                                    bitmapCreateBitmap2 = bitmap3;
                                    if (bitmapCreateBitmap2 != null) {
                                        remoteViews.setImageViewBitmap(R.id.widget_qd_answer_column, bitmapCreateBitmap2);
                                    }
                                    if (string2.length() > 0) {
                                        remoteViews.setContentDescription(R.id.widget_qd_answer_column, string2);
                                    }
                                    j = j2;
                                    i3 = 201326592;
                                    i4 = R.id.widget_qd_refresh;
                                    remoteViews.setViewPadding(R.id.widget_qd_result_bar, (int) ((f5 * 7.5f) + f4), 0, 0, 0);
                                    remoteViews.setTextColor(R.id.widget_qd_card_info, i2);
                                    remoteViews.setInt(R.id.widget_qd_card_info, "setBackgroundResource", R.drawable.widget_qd_capsule_frosted);
                                    remoteViews.setImageViewResource(R.id.widget_qd_refresh, R.drawable.ic_widget_qd_reset_glyph);
                                    remoteViews.setInt(R.id.widget_qd_refresh, "setBackgroundResource", R.drawable.widget_qd_capsule_frosted);
                                    remoteViews.setInt(R.id.widget_qd_refresh, "setColorFilter", i2);
                                    Intent intent3 = new Intent(context, (Class<?>) MainActivity.class);
                                    intent3.putExtra("source", "quick_decision_widget");
                                    intent3.putExtra("qd_id", j);
                                    int i110 = i * 10;
                                    remoteViews.setOnClickPendingIntent(R.id.widget_qd_root, PendingIntent.getActivity(context, i110 + 5, intent3, i3));
                                    Intent intent4 = new Intent(context, (Class<?>) cls);
                                    intent4.setAction("ai.askquin.widget.QD_RESET");
                                    i11 = i;
                                    intent4.putExtra(str, i11);
                                    remoteViews.setOnClickPendingIntent(i4, PendingIntent.getBroadcast(context, i110 + 6, intent4, i3));
                                    appWidgetManager.updateAppWidget(i11, remoteViews);
                                }
                                b(mapH, paint2, iC, f18, canvas, f20, str4, f22, 27.0f, 1);
                                b(mapH, paint2, iC, f18, canvas, f20, str5, f23, 27.0f, 2);
                                b(mapH, paint2, iC, f18, canvas, f20, lowerCase, f6, 32.0f, 0);
                                i2 = iC;
                                i7 = (int) (f18 * 20.0f);
                                i8 = (int) (f18 * f3);
                                if (i8 < 1) {
                                    i8 = 1;
                                }
                                i9 = (int) (f18 * 16.0f);
                                if (i9 < 1) {
                                    i10 = 1;
                                } else {
                                    i10 = i9;
                                }
                            } catch (Exception e6) {
                                e = e6;
                                i2 = iC;
                            }
                            Map mapH2 = bm8.H(new iy9("no", "No"), new iy9("yes", "Yes"), new iy9("maybe", "Maybe"));
                            String string6 = v4e.o0(string2).toString();
                            Locale locale2 = Locale.ROOT;
                            locale2.getClass();
                            lowerCase = string6.toLowerCase(locale2);
                            lowerCase.getClass();
                            arrayList = new ArrayList();
                            while (r10.hasNext()) {
                                if (!pa7.t((String) obj, lowerCase)) {
                                    arrayList.add(obj);
                                }
                            }
                            String str6 = (String) s72.y0(0, arrayList);
                            String str7 = (String) s72.y0(1, arrayList);
                            if (list.contains(lowerCase)) {
                                lowerCase = "yes";
                            }
                            float f24 = f18 * 44.0f;
                            float f25 = 43.5f * f18;
                            f6 = f19 / 2.0f;
                            float f26 = f6 - f25;
                            float f27 = f25 + f6;
                            Paint paint3 = new Paint(1);
                            paint3.setTypeface(typefaceA);
                        } catch (Exception e7) {
                            e = e7;
                            i2 = iC;
                            bitmap3 = null;
                            tec.t(hf8.Q, "QDWidgetHelper", "createAnswerColumnBitmap failed", e);
                            bitmapCreateBitmap2 = bitmap3;
                            if (bitmapCreateBitmap2 != null) {
                                remoteViews.setImageViewBitmap(R.id.widget_qd_answer_column, bitmapCreateBitmap2);
                            }
                            if (string2.length() > 0) {
                                remoteViews.setContentDescription(R.id.widget_qd_answer_column, string2);
                            }
                            j = j2;
                            i3 = 201326592;
                            i4 = R.id.widget_qd_refresh;
                            remoteViews.setViewPadding(R.id.widget_qd_result_bar, (int) ((f5 * 7.5f) + f4), 0, 0, 0);
                            remoteViews.setTextColor(R.id.widget_qd_card_info, i2);
                            remoteViews.setInt(R.id.widget_qd_card_info, "setBackgroundResource", R.drawable.widget_qd_capsule_frosted);
                            remoteViews.setImageViewResource(R.id.widget_qd_refresh, R.drawable.ic_widget_qd_reset_glyph);
                            remoteViews.setInt(R.id.widget_qd_refresh, "setBackgroundResource", R.drawable.widget_qd_capsule_frosted);
                            remoteViews.setInt(R.id.widget_qd_refresh, "setColorFilter", i2);
                            Intent intent5 = new Intent(context, (Class<?>) MainActivity.class);
                            intent5.putExtra("source", "quick_decision_widget");
                            intent5.putExtra("qd_id", j);
                            int i111 = i * 10;
                            remoteViews.setOnClickPendingIntent(R.id.widget_qd_root, PendingIntent.getActivity(context, i111 + 5, intent5, i3));
                            Intent intent6 = new Intent(context, (Class<?>) cls);
                            intent6.setAction("ai.askquin.widget.QD_RESET");
                            i11 = i;
                            intent6.putExtra(str, i11);
                            remoteViews.setOnClickPendingIntent(i4, PendingIntent.getBroadcast(context, i111 + 6, intent6, i3));
                            appWidgetManager.updateAppWidget(i11, remoteViews);
                        }
                        float f110 = context.getResources().getDisplayMetrics().density;
                        Typeface typefaceA2 = hyb.a(context, R.font.notoserif_medium);
                        float fN2 = n(context);
                        int i112 = (int) (174.0f * f110);
                        if (iIntValue4 < 1) {
                            iIntValue4 = 1;
                        }
                        i5 = (int) (i112 * fN2);
                        if (i5 < 1) {
                            i5 = 1;
                        }
                        float f111 = iIntValue4;
                        i6 = (int) (f111 * fN2);
                        if (i6 < 1) {
                            i6 = 1;
                        }
                        bitmapCreateBitmap2 = Bitmap.createBitmap(i5, i6, Bitmap.Config.ARGB_8888);
                        bitmapCreateBitmap2.getClass();
                        canvas = new Canvas(bitmapCreateBitmap2);
                        canvas.scale(fN2, fN2);
                        f5 = f;
                    } catch (Exception e8) {
                        e = e8;
                        f5 = f;
                    }
                } catch (Exception e9) {
                    e = e9;
                    str = "appWidgetId";
                }
                if (bitmap2 != null) {
                    remoteViews.setImageViewBitmap(R.id.widget_qd_bg_image, bitmap2);
                }
                f = ((f11 * 0.55f) - (18.0f * f8)) / 166.1f;
                f2 = f11 * 0.45f;
                if (iIntValue3 > 0 || iIntValue4 <= 0) {
                    f3 = 12.0f;
                    f4 = f2;
                    bitmapCreateBitmap = null;
                } else {
                    Bitmap bitmapI = i(context);
                    if (i12 < 1) {
                        i12 = 1;
                    }
                    if (i13 < 1) {
                        i13 = 1;
                    }
                    try {
                        bitmapCreateBitmap = Bitmap.createBitmap(i12, i13, Bitmap.Config.ARGB_8888);
                        bitmapCreateBitmap.getClass();
                        Canvas canvas3 = new Canvas(bitmapCreateBitmap);
                        canvas3.scale(f10, f10);
                        float f28 = f * 95.9f;
                        float f29 = f * 167.9f;
                        float f30 = f * 8.0f;
                        float f31 = 0.5f * f;
                        if (f31 < 1.0f) {
                            f31 = 1.0f;
                        }
                        float f32 = 24.0f * f;
                        float f33 = 4.0f * f;
                        float f34 = f * 12.0f;
                        f3 = 12.0f;
                        f4 = f2;
                        bitmap4 = bitmapI;
                        try {
                            double radians2 = Math.toRadians(Math.abs(-8.0f));
                            float fSin2 = ((((float) ((Math.sin(radians2) * 167.89999389648438d) + (Math.cos(radians2) * 95.9000015258789d))) / 2.0f) * f) + f4;
                            double radians3 = Math.toRadians(Math.abs(-8.0f));
                            float fCos = ((((float) ((Math.cos(radians3) * 167.89999389648438d) + (Math.sin(radians3) * 95.9000015258789d))) / 2.0f) * f) + f34;
                            double radians4 = Math.toRadians(Math.abs(15.0f));
                            float fSin3 = (((((float) ((Math.sin(radians4) * 167.89999389648438d) + (Math.cos(radians4) * 95.9000015258789d))) / 2.0f) + 29.9f) * f) + f4;
                            double radians5 = Math.toRadians(Math.abs(15.0f));
                            float fCos2 = (((((float) ((Math.cos(radians5) * 167.89999389648438d) + (Math.sin(radians5) * 95.9000015258789d))) / 2.0f) + 28.2f) * f) + f34;
                            Paint paint4 = new Paint(1);
                            paint4.setColor(-16777216);
                            paint4.setShadowLayer(f32, 0.0f, f33, 1078343290);
                            Paint paint5 = new Paint(3);
                            Paint paint6 = new Paint(1);
                            paint6.setStyle(Paint.Style.STROKE);
                            paint6.setStrokeWidth(f31);
                            paint6.setColor(855638016);
                            e(canvas3, bitmap4 == null ? bitmapH : bitmap4, fSin3, fCos2, f28, f29, 15.0f, f30, paint4, paint5, paint6, 0);
                            e(canvas3, bitmapH, fSin2, fCos, f28, f29, -8.0f, f30, paint4, paint5, paint6, 0);
                            if (bitmap4 != null) {
                                bitmap4.recycle();
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (bitmap4 != null) {
                                bitmap4.recycle();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bitmap4 = bitmapI;
                    }
                }
                bitmapH.recycle();
                if (bitmapCreateBitmap != null) {
                    remoteViews.setImageViewBitmap(R.id.widget_qd_card_image, bitmapCreateBitmap);
                }
                list = d;
                if (bitmapCreateBitmap2 != null) {
                    remoteViews.setImageViewBitmap(R.id.widget_qd_answer_column, bitmapCreateBitmap2);
                }
                if (string2.length() > 0) {
                    remoteViews.setContentDescription(R.id.widget_qd_answer_column, string2);
                }
                j = j2;
                i3 = 201326592;
                i4 = R.id.widget_qd_refresh;
                remoteViews.setViewPadding(R.id.widget_qd_result_bar, (int) ((f5 * 7.5f) + f4), 0, 0, 0);
                remoteViews.setTextColor(R.id.widget_qd_card_info, i2);
                remoteViews.setInt(R.id.widget_qd_card_info, "setBackgroundResource", R.drawable.widget_qd_capsule_frosted);
                remoteViews.setImageViewResource(R.id.widget_qd_refresh, R.drawable.ic_widget_qd_reset_glyph);
                remoteViews.setInt(R.id.widget_qd_refresh, "setBackgroundResource", R.drawable.widget_qd_capsule_frosted);
                remoteViews.setInt(R.id.widget_qd_refresh, "setColorFilter", i2);
            }
            Intent intent7 = new Intent(context, (Class<?>) MainActivity.class);
            intent7.putExtra("source", "quick_decision_widget");
            intent7.putExtra("qd_id", j);
            int i113 = i * 10;
            remoteViews.setOnClickPendingIntent(R.id.widget_qd_root, PendingIntent.getActivity(context, i113 + 5, intent7, i3));
            Intent intent8 = new Intent(context, (Class<?>) cls);
            intent8.setAction("ai.askquin.widget.QD_RESET");
            i11 = i;
            intent8.putExtra(str, i11);
            remoteViews.setOnClickPendingIntent(i4, PendingIntent.getBroadcast(context, i113 + 6, intent8, i3));
        } else {
            try {
                Typeface typefaceA3 = hyb.a(context, R.font.notoserif_medium);
                float f35 = context.getResources().getDisplayMetrics().scaledDensity;
                Paint paint7 = new Paint(1);
                paint7.setTypeface(typefaceA3);
                paint7.setTextSize(f35 * 32.0f);
                paint7.setColor(b);
                Rect rect = new Rect();
                paint7.getTextBounds("Yes / No", 0, 8, rect);
                int iCeil = (int) Math.ceil(paint7.measureText("Yes / No"));
                int iHeight = rect.height();
                if (iCeil < 1) {
                    iCeil = 1;
                }
                Bitmap bitmapCreateBitmap4 = Bitmap.createBitmap(iCeil, iHeight < 1 ? 1 : iHeight, Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap4.getClass();
                new Canvas(bitmapCreateBitmap4).drawText("Yes / No", -rect.left, -rect.top, paint7);
                bitmap = bitmapCreateBitmap4;
            } catch (Exception e10) {
                tec.t(hf8.Q, "QDWidgetHelper", "createTitleBitmap failed", e10);
                bitmap = null;
            }
            if (bitmap != null) {
                remoteViews.setImageViewBitmap(R.id.widget_qd_title, bitmap);
            }
            remoteViews.setContentDescription(R.id.widget_qd_title, "Yes / No");
            remoteViews.setTextViewText(R.id.widget_qd_subtitle, context.getString(R.string.widget_quick_decision_subtitle));
            remoteViews.setInt(R.id.widget_qd_subtitle, "setMaxWidth", bitmap != null ? bitmap.getWidth() : (int) (112.0f * context.getResources().getDisplayMetrics().density));
            iy9 iy9VarF3 = f(context, appWidgetManager, i);
            Bitmap bitmapM = m(context, ((Number) iy9VarF3.a()).intValue(), ((Number) iy9VarF3.b()).intValue());
            if (bitmapM != null) {
                remoteViews.setImageViewBitmap(R.id.widget_qd_card_stack, bitmapM);
            } else {
                remoteViews.setImageViewResource(R.id.widget_qd_card_stack, R.drawable.widget_qd_card_stack);
            }
            Intent intent9 = new Intent(context, (Class<?>) QuickDecisionWidgetReceiver.class);
            intent9.setAction("ai.askquin.widget.QD_DRAW");
            intent9.putExtra("appWidgetId", i11);
            PendingIntent broadcast = PendingIntent.getBroadcast(context, i11 * 10, intent9, 201326592);
            remoteViews.setOnClickPendingIntent(R.id.widget_qd_draw_btn, broadcast);
            remoteViews.setOnClickPendingIntent(R.id.widget_qd_root, broadcast);
        }
        appWidgetManager.updateAppWidget(i11, remoteViews);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0118  */
    /* JADX WARN: Code duplicated, block: B:44:0x0145  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0118 -> B:22:0x008b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(android.content.Context r24, android.appwidget.AppWidgetManager r25, int r26, defpackage.zn2 r27) {
        /*
            Method dump skipped, instruction units count: 467
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c7b.a(android.content.Context, android.appwidget.AppWidgetManager, int, zn2):java.lang.Object");
    }
}
