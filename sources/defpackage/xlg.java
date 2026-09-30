package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class xlg implements Iterable, Serializable {
    public static final wlg a = new wlg(xmg.a);
    private int zzb = 0;

    static {
        int i = slg.a;
    }

    public static wlg k(byte[] bArr, int i, int i2) {
        try {
            return m(bArr, i, i2);
        } catch (bng e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    public static wlg m(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return a;
        }
        o(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new wlg(bArr2);
    }

    public static int o(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 44 + String.valueOf(i2).length());
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i2).length() + 15 + String.valueOf(i3).length());
        sb3.append("End index: ");
        sb3.append(i2);
        sb3.append(" >= ");
        sb3.append(i3);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    public static /* synthetic */ boolean p(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        int i4 = i + i3;
        o(i, i4, bArr.length);
        o(i2, i3 + i2, bArr2.length);
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

    public abstract int c();

    public abstract vlg d(int i, int i2);

    public abstract void e(byte[] bArr, int i);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xlg)) {
            return false;
        }
        xlg xlgVar = (xlg) obj;
        int iC = c();
        if (iC != xlgVar.c()) {
            return false;
        }
        if (iC == 0) {
            return true;
        }
        int i = this.zzb;
        int i2 = xlgVar.zzb;
        if (i == 0 || i2 == 0 || i == i2) {
            return i(xlgVar);
        }
        return false;
    }

    public abstract void g(gmg gmgVar);

    public final int hashCode() {
        int iJ = this.zzb;
        if (iJ == 0) {
            int iC = c();
            iJ = j(iC, iC);
            if (iJ == 0) {
                iJ = 1;
            }
            this.zzb = iJ;
        }
        return iJ;
    }

    public abstract boolean i(xlg xlgVar);

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new p61(this);
    }

    public abstract int j(int i, int i2);

    public final byte[] n() {
        int iC = c();
        if (iC == 0) {
            return xmg.a;
        }
        byte[] bArr = new byte[iC];
        e(bArr, iC);
        return bArr;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        return ks0.l(ks0.p("<ByteString@", Integer.toHexString(System.identityHashCode(this)), " size=", c(), " contents=\""), c() <= 50 ? rrb.s(n()) : rrb.s(d(0, 47).n()).concat("..."), "\">");
    }
}
