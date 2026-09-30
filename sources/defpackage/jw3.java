package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jw3 implements vs4 {
    public final int a;
    public final int b;

    public jw3(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        j37.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // defpackage.vs4
    public final void a(er0 er0Var) {
        int i = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            int i3 = i + 1;
            int i4 = er0Var.b;
            if (i4 <= i3) {
                i = i4;
                break;
            }
            i = (Character.isHighSurrogate(er0Var.f((i4 - i3) + (-1))) && Character.isLowSurrogate(er0Var.f(er0Var.b - i3))) ? i + 2 : i3;
        }
        int iC = 0;
        for (int i5 = 0; i5 < this.b; i5++) {
            int i6 = iC + 1;
            int i7 = er0Var.c;
            p90 p90Var = (p90) er0Var.f;
            if (i7 + i6 >= p90Var.C()) {
                iC = p90Var.C() - er0Var.c;
                break;
            }
            iC = (Character.isHighSurrogate(er0Var.f((er0Var.c + i6) + (-1))) && Character.isLowSurrogate(er0Var.f(er0Var.c + i6))) ? iC + 2 : i6;
        }
        int i8 = er0Var.c;
        er0Var.e(i8, iC + i8);
        int i9 = er0Var.b;
        er0Var.e(i9 - i, i9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jw3)) {
            return false;
        }
        jw3 jw3Var = (jw3) obj;
        return this.a == jw3Var.a && this.b == jw3Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return kv2.h(this.a, this.b, "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=", ", lengthAfterCursor=", ")");
    }
}
