package defpackage;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import java.util.function.Function;
import org.ocpsoft.prettytime.i18n.Resources_fi;
import org.ocpsoft.prettytime.i18n.Resources_ja;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mx2 implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mx2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return CrashlyticsReportPersistence.lambda$decorateWithProfilingManagerInfoIfFatal$3((CrashlyticsReport.Session.Event) obj2, (CrashlyticsReport.ProfilingManagerInfo) obj);
            case 1:
                return ((Resources_fi) obj2).lambda$getFormatFor$0((aye) obj);
            case 2:
                return ((Resources_ja) obj2).lambda$getFormatFor$0((aye) obj);
            default:
                return (d99) ((z8b) obj2).d(obj);
        }
    }
}
