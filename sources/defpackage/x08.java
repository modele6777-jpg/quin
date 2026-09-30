package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x08 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e89 b;

    public /* synthetic */ x08(e89 e89Var, int i) {
        this.a = i;
        this.b = e89Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        p05 p05Var = p05.a;
        wef wefVar = wef.a;
        e89 e89Var = this.b;
        switch (i) {
            case 0:
                return new v08((a26) e89Var.getValue());
            case 1:
                e89Var.setValue(Boolean.valueOf(!((Boolean) e89Var.getValue()).booleanValue()));
                return wefVar;
            case 2:
                e89Var.setValue(Boolean.FALSE);
                return wefVar;
            case 3:
                e89Var.setValue(Boolean.TRUE);
                return wefVar;
            case 4:
                e89Var.setValue(Boolean.TRUE);
                return wefVar;
            case 5:
                e89Var.setValue(Boolean.FALSE);
                return wefVar;
            case 6:
                e89Var.setValue(Boolean.FALSE);
                return wefVar;
            case 7:
                e89Var.setValue(Boolean.TRUE);
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
                e89Var.setValue(Boolean.FALSE);
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                x1f x1fVar = x1f.a;
                x1f.k(p05Var, new d59(29), 2);
                e89Var.setValue(Boolean.FALSE);
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                e89Var.setValue(Integer.valueOf(((Number) e89Var.getValue()).intValue() + 1));
                return wefVar;
            case 14:
                return (mfc) e89Var.getValue();
            case 15:
                e89Var.setValue(Boolean.TRUE);
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                e89Var.setValue(Boolean.FALSE);
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
                e89Var.setValue(Boolean.FALSE);
                return wefVar;
            case 22:
                x1f x1fVar2 = x1f.a;
                x1f.g(p05Var, m1f.a, new q4a(7));
                e89Var.setValue(Boolean.TRUE);
                return wefVar;
            case 23:
                e89Var.setValue(Boolean.FALSE);
                return wefVar;
            case 24:
                e89Var.setValue(Boolean.FALSE);
                return wefVar;
            case 25:
                bv7 bv7Var = (bv7) e89Var.getValue();
                if (bv7Var != null) {
                    return bv7Var;
                }
                l37.d("Required value was null.");
                oo3.f();
                return null;
            case 26:
                e89Var.setValue(Boolean.TRUE);
                return wefVar;
            case 27:
                e89Var.setValue(Boolean.FALSE);
                return wefVar;
            case 28:
                e89Var.setValue(Boolean.FALSE);
                return wefVar;
            default:
                e89Var.setValue(Boolean.FALSE);
                return wefVar;
        }
    }
}
