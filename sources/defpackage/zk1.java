package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zk1 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h0e b;

    public /* synthetic */ zk1(int i, h0e h0eVar) {
        this.a = i;
        this.b = h0eVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        h0e h0eVar = this.b;
        switch (i) {
            case 0:
                return new iy9(((axf) h0eVar.getValue()).a, ((axf) h0eVar.getValue()).b);
            case 1:
                return (wy6) h0eVar.getValue();
            case 2:
                Boolean bool = (Boolean) h0eVar.getValue();
                bool.booleanValue();
                return bool;
            case 3:
                Boolean bool2 = (Boolean) h0eVar.getValue();
                bool2.getClass();
                return bool2;
            case 4:
                return Float.valueOf(((Number) h0eVar.getValue()).floatValue());
            case 5:
                return Float.valueOf(mh3.n(((Number) h0eVar.getValue()).floatValue() + 0.25f, 0.5f, 1.0f));
            case 6:
                return Float.valueOf(mh3.n(1.0f - ((Number) h0eVar.getValue()).floatValue(), 0.0f, 0.4f));
            case 7:
                return Float.valueOf(mh3.n(((Number) h0eVar.getValue()).floatValue() * 0.72f, 0.0f, 0.72f));
            case 8:
                float f = um6.a;
                return Boolean.valueOf(((Number) h0eVar.getValue()).floatValue() > 0.0f);
            case 9:
                List list = (List) h0eVar.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (pa7.t(((da9) obj).b.a, "composable")) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ((x16) h0eVar.getValue()).invoke();
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                Boolean bool3 = (Boolean) h0eVar.getValue();
                bool3.getClass();
                return bool3;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return Float.valueOf(((Number) h0eVar.getValue()).floatValue());
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return Float.valueOf(((Number) h0eVar.getValue()).floatValue());
            case 14:
                hl9 hl9Var = (hl9) h0eVar.getValue();
                long j = hl9Var.a;
                return hl9Var;
            case 15:
                yz yzVar = xvc.a;
                hl9 hl9Var2 = (hl9) h0eVar.getValue();
                long j2 = hl9Var2.a;
                return hl9Var2;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ((x16) h0eVar.getValue()).invoke();
                return wefVar;
            case 17:
                ((x16) h0eVar.getValue()).invoke();
                return wefVar;
            case 18:
                ((x16) h0eVar.getValue()).invoke();
                return wefVar;
            case 19:
                return Boolean.valueOf(((Number) h0eVar.getValue()).floatValue() > 0.0f);
            default:
                return Boolean.valueOf(((Number) h0eVar.getValue()).floatValue() > 0.0f);
        }
    }
}
