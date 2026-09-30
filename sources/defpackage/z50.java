package defpackage;

import ai.askquin.ui.annual.model.AnnualActionFor;
import ai.askquin.ui.explore.model.DailyCardBasicInfo;
import java.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z50 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ z50(boolean z, boolean z2, x16 x16Var, x16 x16Var2, j09 j09Var, int i) {
        this.a = 8;
        this.b = z;
        this.c = z2;
        this.e = x16Var;
        this.f = x16Var2;
        this.d = j09Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        Object obj3 = this.d;
        Object obj4 = this.f;
        Object obj5 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                qn4.b(this.b, (AnnualActionFor) obj3, this.c, (x16) obj5, (x16) obj4, (l46) obj, k99.P(1));
                return wefVar;
            case 1:
                e8d e8dVar = (e8d) obj3;
                DailyCardBasicInfo dailyCardBasicInfo = (DailyCardBasicInfo) obj5;
                a26 a26Var = (a26) obj4;
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    int iOrdinal = e8dVar.ordinal();
                    if (iOrdinal != 0) {
                        boolean z = this.c;
                        if (iOrdinal == 1) {
                            l46Var.f0(-1181393997);
                            b53.g(dailyCardBasicInfo, this.b, z, a26Var, l46Var, DailyCardBasicInfo.$stable);
                            l46Var.r(false);
                        } else {
                            if (iOrdinal != 2) {
                                throw tec.d(-1181395119, l46Var, false);
                            }
                            l46Var.f0(-1181386641);
                            b53.b(dailyCardBasicInfo, z, a26Var, l46Var, DailyCardBasicInfo.$stable);
                            l46Var.r(false);
                        }
                    } else {
                        l46Var.f0(-1181380371);
                        l46Var.r(false);
                    }
                } else {
                    l46Var.Z();
                }
                return wefVar;
            case 2:
                ((Integer) obj2).getClass();
                xj3.j(this.b, this.c, (y72) obj3, (x16) obj5, (j09) obj4, (l46) obj, k99.P(1));
                return wefVar;
            case 3:
                ((Integer) obj2).getClass();
                m93.j((LocalDate) obj3, this.b, this.c, (x16) obj5, (j09) obj4, (l46) obj, k99.P(1));
                return wefVar;
            case 4:
                ((Integer) obj2).getClass();
                ym8.c((j09) obj3, (String) obj5, this.b, this.c, (a26) obj4, (l46) obj, k99.P(385));
                return wefVar;
            case 5:
                ((Integer) obj2).getClass();
                e6a.a((String) obj3, this.b, this.c, (j09) obj4, (x16) obj5, (l46) obj, k99.P(3073));
                return wefVar;
            case 6:
                ((Integer) obj2).getClass();
                x57.x((use) obj3, this.b, this.c, (x16) obj5, (j09) obj4, (l46) obj, k99.P(24577));
                return wefVar;
            case 7:
                ((Integer) obj2).getClass();
                m93.n(this.b, (x16) obj5, (j09) obj3, this.c, (jbb) obj4, (l46) obj, k99.P(49));
                return wefVar;
            default:
                ((Integer) obj2).getClass();
                o5c.a(this.b, this.c, (x16) obj5, (x16) obj4, (j09) obj3, (l46) obj, k99.P(1));
                return wefVar;
        }
    }

    public /* synthetic */ z50(e8d e8dVar, DailyCardBasicInfo dailyCardBasicInfo, boolean z, boolean z2, a26 a26Var) {
        this.a = 1;
        this.d = e8dVar;
        this.e = dailyCardBasicInfo;
        this.b = z;
        this.c = z2;
        this.f = a26Var;
    }

    public /* synthetic */ z50(Object obj, boolean z, boolean z2, x16 x16Var, j09 j09Var, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.b = z;
        this.c = z2;
        this.e = x16Var;
        this.f = j09Var;
    }

    public /* synthetic */ z50(String str, boolean z, boolean z2, j09 j09Var, x16 x16Var, int i) {
        this.a = 5;
        this.d = str;
        this.b = z;
        this.c = z2;
        this.f = j09Var;
        this.e = x16Var;
    }

    public /* synthetic */ z50(boolean z, x16 x16Var, j09 j09Var, boolean z2, jbb jbbVar, int i) {
        this.a = 7;
        this.b = z;
        this.e = x16Var;
        this.d = j09Var;
        this.c = z2;
        this.f = jbbVar;
    }

    public /* synthetic */ z50(boolean z, AnnualActionFor annualActionFor, boolean z2, x16 x16Var, x16 x16Var2, int i) {
        this.a = 0;
        this.b = z;
        this.d = annualActionFor;
        this.c = z2;
        this.e = x16Var;
        this.f = x16Var2;
    }

    public /* synthetic */ z50(boolean z, boolean z2, y72 y72Var, x16 x16Var, j09 j09Var, int i) {
        this.a = 2;
        this.b = z;
        this.c = z2;
        this.d = y72Var;
        this.e = x16Var;
        this.f = j09Var;
    }

    public /* synthetic */ z50(j09 j09Var, String str, boolean z, boolean z2, a26 a26Var, int i) {
        this.a = 4;
        this.d = j09Var;
        this.e = str;
        this.b = z;
        this.c = z2;
        this.f = a26Var;
    }
}
