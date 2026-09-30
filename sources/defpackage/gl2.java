package defpackage;

import android.content.Context;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gl2 {
    public final bbg a;
    public final Context b;
    public final Object c;
    public final LinkedHashSet d;
    public Object e;

    public gl2(Context context, bbg bbgVar) {
        this.a = bbgVar;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.b = applicationContext;
        this.c = new Object();
        this.d = new LinkedHashSet();
    }

    public abstract Object a();

    public final void b(Object obj) {
        synchronized (this.c) {
            Object obj2 = this.e;
            if (obj2 == null || !obj2.equals(obj)) {
                this.e = obj;
                this.a.d.execute(new fe(26, s72.j1(this.d), this));
            }
        }
    }

    public abstract void c();

    public abstract void d();
}
