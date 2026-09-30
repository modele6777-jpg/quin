package defpackage;

import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Function;
import org.ocpsoft.prettytime.impl.ResourcesTimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fj0 implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ fj0(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return Integer.valueOf(Integer.bitCount(((Integer) obj).intValue()));
            case 1:
                return ((obj instanceof Double) && obj.toString().endsWith(".0")) ? Integer.valueOf(((Double) obj).intValue()) : obj;
            case 2:
                return obj.toString();
            case 3:
                return CrashlyticsReportPersistence.lambda$decorateWithProfilingManagerInfoIfFatal$2((File) obj);
            case 4:
                return new ArrayList();
            case 5:
                return kb6.r(obj);
            case 6:
                return cd0.a(obj) ? new cd0(obj) : Collections.singleton(obj);
            case 7:
                return ((Collection) obj).stream();
            default:
                return Long.valueOf(((ResourcesTimeUnit) ((aye) obj)).c);
        }
    }
}
