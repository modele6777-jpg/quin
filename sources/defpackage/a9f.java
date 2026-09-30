package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import io.sentry.android.core.b1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a9f {
    public static final d8c a;
    public static final ej8 b;
    public static Paint c;

    static {
        Trace.beginSection(xdc.v("TypefaceCompat static init"));
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            a = new f9f();
        } else if (i >= 29) {
            a = new e9f();
        } else if (i >= 28) {
            a = new d9f();
        } else {
            a = new c9f();
        }
        b = new ej8(16);
        c = null;
        Trace.endSection();
    }

    public static Typeface a(Context context, pq5 pq5Var, Resources resources, int i, String str, int i2, int i3, p90 p90Var, boolean z) {
        Typeface typefaceM;
        Typeface typefaceBuild;
        FontFamily fontFamilyBuild;
        int i4 = 12;
        int i5 = -3;
        if (pq5Var instanceof sq5) {
            sq5 sq5Var = (sq5) pq5Var;
            String str2 = sq5Var.d;
            typefaceM = null;
            int i6 = 0;
            if (TextUtils.isEmpty(str2) || (typefaceBuild = c(str2)) == null) {
                ArrayList arrayList = sq5Var.a;
                if (arrayList.size() != 1) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i7 = 0;
                        while (true) {
                            if (i7 >= arrayList.size()) {
                                Typeface.CustomFallbackBuilder customFallbackBuilder = null;
                                int i8 = 0;
                                while (true) {
                                    if (i8 < arrayList.size()) {
                                        jq5 jq5Var = (jq5) arrayList.get(i8);
                                        if (i8 == arrayList.size() - 1 && TextUtils.isEmpty(jq5Var.f)) {
                                            customFallbackBuilder.setSystemFallback(jq5Var.e);
                                        } else {
                                            String str3 = jq5Var.e;
                                            String str4 = jq5Var.f;
                                            Font fontD = d(c(str3));
                                            if (fontD == null) {
                                                b1.l("TypefaceCompat", "Unable identify the primary font for " + jq5Var.e + ". Falling back to provider font.");
                                            } else {
                                                if (TextUtils.isEmpty(str4)) {
                                                    fontFamilyBuild = new FontFamily.Builder(fontD).build();
                                                } else {
                                                    try {
                                                        fontFamilyBuild = new FontFamily.Builder(wq.a(fontD).setFontVariationSettings(str4).build()).build();
                                                    } catch (IOException unused) {
                                                        b1.d("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                                    }
                                                }
                                                if (customFallbackBuilder == null) {
                                                    customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyBuild);
                                                } else {
                                                    customFallbackBuilder.addCustomFallback(fontFamilyBuild);
                                                }
                                                i8++;
                                            }
                                        }
                                    }
                                    typefaceBuild = customFallbackBuilder.build();
                                    break;
                                }
                            }
                            if (c(((jq5) arrayList.get(i7)).e) != null) {
                                i7++;
                            }
                            typefaceBuild = null;
                            break;
                        }
                    }
                    typefaceBuild = null;
                    break;
                }
                typefaceBuild = c(((jq5) arrayList.get(0)).e);
            }
            if (typefaceBuild != null) {
                if (p90Var != null) {
                    new Handler(Looper.getMainLooper()).post(new xu8(i4, p90Var, typefaceBuild));
                }
                b.d(b(resources, i, str, i2, i3), typefaceBuild);
                return typefaceBuild;
            }
            boolean z2 = !z ? p90Var != null : sq5Var.c != 0;
            int i9 = z ? sq5Var.b : -1;
            oid oidVar = new oid(3);
            oidVar.b = p90Var;
            ArrayList arrayList2 = sq5Var.a;
            ft ftVar = new ft(new Handler(Looper.getMainLooper()), 3);
            k47 k47Var = new k47(15, oidVar, ftVar);
            int i10 = 13;
            if (!z2) {
                String strA = oq5.a(i3, arrayList2);
                Typeface typeface = (Typeface) oq5.a.c(strA);
                if (typeface != null) {
                    ftVar.execute(new v36(i10, oidVar, typeface));
                    typefaceM = typeface;
                } else {
                    is4 is4Var = new is4(1, k47Var);
                    synchronized (oq5.c) {
                        try {
                            wid widVar = oq5.d;
                            ArrayList arrayList3 = (ArrayList) widVar.get(strA);
                            if (arrayList3 != null) {
                                arrayList3.add(is4Var);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(is4Var);
                                widVar.put(strA, arrayList4);
                                mq5 mq5Var = new mq5(strA, context, arrayList2, i3, 1);
                                ThreadPoolExecutor threadPoolExecutor = oq5.b;
                                is4 is4Var2 = new is4(2, strA);
                                Handler handler = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                qe qeVar = new qe();
                                qeVar.b = mq5Var;
                                qeVar.c = is4Var2;
                                qeVar.d = handler;
                                threadPoolExecutor.execute(qeVar);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } else {
                if (arrayList2.size() > 1) {
                    qc0.j("Fallbacks with blocking fetches are not supported for performance reasons");
                    return null;
                }
                jq5 jq5Var2 = (jq5) arrayList2.get(0);
                ej8 ej8Var = oq5.a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj = new Object[]{jq5Var2}[0];
                Objects.requireNonNull(obj);
                arrayList5.add(obj);
                String strA2 = oq5.a(i3, Collections.unmodifiableList(arrayList5));
                Typeface typeface2 = (Typeface) oq5.a.c(strA2);
                if (typeface2 != null) {
                    ftVar.execute(new v36(i10, oidVar, typeface2));
                    typefaceM = typeface2;
                } else if (i9 == -1) {
                    Object[] objArr = {jq5Var2};
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    arrayList6.add(obj2);
                    nq5 nq5VarB = oq5.b(strA2, context, Collections.unmodifiableList(arrayList6), i3);
                    k47Var.H(nq5VarB);
                    typefaceM = nq5VarB.a;
                } else {
                    try {
                        try {
                            try {
                                try {
                                    nq5 nq5Var = (nq5) oq5.b.submit(new mq5(strA2, context, jq5Var2, i3, 0)).get(i9, TimeUnit.MILLISECONDS);
                                    k47Var.H(nq5Var);
                                    typefaceM = nq5Var.a;
                                } catch (ExecutionException e) {
                                    throw new RuntimeException(e);
                                }
                            } catch (InterruptedException e2) {
                                throw e2;
                            }
                        } catch (TimeoutException unused2) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused3) {
                        ((ft) k47Var.c).execute(new qa1((oid) k47Var.b, i5, i6));
                    }
                }
            }
        } else {
            typefaceM = a.m(context, (qq5) pq5Var, resources, i3);
            if (p90Var != null) {
                if (typefaceM != null) {
                    new Handler(Looper.getMainLooper()).post(new xu8(i4, p90Var, typefaceM));
                } else {
                    p90Var.i(-3);
                }
            }
        }
        if (typefaceM != null) {
            b.d(b(resources, i, str, i2, i3), typefaceM);
        }
        return typefaceM;
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    public static Typeface c(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    public static Font d(Typeface typeface) {
        Paint paint = c;
        if (paint == null) {
            paint = new Paint();
            c = paint;
        }
        paint.setTextSize(10.0f);
        c.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, c);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}
