package defpackage;

import androidx.compose.foundation.layout.b;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mp1 implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ die b;
    public final /* synthetic */ fy9 c;
    public final /* synthetic */ e89 d;

    public /* synthetic */ mp1(die dieVar, fy9 fy9Var, e89 e89Var, int i) {
        this.a = i;
        this.b = dieVar;
        this.c = fy9Var;
        this.d = e89Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        wef wefVar = wef.a;
        e89 e89Var = this.d;
        fy9 fy9Var = this.c;
        die dieVar = this.b;
        byte b = 0;
        switch (i) {
            case 0:
                sdd sddVar = (sdd) obj;
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                sddVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= l46Var.g(sddVar) ? 4 : 2;
                }
                if (!l46Var.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                    l46Var.Z();
                } else {
                    mh3.a(snd.a.a(dieVar), af1.b0(1726551382, new x6(fy9Var, sddVar, e89Var, 9), l46Var), l46Var, 56);
                }
                break;
            default:
                xw9 xw9Var = (xw9) obj;
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                xw9Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= l46Var2.g(xw9Var) ? 4 : 2;
                }
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    l46Var2.Z();
                } else {
                    ded.a(ynb.Y(b.c, xw9Var), af1.b0(-992444266, new mp1(dieVar, fy9Var, e89Var, b == true ? 1 : 0), l46Var2), l46Var2, 48, 0);
                }
                break;
        }
        return wefVar;
    }
}
