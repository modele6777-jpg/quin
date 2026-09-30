package defpackage;

import coil3.compose.AsyncImagePainter;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lym2;", "Ls09;", "Lzm2;", "io.coil-kt.coil3:coil-compose-core"}, k = 1, mv = {2, 2, 0}, xi = z7c.f)
public final /* data */ class ym2 extends s09 {
    public final String X;
    public final sw6 a;
    public final aw6 b;
    public final vg0 c;
    public final a26 d;
    public final a26 e;
    public final int f;
    public final yi g;
    public final bn2 v;
    public final float w;
    public final c82 x;
    public final boolean y;
    public final ch0 z;

    public ym2(sw6 sw6Var, aw6 aw6Var, vg0 vg0Var, a26 a26Var, a26 a26Var2, int i, yi yiVar, bn2 bn2Var, float f, c82 c82Var, boolean z, ch0 ch0Var, String str) {
        this.a = sw6Var;
        this.b = aw6Var;
        this.c = vg0Var;
        this.d = a26Var;
        this.e = a26Var2;
        this.f = i;
        this.g = yiVar;
        this.v = bn2Var;
        this.w = f;
        this.x = c82Var;
        this.y = z;
        this.z = ch0Var;
        this.X = str;
    }

    @Override // defpackage.s09
    public final i09 create() {
        vg0 vg0Var = this.c;
        aw6 aw6Var = this.b;
        sw6 sw6Var = this.a;
        wg0 wg0Var = new wg0(aw6Var, sw6Var, vg0Var);
        AsyncImagePainter asyncImagePainter = new AsyncImagePainter(wg0Var);
        asyncImagePainter.X = this.d;
        asyncImagePainter.Y = this.e;
        asyncImagePainter.Z = this.v;
        asyncImagePainter.E0 = this.f;
        asyncImagePainter.F0 = this.z;
        asyncImagePainter.m(wg0Var);
        hld hldVar = sw6Var.o;
        return new zm2(asyncImagePainter, this.g, this.v, this.w, this.x, this.y, this.X, hldVar instanceof nl2 ? (nl2) hldVar : null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ym2)) {
            return false;
        }
        ym2 ym2Var = (ym2) obj;
        return this.a.equals(ym2Var.a) && pa7.t(this.b, ym2Var.b) && pa7.t(this.c, ym2Var.c) && pa7.t(this.d, ym2Var.d) && pa7.t(this.e, ym2Var.e) && this.f == ym2Var.f && pa7.t(this.g, ym2Var.g) && pa7.t(this.v, ym2Var.v) && Float.compare(this.w, ym2Var.w) == 0 && pa7.t(this.x, ym2Var.x) && this.y == ym2Var.y && pa7.t(this.z, ym2Var.z) && pa7.t(this.X, ym2Var.X);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        a26 a26Var = this.e;
        int iA = ub3.a(this.w, (this.v.hashCode() + ((this.g.hashCode() + ub3.b(this.f, (iHashCode + (a26Var == null ? 0 : a26Var.hashCode())) * 31, 31)) * 31)) * 31, 31);
        c82 c82Var = this.x;
        int iD = ub3.d((iA + (c82Var == null ? 0 : c82Var.hashCode())) * 31, 31, this.y);
        ch0 ch0Var = this.z;
        int iHashCode2 = (iD + (ch0Var == null ? 0 : ch0Var.hashCode())) * 31;
        String str = this.X;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        String str;
        int i = this.f;
        if (i == 0) {
            str = "None";
        } else if (i == 1) {
            str = "Low";
        } else if (i == 2) {
            str = "Medium";
        } else {
            str = i == 3 ? "High" : "Unknown";
        }
        StringBuilder sb = new StringBuilder("ContentPainterElement(request=");
        sb.append(this.a);
        sb.append(", imageLoader=");
        sb.append(this.b);
        sb.append(", modelEqualityDelegate=");
        sb.append(this.c);
        sb.append(", transform=");
        sb.append(this.d);
        sb.append(", onState=");
        sb.append(this.e);
        sb.append(", filterQuality=");
        sb.append(str);
        sb.append(", alignment=");
        sb.append(this.g);
        sb.append(", contentScale=");
        sb.append(this.v);
        sb.append(", alpha=");
        sb.append(this.w);
        sb.append(", colorFilter=");
        sb.append(this.x);
        sb.append(", clipToBounds=");
        sb.append(this.y);
        sb.append(", previewHandler=");
        sb.append(this.z);
        sb.append(", contentDescription=");
        return ks0.l(sb, this.X, ")");
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        zm2 zm2Var = (zm2) i09Var;
        long jI = zm2Var.K0.getE0();
        nl2 nl2Var = zm2Var.J0;
        vg0 vg0Var = this.c;
        aw6 aw6Var = this.b;
        sw6 sw6Var = this.a;
        wg0 wg0Var = new wg0(aw6Var, sw6Var, vg0Var);
        AsyncImagePainter asyncImagePainter = zm2Var.K0;
        asyncImagePainter.X = this.d;
        asyncImagePainter.Y = this.e;
        bn2 bn2Var = this.v;
        asyncImagePainter.Z = bn2Var;
        asyncImagePainter.E0 = this.f;
        asyncImagePainter.F0 = this.z;
        asyncImagePainter.m(wg0Var);
        boolean zA = ald.a(jI, asyncImagePainter.getE0());
        zm2Var.Z = this.g;
        hld hldVar = sw6Var.o;
        zm2Var.J0 = hldVar instanceof nl2 ? (nl2) hldVar : null;
        zm2Var.E0 = bn2Var;
        zm2Var.F0 = this.w;
        zm2Var.G0 = this.x;
        zm2Var.H0 = this.y;
        String str = zm2Var.I0;
        String str2 = this.X;
        if (!pa7.t(str, str2)) {
            zm2Var.I0 = str2;
            scc.k(zm2Var);
        }
        boolean zT = pa7.t(nl2Var, zm2Var.J0);
        if (!zA || !zT) {
            rs0.F(zm2Var);
        }
        qn4.G(zm2Var);
    }
}
