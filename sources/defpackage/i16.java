package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i16 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ a26 d;
    public final /* synthetic */ x16 e;
    public final /* synthetic */ j09 f;

    public /* synthetic */ i16(List list, a26 a26Var, boolean z, x16 x16Var, j09 j09Var, int i) {
        this.a = 2;
        this.b = list;
        this.d = a26Var;
        this.c = z;
        this.e = x16Var;
        this.f = j09Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                db6.h(k99.P(1), this.e, this.d, (l46) obj, this.f, this.b, this.c);
                break;
            case 1:
                ((Integer) obj2).getClass();
                db6.i(k99.P(1), this.e, this.d, (l46) obj, this.f, this.b, this.c);
                break;
            default:
                ((Integer) obj2).getClass();
                njb.c(k99.P(1), this.e, this.d, (l46) obj, this.f, this.b, this.c);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ i16(List list, boolean z, a26 a26Var, x16 x16Var, j09 j09Var, int i, int i2) {
        this.a = i2;
        this.b = list;
        this.c = z;
        this.d = a26Var;
        this.e = x16Var;
        this.f = j09Var;
    }
}
