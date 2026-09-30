package defpackage;

import android.util.Pair;
import com.adjust.sdk.sig.r3;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gye {
    public static final dye a = new dye();

    static {
        pqf.D(0);
        pqf.D(1);
        pqf.D(2);
    }

    public int a(boolean z) {
        return p() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i, eye eyeVar, fye fyeVar, int i2, boolean z) {
        int i3 = f(i, eyeVar, false).c;
        if (m(i3, fyeVar, 0L).m != i) {
            return i + 1;
        }
        int iE = e(i3, i2, z);
        if (iE == -1) {
            return -1;
        }
        return m(iE, fyeVar, 0L).l;
    }

    public int e(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == c(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == c(z) ? a(z) : i + 1;
        }
        r3.l();
        return 0;
    }

    public boolean equals(Object obj) {
        int iC;
        if (this != obj) {
            if (obj instanceof gye) {
                gye gyeVar = (gye) obj;
                if (gyeVar.o() == o() && gyeVar.h() == h()) {
                    fye fyeVar = new fye();
                    eye eyeVar = new eye();
                    fye fyeVar2 = new fye();
                    eye eyeVar2 = new eye();
                    for (int i = 0; i < o(); i++) {
                        if (m(i, fyeVar, 0L).equals(gyeVar.m(i, fyeVar2, 0L))) {
                        }
                    }
                    for (int i2 = 0; i2 < h(); i2++) {
                        if (f(i2, eyeVar, true).equals(gyeVar.f(i2, eyeVar2, true))) {
                        }
                    }
                    int iA = a(true);
                    if (iA == gyeVar.a(true) && (iC = c(true)) == gyeVar.c(true)) {
                        while (iA != iC) {
                            int iE = e(iA, 0, true);
                            if (iE == gyeVar.e(iA, 0, true)) {
                                iA = iE;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public abstract eye f(int i, eye eyeVar, boolean z);

    public eye g(Object obj, eye eyeVar) {
        return f(b(obj), eyeVar, true);
    }

    public abstract int h();

    public int hashCode() {
        fye fyeVar = new fye();
        eye eyeVar = new eye();
        int iO = o() + 217;
        for (int i = 0; i < o(); i++) {
            iO = (iO * 31) + m(i, fyeVar, 0L).hashCode();
        }
        int iH = h() + (iO * 31);
        for (int i2 = 0; i2 < h(); i2++) {
            iH = (iH * 31) + f(i2, eyeVar, true).hashCode();
        }
        int iA = a(true);
        while (iA != -1) {
            iH = (iH * 31) + iA;
            iA = e(iA, 0, true);
        }
        return iH;
    }

    public final Pair i(fye fyeVar, eye eyeVar, int i, long j) {
        Pair pairJ = j(fyeVar, eyeVar, i, j, 0L);
        pairJ.getClass();
        return pairJ;
    }

    public final Pair j(fye fyeVar, eye eyeVar, int i, long j, long j2) {
        pa7.C(i, o());
        m(i, fyeVar, j2);
        if (j == -9223372036854775807L) {
            j = fyeVar.j;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = fyeVar.l;
        f(i2, eyeVar, false);
        while (i2 < fyeVar.m && eyeVar.e != j) {
            int i3 = i2 + 1;
            if (f(i3, eyeVar, false).e > j) {
                break;
            }
            i2 = i3;
        }
        f(i2, eyeVar, true);
        long jMin = j - eyeVar.e;
        long j3 = eyeVar.d;
        if (j3 != -9223372036854775807L) {
            jMin = Math.min(jMin, j3 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = eyeVar.b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public int k(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == a(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == a(z) ? c(z) : i - 1;
        }
        r3.l();
        return 0;
    }

    public abstract Object l(int i);

    public abstract fye m(int i, fye fyeVar, long j);

    public final void n(int i, fye fyeVar) {
        m(i, fyeVar, 0L);
    }

    public abstract int o();

    public final boolean p() {
        return o() == 0;
    }
}
