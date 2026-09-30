package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nvd implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ dvd c;
    public final /* synthetic */ suc d;
    public final /* synthetic */ a26 e;

    public /* synthetic */ nvd(float f, dvd dvdVar, suc sucVar, a26 a26Var, int i) {
        this.a = i;
        this.b = f;
        this.c = dvdVar;
        this.d = sucVar;
        this.e = a26Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                    l46Var.Z();
                } else {
                    float f = this.b;
                    g09 g09Var = g09.a;
                    nte.b(afc.q(R.string.divintation_spread_recommend, l46Var), ynb.b0(f, 0.0f, g09Var, 2), 0L, w6c.l(17), ar5.d, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var, 1597440, 0, 262060);
                    o5c.f(l46Var, b.d(g09Var, 12.0f));
                    dvd dvdVar = this.c;
                    boolean z = dvdVar instanceof ale;
                    suc sucVar = this.d;
                    a26 a26Var = this.e;
                    i8c i8cVar = sf2.a;
                    if (!z) {
                        l46Var.f0(118597233);
                        boolean z2 = sucVar == null;
                        boolean zG = l46Var.g(a26Var);
                        Object objR = l46Var.R();
                        if (zG || objR == i8cVar) {
                            objR = new a5b(a26Var, 9);
                            l46Var.p0(objR);
                        }
                        q7c.d(null, dvdVar, z2, (x16) objR, l46Var, 0);
                        l46Var.r(false);
                    } else {
                        l46Var.f0(118326603);
                        ale aleVar = (ale) dvdVar;
                        boolean z3 = sucVar == null;
                        boolean zG2 = l46Var.g(a26Var);
                        Object objR2 = l46Var.R();
                        if (zG2 || objR2 == i8cVar) {
                            objR2 = new a5b(a26Var, 8);
                            l46Var.p0(objR2);
                        }
                        q7c.e(null, aleVar, true, 0, false, z3, (x16) objR2, l46Var, 3072, 53);
                        l46Var.r(false);
                    }
                }
                break;
            default:
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((mx7) obj).getClass();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    l46Var2.Z();
                } else {
                    jgb.C(null, false, null, af1.b0(133937853, new nvd(this.b, this.c, this.d, this.e, 0), l46Var2), l46Var2, 3072, 7);
                }
                break;
        }
        return wefVar;
    }
}
