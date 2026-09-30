package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cy6 implements Serializable {
    public static final cy6 a = new cy6(new int[0], 0);
    private final int[] array;
    private final int end;

    public cy6(int[] iArr, int i) {
        this.array = iArr;
        this.end = i;
    }

    public static cy6 c(int... iArr) {
        pa7.z("the total number of elements must fit in an int", iArr.length <= 2147483646);
        int length = iArr.length + 1;
        int[] iArr2 = new int[length];
        iArr2[0] = 0;
        System.arraycopy(iArr, 0, iArr2, 1, iArr.length);
        return new cy6(iArr2, length);
    }

    public final int a(int i) {
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
        if (obj instanceof cy6) {
            cy6 cy6Var = (cy6) obj;
            if (this.end == cy6Var.end) {
                for (int i = 0; i < this.end; i++) {
                    if (a(i) == cy6Var.a(i)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.end; i2++) {
            i = (i * 31) + this.array[i2];
        }
        return i;
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
        int[] iArr = this.array;
        if (i >= iArr.length) {
            return this;
        }
        int[] iArrCopyOfRange = Arrays.copyOfRange(iArr, 0, i);
        return new cy6(iArrCopyOfRange, iArrCopyOfRange.length);
    }
}
