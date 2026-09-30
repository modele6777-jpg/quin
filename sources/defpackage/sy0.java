package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sy0 implements Cloneable {
    public int a;
    public int b;
    public int c;
    public int[] d;

    public final boolean a(int i, int i2) {
        return ((this.d[(i / 32) + (i2 * this.c)] >>> (i & 31)) & 1) != 0;
    }

    public final Object clone() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int[] iArr = (int[]) this.d.clone();
        sy0 sy0Var = new sy0();
        sy0Var.a = i;
        sy0Var.b = i2;
        sy0Var.c = i3;
        sy0Var.d = iArr;
        return sy0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sy0)) {
            return false;
        }
        sy0 sy0Var = (sy0) obj;
        return this.a == sy0Var.a && this.b == sy0Var.b && this.c == sy0Var.c && Arrays.equals(this.d, sy0Var.d);
    }

    public final int hashCode() {
        int i = this.a;
        return Arrays.hashCode(this.d) + (((((((i * 31) + i) * 31) + this.b) * 31) + this.c) * 31);
    }

    public final String toString() {
        int i = this.b;
        int i2 = this.a;
        StringBuilder sb = new StringBuilder((i2 + 1) * i);
        for (int i3 = 0; i3 < i; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                sb.append(a(i4, i3) ? "X " : "  ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
