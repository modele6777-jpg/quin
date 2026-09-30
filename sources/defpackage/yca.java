package defpackage;

import android.os.Handler;
import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yca implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x16 b;

    public /* synthetic */ yca(int i, x16 x16Var) {
        this.a = i;
        this.b = x16Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        float f;
        int i = this.a;
        int i2 = 5;
        int i3 = 24;
        p05 p05Var = p05.a;
        wef wefVar = wef.a;
        x16 x16Var = this.b;
        switch (i) {
            case 0:
                x1f x1fVar = x1f.a;
                x1f.k(p05Var, new q4a(22), 2);
                x16Var.invoke();
                return wefVar;
            case 1:
                x1f x1fVar2 = x1f.a;
                x1f.k(p05Var, new q4a(24), 2);
                x16Var.invoke();
                return wefVar;
            case 2:
                x1f x1fVar3 = x1f.a;
                x1f.k(p05Var, new q4a(21), 2);
                x16Var.invoke();
                return wefVar;
            case 3:
                x1f x1fVar4 = x1f.a;
                x1f.k(p05Var, new q4a(19), 2);
                x16Var.invoke();
                return wefVar;
            case 4:
                x16Var.invoke();
                return wefVar;
            case 5:
                x1f x1fVar5 = x1f.a;
                x1f.k(p05Var, new zea(4), 2);
                x16Var.invoke();
                return wefVar;
            case 6:
                float fFloatValue = ((Number) x16Var.invoke()).floatValue();
                f = fFloatValue >= 0.0f ? fFloatValue : 0.0f;
                return Float.valueOf(f <= 1.0f ? f : 1.0f);
            case 7:
                float fFloatValue2 = ((Number) x16Var.invoke()).floatValue();
                f = fFloatValue2 >= 0.0f ? fFloatValue2 : 0.0f;
                return Float.valueOf(f <= 1.0f ? f : 1.0f);
            case 8:
                x16Var.invoke();
                return wefVar;
            case 9:
                x16Var.invoke();
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                x1f x1fVar6 = x1f.a;
                x1f.k(p05Var, new e2d(i2), 2);
                x16Var.invoke();
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                x1f x1fVar7 = x1f.a;
                x1f.k(p05Var, new znd(i2), 2);
                x16Var.invoke();
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                x1f x1fVar8 = x1f.a;
                x1f.k(p05Var, new znd(6), 2);
                x16Var.invoke();
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                x1f x1fVar9 = x1f.a;
                x1f.k(p05Var, new znd(9), 2);
                x16Var.invoke();
                return wefVar;
            case 14:
                x1f x1fVar10 = x1f.a;
                x1f.k(p05Var, new znd(8), 2);
                x16Var.invoke();
                return wefVar;
            case 15:
                x1f x1fVar11 = x1f.a;
                x1f.k(p05Var, new znd(7), 2);
                x16Var.invoke();
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return (Handler) x16Var.invoke();
            case 17:
                x16Var.invoke();
                return wefVar;
            case 18:
                x16Var.invoke();
                return wefVar;
            case 19:
                if (x16Var != null) {
                    x16Var.invoke();
                }
                return wefVar;
            default:
                x1f x1fVar12 = x1f.a;
                x1f.k(p05Var, new ksf(i3), 2);
                x16Var.invoke();
                return wefVar;
        }
    }
}
