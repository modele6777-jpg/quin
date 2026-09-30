package defpackage;

import com.adjust.sdk.Constants;
import com.adjust.sdk.sig.r3;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class p6c extends z61 {
    public static final int[] v;
    public final int b;
    public final z61 c;
    public final z61 d;
    public final int e;
    public final int f;
    public int g = 0;

    static {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 1;
        while (i > 0) {
            arrayList.add(Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(Integer.MAX_VALUE);
        v = new int[arrayList.size()];
        int i4 = 0;
        while (true) {
            int[] iArr = v;
            if (i4 >= iArr.length) {
                return;
            }
            iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
            i4++;
        }
    }

    public p6c(z61 z61Var, z61 z61Var2) {
        this.c = z61Var;
        this.d = z61Var2;
        int size = z61Var.size();
        this.e = size;
        this.b = z61Var2.size() + size;
        this.f = Math.max(z61Var.f(), z61Var2.f()) + 1;
    }

    @Override // defpackage.z61
    public final void e(int i, byte[] bArr, int i2, int i3) {
        int i4 = i + i3;
        z61 z61Var = this.c;
        int i5 = this.e;
        if (i4 <= i5) {
            z61Var.e(i, bArr, i2, i3);
            return;
        }
        z61 z61Var2 = this.d;
        if (i >= i5) {
            z61Var2.e(i - i5, bArr, i2, i3);
            return;
        }
        int i6 = i5 - i;
        z61Var.e(i, bArr, i2, i6);
        z61Var2.e(0, bArr, i2 + i6, i3 - i6);
    }

    public final boolean equals(Object obj) {
        int iN;
        if (obj == this) {
            return true;
        }
        if (obj instanceof z61) {
            z61 z61Var = (z61) obj;
            int size = z61Var.size();
            int i = this.b;
            if (i == size) {
                if (i == 0) {
                    return true;
                }
                if (this.g == 0 || (iN = z61Var.n()) == 0 || this.g == iN) {
                    eg9 eg9Var = new eg9(this);
                    m98 m98VarA = eg9Var.a();
                    eg9 eg9Var2 = new eg9(z61Var);
                    m98 m98VarA2 = eg9Var2.a();
                    int i2 = 0;
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        int length = m98VarA.b.length - i2;
                        int length2 = m98VarA2.b.length - i3;
                        int iMin = Math.min(length, length2);
                        if (!(i2 == 0 ? m98VarA.s(m98VarA2, i3, iMin) : m98VarA2.s(m98VarA, i2, iMin))) {
                            break;
                        }
                        i4 += iMin;
                        if (i4 >= i) {
                            if (i4 == i) {
                                return true;
                            }
                            r3.l();
                            return false;
                        }
                        if (iMin == length) {
                            m98VarA = eg9Var.a();
                            i2 = 0;
                        } else {
                            i2 += iMin;
                        }
                        if (iMin == length2) {
                            m98VarA2 = eg9Var2.a();
                            i3 = 0;
                        } else {
                            i3 += iMin;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.z61
    public final int f() {
        return this.f;
    }

    @Override // defpackage.z61
    public final boolean g() {
        return this.b >= v[this.f];
    }

    public final int hashCode() {
        int iK = this.g;
        if (iK == 0) {
            int i = this.b;
            iK = k(i, 0, i);
            if (iK == 0) {
                iK = 1;
            }
            this.g = iK;
        }
        return iK;
    }

    @Override // defpackage.z61
    public final boolean i() {
        int iM = this.c.m(0, 0, this.e);
        z61 z61Var = this.d;
        return z61Var.m(iM, 0, z61Var.size()) == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new o6c(this);
    }

    @Override // defpackage.z61
    public final int k(int i, int i2, int i3) {
        int i4 = i2 + i3;
        z61 z61Var = this.c;
        int i5 = this.e;
        if (i4 <= i5) {
            return z61Var.k(i, i2, i3);
        }
        z61 z61Var2 = this.d;
        if (i2 >= i5) {
            return z61Var2.k(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return z61Var2.k(z61Var.k(i, i2, i6), 0, i3 - i6);
    }

    @Override // defpackage.z61
    public final int m(int i, int i2, int i3) {
        int i4 = i2 + i3;
        z61 z61Var = this.c;
        int i5 = this.e;
        if (i4 <= i5) {
            return z61Var.m(i, i2, i3);
        }
        z61 z61Var2 = this.d;
        if (i2 >= i5) {
            return z61Var2.m(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return z61Var2.m(z61Var.m(i, i2, i6), 0, i3 - i6);
    }

    @Override // defpackage.z61
    public final int n() {
        return this.g;
    }

    @Override // defpackage.z61
    public final String p() {
        return new String(o(), Constants.ENCODING);
    }

    @Override // defpackage.z61
    public final void r(OutputStream outputStream, int i, int i2) {
        int i3 = i + i2;
        z61 z61Var = this.c;
        int i4 = this.e;
        if (i3 <= i4) {
            z61Var.r(outputStream, i, i2);
            return;
        }
        z61 z61Var2 = this.d;
        if (i >= i4) {
            z61Var2.r(outputStream, i - i4, i2);
            return;
        }
        int i5 = i4 - i;
        z61Var.r(outputStream, i, i5);
        z61Var2.r(outputStream, 0, i2 - i5);
    }

    @Override // defpackage.z61
    public final int size() {
        return this.b;
    }
}
