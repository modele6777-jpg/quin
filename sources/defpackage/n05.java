package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class n05 implements h1b {
    public final /* synthetic */ int a;
    public final h1b b;

    public /* synthetic */ n05(h1b h1bVar, int i) {
        this.a = i;
        this.b = h1bVar;
    }

    @Override // defpackage.h1b
    public final Object get() {
        int i = this.a;
        h1b h1bVar = this.b;
        switch (i) {
            case 0:
                String packageName = ((Context) h1bVar.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                r82.g("Cannot return null from a non-@Nullable @Provides method");
                return null;
            default:
                return new jfc(Integer.valueOf(jfc.d).intValue(), (Context) h1bVar.get(), "com.google.android.datatransport.events");
        }
    }
}
