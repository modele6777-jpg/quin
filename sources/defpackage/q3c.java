package defpackage;

import ai.askquin.R;
import ai.askquin.model.DailyFortuneDirectionContent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.widget.RemoteViews;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q3c {
    public static final void a(j09 j09Var, String str, List list, fy9 fy9Var, l46 l46Var, int i) {
        l46 l46Var2 = l46Var;
        str.getClass();
        fy9Var.getClass();
        l46Var2.h0(2046303787);
        int i2 = i | (l46Var2.g(str) ? 32 : 16) | (l46Var2.g(list) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var2.i(fy9Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (l46Var2.W(i2 & 1, (i2 & 1171) != 1170)) {
            j09 j09VarZ = ynb.Z(tm7.n(db6.w(oa7.E(j09Var, a7c.b(30.0f)), 1.0f, ((e8b) l46Var2.k(l8b.a)).a, a7c.b(30.0f)), kj0.i0(l46Var2), null, 6), 24.0f);
            t7c t7cVarA = s7c.a(xc0.a, ndb.z, l46Var2, 48);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarZ);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z = l46Var2.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var2, t7cVarA);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var2, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var2, numValueOf);
            dec.k(l46Var2);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var2, j09VarJ);
            jw7 jw7Var = new jw7(1.0f, true);
            c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var2, 48);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, jw7Var);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var, l46Var2, c92VarA);
            dec.l(he2Var2, l46Var2, u8aVarM2);
            ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
            dec.l(he2Var4, l46Var2, j09VarJ2);
            mue mueVar = pue.a;
            nte.b(str, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.d(l46Var2), l46Var, (i2 >> 3) & 14, 0, 131070);
            l46Var2 = l46Var;
            l46Var2.f0(-2007013054);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                nte.c((k00) it.next(), null, ((e8b) l46Var2.k(l8b.a)).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, pue.a, l46Var, 0, 0, 262138);
                l46Var2 = l46Var;
            }
            l46Var2.r(false);
            l46Var2.r(true);
            feg.j(fy9Var, null, b.l(g09.a, 56.0f), null, null, 0.0f, null, l46Var2, 440 | ((i2 >> 9) & 14), 120);
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new r19(i, 8, j09Var, str, list, fy9Var);
        }
    }

    public static final void b(x16 x16Var, x16 x16Var2, x16 x16Var3, l46 l46Var, int i) {
        l46Var.h0(-1607829197);
        int i2 = (l46Var.i(x16Var) ? 4 : 2) | i | (l46Var.i(x16Var2) ? 32 : 16) | (l46Var.i(x16Var3) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            xxb.a(af1.b0(149148937, new j41(x16Var, x16Var2, x16Var3, 20), l46Var), l46Var, 6);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new n20(x16Var, x16Var2, x16Var3, i, 2);
        }
    }

    public static final void c(boolean z, use useVar, x16 x16Var, x16 x16Var2, x16 x16Var3, x16 x16Var4, l46 l46Var, int i) {
        useVar.getClass();
        x16Var.getClass();
        x16Var2.getClass();
        x16Var3.getClass();
        x16Var4.getClass();
        l46Var.h0(-793418842);
        int i2 = 4;
        int i3 = i | (l46Var.h(z) ? 4 : 2) | (l46Var.g(useVar) ? 32 : 16) | (l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(x16Var3) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.i(x16Var4) ? 131072 : 65536);
        if (l46Var.W(i3 & 1, (74899 & i3) != 74898)) {
            Context context = (Context) l46Var.k(uq.b);
            i8c i8cVar = sf2.a;
            if (z) {
                l46Var.f0(-1535442644);
                Object objR = l46Var.R();
                if (objR == i8cVar) {
                    objR = new fnc(i2);
                    l46Var.p0(objR);
                }
                dec.b("page_view", (a26) objR, l46Var, 390);
                l46Var.r(false);
            } else {
                l46Var.f0(-1535304260);
                l46Var.r(false);
            }
            String strQ = afc.q(R.string.reading_feedback_text_too_long, l46Var);
            Object objR2 = l46Var.R();
            if (objR2 == i8cVar) {
                objR2 = new pmc(new e5b(3, context, strQ));
                l46Var.p0(objR2);
            }
            g21.o(null, af1.b0(-1118543102, new g30(x16Var, x16Var2, z, x16Var3, x16Var4, useVar, (pmc) objR2), l46Var), l46Var, 48, 1);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new jt(z, useVar, x16Var, x16Var2, x16Var3, x16Var4, i);
        }
    }

    public static final void d(j09 j09Var, l46 l46Var, int i) {
        l46Var.h0(-1119766575);
        int i2 = i | (l46Var.g(j09Var) ? 4 : 2);
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            fi8 fi8VarK = y41.K(new gi8("lottie/tts-audio-bar.json"), null, l46Var, 6, 62);
            ug8 ug8VarL = rs0.l((uh8) fi8VarK.getValue(), true, false, false, 0.0f, Integer.MAX_VALUE, l46Var, 956);
            uh8 uh8Var = (uh8) fi8VarK.getValue();
            boolean zG = l46Var.g(ug8VarL);
            Object objR = l46Var.R();
            if (zG || objR == sf2.a) {
                objR = new kk3(ug8VarL, 2);
                l46Var.p0(objR);
            }
            mh3.e(uh8Var, (x16) objR, j09Var, false, false, false, false, null, false, null, an2.a, false, false, null, null, false, l46Var, (i2 << 6) & 896, 48, 129016);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new do6(i, 9, j09Var);
        }
    }

    public static final void e(j09 j09Var, l46 l46Var, int i) {
        String str;
        l46Var.h0(-1018326012);
        if (l46Var.W(i & 1, (i & 19) != 18)) {
            boolean zF = k8b.f((e8b) l46Var.k(l8b.a));
            l46Var.f0(641251035);
            if (zF) {
                str = "lottie/tts-play-wave-neo.json";
            } else {
                str = g21.S(l46Var) ? "lottie/tts-play-light.json" : "lottie/tts-play-dark.json";
            }
            l46Var.r(false);
            fi8 fi8VarK = y41.K(new gi8(str), null, l46Var, 0, 62);
            ug8 ug8VarL = rs0.l((uh8) fi8VarK.getValue(), true, false, false, 0.0f, Integer.MAX_VALUE, l46Var, 956);
            uh8 uh8Var = (uh8) fi8VarK.getValue();
            boolean zG = l46Var.g(ug8VarL);
            Object objR = l46Var.R();
            if (zG || objR == sf2.a) {
                objR = new kk3(ug8VarL, 3);
                l46Var.p0(objR);
            }
            mh3.e(uh8Var, (x16) objR, j09Var, false, false, false, false, null, false, null, null, false, false, null, null, false, l46Var, 384, 0, 131064);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new do6(i, 10, j09Var);
        }
    }

    public static final long f(int i, int i2, z2f z2fVar) {
        l17 l17Var;
        x2f x2fVar;
        if (i == -1) {
            return (((long) i2) << 32) | 4294967295L;
        }
        boolean z = i > i2;
        mx3 mx3Var = z2fVar.d;
        f77 f77Var = (mx3Var == null || (x2fVar = (x2f) mx3Var.getValue()) == null) ? null : x2fVar.b;
        long jA = f77Var != null ? f77Var.a(i, false) : u3c.b(i, i);
        long jF = z2fVar.f(jA);
        if (eue.d(jA) && eue.d(jF)) {
            l17Var = l17.a;
        } else if (eue.d(jA) || eue.d(jF)) {
            l17Var = (!eue.d(jA) || eue.d(jF)) ? l17.d : l17.b;
        } else {
            l17Var = l17.c;
        }
        int iOrdinal = l17Var.ordinal();
        q2g q2gVar = q2g.b;
        q2g q2gVar2 = q2g.a;
        if (iOrdinal == 0) {
            if (z) {
                q2gVar = q2gVar2;
            }
            return qk2.w(i, q2gVar);
        }
        if (iOrdinal == 1) {
            if (z) {
                return i == ((int) (jF >> 32)) ? qk2.w(i, q2gVar2) : qk2.w((int) (jF & 4294967295L), q2gVar);
            }
            return i == ((int) (jF & 4294967295L)) ? qk2.w(i, q2gVar) : qk2.w((int) (jF >> 32), q2gVar2);
        }
        if (iOrdinal == 2) {
            return z ? qk2.w((int) (jF & 4294967295L), q2gVar2) : qk2.w((int) (jF >> 32), q2gVar);
        }
        if (iOrdinal == 3) {
            return (((long) i) << 32) | 4294967295L;
        }
        ap.c();
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000a  */
    public static Bitmap g(Bitmap bitmap, float f, boolean z) {
        float f2;
        if (z) {
            f2 = 2.15f;
            if (f <= 2.15f) {
                f2 = f;
            }
        } else {
            f2 = 3.0f;
            if (f <= 3.0f) {
                f2 = f;
            }
        }
        int i = (int) ((z ? 338.0f : 158.0f) * f2);
        int i2 = (int) (158.0f * f2);
        int i3 = (int) ((z ? 140.0f : 78.0f) * f2);
        int i4 = (int) ((z ? 245.0f : 136.5f) * f2);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.getClass();
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        int iA = a4g.a(bitmap);
        float[] fArr = new float[3];
        Color.colorToHSV(iA, fArr);
        canvas.drawColor(a4g.c(fArr[0], 0.4f, 0.12f));
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i3, i4, true);
        bitmapCreateScaledBitmap.getClass();
        Paint paint = new Paint(3);
        canvas.save();
        float f3 = i;
        float f4 = i2;
        canvas.rotate(15.0f, f3 / 2.0f, f4 / 2.0f);
        double d = i;
        double d2 = i2;
        float fSqrt = (float) Math.sqrt((d2 * d2) + (d * d));
        float f5 = i3;
        float f6 = ((f3 - fSqrt) / 2.0f) - f5;
        float f7 = ((f3 + fSqrt) / 2.0f) + f5;
        float f8 = i4;
        float f9 = ((f4 - fSqrt) / 2.0f) - f8;
        float f10 = ((fSqrt + f4) / 2.0f) + f8;
        int i5 = 0;
        while (f6 < f7) {
            for (float f11 = (((i5 * 0.6666667f) % 1.0f) * f8) + f9; f11 < f10; f11 += f8) {
                canvas.drawBitmap(bitmapCreateScaledBitmap, f6, f11, paint);
            }
            f6 += f5;
            i5++;
        }
        canvas.restore();
        bitmapCreateScaledBitmap.recycle();
        int i6 = a4g.a;
        float[] fArr2 = new float[3];
        Color.colorToHSV(iA, fArr2);
        int iC = a4g.c(fArr2[0], 0.45f, 0.2f);
        LinearGradient linearGradientO = z ? o(0.0f, f3, iC) : o(f4, 0.0f, iC);
        Paint paint2 = new Paint(1);
        paint2.setShader(linearGradientO);
        canvas.drawRect(0.0f, 0.0f, f3, f4, paint2);
        float f12 = f2 * 16.0f;
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap2.getClass();
        Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
        Path path = new Path();
        path.addRoundRect(new RectF(0.0f, 0.0f, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight()), f12, f12, Path.Direction.CW);
        canvas2.clipPath(path);
        canvas2.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, (Paint) null);
        bitmapCreateBitmap.recycle();
        return bitmapCreateBitmap2;
    }

    public static float h(float f, float f2, float f3) {
        float f4 = 1.0f - f;
        float f5 = 3.0f * f4;
        float f6 = f4 * f5 * f * f2;
        return (f * f * f) + (f5 * f * f * f3) + f6;
    }

    public static Bitmap i(Context context, String str, BitmapFactory.Options options) throws IOException {
        InputStream inputStreamOpen = context.getAssets().open(str);
        try {
            inputStreamOpen.mark(inputStreamOpen.available());
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(inputStreamOpen, null, options);
            options.inSampleSize = jzb.h(options);
            options.inJustDecodeBounds = false;
            inputStreamOpen.reset();
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen, null, options);
            inputStreamOpen.close();
            return bitmapDecodeStream;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ym8.t(inputStreamOpen, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0062  */
    /* JADX WARN: Multi-variable type inference failed */
    public static void j(Context context, RemoteViews remoteViews, boolean z) {
        String string;
        String affirmation;
        List list = g6g.a;
        LocalDate localDateNow = LocalDate.now();
        localDateNow.getClass();
        hs3 hs3Var = xqa.A;
        d6g d6gVarF = g6g.f(context, localDateNow, (String) z5c.I(nu4.a, new f6g(hs3Var.a, hs3Var.b, null)));
        boolean z2 = d6gVarF != null;
        String str = d6gVarF != null ? d6gVarF.c : null;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        boolean z3 = d6gVarF != null ? d6gVarF.f : 0;
        TarotCardType.Companion.getClass();
        TarotCardType tarotCardTypeA = fie.a(str);
        if (tarotCardTypeA == null || (string = context.getString(tarotCardTypeA.getTitleRes())) == null) {
            string = d6gVarF != null ? d6gVarF.d : null;
            if (string == null) {
                string = "";
            }
        }
        if (str.length() == 0) {
            affirmation = null;
        } else {
            try {
                DailyFortuneDirectionContent dailyFortuneDirectionContentB = new ai.askquin.repository.b(context).b(new qhe(str, !z3));
                if (dailyFortuneDirectionContentB != null) {
                    affirmation = dailyFortuneDirectionContentB.getAffirmation();
                } else {
                    affirmation = null;
                }
            } catch (Exception unused) {
            }
        }
        if (affirmation == null) {
            String str3 = d6gVarF != null ? d6gVarF.e : null;
            if (str3 != null) {
                str2 = str3;
            }
        } else {
            str2 = affirmation;
        }
        if (!z2 || string.length() <= 0) {
            String string2 = context.getString(R.string.widget_daily_fortune_title);
            string2.getClass();
            String string3 = context.getString(R.string.widget_daily_fortune_guidance_ready);
            string3.getClass();
            remoteViews.setViewVisibility(R.id.widget_card_image, 0);
            if (z) {
                remoteViews.setImageViewResource(R.id.widget_card_image, R.drawable.widget_card_back_sticker_wide);
                remoteViews.setViewVisibility(R.id.widget_reverse_tag, 8);
                remoteViews.setTextViewText(R.id.widget_card_name, string2);
                remoteViews.setTextColor(R.id.widget_card_name, -1);
                remoteViews.setViewVisibility(R.id.widget_card_name_row, 0);
                remoteViews.setViewVisibility(R.id.widget_drawn_text, 0);
                remoteViews.setTextViewText(R.id.widget_subtitle, string3);
                remoteViews.setTextColor(R.id.widget_subtitle, -2130706433);
                remoteViews.setViewVisibility(R.id.widget_subtitle, 0);
            } else {
                remoteViews.setImageViewResource(R.id.widget_card_image, R.drawable.widget_card_back_sticker);
                remoteViews.setViewVisibility(R.id.widget_square_drawn_text, 8);
                remoteViews.setViewVisibility(R.id.widget_square_undrawn_title, 0);
                remoteViews.setViewVisibility(R.id.widget_square_date_block, 0);
            }
            q(remoteViews, z);
            return;
        }
        try {
            if (d6gVarF == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Bitmap bitmapN = n(d6gVarF, context);
            if (bitmapN != null) {
                remoteViews.setImageViewBitmap(R.id.widget_bg_overlay, g(bitmapN, context.getResources().getDisplayMetrics().density, z));
                remoteViews.setFloat(R.id.widget_bg_overlay, "setAlpha", 1.0f);
                bitmapN.recycle();
            } else {
                q(remoteViews, z);
            }
            if (!z) {
                remoteViews.setTextViewText(R.id.widget_square_card_name, string);
                remoteViews.setViewVisibility(R.id.widget_square_card_name, 0);
                remoteViews.setViewVisibility(R.id.widget_square_drawn_text, 0);
                remoteViews.setViewVisibility(R.id.widget_square_undrawn_title, 8);
                remoteViews.setViewVisibility(R.id.widget_square_date_block, 8);
                remoteViews.setViewVisibility(R.id.widget_card_image, 8);
                return;
            }
            remoteViews.setTextViewText(R.id.widget_card_name, string);
            remoteViews.setTextColor(R.id.widget_card_name, -1);
            if (z3 != 0) {
                remoteViews.setTextViewText(R.id.widget_reverse_tag, context.getString(R.string.text_reverse_tag));
                remoteViews.setViewVisibility(R.id.widget_reverse_tag, 0);
            } else {
                remoteViews.setViewVisibility(R.id.widget_reverse_tag, 8);
            }
            remoteViews.setViewVisibility(R.id.widget_card_name_row, 0);
            remoteViews.setViewVisibility(R.id.widget_card_image, 8);
            remoteViews.setViewVisibility(R.id.widget_drawn_text, 0);
            if (str2.length() != 0) {
                string = str2;
            }
            remoteViews.setTextViewText(R.id.widget_subtitle, string);
            remoteViews.setTextColor(R.id.widget_subtitle, -2130706433);
            remoteViews.setViewVisibility(R.id.widget_subtitle, 0);
        } catch (Exception e) {
            tec.t(hf8.Q, "WidgetHelper", "fillCardData: exception during bitmap processing", e);
            q(remoteViews, z);
        }
    }

    public static final Map l(x6d x6dVar, e8d e8dVar) {
        return bm8.H(new iy9("source", x6dVar.a.a()), new iy9("format", e8dVar.a()));
    }

    public static final float m(float f, float f2, float f3) {
        return ks0.a(f2, f, f3, f);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0060  */
    public static Bitmap n(d6g d6gVar, Context context) {
        Bitmap bitmapDecodeFile;
        Bitmap bitmapI;
        try {
            String str = d6gVar.c;
            String str2 = d6gVar.g;
            boolean z = d6gVar.h;
            if (str.length() != 0) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                if (z) {
                    File file = new File(context.getFilesDir(), "tarot-skins/" + str2 + "/" + str + ".webp");
                    if (file.exists()) {
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                        options.inSampleSize = jzb.h(options);
                        options.inJustDecodeBounds = false;
                        bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                    } else {
                        bitmapDecodeFile = null;
                    }
                } else {
                    bitmapDecodeFile = null;
                }
                if (bitmapDecodeFile == null) {
                    try {
                        bitmapI = i(context, "tarot-card/" + str2 + "/" + str + ".webp", options);
                    } catch (Exception unused) {
                        bitmapI = i(context, "tarot-card/rider_waite/" + str + ".webp", options);
                    }
                    bitmapDecodeFile = bitmapI;
                }
                if (bitmapDecodeFile != null) {
                    if (!d6gVar.f) {
                        return bitmapDecodeFile;
                    }
                    Bitmap bitmapJ = xo1.J(bitmapDecodeFile, 180.0f);
                    if (bitmapJ != bitmapDecodeFile) {
                        bitmapDecodeFile.recycle();
                    }
                    return bitmapJ;
                }
            }
            return null;
        } catch (Exception unused2) {
            return null;
        }
    }

    public static LinearGradient o(float f, float f2, int i) {
        float[] fArr = new float[25];
        int[] iArr = new int[25];
        int i2 = 0;
        while (true) {
            float f3 = i2 / 24.0f;
            fArr[i2] = h(f3, 0.61f, 0.13f);
            iArr[i2] = Color.argb(mh3.o(mh3.o(ym8.L((1.0f - (h(f3, 0.0f, 1.0f) * 0.7f)) * 255.0f), 0, 255), 0, 255), Color.red(i), Color.green(i), Color.blue(i));
            if (i2 == 24) {
                return new LinearGradient(0.0f, f, f2, 0.0f, iArr, fArr, Shader.TileMode.CLAMP);
            }
            i2++;
        }
    }

    public static void q(RemoteViews remoteViews, boolean z) {
        remoteViews.setImageViewResource(R.id.widget_bg_overlay, z ? R.drawable.widget_bg_undrawn_wide : R.drawable.widget_bg_overlay);
        remoteViews.setFloat(R.id.widget_bg_overlay, "setAlpha", 1.0f);
    }

    public static final Object r(Set set, Object obj, Object obj2, Enum r4, boolean z) {
        Object obj3;
        if (!z) {
            if (r4 != null) {
                set = s72.o1(n3d.n(set, r4));
            }
            return s72.Y0(set);
        }
        if (set.contains(obj)) {
            obj3 = obj;
        } else {
            obj3 = set.contains(obj2) ? obj2 : null;
        }
        if (pa7.t(obj3, obj) && pa7.t(r4, obj2)) {
            return null;
        }
        return r4 == null ? obj3 : r4;
    }

    public static String s(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String strM;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                strM = "null";
            } else {
                try {
                    strM = obj.toString();
                } catch (Exception e) {
                    String strJ = ib8.j(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strJ), (Throwable) e);
                    strM = tec.m("<", strJ, " threw ", e.getClass().getName(), ">");
                }
            }
            objArr[i2] = strM;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, iIndexOf);
            sb.append(objArr[i]);
            i++;
            i3 = iIndexOf + 2;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public abstract Object k(em7 em7Var);

    public abstract q3c p(em7 em7Var, Object obj);
}
