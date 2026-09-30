package defpackage;

import com.adjust.sdk.sig.r3;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d1h implements Iterable, Serializable {
    public static final x0h a = new x0h(u1h.a);
    private int zzc = 0;

    static {
        int i = j0h.a;
    }

    public static int i(int i, int i2, int i3) {
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

    public static x0h k(byte[] bArr, int i) {
        i(0, i, bArr.length);
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return new x0h(bArr2);
    }

    public abstract byte a(int i);

    public abstract byte c(int i);

    public abstract int d();

    public abstract void e(byte[] bArr, int i);

    public abstract x0h g(int i, int i2);

    public final int hashCode() {
        int i = this.zzc;
        if (i != 0) {
            return i;
        }
        int iD = d();
        x0h x0hVar = (x0h) this;
        int iN = x0hVar.n();
        byte[] bArr = u1h.a;
        int i2 = iD;
        for (int i3 = iN; i3 < iN + iD; i3++) {
            i2 = (i2 * 31) + x0hVar.zza[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.zzc = i2;
        return i2;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new p61(this);
    }

    public final int j() {
        return this.zzc;
    }

    public final byte[] m() {
        int iD = d();
        if (iD == 0) {
            return u1h.a;
        }
        byte[] bArr = new byte[iD];
        e(bArr, iD);
        return bArr;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        return ks0.l(ks0.p("<ByteString@", Integer.toHexString(System.identityHashCode(this)), " size=", d(), " contents=\""), d() <= 50 ? scc.o(this) : scc.o(g(0, 47)).concat("..."), "\">");
    }
}
