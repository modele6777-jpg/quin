package defpackage;

import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ic6 implements hf8, awe {
    public static final /* synthetic */ int c = 0;
    public final ncd a;
    public final uhb b;

    public ic6() {
        ncd ncdVarB = ocd.b(0, 1, null, 4);
        this.a = ncdVarB;
        this.b = if9.m(ncdVarB);
    }

    @Override // defpackage.awe
    public final void a(vb2 vb2Var) {
        vb2Var.getClass();
        i76 i76Var = new i76(if9.H(), if9.H(), xu4.a);
        ArrayList arrayList = new ArrayList();
        arrayList.add(i76Var);
        ynb.V(vpf.H(vb2Var), null, null, new hc6(vb2Var, new e76(s72.j1(arrayList)), this, null), 3);
    }

    @Override // defpackage.awe
    public final if8 b() {
        return if8.a;
    }

    @Override // defpackage.awe
    public final uhb c() {
        return this.b;
    }

    public final void e(zve zveVar) {
        if (this.a.i(zveVar)) {
            return;
        }
        d().g("Failed to emit auth result, no active collectors");
    }

    public final void f(f76 f76Var) {
        j6 j6Var = f76Var.a;
        if (!(j6Var instanceof m13)) {
            d().b("Unexpected type of credential: ".concat(j6Var.getClass().getSimpleName()));
            e(new zve(null, new IllegalStateException("Unsupported credential type: ".concat(j6Var.getClass().getSimpleName())), 26));
            return;
        }
        m13 m13Var = (m13) j6Var;
        String str = (String) m13Var.a;
        if (!str.equals("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL")) {
            d().b("Unexpected custom credential type: ".concat(str));
            e(new zve(null, new IllegalStateException("Unexpected credential type: ".concat(str)), 26));
            return;
        }
        try {
            String str2 = q6.c((Bundle) m13Var.b).c;
            d().e("Google Sign-In successful - Token: " + v4e.m0(10, str2) + "...");
            e(new zve(str2, null, 28));
        } catch (gc6 e) {
            d().c("Failed to parse Google ID token", e);
            e(new zve(null, e, 26));
        }
    }
}
