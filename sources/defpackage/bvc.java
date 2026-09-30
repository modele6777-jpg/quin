package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bvc implements l26 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ owc b;
    public final /* synthetic */ dd2 c;
    public final /* synthetic */ fwc d;

    public /* synthetic */ bvc(fwc fwcVar, owc owcVar, dd2 dd2Var) {
        this.d = fwcVar;
        this.b = owcVar;
        this.c = dd2Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        fwc fwcVar = this.d;
        dd2 dd2Var = this.c;
        owc owcVar = this.b;
        l46 l46Var = (l46) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    ynb.d(fwcVar, af1.b0(201187952, new bvc(owcVar, dd2Var, fwcVar), l46Var), l46Var, 48);
                }
                break;
            default:
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    mh3.a(pwc.a.a(owcVar), af1.b0(1199015344, new fa2(dd2Var, fwcVar), l46Var), l46Var, 56);
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ bvc(owc owcVar, dd2 dd2Var, fwc fwcVar) {
        this.b = owcVar;
        this.c = dd2Var;
        this.d = fwcVar;
    }
}
