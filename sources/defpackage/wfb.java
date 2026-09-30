package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wfb {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final jhb f;
    public final String g;
    public final int h;
    public final int i;
    public final int j;
    public final boolean k;
    public final String l;
    public final int m;

    public wfb(String str, String str2, String str3, boolean z, boolean z2, jhb jhbVar, String str4, int i, int i2, int i3, boolean z3, String str5, int i4) {
        tec.x(str, str4, str5);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = jhbVar;
        this.g = str4;
        this.h = i;
        this.i = i2;
        this.j = i3;
        this.k = z3;
        this.l = str5;
        this.m = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wfb)) {
            return false;
        }
        wfb wfbVar = (wfb) obj;
        return pa7.t(this.a, wfbVar.a) && pa7.t(this.b, wfbVar.b) && pa7.t(this.c, wfbVar.c) && this.d == wfbVar.d && this.e == wfbVar.e && pa7.t(this.f, wfbVar.f) && pa7.t(this.g, wfbVar.g) && this.h == wfbVar.h && this.i == wfbVar.i && this.j == wfbVar.j && this.k == wfbVar.k && pa7.t(this.l, wfbVar.l) && this.m == wfbVar.m;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iD = ub3.d(ub3.d((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d), 31, this.e);
        jhb jhbVar = this.f;
        return Integer.hashCode(this.m) + ub3.c(ub3.d(ub3.b(this.j, ub3.b(this.i, ub3.b(this.h, ub3.c((iD + (jhbVar != null ? jhbVar.hashCode() : 0)) * 31, 31, this.g), 31), 31), 31), 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder sbO = ib8.o("ReadingInteractionSummary(entrySource=", this.a, ", readingScene=", this.b, ", fortuneType=");
        sbO.append(this.c);
        sbO.append(", questionEdited=");
        sbO.append(this.d);
        sbO.append(", questionInfoAdded=");
        sbO.append(this.e);
        sbO.append(", spreadSelection=");
        sbO.append(this.f);
        sbO.append(", deckId=");
        sbO.append(this.g);
        sbO.append(", shuffleCount=");
        sbO.append(this.h);
        sbO.append(", cutCount=");
        ub3.u(sbO, this.i, ", drawCount=", this.j, ", extraInfoAdded=");
        sbO.append(this.k);
        sbO.append(", exitStep=");
        sbO.append(this.l);
        sbO.append(", creditsConsumed=");
        return tec.g(this.m, ")", sbO);
    }
}
