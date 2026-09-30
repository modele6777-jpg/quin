package defpackage;

import ai.askquin.ui.explore.model.DailyCardBasicInfo;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ry1 implements l26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ a26 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ry1(DailyCardBasicInfo dailyCardBasicInfo, boolean z, e8d e8dVar, boolean z2, a26 a26Var, int i) {
        this.f = dailyCardBasicInfo;
        this.b = z;
        this.g = e8dVar;
        this.c = z2;
        this.d = a26Var;
        this.e = i;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.e;
        wef wefVar = wef.a;
        Object obj3 = this.g;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = k99.P(i2 | 1);
                cn1.c(this.b, this.d, (j09) obj4, this.c, (qy1) obj3, (l46) obj, iP);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP2 = k99.P(i2 | 1);
                b53.e((DailyCardBasicInfo) obj4, this.b, (e8d) obj3, this.c, this.d, (l46) obj, iP2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP3 = k99.P(1);
                pi9.b((String) obj4, (String) obj3, this.b, this.c, this.d, (l46) obj, iP3, this.e);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ ry1(String str, String str2, boolean z, boolean z2, a26 a26Var, int i, int i2) {
        this.f = str;
        this.g = str2;
        this.b = z;
        this.c = z2;
        this.d = a26Var;
        this.e = i2;
    }

    public /* synthetic */ ry1(boolean z, a26 a26Var, j09 j09Var, boolean z2, qy1 qy1Var, int i) {
        this.b = z;
        this.d = a26Var;
        this.f = j09Var;
        this.c = z2;
        this.g = qy1Var;
        this.e = i;
    }
}
