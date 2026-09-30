package defpackage;

import com.adjust.sdk.sig.r3;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class y4c extends o2 implements RandomAccess {
    public final Object[] a;
    public final int b;
    public int c;
    public int d;

    public y4c(int i, Object[] objArr) {
        this.a = objArr;
        if (i < 0) {
            qc0.o(tec.e(i, "ring buffer filled size should not be negative but it is "));
            throw null;
        }
        if (i <= objArr.length) {
            this.b = objArr.length;
            this.d = i;
        } else {
            qc0.h(objArr.length, ub3.n(i, "ring buffer filled size: ", " cannot be larger than the buffer size: "));
            throw null;
        }
    }

    @Override // defpackage.d1
    public final int c() {
        return this.d;
    }

    public final void d(int i) {
        if (i < 0) {
            qc0.o(tec.e(i, "n shouldn't be negative but it is "));
            return;
        }
        if (i > this.d) {
            qc0.h(this.d, ub3.n(i, "n shouldn't be greater than the buffer size: n = ", ", size = "));
            return;
        }
        if (i > 0) {
            int i2 = this.c;
            int i3 = this.b;
            int i4 = (i2 + i) % i3;
            Object[] objArr = this.a;
            if (i2 > i4) {
                Arrays.fill(objArr, i2, i3, (Object) null);
                Arrays.fill(objArr, 0, i4, (Object) null);
            } else {
                Arrays.fill(objArr, i2, i4, (Object) null);
            }
            this.c = i4;
            this.d -= i;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.d;
        if (i < 0 || i >= i2) {
            r3.i(ks0.k("index: ", i, ", size: ", i2));
            return null;
        }
        return this.a[(this.c + i) % this.b];
    }

    @Override // defpackage.o2, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new x4c(this);
    }

    @Override // defpackage.d1, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        objArr.getClass();
        int length = objArr.length;
        int i = this.d;
        if (length < i) {
            objArr = Arrays.copyOf(objArr, i);
        }
        int i2 = this.d;
        int i3 = this.c;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            objArr2 = this.a;
            if (i5 >= i2 || i3 >= this.b) {
                break;
            }
            objArr[i5] = objArr2[i3];
            i5++;
            i3++;
        }
        while (i5 < i2) {
            objArr[i5] = objArr2[i4];
            i5++;
            i4++;
        }
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // defpackage.d1, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[c()]);
    }
}
