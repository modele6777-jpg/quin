package defpackage;

import ai.askquin.ui.web.WebViewActivity;
import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xfc implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e89 b;

    public /* synthetic */ xfc(e89 e89Var, int i) {
        this.a = i;
        this.b = e89Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        e89 e89Var = this.b;
        switch (i) {
            case 0:
                ((x16) e89Var.getValue()).invoke();
                return wefVar;
            case 1:
                e89Var.setValue(null);
                return wefVar;
            case 2:
                e89Var.setValue(Boolean.TRUE);
                return wefVar;
            case 3:
                e89Var.setValue(Boolean.TRUE);
                return wefVar;
            case 4:
                e89Var.setValue(Boolean.FALSE);
                return wefVar;
            case 5:
                e89Var.setValue(Boolean.FALSE);
                return wefVar;
            case 6:
                e89Var.setValue(Boolean.FALSE);
                return wefVar;
            case 7:
                ((x16) e89Var.getValue()).invoke();
                return wefVar;
            case 8:
                return (s13) e89Var.getValue();
            case 9:
                e89Var.setValue(null);
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return (bv7) e89Var.getValue();
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                Boolean bool = (Boolean) e89Var.getValue();
                bool.getClass();
                return bool;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                e89Var.setValue(Boolean.FALSE);
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                int i2 = WebViewActivity.T0;
                e89Var.setValue(null);
                return wefVar;
            case 14:
                int i3 = WebViewActivity.T0;
                e89Var.setValue(Boolean.FALSE);
                return wefVar;
            case 15:
                int i4 = WebViewActivity.T0;
                e89Var.setValue(Boolean.FALSE);
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ((x16) e89Var.getValue()).invoke();
                return wefVar;
            case 17:
                e89Var.setValue(x2g.b);
                return wefVar;
            case 18:
                ((x16) e89Var.getValue()).invoke();
                return wefVar;
            case 19:
                e89Var.setValue(eg6.b);
                return wefVar;
            case 20:
                e89Var.setValue(Boolean.valueOf(!v2c.k(e89Var)));
                return wefVar;
            case 21:
                Boolean bool2 = (Boolean) e89Var.getValue();
                bool2.getClass();
                return bool2;
            case 22:
                e89Var.setValue(c6g.b);
                return wefVar;
            default:
                e89Var.setValue(c6g.a);
                return wefVar;
        }
    }
}
