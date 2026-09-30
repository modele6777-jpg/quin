package defpackage;

import android.content.Context;
import io.sentry.android.sqlite.l;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cu7 implements g9e {
    public final /* synthetic */ Context a;

    public /* synthetic */ cu7(Context context) {
        this.a = context;
    }

    @Override // defpackage.g9e
    public h9e a(xs6 xs6Var) {
        String str = (String) xs6Var.e;
        sug sugVar = (sug) xs6Var.d;
        sugVar.getClass();
        if (str != null && str.length() != 0) {
            return l.b(new lz5(this.a, str, sugVar, true, true));
        }
        qc0.j("Must set a non-null database name to a configuration that uses the no backup directory.");
        return null;
    }
}
