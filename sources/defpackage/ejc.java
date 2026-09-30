package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ejc implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ j09 c;
    public final /* synthetic */ ii6 d;
    public final /* synthetic */ int e;

    public /* synthetic */ ejc(List list, j09 j09Var, ii6 ii6Var, int i, int i2, int i3) {
        this.a = i3;
        this.b = list;
        this.c = j09Var;
        this.d = ii6Var;
        this.e = i2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = k99.P(49);
                rrb.b(this.b, this.c, this.d, (l46) obj, iP, this.e);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP2 = k99.P(49);
                q7c.b(this.b, this.c, this.d, (l46) obj, iP2, this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP3 = k99.P(49);
                q7c.b(this.b, this.c, this.d, (l46) obj, iP3, this.e);
                break;
        }
        return wefVar;
    }
}
