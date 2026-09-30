package defpackage;

import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import io.sentry.android.core.b1;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ai2 implements yn2, an9 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ai2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    @Override // defpackage.yn2
    public Object h(Task task) {
        di2 di2Var = (di2) this.a;
        Task task2 = (Task) this.b;
        Task task3 = (Task) this.c;
        Date date = (Date) this.d;
        HashMap map = (HashMap) this.e;
        if (!task2.m()) {
            return Tasks.c(new hg5(task2.h(), "Firebase Installations failed to get installation ID for fetch."));
        }
        if (!task3.m()) {
            return Tasks.c(new hg5(task3.h(), "Firebase Installations failed to get installation auth token for fetch."));
        }
        try {
            bi2 bi2VarD = di2Var.d((String) task2.i(), ((ip0) task3.i()).a, date, map);
            if (bi2VarD.a != 0) {
                return Tasks.d(bi2VarD);
            }
            wh2 wh2Var = (wh2) di2Var.e;
            yh2 yh2Var = bi2VarD.b;
            Executor executor = wh2Var.a;
            return Tasks.b(executor, new vh2(0, wh2Var, yh2Var)).o(executor, new bo1(2, wh2Var, yh2Var)).o((Executor) di2Var.c, new jv2(11, bi2VarD));
        } catch (jg5 e) {
            return Tasks.c(e);
        }
    }

    @Override // defpackage.an9
    public void r(Exception exc) {
        e76 e76Var = (e76) this.a;
        z66 z66Var = (z66) this.b;
        iy2 iy2Var = (iy2) this.c;
        Executor executor = (Executor) this.d;
        CancellationSignal cancellationSignal = (CancellationSignal) this.e;
        CredentialProviderPlayServicesImpl.Companion.getClass();
        e76Var.getClass();
        for (i76 i76Var : e76Var.a) {
        }
        b1.l("GetCredentialController", "Pre-u credman get flow failed; retrying with gis flow");
        new qy2(z66Var.d).f(e76Var, cancellationSignal, executor, iy2Var);
    }
}
