package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t14 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aw2 b;
    public final /* synthetic */ gd8 c;

    public /* synthetic */ t14(aw2 aw2Var, gd8 gd8Var, int i) {
        this.a = i;
        this.b = aw2Var;
        this.c = gd8Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        i8c i8cVar = sf2.a;
        final gd8 gd8Var = this.c;
        final aw2 aw2Var = this.b;
        byte b = 0;
        final int i2 = 2;
        final int i3 = 1;
        l46 l46Var = (l46) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    boolean zI = l46Var.i(aw2Var) | l46Var.i(gd8Var);
                    Object objR = l46Var.R();
                    if (zI || objR == i8cVar) {
                        objR = new x16() { // from class: b14
                            @Override // defpackage.x16
                            public final Object invoke() {
                                int i4 = i3;
                                wef wefVar2 = wef.a;
                                gd8 gd8Var2 = gd8Var;
                                aw2 aw2Var2 = aw2Var;
                                switch (i4) {
                                    case 0:
                                        ynb.V(aw2Var2, null, null, new q54(gd8Var2, null), 3);
                                        break;
                                    case 1:
                                        ynb.V(aw2Var2, null, null, new p34(gd8Var2, null), 3);
                                        break;
                                    default:
                                        ynb.V(aw2Var2, null, null, new q34(gd8Var2, null), 3);
                                        break;
                                }
                                return wefVar2;
                            }
                        };
                        l46Var.p0(objR);
                    }
                    j74.n("Set", (x16) objR, l46Var, 6);
                    boolean zI2 = l46Var.i(aw2Var) | l46Var.i(gd8Var);
                    Object objR2 = l46Var.R();
                    if (zI2 || objR2 == i8cVar) {
                        objR2 = new x16() { // from class: b14
                            @Override // defpackage.x16
                            public final Object invoke() {
                                int i4 = i2;
                                wef wefVar2 = wef.a;
                                gd8 gd8Var2 = gd8Var;
                                aw2 aw2Var2 = aw2Var;
                                switch (i4) {
                                    case 0:
                                        ynb.V(aw2Var2, null, null, new q54(gd8Var2, null), 3);
                                        break;
                                    case 1:
                                        ynb.V(aw2Var2, null, null, new p34(gd8Var2, null), 3);
                                        break;
                                    default:
                                        ynb.V(aw2Var2, null, null, new q34(gd8Var2, null), 3);
                                        break;
                                }
                                return wefVar2;
                            }
                        };
                        l46Var.p0(objR2);
                    }
                    j74.n("Reset", (x16) objR2, l46Var, 6);
                }
                break;
            default:
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    boolean zI3 = l46Var.i(aw2Var) | l46Var.i(gd8Var);
                    Object objR3 = l46Var.R();
                    if (zI3 || objR3 == i8cVar) {
                        final byte b2 = b == true ? 1 : 0;
                        objR3 = new x16() { // from class: b14
                            @Override // defpackage.x16
                            public final Object invoke() {
                                int i4 = b2;
                                wef wefVar2 = wef.a;
                                gd8 gd8Var2 = gd8Var;
                                aw2 aw2Var2 = aw2Var;
                                switch (i4) {
                                    case 0:
                                        ynb.V(aw2Var2, null, null, new q54(gd8Var2, null), 3);
                                        break;
                                    case 1:
                                        ynb.V(aw2Var2, null, null, new p34(gd8Var2, null), 3);
                                        break;
                                    default:
                                        ynb.V(aw2Var2, null, null, new q34(gd8Var2, null), 3);
                                        break;
                                }
                                return wefVar2;
                            }
                        };
                        l46Var.p0(objR3);
                    }
                    j74.n("Reset", (x16) objR3, l46Var, 6);
                }
                break;
        }
        return wefVar;
    }
}
