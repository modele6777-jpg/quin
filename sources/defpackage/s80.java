package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class s80 {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static s80 c;
    public cyb a;

    public static synchronized s80 a() {
        try {
            if (c == null) {
                c();
            }
        } catch (Throwable th) {
            throw th;
        }
        return c;
    }

    public static synchronized void c() {
        if (c == null) {
            s80 s80Var = new s80();
            c = s80Var;
            s80Var.a = cyb.c();
            cyb cybVar = c.a;
            hbc hbcVar = new hbc(2);
            synchronized (cybVar) {
                cybVar.e = hbcVar;
            }
        }
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.a.d(context, i);
    }
}
