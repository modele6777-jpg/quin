package defpackage;

import java.time.Instant;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vb4 implements nb4 {
    public final w5c a;
    public final yx4 b = new yx4(8);
    public final ssg d = new ssg(14);
    public final w84 c = new w84(3, new qb4(this), new rb4(this));

    public vb4(w5c w5cVar) {
        this.a = w5cVar;
    }

    public final Object e(String str, zn2 zn2Var) {
        return urg.K(zn2Var, new ob4(str, this, 1), this.a, true, false);
    }

    public final Object f(List list, Instant instant, zn2 zn2Var) {
        StringBuilder sbO = ub3.o("UPDATE divination SET deletedAt = ? WHERE id IN (");
        hfc.c(list.size(), sbO);
        sbO.append(")");
        Object objK = urg.K(zn2Var, new pb4(sbO.toString(), this, instant, list, 0), this.a, false, true);
        return objK == bw2.a ? objK : wef.a;
    }

    public final Object g(yc4 yc4Var, zn2 zn2Var) {
        Object objJ = urg.J(this.a, new ub4(this, yc4Var, null), zn2Var);
        return objJ == bw2.a ? objJ : wef.a;
    }
}
