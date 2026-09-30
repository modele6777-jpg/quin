package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rwa {
    public static final rwa d = new rwa(0.0f, 0, new b62(0.0f, 0.0f));
    public final float a;
    public final b62 b;
    public final int c;

    public rwa(float f, int i, b62 b62Var) {
        this.a = f;
        this.b = b62Var;
        this.c = i;
        if (Float.isNaN(f)) {
            qc0.j("current must not be NaN");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rwa)) {
            return false;
        }
        rwa rwaVar = (rwa) obj;
        return this.a == rwaVar.a && pa7.t(this.b, rwaVar.b) && this.c == rwaVar.c;
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressBarRangeInfo(current=");
        sb.append(this.a);
        sb.append(", range=");
        sb.append(this.b);
        sb.append(", steps=");
        return tec.g(this.c, ")", sb);
    }
}
