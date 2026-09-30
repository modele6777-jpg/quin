package defpackage;

import com.adjust.sdk.sig.r3;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class y61 implements Iterable, Serializable {
    public static final v61 a = new v61(p87.b);
    private static final long serialVersionUID = 1;
    private int hash = 0;

    static {
        Class cls = ro.a;
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

    public abstract byte a(int i);

    public abstract byte d(int i);

    public final int e() {
        return this.hash;
    }

    public final int hashCode() {
        int i = this.hash;
        if (i != 0) {
            return i;
        }
        int size = size();
        v61 v61Var = (v61) this;
        byte[] bArr = v61Var.bytes;
        int iG = v61Var.g();
        int i2 = size;
        for (int i3 = iG; i3 < iG + size; i3++) {
            i2 = (i2 * 31) + bArr[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.hash = i2;
        return i2;
    }

    public abstract int size();

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            strConcat = drb.e(this);
        } else {
            v61 v61Var = (v61) this;
            int iC = c(0, 47, v61Var.size());
            strConcat = drb.e(iC == 0 ? a : new q61(v61Var.bytes, v61Var.g(), iC)).concat("...");
        }
        return ks0.l(ks0.p("<ByteString@", hexString, " size=", size, " contents=\""), strConcat, "\">");
    }
}
