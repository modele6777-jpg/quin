package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yce {
    public final float a;
    public final float b;
    public final float c;

    public yce(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yce)) {
            return false;
        }
        yce yceVar = (yce) obj;
        return yi4.b(this.a, yceVar.a) && yi4.b(this.b, yceVar.b) && yi4.b(this.c, yceVar.c);
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + ub3.a(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TabPosition(left=");
        float f = this.a;
        sb.append((Object) yi4.c(f));
        sb.append(", right=");
        float f2 = this.b;
        sb.append((Object) yi4.c(f + f2));
        sb.append(", width=");
        sb.append((Object) yi4.c(f2));
        sb.append(", contentWidth=");
        sb.append((Object) yi4.c(this.c));
        sb.append(')');
        return sb.toString();
    }
}
