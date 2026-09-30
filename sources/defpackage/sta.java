package defpackage;

import com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sta implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Serializable c;

    public /* synthetic */ sta(Object obj, Serializable serializable, int i) {
        this.a = i;
        this.b = obj;
        this.c = serializable;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        Serializable serializable = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                aye ayeVar = (aye) obj;
                ((ConcurrentHashMap) serializable).put(ayeVar.toString(), (uxe) ((tta) obj2).b.get(ayeVar));
                break;
            default:
                ((SessionReportingCoordinator) obj2).lambda$persistProfilingManagerInfo$2((String) serializable, (Integer) obj);
                break;
        }
    }
}
