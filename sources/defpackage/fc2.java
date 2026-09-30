package defpackage;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.util.Collections;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fc2 implements i1b {
    public final /* synthetic */ int a;

    public /* synthetic */ fc2(int i) {
        this.a = i;
    }

    @Override // defpackage.i1b
    public final Object get() {
        switch (this.a) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                return ExecutorsRegistrar.lambda$static$0();
            case 2:
                return ExecutorsRegistrar.lambda$static$1();
            case 3:
                return ExecutorsRegistrar.lambda$static$2();
            case 4:
                return ExecutorsRegistrar.lambda$static$3();
            case 5:
                return null;
            case 6:
                return Executors.newSingleThreadScheduledExecutor();
            case 7:
                return GaugeManager.lambda$new$0();
            case 8:
                return GaugeManager.lambda$new$1();
            case 9:
                return null;
            default:
                return null;
        }
    }
}
