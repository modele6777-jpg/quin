package defpackage;

import android.content.Context;
import android.os.Process;
import io.sentry.android.core.b1;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class fe7 {
    public static final /* synthetic */ wn7[] d = {job.a.i(new bya(fe7.class))};
    public final String a;
    public final ThreadLocal b;
    public final fc3 c;

    public fe7(Context context, String str) {
        context.getClass();
        this.a = str;
        this.b = new ThreadLocal();
        final int i = 0;
        final int i2 = 1;
        this.c = (fc3) k99.L(str, new vrb(i, new a26(this) { // from class: yd7
            public final /* synthetic */ fe7 b;

            {
                this.b = this;
            }

            @Override // defpackage.a26
            public final Object d(Object obj) {
                int i3 = i;
                fe7 fe7Var = this.b;
                switch (i3) {
                    case 0:
                        mw2 mw2Var = (mw2) obj;
                        mw2Var.getClass();
                        b1.n(job.a.b(fe7.class).r(), "CorruptionException in " + fe7Var.a + " DataStore running in process " + Process.myPid(), mw2Var);
                        return new p79(true);
                    default:
                        Context context2 = (Context) obj;
                        context2.getClass();
                        String str2 = fe7Var.a;
                        LinkedHashSet linkedHashSet = add.a;
                        linkedHashSet.getClass();
                        zcd zcdVar = new zcd(linkedHashSet, null);
                        ycd ycdVar = new ycd(3, null);
                        LinkedHashSet linkedHashSet2 = bdd.a;
                        linkedHashSet2.getClass();
                        return t72.H(new xcd(new e5b(4, context2, str2), linkedHashSet2, zcdVar, ycdVar, context2, str2));
                }
            }
        }), new a26(this) { // from class: yd7
            public final /* synthetic */ fe7 b;

            {
                this.b = this;
            }

            @Override // defpackage.a26
            public final Object d(Object obj) {
                int i3 = i2;
                fe7 fe7Var = this.b;
                switch (i3) {
                    case 0:
                        mw2 mw2Var = (mw2) obj;
                        mw2Var.getClass();
                        b1.n(job.a.b(fe7.class).r(), "CorruptionException in " + fe7Var.a + " DataStore running in process " + Process.myPid(), mw2Var);
                        return new p79(true);
                    default:
                        Context context2 = (Context) obj;
                        context2.getClass();
                        String str2 = fe7Var.a;
                        LinkedHashSet linkedHashSet = add.a;
                        linkedHashSet.getClass();
                        zcd zcdVar = new zcd(linkedHashSet, null);
                        ycd ycdVar = new ycd(3, null);
                        LinkedHashSet linkedHashSet2 = bdd.a;
                        linkedHashSet2.getClass();
                        return t72.H(new xcd(new e5b(4, context2, str2), linkedHashSet2, zcdVar, ycdVar, context2, str2));
                }
            }
        }, 8).a(d[0], context);
    }

    public final void a(a26 a26Var) {
    }

    public final Object b(isa isaVar, Long l) {
        isaVar.getClass();
        return z5c.I(nu4.a, new ce7(this, isaVar, l, null));
    }
}
