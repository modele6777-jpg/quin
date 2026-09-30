package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sw8 {
    public final gmd a;
    public final float b;
    public final boolean c;

    public /* synthetic */ sw8(gmd gmdVar, float f, int i) {
        this((i & 2) != 0 ? 0.0f : f, (i & 1) != 0 ? gmd.a : gmdVar, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sw8)) {
            return false;
        }
        sw8 sw8Var = (sw8) obj;
        return this.a == sw8Var.a && Float.compare(this.b, sw8Var.b) == 0 && this.c == sw8Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ub3.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MixedDeckDownload(state=");
        sb.append(this.a);
        sb.append(", progress=");
        sb.append(this.b);
        sb.append(", storageFull=");
        return ub3.m(sb, this.c, ")");
    }

    public sw8(float f, gmd gmdVar, boolean z) {
        gmdVar.getClass();
        this.a = gmdVar;
        this.b = f;
        this.c = z;
    }
}
