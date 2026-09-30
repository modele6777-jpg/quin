package defpackage;

import com.adjust.sdk.sig.r3;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class vyg implements Iterable, Serializable {
    public static final tyg a = new tyg(y0h.a);
    private int zzb = 0;

    static {
        int i = hyg.a;
    }

    public static int k(int i, int i2, int i3) {
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

    public static tyg m(byte[] bArr, int i, int i2) {
        try {
            k(i, i + i2, bArr.length);
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return new tyg(bArr2);
        } catch (p1h e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    public static /* bridge */ /* synthetic */ boolean n(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        int i4 = i + i3;
        k(i, i4, bArr.length);
        k(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public abstract byte a(int i);

    public abstract int c(int i, int i2);

    public abstract int d();

    public abstract ryg e(int i, int i2);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vyg)) {
            return false;
        }
        vyg vygVar = (vyg) obj;
        int iD = d();
        if (iD != vygVar.d()) {
            return false;
        }
        if (iD == 0) {
            return true;
        }
        int i = this.zzb;
        int i2 = vygVar.zzb;
        if (i == 0 || i2 == 0 || i == i2) {
            return j(vygVar);
        }
        return false;
    }

    public abstract void g(byte[] bArr, int i);

    public final int hashCode() {
        int iC = this.zzb;
        if (iC == 0) {
            int iD = d();
            iC = c(iD, iD);
            if (iC == 0) {
                iC = 1;
            }
            this.zzb = iC;
        }
        return iC;
    }

    public abstract void i(p90 p90Var);

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new p61(this);
    }

    public abstract boolean j(vyg vygVar);

    public final String toString() {
        byte[] bArr;
        String strConcat;
        byte[] bArr2;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iD = d();
        if (d() <= 50) {
            int iD2 = d();
            if (iD2 == 0) {
                bArr2 = y0h.a;
            } else {
                byte[] bArr3 = new byte[iD2];
                g(bArr3, iD2);
                bArr2 = bArr3;
            }
            strConcat = eec.v(bArr2);
        } else {
            ryg rygVarE = e(0, 47);
            int iD3 = rygVarE.d();
            if (iD3 == 0) {
                bArr = y0h.a;
            } else {
                byte[] bArr4 = new byte[iD3];
                rygVarE.g(bArr4, iD3);
                bArr = bArr4;
            }
            strConcat = eec.v(bArr).concat("...");
        }
        return ks0.l(ks0.p("<ByteString@", hexString, " size=", iD, " contents=\""), strConcat, "\">");
    }
}
