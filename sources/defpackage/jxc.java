package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.foundation.b;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jxc implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jxc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int iD0;
        int i = this.a;
        int i2 = 16;
        int i3 = 4;
        i8c i8cVar = sf2.a;
        wef wefVar = wef.a;
        int i4 = 2;
        boolean z = true;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((mxc) obj4).d();
                return wefVar;
            case 1:
                Context context = (Context) obj4;
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((en5) obj).getClass();
                if (l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                    String strQ = afc.q(R.string.settings_personal_info_collection, l46Var);
                    mue mueVar = pue.a;
                    mue mueVarG = pue.g(l46Var);
                    pr4 pr4Var = l8b.a;
                    mue mueVarA = mue.a(mueVarG, ((e8b) l46Var.k(pr4Var)).u, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214);
                    y6c y6cVarB = a7c.b(6.0f);
                    g09 g09Var = g09.a;
                    j09 j09VarE = oa7.E(g09Var, y6cVarB);
                    boolean zI = l46Var.i(context);
                    Object objR = l46Var.R();
                    if (zI || objR == i8cVar) {
                        objR = new y3d(context, i4);
                        l46Var.p0(objR);
                    }
                    nte.b(strQ, ynb.a0(b.c(j09VarE, false, null, null, (x16) objR, 15), 6.0f, 4.0f), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, mueVarA, l46Var, 0, 24576, 114684);
                    String strQ2 = afc.q(R.string.settings_third_party_sharing, l46Var);
                    mue mueVarA2 = mue.a(pue.g(l46Var), ((e8b) l46Var.k(pr4Var)).u, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214);
                    j09 j09VarE2 = oa7.E(g09Var, a7c.b(6.0f));
                    boolean zI2 = l46Var.i(context);
                    Object objR2 = l46Var.R();
                    if (zI2 || objR2 == i8cVar) {
                        objR2 = new y3d(context, 3);
                        l46Var.p0(objR2);
                    }
                    nte.b(strQ2, ynb.a0(b.c(j09VarE2, false, null, null, (x16) objR2, 15), 6.0f, 4.0f), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, mueVarA2, l46Var, 0, 24576, 114684);
                } else {
                    l46Var.Z();
                }
                return wefVar;
            case 2:
                Bitmap bitmap = (Bitmap) obj4;
                d92 d92Var = (d92) obj;
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                d92Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= l46Var2.g(d92Var) ? 4 : 2;
                }
                if (l46Var2.W(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    g09 g09Var2 = g09.a;
                    h7d.h(0, 0, l46Var2, ((e92) d92Var).b(ynb.d0(0.0f, 20.0f, 0.0f, 0.0f, 13, g09Var2), ndb.Z));
                    j09 j09VarZ = ynb.Z(tm7.o(ynb.a0(androidx.compose.foundation.layout.b.c(g09Var2, 1.0f), 20.0f, 20.0f), y72.b(y72.e, 0.2f), a7c.b(46.0f)), 12.0f);
                    xn8 xn8VarC = s21.c(ndb.b, false);
                    int iHashCode = Long.hashCode(l46Var2.T);
                    u8a u8aVarM = l46Var2.m();
                    j09 j09VarJ = m93.J(l46Var2, j09VarZ);
                    lf2.q.getClass();
                    l46Var2.j0();
                    if (l46Var2.S) {
                        l46Var2.l(LayoutNode.h1);
                    } else {
                        l46Var2.s0();
                    }
                    dec.l(hj6.z, l46Var2, xn8VarC);
                    dec.l(hj6.y, l46Var2, u8aVarM);
                    dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
                    dec.k(l46Var2);
                    dec.l(hj6.x, l46Var2, j09VarJ);
                    feg.k(new ks(bitmap), null, oa7.E(androidx.compose.foundation.layout.b.c(g09Var2, 1.0f), a7c.b(34.0f)), null, 0, l46Var2, 48, 248);
                    l46Var2.r(true);
                    h7d.g(ynb.d0(0.0f, 0.0f, 0.0f, 16.0f, 7, androidx.compose.foundation.layout.b.c(g09Var2, 1.0f)), 0L, 0, "screenshot", 0.0f, l46Var2, 3078, 22);
                } else {
                    l46Var2.Z();
                }
                return wefVar;
            case 3:
                gpd gpdVar = (gpd) obj4;
                zn8 zn8Var = (zn8) obj;
                cea ceaVarV = ((tn8) obj2).v(((kl2) obj3).a);
                if (yi4.b(Float.NaN, Float.NaN)) {
                    iD0 = gpdVar.l == ks9.a ? ceaVarV.a / 2 : ceaVarV.b / 2;
                } else {
                    iD0 = zn8Var.D0(Float.NaN);
                }
                return zn8Var.n0(ceaVarV.a, ceaVarV.b, bm8.G(new iy9(epd.f, Integer.valueOf(iD0))), new l1(ceaVarV, i2));
            case 4:
                ape apeVar = (ape) obj4;
                int iIntValue3 = ((Integer) obj).intValue();
                int iIntValue4 = ((Integer) obj2).intValue();
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                z2f z2fVar = apeVar.F0;
                vne vneVarD = zBooleanValue ? z2fVar.a.d() : z2fVar.d();
                long j = vneVarD.d;
                if (!apeVar.I0 || Math.min(iIntValue3, iIntValue4) < 0 || Math.max(iIntValue3, iIntValue4) > vneVarD.c.length()) {
                    z = false;
                } else {
                    int i5 = eue.c;
                    if (iIntValue3 != ((int) (j >> 32)) || iIntValue4 != ((int) (j & 4294967295L))) {
                        long jB = u3c.b(iIntValue3, iIntValue4);
                        if (zBooleanValue || iIntValue3 == iIntValue4) {
                            apeVar.H0.x(sue.a);
                        } else {
                            apeVar.H0.x(sue.c);
                        }
                        z2f z2fVar2 = apeVar.F0;
                        if (zBooleanValue) {
                            z2fVar2.k(jB);
                        } else {
                            z2fVar2.j(jB);
                        }
                    }
                }
                return Boolean.valueOf(z);
            default:
                cre creVar = (cre) obj4;
                j09 j09Var = (j09) obj;
                l46 l46Var3 = (l46) obj2;
                ((Integer) obj3).getClass();
                l46Var3.f0(1980580247);
                sw3 sw3Var = (sw3) l46Var3.k(zg2.h);
                Object objR3 = l46Var3.R();
                if (objR3 == i8cVar) {
                    objR3 = q1c.f(new e77(0L));
                    l46Var3.p0(objR3);
                }
                e89 e89Var = (e89) objR3;
                boolean zI3 = l46Var3.i(creVar);
                Object objR4 = l46Var3.R();
                if (zI3 || objR4 == i8cVar) {
                    objR4 = new ykc(22, creVar, e89Var);
                    l46Var3.p0(objR4);
                }
                x16 x16Var = (x16) objR4;
                boolean zG = l46Var3.g(sw3Var);
                Object objR5 = l46Var3.R();
                if (zG || objR5 == i8cVar) {
                    objR5 = new si3(sw3Var, e89Var, i3);
                    l46Var3.p0(objR5);
                }
                yz yzVar = xvc.a;
                j09 j09VarU = m93.u(j09Var, new s19(11, x16Var, (a26) objR5));
                l46Var3.r(false);
                return j09VarU;
        }
    }
}
