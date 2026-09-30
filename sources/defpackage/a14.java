package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a14 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gd8 b;

    public /* synthetic */ a14(gd8 gd8Var, int i) {
        this.a = i;
        this.b = gd8Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        i8c i8cVar = sf2.a;
        gd8 gd8Var = this.b;
        l46 l46Var = (l46) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    boolean zI = l46Var.i(gd8Var);
                    Object objR = l46Var.R();
                    if (zI || objR == i8cVar) {
                        objR = new e14(gd8Var, 4);
                        l46Var.p0(objR);
                    }
                    j74.n("Mark", (x16) objR, l46Var, 6);
                    boolean zI2 = l46Var.i(gd8Var);
                    Object objR2 = l46Var.R();
                    if (zI2 || objR2 == i8cVar) {
                        objR2 = new e14(gd8Var, 5);
                        l46Var.p0(objR2);
                    }
                    j74.n("Clear", (x16) objR2, l46Var, 6);
                }
                break;
            default:
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    Object objR3 = l46Var.R();
                    if (objR3 == i8cVar) {
                        objR3 = new vg3(19);
                        l46Var.p0(objR3);
                    }
                    j74.n("Month", (x16) objR3, l46Var, 54);
                    Object objR4 = l46Var.R();
                    if (objR4 == i8cVar) {
                        objR4 = new vg3(20);
                        l46Var.p0(objR4);
                    }
                    j74.n("Day", (x16) objR4, l46Var, 54);
                    Object objR5 = l46Var.R();
                    if (objR5 == i8cVar) {
                        objR5 = new vg3(21);
                        l46Var.p0(objR5);
                    }
                    j74.n("Both", (x16) objR5, l46Var, 54);
                    boolean zI3 = l46Var.i(gd8Var);
                    Object objR6 = l46Var.R();
                    if (zI3 || objR6 == i8cVar) {
                        objR6 = new e14(gd8Var, 3);
                        l46Var.p0(objR6);
                    }
                    j74.n("Reset", (x16) objR6, l46Var, 6);
                }
                break;
        }
        return wefVar;
    }
}
