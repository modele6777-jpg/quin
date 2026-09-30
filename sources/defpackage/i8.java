package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i8 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e89 b;

    public /* synthetic */ i8(e89 e89Var, int i) {
        this.a = i;
        this.b = e89Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        qp1 qp1Var = qp1.d;
        qp1 qp1Var2 = qp1.e;
        qp1 qp1Var3 = qp1.f;
        p05 p05Var = p05.a;
        wef wefVar = wef.a;
        e89 e89Var = this.b;
        switch (i) {
            case 0:
                e89Var.setValue(Boolean.FALSE);
                return wefVar;
            case 1:
                e89Var.setValue(Boolean.FALSE);
                return wefVar;
            case 2:
                e89Var.setValue(Boolean.TRUE);
                return wefVar;
            case 3:
                e89Var.setValue(Boolean.valueOf(!((Boolean) e89Var.getValue()).booleanValue()));
                return wefVar;
            case 4:
                x1f x1fVar = x1f.a;
                x1f.k(p05Var, new z4(8), 2);
                e89Var.setValue(Boolean.TRUE);
                return wefVar;
            case 5:
                x1f x1fVar2 = x1f.a;
                x1f.k(p05Var, new z4(6), 2);
                e89Var.setValue(Boolean.FALSE);
                return wefVar;
            case 6:
                e89Var.setValue(Boolean.FALSE);
                return wefVar;
            case 7:
                bv7 bv7Var = (bv7) e89Var.getValue();
                if (bv7Var != null) {
                    return bv7Var;
                }
                l37.d("Required value was null.");
                oo3.f();
                return null;
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
                x1f x1fVar3 = x1f.a;
                x1f.k(p05Var, new zv(27), 2);
                e89Var.setValue(Boolean.TRUE);
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                x1f x1fVar4 = x1f.a;
                x1f.k(p05Var, new zv(25), 2);
                e89Var.setValue(Boolean.FALSE);
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                bv7 bv7Var2 = (bv7) e89Var.getValue();
                if (bv7Var2 != null) {
                    return bv7Var2;
                }
                l37.d("Required value was null.");
                oo3.f();
                return null;
            case 14:
                if (e89Var != null) {
                    return (List) e89Var.getValue();
                }
                return null;
            case 15:
                if (((qp1) e89Var.getValue()) == qp1.c) {
                    e89Var.setValue(qp1Var);
                }
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                if (((qp1) e89Var.getValue()) == qp1Var) {
                    e89Var.setValue(qp1Var2);
                }
                return wefVar;
            case 17:
                if (((qp1) e89Var.getValue()) == qp1Var2) {
                    e89Var.setValue(qp1Var3);
                }
                return wefVar;
            case 18:
                if (((qp1) e89Var.getValue()) == qp1Var3) {
                    e89Var.setValue(qp1.g);
                }
                return wefVar;
            case 19:
                wn7[] wn7VarArr = q02.a;
                return (List) e89Var.getValue();
            case 20:
                e89Var.setValue(Boolean.TRUE);
                return wefVar;
            case 21:
                e89Var.setValue(Boolean.valueOf(!((Boolean) e89Var.getValue()).booleanValue()));
                return wefVar;
            case 22:
                e89Var.setValue(Boolean.FALSE);
                return wefVar;
            case 23:
                e89Var.setValue(Boolean.FALSE);
                return wefVar;
            case 24:
                e89Var.setValue(Boolean.FALSE);
                return wefVar;
            case 25:
                e89Var.setValue(Boolean.valueOf(!((Boolean) e89Var.getValue()).booleanValue()));
                return wefVar;
            case 26:
                e89Var.setValue(Boolean.TRUE);
                return wefVar;
            case 27:
                e89Var.setValue(Boolean.TRUE);
                return wefVar;
            case 28:
                e89Var.setValue(Boolean.TRUE);
                return wefVar;
            default:
                e89Var.setValue(Boolean.TRUE);
                return wefVar;
        }
    }
}
