package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c20 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x16 b;

    public /* synthetic */ c20(int i, x16 x16Var) {
        this.a = i;
        this.b = x16Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        int i2 = 27;
        p05 p05Var = p05.a;
        wef wefVar = wef.a;
        x16 x16Var = this.b;
        switch (i) {
            case 0:
                x1f x1fVar = x1f.a;
                x1f.k(new r05("popup_click"), new zv(7), 2);
                x16Var.invoke();
                return wefVar;
            case 1:
                x1f x1fVar2 = x1f.a;
                x1f.k(p05Var, new zv(6), 2);
                x16Var.invoke();
                return wefVar;
            case 2:
                x1f x1fVar3 = x1f.a;
                x1f.k(p05Var, new zv(12), 2);
                x16Var.invoke();
                return wefVar;
            case 3:
                x16Var.invoke();
                return wefVar;
            case 4:
                x16Var.invoke();
                return wefVar;
            case 5:
                x16Var.invoke();
                return wefVar;
            case 6:
                x16Var.invoke();
                return wefVar;
            case 7:
                x16Var.invoke();
                return wefVar;
            case 8:
                x16Var.invoke();
                return wefVar;
            case 9:
                x16Var.invoke();
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                x16Var.invoke();
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                x16Var.invoke();
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                x16Var.invoke();
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                x16Var.invoke();
                return wefVar;
            case 14:
                x16Var.invoke();
                return wefVar;
            case 15:
                x1f x1fVar4 = x1f.a;
                x1f.k(p05Var, new to3(i2), 2);
                x16Var.invoke();
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                x16Var.invoke();
                return wefVar;
            case 17:
                x16Var.invoke();
                return wefVar;
            case 18:
                x16Var.invoke();
                return wefVar;
            case 19:
                x16Var.invoke();
                return wefVar;
            case 20:
                x16Var.invoke();
                return wefVar;
            case 21:
                x16Var.invoke();
                return wefVar;
            case 22:
                x16Var.invoke();
                return wefVar;
            case 23:
                x16Var.invoke();
                return wefVar;
            case 24:
                x1f x1fVar5 = x1f.a;
                x1f.k(new r05("popup_view"), new oz5(0), 2);
                x16Var.invoke();
                return wefVar;
            case 25:
                x1f x1fVar6 = x1f.a;
                x1f.k(new r05("button_click"), new oz5(1), 2);
                x16Var.invoke();
                return wefVar;
            case 26:
                x16Var.invoke();
                return wefVar;
            case 27:
                try {
                    return (List) x16Var.invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return pu4.a;
                }
            case 28:
                x1f x1fVar7 = x1f.a;
                x1f.k(p05Var, new oz5(i2), 2);
                x16Var.invoke();
                return wefVar;
            default:
                x1f x1fVar8 = x1f.a;
                x1f.k(p05Var, new tk6(5), 2);
                x16Var.invoke();
                return wefVar;
        }
    }
}
