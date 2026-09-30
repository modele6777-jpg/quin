package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class reh {
    public static final HashMap n = new HashMap();
    public final Context a;
    public final ue1 b;
    public boolean g;
    public final Intent h;
    public jhg l;
    public xxg m;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final fhg j = new fhg(1, this);
    public final AtomicInteger k = new AtomicInteger(0);
    public final String c = "com.google.android.finsky.inappreviewservice.InAppReviewService";
    public final WeakReference i = new WeakReference(null);

    public reh(Context context, ue1 ue1Var, Intent intent) {
        this.a = context;
        this.b = ue1Var;
        this.h = intent;
    }

    public static void b(reh rehVar, wxg wxgVar) {
        xxg xxgVar = rehVar.m;
        ue1 ue1Var = rehVar.b;
        ArrayList<w4h> arrayList = rehVar.d;
        if (xxgVar != null || rehVar.g) {
            if (!rehVar.g) {
                wxgVar.run();
                return;
            } else {
                ue1Var.d("Waiting to bind to the service.", new Object[0]);
                arrayList.add(wxgVar);
                return;
            }
        }
        ue1Var.d("Initiate binding to the service.", new Object[0]);
        arrayList.add(wxgVar);
        jhg jhgVar = new jhg(2, rehVar);
        rehVar.l = jhgVar;
        rehVar.g = true;
        if (rehVar.a.bindService(rehVar.h, jhgVar, 1)) {
            return;
        }
        ue1Var.d("Failed to bind to the service.", new Object[0]);
        rehVar.g = false;
        for (w4h w4hVar : arrayList) {
            teh tehVar = new teh("Failed to bind to the service.");
            gle gleVar = w4hVar.a;
            if (gleVar != null) {
                gleVar.b(tehVar);
            }
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.c)) {
                    HandlerThread handlerThread = new HandlerThread(this.c, 10);
                    handlerThread.start();
                    map.put(this.c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((gle) it.next()).b(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
