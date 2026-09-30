package defpackage;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class uu8 {
    public final fz3 a;
    public final ta0 b;
    public final HashMap c;

    public uu8(Context context, ta0 ta0Var) {
        fz3 fz3Var = new fz3(context);
        this.c = new HashMap();
        this.a = fz3Var;
        this.b = ta0Var;
    }

    public final synchronized x3f a(String str) {
        if (this.c.containsKey(str)) {
            return (x3f) this.c.get(str);
        }
        CctBackendFactory cctBackendFactoryQ = this.a.q(str);
        if (cctBackendFactoryQ == null) {
            return null;
        }
        ta0 ta0Var = this.b;
        x3f x3fVarCreate = cctBackendFactoryQ.create(new oo0((Context) ta0Var.b, (j52) ta0Var.c, (j52) ta0Var.d, str));
        this.c.put(str, x3fVarCreate);
        return x3fVarCreate;
    }
}
