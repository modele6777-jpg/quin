package defpackage;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class sh2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ th2 c;

    public sh2(th2 th2Var, int i, long j) {
        this.c = th2Var;
        this.a = i;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final th2 th2Var = this.c;
        int i = this.a;
        final long j = this.b;
        synchronized (th2Var) {
            final int i2 = i - 1;
            final Task taskF = ((di2) th2Var.d).f(3 - i2);
            final Task taskB = ((wh2) th2Var.e).b();
            Tasks.f(taskF, taskB).g((ScheduledExecutorService) th2Var.g, new yn2() { // from class: rh2
                @Override // defpackage.yn2
                public final Object h(Task task) throws JSONException {
                    Boolean boolValueOf;
                    th2 th2Var2 = th2Var;
                    Task task2 = taskF;
                    Task task3 = taskB;
                    long j2 = j;
                    int i3 = i2;
                    if (!task2.m()) {
                        return Tasks.c(new hg5(task2.h(), "Failed to auto-fetch config update."));
                    }
                    if (!task3.m()) {
                        return Tasks.c(new hg5(task3.h(), "Failed to get activated config for auto-fetch"));
                    }
                    bi2 bi2Var = (bi2) task2.i();
                    yh2 yh2Var = (yh2) task3.i();
                    yh2 yh2Var2 = bi2Var.b;
                    if (yh2Var2 != null) {
                        boolValueOf = Boolean.valueOf(yh2Var2.f >= j2);
                    } else {
                        boolValueOf = Boolean.valueOf(bi2Var.a == 1);
                    }
                    if (!boolValueOf.booleanValue()) {
                        Log.d("FirebaseRemoteConfig", "Fetched template version is the same as SDK's current version. Retrying fetch.");
                        th2Var2.a(i3, j2);
                        return Tasks.d(null);
                    }
                    if (bi2Var.b == null) {
                        Log.d("FirebaseRemoteConfig", "The fetch succeeded, but the backend had no updates.");
                        return Tasks.d(null);
                    }
                    if (yh2Var == null) {
                        xh2 xh2VarD = yh2.d();
                        yh2Var = new yh2((JSONObject) xh2VarD.b, (Date) xh2VarD.d, (JSONArray) xh2VarD.e, (JSONObject) xh2VarD.c, xh2VarD.a, (JSONArray) xh2VarD.f);
                    }
                    yh2 yh2Var3 = bi2Var.b;
                    JSONObject jSONObject = yh2Var.e;
                    JSONObject jSONObject2 = yh2Var3.a;
                    JSONObject jSONObject3 = yh2Var3.b;
                    JSONObject jSONObject4 = yh2Var3.e;
                    JSONObject jSONObject5 = yh2.a(new JSONObject(jSONObject2.toString())).b;
                    HashMap mapC = yh2Var.c();
                    HashMap mapC2 = yh2Var3.c();
                    HashMap mapB = yh2Var.b();
                    HashMap mapB2 = yh2Var3.b();
                    HashSet hashSet = new HashSet();
                    JSONObject jSONObject6 = yh2Var.b;
                    Iterator<String> itKeys = jSONObject6.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        if (!jSONObject3.has(next)) {
                            hashSet.add(next);
                        } else if (!jSONObject6.get(next).equals(jSONObject3.get(next))) {
                            hashSet.add(next);
                        } else if ((jSONObject.has(next) && !jSONObject4.has(next)) || (!jSONObject.has(next) && jSONObject4.has(next))) {
                            hashSet.add(next);
                        } else if (jSONObject.has(next) && jSONObject4.has(next) && !jSONObject.getJSONObject(next).toString().equals(jSONObject4.getJSONObject(next).toString())) {
                            hashSet.add(next);
                        } else if (mapC.containsKey(next) != mapC2.containsKey(next)) {
                            hashSet.add(next);
                        } else if (mapC.containsKey(next) && mapC2.containsKey(next) && !((Map) mapC.get(next)).equals(mapC2.get(next))) {
                            hashSet.add(next);
                        } else if (mapB.containsKey(next) != mapB2.containsKey(next)) {
                            hashSet.add(next);
                        } else if (mapB2.containsKey(next) && mapB.containsKey(next) && !((JSONObject) mapB2.get(next)).toString().equals(((JSONObject) mapB.get(next)).toString())) {
                            hashSet.add(next);
                        } else {
                            jSONObject5.remove(next);
                        }
                    }
                    Iterator<String> itKeys2 = jSONObject5.keys();
                    while (itKeys2.hasNext()) {
                        hashSet.add(itKeys2.next());
                    }
                    if (hashSet.isEmpty()) {
                        Log.d("FirebaseRemoteConfig", "Config was fetched, but no params changed.");
                        return Tasks.d(null);
                    }
                    synchronized (th2Var2) {
                        Iterator it = ((LinkedHashSet) th2Var2.b).iterator();
                        while (it.hasNext()) {
                            ((hi2) it.next()).getClass();
                        }
                    }
                    return Tasks.d(null);
                }
            });
        }
    }
}
