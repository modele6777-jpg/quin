package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zda {
    public final Object a;
    public final CopyOnWriteArrayList b;
    public List c;
    public Throwable d;
    public boolean e;
    public final wj5 f;
    public final qn2 g;
    public final AtomicBoolean h;
    public lyd i;
    public final CameraManager j;

    public zda(uhb uhbVar, qn2 qn2Var, List list, Context context) {
        uhbVar.getClass();
        this.a = new Object();
        this.b = new CopyOnWriteArrayList();
        this.d = null;
        this.e = false;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            str.getClass();
            arrayList.add(m93.v(str, null, null));
        }
        this.c = arrayList;
        this.f = uhbVar;
        this.g = qn2Var;
        this.h = new AtomicBoolean(false);
        Object systemService = context.getSystemService("camera");
        systemService.getClass();
        this.j = (CameraManager) systemService;
    }

    public final m88 a() {
        la1 la1Var = new la1();
        la1Var.c = new qxb();
        pa1 pa1Var = new pa1(la1Var);
        la1Var.b = pa1Var;
        la1Var.a = kv2.class;
        try {
            ynb.V(this.g, null, null, new uda(this, la1Var, null), 3);
            la1Var.a = "FetchData for PipeCameraPresence0";
            return pa1Var;
        } catch (Exception e) {
            pa1Var.a(e);
            return pa1Var;
        }
    }

    public final void b() {
        if (!this.h.compareAndSet(false, true)) {
            Log.i("PipePresenceSrc", "Monitoring is already active. Ignoring redundant start call.");
            return;
        }
        Log.i("PipePresenceSrc", "Starting to collect camera ID flow.");
        lyd lydVar = this.i;
        if (lydVar != null) {
            lydVar.h(null);
        }
        imb imbVar = new imb();
        imbVar.element = true;
        this.i = ok8.C(new al5(new kl5(new hl5(this.f, 2), new xda(this, imbVar, null), 1), new yda(this, null)), this.g);
    }

    public final void c(List list, Throwable th) {
        int i;
        List list2;
        boolean z;
        List listUnmodifiableList;
        Throwable th2;
        synchronized (this.a) {
            i = 0;
            try {
                if (th != null) {
                    z = this.d == null || !this.c.isEmpty();
                    this.d = th;
                    list2 = Collections.EMPTY_LIST;
                    this.c = list2;
                } else {
                    list.getClass();
                    boolean z2 = (this.d == null && this.c.equals(list)) ? false : true;
                    this.d = null;
                    this.c = list;
                    boolean z3 = z2;
                    list2 = list;
                    z = z3;
                }
                listUnmodifiableList = Collections.unmodifiableList(list2);
                th2 = this.d;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (z) {
            StringBuilder sb = new StringBuilder("Data changed. Notifying ");
            sb.append(this.b.size());
            sb.append(" observers. Error: ");
            sb.append(th2 != null);
            Log.d("CameraPresenceSrc", sb.toString());
            for (d0 d0Var : this.b) {
                d0Var.a.execute(new c0(th2, d0Var, listUnmodifiableList, i));
            }
        }
    }
}
