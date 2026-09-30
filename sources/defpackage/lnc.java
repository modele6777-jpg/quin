package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lnc implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x16 b;

    public /* synthetic */ lnc(int i, x16 x16Var) {
        this.a = i;
        this.b = x16Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        x16 x16Var = this.b;
        switch (i) {
            case 0:
                x16Var.invoke();
                return wefVar;
            case 1:
                return (hl9) x16Var.invoke();
            case 2:
                obj.getClass();
                return x16Var.invoke();
            case 3:
                ((Float) obj).floatValue();
                return Float.valueOf(((Number) x16Var.invoke()).floatValue());
            case 4:
                ((Boolean) obj).booleanValue();
                x16Var.invoke();
                return wefVar;
            case 5:
                ((Boolean) obj).booleanValue();
                x16Var.invoke();
                return wefVar;
            case 6:
                ((Boolean) obj).booleanValue();
                x16Var.invoke();
                return wefVar;
            case 7:
                return (hl9) x16Var.invoke();
            case 8:
                if (((Boolean) obj).booleanValue()) {
                    x16Var.invoke();
                }
                return wefVar;
            case 9:
                ((Boolean) obj).booleanValue();
                x16Var.invoke();
                return wefVar;
            default:
                ((Boolean) obj).booleanValue();
                x16Var.invoke();
                return wefVar;
        }
    }
}
