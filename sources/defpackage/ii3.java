package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ii3 implements l26 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ j09 c;
    public final /* synthetic */ x16 d;

    public /* synthetic */ ii3(x16 x16Var, boolean z, j09 j09Var, int i) {
        this.d = x16Var;
        this.b = z;
        this.c = j09Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        j09 j09Var = this.c;
        boolean z = this.b;
        x16 x16Var = this.d;
        l46 l46Var = (l46) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                xj3.a(k99.P(1), x16Var, l46Var, j09Var, z);
                break;
            case 1:
                x57.h(k99.P(1), x16Var, l46Var, j09Var, z);
                break;
            default:
                i3g.d(k99.P(1), x16Var, l46Var, j09Var, z);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ ii3(boolean z, x16 x16Var, j09 j09Var, int i) {
        this.b = z;
        this.d = x16Var;
        this.c = j09Var;
    }

    public /* synthetic */ ii3(boolean z, j09 j09Var, x16 x16Var, int i) {
        this.b = z;
        this.c = j09Var;
        this.d = x16Var;
    }
}
