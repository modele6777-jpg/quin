package defpackage;

import java.util.List;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zs1 implements l26 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ j09 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ float d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ zs1(j09 j09Var, sp1 sp1Var, boolean z, bn2 bn2Var, float f, yi yiVar, fy9 fy9Var, Integer num, int i, int i2) {
        this.b = j09Var;
        this.g = sp1Var;
        this.c = z;
        this.v = bn2Var;
        this.d = f;
        this.w = yiVar;
        this.x = fy9Var;
        this.y = num;
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.e;
        Object obj3 = this.y;
        Object obj4 = this.x;
        Object obj5 = this.w;
        Object obj6 = this.v;
        Object obj7 = this.g;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = k99.P(i2 | 1);
                dt1.a(this.b, (sp1) obj7, this.c, (bn2) obj6, this.d, (yi) obj5, (fy9) obj4, (Integer) obj3, (l46) obj, iP, this.f);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP2 = k99.P(i2 | 1);
                b21.d(this.b, (TarotCardChoice) obj7, this.c, (j09) obj6, (a26) obj5, this.d, (mue) obj4, (y72) obj3, (l46) obj, iP2, this.f);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iP3 = k99.P(i2 | 1);
                z7c.c(this.b, (dvd) obj7, (List) obj6, this.c, (suc) obj5, this.d, (a26) obj4, (a26) obj3, (l46) obj, iP3, this.f);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP4 = k99.P(i2 | 1);
                vtb.a((String) obj7, (String) obj6, this.b, this.d, (o8b) obj5, this.c, (x16) obj4, (x16) obj3, (l46) obj, iP4, this.f);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ zs1(j09 j09Var, dvd dvdVar, List list, boolean z, suc sucVar, float f, a26 a26Var, a26 a26Var2, int i, int i2) {
        this.b = j09Var;
        this.g = dvdVar;
        this.v = list;
        this.c = z;
        this.w = sucVar;
        this.d = f;
        this.x = a26Var;
        this.y = a26Var2;
        this.e = i;
        this.f = i2;
    }

    public /* synthetic */ zs1(j09 j09Var, TarotCardChoice tarotCardChoice, boolean z, j09 j09Var2, a26 a26Var, float f, mue mueVar, y72 y72Var, int i, int i2) {
        this.b = j09Var;
        this.g = tarotCardChoice;
        this.c = z;
        this.v = j09Var2;
        this.w = a26Var;
        this.d = f;
        this.x = mueVar;
        this.y = y72Var;
        this.e = i;
        this.f = i2;
    }

    public /* synthetic */ zs1(String str, String str2, j09 j09Var, float f, o8b o8bVar, boolean z, x16 x16Var, x16 x16Var2, int i, int i2) {
        this.g = str;
        this.v = str2;
        this.b = j09Var;
        this.d = f;
        this.w = o8bVar;
        this.c = z;
        this.x = x16Var;
        this.y = x16Var2;
        this.e = i;
        this.f = i2;
    }
}
