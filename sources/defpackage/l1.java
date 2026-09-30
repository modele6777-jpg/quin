package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l1 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cea b;

    public /* synthetic */ l1(cea ceaVar, int i) {
        this.a = i;
        this.b = ceaVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        cea ceaVar = this.b;
        bea beaVar = (bea) obj;
        switch (i) {
            case 0:
                beaVar.k(ceaVar, 0, 0, 0.0f);
                break;
            case 1:
                beaVar.g(ceaVar, 0, 0, 0.0f);
                break;
            case 2:
                beaVar.k(ceaVar, 0, 0, 0.0f);
                break;
            case 3:
                beaVar.k(ceaVar, 0, 0, 0.0f);
                break;
            case 4:
                beaVar.g(ceaVar, 0, 0, 0.0f);
                break;
            case 5:
                beaVar.k(ceaVar, 0, 0, 0.0f);
                break;
            case 6:
                beaVar.g(ceaVar, 0, 0, 0.0f);
                break;
            case 7:
                beaVar.k(ceaVar, 0, 0, 0.0f);
                break;
            case 8:
                beaVar.k(ceaVar, 0, 0, 0.0f);
                break;
            case 9:
                beaVar.getClass();
                beaVar.g(ceaVar, 0, 0, 0.0f);
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                if (beaVar.c() == cv7.a || beaVar.d() == 0) {
                    beaVar.e(ceaVar);
                    ceaVar.b0(w67.d(0L, ceaVar.e), 0.0f, null);
                } else {
                    long jD = ((long) (beaVar.d() - ceaVar.a)) << 32;
                    beaVar.e(ceaVar);
                    ceaVar.b0(w67.d(jD, ceaVar.e), 0.0f, null);
                }
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                beaVar.g(ceaVar, 0, 0, 0.0f);
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                beaVar.k(ceaVar, 0, 0, 0.0f);
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                beaVar.g(ceaVar, 0, 0, 0.0f);
                break;
            case 14:
                bea.n(beaVar, ceaVar, 0, 0);
                break;
            case 15:
                beaVar.k(ceaVar, 0, 0, 0.0f);
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                beaVar.g(ceaVar, 0, 0, 0.0f);
                break;
            case 17:
                beaVar.getClass();
                beaVar.g(ceaVar, 0, (-ceaVar.b) / 2, 0.0f);
                break;
            case 18:
                beaVar.g(ceaVar, 0, 0, 0.0f);
                break;
            case 19:
                beaVar.g(ceaVar, 0, 0, 0.0f);
                break;
            case 20:
                beaVar.k(ceaVar, 0, 0, 0.0f);
                break;
            case 21:
                beaVar.g(ceaVar, 0, 0, 0.0f);
                break;
            case 22:
                beaVar.g(ceaVar, 0, 0, 0.0f);
                break;
            default:
                beaVar.k(ceaVar, 0, 0, 0.0f);
                break;
        }
        return wefVar;
    }
}
