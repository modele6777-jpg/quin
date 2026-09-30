package defpackage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vf5 implements j8e {
    public final /* synthetic */ FirebaseMessaging a;
    public final /* synthetic */ String b;
    public final /* synthetic */ xj0 c;

    public /* synthetic */ vf5(FirebaseMessaging firebaseMessaging, String str, xj0 xj0Var) {
        this.a = firebaseMessaging;
        this.b = str;
        this.c = xj0Var;
    }

    public Task a() {
        Task taskC;
        Task taskF;
        int i;
        FirebaseMessaging firebaseMessaging = this.a;
        String str = this.b;
        xj0 xj0Var = this.c;
        a82 a82Var = firebaseMessaging.d;
        boolean zG = a82Var.G();
        if (!zG || ((rw) a82Var.f).d() < 261200000) {
            hbc hbcVar = (hbc) a82Var.e;
            String strC = rw.c((ff5) hbcVar.a);
            Bundle bundle = new Bundle();
            try {
                hbcVar.H0(strC, bundle, zG);
                w7c w7cVar = (w7c) hbcVar.c;
                g94 g94Var = g94.d;
                yl9 yl9Var = w7cVar.c;
                if (yl9Var.A() < 12000000) {
                    taskC = yl9Var.z() != 0 ? w7cVar.b(bundle).g(g94Var, new m7h(w7cVar, bundle)) : Tasks.c(new IOException("MISSING_INSTANCEID_SERVICE"));
                } else {
                    veh vehVarI = veh.i(w7cVar.b);
                    synchronized (vehVarI) {
                        i = vehVarI.b;
                        vehVarI.b = i + 1;
                    }
                    taskC = vehVarI.j(new odh(i, 1, bundle, 1)).f(g94Var, g3e.c);
                }
            } catch (InterruptedException | ExecutionException e) {
                taskC = Tasks.c(e);
            }
            taskF = taskC.f(new mc0(1), new yg5(hbcVar));
        } else {
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new z99("Firebase-Messaging-Network-Io"));
            taskF = ((nf5) ((of5) a82Var.b)).c().g(executorServiceNewSingleThreadExecutor, new bo1(11, a82Var, executorServiceNewSingleThreadExecutor));
        }
        return taskF.o(firebaseMessaging.h, new vf5(firebaseMessaging, str, xj0Var));
    }

    @Override // defpackage.j8e
    public Task then(Object obj) {
        FirebaseMessaging firebaseMessaging = this.a;
        String str = this.b;
        xj0 xj0Var = this.c;
        String str2 = (String) obj;
        vrb vrbVarC = FirebaseMessaging.c(firebaseMessaging.b);
        ff5 ff5Var = firebaseMessaging.a;
        ff5Var.a();
        String strE = "[DEFAULT]".equals(ff5Var.b) ? "" : ff5Var.e();
        String strB = firebaseMessaging.i.b();
        synchronized (vrbVarC) {
            String strF = xj0.f(str2, strB, System.currentTimeMillis());
            if (strF != null) {
                SharedPreferences.Editor editorEdit = ((SharedPreferences) vrbVarC.b).edit();
                editorEdit.putString(strE + "|T|" + str + "|*", strF);
                editorEdit.commit();
            }
        }
        if (firebaseMessaging.d.G() || xj0Var == null || !str2.equals((String) xj0Var.b)) {
            ff5 ff5Var2 = firebaseMessaging.a;
            ff5Var2.a();
            String str3 = ff5Var2.b;
            if ("[DEFAULT]".equals(str3)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb = new StringBuilder("Invoking onNewToken for app: ");
                    ff5Var2.a();
                    sb.append(str3);
                    Log.d("FirebaseMessaging", sb.toString());
                }
                boolean zG = firebaseMessaging.d.G();
                Intent intent = new Intent();
                intent.putExtra("token", str2);
                if (zG) {
                    intent.setAction("com.google.firebase.messaging.FCM_REGISTERED");
                } else {
                    intent.setAction("com.google.firebase.messaging.NEW_TOKEN");
                }
                new a90(firebaseMessaging.b, 2).Q(intent);
            }
        }
        return Tasks.d(str2);
    }
}
