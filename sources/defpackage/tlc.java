package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tlc implements l26 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ zlc b;
    public final /* synthetic */ x16 c;
    public final /* synthetic */ a26 d;

    public /* synthetic */ tlc(zlc zlcVar, x16 x16Var, a26 a26Var) {
        this.b = zlcVar;
        this.c = x16Var;
        this.d = a26Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        a26 a26Var = this.d;
        x16 x16Var = this.c;
        zlc zlcVar = this.b;
        l46 l46Var = (l46) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int iIntValue = num.intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    vlc.c(zlcVar, x16Var, a26Var, l46Var, 0);
                }
                break;
            default:
                num.getClass();
                vlc.c(zlcVar, x16Var, a26Var, l46Var, k99.P(1));
                break;
        }
        return wefVar;
    }

    public /* synthetic */ tlc(zlc zlcVar, x16 x16Var, a26 a26Var, int i) {
        this.b = zlcVar;
        this.c = x16Var;
        this.d = a26Var;
    }
}
