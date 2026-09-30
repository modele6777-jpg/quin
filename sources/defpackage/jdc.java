package defpackage;

import android.os.Bundle;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jdc {
    public final kdc a;
    public final hla b;
    public boolean e;
    public Bundle f;
    public boolean g;
    public final w1e c = new w1e(2);
    public final LinkedHashMap d = new LinkedHashMap();
    public boolean h = true;

    public jdc(kdc kdcVar, hla hlaVar) {
        this.a = kdcVar;
        this.b = hlaVar;
    }

    public final void a() {
        kdc kdcVar = this.a;
        if (((a58) kdcVar.k()).i != g48.b) {
            qc0.p("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.e) {
                qc0.p("SavedStateRegistry was already attached.");
                return;
            }
            this.b.invoke();
            kdcVar.k().a(new y6(5, this));
            this.e = true;
        }
    }
}
