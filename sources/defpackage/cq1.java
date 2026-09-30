package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cq1 implements l26 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cq1(int i, long j, String str, String str2) {
        this.c = str;
        this.d = str2;
        this.b = j;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        long jB = this.b;
        wef wefVar = wef.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                uq1.k((String) obj4, (String) obj3, this.b, (l46) obj, k99.P(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                rxg.r(this.b, (q9f) obj4, (l26) obj3, (l46) obj, k99.P(49));
                break;
            case 2:
                j09 j09Var = (j09) obj4;
                dd2 dd2Var = (dd2) obj3;
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    Object objR = l46Var.R();
                    i8c i8cVar = sf2.a;
                    if (objR == i8cVar) {
                        objR = new nd8(12);
                        l46Var.p0(objR);
                    }
                    h88 h88Var = new h88((a26) objR, 23);
                    n4c n4cVar = new n4c(new xtd(0L, 0L, new ar5(674), null, null, null, null, 0L, null, null, null, 0L, null, null, 65531), new xtd(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65535), 246);
                    wue wueVar = new wue(jB);
                    Object objR2 = l46Var.R();
                    if (objR2 == i8cVar) {
                        objR2 = new sz5(29);
                        l46Var.p0(objR2);
                    }
                    z3c.a(j09Var, new o4c(wueVar, (2 & 120) != 0 ? null : (l26) objR2, (120 & 4) != 0 ? null : h88Var, null, null, null, null, (120 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? null : n4cVar), af1.b0(-191972172, new ec(dd2Var, 9), l46Var), l46Var, 384);
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                ym8.e((jr2) obj4, this.b, (a26) obj3, (l46) obj, k99.P(1));
                break;
            default:
                String str = (String) obj4;
                mue mueVar = (mue) obj3;
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    l46Var2.Z();
                } else {
                    if (faf.a(jB, y72.k)) {
                        l46Var2.f0(105921739);
                        jB = y72.b(((m82) l46Var2.k(o82.a)).q, 0.48f);
                    } else {
                        l46Var2.f0(105922529);
                    }
                    l46Var2.r(false);
                    nte.b(str, null, jB, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVar, l46Var2, 0, 0, 131066);
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ cq1(long j, q9f q9fVar, l26 l26Var, int i) {
        this.b = j;
        this.c = q9fVar;
        this.d = l26Var;
    }

    public /* synthetic */ cq1(long j, String str, mue mueVar) {
        this.b = j;
        this.c = str;
        this.d = mueVar;
    }

    public /* synthetic */ cq1(jr2 jr2Var, long j, a26 a26Var, int i) {
        this.c = jr2Var;
        this.b = j;
        this.d = a26Var;
    }

    public /* synthetic */ cq1(j09 j09Var, long j, dd2 dd2Var) {
        this.c = j09Var;
        this.b = j;
        this.d = dd2Var;
    }
}
