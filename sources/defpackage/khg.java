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
public final class khg {
    public static final HashMap n = new HashMap();
    public final Context a;
    public final rch b;
    public final String c;
    public boolean g;
    public final Intent h;
    public jhg l;
    public ahg m;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final fhg j = new fhg(0, this);
    public final AtomicInteger k = new AtomicInteger(0);
    public final WeakReference i = new WeakReference(null);

    public khg(Context context, rch rchVar, String str, Intent intent) {
        this.a = context;
        this.b = rchVar;
        this.c = str;
        this.h = intent;
    }

    public static void b(khg khgVar, ehg ehgVar) {
        ahg ahgVar = khgVar.m;
        rch rchVar = khgVar.b;
        ArrayList<ehg> arrayList = khgVar.d;
        int i = 0;
        if (ahgVar != null || khgVar.g) {
            if (!khgVar.g) {
                ehgVar.run();
                return;
            } else {
                rchVar.e("Waiting to bind to the service.", new Object[0]);
                arrayList.add(ehgVar);
                return;
            }
        }
        rchVar.e("Initiate binding to the service.", new Object[0]);
        arrayList.add(ehgVar);
        jhg jhgVar = new jhg(i, khgVar);
        khgVar.l = jhgVar;
        khgVar.g = true;
        if (khgVar.a.bindService(khgVar.h, jhgVar, 1)) {
            return;
        }
        rchVar.e("Failed to bind to the service.", new Object[0]);
        khgVar.g = false;
        for (ehg ehgVar2 : arrayList) {
            neg negVar = new neg("Failed to bind to the service.");
            gle gleVar = ehgVar2.a;
            if (gleVar != null) {
                gleVar.b(negVar);
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

    public final void c(ehg ehgVar, gle gleVar) {
        a().post(new peg(this, ehgVar.a, gleVar, ehgVar));
    }

    public final void d(gle gleVar) {
        synchronized (this.f) {
            this.e.remove(gleVar);
        }
        a().post(new hhg(0, this));
    }

    public final void e() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((gle) it.next()).b(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
