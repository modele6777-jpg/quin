package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import androidx.compose.foundation.layout.b;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class tec {
    public static int a(int i, int i2, List list) {
        return (list.hashCode() + i) * i2;
    }

    public static int b(mue mueVar, int i, int i2) {
        return (mueVar.hashCode() + i) * i2;
    }

    public static y72 c(l46 l46Var, boolean z, long j) {
        l46Var.r(z);
        return new y72(j);
    }

    public static rf9 d(int i, l46 l46Var, boolean z) {
        l46Var.f0(i);
        l46Var.r(z);
        return new rf9();
    }

    public static String e(int i, String str) {
        return str + i;
    }

    public static String f(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String g(int i, String str, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static String h(long j, String str, StringBuilder sb) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static String i(l46 l46Var, int i, int i2, l46 l46Var2, boolean z) {
        l46Var.f0(i);
        String strQ = afc.q(i2, l46Var2);
        l46Var.r(z);
        return strQ;
    }

    public static String j(kob kobVar, Class cls, StringBuilder sb) {
        sb.append(kobVar.b(cls));
        return sb.toString();
    }

    public static String k(String str, int i, char c) {
        return str + i + c;
    }

    public static String l(String str, String str2) {
        return str + str2;
    }

    public static String m(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String n(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static StringBuilder o(String str, float f, String str2, float f2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(f);
        sb.append(str2);
        sb.append(f2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder p(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static void q(int i, dd2 dd2Var, l46 l46Var, boolean z) {
        dd2Var.z(l46Var, Integer.valueOf(i));
        l46Var.r(z);
    }

    public static void r(int i, l46 l46Var, int i2, he2 he2Var) {
        l46Var.p0(Integer.valueOf(i));
        l46Var.b(he2Var, Integer.valueOf(i2));
    }

    public static void s(l46 l46Var, boolean z, boolean z2, boolean z3) {
        l46Var.r(z);
        l46Var.r(z2);
        l46Var.r(z3);
    }

    public static void t(ef8 ef8Var, String str, String str2, Exception exc) {
        ef8Var.getClass();
        ef8.a(str).c(str2, exc);
    }

    public static void u(g09 g09Var, float f, l46 l46Var, boolean z) {
        o5c.f(l46Var, b.d(g09Var, f));
        l46Var.r(z);
    }

    public static void v(y9e y9eVar, w9e w9eVar, v9e v9eVar, y9e y9eVar2, w9e w9eVar2) {
        n3e n3eVar = z9e.e;
        v9eVar.a(g3e.c(y9eVar, w9eVar, n3eVar));
        v9eVar.a(g3e.c(y9eVar2, w9eVar2, n3eVar));
    }

    public static /* synthetic */ void w(AutoCloseable autoCloseable) throws Exception {
        boolean zIsTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            }
            if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else if (autoCloseable instanceof MediaDrm) {
                ((MediaDrm) autoCloseable).release();
                return;
            } else {
                cva.s();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
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

    public static void x(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
    }

    public static /* synthetic */ void y(AutoCloseable autoCloseable) throws Exception {
        boolean zIsTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            }
            if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else if (autoCloseable instanceof MediaDrm) {
                ((MediaDrm) autoCloseable).release();
                return;
            } else {
                cva.s();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
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
}
