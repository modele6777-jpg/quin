package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
public final class gva {
    public static final fva Companion = new fva();
    public final int a;
    public final String b;

    public /* synthetic */ gva(int i, int i2, String str) {
        if (3 != (i & 3)) {
            an1.R(i, 3, eva.a.e());
            throw null;
        }
        this.a = i2;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gva)) {
            return false;
        }
        gva gvaVar = (gva) obj;
        return this.a == gvaVar.a && pa7.t(this.b, gvaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessData(pid=");
        sb.append(this.a);
        sb.append(", uuid=");
        return ub3.l(sb, this.b, ')');
    }

    public gva(int i, String str) {
        str.getClass();
        this.a = i;
        this.b = str;
    }
}
