package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import defpackage.c37;
import defpackage.f48;
import defpackage.kva;
import defpackage.pu4;
import defpackage.q48;
import defpackage.qc0;
import defpackage.r48;
import defpackage.ta0;
import defpackage.z7c;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Lc37;", "Lx48;", "<init>", "()V", "lifecycle-process"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
public final class ProcessLifecycleInitializer implements c37 {
    @Override // defpackage.c37
    public final List a() {
        return pu4.a;
    }

    @Override // defpackage.c37
    public final Object b(Context context) {
        context.getClass();
        ta0 ta0VarV = ta0.v(context);
        ta0VarV.getClass();
        if (!((HashSet) ta0VarV.d).contains(ProcessLifecycleInitializer.class)) {
            qc0.p("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!r48.a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new q48());
        }
        ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.w;
        processLifecycleOwner.getClass();
        processLifecycleOwner.e = new Handler();
        processLifecycleOwner.f.e(f48.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new kva(processLifecycleOwner));
        return processLifecycleOwner;
    }
}
