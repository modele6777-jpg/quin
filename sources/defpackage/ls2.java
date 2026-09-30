package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ls2 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e89 b;
    public final /* synthetic */ e89 c;

    public /* synthetic */ ls2(e89 e89Var, e89 e89Var2, int i) {
        this.a = i;
        this.b = e89Var;
        this.c = e89Var2;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        e89 e89Var = this.c;
        e89 e89Var2 = this.b;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                e89Var2.setValue(bool);
                if (zBooleanValue) {
                    e89Var.setValue(Boolean.FALSE);
                }
                return wefVar;
            case 1:
                ((ra4) obj).getClass();
                a26 a26Var = (a26) e89Var2.getValue();
                Boolean bool2 = (Boolean) e89Var.getValue();
                bool2.booleanValue();
                a26Var.d(bool2);
                return new d39(e89Var, e89Var2, 0);
            case 2:
                e83 e83Var = (e83) obj;
                e83Var.getClass();
                e89Var2.setValue(Boolean.valueOf(e83Var.a));
                e89Var.setValue(Boolean.valueOf(e83Var.b));
                return wefVar;
            case 3:
                e83 e83Var2 = (e83) obj;
                e83Var2.getClass();
                e89Var2.setValue(Boolean.valueOf(e83Var2.a));
                e89Var.setValue(Boolean.valueOf(e83Var2.b));
                return wefVar;
            case 4:
                Boolean bool3 = (Boolean) obj;
                boolean zBooleanValue2 = bool3.booleanValue();
                e89Var2.setValue(bool3);
                if (zBooleanValue2) {
                    e89Var.setValue(Boolean.TRUE);
                }
                return wefVar;
            case 5:
                bv7 bv7Var = (bv7) obj;
                bv7Var.getClass();
                hkb hkbVarM = vd0.M(bv7Var);
                e89Var2.setValue(Float.valueOf(hkbVarM.b));
                e89Var.setValue(Float.valueOf(hkbVarM.d));
                return wefVar;
            default:
                ((ra4) obj).getClass();
                a26 a26Var2 = (a26) e89Var2.getValue();
                if (a26Var2 != null) {
                    Boolean bool4 = (Boolean) e89Var.getValue();
                    bool4.booleanValue();
                    a26Var2.d(bool4);
                }
                return new d39(e89Var, e89Var2, 1);
        }
    }
}
