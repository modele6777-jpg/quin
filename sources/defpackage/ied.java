package defpackage;

import ai.askquin.ui.account.component.AuthOption;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ied implements n26 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ x16 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ied(long j, a26 a26Var, x16 x16Var) {
        this.b = j;
        this.d = a26Var;
        this.c = x16Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        wef wefVar = wef.a;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                a26 a26Var = (a26) obj4;
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                    l46Var.Z();
                } else {
                    d8c.g(this.b, null, a26Var, this.c, l46Var, 0, 0);
                }
                break;
            default:
                qmf qmfVar = (qmf) obj4;
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((c31) obj).getClass();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    l46Var2.Z();
                } else {
                    String string = qmfVar.g.d().c.toString();
                    AuthOption authOptionG = qmfVar.g();
                    boolean zBooleanValue = ((Boolean) qmfVar.f.getValue()).booleanValue();
                    boolean zI = l46Var2.i(qmfVar);
                    Object objR = l46Var2.R();
                    i8c i8cVar = sf2.a;
                    if (zI || objR == i8cVar) {
                        objR = new dne(1, qmfVar, qmf.class, "signInOrSignUp", "signInOrSignUp(Ljava/lang/String;)V", 0, 8);
                        l46Var2.p0(objR);
                    }
                    ym7 ym7Var = (ym7) objR;
                    boolean zI2 = l46Var2.i(qmfVar);
                    Object objR2 = l46Var2.R();
                    if (zI2 || objR2 == i8cVar) {
                        ihf ihfVar = new ihf(0, qmfVar, qmf.class, "resend", "resend()V", 0, 1);
                        l46Var2.p0(ihfVar);
                        objR2 = ihfVar;
                    }
                    ym7 ym7Var2 = (ym7) objR2;
                    boolean zI3 = l46Var2.i(qmfVar);
                    Object objR3 = l46Var2.R();
                    if (zI3 || objR3 == i8cVar) {
                        ihf ihfVar2 = new ihf(0, qmfVar, qmf.class, "resetCode", "resetCode()V", 0, 2);
                        l46Var2.p0(ihfVar2);
                        objR3 = ihfVar2;
                    }
                    o8c.b(string, authOptionG, this.b, zBooleanValue, (x16) ((ym7) objR3), (a26) ym7Var, (x16) ym7Var2, this.c, l46Var2, 0);
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ ied(qmf qmfVar, long j, x16 x16Var) {
        this.d = qmfVar;
        this.b = j;
        this.c = x16Var;
    }
}
