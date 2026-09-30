package defpackage;

import androidx.compose.foundation.layout.b;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yk6 implements l26 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ac4 b;
    public final /* synthetic */ a26 c;

    public yk6(ac4 ac4Var, a26 a26Var) {
        this.b = ac4Var;
        this.c = a26Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        i8c i8cVar = sf2.a;
        a26 a26Var = this.c;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    j09 j09VarS = b.s(b.c, ndb.g, 2);
                    boolean zG = l46Var.g(a26Var);
                    ac4 ac4Var = this.b;
                    boolean zI = zG | l46Var.i(ac4Var);
                    Object objR = l46Var.R();
                    if (zI || objR == i8cVar) {
                        objR = new kk6(a26Var, ac4Var, 1);
                        l46Var.p0(objR);
                    }
                    mxb.c(6, (x16) objR, l46Var, j09VarS);
                }
                break;
            default:
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    l46Var2.Z();
                } else {
                    boolean zG2 = l46Var2.g(a26Var);
                    ac4 ac4Var2 = this.b;
                    boolean zI2 = l46Var2.i(ac4Var2) | zG2;
                    Object objR2 = l46Var2.R();
                    if (zI2 || objR2 == i8cVar) {
                        objR2 = new kk6(a26Var, ac4Var2, 2);
                        l46Var2.p0(objR2);
                    }
                    jgb.A(null, ac4Var2, (x16) objR2, l46Var2, 64, 1);
                }
                break;
        }
        return wefVar;
    }

    public yk6(a26 a26Var, ac4 ac4Var) {
        this.c = a26Var;
        this.b = ac4Var;
    }
}
