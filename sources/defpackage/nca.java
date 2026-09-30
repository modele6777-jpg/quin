package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nca implements n26 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ List b;
    public final /* synthetic */ e89 c;
    public final /* synthetic */ e89 d;

    public /* synthetic */ nca(e89 e89Var, e89 e89Var2, List list) {
        this.c = e89Var;
        this.d = e89Var2;
        this.b = list;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        wef wefVar = wef.a;
        Object obj4 = sf2.a;
        e89 e89Var = this.d;
        e89 e89Var2 = this.c;
        List<String> list = this.b;
        switch (i) {
            case 0:
                y75 y75Var = (y75) obj;
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                y75Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? l46Var.g(y75Var) : l46Var.i(y75Var) ? 4 : 2;
                }
                if (l46Var.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                    nte.b((String) e89Var2.getValue(), ynb.d0(24.0f, 0.0f, 12.0f, 0.0f, 10, g09.a), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var, 48, 0, 262140);
                    boolean zBooleanValue = ((Boolean) e89Var.getValue()).booleanValue();
                    Object objR = l46Var.R();
                    if (objR == obj4) {
                        objR = new x08(e89Var, 23);
                        l46Var.p0(objR);
                    }
                    y75Var.a(zBooleanValue, (x16) objR, null, null, false, null, 0L, 0.0f, af1.b0(1686855494, new nca(list, e89Var2, e89Var), l46Var), l46Var, 48, 6 | ((iIntValue << 3) & 112));
                } else {
                    l46Var.Z();
                }
                break;
            default:
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (l46Var2.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    for (String str : list) {
                        dd2 dd2VarB0 = af1.b0(255075782, new o8(str, 22), l46Var2);
                        boolean zG = l46Var2.g(str);
                        Object objR2 = l46Var2.R();
                        if (zG || objR2 == obj4) {
                            objR2 = new n25(str, e89Var2, e89Var, 24);
                            l46Var2.p0(objR2);
                        }
                        mt.b(dd2VarB0, (x16) objR2, null, false, null, null, l46Var2, 6);
                    }
                } else {
                    l46Var2.Z();
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ nca(List list, e89 e89Var, e89 e89Var2) {
        this.b = list;
        this.c = e89Var;
        this.d = e89Var2;
    }
}
