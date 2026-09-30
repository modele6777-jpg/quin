package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ky6 implements Serializable {
    public static final ky6 a = new ky6(new long[0], 0);
    private final long[] array;
    private final int end;

    public ky6(long[] jArr, int i) {
        this.array = jArr;
        this.end = i;
    }

    public final long a(int i) {
        pa7.C(i, this.end);
        return this.array[i];
    }

    public final int b() {
        return this.end;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ky6) {
            ky6 ky6Var = (ky6) obj;
            if (this.end == ky6Var.end) {
                for (int i = 0; i < this.end; i++) {
                    if (a(i) == ky6Var.a(i)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iO = 1;
        for (int i = 0; i < this.end; i++) {
            iO = (iO * 31) + kn2.O(this.array[i]);
        }
        return iO;
    }

    public Object readResolve() {
        return this.end == 0 ? a : this;
    }

    public final String toString() {
        int i = this.end;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        sb.append(this.array[0]);
        for (int i2 = 1; i2 < this.end; i2++) {
            sb.append(", ");
            sb.append(this.array[i2]);
        }
        sb.append(']');
        return sb.toString();
    }

    public Object writeReplace() {
        int i = this.end;
        long[] jArr = this.array;
        if (i >= jArr.length) {
            return this;
        }
        long[] jArrCopyOfRange = Arrays.copyOfRange(jArr, 0, i);
        return new ky6(jArrCopyOfRange, jArrCopyOfRange.length);
    }
}
