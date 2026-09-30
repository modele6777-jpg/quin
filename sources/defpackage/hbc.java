package defpackage;

import ai.askquin.R;
import android.accounts.Account;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Display;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.assetpacks.b;
import com.google.android.play.core.assetpacks.k;
import com.google.android.play.core.assetpacks.n;
import io.sentry.android.core.b1;
import io.sentry.q6;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hbc implements n00, x00, xb2, cfg {
    public static HashSet g;
    public static hbc v;
    public static final Object w = new Object();
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public hbc(Context context, int i) {
        String str;
        Integer numValueOf;
        Method method;
        Boolean bool;
        Boolean bool2;
        switch (i) {
            case 17:
                this.b = "files";
                this.c = "common";
                this.d = ceh.b;
                this.e = "";
                this.f = jy6.m();
                this.a = context.getPackageName();
                break;
            default:
                this.a = context;
                PackageManager packageManager = context.getPackageManager();
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
                    str = packageInfo.versionName;
                    try {
                        numValueOf = Integer.valueOf(packageInfo.versionCode);
                    } catch (PackageManager.NameNotFoundException unused) {
                        db6.h1("MixpanelAPI.SysInfo", "System information constructed with a context that apparently doesn't exist.");
                        numValueOf = null;
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    str = null;
                }
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                int i2 = applicationInfo.labelRes;
                this.e = str;
                this.f = numValueOf;
                if (i2 == 0) {
                    CharSequence charSequence = applicationInfo.nonLocalizedLabel;
                    if (charSequence != null) {
                        charSequence.toString();
                    }
                } else {
                    context.getString(i2);
                }
                try {
                    method = packageManager.getClass().getMethod("hasSystemFeature", String.class);
                } catch (NoSuchMethodException unused3) {
                    method = null;
                }
                if (method != null) {
                    try {
                        bool = (Boolean) method.invoke(packageManager, "android.hardware.nfc");
                        try {
                            bool2 = (Boolean) method.invoke(packageManager, "android.hardware.telephony");
                        } catch (IllegalAccessException unused4) {
                            db6.h1("MixpanelAPI.SysInfo", "System version appeared to support PackageManager.hasSystemFeature, but we were unable to call it.");
                            bool2 = null;
                        } catch (InvocationTargetException unused5) {
                            db6.h1("MixpanelAPI.SysInfo", "System version appeared to support PackageManager.hasSystemFeature, but we were unable to call it.");
                            bool2 = null;
                        }
                    } catch (IllegalAccessException unused6) {
                        bool = null;
                    } catch (InvocationTargetException unused7) {
                        bool = null;
                    }
                } else {
                    bool2 = null;
                    bool = null;
                }
                this.b = bool;
                this.c = bool2;
                DisplayMetrics displayMetrics = new DisplayMetrics();
                this.d = displayMetrics;
                DisplayManager displayManager = (DisplayManager) ((Context) this.a).getSystemService("display");
                Display display = displayManager != null ? displayManager.getDisplay(0) : null;
                if (display == null) {
                    displayMetrics.setTo(((Context) this.a).getResources().getDisplayMetrics());
                } else {
                    display.getMetrics(displayMetrics);
                }
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r7 != 9) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Matrix A(defpackage.v79 r9, defpackage.v79 r10, defpackage.ita r11) {
        /*
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            if (r11 == 0) goto L8a
            hta r1 = r11.a
            if (r1 != 0) goto Ld
            goto L8a
        Ld:
            float r2 = r9.d
            float r3 = r10.d
            float r2 = r2 / r3
            float r3 = r9.e
            float r4 = r10.e
            float r3 = r3 / r4
            float r4 = r10.b
            float r4 = -r4
            float r5 = r10.c
            float r5 = -r5
            ita r6 = defpackage.ita.c
            boolean r6 = r11.equals(r6)
            if (r6 == 0) goto L33
            float r10 = r9.b
            float r9 = r9.c
            r0.preTranslate(r10, r9)
            r0.preScale(r2, r3)
            r0.preTranslate(r4, r5)
            return r0
        L33:
            int r11 = r11.b
            r6 = 2
            if (r11 != r6) goto L3d
            float r11 = java.lang.Math.max(r2, r3)
            goto L41
        L3d:
            float r11 = java.lang.Math.min(r2, r3)
        L41:
            float r2 = r9.d
            float r2 = r2 / r11
            float r3 = r9.e
            float r3 = r3 / r11
            int r7 = r1.ordinal()
            r8 = 1073741824(0x40000000, float:2.0)
            if (r7 == r6) goto L66
            r6 = 3
            if (r7 == r6) goto L61
            r6 = 5
            if (r7 == r6) goto L66
            r6 = 6
            if (r7 == r6) goto L61
            r6 = 8
            if (r7 == r6) goto L66
            r6 = 9
            if (r7 == r6) goto L61
            goto L6b
        L61:
            float r6 = r10.d
            float r6 = r6 - r2
        L64:
            float r4 = r4 - r6
            goto L6b
        L66:
            float r6 = r10.d
            float r6 = r6 - r2
            float r6 = r6 / r8
            goto L64
        L6b:
            int r1 = r1.ordinal()
            switch(r1) {
                case 4: goto L78;
                case 5: goto L78;
                case 6: goto L78;
                case 7: goto L73;
                case 8: goto L73;
                case 9: goto L73;
                default: goto L72;
            }
        L72:
            goto L7d
        L73:
            float r10 = r10.e
            float r10 = r10 - r3
        L76:
            float r5 = r5 - r10
            goto L7d
        L78:
            float r10 = r10.e
            float r10 = r10 - r3
            float r10 = r10 / r8
            goto L76
        L7d:
            float r10 = r9.b
            float r9 = r9.c
            r0.preTranslate(r10, r9)
            r0.preScale(r11, r11)
            r0.preTranslate(r4, r5)
        L8a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hbc.A(v79, v79, ita):android.graphics.Matrix");
    }

    public static Typeface D(String str, Integer num, int i) {
        int i2;
        boolean z = i == 2;
        if (num.intValue() > 500) {
            i2 = z ? 3 : 1;
        } else {
            i2 = z ? 2 : 0;
        }
        str.getClass();
        switch (str) {
            case "sans-serif":
                return Typeface.create(Typeface.SANS_SERIF, i2);
            case "monospace":
                return Typeface.create(Typeface.MONOSPACE, i2);
            case "fantasy":
                return Typeface.create(Typeface.SANS_SERIF, i2);
            case "serif":
                return Typeface.create(Typeface.SERIF, i2);
            case "cursive":
                return Typeface.create(Typeface.SANS_SERIF, i2);
            default:
                return null;
        }
    }

    public static int E(int i, float f) {
        int i2 = 255;
        int iRound = Math.round(((i >> 24) & 255) * f);
        if (iRound < 0) {
            i2 = 0;
        } else if (iRound <= 255) {
            i2 = iRound;
        }
        return (i & 16777215) | (i2 << 24);
    }

    public static ColorStateList F(Context context, int i) {
        int iC = yve.c(context, R.attr.colorControlHighlight);
        int iB = yve.b(context, R.attr.colorButtonNormal);
        int[] iArr = yve.b;
        int[] iArr2 = yve.d;
        int iF = v82.f(iC, i);
        return new ColorStateList(new int[][]{iArr, iArr2, yve.c, yve.f}, new int[]{iB, iF, v82.f(iC, i), i});
    }

    public static void I0(ebc ebcVar, boolean z, iac iacVar) {
        int i;
        z9c z9cVar = ebcVar.a;
        float fFloatValue = (z ? z9cVar.c : z9cVar.e).floatValue();
        if (iacVar instanceof c9c) {
            i = ((c9c) iacVar).a;
        } else if (!(iacVar instanceof d9c)) {
            return;
        } else {
            i = ebcVar.a.y.a;
        }
        int iE = E(i, fFloatValue);
        if (z) {
            ebcVar.d.setColor(iE);
        } else {
            ebcVar.e.setColor(iE);
        }
    }

    public static void J0(Drawable drawable, int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterF;
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = s80.b;
        }
        PorterDuff.Mode mode2 = s80.b;
        synchronized (s80.class) {
            porterDuffColorFilterF = cyb.f(i, mode);
        }
        drawableMutate.setColorFilter(porterDuffColorFilterF);
    }

    public static void L(String str, Object... objArr) {
        b1.d("SVGAndroidRenderer", String.format(str, objArr));
    }

    public static void N(g9c g9cVar, String str) {
        fac facVarT = g9cVar.a.t(str);
        if (facVarT == null) {
            b1.l("SVGAndroidRenderer", "Gradient reference '" + str + "' not found");
            return;
        }
        if (!(facVarT instanceof g9c)) {
            L("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (facVarT == g9cVar) {
            L("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        g9c g9cVar2 = (g9c) facVarT;
        if (g9cVar.i == null) {
            g9cVar.i = g9cVar2.i;
        }
        if (g9cVar.j == null) {
            g9cVar.j = g9cVar2.j;
        }
        if (g9cVar.k == 0) {
            g9cVar.k = g9cVar2.k;
        }
        if (g9cVar.h.isEmpty()) {
            g9cVar.h = g9cVar2.h;
        }
        try {
            if (g9cVar instanceof gac) {
                gac gacVar = (gac) g9cVar;
                gac gacVar2 = (gac) facVarT;
                if (gacVar.m == null) {
                    gacVar.m = gacVar2.m;
                }
                if (gacVar.n == null) {
                    gacVar.n = gacVar2.n;
                }
                if (gacVar.o == null) {
                    gacVar.o = gacVar2.o;
                }
                if (gacVar.p == null) {
                    gacVar.p = gacVar2.p;
                }
            } else {
                O((kac) g9cVar, (kac) facVarT);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = g9cVar2.l;
        if (str2 != null) {
            N(g9cVar, str2);
        }
    }

    public static void O(kac kacVar, kac kacVar2) {
        if (kacVar.m == null) {
            kacVar.m = kacVar2.m;
        }
        if (kacVar.n == null) {
            kacVar.n = kacVar2.n;
        }
        if (kacVar.o == null) {
            kacVar.o = kacVar2.o;
        }
        if (kacVar.p == null) {
            kacVar.p = kacVar2.p;
        }
        if (kacVar.q == null) {
            kacVar.q = kacVar2.q;
        }
    }

    public static void P(t9c t9cVar, String str) {
        fac facVarT = t9cVar.a.t(str);
        if (facVarT == null) {
            b1.l("SVGAndroidRenderer", "Pattern reference '" + str + "' not found");
            return;
        }
        if (!(facVarT instanceof t9c)) {
            L("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (facVarT == t9cVar) {
            L("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        t9c t9cVar2 = (t9c) facVarT;
        if (t9cVar.p == null) {
            t9cVar.p = t9cVar2.p;
        }
        if (t9cVar.q == null) {
            t9cVar.q = t9cVar2.q;
        }
        if (t9cVar.r == null) {
            t9cVar.r = t9cVar2.r;
        }
        if (t9cVar.s == null) {
            t9cVar.s = t9cVar2.s;
        }
        if (t9cVar.t == null) {
            t9cVar.t = t9cVar2.t;
        }
        if (t9cVar.u == null) {
            t9cVar.u = t9cVar2.u;
        }
        if (t9cVar.v == null) {
            t9cVar.v = t9cVar2.v;
        }
        if (t9cVar.i.isEmpty()) {
            t9cVar.i = t9cVar2.i;
        }
        if (t9cVar.o == null) {
            t9cVar.o = t9cVar2.o;
        }
        if (t9cVar.n == null) {
            t9cVar.n = t9cVar2.n;
        }
        String str2 = t9cVar2.w;
        if (str2 != null) {
            P(t9cVar, str2);
        }
    }

    public static /* synthetic */ List R(hbc hbcVar, m0b m0bVar, fr8 fr8Var, Boolean bool, boolean z, int i) {
        boolean z2 = (i & 4) == 0;
        if ((i & 16) != 0) {
            bool = null;
        }
        return hbcVar.Q(m0bVar, fr8Var, z2, false, bool, (i & 32) != 0 ? false : z);
    }

    public static zp8 S(zga zgaVar, jy6 jy6Var, zp8 zp8Var, eye eyeVar) {
        y45 y45Var = (y45) zgaVar;
        gye gyeVarM = y45Var.m();
        int iJ = y45Var.j();
        Object objL = gyeVarM.p() ? null : gyeVarM.l(iJ);
        int iB = (y45Var.y() || gyeVarM.p()) ? -1 : gyeVarM.f(iJ, eyeVar, false).b(pqf.H(y45Var.k()) - eyeVar.e);
        for (int i = 0; i < jy6Var.size(); i++) {
            zp8 zp8Var2 = (zp8) jy6Var.get(i);
            if (e0(zp8Var2, objL, y45Var.y(), y45Var.g(), y45Var.h(), iB)) {
                return zp8Var2;
            }
        }
        if (jy6Var.isEmpty() && zp8Var != null && e0(zp8Var, objL, y45Var.y(), y45Var.g(), y45Var.h(), iB)) {
            return zp8Var;
        }
        return null;
    }

    public static void U0(sp3 sp3Var, DataOutputStream dataOutputStream) {
        Set<Map.Entry> setEntrySet = sp3Var.b.entrySet();
        dataOutputStream.writeInt(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            dataOutputStream.writeUTF((String) entry.getKey());
            byte[] bArr = (byte[]) entry.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }

    public static fr8 X(ut8 ut8Var, u99 u99Var, bu3 bu3Var, int i, boolean z) {
        u99Var.getClass();
        if (i == 0) {
            throw null;
        }
        if (ut8Var instanceof qya) {
            o85 o85Var = sl7.a;
            sk7 sk7VarA = sl7.a((qya) ut8Var, u99Var, bu3Var);
            if (sk7VarA != null) {
                return b21.x(sk7VarA);
            }
        } else if (ut8Var instanceof dza) {
            o85 o85Var2 = sl7.a;
            sk7 sk7VarC = sl7.c((dza) ut8Var, u99Var, bu3Var);
            if (sk7VarC != null) {
                return b21.x(sk7VarC);
            }
        } else if (ut8Var instanceof kza) {
            s56 s56Var = rl7.d;
            s56Var.getClass();
            ll7 ll7Var = (ll7) vpf.F((q56) ut8Var, s56Var);
            if (ll7Var != null) {
                int iB = kv2.B(i);
                if (iB == 1) {
                    return cgg.C((kza) ut8Var, u99Var, bu3Var, true, true, z);
                }
                if (iB != 2) {
                    if (iB == 3 && ll7Var.z()) {
                        jl7 jl7VarT = ll7Var.t();
                        jl7VarT.getClass();
                        return new fr8(u99Var.getString(jl7VarT.o()).concat(u99Var.getString(jl7VarT.n())));
                    }
                } else if (ll7Var.x()) {
                    jl7 jl7VarS = ll7Var.s();
                    jl7VarS.getClass();
                    return new fr8(u99Var.getString(jl7VarS.o()).concat(u99Var.getString(jl7VarS.n())));
                }
            }
        }
        return null;
    }

    public static LayerDrawable a0(cyb cybVar, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableD = cybVar.d(context, R.drawable.abc_star_black_48dp);
        Drawable drawableD2 = cybVar.d(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableD instanceof BitmapDrawable) && drawableD.getIntrinsicWidth() == dimensionPixelSize && drawableD.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableD;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableD.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableD.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableD2 instanceof BitmapDrawable) && drawableD2.getIntrinsicWidth() == dimensionPixelSize && drawableD2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableD2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableD2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableD2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static boolean e0(zp8 zp8Var, Object obj, boolean z, int i, int i2, int i3) {
        Object obj2 = zp8Var.a;
        int i4 = zp8Var.b;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (z && i4 == i && zp8Var.c == i2) {
            return true;
        }
        return !z && i4 == -1 && zp8Var.e == i3;
    }

    public static boolean f0(z9c z9cVar, long j) {
        return (z9cVar.a & j) != 0;
    }

    public static Path o0(u9c u9cVar) {
        Path path = new Path();
        float[] fArr = u9cVar.o;
        path.moveTo(fArr[0], fArr[1]);
        int i = 2;
        while (true) {
            float[] fArr2 = u9cVar.o;
            if (i >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i], fArr2[i + 1]);
            i += 2;
        }
        if (u9cVar instanceof v9c) {
            path.close();
        }
        if (u9cVar.h == null) {
            u9cVar.h = y(path);
        }
        return path;
    }

    public static void v(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2, float f6, float f7, s9c s9cVar) {
        if (f == f6 && f2 == f7) {
            return;
        }
        if (f3 == 0.0f || f4 == 0.0f) {
            s9cVar.e(f6, f7);
            return;
        }
        float fAbs = Math.abs(f3);
        float fAbs2 = Math.abs(f4);
        double radians = Math.toRadians(((double) f5) % 360.0d);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d = ((double) (f - f6)) / 2.0d;
        double d2 = ((double) (f2 - f7)) / 2.0d;
        double d3 = (dSin * d2) + (dCos * d);
        double d4 = (dCos * d2) + ((-dSin) * d);
        double d5 = fAbs * fAbs;
        double d6 = fAbs2 * fAbs2;
        double d7 = d3 * d3;
        double d8 = d4 * d4;
        double d9 = (d8 / d6) + (d7 / d5);
        if (d9 > 0.99999d) {
            double dSqrt = Math.sqrt(d9) * 1.00001d;
            fAbs = (float) (((double) fAbs) * dSqrt);
            fAbs2 = (float) (dSqrt * ((double) fAbs2));
            d5 = fAbs * fAbs;
            d6 = fAbs2 * fAbs2;
        }
        double d10 = z == z2 ? -1.0d : 1.0d;
        double d11 = d5 * d6;
        double d12 = d5 * d8;
        double d13 = d6 * d7;
        double d14 = ((d11 - d12) - d13) / (d12 + d13);
        if (d14 < 0.0d) {
            d14 = 0.0d;
        }
        double dSqrt2 = Math.sqrt(d14) * d10;
        double d15 = fAbs;
        double d16 = fAbs2;
        double d17 = ((d15 * d4) / d16) * dSqrt2;
        double d18 = dSqrt2 * (-((d16 * d3) / d15));
        double d19 = ((dCos * d17) - (dSin * d18)) + (((double) (f + f6)) / 2.0d);
        double d20 = (dCos * d18) + (dSin * d17) + (((double) (f2 + f7)) / 2.0d);
        double d21 = (d3 - d17) / d15;
        double d22 = (d4 - d18) / d16;
        double d23 = ((-d3) - d17) / d15;
        double d24 = ((-d4) - d18) / d16;
        double d25 = (d22 * d22) + (d21 * d21);
        double dAcos = Math.acos(d21 / Math.sqrt(d25)) * (d22 < 0.0d ? -1.0d : 1.0d);
        double dSqrt3 = Math.sqrt(((d24 * d24) + (d23 * d23)) * d25);
        double d26 = (d22 * d24) + (d21 * d23);
        double d27 = d26 / dSqrt3;
        double dAcos2 = ((d21 * d24) - (d22 * d23) < 0.0d ? -1.0d : 1.0d) * (d27 < -1.0d ? 3.141592653589793d : d27 > 1.0d ? 0.0d : Math.acos(d27));
        if (!z2 && dAcos2 > 0.0d) {
            dAcos2 -= 6.283185307179586d;
        } else if (z2 && dAcos2 < 0.0d) {
            dAcos2 += 6.283185307179586d;
        }
        double d28 = dAcos2 % 6.283185307179586d;
        double d29 = dAcos % 6.283185307179586d;
        int iCeil = (int) Math.ceil((Math.abs(d28) * 2.0d) / 3.141592653589793d);
        double d30 = d28 / ((double) iCeil);
        double d31 = d30 / 2.0d;
        double dSin2 = (Math.sin(d31) * 1.3333333333333333d) / (Math.cos(d31) + 1.0d);
        int i = iCeil * 6;
        float[] fArr = new float[i];
        int i2 = 0;
        int i3 = 0;
        while (i2 < iCeil) {
            double d32 = d29;
            double d33 = (((double) i2) * d30) + d32;
            double dCos2 = Math.cos(d33);
            double dSin3 = Math.sin(d33);
            int i4 = i2;
            int i5 = i3;
            fArr[i5] = (float) (dCos2 - (dSin2 * dSin3));
            fArr[i3 + 1] = (float) ((dCos2 * dSin2) + dSin3);
            double d34 = d33 + d30;
            double dCos3 = Math.cos(d34);
            double dSin4 = Math.sin(d34);
            fArr[i5 + 2] = (float) ((dSin2 * dSin4) + dCos3);
            fArr[i5 + 3] = (float) (dSin4 - (dSin2 * dCos3));
            fArr[i5 + 4] = (float) dCos3;
            i3 = i5 + 6;
            fArr[i5 + 5] = (float) dSin4;
            i2 = i4 + 1;
            d29 = d32;
            iCeil = iCeil;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(fAbs, fAbs2);
        matrix.postRotate(f5);
        matrix.postTranslate((float) d19, (float) d20);
        matrix.mapPoints(fArr);
        fArr[i - 2] = f6;
        fArr[i - 1] = f7;
        for (int i6 = 0; i6 < i; i6 += 6) {
            s9cVar.c(fArr[i6], fArr[i6 + 1], fArr[i6 + 2], fArr[i6 + 3], fArr[i6 + 4], fArr[i6 + 5]);
        }
    }

    public static boolean w(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static sp3 x0(DataInputStream dataInputStream) throws IOException {
        int i = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            String utf = dataInputStream.readUTF();
            int i3 = dataInputStream.readInt();
            if (i3 < 0) {
                yg5.m(tec.e(i3, "Invalid value size: "));
                return null;
            }
            int iMin = Math.min(i3, 10485760);
            byte[] bArrCopyOf = pqf.b;
            int i4 = 0;
            while (i4 != i3) {
                int i5 = i4 + iMin;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i5);
                dataInputStream.readFully(bArrCopyOf, i4, iMin);
                iMin = Math.min(i3 - i5, 10485760);
                i4 = i5;
            }
            map.put(utf, bArrCopyOf);
        }
        return new sp3(map);
    }

    public static v79 y(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new v79(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0(hac hacVar) {
        l9c l9cVar;
        String str;
        int iIndexOf;
        Set setB;
        l9c l9cVar2;
        Boolean bool;
        if (hacVar instanceof p9c) {
            return;
        }
        L0();
        if ((hacVar instanceof fac) && (bool = ((fac) hacVar).d) != null) {
            ((ebc) this.c).h = bool.booleanValue();
        }
        if (hacVar instanceof aac) {
            aac aacVar = (aac) hacVar;
            z0(aacVar, q0(aacVar.p, aacVar.q, aacVar.r, aacVar.s), aacVar.o, aacVar.n);
        } else {
            Bitmap bitmapDecodeByteArray = null;
            float fE = 0.0f;
            if (hacVar instanceof wac) {
                wac wacVar = (wac) hacVar;
                Canvas canvas = (Canvas) this.a;
                l9c l9cVar3 = wacVar.r;
                if ((l9cVar3 == null || !l9cVar3.g()) && ((l9cVar2 = wacVar.s) == null || !l9cVar2.g())) {
                    R0((ebc) this.c, wacVar);
                    if (H()) {
                        hac hacVarT = wacVar.a.t(wacVar.o);
                        if (hacVarT == null) {
                            L("Use reference '%s' not found", wacVar.o);
                        } else {
                            Matrix matrix = wacVar.n;
                            if (matrix != null) {
                                canvas.concat(matrix);
                            }
                            l9c l9cVar4 = wacVar.p;
                            float fD = l9cVar4 != null ? l9cVar4.d(this) : 0.0f;
                            l9c l9cVar5 = wacVar.q;
                            canvas.translate(fD, l9cVar5 != null ? l9cVar5.e(this) : 0.0f);
                            B(wacVar, wacVar.h);
                            boolean zW0 = w0();
                            ((Stack) this.e).push(wacVar);
                            ((Stack) this.f).push(((Canvas) this.a).getMatrix());
                            if (hacVarT instanceof aac) {
                                aac aacVar2 = (aac) hacVarT;
                                v79 v79VarQ0 = q0(null, null, wacVar.r, wacVar.s);
                                L0();
                                z0(aacVar2, v79VarQ0, aacVar2.o, aacVar2.n);
                                K0();
                            } else if (hacVarT instanceof nac) {
                                l9c l9cVar6 = wacVar.r;
                                if (l9cVar6 == null) {
                                    l9cVar6 = new l9c(9, 100.0f);
                                }
                                l9c l9cVar7 = wacVar.s;
                                if (l9cVar7 == null) {
                                    l9cVar7 = new l9c(9, 100.0f);
                                }
                                v79 v79VarQ1 = q0(null, null, l9cVar6, l9cVar7);
                                L0();
                                nac nacVar = (nac) hacVarT;
                                if (v79VarQ1.d != 0.0f && v79VarQ1.e != 0.0f) {
                                    ita itaVar = nacVar.n;
                                    if (itaVar == null) {
                                        itaVar = ita.d;
                                    }
                                    R0((ebc) this.c, nacVar);
                                    ebc ebcVar = (ebc) this.c;
                                    ebcVar.f = v79VarQ1;
                                    if (!ebcVar.a.Z.booleanValue()) {
                                        v79 v79Var = ((ebc) this.c).f;
                                        G0(v79Var.b, v79Var.c, v79Var.d, v79Var.e);
                                    }
                                    v79 v79Var2 = nacVar.o;
                                    ebc ebcVar2 = (ebc) this.c;
                                    if (v79Var2 != null) {
                                        canvas.concat(A(ebcVar2.f, v79Var2, itaVar));
                                        ((ebc) this.c).g = nacVar.o;
                                    } else {
                                        v79 v79Var3 = ebcVar2.f;
                                        canvas.translate(v79Var3.b, v79Var3.c);
                                    }
                                    boolean zW1 = w0();
                                    B0(nacVar, true);
                                    if (zW1) {
                                        v0(nacVar.h);
                                    }
                                    P0(nacVar);
                                }
                                K0();
                            } else {
                                A0(hacVarT);
                            }
                            ((Stack) this.e).pop();
                            ((Stack) this.f).pop();
                            if (zW0) {
                                v0(wacVar.h);
                            }
                            P0(wacVar);
                        }
                    }
                }
            } else if (hacVar instanceof mac) {
                mac macVar = (mac) hacVar;
                R0((ebc) this.c, macVar);
                if (H()) {
                    Matrix matrix2 = macVar.n;
                    if (matrix2 != null) {
                        ((Canvas) this.a).concat(matrix2);
                    }
                    B(macVar, macVar.h);
                    boolean zW2 = w0();
                    String language = Locale.getDefault().getLanguage();
                    for (hac hacVar2 : macVar.i) {
                        if (hacVar2 instanceof bac) {
                            bac bacVar = (bac) hacVar2;
                            if (bacVar.c() == null && ((setB = bacVar.b()) == null || (!setB.isEmpty() && setB.contains(language)))) {
                                Set setG = bacVar.g();
                                if (setG != null) {
                                    if (g == null) {
                                        synchronized (hbc.class) {
                                            HashSet hashSet = new HashSet();
                                            g = hashSet;
                                            hashSet.add("Structure");
                                            g.add("BasicStructure");
                                            g.add("ConditionalProcessing");
                                            g.add("Image");
                                            g.add("Style");
                                            g.add("ViewportAttribute");
                                            g.add("Shape");
                                            g.add("BasicText");
                                            g.add("PaintAttribute");
                                            g.add("BasicPaintAttribute");
                                            g.add("OpacityAttribute");
                                            g.add("BasicGraphicsAttribute");
                                            g.add("Marker");
                                            g.add("Gradient");
                                            g.add("Pattern");
                                            g.add("Clip");
                                            g.add("BasicClip");
                                            g.add("Mask");
                                            g.add("View");
                                        }
                                    }
                                    if (setG.isEmpty() || !g.containsAll(setG)) {
                                    }
                                }
                                Set setM = bacVar.m();
                                if (setM == null) {
                                    Set setN = bacVar.n();
                                    if (setN == null) {
                                        A0(hacVar2);
                                        break;
                                    }
                                    setN.isEmpty();
                                } else {
                                    setM.isEmpty();
                                }
                            }
                        }
                    }
                    if (zW2) {
                        v0(macVar.h);
                    }
                    P0(macVar);
                }
            } else if (hacVar instanceof i9c) {
                i9c i9cVar = (i9c) hacVar;
                R0((ebc) this.c, i9cVar);
                if (H()) {
                    Matrix matrix3 = i9cVar.n;
                    if (matrix3 != null) {
                        ((Canvas) this.a).concat(matrix3);
                    }
                    B(i9cVar, i9cVar.h);
                    boolean zW3 = w0();
                    B0(i9cVar, true);
                    if (zW3) {
                        v0(i9cVar.h);
                    }
                    P0(i9cVar);
                }
            } else if (hacVar instanceof k9c) {
                k9c k9cVar = (k9c) hacVar;
                Canvas canvas2 = (Canvas) this.a;
                l9c l9cVar8 = k9cVar.r;
                if (l9cVar8 != null && !l9cVar8.g() && (l9cVar = k9cVar.s) != null && !l9cVar.g() && (str = k9cVar.o) != null) {
                    ita itaVar2 = k9cVar.n;
                    if (itaVar2 == null) {
                        itaVar2 = ita.d;
                    }
                    if (str.startsWith("data:") && str.length() >= 14 && (iIndexOf = str.indexOf(44)) >= 12 && ";base64".equals(str.substring(iIndexOf - 7, iIndexOf))) {
                        try {
                            byte[] bArrDecode = Base64.decode(str.substring(iIndexOf + 1), 0);
                            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                        } catch (Exception e) {
                            b1.e("SVGAndroidRenderer", "Could not decode bad Data URL", e);
                        }
                    }
                    if (bitmapDecodeByteArray != null) {
                        v79 v79Var4 = new v79(0.0f, 0.0f, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
                        R0((ebc) this.c, k9cVar);
                        if (H() && T0()) {
                            Matrix matrix4 = k9cVar.t;
                            if (matrix4 != null) {
                                canvas2.concat(matrix4);
                            }
                            l9c l9cVar9 = k9cVar.p;
                            float fD2 = l9cVar9 != null ? l9cVar9.d(this) : 0.0f;
                            l9c l9cVar10 = k9cVar.q;
                            float fE2 = l9cVar10 != null ? l9cVar10.e(this) : 0.0f;
                            float fD3 = k9cVar.r.d(this);
                            float fD4 = k9cVar.s.d(this);
                            ebc ebcVar3 = (ebc) this.c;
                            ebcVar3.f = new v79(fD2, fE2, fD3, fD4);
                            if (!ebcVar3.a.Z.booleanValue()) {
                                v79 v79Var5 = ((ebc) this.c).f;
                                G0(v79Var5.b, v79Var5.c, v79Var5.d, v79Var5.e);
                            }
                            k9cVar.h = ((ebc) this.c).f;
                            P0(k9cVar);
                            B(k9cVar, k9cVar.h);
                            boolean zW4 = w0();
                            S0();
                            canvas2.save();
                            canvas2.concat(A(((ebc) this.c).f, v79Var4, itaVar2));
                            canvas2.drawBitmap(bitmapDecodeByteArray, 0.0f, 0.0f, new Paint(((ebc) this.c).a.b1 != 3 ? 2 : 0));
                            canvas2.restore();
                            if (zW4) {
                                v0(k9cVar.h);
                            }
                        }
                    }
                }
            } else if (hacVar instanceof r9c) {
                r9c r9cVar = (r9c) hacVar;
                if (r9cVar.o != null) {
                    R0((ebc) this.c, r9cVar);
                    if (H() && T0()) {
                        ebc ebcVar4 = (ebc) this.c;
                        if (ebcVar4.c || ebcVar4.b) {
                            Matrix matrix5 = r9cVar.n;
                            if (matrix5 != null) {
                                ((Canvas) this.a).concat(matrix5);
                            }
                            Path path = new abc(r9cVar.o).a;
                            if (r9cVar.h == null) {
                                r9cVar.h = y(path);
                            }
                            P0(r9cVar);
                            C(r9cVar);
                            B(r9cVar, r9cVar.h);
                            boolean zW5 = w0();
                            ebc ebcVar5 = (ebc) this.c;
                            if (ebcVar5.b) {
                                int i = ebcVar5.a.S0;
                                path.setFillType((i == 0 || i != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                I(r9cVar, path);
                            }
                            if (((ebc) this.c).c) {
                                J(path);
                            }
                            D0(r9cVar);
                            if (zW5) {
                                v0(r9cVar.h);
                            }
                        }
                    }
                }
            } else if (hacVar instanceof w9c) {
                w9c w9cVar = (w9c) hacVar;
                l9c l9cVar11 = w9cVar.q;
                if (l9cVar11 != null && w9cVar.r != null && !l9cVar11.g() && !w9cVar.r.g()) {
                    R0((ebc) this.c, w9cVar);
                    if (H() && T0()) {
                        Matrix matrix6 = w9cVar.n;
                        if (matrix6 != null) {
                            ((Canvas) this.a).concat(matrix6);
                        }
                        Path pathP0 = p0(w9cVar);
                        P0(w9cVar);
                        C(w9cVar);
                        B(w9cVar, w9cVar.h);
                        boolean zW6 = w0();
                        if (((ebc) this.c).b) {
                            I(w9cVar, pathP0);
                        }
                        if (((ebc) this.c).c) {
                            J(pathP0);
                        }
                        if (zW6) {
                            v0(w9cVar.h);
                        }
                    }
                }
            } else if (hacVar instanceof a9c) {
                a9c a9cVar = (a9c) hacVar;
                l9c l9cVar12 = a9cVar.q;
                if (l9cVar12 != null && !l9cVar12.g()) {
                    R0((ebc) this.c, a9cVar);
                    if (H() && T0()) {
                        Matrix matrix7 = a9cVar.n;
                        if (matrix7 != null) {
                            ((Canvas) this.a).concat(matrix7);
                        }
                        Path pathM0 = m0(a9cVar);
                        P0(a9cVar);
                        C(a9cVar);
                        B(a9cVar, a9cVar.h);
                        boolean zW7 = w0();
                        if (((ebc) this.c).b) {
                            I(a9cVar, pathM0);
                        }
                        if (((ebc) this.c).c) {
                            J(pathM0);
                        }
                        if (zW7) {
                            v0(a9cVar.h);
                        }
                    }
                }
            } else if (hacVar instanceof f9c) {
                f9c f9cVar = (f9c) hacVar;
                l9c l9cVar13 = f9cVar.q;
                if (l9cVar13 != null && f9cVar.r != null && !l9cVar13.g() && !f9cVar.r.g()) {
                    R0((ebc) this.c, f9cVar);
                    if (H() && T0()) {
                        Matrix matrix8 = f9cVar.n;
                        if (matrix8 != null) {
                            ((Canvas) this.a).concat(matrix8);
                        }
                        Path pathN0 = n0(f9cVar);
                        P0(f9cVar);
                        C(f9cVar);
                        B(f9cVar, f9cVar.h);
                        boolean zW8 = w0();
                        if (((ebc) this.c).b) {
                            I(f9cVar, pathN0);
                        }
                        if (((ebc) this.c).c) {
                            J(pathN0);
                        }
                        if (zW8) {
                            v0(f9cVar.h);
                        }
                    }
                }
            } else if (hacVar instanceof m9c) {
                m9c m9cVar = (m9c) hacVar;
                R0((ebc) this.c, m9cVar);
                if (H() && T0() && ((ebc) this.c).c) {
                    Matrix matrix9 = m9cVar.n;
                    if (matrix9 != null) {
                        ((Canvas) this.a).concat(matrix9);
                    }
                    l9c l9cVar14 = m9cVar.o;
                    float fD5 = l9cVar14 == null ? 0.0f : l9cVar14.d(this);
                    l9c l9cVar15 = m9cVar.p;
                    float fE3 = l9cVar15 == null ? 0.0f : l9cVar15.e(this);
                    l9c l9cVar16 = m9cVar.q;
                    float fD6 = l9cVar16 == null ? 0.0f : l9cVar16.d(this);
                    l9c l9cVar17 = m9cVar.r;
                    fE = l9cVar17 != null ? l9cVar17.e(this) : 0.0f;
                    if (m9cVar.h == null) {
                        m9cVar.h = new v79(Math.min(fD5, fD6), Math.min(fE3, fE), Math.abs(fD6 - fD5), Math.abs(fE - fE3));
                    }
                    Path path2 = new Path();
                    path2.moveTo(fD5, fE3);
                    path2.lineTo(fD6, fE);
                    P0(m9cVar);
                    C(m9cVar);
                    B(m9cVar, m9cVar.h);
                    boolean zW9 = w0();
                    J(path2);
                    D0(m9cVar);
                    if (zW9) {
                        v0(m9cVar.h);
                    }
                }
            } else if (hacVar instanceof v9c) {
                v9c v9cVar = (v9c) hacVar;
                R0((ebc) this.c, v9cVar);
                if (H() && T0()) {
                    ebc ebcVar6 = (ebc) this.c;
                    if (ebcVar6.c || ebcVar6.b) {
                        Matrix matrix10 = v9cVar.n;
                        if (matrix10 != null) {
                            ((Canvas) this.a).concat(matrix10);
                        }
                        if (v9cVar.o.length >= 2) {
                            Path pathO0 = o0(v9cVar);
                            P0(v9cVar);
                            C(v9cVar);
                            B(v9cVar, v9cVar.h);
                            boolean zW10 = w0();
                            if (((ebc) this.c).b) {
                                I(v9cVar, pathO0);
                            }
                            if (((ebc) this.c).c) {
                                J(pathO0);
                            }
                            D0(v9cVar);
                            if (zW10) {
                                v0(v9cVar.h);
                            }
                        }
                    }
                }
            } else if (hacVar instanceof u9c) {
                u9c u9cVar = (u9c) hacVar;
                R0((ebc) this.c, u9cVar);
                if (H() && T0()) {
                    ebc ebcVar7 = (ebc) this.c;
                    if (ebcVar7.c || ebcVar7.b) {
                        Matrix matrix11 = u9cVar.n;
                        if (matrix11 != null) {
                            ((Canvas) this.a).concat(matrix11);
                        }
                        if (u9cVar.o.length >= 2) {
                            Path pathO1 = o0(u9cVar);
                            P0(u9cVar);
                            int i2 = ((ebc) this.c).a.S0;
                            pathO1.setFillType((i2 == 0 || i2 != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            C(u9cVar);
                            B(u9cVar, u9cVar.h);
                            boolean zW11 = w0();
                            if (((ebc) this.c).b) {
                                I(u9cVar, pathO1);
                            }
                            if (((ebc) this.c).c) {
                                J(pathO1);
                            }
                            D0(u9cVar);
                            if (zW11) {
                                v0(u9cVar.h);
                            }
                        }
                    }
                }
            } else if (hacVar instanceof qac) {
                qac qacVar = (qac) hacVar;
                R0((ebc) this.c, qacVar);
                if (H()) {
                    Matrix matrix12 = qacVar.r;
                    if (matrix12 != null) {
                        ((Canvas) this.a).concat(matrix12);
                    }
                    ArrayList arrayList = qacVar.n;
                    float fD7 = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((l9c) qacVar.n.get(0)).d(this);
                    ArrayList arrayList2 = qacVar.o;
                    float fE4 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((l9c) qacVar.o.get(0)).e(this);
                    ArrayList arrayList3 = qacVar.p;
                    float fD8 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((l9c) qacVar.p.get(0)).d(this);
                    ArrayList arrayList4 = qacVar.q;
                    if (arrayList4 != null && arrayList4.size() != 0) {
                        fE = ((l9c) qacVar.q.get(0)).e(this);
                    }
                    int iW = W();
                    if (iW != 1) {
                        float fZ = z(qacVar);
                        if (iW == 2) {
                            fZ /= 2.0f;
                        }
                        fD7 -= fZ;
                    }
                    if (qacVar.h == null) {
                        dbc dbcVar = new dbc(this, fD7, fE4);
                        K(qacVar, dbcVar);
                        RectF rectF = (RectF) dbcVar.e;
                        qacVar.h = new v79(rectF.left, rectF.top, rectF.width(), ((RectF) dbcVar.e).height());
                    }
                    P0(qacVar);
                    C(qacVar);
                    B(qacVar, qacVar.h);
                    boolean zW12 = w0();
                    K(qacVar, new cbc(this, fD7 + fD8, fE4 + fE));
                    if (zW12) {
                        v0(qacVar.h);
                    }
                }
            }
        }
        K0();
    }

    public void B(eac eacVar, v79 v79Var) {
        Path pathX;
        if (((ebc) this.c).a.M0 == null || (pathX = x(eacVar, v79Var)) == null) {
            return;
        }
        ((Canvas) this.a).clipPath(pathX);
    }

    public void B0(dac dacVar, boolean z) {
        if (z) {
            ((Stack) this.e).push(dacVar);
            ((Stack) this.f).push(((Canvas) this.a).getMatrix());
        }
        Iterator it = dacVar.a().iterator();
        while (it.hasNext()) {
            A0((hac) it.next());
        }
        if (z) {
            ((Stack) this.e).pop();
            ((Stack) this.f).pop();
        }
    }

    public void C(eac eacVar) {
        iac iacVar = ((ebc) this.c).a.b;
        if (iacVar instanceof q9c) {
            G(true, eacVar.h, (q9c) iacVar);
        }
        iac iacVar2 = ((ebc) this.c).a.d;
        if (iacVar2 instanceof q9c) {
            G(false, eacVar.h, (q9c) iacVar2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0037  */
    /* JADX WARN: Code duplicated, block: B:70:0x010d  */
    public void C0(n9c n9cVar, zac zacVar) {
        float fFloatValue;
        float f;
        float f2;
        float f3;
        Canvas canvas = (Canvas) this.a;
        L0();
        Float f4 = n9cVar.u;
        float f5 = 0.0f;
        if (f4 == null) {
            fFloatValue = 0.0f;
        } else if (Float.isNaN(f4.floatValue())) {
            float f6 = zacVar.c;
            if (f6 == 0.0f && zacVar.d == 0.0f) {
                fFloatValue = 0.0f;
            } else {
                fFloatValue = (float) Math.toDegrees(Math.atan2(zacVar.d, f6));
            }
        } else {
            fFloatValue = n9cVar.u.floatValue();
        }
        float fA = n9cVar.p ? 1.0f : ((ebc) this.c).a.f.a();
        this.c = T(n9cVar);
        Matrix matrix = new Matrix();
        matrix.preTranslate(zacVar.a, zacVar.b);
        matrix.preRotate(fFloatValue);
        matrix.preScale(fA, fA);
        l9c l9cVar = n9cVar.q;
        float fD = l9cVar != null ? l9cVar.d(this) : 0.0f;
        l9c l9cVar2 = n9cVar.r;
        float fE = l9cVar2 != null ? l9cVar2.e(this) : 0.0f;
        l9c l9cVar3 = n9cVar.s;
        float fD2 = l9cVar3 != null ? l9cVar3.d(this) : 3.0f;
        l9c l9cVar4 = n9cVar.t;
        float fE2 = l9cVar4 != null ? l9cVar4.e(this) : 3.0f;
        v79 v79Var = n9cVar.o;
        if (v79Var != null) {
            float fMax = fD2 / v79Var.d;
            float f7 = fE2 / v79Var.e;
            ita itaVar = n9cVar.n;
            if (itaVar == null) {
                itaVar = ita.d;
            }
            boolean zEquals = itaVar.equals(ita.c);
            hta htaVar = itaVar.a;
            if (!zEquals) {
                fMax = itaVar.b == 2 ? Math.max(fMax, f7) : Math.min(fMax, f7);
                f7 = fMax;
            }
            matrix.preTranslate((-fD) * fMax, (-fE) * f7);
            canvas.concat(matrix);
            v79 v79Var2 = n9cVar.o;
            float f8 = v79Var2.d * fMax;
            float f9 = v79Var2.e * f7;
            int iOrdinal = htaVar.ordinal();
            if (iOrdinal == 2) {
                f = (fD2 - f8) / 2.0f;
                f2 = 0.0f - f;
            } else {
                if (iOrdinal != 3) {
                    if (iOrdinal != 5) {
                        if (iOrdinal != 6) {
                            if (iOrdinal != 8) {
                                if (iOrdinal != 9) {
                                    f2 = 0.0f;
                                }
                            }
                        }
                    }
                    f = (fD2 - f8) / 2.0f;
                    f2 = 0.0f - f;
                }
                f = fD2 - f8;
                f2 = 0.0f - f;
            }
            switch (htaVar.ordinal()) {
                case 4:
                case 5:
                case 6:
                    f3 = (fE2 - f9) / 2.0f;
                    f5 = 0.0f - f3;
                    if (!((ebc) this.c).a.Z.booleanValue()) {
                        G0(f2, f5, fD2, fE2);
                    }
                    matrix.reset();
                    matrix.preScale(fMax, f7);
                    canvas.concat(matrix);
                    break;
                case 7:
                case 8:
                case 9:
                    f3 = fE2 - f9;
                    f5 = 0.0f - f3;
                    if (!((ebc) this.c).a.Z.booleanValue()) {
                        G0(f2, f5, fD2, fE2);
                    }
                    matrix.reset();
                    matrix.preScale(fMax, f7);
                    canvas.concat(matrix);
                    break;
                default:
                    if (!((ebc) this.c).a.Z.booleanValue()) {
                        G0(f2, f5, fD2, fE2);
                    }
                    matrix.reset();
                    matrix.preScale(fMax, f7);
                    canvas.concat(matrix);
                    break;
            }
        } else {
            matrix.preTranslate(-fD, -fE);
            canvas.concat(matrix);
            if (!((ebc) this.c).a.Z.booleanValue()) {
                G0(0.0f, 0.0f, fD2, fE2);
            }
        }
        boolean zW0 = w0();
        B0(n9cVar, false);
        if (zW0) {
            v0(n9cVar.h);
        }
        K0();
    }

    public void D0(h9c h9cVar) {
        n9c n9cVar;
        n9c n9cVar2;
        n9c n9cVar3;
        int i;
        float f;
        float f2;
        float f3;
        ArrayList arrayList;
        int size;
        z9c z9cVar = ((ebc) this.c).a;
        String str = z9cVar.F0;
        if (str == null && z9cVar.G0 == null && z9cVar.H0 == null) {
            return;
        }
        if (str == null) {
            n9cVar = null;
        } else {
            fac facVarT = h9cVar.a.t(str);
            if (facVarT != null) {
                n9cVar = (n9c) facVarT;
            } else {
                L("Marker reference '%s' not found", ((ebc) this.c).a.F0);
                n9cVar = null;
            }
        }
        String str2 = ((ebc) this.c).a.G0;
        if (str2 == null) {
            n9cVar2 = null;
        } else {
            fac facVarT2 = h9cVar.a.t(str2);
            if (facVarT2 != null) {
                n9cVar2 = (n9c) facVarT2;
            } else {
                L("Marker reference '%s' not found", ((ebc) this.c).a.G0);
                n9cVar2 = null;
            }
        }
        String str3 = ((ebc) this.c).a.H0;
        if (str3 == null) {
            n9cVar3 = null;
        } else {
            fac facVarT3 = h9cVar.a.t(str3);
            if (facVarT3 != null) {
                n9cVar3 = (n9c) facVarT3;
            } else {
                L("Marker reference '%s' not found", ((ebc) this.c).a.H0);
                n9cVar3 = null;
            }
        }
        float f4 = 0.0f;
        if (h9cVar instanceof r9c) {
            arrayList = new yac(this, ((r9c) h9cVar).o).a;
            f2 = 0.0f;
            i = 1;
        } else if (h9cVar instanceof m9c) {
            m9c m9cVar = (m9c) h9cVar;
            l9c l9cVar = m9cVar.o;
            float fD = l9cVar != null ? l9cVar.d(this) : 0.0f;
            l9c l9cVar2 = m9cVar.p;
            float fE = l9cVar2 != null ? l9cVar2.e(this) : 0.0f;
            l9c l9cVar3 = m9cVar.q;
            float fD2 = l9cVar3 != null ? l9cVar3.d(this) : 0.0f;
            l9c l9cVar4 = m9cVar.r;
            float fE2 = l9cVar4 != null ? l9cVar4.e(this) : 0.0f;
            ArrayList arrayList2 = new ArrayList(2);
            float f5 = fD2 - fD;
            i = 1;
            float f6 = fE2 - fE;
            arrayList2.add(new zac(fD, fE, f5, f6));
            arrayList2.add(new zac(fD2, fE2, f5, f6));
            f2 = 0.0f;
            arrayList = arrayList2;
        } else {
            i = 1;
            u9c u9cVar = (u9c) h9cVar;
            int length = u9cVar.o.length;
            if (length < 2) {
                arrayList = null;
                f2 = 0.0f;
            } else {
                ArrayList arrayList3 = new ArrayList();
                float[] fArr = u9cVar.o;
                zac zacVar = new zac(fArr[0], fArr[1], 0.0f, 0.0f);
                int i2 = 2;
                float f7 = 0.0f;
                float f8 = 0.0f;
                while (true) {
                    f = zacVar.b;
                    f2 = f4;
                    f3 = zacVar.a;
                    if (i2 >= length) {
                        break;
                    }
                    float[] fArr2 = u9cVar.o;
                    float f9 = fArr2[i2];
                    float f10 = fArr2[i2 + 1];
                    zacVar.a(f9, f10);
                    arrayList3.add(zacVar);
                    zacVar = new zac(f9, f10, f9 - f3, f10 - f);
                    i2 += 2;
                    f8 = f10;
                    f7 = f9;
                    f4 = f2;
                }
                if (u9cVar instanceof v9c) {
                    float[] fArr3 = u9cVar.o;
                    float f11 = fArr3[0];
                    if (f7 != f11) {
                        float f12 = fArr3[1];
                        if (f8 != f12) {
                            zacVar.a(f11, f12);
                            arrayList3.add(zacVar);
                            zac zacVar2 = new zac(f11, f12, f11 - f3, f12 - f);
                            zacVar2.b((zac) arrayList3.get(0));
                            arrayList3.add(zacVar2);
                            arrayList3.set(0, zacVar2);
                        }
                    }
                } else {
                    arrayList3.add(zacVar);
                }
                arrayList = arrayList3;
            }
        }
        if (arrayList == null || (size = arrayList.size()) == 0) {
            return;
        }
        z9c z9cVar2 = ((ebc) this.c).a;
        z9cVar2.H0 = null;
        z9cVar2.G0 = null;
        z9cVar2.F0 = null;
        if (n9cVar != null) {
            C0(n9cVar, (zac) arrayList.get(0));
        }
        if (n9cVar2 != null && arrayList.size() > 2) {
            zac zacVar3 = (zac) arrayList.get(0);
            zac zacVar4 = (zac) arrayList.get(i);
            int i3 = 1;
            while (i3 < size - 1) {
                i3++;
                zac zacVar5 = (zac) arrayList.get(i3);
                if (zacVar4.e) {
                    float f13 = zacVar4.c;
                    float f14 = zacVar4.d;
                    float f15 = zacVar4.a;
                    float f16 = f15 - zacVar3.a;
                    float f17 = zacVar4.b;
                    float f18 = ((f17 - zacVar3.b) * f14) + (f16 * f13);
                    if (f18 == f2) {
                        f18 = ((zacVar5.a - f15) * f13) + ((zacVar5.b - f17) * f14);
                    }
                    if (f18 <= f2 && (f18 != f2 || (f13 <= f2 && f14 < f2))) {
                        zacVar4.c = -f13;
                        zacVar4.d = -f14;
                    }
                }
                C0(n9cVar2, zacVar4);
                zacVar3 = zacVar4;
                zacVar4 = zacVar5;
            }
        }
        if (n9cVar3 != null) {
            C0(n9cVar3, (zac) arrayList.get(size - 1));
        }
    }

    public void E0(o9c o9cVar, v79 v79Var) {
        float fD;
        float fE;
        Canvas canvas = (Canvas) this.a;
        Boolean bool = o9cVar.n;
        if (bool == null || !bool.booleanValue()) {
            l9c l9cVar = o9cVar.p;
            float fC = l9cVar != null ? l9cVar.c(this, 1.0f) : 1.2f;
            l9c l9cVar2 = o9cVar.q;
            float fC2 = l9cVar2 != null ? l9cVar2.c(this, 1.0f) : 1.2f;
            fD = fC * v79Var.d;
            fE = fC2 * v79Var.e;
        } else {
            l9c l9cVar3 = o9cVar.p;
            fD = l9cVar3 != null ? l9cVar3.d(this) : v79Var.d;
            l9c l9cVar4 = o9cVar.q;
            fE = l9cVar4 != null ? l9cVar4.e(this) : v79Var.e;
        }
        if (fD == 0.0f || fE == 0.0f) {
            return;
        }
        L0();
        ebc ebcVarT = T(o9cVar);
        this.c = ebcVarT;
        ebcVarT.a.x = Float.valueOf(1.0f);
        boolean zW0 = w0();
        canvas.save();
        Boolean bool2 = o9cVar.o;
        if (bool2 != null && !bool2.booleanValue()) {
            canvas.translate(v79Var.b, v79Var.c);
            canvas.scale(v79Var.d, v79Var.e);
        }
        B0(o9cVar, false);
        canvas.restore();
        if (zW0) {
            v0(v79Var);
        }
        K0();
    }

    public void F0(nq0 nq0Var) {
        int i;
        boolean z;
        p8c.m();
        uva uvaVar = (uva) this.a;
        if (uvaVar == null || (i = uvaVar.a) != nq0Var.a) {
            return;
        }
        jv6 jv6Var = nq0Var.b;
        b21.X("ProcessingRequest", "onCaptureFailure: request ID = " + i, jv6Var);
        utb utbVar = uvaVar.g;
        oq0 oq0Var = utbVar.a;
        p8c.m();
        if (utbVar.g) {
            return;
        }
        p8c.m();
        int i2 = oq0Var.a;
        if (i2 > 0) {
            z = true;
            oq0Var.a = i2 - 1;
        } else {
            z = false;
        }
        if (!z) {
            p8c.m();
            oq0Var.c.execute(new ni(8, oq0Var, jv6Var));
        }
        utbVar.a();
        utbVar.e.d(jv6Var);
        if (z) {
            cee ceeVar = utbVar.b;
            p8c.m();
            b21.q("TakePictureManagerImpl", "Add a new request for retrying.");
            ceeVar.a.addFirst(oq0Var);
            ceeVar.c();
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x009d A[PHI: r11 r12 r15 r17
  0x009d: PHI (r11v17 float) = (r11v14 float), (r11v24 float) binds: [B:67:0x00cd, B:50:0x0096] A[DONT_GENERATE, DONT_INLINE]
  0x009d: PHI (r12v17 float) = (r12v15 float), (r12v24 float) binds: [B:67:0x00cd, B:50:0x0096] A[DONT_GENERATE, DONT_INLINE]
  0x009d: PHI (r15v17 float) = (r15v15 float), (r15v32 float) binds: [B:67:0x00cd, B:50:0x0096] A[DONT_GENERATE, DONT_INLINE]
  0x009d: PHI (r17v2 float) = (r17v1 float), (r17v4 float) binds: [B:67:0x00cd, B:50:0x0096] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public void G(boolean z, v79 v79Var, q9c q9cVar) {
        float fC;
        float f;
        float fC2;
        float f2;
        float fC3;
        float fC4;
        float fC5;
        float fC6;
        fac facVarT = ((gg7) this.b).t(q9cVar.a);
        int i = 0;
        int i2 = 0;
        if (facVarT == null) {
            L("%s reference '%s' not found", z ? "Fill" : "Stroke", q9cVar.a);
            iac iacVar = q9cVar.b;
            ebc ebcVar = (ebc) this.c;
            if (iacVar != null) {
                I0(ebcVar, z, iacVar);
                return;
            } else if (z) {
                ebcVar.b = false;
                return;
            } else {
                ebcVar.c = false;
                return;
            }
        }
        boolean z2 = facVarT instanceof gac;
        c9c c9cVar = c9c.b;
        if (z2) {
            gac gacVar = (gac) facVarT;
            String str = gacVar.l;
            if (str != null) {
                N(gacVar, str);
            }
            Boolean bool = gacVar.i;
            byte b = bool != null && bool.booleanValue();
            ebc ebcVar2 = (ebc) this.c;
            Paint paint = z ? ebcVar2.d : ebcVar2.e;
            if (b == true) {
                v79 v79Var2 = ebcVar2.g;
                if (v79Var2 == null) {
                    v79Var2 = ebcVar2.f;
                }
                l9c l9cVar = gacVar.m;
                fC3 = l9cVar != null ? l9cVar.d(this) : 0.0f;
                l9c l9cVar2 = gacVar.n;
                fC4 = l9cVar2 != null ? l9cVar2.e(this) : 0.0f;
                f2 = 0.0f;
                l9c l9cVar3 = gacVar.o;
                fC5 = l9cVar3 != null ? l9cVar3.d(this) : v79Var2.d;
                l9c l9cVar4 = gacVar.p;
                if (l9cVar4 != null) {
                    fC6 = l9cVar4.e(this);
                } else {
                    fC6 = f2;
                }
            } else {
                f2 = 0.0f;
                l9c l9cVar5 = gacVar.m;
                fC3 = l9cVar5 != null ? l9cVar5.c(this, 1.0f) : 0.0f;
                l9c l9cVar6 = gacVar.n;
                fC4 = l9cVar6 != null ? l9cVar6.c(this, 1.0f) : 0.0f;
                l9c l9cVar7 = gacVar.o;
                fC5 = l9cVar7 != null ? l9cVar7.c(this, 1.0f) : 1.0f;
                l9c l9cVar8 = gacVar.p;
                if (l9cVar8 != null) {
                    fC6 = l9cVar8.c(this, 1.0f);
                } else {
                    fC6 = f2;
                }
            }
            float f3 = fC4;
            float f4 = fC5;
            float f5 = fC6;
            float f6 = fC3;
            L0();
            this.c = T(gacVar);
            Matrix matrix = new Matrix();
            if (b == false) {
                matrix.preTranslate(v79Var.b, v79Var.c);
                matrix.preScale(v79Var.d, v79Var.e);
            }
            Matrix matrix2 = gacVar.j;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            int size = gacVar.h.size();
            if (size == 0) {
                K0();
                ebc ebcVar3 = (ebc) this.c;
                if (z) {
                    ebcVar3.b = false;
                    return;
                } else {
                    ebcVar3.c = false;
                    return;
                }
            }
            int[] iArr = new int[size];
            float[] fArr = new float[size];
            Iterator it = gacVar.h.iterator();
            int i3 = 0;
            float f7 = -1.0f;
            while (it.hasNext()) {
                y9c y9cVar = (y9c) ((hac) it.next());
                Float f8 = y9cVar.h;
                float fFloatValue = f8 != null ? f8.floatValue() : f2;
                if (i3 == 0 || fFloatValue >= f7) {
                    fArr[i3] = fFloatValue;
                    f7 = fFloatValue;
                } else {
                    fArr[i3] = f7;
                }
                L0();
                R0((ebc) this.c, y9cVar);
                z9c z9cVar = ((ebc) this.c).a;
                c9c c9cVar2 = (c9c) z9cVar.K0;
                if (c9cVar2 == null) {
                    c9cVar2 = c9cVar;
                }
                iArr[i3] = E(c9cVar2.a, z9cVar.L0.floatValue());
                i3++;
                K0();
            }
            if ((f6 == f4 && f3 == f5) || size == 1) {
                K0();
                paint.setColor(iArr[size - 1]);
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            int i4 = gacVar.k;
            if (i4 != 0) {
                if (i4 == 2) {
                    tileMode = Shader.TileMode.MIRROR;
                } else if (i4 == 3) {
                    tileMode = Shader.TileMode.REPEAT;
                }
            }
            Shader.TileMode tileMode2 = tileMode;
            K0();
            LinearGradient linearGradient = new LinearGradient(f6, f3, f4, f5, iArr, fArr, tileMode2);
            linearGradient.setLocalMatrix(matrix);
            paint.setShader(linearGradient);
            int iFloatValue = (int) (((ebc) this.c).a.c.floatValue() * 256.0f);
            if (iFloatValue >= 0) {
                i = iFloatValue > 255 ? 255 : iFloatValue;
            }
            paint.setAlpha(i);
            return;
        }
        if (!(facVarT instanceof kac)) {
            if (facVarT instanceof x9c) {
                x9c x9cVar = (x9c) facVarT;
                z9c z9cVar2 = x9cVar.e;
                if (z) {
                    if (f0(z9cVar2, 2147483648L)) {
                        ebc ebcVar4 = (ebc) this.c;
                        z9c z9cVar3 = ebcVar4.a;
                        iac iacVar2 = x9cVar.e.O0;
                        z9cVar3.b = iacVar2;
                        ebcVar4.b = iacVar2 != null;
                    }
                    if (f0(x9cVar.e, 4294967296L)) {
                        ((ebc) this.c).a.c = x9cVar.e.P0;
                    }
                    if (f0(x9cVar.e, 6442450944L)) {
                        ebc ebcVar5 = (ebc) this.c;
                        I0(ebcVar5, z, ebcVar5.a.b);
                        return;
                    }
                    return;
                }
                if (f0(z9cVar2, 2147483648L)) {
                    ebc ebcVar6 = (ebc) this.c;
                    z9c z9cVar4 = ebcVar6.a;
                    iac iacVar3 = x9cVar.e.O0;
                    z9cVar4.d = iacVar3;
                    ebcVar6.c = iacVar3 != null;
                }
                if (f0(x9cVar.e, 4294967296L)) {
                    ((ebc) this.c).a.e = x9cVar.e.P0;
                }
                if (f0(x9cVar.e, 6442450944L)) {
                    ebc ebcVar7 = (ebc) this.c;
                    I0(ebcVar7, z, ebcVar7.a.d);
                    return;
                }
                return;
            }
            return;
        }
        kac kacVar = (kac) facVarT;
        String str2 = kacVar.l;
        if (str2 != null) {
            N(kacVar, str2);
        }
        Boolean bool2 = kacVar.i;
        byte b2 = bool2 != null && bool2.booleanValue();
        ebc ebcVar8 = (ebc) this.c;
        Paint paint2 = z ? ebcVar8.d : ebcVar8.e;
        if (b2 == true) {
            l9c l9cVar9 = new l9c(9, 50.0f);
            l9c l9cVar10 = kacVar.m;
            float fD = l9cVar10 != null ? l9cVar10.d(this) : l9cVar9.d(this);
            l9c l9cVar11 = kacVar.n;
            fC = l9cVar11 != null ? l9cVar11.e(this) : l9cVar9.e(this);
            l9c l9cVar12 = kacVar.o;
            fC2 = l9cVar12 != null ? l9cVar12.b(this) : l9cVar9.b(this);
            f = fD;
        } else {
            l9c l9cVar13 = kacVar.m;
            float fC7 = l9cVar13 != null ? l9cVar13.c(this, 1.0f) : 0.5f;
            l9c l9cVar14 = kacVar.n;
            fC = l9cVar14 != null ? l9cVar14.c(this, 1.0f) : 0.5f;
            l9c l9cVar15 = kacVar.o;
            f = fC7;
            fC2 = l9cVar15 != null ? l9cVar15.c(this, 1.0f) : 0.5f;
        }
        float f9 = fC;
        L0();
        this.c = T(kacVar);
        Matrix matrix3 = new Matrix();
        if (b2 == false) {
            matrix3.preTranslate(v79Var.b, v79Var.c);
            matrix3.preScale(v79Var.d, v79Var.e);
        }
        Matrix matrix4 = kacVar.j;
        if (matrix4 != null) {
            matrix3.preConcat(matrix4);
        }
        int size2 = kacVar.h.size();
        if (size2 == 0) {
            K0();
            ebc ebcVar9 = (ebc) this.c;
            if (z) {
                ebcVar9.b = false;
                return;
            } else {
                ebcVar9.c = false;
                return;
            }
        }
        int[] iArr2 = new int[size2];
        float[] fArr2 = new float[size2];
        Iterator it2 = kacVar.h.iterator();
        int i5 = 0;
        float f10 = -1.0f;
        while (it2.hasNext()) {
            y9c y9cVar2 = (y9c) ((hac) it2.next());
            Float f11 = y9cVar2.h;
            float fFloatValue2 = f11 != null ? f11.floatValue() : 0.0f;
            if (i5 == 0 || fFloatValue2 >= f10) {
                fArr2[i5] = fFloatValue2;
                f10 = fFloatValue2;
            } else {
                fArr2[i5] = f10;
            }
            L0();
            R0((ebc) this.c, y9cVar2);
            z9c z9cVar5 = ((ebc) this.c).a;
            c9c c9cVar3 = (c9c) z9cVar5.K0;
            if (c9cVar3 == null) {
                c9cVar3 = c9cVar;
            }
            iArr2[i5] = E(c9cVar3.a, z9cVar5.L0.floatValue());
            i5++;
            K0();
        }
        if (fC2 == 0.0f || size2 == 1) {
            K0();
            paint2.setColor(iArr2[size2 - 1]);
            return;
        }
        Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
        int i6 = kacVar.k;
        if (i6 != 0) {
            if (i6 == 2) {
                tileMode3 = Shader.TileMode.MIRROR;
            } else if (i6 == 3) {
                tileMode3 = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode4 = tileMode3;
        K0();
        RadialGradient radialGradient = new RadialGradient(f, f9, fC2, iArr2, fArr2, tileMode4);
        radialGradient.setLocalMatrix(matrix3);
        paint2.setShader(radialGradient);
        int iFloatValue2 = (int) (((ebc) this.c).a.c.floatValue() * 256.0f);
        if (iFloatValue2 >= 0) {
            i2 = iFloatValue2 > 255 ? 255 : iFloatValue2;
        }
        paint2.setAlpha(i2);
    }

    public void G0(float f, float f2, float f3, float f4) {
        float fD = f3 + f;
        float fE = f4 + f2;
        kxa kxaVar = ((ebc) this.c).a.E0;
        if (kxaVar != null) {
            f += ((l9c) kxaVar.d).d(this);
            f2 += ((l9c) ((ebc) this.c).a.E0.a).e(this);
            fD -= ((l9c) ((ebc) this.c).a.E0.b).d(this);
            fE -= ((l9c) ((ebc) this.c).a.E0.c).e(this);
        }
        ((Canvas) this.a).clipRect(f, f2, fD, fE);
    }

    public boolean H() {
        Boolean bool = ((ebc) this.c).a.I0;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public void H0(String str, Bundle bundle, boolean z) {
        String str2;
        String strEncodeToString;
        boolean zE;
        jj6 jj6Var;
        bundle.putString("scope", "*");
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        ff5 ff5Var = (ff5) this.a;
        ff5Var.a();
        bundle.putString("gmp_app_id", ff5Var.c.b);
        bundle.putString("gmsv", Integer.toString(((rw) this.b).d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((rw) this.b).b());
        rw rwVar = (rw) this.b;
        synchronized (rwVar) {
            try {
                if (((String) rwVar.e) == null) {
                    rwVar.i();
                }
                str2 = (String) rwVar.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        bundle.putString("app_ver_name", str2);
        ff5 ff5Var2 = (ff5) this.a;
        ff5Var2.a();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(ff5Var2.b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        if (z) {
            ff5 ff5Var3 = (ff5) this.a;
            ff5Var3.a();
            bundle.putString("Goog-Api-Key", ff5Var3.c.a);
        }
        try {
            String str3 = ((ip0) Tasks.a(((nf5) ((of5) this.f)).d())).a;
            if (TextUtils.isEmpty(str3)) {
                b1.l("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", str3);
            }
        } catch (InterruptedException e) {
            e = e;
            b1.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        } catch (ExecutionException e2) {
            e = e2;
            b1.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString("appid", (String) Tasks.a(((nf5) ((of5) this.f)).c()));
        bundle.putString("cliv", "fcm-25.1.1");
        kj6 kj6Var = (kj6) ((i1b) this.e).get();
        du3 du3Var = (du3) ((i1b) this.d).get();
        if (kj6Var == null || du3Var == null) {
            return;
        }
        zq3 zq3Var = (zq3) kj6Var;
        synchronized (zq3Var) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                lj6 lj6Var = (lj6) zq3Var.a.get();
                synchronized (lj6Var) {
                    zE = lj6Var.e(lj6.b, jCurrentTimeMillis);
                }
                if (zE) {
                    synchronized (lj6Var) {
                        lj6Var.a.a(new bt5(lj6Var, lj6.b(System.currentTimeMillis())));
                    }
                    jj6Var = jj6.GLOBAL;
                } else {
                    jj6Var = jj6.NONE;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (jj6Var != jj6.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(jj6Var.a()));
            bundle.putString("Firebase-Client", du3Var.a());
        }
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0176  */
    public void I(eac eacVar, Path path) {
        float fE;
        float fD;
        float fE2;
        float fD2;
        boolean z;
        boolean z2;
        Canvas canvas = (Canvas) this.a;
        iac iacVar = ((ebc) this.c).a.b;
        if (iacVar instanceof q9c) {
            fac facVarT = ((gg7) this.b).t(((q9c) iacVar).a);
            if (facVarT instanceof t9c) {
                t9c t9cVar = (t9c) facVarT;
                Boolean bool = t9cVar.p;
                boolean z3 = bool != null && bool.booleanValue();
                String str = t9cVar.w;
                if (str != null) {
                    P(t9cVar, str);
                }
                l9c l9cVar = t9cVar.s;
                if (z3) {
                    fD = l9cVar != null ? l9cVar.d(this) : 0.0f;
                    l9c l9cVar2 = t9cVar.t;
                    fE2 = l9cVar2 != null ? l9cVar2.e(this) : 0.0f;
                    l9c l9cVar3 = t9cVar.u;
                    fD2 = l9cVar3 != null ? l9cVar3.d(this) : 0.0f;
                    l9c l9cVar4 = t9cVar.v;
                    fE = l9cVar4 != null ? l9cVar4.e(this) : 0.0f;
                } else {
                    float fC = l9cVar != null ? l9cVar.c(this, 1.0f) : 0.0f;
                    l9c l9cVar5 = t9cVar.t;
                    float fC2 = l9cVar5 != null ? l9cVar5.c(this, 1.0f) : 0.0f;
                    l9c l9cVar6 = t9cVar.u;
                    float fC3 = l9cVar6 != null ? l9cVar6.c(this, 1.0f) : 0.0f;
                    l9c l9cVar7 = t9cVar.v;
                    float fC4 = l9cVar7 != null ? l9cVar7.c(this, 1.0f) : 0.0f;
                    v79 v79Var = eacVar.h;
                    float f = v79Var.b;
                    float f2 = v79Var.d;
                    float f3 = (fC * f2) + f;
                    float f4 = v79Var.c;
                    float f5 = v79Var.e;
                    float f6 = fC3 * f2;
                    fE = fC4 * f5;
                    fD = f3;
                    fE2 = (fC2 * f5) + f4;
                    fD2 = f6;
                }
                if (fD2 == 0.0f || fE == 0.0f) {
                    return;
                }
                ita itaVar = t9cVar.n;
                if (itaVar == null) {
                    itaVar = ita.d;
                }
                L0();
                canvas.clipPath(path);
                ebc ebcVar = new ebc();
                Q0(ebcVar, z9c.a());
                ebcVar.a.Z = Boolean.FALSE;
                U(t9cVar, ebcVar);
                this.c = ebcVar;
                v79 v79Var2 = eacVar.h;
                Matrix matrix = t9cVar.r;
                if (matrix != null) {
                    canvas.concat(matrix);
                    Matrix matrix2 = new Matrix();
                    if (t9cVar.r.invert(matrix2)) {
                        v79 v79Var3 = eacVar.h;
                        float f7 = v79Var3.b;
                        float f8 = v79Var3.c;
                        float fC5 = v79Var3.c();
                        z = true;
                        v79 v79Var4 = eacVar.h;
                        z2 = false;
                        float f9 = v79Var4.c;
                        float fC6 = v79Var4.c();
                        float fD3 = eacVar.h.d();
                        v79 v79Var5 = eacVar.h;
                        float[] fArr = {f7, f8, fC5, f9, fC6, fD3, v79Var5.b, v79Var5.d()};
                        matrix2.mapPoints(fArr);
                        float f10 = fArr[0];
                        float f11 = fArr[1];
                        RectF rectF = new RectF(f10, f11, f10, f11);
                        for (int i = 2; i <= 6; i += 2) {
                            float f12 = fArr[i];
                            if (f12 < rectF.left) {
                                rectF.left = f12;
                            }
                            if (f12 > rectF.right) {
                                rectF.right = f12;
                            }
                            float f13 = fArr[i + 1];
                            if (f13 < rectF.top) {
                                rectF.top = f13;
                            }
                            if (f13 > rectF.bottom) {
                                rectF.bottom = f13;
                            }
                        }
                        float f14 = rectF.left;
                        float f15 = rectF.top;
                        v79Var2 = new v79(f14, f15, rectF.right - f14, rectF.bottom - f15);
                    } else {
                        z = true;
                        z2 = false;
                    }
                } else {
                    z = true;
                    z2 = false;
                }
                float fFloor = (((float) Math.floor((v79Var2.b - fD) / fD2)) * fD2) + fD;
                float fC7 = v79Var2.c();
                float fD4 = v79Var2.d();
                v79 v79Var6 = new v79(0.0f, 0.0f, fD2, fE);
                boolean zW0 = w0();
                for (float fFloor2 = (((float) Math.floor((v79Var2.c - fE2) / fE)) * fE) + fE2; fFloor2 < fD4; fFloor2 += fE) {
                    float f16 = fFloor;
                    while (f16 < fC7) {
                        v79Var6.b = f16;
                        v79Var6.c = fFloor2;
                        L0();
                        if (!((ebc) this.c).a.Z.booleanValue()) {
                            G0(v79Var6.b, v79Var6.c, v79Var6.d, v79Var6.e);
                        }
                        v79 v79Var7 = t9cVar.o;
                        if (v79Var7 != null) {
                            canvas.concat(A(v79Var6, v79Var7, itaVar));
                        } else {
                            Boolean bool2 = t9cVar.q;
                            boolean z4 = (bool2 == null || bool2.booleanValue()) ? z : z2;
                            canvas.translate(f16, fFloor2);
                            if (!z4) {
                                v79 v79Var8 = eacVar.h;
                                canvas.scale(v79Var8.d, v79Var8.e);
                            }
                        }
                        Iterator it = t9cVar.i.iterator();
                        while (it.hasNext()) {
                            A0((hac) it.next());
                        }
                        K0();
                        f16 += fD2;
                        fD4 = fD4;
                        fFloor = fFloor;
                    }
                }
                if (zW0) {
                    v0(t9cVar.h);
                }
                K0();
                return;
            }
        }
        canvas.drawPath(path, ((ebc) this.c).d);
    }

    public void J(Path path) {
        ebc ebcVar = (ebc) this.c;
        int i = ebcVar.a.a1;
        Canvas canvas = (Canvas) this.a;
        if (i != 2) {
            canvas.drawPath(path, ebcVar.e);
            return;
        }
        Matrix matrix = canvas.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        canvas.setMatrix(new Matrix());
        Shader shader = ((ebc) this.c).e.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        canvas.drawPath(path2, ((ebc) this.c).e);
        canvas.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    public void K(sac sacVar, fbc fbcVar) {
        float f;
        float fE;
        float fD;
        int iW;
        if (H()) {
            Iterator it = sacVar.i.iterator();
            boolean z = true;
            while (it.hasNext()) {
                hac hacVar = (hac) it.next();
                if (hacVar instanceof vac) {
                    fbcVar.j(N0(((vac) hacVar).c, z, !it.hasNext()));
                } else if (fbcVar.g((sac) hacVar)) {
                    float fE2 = 0.0f;
                    if (hacVar instanceof tac) {
                        L0();
                        tac tacVar = (tac) hacVar;
                        R0((ebc) this.c, tacVar);
                        if (H() && T0()) {
                            fac facVarT = tacVar.a.t(tacVar.n);
                            if (facVarT == null) {
                                L("TextPath reference '%s' not found", tacVar.n);
                            } else {
                                r9c r9cVar = (r9c) facVarT;
                                abc abcVar = new abc(r9cVar.o);
                                Matrix matrix = r9cVar.n;
                                Path path = abcVar.a;
                                if (matrix != null) {
                                    path.transform(matrix);
                                }
                                PathMeasure pathMeasure = new PathMeasure(path, false);
                                l9c l9cVar = tacVar.o;
                                fE2 = l9cVar != null ? l9cVar.c(this, pathMeasure.getLength()) : 0.0f;
                                int iW2 = W();
                                if (iW2 != 1) {
                                    float fZ = z(tacVar);
                                    if (iW2 == 2) {
                                        fZ /= 2.0f;
                                    }
                                    fE2 -= fZ;
                                }
                                C(tacVar.p);
                                boolean zW0 = w0();
                                K(tacVar, new bbc(this, path, fE2));
                                if (zW0) {
                                    v0(tacVar.h);
                                }
                            }
                        }
                        K0();
                    } else if (hacVar instanceof pac) {
                        L0();
                        pac pacVar = (pac) hacVar;
                        R0((ebc) this.c, pacVar);
                        if (H()) {
                            ArrayList arrayList = pacVar.n;
                            boolean z2 = arrayList != null && arrayList.size() > 0;
                            boolean z3 = fbcVar instanceof cbc;
                            if (z3) {
                                float fD2 = !z2 ? ((cbc) fbcVar).a : ((l9c) pacVar.n.get(0)).d(this);
                                ArrayList arrayList2 = pacVar.o;
                                fE = (arrayList2 == null || arrayList2.size() == 0) ? ((cbc) fbcVar).b : ((l9c) pacVar.o.get(0)).e(this);
                                ArrayList arrayList3 = pacVar.p;
                                fD = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((l9c) pacVar.p.get(0)).d(this);
                                ArrayList arrayList4 = pacVar.q;
                                if (arrayList4 != null && arrayList4.size() != 0) {
                                    fE2 = ((l9c) pacVar.q.get(0)).e(this);
                                }
                                float f2 = fD2;
                                f = fE2;
                                fE2 = f2;
                            } else {
                                f = 0.0f;
                                fE = 0.0f;
                                fD = 0.0f;
                            }
                            if (z2 && (iW = W()) != 1) {
                                float fZ2 = z(pacVar);
                                if (iW == 2) {
                                    fZ2 /= 2.0f;
                                }
                                fE2 -= fZ2;
                            }
                            C(pacVar.r);
                            if (z3) {
                                cbc cbcVar = (cbc) fbcVar;
                                cbcVar.a = fE2 + fD;
                                cbcVar.b = fE + f;
                            }
                            boolean zW1 = w0();
                            K(pacVar, fbcVar);
                            if (zW1) {
                                v0(pacVar.h);
                            }
                        }
                        K0();
                    } else if (hacVar instanceof oac) {
                        L0();
                        oac oacVar = (oac) hacVar;
                        R0((ebc) this.c, oacVar);
                        if (H()) {
                            C(oacVar.o);
                            fac facVarT2 = hacVar.a.t(oacVar.n);
                            if (facVarT2 == null || !(facVarT2 instanceof sac)) {
                                L("Tref reference '%s' not found", oacVar.n);
                            } else {
                                StringBuilder sb = new StringBuilder();
                                M((sac) facVarT2, sb);
                                if (sb.length() > 0) {
                                    fbcVar.j(sb.toString());
                                }
                            }
                        }
                        K0();
                    }
                }
                z = false;
            }
        }
    }

    public void K0() {
        ((Canvas) this.a).restore();
        this.c = (ebc) ((Stack) this.d).pop();
    }

    public void L0() {
        ((Canvas) this.a).save();
        ((Stack) this.d).push((ebc) this.c);
        this.c = new ebc((ebc) this.c);
    }

    public void M(sac sacVar, StringBuilder sb) {
        Iterator it = sacVar.i.iterator();
        boolean z = true;
        while (it.hasNext()) {
            hac hacVar = (hac) it.next();
            if (hacVar instanceof sac) {
                M((sac) hacVar, sb);
            } else if (hacVar instanceof vac) {
                sb.append(N0(((vac) hacVar).c, z, !it.hasNext()));
            }
            z = false;
        }
    }

    public void M0() {
        ((u81) this.e).l((HashMap) this.a);
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.c;
        int size = sparseBooleanArray.size();
        for (int i = 0; i < size; i++) {
            ((SparseArray) this.b).remove(sparseBooleanArray.keyAt(i));
        }
        sparseBooleanArray.clear();
        ((SparseBooleanArray) this.d).clear();
    }

    public String N0(String str, boolean z, boolean z2) {
        if (((ebc) this.c).h) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String strReplaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z) {
            strReplaceAll = strReplaceAll.replaceAll("^\\s+", "");
        }
        if (z2) {
            strReplaceAll = strReplaceAll.replaceAll("\\s+$", "");
        }
        return strReplaceAll.replaceAll("\\s{2,}", " ");
    }

    public void O0(gye gyeVar) {
        jy6 jy6Var;
        os osVarB = ny6.b();
        if (((jy6) this.b).isEmpty()) {
            p(osVarB, (zp8) this.e, gyeVar);
            if (!Objects.equals((zp8) this.f, (zp8) this.e)) {
                p(osVarB, (zp8) this.f, gyeVar);
            }
            if (!Objects.equals((zp8) this.d, (zp8) this.e) && !Objects.equals((zp8) this.d, (zp8) this.f)) {
                p(osVarB, (zp8) this.d, gyeVar);
            }
        } else {
            int i = 0;
            while (true) {
                int size = ((jy6) this.b).size();
                jy6Var = (jy6) this.b;
                if (i >= size) {
                    break;
                }
                p(osVarB, (zp8) jy6Var.get(i), gyeVar);
                i++;
            }
            if (!jy6Var.contains((zp8) this.d)) {
                p(osVarB, (zp8) this.d, gyeVar);
            }
        }
        this.c = osVarB.e(true);
    }

    public void P0(eac eacVar) {
        if (eacVar.b == null || eacVar.h == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (((Matrix) ((Stack) this.f).peek()).invert(matrix)) {
            v79 v79Var = eacVar.h;
            float f = v79Var.b;
            float f2 = v79Var.c;
            float fC = v79Var.c();
            v79 v79Var2 = eacVar.h;
            float f3 = v79Var2.c;
            float fC2 = v79Var2.c();
            float fD = eacVar.h.d();
            v79 v79Var3 = eacVar.h;
            float[] fArr = {f, f2, fC, f3, fC2, fD, v79Var3.b, v79Var3.d()};
            matrix.preConcat(((Canvas) this.a).getMatrix());
            matrix.mapPoints(fArr);
            float f4 = fArr[0];
            float f5 = fArr[1];
            RectF rectF = new RectF(f4, f5, f4, f5);
            for (int i = 2; i <= 6; i += 2) {
                float f6 = fArr[i];
                if (f6 < rectF.left) {
                    rectF.left = f6;
                }
                if (f6 > rectF.right) {
                    rectF.right = f6;
                }
                float f7 = fArr[i + 1];
                if (f7 < rectF.top) {
                    rectF.top = f7;
                }
                if (f7 > rectF.bottom) {
                    rectF.bottom = f7;
                }
            }
            eac eacVar2 = (eac) ((Stack) this.e).peek();
            v79 v79Var4 = eacVar2.h;
            float f8 = rectF.left;
            float f9 = rectF.top;
            if (v79Var4 == null) {
                eacVar2.h = new v79(f8, f9, rectF.right - f8, rectF.bottom - f9);
                return;
            }
            float f10 = rectF.right - f8;
            float f11 = rectF.bottom - f9;
            if (f8 < v79Var4.b) {
                v79Var4.b = f8;
            }
            if (f9 < v79Var4.c) {
                v79Var4.c = f9;
            }
            if (f8 + f10 > v79Var4.c()) {
                v79Var4.d = (f8 + f10) - v79Var4.b;
            }
            if (f9 + f11 > v79Var4.d()) {
                v79Var4.e = (f9 + f11) - v79Var4.c;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002c  */
    public List Q(m0b m0bVar, fr8 fr8Var, boolean z, boolean z2, Boolean bool, boolean z3) {
        List list;
        cob cobVarJ = feg.J(m0bVar, z, z2, bool, z3, (g5b) this.a, (fv8) this.f);
        if (cobVarJ == null) {
            if (m0bVar instanceof k0b) {
                ntd ntdVar = ((k0b) m0bVar).c;
                ls7 ls7Var = ntdVar instanceof ls7 ? (ls7) ntdVar : null;
                if (ls7Var != null) {
                    cobVarJ = ls7Var.a;
                } else {
                    cobVarJ = null;
                }
            } else {
                cobVarJ = null;
            }
        }
        return (cobVarJ == null || (list = (List) ((i10) ((be8) this.b).d(cobVarJ)).a.get(fr8Var)) == null) ? pu4.a : list;
    }

    public void Q0(ebc ebcVar, z9c z9cVar) {
        if (f0(z9cVar, 4096L)) {
            ebcVar.a.y = z9cVar.y;
        }
        if (f0(z9cVar, 2048L)) {
            ebcVar.a.x = z9cVar.x;
        }
        boolean zF0 = f0(z9cVar, 1L);
        c9c c9cVar = c9c.c;
        if (zF0) {
            ebcVar.a.b = z9cVar.b;
            iac iacVar = z9cVar.b;
            ebcVar.b = (iacVar == null || iacVar == c9cVar) ? false : true;
        }
        if (f0(z9cVar, 4L)) {
            ebcVar.a.c = z9cVar.c;
        }
        if (f0(z9cVar, 6149L)) {
            I0(ebcVar, true, ebcVar.a.b);
        }
        if (f0(z9cVar, 2L)) {
            ebcVar.a.S0 = z9cVar.S0;
        }
        if (f0(z9cVar, 8L)) {
            ebcVar.a.d = z9cVar.d;
            iac iacVar2 = z9cVar.d;
            ebcVar.c = (iacVar2 == null || iacVar2 == c9cVar) ? false : true;
        }
        if (f0(z9cVar, 16L)) {
            ebcVar.a.e = z9cVar.e;
        }
        if (f0(z9cVar, 6168L)) {
            I0(ebcVar, false, ebcVar.a.d);
        }
        if (f0(z9cVar, 34359738368L)) {
            ebcVar.a.a1 = z9cVar.a1;
        }
        if (f0(z9cVar, 32L)) {
            z9c z9cVar2 = ebcVar.a;
            l9c l9cVar = z9cVar.f;
            z9cVar2.f = l9cVar;
            ebcVar.e.setStrokeWidth(l9cVar.b(this));
        }
        if (f0(z9cVar, 64L)) {
            z9c z9cVar3 = ebcVar.a;
            Paint paint = ebcVar.e;
            z9cVar3.T0 = z9cVar.T0;
            int iB = kv2.B(z9cVar.T0);
            if (iB == 0) {
                paint.setStrokeCap(Paint.Cap.BUTT);
            } else if (iB == 1) {
                paint.setStrokeCap(Paint.Cap.ROUND);
            } else if (iB == 2) {
                paint.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (f0(z9cVar, 128L)) {
            z9c z9cVar4 = ebcVar.a;
            Paint paint2 = ebcVar.e;
            z9cVar4.U0 = z9cVar.U0;
            int iB2 = kv2.B(z9cVar.U0);
            if (iB2 == 0) {
                paint2.setStrokeJoin(Paint.Join.MITER);
            } else if (iB2 == 1) {
                paint2.setStrokeJoin(Paint.Join.ROUND);
            } else if (iB2 == 2) {
                paint2.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (f0(z9cVar, 256L)) {
            ebcVar.a.g = z9cVar.g;
            ebcVar.e.setStrokeMiter(z9cVar.g.floatValue());
        }
        if (f0(z9cVar, 512L)) {
            ebcVar.a.v = z9cVar.v;
        }
        if (f0(z9cVar, 1024L)) {
            ebcVar.a.w = z9cVar.w;
        }
        Typeface typefaceD = null;
        if (f0(z9cVar, 1536L)) {
            z9c z9cVar5 = ebcVar.a;
            Paint paint3 = ebcVar.e;
            l9c[] l9cVarArr = z9cVar5.v;
            if (l9cVarArr == null) {
                paint3.setPathEffect(null);
            } else {
                int length = l9cVarArr.length;
                int i = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i];
                float f = 0.0f;
                for (int i2 = 0; i2 < i; i2++) {
                    float fB = z9cVar5.v[i2 % length].b(this);
                    fArr[i2] = fB;
                    f += fB;
                }
                if (f == 0.0f) {
                    paint3.setPathEffect(null);
                } else {
                    float fB2 = z9cVar5.w.b(this);
                    if (fB2 < 0.0f) {
                        fB2 = (fB2 % f) + f;
                    }
                    paint3.setPathEffect(new DashPathEffect(fArr, fB2));
                }
            }
        }
        if (f0(z9cVar, 16384L)) {
            float textSize = ((ebc) this.c).d.getTextSize();
            ebcVar.a.X = z9cVar.X;
            ebcVar.d.setTextSize(z9cVar.X.c(this, textSize));
            ebcVar.e.setTextSize(z9cVar.X.c(this, textSize));
        }
        if (f0(z9cVar, 8192L)) {
            ebcVar.a.z = z9cVar.z;
        }
        if (f0(z9cVar, 32768L)) {
            if (z9cVar.Y.intValue() == -1 && ebcVar.a.Y.intValue() > 100) {
                z9c z9cVar6 = ebcVar.a;
                z9cVar6.Y = Integer.valueOf(z9cVar6.Y.intValue() - 100);
            } else if (z9cVar.Y.intValue() != 1 || ebcVar.a.Y.intValue() >= 900) {
                ebcVar.a.Y = z9cVar.Y;
            } else {
                z9c z9cVar7 = ebcVar.a;
                z9cVar7.Y = Integer.valueOf(z9cVar7.Y.intValue() + 100);
            }
        }
        if (f0(z9cVar, 65536L)) {
            ebcVar.a.V0 = z9cVar.V0;
        }
        if (f0(z9cVar, 106496L)) {
            z9c z9cVar8 = ebcVar.a;
            ArrayList arrayList = z9cVar8.z;
            if (arrayList != null && ((gg7) this.b) != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext() && (typefaceD = D((String) it.next(), z9cVar8.Y, z9cVar8.V0)) == null) {
                }
            }
            if (typefaceD == null) {
                typefaceD = D("serif", z9cVar8.Y, z9cVar8.V0);
            }
            ebcVar.d.setTypeface(typefaceD);
            ebcVar.e.setTypeface(typefaceD);
        }
        if (f0(z9cVar, 131072L)) {
            z9c z9cVar9 = ebcVar.a;
            Paint paint4 = ebcVar.e;
            Paint paint5 = ebcVar.d;
            z9cVar9.W0 = z9cVar.W0;
            paint5.setStrikeThruText(z9cVar.W0 == 4);
            paint5.setUnderlineText(z9cVar.W0 == 2);
            paint4.setStrikeThruText(z9cVar.W0 == 4);
            paint4.setUnderlineText(z9cVar.W0 == 2);
        }
        if (f0(z9cVar, 68719476736L)) {
            ebcVar.a.X0 = z9cVar.X0;
        }
        if (f0(z9cVar, 262144L)) {
            ebcVar.a.Y0 = z9cVar.Y0;
        }
        if (f0(z9cVar, 524288L)) {
            ebcVar.a.Z = z9cVar.Z;
        }
        if (f0(z9cVar, 2097152L)) {
            ebcVar.a.F0 = z9cVar.F0;
        }
        if (f0(z9cVar, 4194304L)) {
            ebcVar.a.G0 = z9cVar.G0;
        }
        if (f0(z9cVar, 8388608L)) {
            ebcVar.a.H0 = z9cVar.H0;
        }
        if (f0(z9cVar, 16777216L)) {
            ebcVar.a.I0 = z9cVar.I0;
        }
        if (f0(z9cVar, 33554432L)) {
            ebcVar.a.J0 = z9cVar.J0;
        }
        if (f0(z9cVar, q6.MAX_EVENT_SIZE_BYTES)) {
            ebcVar.a.E0 = z9cVar.E0;
        }
        if (f0(z9cVar, 268435456L)) {
            ebcVar.a.M0 = z9cVar.M0;
        }
        if (f0(z9cVar, 536870912L)) {
            ebcVar.a.Z0 = z9cVar.Z0;
        }
        if (f0(z9cVar, 1073741824L)) {
            ebcVar.a.N0 = z9cVar.N0;
        }
        if (f0(z9cVar, 67108864L)) {
            ebcVar.a.K0 = z9cVar.K0;
        }
        if (f0(z9cVar, 134217728L)) {
            ebcVar.a.L0 = z9cVar.L0;
        }
        if (f0(z9cVar, 8589934592L)) {
            ebcVar.a.Q0 = z9cVar.Q0;
        }
        if (f0(z9cVar, 17179869184L)) {
            ebcVar.a.R0 = z9cVar.R0;
        }
        if (f0(z9cVar, 137438953472L)) {
            ebcVar.a.b1 = z9cVar.b1;
        }
    }

    public void R0(ebc ebcVar, fac facVar) {
        boolean z = facVar.b == null;
        z9c z9cVar = ebcVar.a;
        Float fValueOf = Float.valueOf(1.0f);
        Boolean bool = Boolean.TRUE;
        z9cVar.I0 = bool;
        if (!z) {
            bool = Boolean.FALSE;
        }
        z9cVar.Z = bool;
        z9cVar.E0 = null;
        z9cVar.M0 = null;
        z9cVar.x = fValueOf;
        z9cVar.K0 = c9c.b;
        z9cVar.L0 = fValueOf;
        z9cVar.N0 = null;
        z9cVar.O0 = null;
        z9cVar.P0 = fValueOf;
        z9cVar.Q0 = null;
        z9cVar.R0 = fValueOf;
        z9cVar.a1 = 1;
        z9c z9cVar2 = facVar.e;
        if (z9cVar2 != null) {
            Q0(ebcVar, z9cVar2);
        }
        ArrayList arrayList = ((s71) ((gg7) this.b).c).b;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (r71 r71Var : ((s71) ((gg7) this.b).c).b) {
                if (v71.j(r71Var.a, facVar)) {
                    Q0(ebcVar, r71Var.b);
                }
            }
        }
        z9c z9cVar3 = facVar.f;
        if (z9cVar3 != null) {
            Q0(ebcVar, z9cVar3);
        }
    }

    public void S0() {
        int iE;
        z9c z9cVar = ((ebc) this.c).a;
        iac iacVar = z9cVar.Q0;
        if (iacVar instanceof c9c) {
            iE = ((c9c) iacVar).a;
        } else if (!(iacVar instanceof d9c)) {
            return;
        } else {
            iE = z9cVar.y.a;
        }
        Float f = z9cVar.R0;
        if (f != null) {
            iE = E(iE, f.floatValue());
        }
        ((Canvas) this.a).drawColor(iE);
    }

    public ebc T(hac hacVar) {
        ebc ebcVar = new ebc();
        Q0(ebcVar, z9c.a());
        U(hacVar, ebcVar);
        return ebcVar;
    }

    public boolean T0() {
        Boolean bool = ((ebc) this.c).a.J0;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public void U(hac hacVar, ebc ebcVar) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (hacVar instanceof fac) {
                arrayList.add(0, (fac) hacVar);
            }
            Object obj = hacVar.b;
            if (obj == null) {
                break;
            } else {
                hacVar = (hac) obj;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            R0(ebcVar, (fac) it.next());
        }
        ebc ebcVar2 = (ebc) this.c;
        ebcVar.g = ebcVar2.g;
        ebcVar.f = ebcVar2.f;
    }

    public t81 V(String str) {
        return (t81) ((HashMap) this.a).get(str);
    }

    public void V0(String str) {
        arb.o(ceh.a.matcher(str).matches(), "Module must match [a-z]+(_[a-z]+)*: %s", str);
        arb.o(!ceh.c.contains(str), "Module name is reserved and cannot be used: %s", str);
        this.c = str;
    }

    public int W() {
        int i;
        z9c z9cVar = ((ebc) this.c).a;
        if (z9cVar.X0 == 1 || (i = z9cVar.Y0) == 2) {
            return z9cVar.Y0;
        }
        return i == 1 ? 3 : 1;
    }

    public void W0(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        Pattern pattern = ceh.a;
        this.e = str;
    }

    public Uri X0() {
        String strM;
        String str = (String) this.b;
        String str2 = (String) this.c;
        Account account = ydh.a;
        Account account2 = (Account) this.d;
        arb.o(account2.type.indexOf(58) == -1, "Account type contains ':'.", new Object[0]);
        arb.o(account2.type.indexOf(47) == -1, "Account type contains '/'.", new Object[0]);
        arb.o(account2.name.indexOf(47) == -1, "Account name contains '/'.", new Object[0]);
        if (ydh.a.equals(account2)) {
            strM = "shared";
        } else {
            String str3 = account2.type;
            String str4 = account2.name;
            strM = ib8.m(new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length()), str3, ":", str4);
        }
        String str5 = (String) this.e;
        StringBuilder sb = new StringBuilder(strM.length() + str2.length() + str.length() + 2 + 1 + 1 + str5.length());
        ub3.v(sb, "/", str, "/", str2);
        String strM2 = ks0.m(sb, "/", strM, "/", str5);
        yob yobVarG = ((dy6) this.f).g();
        Pattern pattern = meh.a;
        return new Uri.Builder().scheme("android").authority((String) this.a).path(strM2).encodedFragment(yobVarG.isEmpty() ? null : "transform=".concat(new ue1("+", 1).b(yobVarG))).build();
    }

    public int Y() {
        int iV0;
        p8c.m();
        ok8.o("The ImageReader is not initialized.", ((sbc) this.b) != null);
        sbc sbcVar = (sbc) this.b;
        synchronized (sbcVar.a) {
            iV0 = sbcVar.d.v0() - sbcVar.b;
        }
        return iV0;
    }

    public t81 Z(String str) {
        HashMap map = (HashMap) this.a;
        t81 t81Var = (t81) map.get(str);
        if (t81Var != null) {
            return t81Var;
        }
        SparseArray sparseArray = (SparseArray) this.b;
        int size = sparseArray.size();
        int i = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            iKeyAt = i;
        }
        t81 t81Var2 = new t81(iKeyAt, str, sp3.c);
        map.put(str, t81Var2);
        sparseArray.put(iKeyAt, str);
        ((SparseBooleanArray) this.d).put(iKeyAt, true);
        ((u81) this.e).j(t81Var2);
        return t81Var2;
    }

    @Override // defpackage.cfg
    public Object a() {
        Object objA = ((bfg) this.a).a();
        bfg bfgVar = new bfg(new fnb((yea) this.b));
        Object objA2 = ((bfg) this.c).a();
        return new n((b) objA, bfgVar, (k) objA2, new bfg(new fnb((bfg) this.d)), (egg) ((bfg) this.e).a(), (vgg) ((bfg) this.f).a());
    }

    @Override // defpackage.xb2
    public Set b(y3b y3bVar) {
        if (((Set) this.d).contains(y3bVar)) {
            return ((xb2) this.f).b(y3bVar);
        }
        cva.j(y3bVar, ">.", "Attempting to request an undeclared dependency Set<");
        return null;
    }

    public ColorStateList b0(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return bp.s(context, R.color.abc_tint_edittext);
        }
        if (i == 2131230791) {
            return bp.s(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return F(context, yve.c(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return F(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return F(context, yve.c(context, R.attr.colorAccent));
            }
            if (i == 2131230786 || i == R.drawable.abc_spinner_textfield_background_material) {
                return bp.s(context, R.color.abc_tint_spinner);
            }
            if (w((int[]) this.b, i)) {
                return yve.d(context, R.attr.colorControlNormal);
            }
            if (w((int[]) this.e, i)) {
                return bp.s(context, R.color.abc_tint_default);
            }
            if (w((int[]) this.f, i)) {
                return bp.s(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return bp.s(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = yve.d(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = yve.b;
            iArr2[0] = yve.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = yve.e;
            iArr2[1] = yve.c(context, R.attr.colorControlActivated);
            iArr[2] = yve.f;
            iArr2[2] = yve.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = yve.b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = yve.e;
            iArr2[1] = yve.c(context, R.attr.colorControlActivated);
            iArr[2] = yve.f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    @Override // defpackage.n00
    public Object c(m0b m0bVar, kza kzaVar, tt7 tt7Var) {
        return j0(m0bVar, kzaVar, 3, tt7Var, y.b);
    }

    public void c0(long j) {
        u81 u81Var;
        SparseArray sparseArray = (SparseArray) this.b;
        HashMap map = (HashMap) this.a;
        u81 u81Var2 = (u81) this.e;
        u81Var2.o(j);
        u81 u81Var3 = (u81) this.f;
        if (u81Var3 != null) {
            u81Var3.o(j);
        }
        if (u81Var2.k() || (u81Var = (u81) this.f) == null || !u81Var.k()) {
            u81Var2.q(map, sparseArray);
        } else {
            ((u81) this.f).q(map, sparseArray);
            u81Var2.b(map);
        }
        u81 u81Var4 = (u81) this.f;
        if (u81Var4 != null) {
            u81Var4.r();
            this.f = null;
        }
    }

    @Override // defpackage.x00
    public List d(m0b m0bVar, kza kzaVar) {
        return !oi5.c.e(kzaVar.p0()).booleanValue() ? pu4.a : l0(m0bVar, kzaVar, a0.c);
    }

    public boolean d0(j22 j22Var) {
        cob cobVarW;
        if (j22Var.e() != null && pa7.t(j22Var.f().b(), "Container") && (cobVarW = abg.w((g5b) this.a, j22Var, (fv8) this.f)) != null) {
            LinkedHashSet linkedHashSet = rud.a;
            Annotation[] declaredAnnotations = cobVarW.a.getDeclaredAnnotations();
            declaredAnnotations.getClass();
            boolean z = false;
            for (Annotation annotation : declaredAnnotations) {
                annotation.getClass();
                if (smb.a(af1.R(af1.Q(annotation))).equals(oj7.b)) {
                    z = true;
                }
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.xb2
    public i1b e(Class cls) {
        return q(y3b.a(cls));
    }

    @Override // defpackage.x00
    public ArrayList f(vza vzaVar, u99 u99Var) {
        vzaVar.getClass();
        u99Var.getClass();
        List<kya> listP = vzaVar.P();
        listP.getClass();
        ArrayList arrayList = new ArrayList(t72.u(listP, 10));
        for (kya kyaVar : listP) {
            kyaVar.getClass();
            arrayList.add(((a90) this.e).C(kyaVar, u99Var));
        }
        return arrayList;
    }

    @Override // defpackage.n00
    public Object g(m0b m0bVar, kza kzaVar, tt7 tt7Var) {
        return j0(m0bVar, kzaVar, 2, tt7Var, y.c);
    }

    public s47 g0() throws IOException {
        sea seaVar = sea.a;
        Object obj = sea.a;
        hn2 hn2Var = obj != null ? (hn2) obj : null;
        Context contextB = hn2Var != null ? hn2Var.b() : null;
        AssetManager assets = contextB != null ? contextB.getAssets() : null;
        if (assets != null) {
            InputStream inputStreamOpen = assets.open((String) this.f);
            inputStreamOpen.getClass();
            return z5c.K(inputStreamOpen);
        }
        if (Build.FINGERPRINT == null) {
            yg5.m("Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test");
            return null;
        }
        yg5.m("Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test.");
        return null;
    }

    @Override // defpackage.x00
    public ArrayList h(a0b a0bVar, u99 u99Var) {
        a0bVar.getClass();
        u99Var.getClass();
        List<kya> listG = a0bVar.G();
        listG.getClass();
        ArrayList arrayList = new ArrayList(t72.u(listG, 10));
        for (kya kyaVar : listG) {
            kyaVar.getClass();
            arrayList.add(((a90) this.e).C(kyaVar, u99Var));
        }
        return arrayList;
    }

    public hc2 h0(j22 j22Var, ntd ntdVar, List list) {
        return new hc2(this, od4.r((x09) this.c, j22Var, (szc) this.d), j22Var, list, ntdVar);
    }

    @Override // defpackage.xb2
    public i1b i(y3b y3bVar) {
        if (((Set) this.e).contains(y3bVar)) {
            return ((xb2) this.f).i(y3bVar);
        }
        cva.j(y3bVar, ">>.", "Attempting to request an undeclared dependency Provider<Set<");
        return null;
    }

    public hc2 i0(j22 j22Var, rmb rmbVar, List list) {
        if (rud.a.contains(j22Var)) {
            return null;
        }
        return h0(j22Var, rmbVar, list);
    }

    @Override // defpackage.x00
    public List j(m0b m0bVar, yya yyaVar) {
        m0bVar.getClass();
        return R(this, m0bVar, new fr8(m0bVar.a.getString(yyaVar.A()) + '#' + n22.b(((k0b) m0bVar).f.b())), null, false, 60);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0038  */
    public Object j0(m0b m0bVar, kza kzaVar, int i, tt7 tt7Var, l26 l26Var) {
        Object objZ;
        cob cobVarJ = feg.J(m0bVar, true, true, oi5.D.e(kzaVar.p0()), sl7.d(kzaVar), (g5b) this.a, (fv8) this.f);
        if (cobVarJ == null) {
            if (m0bVar instanceof k0b) {
                ntd ntdVar = ((k0b) m0bVar).c;
                ls7 ls7Var = ntdVar instanceof ls7 ? (ls7) ntdVar : null;
                if (ls7Var != null) {
                    cobVarJ = ls7Var.a;
                } else {
                    cobVarJ = null;
                }
            } else {
                cobVarJ = null;
            }
        }
        if (cobVarJ != null) {
            fv8 fv8Var = cobVarJ.b.b;
            fv8 fv8Var2 = h04.e;
            fv8Var2.getClass();
            fr8 fr8VarX = X(kzaVar, m0bVar.a, m0bVar.b, i, fv8Var.a(fv8Var2.b, fv8Var2.c, fv8Var2.d));
            if (fr8VarX != null && (objZ = l26Var.z(((be8) this.b).d(cobVarJ), fr8VarX)) != null) {
                if (egf.a(tt7Var)) {
                    objZ = (bl2) objZ;
                    if (objZ instanceof c71) {
                        return new z9f(((Number) ((c71) objZ).a).byteValue());
                    }
                    if (objZ instanceof bfd) {
                        return new z9f(((Number) ((bfd) objZ).a).shortValue());
                    }
                    if (objZ instanceof g77) {
                        return new z9f(((Number) ((g77) objZ).a).intValue());
                    }
                    if (objZ instanceof hg8) {
                        return new z9f(((Number) ((hg8) objZ).a).longValue());
                    }
                }
                return objZ;
            }
        }
        return null;
    }

    @Override // defpackage.x00
    public List k(m0b m0bVar, kza kzaVar) {
        return !oi5.c.e(kzaVar.p0()).booleanValue() ? pu4.a : l0(m0bVar, kzaVar, a0.b);
    }

    public List k0(m0b m0bVar, ut8 ut8Var, int i, int i2) {
        fr8 fr8VarX = X(ut8Var, m0bVar.a, m0bVar.b, i, false);
        if (fr8VarX == null) {
            return pu4.a;
        }
        return R(this, m0bVar, new fr8(fr8VarX.a + '@' + i2), null, false, 60);
    }

    @Override // defpackage.x00
    public List l(m0b m0bVar, ut8 ut8Var, int i) {
        int iS0;
        if (i == 0) {
            throw null;
        }
        if (ut8Var instanceof qya) {
            iS0 = ((qya) ut8Var).H();
        } else if (ut8Var instanceof dza) {
            iS0 = ((dza) ut8Var).f0();
        } else if (ut8Var instanceof kza) {
            kza kzaVar = (kza) ut8Var;
            int iB = kv2.B(i);
            if (iB != 2) {
                iS0 = (iB == 3 && kzaVar.P0()) ? kzaVar.B0() : kzaVar.p0();
            } else {
                iS0 = kzaVar.H0() ? kzaVar.s0() : kzaVar.p0();
            }
        } else {
            iS0 = 0;
        }
        if (oi5.c.e(iS0).booleanValue()) {
            if (i == 2) {
                return l0(m0bVar, (kza) ut8Var, a0.a);
            }
            fr8 fr8VarX = X(ut8Var, m0bVar.a, m0bVar.b, i, false);
            if (fr8VarX != null) {
                return R(this, m0bVar, fr8VarX, null, false, 60);
            }
        }
        return pu4.a;
    }

    public List l0(m0b m0bVar, kza kzaVar, a0 a0Var) {
        bu3 bu3Var = m0bVar.b;
        Boolean boolG = oi5.D.e(kzaVar.p0());
        boolean zD = sl7.d(kzaVar);
        u99 u99Var = m0bVar.a;
        if (a0Var == a0.a) {
            fr8 fr8VarC = cgg.C(kzaVar, u99Var, bu3Var, (40 & 8) == 0, (40 & 16) == 0, true);
            if (fr8VarC != null) {
                return R(this, m0bVar, fr8VarC, boolG, zD, 8);
            }
        } else {
            fr8 fr8VarC2 = cgg.C(kzaVar, u99Var, bu3Var, (40 & 8) == 0, (40 & 16) == 0, true);
            if (fr8VarC2 != null) {
                if (v4e.F(fr8VarC2.a, "$delegate", false) == (a0Var == a0.c)) {
                    return Q(m0bVar, fr8VarC2, true, true, boolG, zD);
                }
            }
        }
        return pu4.a;
    }

    @Override // defpackage.x00
    public List m(m0b m0bVar, ut8 ut8Var, int i, int i2, d0b d0bVar) {
        if (i != 0) {
            return !oi5.c.e(d0bVar != null ? d0bVar.H() : 0).booleanValue() ? pu4.a : k0(m0bVar, ut8Var, i, i2);
        }
        throw null;
    }

    public Path m0(a9c a9cVar) {
        l9c l9cVar = a9cVar.o;
        float fD = l9cVar != null ? l9cVar.d(this) : 0.0f;
        l9c l9cVar2 = a9cVar.p;
        float fE = l9cVar2 != null ? l9cVar2.e(this) : 0.0f;
        float fB = a9cVar.q.b(this);
        float f = fD - fB;
        float f2 = fE - fB;
        float f3 = fD + fB;
        float f4 = fE + fB;
        if (a9cVar.h == null) {
            float f5 = 2.0f * fB;
            a9cVar.h = new v79(f, f2, f5, f5);
        }
        float f6 = fB * 0.5522848f;
        Path path = new Path();
        path.moveTo(fD, f2);
        float f7 = fD + f6;
        float f8 = fE - f6;
        path.cubicTo(f7, f2, f3, f8, f3, fE);
        float f9 = fE + f6;
        path.cubicTo(f3, f9, f7, f4, fD, f4);
        float f10 = fD - f6;
        path.cubicTo(f10, f4, f, f9, f, fE);
        path.cubicTo(f, f8, f10, f2, fD, f2);
        path.close();
        return path;
    }

    @Override // defpackage.x00
    public List n(m0b m0bVar, ut8 ut8Var, int i, int i2, d0b d0bVar) {
        if (i != 0) {
            return !oi5.c.e(d0bVar.H()).booleanValue() ? pu4.a : (List) new z(this, m0bVar, ut8Var, i, i2).invoke();
        }
        throw null;
    }

    public Path n0(f9c f9cVar) {
        l9c l9cVar = f9cVar.o;
        float fD = l9cVar != null ? l9cVar.d(this) : 0.0f;
        l9c l9cVar2 = f9cVar.p;
        float fE = l9cVar2 != null ? l9cVar2.e(this) : 0.0f;
        float fD2 = f9cVar.q.d(this);
        float fE2 = f9cVar.r.e(this);
        float f = fD - fD2;
        float f2 = fE - fE2;
        float f3 = fD + fD2;
        float f4 = fE + fE2;
        if (f9cVar.h == null) {
            f9cVar.h = new v79(f, f2, fD2 * 2.0f, 2.0f * fE2);
        }
        float f5 = fD2 * 0.5522848f;
        float f6 = fE2 * 0.5522848f;
        Path path = new Path();
        path.moveTo(fD, f2);
        float f7 = fD + f5;
        float f8 = fE - f6;
        path.cubicTo(f7, f2, f3, f8, f3, fE);
        float f9 = fE + f6;
        path.cubicTo(f3, f9, f7, f4, fD, f4);
        float f10 = fD - f5;
        path.cubicTo(f10, f4, f, f9, f, fE);
        path.cubicTo(f, f8, f10, f2, fD, f2);
        path.close();
        return path;
    }

    @Override // defpackage.xb2
    public ou3 o(y3b y3bVar) {
        if (((Set) this.c).contains(y3bVar)) {
            return ((xb2) this.f).o(y3bVar);
        }
        cva.j(y3bVar, ">.", "Attempting to request an undeclared dependency Deferred<");
        return null;
    }

    public void p(os osVar, zp8 zp8Var, gye gyeVar) {
        if (zp8Var == null) {
            return;
        }
        if (gyeVar.b(zp8Var.a) != -1) {
            osVar.q(zp8Var, gyeVar);
            return;
        }
        gye gyeVar2 = (gye) ((dpb) this.c).get(zp8Var);
        if (gyeVar2 != null) {
            osVar.q(zp8Var, gyeVar2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    /* JADX WARN: Code duplicated, block: B:17:0x004c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0051  */
    /* JADX WARN: Code duplicated, block: B:21:0x0057  */
    /* JADX WARN: Code duplicated, block: B:24:0x0068  */
    /* JADX WARN: Code duplicated, block: B:29:0x007f  */
    public Path p0(w9c w9cVar) {
        float fD;
        float fE;
        float fMin;
        l9c l9cVar;
        float fD2;
        l9c l9cVar2;
        float fE2;
        float fD3;
        float fE3;
        float f;
        float f2;
        Path path;
        l9c l9cVar3 = w9cVar.s;
        if (l9cVar3 == null && w9cVar.t == null) {
            fD = 0.0f;
        } else {
            l9c l9cVar4 = w9cVar.t;
            if (l9cVar3 != null) {
                if (l9cVar4 == null) {
                    fD = l9cVar3.d(this);
                } else {
                    fD = l9cVar3.d(this);
                    fE = w9cVar.t.e(this);
                }
                fMin = Math.min(fD, w9cVar.q.d(this) / 2.0f);
                float fMin2 = Math.min(fE, w9cVar.r.e(this) / 2.0f);
                l9cVar = w9cVar.o;
                if (l9cVar != null) {
                    fD2 = l9cVar.d(this);
                } else {
                    fD2 = 0.0f;
                }
                l9cVar2 = w9cVar.p;
                if (l9cVar2 != null) {
                    fE2 = l9cVar2.e(this);
                } else {
                    fE2 = 0.0f;
                }
                fD3 = w9cVar.q.d(this);
                fE3 = w9cVar.r.e(this);
                if (w9cVar.h == null) {
                    w9cVar.h = new v79(fD2, fE2, fD3, fE3);
                }
                f = fD3 + fD2;
                f2 = fE2 + fE3;
                path = new Path();
                if (fMin != 0.0f || fMin2 == 0.0f) {
                    path.moveTo(fD2, fE2);
                    path.lineTo(f, fE2);
                    path.lineTo(f, f2);
                    path.lineTo(fD2, f2);
                    path.lineTo(fD2, fE2);
                } else {
                    float f3 = fMin * 0.5522848f;
                    float f4 = 0.5522848f * fMin2;
                    float f5 = fE2 + fMin2;
                    path.moveTo(fD2, f5);
                    float f6 = f5 - f4;
                    float f7 = fD2 + fMin;
                    float f8 = f7 - f3;
                    path.cubicTo(fD2, f6, f8, fE2, f7, fE2);
                    float f9 = f - fMin;
                    path.lineTo(f9, fE2);
                    float f10 = f9 + f3;
                    path.cubicTo(f10, fE2, f, f6, f, f5);
                    float f11 = f2 - fMin2;
                    path.lineTo(f, f11);
                    float f12 = f11 + f4;
                    path.cubicTo(f, f12, f10, f2, f9, f2);
                    path.lineTo(f7, f2);
                    float f13 = fD2;
                    path.cubicTo(f8, f2, f13, f12, fD2, f11);
                    path.lineTo(f13, f5);
                }
                path.close();
                return path;
            }
            fD = l9cVar4.e(this);
        }
        fE = fD;
        fMin = Math.min(fD, w9cVar.q.d(this) / 2.0f);
        float fMin3 = Math.min(fE, w9cVar.r.e(this) / 2.0f);
        l9cVar = w9cVar.o;
        if (l9cVar != null) {
            fD2 = l9cVar.d(this);
        } else {
            fD2 = 0.0f;
        }
        l9cVar2 = w9cVar.p;
        if (l9cVar2 != null) {
            fE2 = l9cVar2.e(this);
        } else {
            fE2 = 0.0f;
        }
        fD3 = w9cVar.q.d(this);
        fE3 = w9cVar.r.e(this);
        if (w9cVar.h == null) {
            w9cVar.h = new v79(fD2, fE2, fD3, fE3);
        }
        f = fD3 + fD2;
        f2 = fE2 + fE3;
        path = new Path();
        if (fMin != 0.0f) {
            path.moveTo(fD2, fE2);
            path.lineTo(f, fE2);
            path.lineTo(f, f2);
            path.lineTo(fD2, f2);
            path.lineTo(fD2, fE2);
        } else {
            path.moveTo(fD2, fE2);
            path.lineTo(f, fE2);
            path.lineTo(f, f2);
            path.lineTo(fD2, f2);
            path.lineTo(fD2, fE2);
        }
        path.close();
        return path;
    }

    @Override // defpackage.xb2
    public i1b q(y3b y3bVar) {
        if (((Set) this.b).contains(y3bVar)) {
            return ((xb2) this.f).q(y3bVar);
        }
        cva.j(y3bVar, ">.", "Attempting to request an undeclared dependency Provider<");
        return null;
    }

    public v79 q0(l9c l9cVar, l9c l9cVar2, l9c l9cVar3, l9c l9cVar4) {
        float fD = l9cVar != null ? l9cVar.d(this) : 0.0f;
        float fE = l9cVar2 != null ? l9cVar2.e(this) : 0.0f;
        ebc ebcVar = (ebc) this.c;
        v79 v79Var = ebcVar.g;
        if (v79Var == null) {
            v79Var = ebcVar.f;
        }
        return new v79(fD, fE, l9cVar3 != null ? l9cVar3.d(this) : v79Var.d, l9cVar4 != null ? l9cVar4.e(this) : v79Var.e);
    }

    @Override // defpackage.xb2
    public Object r(y3b y3bVar) {
        if (((Set) this.a).contains(y3bVar)) {
            return ((xb2) this.f).r(y3bVar);
        }
        cva.j(y3bVar, ".", "Attempting to request an undeclared dependency ");
        return null;
    }

    public void r0(String str) {
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.d;
        HashMap map = (HashMap) this.a;
        t81 t81Var = (t81) map.get(str);
        if (t81Var != null && t81Var.c.isEmpty() && t81Var.d.isEmpty()) {
            map.remove(str);
            int i = t81Var.a;
            boolean z = sparseBooleanArray.get(i);
            ((u81) this.e).c(t81Var, z);
            SparseArray sparseArray = (SparseArray) this.b;
            if (z) {
                sparseArray.remove(i);
                sparseBooleanArray.delete(i);
            } else {
                sparseArray.put(i, null);
                ((SparseBooleanArray) this.c).put(i, true);
            }
        }
    }

    @Override // defpackage.x00
    public List s(k0b k0bVar) throws InvocationTargetException {
        k0bVar.getClass();
        if (!oi5.c.e(k0bVar.d.p0()).booleanValue()) {
            return pu4.a;
        }
        ntd ntdVar = k0bVar.c;
        ls7 ls7Var = ntdVar instanceof ls7 ? (ls7) ntdVar : null;
        cob cobVar = ls7Var != null ? ls7Var.a : null;
        if (cobVar == null) {
            cva.k(k0bVar.f.a(), "Class for loading annotations is not found: ");
            return null;
        }
        ArrayList arrayList = new ArrayList(1);
        Annotation[] declaredAnnotations = cobVar.a.getDeclaredAnnotations();
        declaredAnnotations.getClass();
        for (Annotation annotation : declaredAnnotations) {
            annotation.getClass();
            Class clsR = af1.R(af1.Q(annotation));
            hc2 hc2VarI0 = i0(smb.a(clsR), new rmb(annotation), arrayList);
            if (hc2VarI0 != null) {
                t72.T(hc2VarI0, annotation, clsR);
            }
        }
        return arrayList;
    }

    public Path s0(eac eacVar, boolean z) {
        Path path;
        Path pathS0;
        Path pathX;
        ((Stack) this.d).push((ebc) this.c);
        ebc ebcVar = new ebc((ebc) this.c);
        this.c = ebcVar;
        R0(ebcVar, eacVar);
        if (!H() || !T0()) {
            this.c = (ebc) ((Stack) this.d).pop();
            return null;
        }
        if (eacVar instanceof wac) {
            if (!z) {
                L("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            wac wacVar = (wac) eacVar;
            fac facVarT = eacVar.a.t(wacVar.o);
            if (facVarT == null) {
                L("Use reference '%s' not found", wacVar.o);
                this.c = (ebc) ((Stack) this.d).pop();
                return null;
            }
            if (!(facVarT instanceof eac)) {
                this.c = (ebc) ((Stack) this.d).pop();
                return null;
            }
            pathS0 = s0((eac) facVarT, false);
            if (pathS0 != null) {
                if (wacVar.h == null) {
                    wacVar.h = y(pathS0);
                }
                Matrix matrix = wacVar.n;
                if (matrix != null) {
                    pathS0.transform(matrix);
                }
                if (((ebc) this.c).a.M0 != null && (pathX = x(eacVar, eacVar.h)) != null) {
                    pathS0.op(pathX, Path.Op.INTERSECT);
                }
                this.c = (ebc) ((Stack) this.d).pop();
                return pathS0;
            }
            return null;
        }
        if (eacVar instanceof h9c) {
            h9c h9cVar = (h9c) eacVar;
            if (eacVar instanceof r9c) {
                abc abcVar = new abc(((r9c) eacVar).o);
                v79 v79Var = eacVar.h;
                Path path2 = abcVar.a;
                if (v79Var == null) {
                    eacVar.h = y(path2);
                }
                path = path2;
            } else if (eacVar instanceof w9c) {
                path = p0((w9c) eacVar);
            } else if (eacVar instanceof a9c) {
                path = m0((a9c) eacVar);
            } else if (eacVar instanceof f9c) {
                path = n0((f9c) eacVar);
            } else {
                path = eacVar instanceof u9c ? o0((u9c) eacVar) : null;
            }
            if (path != null) {
                if (h9cVar.h == null) {
                    h9cVar.h = y(path);
                }
                Matrix matrix2 = h9cVar.n;
                if (matrix2 != null) {
                    path.transform(matrix2);
                }
                int i = ((ebc) this.c).a.Z0;
                path.setFillType((i == 0 || i != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
            }
            return null;
        }
        if (!(eacVar instanceof qac)) {
            L("Invalid %s element found in clipPath definition", eacVar.o());
            return null;
        }
        qac qacVar = (qac) eacVar;
        ArrayList arrayList = qacVar.n;
        float fE = 0.0f;
        float fD = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((l9c) qacVar.n.get(0)).d(this);
        ArrayList arrayList2 = qacVar.o;
        float fE2 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((l9c) qacVar.o.get(0)).e(this);
        ArrayList arrayList3 = qacVar.p;
        float fD2 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((l9c) qacVar.p.get(0)).d(this);
        ArrayList arrayList4 = qacVar.q;
        if (arrayList4 != null && arrayList4.size() != 0) {
            fE = ((l9c) qacVar.q.get(0)).e(this);
        }
        if (((ebc) this.c).a.Y0 != 1) {
            float fZ = z(qacVar);
            if (((ebc) this.c).a.Y0 == 2) {
                fZ /= 2.0f;
            }
            fD -= fZ;
        }
        if (qacVar.h == null) {
            dbc dbcVar = new dbc(this, fD, fE2);
            K(qacVar, dbcVar);
            Object obj = dbcVar.e;
            RectF rectF = (RectF) obj;
            qacVar.h = new v79(rectF.left, rectF.top, rectF.width(), ((RectF) obj).height());
        }
        path = new Path();
        K(qacVar, new dbc(this, fD + fD2, fE2 + fE, path));
        Matrix matrix3 = qacVar.r;
        if (matrix3 != null) {
            path.transform(matrix3);
        }
        int i2 = ((ebc) this.c).a.Z0;
        path.setFillType((i2 == 0 || i2 != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
        pathS0 = path;
        if (((ebc) this.c).a.M0 != null) {
            pathS0.op(pathX, Path.Op.INTERSECT);
        }
        this.c = (ebc) ((Stack) this.d).pop();
        return pathS0;
    }

    @Override // defpackage.x00
    public List t(m0b m0bVar, ut8 ut8Var, int i) {
        int iJ0;
        if (i == 0) {
            throw null;
        }
        if (ut8Var instanceof dza) {
            iJ0 = ((dza) ut8Var).Z();
        } else {
            iJ0 = ut8Var instanceof kza ? ((kza) ut8Var).j0() : 0;
        }
        return k0(m0bVar, ut8Var, i, iJ0);
    }

    public void t0(iw6 iw6Var) throws Exception {
        uva uvaVar;
        uva uvaVar2;
        p8c.m();
        if (((uva) this.a) == null) {
            b21.W("CaptureNode", "Discarding ImageProxy which was inadvertently acquired: " + iw6Var);
            iw6Var.close();
            return;
        }
        wde wdeVarC = iw6Var.u0().c();
        if (((Integer) wdeVarC.a.get(((uva) this.a).h)) == null) {
            b21.W("CaptureNode", "Discarding ImageProxy which was acquired for another request, mCurrentRequest id = " + ((uva) this.a).a + ", ImageProxy tagBundle keys = " + wdeVarC.a.keySet());
            iw6Var.close();
            return;
        }
        p8c.m();
        wp0 wp0Var = (wp0) this.d;
        Objects.requireNonNull(wp0Var);
        wp0Var.a.accept(new xp0((uva) this.a, iw6Var));
        uva uvaVar3 = (uva) this.a;
        ko0 ko0Var = (ko0) this.e;
        boolean z = ko0Var != null && ko0Var.h.size() > 1;
        if (z && (uvaVar2 = (uva) this.a) != null) {
            uvaVar2.b.b(iw6Var.getFormat());
        }
        if (!z || ((uvaVar = (uva) this.a) != null && uvaVar.b.a())) {
            this.a = null;
        }
        b21.C("ProcessingRequest", "onImageCaptured: request ID = " + uvaVar3.a);
        if (uvaVar3.k != -1) {
            uvaVar3.a(100);
        }
        utb utbVar = uvaVar3.g;
        p8c.m();
        if (utbVar.g) {
            return;
        }
        if (!utbVar.h) {
            p8c.m();
            if (!utbVar.g && !utbVar.h) {
                utbVar.h = true;
            }
        }
        utbVar.e.b(null);
    }

    @Override // defpackage.xb2
    public ou3 u(Class cls) {
        return o(y3b.a(cls));
    }

    public void u0(uva uvaVar) {
        p8c.m();
        boolean z = false;
        byte b = 0;
        ok8.o("only one capture stage is supported.", uvaVar.i.size() == 1);
        ok8.o("Too many acquire images. Close image to be able to process next.", Y() > 0);
        this.a = uvaVar;
        m88 m88Var = uvaVar.j;
        m88Var.b(new w36(b == true ? 1 : 0, m88Var, new a90(this, uvaVar, z, 18)), g94.a());
    }

    public void v0(v79 v79Var) {
        Canvas canvas = (Canvas) this.a;
        if (((ebc) this.c).a.N0 != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            canvas.saveLayer(null, paint2, 31);
            o9c o9cVar = (o9c) ((gg7) this.b).t(((ebc) this.c).a.N0);
            E0(o9cVar, v79Var);
            canvas.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer(null, paint3, 31);
            E0(o9cVar, v79Var);
            canvas.restore();
            canvas.restore();
        }
        K0();
    }

    public boolean w0() {
        fac facVarT;
        int i = 0;
        if (((ebc) this.c).a.x.floatValue() >= 1.0f && ((ebc) this.c).a.N0 == null) {
            return false;
        }
        Canvas canvas = (Canvas) this.a;
        int iFloatValue = (int) (((ebc) this.c).a.x.floatValue() * 256.0f);
        if (iFloatValue >= 0) {
            i = 255;
            if (iFloatValue <= 255) {
                i = iFloatValue;
            }
        }
        canvas.saveLayerAlpha(null, i, 31);
        ((Stack) this.d).push((ebc) this.c);
        ebc ebcVar = new ebc((ebc) this.c);
        this.c = ebcVar;
        String str = ebcVar.a.N0;
        if (str != null && ((facVarT = ((gg7) this.b).t(str)) == null || !(facVarT instanceof o9c))) {
            L("Mask reference '%s' not found", ((ebc) this.c).a.N0);
            ((ebc) this.c).a.N0 = null;
        }
        return true;
    }

    public Path x(eac eacVar, v79 v79Var) {
        Path pathS0;
        fac facVarT = eacVar.a.t(((ebc) this.c).a.M0);
        if (facVarT == null) {
            L("ClipPath reference '%s' not found", ((ebc) this.c).a.M0);
            return null;
        }
        b9c b9cVar = (b9c) facVarT;
        ((Stack) this.d).push((ebc) this.c);
        this.c = T(b9cVar);
        Boolean bool = b9cVar.o;
        boolean z = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z) {
            matrix.preTranslate(v79Var.b, v79Var.c);
            matrix.preScale(v79Var.d, v79Var.e);
        }
        Matrix matrix2 = b9cVar.n;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (hac hacVar : b9cVar.i) {
            if ((hacVar instanceof eac) && (pathS0 = s0((eac) hacVar, true)) != null) {
                path.op(pathS0, Path.Op.UNION);
            }
        }
        if (((ebc) this.c).a.M0 != null) {
            v79 v79VarY = b9cVar.h;
            if (v79VarY == null) {
                v79VarY = y(path);
                b9cVar.h = v79VarY;
            }
            Path pathX = x(b9cVar, v79VarY);
            if (pathX != null) {
                path.op(pathX, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.c = (ebc) ((Stack) this.d).pop();
        return path;
    }

    public void y0() {
        try {
            yhb yhbVar = new yhb(g0());
            try {
                a71 a71VarX = yhbVar.x(yhbVar.E());
                a71 a71VarX2 = yhbVar.x(yhbVar.E());
                yhbVar.close();
                synchronized (this) {
                    a71VarX.getClass();
                    this.c = a71VarX;
                    a71VarX2.getClass();
                    this.d = a71VarX2;
                }
                ((CountDownLatch) this.b).countDown();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ym8.t(yhbVar, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            ((CountDownLatch) this.b).countDown();
            throw th3;
        }
    }

    public float z(sac sacVar) {
        gbc gbcVar = new gbc(this);
        K(sacVar, gbcVar);
        return gbcVar.a;
    }

    public void z0(aac aacVar, v79 v79Var, v79 v79Var2, ita itaVar) {
        if (v79Var.d == 0.0f || v79Var.e == 0.0f) {
            return;
        }
        if (itaVar == null && (itaVar = aacVar.n) == null) {
            itaVar = ita.d;
        }
        R0((ebc) this.c, aacVar);
        if (H()) {
            ebc ebcVar = (ebc) this.c;
            ebcVar.f = v79Var;
            if (!ebcVar.a.Z.booleanValue()) {
                v79 v79Var3 = ((ebc) this.c).f;
                G0(v79Var3.b, v79Var3.c, v79Var3.d, v79Var3.e);
            }
            B(aacVar, ((ebc) this.c).f);
            Canvas canvas = (Canvas) this.a;
            ebc ebcVar2 = (ebc) this.c;
            if (v79Var2 != null) {
                canvas.concat(A(ebcVar2.f, v79Var2, itaVar));
                ((ebc) this.c).g = aacVar.o;
            } else {
                v79 v79Var4 = ebcVar2.f;
                canvas.translate(v79Var4.b, v79Var4.c);
            }
            boolean zW0 = w0();
            S0();
            B0(aacVar, true);
            if (zW0) {
                v0(aacVar.h);
            }
            P0(aacVar);
        }
    }

    @Override // defpackage.xb2
    public Object a(Class cls) {
        if (((Set) this.a).contains(y3b.a(cls))) {
            Object objA = ((xb2) this.f).a(cls);
            if (!cls.equals(m2b.class)) {
                return objA;
            }
            return new azb();
        }
        cva.j(cls, ".", "Attempting to request an undeclared dependency ");
        return null;
    }

    public hbc(String str, String str2, Set set) {
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.a = setUnmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.c = str;
        this.d = str2;
        this.e = lgd.a;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.b = Collections.unmodifiableSet(hashSet);
            return;
        }
        throw kv2.g(it);
    }

    public /* synthetic */ hbc(rs0 rs0Var, nfc nfcVar, em7 em7Var) {
        this(rs0Var, nfcVar, em7Var, null, null);
    }

    public hbc(rs0 rs0Var, nfc nfcVar, em7 em7Var, z3b z3bVar, nz9 nz9Var) {
        rs0Var.getClass();
        em7Var.getClass();
        this.a = rs0Var;
        this.b = nfcVar;
        this.c = em7Var;
        this.d = z3bVar;
        this.e = nz9Var;
        fm7.a(em7Var);
        Objects.toString(z3bVar);
    }

    public /* synthetic */ hbc(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
    }

    public hbc(int i) {
        switch (i) {
            case 3:
                this.a = new AtomicBoolean(false);
                this.b = new CountDownLatch(1);
                this.f = "PublicSuffixDatabase.list";
                break;
            default:
                this.a = new int[]{2131230801, 2131230799, 2131230725};
                this.b = new int[]{2131230749, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                this.c = new int[]{2131230798, 2131230800, 2131230742, R.drawable.abc_text_cursor_material, 2131230795, 2131230796, 2131230797};
                this.d = new int[]{2131230774, R.drawable.abc_cab_background_internal_bg, 2131230773};
                this.e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                this.f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                break;
        }
    }
}
