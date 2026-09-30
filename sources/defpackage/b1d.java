package defpackage;

import android.app.ApplicationExitInfo;
import com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b1d implements Predicate {
    public final /* synthetic */ int a;

    public /* synthetic */ b1d(int i) {
        this.a = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        ApplicationExitInfo applicationExitInfo = (ApplicationExitInfo) obj;
        switch (this.a) {
            case 0:
                return SessionReportingCoordinator.lambda$isOom$5(applicationExitInfo);
            default:
                return SessionReportingCoordinator.lambda$persistRelevantAppExitInfoEvent$0(applicationExitInfo);
        }
    }
}
