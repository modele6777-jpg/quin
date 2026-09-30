package defpackage;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.IRunActivityHandler;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ge implements IRunActivityHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ ge(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        int i = this.a;
        boolean z = this.b;
        switch (i) {
            case 0:
                activityHandler.tryTrackMeasurementConsentI(z);
                break;
            default:
                activityHandler.tryTrackMeasurementConsentI(z);
                break;
        }
    }
}
