package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vu0 implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rf0 b;

    public /* synthetic */ vu0(rf0 rf0Var, int i) {
        this.a = i;
        this.b = rf0Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        i8c i8cVar = sf2.a;
        g09 g09Var = g09.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                c4c c4cVar = (c4c) obj;
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                c4cVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= l46Var.g(c4cVar) ? 4 : 2;
                }
                if (!l46Var.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                    l46Var.Z();
                } else {
                    Object objR = l46Var.R();
                    if (objR == i8cVar) {
                        objR = new wu0(0);
                        l46Var.p0(objR);
                    }
                    bzd.i(c4cVar, this.b, vwc.b(g09Var, false, (a26) objR), l46Var, iIntValue & 14, 0);
                }
                break;
            case 1:
                c4c c4cVar2 = (c4c) obj;
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                c4cVar2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= l46Var2.g(c4cVar2) ? 4 : 2;
                }
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    l46Var2.Z();
                } else {
                    Object objR2 = l46Var2.R();
                    if (objR2 == i8cVar) {
                        objR2 = new z8b(10);
                        l46Var2.p0(objR2);
                    }
                    oa7.k(c4cVar2, this.b, vwc.b(g09Var, false, (a26) objR2), l46Var2, iIntValue2 & 14, 0);
                }
                break;
            case 2:
                c4c c4cVar3 = (c4c) obj;
                l46 l46Var3 = (l46) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                c4cVar3.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= l46Var3.g(c4cVar3) ? 4 : 2;
                }
                if (!l46Var3.W(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    l46Var3.Z();
                } else {
                    xu0.a(c4cVar3, this.b, ndb.i1, l46Var3, (iIntValue3 & 14) | 384);
                }
                break;
            case 3:
                c4c c4cVar4 = (c4c) obj;
                l46 l46Var4 = (l46) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                c4cVar4.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= l46Var4.g(c4cVar4) ? 4 : 2;
                }
                if (!l46Var4.W(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    l46Var4.Z();
                } else {
                    oa7.k(c4cVar4, this.b, null, l46Var4, iIntValue4 & 14, 2);
                }
                break;
            case 4:
                c4c c4cVar5 = (c4c) obj;
                l46 l46Var5 = (l46) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                c4cVar5.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= l46Var5.g(c4cVar5) ? 4 : 2;
                }
                if (!l46Var5.W(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    l46Var5.Z();
                } else {
                    oa7.k(c4cVar5, this.b, null, l46Var5, iIntValue5 & 14, 2);
                }
                break;
            case 5:
                c4c c4cVar6 = (c4c) obj;
                l46 l46Var6 = (l46) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                c4cVar6.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= l46Var6.g(c4cVar6) ? 4 : 2;
                }
                if (!l46Var6.W(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    l46Var6.Z();
                } else {
                    bzd.i(c4cVar6, this.b, null, l46Var6, iIntValue6 & 14, 2);
                }
                break;
            default:
                c4c c4cVar7 = (c4c) obj;
                l46 l46Var7 = (l46) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                c4cVar7.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= l46Var7.g(c4cVar7) ? 4 : 2;
                }
                if (!l46Var7.W(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    l46Var7.Z();
                } else {
                    bzd.i(c4cVar7, this.b, null, l46Var7, iIntValue7 & 14, 2);
                }
                break;
        }
        return wefVar;
    }
}
