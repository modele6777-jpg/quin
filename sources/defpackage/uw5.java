package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uw5 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uqc b;
    public final /* synthetic */ lsc c;
    public final /* synthetic */ xqc d;
    public final /* synthetic */ ka9 e;

    public /* synthetic */ uw5(uqc uqcVar, lsc lscVar, xqc xqcVar, ka9 ka9Var, int i) {
        this.a = i;
        this.b = uqcVar;
        this.c = lscVar;
        this.d = xqcVar;
        this.e = ka9Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        i8c i8cVar = sf2.a;
        ka9 ka9Var = this.e;
        lsc lscVar = this.c;
        uqc uqcVar = this.b;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(1 & iIntValue, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    boolean z = uqcVar.c;
                    kpb kpbVar = lscVar.c;
                    xqc xqcVar = this.d;
                    boolean zI = l46Var.i(xqcVar);
                    Object objR = l46Var.R();
                    if (zI || objR == i8cVar) {
                        uj3 uj3Var = new uj3(1, xqcVar, xqc.class, "onRelationshipStatusChanged", "onRelationshipStatusChanged(Lai/askquin/data/model/enums/RelationshipStatus;)V", 0, 15);
                        l46Var.p0(uj3Var);
                        objR = uj3Var;
                    }
                    a26 a26Var = (a26) ((ym7) objR);
                    boolean zI2 = l46Var.i(ka9Var);
                    Object objR2 = l46Var.R();
                    if (zI2 || objR2 == i8cVar) {
                        objR2 = new a40(ka9Var, 28);
                        l46Var.p0(objR2);
                    }
                    x16 x16Var = (x16) objR2;
                    boolean zI3 = l46Var.i(ka9Var);
                    Object objR3 = l46Var.R();
                    if (zI3 || objR3 == i8cVar) {
                        objR3 = new a40(ka9Var, 29);
                        l46Var.p0(objR3);
                    }
                    x16 x16Var2 = (x16) objR3;
                    boolean zI4 = l46Var.i(ka9Var);
                    Object objR4 = l46Var.R();
                    if (zI4 || objR4 == i8cVar) {
                        objR4 = new vw5(ka9Var, 0);
                        l46Var.p0(objR4);
                    }
                    a6c.b(z, kpbVar, a26Var, x16Var, x16Var2, (x16) objR4, l46Var, 0);
                }
                break;
            case 1:
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    l46Var2.Z();
                } else {
                    boolean z2 = uqcVar.c;
                    pu1 pu1Var = lscVar.b;
                    xqc xqcVar2 = this.d;
                    boolean zI5 = l46Var2.i(xqcVar2);
                    Object objR5 = l46Var2.R();
                    if (zI5 || objR5 == i8cVar) {
                        uj3 uj3Var2 = new uj3(1, xqcVar2, xqc.class, "onCareerChanged", "onCareerChanged(Lai/askquin/data/model/enums/Career;)V", 0, 14);
                        l46Var2.p0(uj3Var2);
                        objR5 = uj3Var2;
                    }
                    a26 a26Var2 = (a26) ((ym7) objR5);
                    boolean zI6 = l46Var2.i(ka9Var);
                    Object objR6 = l46Var2.R();
                    if (zI6 || objR6 == i8cVar) {
                        objR6 = new vw5(ka9Var, 1);
                        l46Var2.p0(objR6);
                    }
                    x16 x16Var3 = (x16) objR6;
                    boolean zI7 = l46Var2.i(ka9Var);
                    Object objR7 = l46Var2.R();
                    if (zI7 || objR7 == i8cVar) {
                        objR7 = new vw5(ka9Var, 2);
                        l46Var2.p0(objR7);
                    }
                    x16 x16Var4 = (x16) objR7;
                    boolean zI8 = l46Var2.i(ka9Var);
                    Object objR8 = l46Var2.R();
                    if (zI8 || objR8 == i8cVar) {
                        objR8 = new vw5(ka9Var, 3);
                        l46Var2.p0(objR8);
                    }
                    w6c.c(z2, pu1Var, a26Var2, x16Var3, x16Var4, (x16) objR8, l46Var2, 0);
                }
                break;
            default:
                l46 l46Var3 = (l46) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!l46Var3.W(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    l46Var3.Z();
                } else {
                    boolean z3 = uqcVar.c;
                    a56 a56Var = lscVar.a;
                    xqc xqcVar3 = this.d;
                    boolean zI9 = l46Var3.i(xqcVar3);
                    Object objR9 = l46Var3.R();
                    if (zI9 || objR9 == i8cVar) {
                        objR9 = new uj3(1, xqcVar3, xqc.class, "onGenderChanged", "onGenderChanged(Lai/askquin/data/model/enums/Gender;)V", 0, 13);
                        l46Var3.p0(objR9);
                    }
                    a26 a26Var3 = (a26) ((ym7) objR9);
                    boolean zI10 = l46Var3.i(ka9Var);
                    Object objR10 = l46Var3.R();
                    if (zI10 || objR10 == i8cVar) {
                        objR10 = new vw5(ka9Var, 4);
                        l46Var3.p0(objR10);
                    }
                    x16 x16Var5 = (x16) objR10;
                    boolean zI11 = l46Var3.i(ka9Var);
                    Object objR11 = l46Var3.R();
                    if (zI11 || objR11 == i8cVar) {
                        objR11 = new vw5(ka9Var, 5);
                        l46Var3.p0(objR11);
                    }
                    mxb.a(z3, a56Var, a26Var3, x16Var5, (x16) objR11, l46Var3, 0);
                }
                break;
        }
        return wefVar;
    }
}
