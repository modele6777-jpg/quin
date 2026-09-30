package defpackage;

import com.adjust.sdk.sig.r3;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b71 implements Iterable, Serializable {
    public static final w61 a = new w61(r87.b);
    public static final s61 b;
    private static final long serialVersionUID = 1;
    private int hash = 0;

    static {
        b = so.a() ? new gec(15) : new i8c(15);
    }

    public static int c(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            r3.i(tec.f(i, "Beginning index: ", " < 0"));
            return 0;
        }
        if (i2 < i) {
            r3.i(ks0.k("Beginning index larger than ending index: ", i, ", ", i2));
            return 0;
        }
        r3.i(ks0.k("End index: ", i2, " >= ", i3));
        return 0;
    }

    public static w61 d(byte[] bArr, int i, int i2) {
        c(i, i + i2, bArr.length);
        return new w61(b.h(bArr, i, i2));
    }

    public abstract byte a(int i);

    public abstract void e(byte[] bArr, int i);

    public abstract byte g(int i);

    public final int hashCode() {
        int i = this.hash;
        if (i != 0) {
            return i;
        }
        int size = size();
        w61 w61Var = (w61) this;
        byte[] bArr = w61Var.bytes;
        int iJ = w61Var.j();
        int i2 = size;
        for (int i3 = iJ; i3 < iJ + size; i3++) {
            i2 = (i2 * 31) + bArr[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.hash = i2;
        return i2;
    }

    public final int i() {
        return this.hash;
    }

    public abstract int size();

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            strConcat = jrb.e(this);
        } else {
            w61 w61Var = (w61) this;
            int iC = c(0, 47, w61Var.size());
            strConcat = jrb.e(iC == 0 ? a : new r61(w61Var.bytes, w61Var.j(), iC)).concat("...");
        }
        return ks0.l(ks0.p("<ByteString@", hexString, " size=", size, " contents=\""), strConcat, "\">");
    }
}
