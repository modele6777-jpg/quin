package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hmd {
    public final gmd a;
    public final float b;
    public final String c;

    public hmd(gmd gmdVar, float f, String str) {
        gmdVar.getClass();
        this.a = gmdVar;
        this.b = f;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hmd)) {
            return false;
        }
        hmd hmdVar = (hmd) obj;
        return this.a == hmdVar.a && Float.compare(this.b, hmdVar.b) == 0 && pa7.t(this.c, hmdVar.c);
    }

    public final int hashCode() {
        int iA = ub3.a(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SkinDownloadStatus(state=");
        sb.append(this.a);
        sb.append(", progress=");
        sb.append(this.b);
        sb.append(", errorMessage=");
        return ks0.l(sb, this.c, ")");
    }

    public /* synthetic */ hmd(gmd gmdVar, float f, int i) {
        this(gmdVar, (i & 2) != 0 ? 0.0f : f, (String) null);
    }
}
