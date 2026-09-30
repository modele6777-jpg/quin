package defpackage;

import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pe3 implements l26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ pe3(imb imbVar, long j, lmb lmbVar, yhb yhbVar, lmb lmbVar2, lmb lmbVar3, mmb mmbVar, mmb mmbVar2, mmb mmbVar3) {
        this.c = imbVar;
        this.b = j;
        this.d = lmbVar;
        this.e = yhbVar;
        this.f = lmbVar2;
        this.g = lmbVar3;
        this.v = mmbVar;
        this.w = mmbVar2;
        this.x = mmbVar3;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) throws IOException {
        int i = this.a;
        wef wefVar = wef.a;
        Object obj3 = this.x;
        Object obj4 = this.w;
        Object obj5 = this.v;
        Object obj6 = this.g;
        Object obj7 = this.f;
        Object obj8 = this.e;
        Object obj9 = this.d;
        Serializable serializable = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                vf3.c((Long) serializable, this.b, (a26) obj9, (a26) obj8, (j91) obj7, (z67) obj6, (ne3) obj5, (euc) obj4, (ke3) obj3, (l46) obj, k99.P(1));
                return wefVar;
            default:
                imb imbVar = (imb) serializable;
                lmb lmbVar = (lmb) obj9;
                yhb yhbVar = (yhb) obj8;
                lmb lmbVar2 = (lmb) obj7;
                lmb lmbVar3 = (lmb) obj6;
                mmb mmbVar = (mmb) obj5;
                mmb mmbVar2 = (mmb) obj4;
                mmb mmbVar3 = (mmb) obj3;
                int iIntValue = ((Integer) obj).intValue();
                long jLongValue = ((Long) obj2).longValue();
                if (iIntValue != 1) {
                    if (iIntValue != 10) {
                        return wefVar;
                    }
                    if (jLongValue >= 4) {
                        yhbVar.k0(4L);
                        gdc.l(yhbVar, (int) (jLongValue - 4), new tdg(mmbVar, yhbVar, mmbVar2, mmbVar3));
                        return wefVar;
                    }
                    yg5.m("bad zip: NTFS extra too short");
                } else if (imbVar.element) {
                    yg5.m("bad zip: zip64 extra repeated");
                } else {
                    imbVar.element = true;
                    if (jLongValue >= this.b) {
                        long jN = lmbVar.element;
                        if (jN == 4294967295L) {
                            jN = yhbVar.N();
                        }
                        lmbVar.element = jN;
                        lmbVar2.element = lmbVar2.element == 4294967295L ? yhbVar.N() : 0L;
                        lmbVar3.element = lmbVar3.element == 4294967295L ? yhbVar.N() : 0L;
                        return wefVar;
                    }
                    yg5.m("bad zip: zip64 extra too short");
                }
                return null;
        }
    }

    public /* synthetic */ pe3(Long l, long j, a26 a26Var, a26 a26Var2, j91 j91Var, z67 z67Var, ne3 ne3Var, euc eucVar, ke3 ke3Var, int i) {
        this.c = l;
        this.b = j;
        this.d = a26Var;
        this.e = a26Var2;
        this.f = j91Var;
        this.g = z67Var;
        this.v = ne3Var;
        this.w = eucVar;
        this.x = ke3Var;
    }
}
