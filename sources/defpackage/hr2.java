package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hr2 implements ir2 {
    public final String a;
    public final List b;
    public final String c;
    public final List d;
    public final String e;
    public final String f;

    public hr2(String str, String str2, String str3, String str4, List list, List list2) {
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = list2;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hr2)) {
            return false;
        }
        hr2 hr2Var = (hr2) obj;
        return this.a.equals(hr2Var.a) && this.b.equals(hr2Var.b) && this.c.equals(hr2Var.c) && this.d.equals(hr2Var.d) && pa7.t(this.e, hr2Var.e) && pa7.t(this.f, hr2Var.f);
    }

    public final int hashCode() {
        int iA = tec.a(ub3.c(tec.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SceneCategory(title=");
        sb.append(this.a);
        sb.append(", guessQuestions=");
        sb.append(this.b);
        sb.append(", pattern=");
        ib8.v(sb, this.c, ", patterns=", this.d, ", sceneId=");
        return ks0.m(sb, this.e, ", spreadId=", this.f, ")");
    }
}
