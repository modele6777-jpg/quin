package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d8 implements l26 {
    public final /* synthetic */ Object E0;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ m26 Z;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ a26 b;
    public final /* synthetic */ x16 c;
    public final /* synthetic */ a26 d;
    public final /* synthetic */ x16 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ String w;
    public final /* synthetic */ int x;
    public final /* synthetic */ int y;
    public final /* synthetic */ int z;

    public /* synthetic */ d8(String str, yof yofVar, String str2, boolean z, boolean z2, boolean z3, a26 a26Var, a26 a26Var2, x16 x16Var, x16 x16Var2, x16 x16Var3, x16 x16Var4, int i, int i2, int i3) {
        this.w = str;
        this.Y = yofVar;
        this.X = str2;
        this.f = z;
        this.g = z2;
        this.v = z3;
        this.b = a26Var;
        this.d = a26Var2;
        this.c = x16Var;
        this.e = x16Var2;
        this.Z = x16Var3;
        this.E0 = x16Var4;
        this.x = i;
        this.y = i2;
        this.z = i3;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.y;
        Object obj3 = this.E0;
        m26 m26Var = this.Z;
        Object obj4 = this.Y;
        Object obj5 = this.X;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = k99.P(this.x | 1);
                int iP2 = k99.P(i2);
                x8.b(this.w, (yof) obj4, (String) obj5, this.f, this.g, this.v, this.b, this.d, this.c, this.e, (x16) m26Var, (x16) obj3, (l46) obj, iP, iP2, this.z);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP3 = k99.P(i2 | 1);
                vfh.i((List) obj5, (List) obj4, (l26) m26Var, this.b, this.c, this.d, (List) obj3, this.e, this.f, this.g, this.v, this.w, this.x, (l46) obj, iP3, this.z);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ d8(List list, List list2, l26 l26Var, a26 a26Var, x16 x16Var, a26 a26Var2, List list3, x16 x16Var2, boolean z, boolean z2, boolean z3, String str, int i, int i2, int i3) {
        this.X = list;
        this.Y = list2;
        this.Z = l26Var;
        this.b = a26Var;
        this.c = x16Var;
        this.d = a26Var2;
        this.E0 = list3;
        this.e = x16Var2;
        this.f = z;
        this.g = z2;
        this.v = z3;
        this.w = str;
        this.x = i;
        this.y = i2;
        this.z = i3;
    }
}
