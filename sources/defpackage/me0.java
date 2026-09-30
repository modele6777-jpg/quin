package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class me0 implements l26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ float f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    public /* synthetic */ me0(z63 z63Var, String str, boolean z, boolean z2, boolean z3, float f, j09 j09Var, int i) {
        this.v = z63Var;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = f;
        this.w = j09Var;
        this.g = i;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.g;
        Object obj3 = this.w;
        Object obj4 = this.v;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = k99.P(i2 | 1);
                ynb.b(this.c, this.f, (List) obj4, this.b, this.d, this.e, (x16) obj3, (l46) obj, iP);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP2 = k99.P(i2 | 1);
                no6.f((z63) obj4, this.b, this.c, this.d, this.e, this.f, (j09) obj3, (l46) obj, iP2);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ me0(boolean z, float f, List list, String str, boolean z2, boolean z3, x16 x16Var, int i) {
        this.c = z;
        this.f = f;
        this.v = list;
        this.b = str;
        this.d = z2;
        this.e = z3;
        this.w = x16Var;
        this.g = i;
    }
}
