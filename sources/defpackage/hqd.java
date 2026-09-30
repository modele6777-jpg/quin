package defpackage;

import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hqd implements n26 {
    public final /* synthetic */ fqd a;
    public final /* synthetic */ fqd b;
    public final /* synthetic */ z95 c;
    public final /* synthetic */ String d;

    public hqd(fqd fqdVar, fqd fqdVar2, z95 z95Var, String str) {
        this.a = fqdVar;
        this.b = fqdVar2;
        this.c = z95Var;
        this.d = str;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        l26 l26Var = (l26) obj;
        l46 l46Var = (l46) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= l46Var.i(l26Var) ? 4 : 2;
        }
        if (l46Var.W(iIntValue & 1, (iIntValue & 19) != 18)) {
            fqd fqdVar = this.b;
            Object obj4 = this.a;
            boolean zT = pa7.t(obj4, fqdVar);
            fxd fxdVarZ = vpf.Z(t39.d, l46Var);
            boolean zG = l46Var.g(obj4);
            Object obj5 = this.c;
            boolean zI = zG | l46Var.i(obj5);
            Object objR = l46Var.R();
            Object obj6 = sf2.a;
            if (zI || objR == obj6) {
                objR = new ykc(12, obj4, obj5);
                l46Var.p0(objR);
            }
            x16 x16Var = (x16) objR;
            Object objR2 = l46Var.R();
            if (objR2 == obj6) {
                objR2 = qk2.d(!zT ? 1.0f : 0.0f);
                l46Var.p0(objR2);
            }
            jx jxVar = (jx) objR2;
            Boolean boolValueOf = Boolean.valueOf(zT);
            boolean zI2 = l46Var.i(jxVar) | l46Var.h(zT) | l46Var.i(fxdVarZ) | l46Var.g(x16Var);
            Object objR3 = l46Var.R();
            if (zI2 || objR3 == obj6) {
                Object jqdVar = new jqd(jxVar, zT, fxdVarZ, x16Var, null);
                l46Var.p0(jqdVar);
                objR3 = jqdVar;
            }
            af1.o((l26) objR3, l46Var, boolValueOf);
            wz wzVar = jxVar.c;
            fxd fxdVarZ2 = vpf.Z(t39.b, l46Var);
            Object objR4 = l46Var.R();
            if (objR4 == obj6) {
                objR4 = qk2.d(zT ? 0.8f : 1.0f);
                l46Var.p0(objR4);
            }
            jx jxVar2 = (jx) objR4;
            Boolean boolValueOf2 = Boolean.valueOf(zT);
            boolean zI3 = l46Var.i(jxVar2) | l46Var.h(zT) | l46Var.i(fxdVarZ2);
            Object objR5 = l46Var.R();
            if (zI3 || objR5 == obj6) {
                objR5 = new kqd(jxVar2, zT, fxdVarZ2, null);
                l46Var.p0(objR5);
            }
            af1.o((l26) objR5, l46Var, boolValueOf2);
            wz wzVar2 = jxVar2.c;
            j09 j09VarZ = bzd.z(g09.a, ((Number) wzVar2.b.getValue()).floatValue(), ((Number) wzVar2.b.getValue()).floatValue(), ((Number) wzVar.b.getValue()).floatValue(), 0.0f, null, 131064);
            boolean zH = l46Var.h(zT) | l46Var.g(obj4);
            Object obj7 = this.d;
            boolean zG2 = zH | l46Var.g(obj7);
            Object objR6 = l46Var.R();
            if (zG2 || objR6 == obj6) {
                objR6 = new so2(zT, obj7, obj4, 9);
                l46Var.p0(objR6);
            }
            j09 j09VarB = vwc.b(j09VarZ, false, (a26) objR6);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iW = an1.w(l46Var);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarB);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8VarC);
            dec.l(hj6.y, l46Var, u8aVarM);
            he2 he2Var = hj6.X;
            if (l46Var.S || !pa7.t(l46Var.R(), Integer.valueOf(iW))) {
                tec.r(iW, l46Var, iW, he2Var);
            }
            dec.l(hj6.x, l46Var, j09VarJ);
            l26Var.z(l46Var, Integer.valueOf(iIntValue & 14));
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }
}
