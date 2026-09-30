package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import androidx.compose.foundation.layout.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class ks0 {
    public static /* synthetic */ String A(int i) {
        if (i == 1) {
            return "PENDING_OPEN";
        }
        if (i == 2) {
            return "OPENING";
        }
        if (i == 3) {
            return "OPEN";
        }
        if (i != 4) {
            return i != 5 ? "null" : "CLOSED";
        }
        return "CLOSING";
    }

    public static float a(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    public static g1b b(n23 n23Var, o23 o23Var, int i) {
        return qi4.a(new os(n23Var, o23Var, i, 2));
    }

    public static g1b c(r23 r23Var, int i) {
        return qi4.a(new sug(r23Var, i, 4));
    }

    public static mmb d(Object obj) {
        jzb.q(obj);
        return new mmb();
    }

    public static ClassCastException e(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static Object f(int i, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i);
    }

    public static String g(char c, String str, String str2) {
        return str + str2 + c;
    }

    public static String h(float f, int i, l46 l46Var, l46 l46Var2, g09 g09Var) {
        o5c.f(l46Var, b.d(g09Var, f));
        return afc.q(i, l46Var2);
    }

    public static String i(long j, String str) {
        return str + j;
    }

    public static String j(Object obj, String str) {
        return str + obj;
    }

    public static String k(String str, int i, String str2, int i2) {
        return str + i + str2 + i2;
    }

    public static String l(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String m(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    public static String n(StringBuilder sb, List list, String str) {
        sb.append(list);
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder o(String str, k7f k7fVar, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(k7fVar);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder p(String str, String str2, String str3, int i, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(i);
        sb.append(str4);
        return sb;
    }

    public static void q(int i, dd2 dd2Var, e92 e92Var, l46 l46Var, boolean z) {
        dd2Var.m(e92Var, l46Var, Integer.valueOf(i));
        l46Var.r(z);
    }

    public static void r(int i, HashMap map, String str, int i2, String str2) {
        map.put(str, Integer.valueOf(i));
        map.put(str2, Integer.valueOf(i2));
    }

    public static void s(long j, String str, StringBuilder sb) {
        sb.append((Object) y72.h(j));
        sb.append(str);
    }

    public static void t(ta0 ta0Var, long j) {
        ta0Var.p().o();
        ta0Var.R(j);
    }

    public static /* synthetic */ void u(Object obj) throws Exception {
        boolean zIsTerminated;
        if (obj instanceof AutoCloseable) {
            ((AutoCloseable) obj).close();
            return;
        }
        if (!(obj instanceof ExecutorService)) {
            if (obj instanceof TypedArray) {
                ((TypedArray) obj).recycle();
                return;
            }
            if (obj instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) obj).release();
                return;
            } else if (obj instanceof MediaDrm) {
                ((MediaDrm) obj).release();
                return;
            } else {
                cva.s();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) obj;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static void v(String str, String str2, String str3) {
        xo1.V(str3, str + str2);
    }

    public static void w(StringBuilder sb, float f, String str, float f2, String str2) {
        sb.append(f);
        sb.append(str);
        sb.append(f2);
        sb.append(str2);
    }

    public static void x(HashMap map, String str, Integer num, int i, String str2) {
        map.put(str, num);
        map.put(str2, Integer.valueOf(i));
    }

    public static boolean y(String str, String str2, Bundle bundle) {
        bundle.getClass();
        str.getClass();
        return bundle.containsKey(str2);
    }

    public static /* synthetic */ String z(int i) {
        if (i == 1) {
            return "DECLARATION";
        }
        if (i == 2) {
            return "FAKE_OVERRIDE";
        }
        if (i != 3) {
            return i != 4 ? "null" : "SYNTHESIZED";
        }
        return "DELEGATION";
    }
}
