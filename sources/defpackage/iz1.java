package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class iz1 implements l26 {
    public final /* synthetic */ float a;
    public final /* synthetic */ xw9 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ dd2 d;
    public final /* synthetic */ long e;

    public iz1(float f, xw9 xw9Var, long j, dd2 dd2Var, long j2) {
        this.a = f;
        this.b = xw9Var;
        this.c = j;
        this.d = dd2Var;
        this.e = j2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        l46 l46Var = (l46) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
            fxd fxdVarZ = vpf.Z(t39.e, l46Var);
            fxd fxdVarZ2 = vpf.Z(t39.d, l46Var);
            fxd fxdVarZ3 = vpf.Z(t39.b, l46Var);
            fxd fxdVarZ4 = vpf.Z(t39.c, l46Var);
            float f = this.a;
            g09 g09Var = g09.a;
            j09 j09VarY = ynb.Y(b.b(0.0f, f, g09Var, 1), this.b);
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                objR = new mz1();
                l46Var.p0(objR);
            }
            mz1 mz1Var = (mz1) objR;
            int iW = an1.w(l46Var);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarY);
            lf2.q.getClass();
            l46Var.j0();
            boolean z = l46Var.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var, mz1Var);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var, u8aVarM);
            he2 he2Var3 = hj6.X;
            if (l46Var.S || !pa7.t(l46Var.R(), Integer.valueOf(iW))) {
                tec.r(iW, l46Var, iW, he2Var3);
            }
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var, j09VarJ);
            j09 j09VarE = vfh.E(g09Var, "leadingIcon");
            jx0 jx0Var = ndb.Y;
            m93.d(false, j09VarE, rw4.b(fxdVarZ3, jx0Var, 12).a(rw4.f(fxdVarZ, 2)), rw4.i(fxdVarZ4, jx0Var, 12).a(rw4.g(fxdVarZ2, 2)), null, af1.b0(687705959, new ib1(this.c, 7), l46Var), l46Var, 196656, 16);
            j09 j09VarE2 = vfh.E(g09Var, "label");
            bx9 bx9Var = kz1.a;
            j09 j09VarB0 = ynb.b0(8.0f, 0.0f, j09VarE2, 2);
            t7c t7cVarA = s7c.a(xc0.a, ndb.z, l46Var, 54);
            int iW2 = an1.w(l46Var);
            u8a u8aVarM2 = l46Var.m();
            j09 j09VarJ2 = m93.J(l46Var, j09VarB0);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var, l46Var, t7cVarA);
            dec.l(he2Var2, l46Var, u8aVarM2);
            if (l46Var.S || !pa7.t(l46Var.R(), Integer.valueOf(iW2))) {
                tec.r(iW2, l46Var, iW2, he2Var3);
            }
            dec.l(he2Var4, l46Var, j09VarJ2);
            tec.q(0, this.d, l46Var, true);
            j09 j09VarE3 = vfh.E(g09Var, "trailingIcon");
            jx0 jx0Var2 = ndb.E0;
            m93.d(false, j09VarE3, rw4.b(fxdVarZ3, jx0Var2, 12).a(rw4.f(fxdVarZ, 2)), rw4.i(fxdVarZ4, jx0Var2, 12).a(rw4.g(fxdVarZ2, 2)), null, af1.b0(1905252304, new ib1(this.e, 8), l46Var), l46Var, 196656, 16);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }
}
