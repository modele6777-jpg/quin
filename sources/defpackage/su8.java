package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class su8 {
    public final qu8[] a;
    public final long b;

    public su8(List list) {
        this((qu8[]) list.toArray(new qu8[0]));
    }

    public final su8 a(qu8... qu8VarArr) {
        if (qu8VarArr.length == 0) {
            return this;
        }
        String str = pqf.a;
        qu8[] qu8VarArr2 = this.a;
        Object[] objArrCopyOf = Arrays.copyOf(qu8VarArr2, qu8VarArr2.length + qu8VarArr.length);
        System.arraycopy(qu8VarArr, 0, objArrCopyOf, qu8VarArr2.length, qu8VarArr.length);
        return new su8(this.b, (qu8[]) objArrCopyOf);
    }

    public final su8 b(su8 su8Var) {
        return su8Var == null ? this : a(su8Var.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && su8.class == obj.getClass()) {
            su8 su8Var = (su8) obj;
            if (Arrays.equals(this.a, su8Var.a) && this.b == su8Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return kn2.O(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.a));
        long j = this.b;
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        sb.append(str);
        return sb.toString();
    }

    public su8(long j, qu8... qu8VarArr) {
        this.b = j;
        this.a = qu8VarArr;
    }

    public su8(qu8... qu8VarArr) {
        this(-9223372036854775807L, qu8VarArr);
    }
}
