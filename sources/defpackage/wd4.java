package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wd4 implements xd4 {
    public final String a;
    public final List b;
    public final String c;

    public wd4(String str, List list, String str2) {
        this.a = str;
        this.b = list;
        this.c = str2;
    }

    @Override // defpackage.xd4
    public final List a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wd4)) {
            return false;
        }
        wd4 wd4Var = (wd4) obj;
        return this.a.equals(wd4Var.a) && this.b.equals(wd4Var.b) && pa7.t(this.c, wd4Var.c);
    }

    public final int hashCode() {
        int iA = tec.a(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Scene(pattern=");
        sb.append(this.a);
        sb.append(", patternData=");
        sb.append(this.b);
        sb.append(", spreadId=");
        return ks0.l(sb, this.c, ")");
    }
}
