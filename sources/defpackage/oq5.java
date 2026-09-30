package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class oq5 {
    public static final ej8 a = new ej8(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final wid d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new mtb(0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new wid(0);
    }

    public static String a(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((jq5) list.get(i2)).g);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    public static nq5 b(String str, Context context, List list, int i) {
        int i2;
        Typeface typefaceN;
        ej8 ej8Var = a;
        Trace.beginSection(xdc.v("getFontSync"));
        try {
            Typeface typeface = (Typeface) ej8Var.c(str);
            if (typeface != null) {
                nq5 nq5Var = new nq5(typeface);
                Trace.endSection();
                return nq5Var;
            }
            try {
                dr5 dr5VarA = iq5.a(context, list);
                List list2 = dr5VarA.b;
                int i3 = dr5VarA.a;
                if (i3 == 0) {
                    er5[] er5VarArr = (er5[]) list2.get(0);
                    if (er5VarArr == null || er5VarArr.length == 0) {
                        i2 = 1;
                    } else {
                        int length = er5VarArr.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length) {
                                i2 = 0;
                                break;
                            }
                            int i5 = er5VarArr[i4].f;
                            if (i5 != 0) {
                                if (i5 >= 0) {
                                    i2 = i5;
                                    break;
                                }
                                i2 = -3;
                                break;
                            }
                            i4++;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        i2 = -3;
                        break;
                    }
                    i2 = -2;
                }
                if (i2 != 0) {
                    nq5 nq5Var2 = new nq5(i2);
                    Trace.endSection();
                    return nq5Var2;
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    er5[] er5VarArr2 = (er5[]) list2.get(0);
                    d8c d8cVar = a9f.a;
                    Trace.beginSection(xdc.v("TypefaceCompat.createFromFontInfo"));
                    try {
                        typefaceN = a9f.a.n(context, er5VarArr2, i);
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    d8c d8cVar2 = a9f.a;
                    Trace.beginSection(xdc.v("TypefaceCompat.createFromFontInfoWithFallback"));
                    try {
                        typefaceN = a9f.a.o(context, list2, i);
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                if (typefaceN == null) {
                    nq5 nq5Var3 = new nq5(-3);
                    Trace.endSection();
                    return nq5Var3;
                }
                ej8Var.d(str, typefaceN);
                nq5 nq5Var4 = new nq5(typefaceN);
                Trace.endSection();
                return nq5Var4;
            } catch (PackageManager.NameNotFoundException unused) {
                nq5 nq5Var5 = new nq5(-1);
                Trace.endSection();
                return nq5Var5;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }
}
