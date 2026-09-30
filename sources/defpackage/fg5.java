package defpackage;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.CrashlyticsRemoteConfigListener;
import io.sentry.android.core.b1;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fg5 implements j8e, yn2 {
    public final /* synthetic */ gg5 a;

    public /* synthetic */ fg5(gg5 gg5Var) {
        this.a = gg5Var;
    }

    @Override // defpackage.yn2
    public Object h(Task task) {
        boolean z;
        gg5 gg5Var = this.a;
        if (task.m()) {
            wh2 wh2Var = gg5Var.c;
            synchronized (wh2Var) {
                wh2Var.c = Tasks.d(null);
            }
            mi2 mi2Var = wh2Var.b;
            synchronized (mi2Var) {
                mi2Var.a.deleteFile(mi2Var.b);
            }
            yh2 yh2Var = (yh2) task.i();
            z = true;
            if (yh2Var != null) {
                JSONArray jSONArray = yh2Var.d;
                bf5 bf5Var = gg5Var.a;
                if (bf5Var != null) {
                    try {
                        bf5Var.c(gg5.e(jSONArray));
                    } catch (JSONException e) {
                        b1.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e);
                    } catch (y5 e2) {
                        b1.n("FirebaseRemoteConfig", "Could not update ABT experiments.", e2);
                    }
                }
                kxa kxaVar = gg5Var.i;
                try {
                    bq0 bq0VarI = ((lqb) kxaVar.b).i(yh2Var);
                    Iterator it = ((Set) kxaVar.d).iterator();
                    while (it.hasNext()) {
                        ((Executor) kxaVar.c).execute(new l5c((CrashlyticsRemoteConfigListener) it.next(), bq0VarI, 1));
                    }
                } catch (jg5 e3) {
                    b1.n("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", e3);
                }
            } else {
                b1.d("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.j8e
    public Task then(Object obj) {
        gg5 gg5Var = this.a;
        Task taskB = gg5Var.c.b();
        Task taskB2 = gg5Var.d.b();
        return Tasks.f(taskB, taskB2).g(gg5Var.b, new gi2(gg5Var, taskB, taskB2, 4));
    }
}
