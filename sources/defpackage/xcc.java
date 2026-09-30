package defpackage;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xcc implements ucc, kdc {
    public final /* synthetic */ vcc a;
    public a58 b;
    public lqb c;

    public xcc(vcc vccVar) {
        this.a = vccVar;
        Object objE = vccVar.e("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = objE instanceof Bundle ? (Bundle) objE : null;
        if (bundle != null && this.c == null) {
            lqb lqbVar = new lqb(new jdc(this, new hla(15, this)));
            this.c = lqbVar;
            lqbVar.p(bundle);
        }
        vccVar.a("androidx.savedstate.SavedStateRegistry", new hla(13, this));
    }

    @Override // defpackage.ucc
    public final tcc a(String str, x16 x16Var) {
        return this.a.a(str, x16Var);
    }

    @Override // defpackage.ucc
    public final boolean c(Object obj) {
        return this.a.c(obj);
    }

    @Override // defpackage.ucc
    public final Map d() {
        return this.a.d();
    }

    @Override // defpackage.ucc
    public final Object e(String str) {
        return this.a.e(str);
    }

    @Override // defpackage.kdc
    public final vea h() {
        lqb lqbVar = this.c;
        if (lqbVar == null) {
            lqb lqbVar2 = new lqb(new jdc(this, new hla(15, this)));
            this.c = lqbVar2;
            lqbVar2.p(null);
            lqbVar = lqbVar2;
        }
        return (vea) lqbVar.c;
    }

    @Override // defpackage.x48
    public final h48 k() {
        a58 a58Var = this.b;
        if (a58Var != null) {
            return a58Var;
        }
        a58 a58Var2 = new a58(this, false);
        this.b = a58Var2;
        return a58Var2;
    }
}
