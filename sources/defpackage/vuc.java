package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vuc {
    public final uuc a;
    public final uuc b;
    public final boolean c;

    public vuc(uuc uucVar, uuc uucVar2, boolean z) {
        this.a = uucVar;
        this.b = uucVar2;
        this.c = z;
    }

    public static vuc a(vuc vucVar, uuc uucVar, uuc uucVar2, boolean z, int i) {
        if ((i & 1) != 0) {
            uucVar = vucVar.a;
        }
        if ((i & 2) != 0) {
            uucVar2 = vucVar.b;
        }
        if ((i & 4) != 0) {
            z = vucVar.c;
        }
        vucVar.getClass();
        return new vuc(uucVar, uucVar2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vuc)) {
            return false;
        }
        vuc vucVar = (vuc) obj;
        return pa7.t(this.a, vucVar.a) && pa7.t(this.b, vucVar.b) && this.c == vucVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Selection(start=");
        sb.append(this.a);
        sb.append(", end=");
        sb.append(this.b);
        sb.append(", handlesCrossed=");
        return ub3.m(sb, this.c, ")");
    }
}
