package defpackage;

import android.content.Context;
import com.adjust.sdk.Constants;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class f4f {
    public static volatile u23 e;
    public final j52 a;
    public final j52 b;
    public final ks3 c;
    public final lp0 d;

    public f4f(j52 j52Var, j52 j52Var2, ks3 ks3Var, lp0 lp0Var, kxa kxaVar) {
        this.a = j52Var;
        this.b = j52Var2;
        this.c = ks3Var;
        this.d = lp0Var;
        ((Executor) kxaVar.a).execute(new bwe(4, kxaVar));
    }

    public static f4f a() {
        u23 u23Var = e;
        if (u23Var != null) {
            return (f4f) u23Var.f.get();
        }
        qc0.p("Not initialized!");
        return null;
    }

    public static void b(Context context) {
        if (e == null) {
            synchronized (f4f.class) {
                try {
                    if (e == null) {
                        t23 t23Var = new t23();
                        context.getClass();
                        t23Var.a = context;
                        e = t23Var.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final z3f c(e71 e71Var) {
        byte[] bytes;
        Set setUnmodifiableSet = e71Var instanceof e71 ? Collections.unmodifiableSet(e71.d) : Collections.singleton(new jv4("proto"));
        ta0 ta0VarA = qq0.a();
        e71Var.getClass();
        ta0VarA.c = "cct";
        String str = e71Var.a;
        String str2 = e71Var.b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = ub3.k("1$", str, "\\", str2).getBytes(Charset.forName(Constants.ENCODING));
        }
        ta0VarA.d = bytes;
        return new z3f(setUnmodifiableSet, ta0VarA.f(), this);
    }
}
