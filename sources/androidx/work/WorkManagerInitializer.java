package androidx.work;

import android.content.Context;
import defpackage.abg;
import defpackage.c37;
import defpackage.ff8;
import defpackage.qfc;
import defpackage.si2;
import defpackage.yag;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerInitializer implements c37 {
    public static final String a = ff8.n("WrkMgrInitializer");

    @Override // defpackage.c37
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.c37
    public final Object b(Context context) {
        ff8.h().e(a, "Initializing WorkManager with default configuration.");
        si2 si2Var = new si2(new qfc());
        context.getClass();
        synchronized (yag.k) {
            try {
                yag yagVar = yag.i;
                if (yagVar != null && yag.j != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (yagVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    yag yagVarT = yag.j;
                    if (yagVarT == null) {
                        yagVarT = abg.t(applicationContext, si2Var);
                        yag.j = yagVarT;
                    }
                    yag.i = yagVarT;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yag.b(context);
    }
}
