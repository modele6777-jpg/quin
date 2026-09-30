package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bo8 {
    public final int a;
    public final double b;
    public final List c;
    public final ste d;
    public final cea e;
    public final a26 f;
    public final a26 g;

    public bo8(int i, double d, List list, ste steVar, cea ceaVar, a26 a26Var, a26 a26Var2, int i2) {
        list = (i2 & 4) != 0 ? pu4.a : list;
        steVar = (i2 & 8) != 0 ? null : steVar;
        ceaVar = (i2 & 16) != 0 ? null : ceaVar;
        a26Var = (i2 & 32) != 0 ? null : a26Var;
        a26Var2 = (i2 & 64) != 0 ? null : a26Var2;
        this.a = i;
        this.b = d;
        this.c = list;
        this.d = steVar;
        this.e = ceaVar;
        this.f = a26Var;
        this.g = a26Var2;
    }

    public final void a(im2 im2Var) {
        b(im2Var, this.f);
        ste steVar = this.d;
        if (steVar != null) {
            v2c.r(im2Var, steVar, 0L, 254);
        }
        for (vna vnaVar : this.c) {
            ta0 ta0Var = ((vv7) im2Var).a.b;
            long jZ = ta0Var.z();
            ta0Var.p().g();
            try {
                ((vd9) ta0Var.c).I((float) vnaVar.b, (float) vnaVar.c);
                vnaVar.a.a(im2Var);
                ks0.t(ta0Var, jZ);
            } catch (Throwable th) {
                ks0.t(ta0Var, jZ);
                throw th;
            }
        }
    }

    public final void b(im2 im2Var, a26 a26Var) {
        if (a26Var == null) {
            return;
        }
        vv7 vv7Var = (vv7) im2Var;
        xl1 xl1Var = vv7Var.a;
        vw3 vw3Var = new vw3(xl1Var.getDensity(), xl1Var.h0());
        cv7 layoutDirection = vv7Var.getLayoutDirection();
        vl1 vl1VarP = xl1Var.b.p();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.a)) << 32) | (((long) Float.floatToRawIntBits((float) this.b)) & 4294967295L);
        sw3 sw3VarU = xl1Var.b.u();
        cv7 cv7VarW = xl1Var.b.w();
        vl1 vl1VarP2 = xl1Var.b.p();
        long jZ = xl1Var.b.z();
        ta0 ta0Var = xl1Var.b;
        ke6 ke6Var = (ke6) ta0Var.d;
        ta0Var.P(vw3Var);
        ta0Var.Q(layoutDirection);
        ta0Var.O(vl1VarP);
        ta0Var.R(jFloatToRawIntBits);
        ta0Var.d = null;
        vl1VarP.g();
        try {
            a26Var.d(im2Var);
        } finally {
            vl1VarP.o();
            ta0 ta0Var2 = xl1Var.b;
            ta0Var2.P(sw3VarU);
            ta0Var2.Q(cv7VarW);
            ta0Var2.O(vl1VarP2);
            ta0Var2.R(jZ);
            ta0Var2.d = ke6Var;
        }
    }

    public final void c(im2 im2Var) {
        for (vna vnaVar : this.c) {
            ta0 ta0Var = ((vv7) im2Var).a.b;
            long jZ = ta0Var.z();
            ta0Var.p().g();
            try {
                ((vd9) ta0Var.c).I((float) vnaVar.b, (float) vnaVar.c);
                vnaVar.a.c(im2Var);
                ks0.t(ta0Var, jZ);
            } catch (Throwable th) {
                ks0.t(ta0Var, jZ);
                throw th;
            }
        }
        b(im2Var, this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bo8)) {
            return false;
        }
        bo8 bo8Var = (bo8) obj;
        return this.a == bo8Var.a && Double.compare(this.b, bo8Var.b) == 0 && this.c.equals(bo8Var.c) && pa7.t(this.d, bo8Var.d) && pa7.t(this.e, bo8Var.e) && pa7.t(this.f, bo8Var.f) && pa7.t(this.g, bo8Var.g);
    }

    public final int hashCode() {
        int iA = tec.a((Double.hashCode(this.b) + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c);
        ste steVar = this.d;
        int iHashCode = (iA + (steVar == null ? 0 : steVar.hashCode())) * 31;
        cea ceaVar = this.e;
        int iHashCode2 = (iHashCode + (ceaVar == null ? 0 : ceaVar.hashCode())) * 31;
        a26 a26Var = this.f;
        int iHashCode3 = (iHashCode2 + (a26Var == null ? 0 : a26Var.hashCode())) * 31;
        a26 a26Var2 = this.g;
        return iHashCode3 + (a26Var2 != null ? a26Var2.hashCode() : 0);
    }

    public final String toString() {
        return "MeasuredShareDocumentNode(width=" + this.a + ", height=" + this.b + ", children=" + this.c + ", text=" + this.d + ", placeable=" + this.e + ", background=" + this.f + ", foreground=" + this.g + ")";
    }
}
