package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vma {
    public final boolean a;
    public final String b;
    public final String c;

    public vma(String str, String str2, boolean z) {
        this.a = z;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vma)) {
            return false;
        }
        vma vmaVar = (vma) obj;
        return this.a == vmaVar.a && this.b.equals(vmaVar.b) && pa7.t(this.c, vmaVar.c);
    }

    public final int hashCode() {
        int iC = ub3.c(Boolean.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdatePopup(canCancel=");
        sb.append(this.a);
        sb.append(", link=");
        sb.append(this.b);
        sb.append(", content=");
        return ks0.l(sb, this.c, ")");
    }
}
