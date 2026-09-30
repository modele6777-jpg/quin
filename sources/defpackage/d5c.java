package defpackage;

import androidx.compose.material3.c;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d5c {
    public static final pr4 a = new pr4(0, new zib(21));
    public static final c b;
    public static final c c;

    static {
        long j = y72.k;
        b = new c(true, Float.NaN, j);
        c = new c(false, Float.NaN, j);
    }

    public static c a(float f, int i, long j, boolean z) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            f = Float.NaN;
        }
        if ((i & 4) != 0) {
            j = y72.k;
        }
        if (yi4.b(f, Float.NaN) && faf.a(j, y72.k)) {
            return z ? b : c;
        }
        return new c(z, f, j);
    }
}
