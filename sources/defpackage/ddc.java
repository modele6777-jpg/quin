package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ddc implements idc {
    public final vea a;
    public boolean b;
    public Bundle c;
    public final ace d;

    public ddc(vea veaVar, pwf pwfVar) {
        veaVar.getClass();
        this.a = veaVar;
        this.d = new ace(new hla(14, pwfVar));
    }

    @Override // defpackage.idc
    public final Bundle a() {
        Bundle bundleR = feg.r((iy9[]) Arrays.copyOf(new iy9[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            bundleR.putAll(bundle);
        }
        for (Map.Entry entry : ((edc) this.d.getValue()).b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((pb2) ((ycc) entry.getValue()).b.f).a();
            if (!bundleA.isEmpty()) {
                str.getClass();
                bundleR.putBundle(str, bundleA);
            }
        }
        this.b = false;
        return bundleR;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        Bundle bundleO = this.a.o("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundleR = feg.r((iy9[]) Arrays.copyOf(new iy9[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            bundleR.putAll(bundle);
        }
        if (bundleO != null) {
            bundleR.putAll(bundleO);
        }
        this.c = bundleR;
        this.b = true;
    }
}
