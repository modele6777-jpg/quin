package defpackage;

import android.content.Context;
import java.io.File;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class k55 implements hf8 {
    public static final k55 a = new k55();
    public static final yid b;
    public static final gg7 c;
    public static final ta0 d;

    static {
        yid yidVar = new yid(cn1.z().getCacheDir(), new d28(10485760L), new myd(cn1.z()));
        new a90(cn1.z(), 26);
        new sq3();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map.clear();
        map2.clear();
        Context contextZ = cn1.z();
        ta0 ta0Var = new ta0(13);
        ta0Var.c = yidVar;
        ta0Var.b = new kb6(12);
        new a90(contextZ, ta0Var);
        map.clear();
        map2.clear();
        yid yidVar2 = new yid(new File(cn1.z().getCacheDir(), "tts-exo-cache"), new d28(52428800L), new myd(cn1.z()));
        b = yidVar2;
        t8e t8eVarD = iqf.d();
        js3 js3Var = ga4.a;
        c = new gg7(jgb.k(i7h.I(t8eVarD, hr3.c)));
        gm9 gm9VarA = ((hm9) di.a.getValue()).a();
        gm9VarA.l = null;
        gm9VarA.a(15L);
        hm9 hm9Var = new hm9(gm9VarA);
        ta0 ta0Var2 = new ta0(13);
        ta0Var2.c = yidVar2;
        ta0Var2.b = new w84(hm9Var);
        d = ta0Var2;
    }
}
