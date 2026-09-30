package io.sentry.android.core;

import java.io.File;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d2 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ d2(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                io.sentry.o1 o1Var = (io.sentry.o1) obj;
                io.sentry.o1 o1Var2 = (io.sentry.o1) obj2;
                if (o1Var == o1Var2) {
                    return 0;
                }
                int iCompareTo = o1Var.z().compareTo(o1Var2.z());
                return iCompareTo != 0 ? iCompareTo : o1Var.u().b.a().compareTo(o1Var2.u().b.a());
            case 1:
                io.sentry.android.core.anr.a aVar = (io.sentry.android.core.anr.a) obj;
                io.sentry.android.core.anr.a aVar2 = (io.sentry.android.core.anr.a) obj2;
                return Float.compare((aVar.b + 1.0f) * aVar.f * aVar.a, (aVar2.b + 1.0f) * aVar2.f * aVar2.a);
            default:
                return Long.compare(((File) obj).lastModified(), ((File) obj2).lastModified());
        }
    }
}
