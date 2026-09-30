package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f14 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ eab b;

    public /* synthetic */ f14(eab eabVar, int i) {
        this.a = i;
        this.b = eabVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        i8c i8cVar = sf2.a;
        eab eabVar = this.b;
        l46 l46Var = (l46) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    boolean zI = l46Var.i(eabVar);
                    Object objR = l46Var.R();
                    if (zI || objR == i8cVar) {
                        objR = new d14(eabVar, 22);
                        l46Var.p0(objR);
                    }
                    j74.n("还原", (x16) objR, l46Var, 6);
                    boolean zI2 = l46Var.i(eabVar);
                    Object objR2 = l46Var.R();
                    if (zI2 || objR2 == i8cVar) {
                        objR2 = new d14(eabVar, 23);
                        l46Var.p0(objR2);
                    }
                    j74.n("Basic", (x16) objR2, l46Var, 6);
                    boolean zI3 = l46Var.i(eabVar);
                    Object objR3 = l46Var.R();
                    if (zI3 || objR3 == i8cVar) {
                        objR3 = new d14(eabVar, 24);
                        l46Var.p0(objR3);
                    }
                    j74.n("Pro", (x16) objR3, l46Var, 6);
                    boolean zI4 = l46Var.i(eabVar);
                    Object objR4 = l46Var.R();
                    if (zI4 || objR4 == i8cVar) {
                        objR4 = new d14(eabVar, 25);
                        l46Var.p0(objR4);
                    }
                    j74.n("Max", (x16) objR4, l46Var, 6);
                    boolean zI5 = l46Var.i(eabVar);
                    Object objR5 = l46Var.R();
                    if (zI5 || objR5 == i8cVar) {
                        objR5 = new d14(eabVar, 26);
                        l46Var.p0(objR5);
                    }
                    j74.n("v4Y", (x16) objR5, l46Var, 6);
                    boolean zI6 = l46Var.i(eabVar);
                    Object objR6 = l46Var.R();
                    if (zI6 || objR6 == i8cVar) {
                        objR6 = new d14(eabVar, 27);
                        l46Var.p0(objR6);
                    }
                    j74.n("v4M", (x16) objR6, l46Var, 6);
                }
                break;
            default:
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    boolean zI7 = l46Var.i(eabVar);
                    Object objR7 = l46Var.R();
                    if (zI7 || objR7 == i8cVar) {
                        objR7 = new d14(eabVar, 0);
                        l46Var.p0(objR7);
                    }
                    j74.n("普通用户·追问需升级", (x16) objR7, l46Var, 6);
                    boolean zI8 = l46Var.i(eabVar);
                    Object objR8 = l46Var.R();
                    if (zI8 || objR8 == i8cVar) {
                        objR8 = new d14(eabVar, 5);
                        l46Var.p0(objR8);
                    }
                    j74.n("纯次卡", (x16) objR8, l46Var, 6);
                    boolean zI9 = l46Var.i(eabVar);
                    Object objR9 = l46Var.R();
                    if (zI9 || objR9 == i8cVar) {
                        objR9 = new d14(eabVar, 6);
                        l46Var.p0(objR9);
                    }
                    j74.n("月卡", (x16) objR9, l46Var, 6);
                    boolean zI10 = l46Var.i(eabVar);
                    Object objR10 = l46Var.R();
                    if (zI10 || objR10 == i8cVar) {
                        objR10 = new d14(eabVar, 7);
                        l46Var.p0(objR10);
                    }
                    j74.n("月卡·免费次数先用", (x16) objR10, l46Var, 6);
                    boolean zI11 = l46Var.i(eabVar);
                    Object objR11 = l46Var.R();
                    if (zI11 || objR11 == i8cVar) {
                        objR11 = new d14(eabVar, 8);
                        l46Var.p0(objR11);
                    }
                    j74.n("年卡", (x16) objR11, l46Var, 6);
                    boolean zI12 = l46Var.i(eabVar);
                    Object objR12 = l46Var.R();
                    if (zI12 || objR12 == i8cVar) {
                        objR12 = new d14(eabVar, 9);
                        l46Var.p0(objR12);
                    }
                    j74.n("周卡", (x16) objR12, l46Var, 6);
                    boolean zI13 = l46Var.i(eabVar);
                    Object objR13 = l46Var.R();
                    if (zI13 || objR13 == i8cVar) {
                        objR13 = new d14(eabVar, 10);
                        l46Var.p0(objR13);
                    }
                    j74.n("混合·次卡先用", (x16) objR13, l46Var, 6);
                    boolean zI14 = l46Var.i(eabVar);
                    Object objR14 = l46Var.R();
                    if (zI14 || objR14 == i8cVar) {
                        objR14 = new d14(eabVar, 11);
                        l46Var.p0(objR14);
                    }
                    j74.n("混合·额度先用", (x16) objR14, l46Var, 6);
                    boolean zI15 = l46Var.i(eabVar);
                    Object objR15 = l46Var.R();
                    if (zI15 || objR15 == i8cVar) {
                        objR15 = new d14(eabVar, 12);
                        l46Var.p0(objR15);
                    }
                    j74.n("额度已用50%·转待用", (x16) objR15, l46Var, 6);
                    boolean zI16 = l46Var.i(eabVar);
                    Object objR16 = l46Var.R();
                    if (zI16 || objR16 == i8cVar) {
                        objR16 = new d14(eabVar, 13);
                        l46Var.p0(objR16);
                    }
                    j74.n("非订阅·次数先扣", (x16) objR16, l46Var, 6);
                    boolean zI17 = l46Var.i(eabVar);
                    Object objR17 = l46Var.R();
                    if (zI17 || objR17 == i8cVar) {
                        objR17 = new d14(eabVar, 1);
                        l46Var.p0(objR17);
                    }
                    j74.n("非订阅·Usage先扣", (x16) objR17, l46Var, 6);
                    boolean zI18 = l46Var.i(eabVar);
                    Object objR18 = l46Var.R();
                    if (zI18 || objR18 == i8cVar) {
                        objR18 = new d14(eabVar, 2);
                        l46Var.p0(objR18);
                    }
                    j74.n("订阅过期·追问需续订", (x16) objR18, l46Var, 6);
                    boolean zI19 = l46Var.i(eabVar);
                    Object objR19 = l46Var.R();
                    if (zI19 || objR19 == i8cVar) {
                        objR19 = new d14(eabVar, 3);
                        l46Var.p0(objR19);
                    }
                    j74.n("仅补给·额度为0", (x16) objR19, l46Var, 6);
                    boolean zI20 = l46Var.i(eabVar);
                    Object objR20 = l46Var.R();
                    if (zI20 || objR20 == i8cVar) {
                        objR20 = new d14(eabVar, 4);
                        l46Var.p0(objR20);
                    }
                    j74.n("会员·其他均已用完", (x16) objR20, l46Var, 6);
                }
                break;
        }
        return wefVar;
    }
}
