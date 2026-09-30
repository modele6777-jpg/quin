package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jaa {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;

    public jaa(String str, String str2, String str3, String str4, String str5, boolean z) {
        tec.x(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jaa)) {
            return false;
        }
        jaa jaaVar = (jaa) obj;
        return pa7.t(this.a, jaaVar.a) && pa7.t(this.b, jaaVar.b) && pa7.t(this.c, jaaVar.c) && this.d.equals(jaaVar.d) && this.e.equals(jaaVar.e) && this.f == jaaVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ub3.c(ub3.c(ub3.c(ub3.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbO = ib8.o("PersonalityAnalysisHistoryUiModel(id=", this.a, ", title=", this.b, ", description=");
        ub3.v(sbO, this.c, ", createAt=", this.d, ", updatedAt=");
        sbO.append(this.e);
        sbO.append(", isFinished=");
        sbO.append(this.f);
        sbO.append(")");
        return sbO.toString();
    }
}
