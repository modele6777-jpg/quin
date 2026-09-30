package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class beg {
    public final float a;
    public final float b;

    public beg(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof beg)) {
            return false;
        }
        beg begVar = (beg) obj;
        return Float.compare(1.0f, 1.0f) == 0 && Float.compare(this.a, begVar.a) == 0 && Float.compare(this.b, begVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + ub3.a(this.a, Float.hashCode(1.0f) * 31, 31);
    }

    public final String toString() {
        return "ZoomValue(zoomRatio=1.0, minZoomRatio=" + this.a + ", maxZoomRatio=" + this.b + ')';
    }
}
