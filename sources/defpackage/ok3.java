package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.time.LocalDateTime;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ok3 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e89 b;

    public /* synthetic */ ok3(e89 e89Var, int i) {
        this.a = i;
        this.b = e89Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        int i2 = 1;
        wef wefVar = wef.a;
        e89 e89Var = this.b;
        switch (i) {
            case 0:
                e89Var.setValue(Boolean.FALSE);
                return wefVar;
            case 1:
                hs3 hs3Var = xqa.r0;
                Boolean bool = Boolean.TRUE;
                ynb.V(lw2.a, null, null, new f74(hs3Var.a, bool, null), 3);
                e89Var.setValue(bool);
                jcc.k(0, "已开启");
                return wefVar;
            case 2:
                hs3 hs3Var2 = xqa.r0;
                Boolean bool2 = Boolean.FALSE;
                ynb.V(lw2.a, null, null, new i74(hs3Var2.a, bool2, null), 3);
                e89Var.setValue(bool2);
                jcc.k(0, "已关闭");
                return wefVar;
            case 3:
                LocalDateTime localDateTime = xs5.a;
                xs5.c(true);
                e89Var.setValue(Boolean.TRUE);
                jcc.k(0, "已开启");
                return wefVar;
            case 4:
                LocalDateTime localDateTime2 = xs5.a;
                xs5.c(false);
                e89Var.setValue(Boolean.FALSE);
                jcc.k(0, "已关闭");
                return wefVar;
            case 5:
                hs3 hs3Var3 = xqa.u;
                Boolean bool3 = Boolean.TRUE;
                ynb.V(lw2.a, null, null, new a20(hs3Var3.a, bool3, null), 3);
                e89Var.setValue(bool3);
                jcc.k(0, "已开启");
                return wefVar;
            case 6:
                hs3 hs3Var4 = xqa.u;
                Boolean bool4 = Boolean.FALSE;
                ynb.V(lw2.a, null, null, new a20(hs3Var4.a, bool4, null), 3);
                e89Var.setValue(bool4);
                jcc.k(0, "已关闭");
                return wefVar;
            case 7:
                e89Var.setValue(Boolean.valueOf(!((Boolean) e89Var.getValue()).booleanValue()));
                return wefVar;
            case 8:
                e89Var.setValue(Boolean.FALSE);
                return wefVar;
            case 9:
                e89Var.setValue(Boolean.TRUE);
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                e89Var.setValue(Boolean.FALSE);
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                e89Var.setValue(Boolean.valueOf(!((Boolean) e89Var.getValue()).booleanValue()));
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                e89Var.setValue(Boolean.valueOf(!((Boolean) e89Var.getValue()).booleanValue()));
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                e89Var.setValue(null);
                return wefVar;
            case 14:
                e89Var.setValue(null);
                return wefVar;
            case 15:
                e89Var.setValue(Boolean.TRUE);
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                e89Var.setValue(wefVar);
                return wefVar;
            case 17:
                e89Var.setValue(Boolean.FALSE);
                return wefVar;
            case 18:
                e89Var.setValue(Boolean.FALSE);
                return wefVar;
            case 19:
                e89Var.setValue(Boolean.FALSE);
                return wefVar;
            case 20:
                e89Var.setValue(Boolean.FALSE);
                return wefVar;
            case 21:
                e89Var.setValue(null);
                return wefVar;
            case 22:
                ((x16) e89Var.getValue()).invoke();
                return wefVar;
            case 23:
                e89Var.setValue(null);
                return wefVar;
            case 24:
                e89Var.setValue(null);
                return wefVar;
            case 25:
                e89Var.setValue(Boolean.FALSE);
                return wefVar;
            case 26:
                e89Var.setValue(Boolean.FALSE);
                return wefVar;
            case 27:
                x1f x1fVar = x1f.a;
                x1f.g(p05.a, m1f.a, new tb7(i2));
                e89Var.setValue(Boolean.TRUE);
                return wefVar;
            case 28:
                return new sw7((a26) e89Var.getValue());
            default:
                return (rz7) ((x16) e89Var.getValue()).invoke();
        }
    }
}
