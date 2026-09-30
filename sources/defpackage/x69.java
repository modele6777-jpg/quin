package defpackage;

import com.adjust.sdk.sig.r3;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class x69 {
    public long[] a;
    public int b;

    public x69(int i) {
        this.a = i == 0 ? fg8.a : new long[i];
    }

    public final void a(long j) {
        c(this.b + 1);
        long[] jArr = this.a;
        int i = this.b;
        jArr[i] = j;
        this.b = i + 1;
    }

    public final void b(int i, x69 x69Var) {
        int i2;
        x69Var.getClass();
        if (i < 0 || i > (i2 = this.b)) {
            r3.i("");
            return;
        }
        int i3 = x69Var.b;
        if (i3 == 0) {
            return;
        }
        c(i2 + i3);
        long[] jArr = this.a;
        int i4 = this.b;
        if (i != i4) {
            qd0.b0(jArr, jArr, x69Var.b + i, i, i4);
        }
        qd0.b0(x69Var.a, jArr, i, 0, x69Var.b);
        this.b += x69Var.b;
    }

    public final void c(int i) {
        long[] jArr = this.a;
        if (jArr.length < i) {
            this.a = Arrays.copyOf(jArr, Math.max(i, (jArr.length * 3) / 2));
        }
    }

    public final long d(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        r3.i("Index must be between 0 and size");
        return 0L;
    }

    public final void e(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.b) || i2 < 0 || i2 > i3) {
            r3.i("Index must be between 0 and size");
            return;
        }
        if (i2 < i) {
            qc0.j("The end index must be < start index");
        } else if (i2 != i) {
            if (i2 < i3) {
                long[] jArr = this.a;
                qd0.b0(jArr, jArr, i, i2, i3);
            }
            this.b -= i2 - i;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x69) {
            x69 x69Var = (x69) obj;
            int i = x69Var.b;
            int i2 = this.b;
            if (i == i2) {
                long[] jArr = this.a;
                long[] jArr2 = x69Var.a;
                z67 z67VarC0 = mh3.c0(0, i2);
                int i3 = z67VarC0.a;
                int i4 = z67VarC0.b;
                if (i3 > i4) {
                    return true;
                }
                while (jArr[i3] == jArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final void f(int i, long j) {
        if (i < 0 || i >= this.b) {
            r3.i("Index must be between 0 and size");
            return;
        }
        long[] jArr = this.a;
        long j2 = jArr[i];
        jArr[i] = j;
    }

    public final int hashCode() {
        long[] jArr = this.a;
        int i = this.b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += Long.hashCode(jArr[i2]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        long[] jArr = this.a;
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            long j = jArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                return sb.toString();
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(j);
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public /* synthetic */ x69() {
        this(16);
    }
}
