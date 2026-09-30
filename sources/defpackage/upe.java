package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class upe {
    public static final g3e f = new g3e(4);
    public final z2f a;
    public final mue b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public upe(z2f z2fVar, mue mueVar, boolean z, boolean z2, boolean z3) {
        this.a = z2fVar;
        this.b = mueVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NonMeasureInputs(textFieldState=");
        sb.append(this.a);
        sb.append(", textStyle=");
        sb.append(this.b);
        sb.append(", singleLine=");
        ib8.w(sb, this.c, ", softWrap=", this.d, ", isKeyboardTypePhone=");
        return ub3.m(sb, this.e, ")");
    }
}
