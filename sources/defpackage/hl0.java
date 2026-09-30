package defpackage;

import ai.askquin.ui.account.navigation.AuthNavigation$BindPhoneRoute;
import ai.askquin.ui.account.navigation.AuthNavigation$BindPhoneVerifyCodeRoute;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hl0 implements o26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cb9 b;
    public final /* synthetic */ qmf c;

    public /* synthetic */ hl0(cb9 cb9Var, qmf qmfVar) {
        this.a = 1;
        this.b = cb9Var;
        this.c = qmfVar;
    }

    @Override // defpackage.o26
    public final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        wef wefVar = wef.a;
        i8c i8cVar = sf2.a;
        qmf qmfVar = this.c;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj3;
                ib8.u((Integer) obj4, (ly) obj, (da9) obj2);
                cb9 cb9Var = this.b;
                boolean zI = l46Var.i(cb9Var);
                Object objR = l46Var.R();
                if (zI || objR == i8cVar) {
                    a9 a9Var = new a9(0, cb9Var, cb9.class, "popBackStack", "popBackStack()Z", 8, 4);
                    l46Var.p0(a9Var);
                    objR = a9Var;
                }
                int i2 = qmf.Z;
                o8c.h(qmfVar, (x16) objR, l46Var, 8);
                break;
            case 1:
                da9 da9Var = (da9) obj2;
                l46 l46Var2 = (l46) obj3;
                ((Integer) obj4).getClass();
                ((ly) obj).getClass();
                da9Var.getClass();
                AuthNavigation$BindPhoneRoute authNavigation$BindPhoneRoute = (AuthNavigation$BindPhoneRoute) vfh.S(da9Var, job.a.b(AuthNavigation$BindPhoneRoute.class));
                cb9 cb9Var2 = this.b;
                boolean zI2 = l46Var2.i(cb9Var2);
                Object objR2 = l46Var2.R();
                if (zI2 || objR2 == i8cVar) {
                    a9 a9Var2 = new a9(0, cb9Var2, cb9.class, "popBackStack", "popBackStack()Z", 8, 5);
                    l46Var2.p0(a9Var2);
                    objR2 = a9Var2;
                }
                x16 x16Var = (x16) objR2;
                boolean zI3 = l46Var2.i(cb9Var2) | l46Var2.i(authNavigation$BindPhoneRoute);
                Object objR3 = l46Var2.R();
                if (zI3 || objR3 == i8cVar) {
                    objR3 = new l0(12, cb9Var2, authNavigation$BindPhoneRoute);
                    l46Var2.p0(objR3);
                }
                a26 a26Var = (a26) objR3;
                boolean zI4 = l46Var2.i(qmfVar) | l46Var2.i(cb9Var2);
                Object objR4 = l46Var2.R();
                if (zI4 || objR4 == i8cVar) {
                    objR4 = new l0(13, qmfVar, cb9Var2);
                    l46Var2.p0(objR4);
                }
                af1.c(a26Var, (a26) objR4, x16Var, l46Var2, 0);
                break;
            default:
                da9 da9Var2 = (da9) obj2;
                l46 l46Var3 = (l46) obj3;
                ((Integer) obj4).getClass();
                ((ly) obj).getClass();
                da9Var2.getClass();
                AuthNavigation$BindPhoneVerifyCodeRoute authNavigation$BindPhoneVerifyCodeRoute = (AuthNavigation$BindPhoneVerifyCodeRoute) vfh.S(da9Var2, job.a.b(AuthNavigation$BindPhoneVerifyCodeRoute.class));
                String phoneNumber = authNavigation$BindPhoneVerifyCodeRoute.getPhoneNumber();
                boolean zI5 = l46Var3.i(qmfVar) | l46Var3.i(authNavigation$BindPhoneVerifyCodeRoute);
                Object objR5 = l46Var3.R();
                if (zI5 || objR5 == i8cVar) {
                    objR5 = new l0(14, qmfVar, authNavigation$BindPhoneVerifyCodeRoute);
                    l46Var3.p0(objR5);
                }
                a26 a26Var2 = (a26) objR5;
                cb9 cb9Var3 = this.b;
                boolean zI6 = l46Var3.i(cb9Var3);
                Object objR6 = l46Var3.R();
                if (zI6 || objR6 == i8cVar) {
                    a9 a9Var3 = new a9(0, cb9Var3, cb9.class, "popBackStack", "popBackStack()Z", 8, 6);
                    l46Var3.p0(a9Var3);
                    objR6 = a9Var3;
                }
                y41.a(phoneNumber, a26Var2, (x16) objR6, l46Var3, 0);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ hl0(qmf qmfVar, cb9 cb9Var, int i) {
        this.a = i;
        this.c = qmfVar;
        this.b = cb9Var;
    }
}
