package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class o4c {
    public static final o4c i = new o4c(null, null, null, null, null, null, null, null);
    public final wue a;
    public final l26 b;
    public final h88 c;
    public final f01 d;
    public final t62 e;
    public final ude f;
    public final s27 g;
    public final n4c h;

    public o4c(wue wueVar, l26 l26Var, h88 h88Var, f01 f01Var, t62 t62Var, ude udeVar, s27 s27Var, n4c n4cVar) {
        this.a = wueVar;
        this.b = l26Var;
        this.c = h88Var;
        this.d = f01Var;
        this.e = t62Var;
        this.f = udeVar;
        this.g = s27Var;
        this.h = n4cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4c)) {
            return false;
        }
        o4c o4cVar = (o4c) obj;
        return pa7.t(this.a, o4cVar.a) && pa7.t(this.b, o4cVar.b) && pa7.t(this.c, o4cVar.c) && pa7.t(this.d, o4cVar.d) && pa7.t(this.e, o4cVar.e) && pa7.t(this.f, o4cVar.f) && pa7.t(this.g, o4cVar.g) && pa7.t(this.h, o4cVar.h);
    }

    public final int hashCode() {
        wue wueVar = this.a;
        int iHashCode = (wueVar == null ? 0 : Long.hashCode(wueVar.a)) * 31;
        l26 l26Var = this.b;
        int iHashCode2 = (iHashCode + (l26Var == null ? 0 : l26Var.hashCode())) * 31;
        h88 h88Var = this.c;
        int iHashCode3 = (iHashCode2 + (h88Var == null ? 0 : h88Var.hashCode())) * 31;
        f01 f01Var = this.d;
        int iHashCode4 = (iHashCode3 + (f01Var == null ? 0 : f01Var.hashCode())) * 31;
        t62 t62Var = this.e;
        int iHashCode5 = (iHashCode4 + (t62Var == null ? 0 : t62Var.hashCode())) * 31;
        ude udeVar = this.f;
        int iHashCode6 = (iHashCode5 + (udeVar == null ? 0 : udeVar.hashCode())) * 31;
        s27 s27Var = this.g;
        int iHashCode7 = (iHashCode6 + (s27Var == null ? 0 : s27Var.hashCode())) * 31;
        n4c n4cVar = this.h;
        return iHashCode7 + (n4cVar != null ? n4cVar.hashCode() : 0);
    }

    public final String toString() {
        return "RichTextStyle(paragraphSpacing=" + this.a + ", headingStyle=" + this.b + ", listStyle=" + this.c + ", blockQuoteGutter=" + this.d + ", codeBlockStyle=" + this.e + ", tableStyle=" + this.f + ", infoPanelStyle=" + this.g + ", stringStyle=" + this.h + ")";
    }
}
