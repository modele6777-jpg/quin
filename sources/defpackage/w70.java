package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class w70 implements idc {
    public final /* synthetic */ int a;
    public final Object b;

    public w70(vea veaVar) {
        this.a = 1;
        this.b = new LinkedHashSet();
        veaVar.A("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.idc
    public final Bundle a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                ((y70) obj).s();
                return bundle;
            default:
                Bundle bundleR = feg.r((iy9[]) Arrays.copyOf(new iy9[0], 0));
                ndc.i(bundleR, "classes_to_restore", s72.j1((LinkedHashSet) obj));
                return bundleR;
        }
    }

    public w70(y70 y70Var) {
        this.a = 0;
        this.b = y70Var;
    }
}
