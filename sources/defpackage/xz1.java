package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xz1 implements xj5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mmb b;
    public final /* synthetic */ gh6 c;

    public /* synthetic */ xz1(mmb mmbVar, gh6 gh6Var, int i) {
        this.a = i;
        this.b = mmbVar;
        this.c = gh6Var;
    }

    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        int i = this.a;
        wef wefVar = wef.a;
        hh6 hh6Var = hh6.d;
        gh6 gh6Var = this.c;
        mmb mmbVar = this.b;
        switch (i) {
            case 0:
                int iFloatValue = (int) (((Number) obj).floatValue() / 1.8f);
                Object obj2 = mmbVar.element;
                if (obj2 != null && iFloatValue != ((Integer) obj2).intValue()) {
                    gh6Var.b(hh6Var);
                }
                mmbVar.element = new Integer(iFloatValue);
                break;
            default:
                int iFloatValue2 = (int) (((Number) obj).floatValue() / 1.8f);
                Object obj3 = mmbVar.element;
                if (obj3 != null && iFloatValue2 != ((Integer) obj3).intValue()) {
                    gh6Var.b(hh6Var);
                }
                mmbVar.element = new Integer(iFloatValue2);
                break;
        }
        return wefVar;
    }
}
