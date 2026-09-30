package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xpe implements ype {
    public final int a;
    public final int b;

    public xpe(int i, int i2) {
        int i3 = (i2 & 1) != 0 ? 1 : 4;
        i = (i2 & 2) != 0 ? Integer.MAX_VALUE : i;
        this.a = i3;
        this.b = i;
        if (i3 <= i) {
            return;
        }
        l37.a("Expected 1 ≤ minHeightInLines ≤ maxHeightInLines, were " + i3 + ", " + i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xpe.class != obj.getClass()) {
            return false;
        }
        xpe xpeVar = (xpe) obj;
        return this.a == xpeVar.a && this.b == xpeVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return kv2.h(this.a, this.b, "MultiLine(minHeightInLines=", ", maxHeightInLines=", ")");
    }
}
