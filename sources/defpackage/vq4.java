package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vq4 implements pae, SurfaceTexture.OnFrameAvailableListener {
    public final tq4 a;
    public final HandlerThread b;
    public final ah6 c;
    public final Handler d;
    public int e;
    public boolean f;
    public final AtomicBoolean g;
    public final LinkedHashMap v;
    public SurfaceTexture w;
    public SurfaceTexture x;

    public vq4(qr4 qr4Var, k47 k47Var, k47 k47Var2) {
        Map map = Collections.EMPTY_MAP;
        this.e = 0;
        this.f = false;
        this.g = new AtomicBoolean(false);
        this.v = new LinkedHashMap();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.d = handler;
        this.c = new ah6(handler);
        this.a = new tq4(k47Var, k47Var2);
        try {
            f(qr4Var);
        } catch (RuntimeException e) {
            a();
            throw e;
        }
    }

    @Override // defpackage.pae
    public final void a() {
        if (this.g.getAndSet(true)) {
            return;
        }
        e(new j1(28, this), new ni(7));
    }

    @Override // defpackage.pae
    public final void b(wae waeVar) {
        if (this.g.get()) {
            waeVar.c();
        } else {
            e(new ny2(15, this, waeVar), new et3(waeVar, 0));
        }
    }

    @Override // defpackage.pae
    public final void c(oae oaeVar) {
        if (this.g.get()) {
            oaeVar.close();
        } else {
            e(new ny2(16, this, oaeVar), new j1(23, oaeVar));
        }
    }

    public final void d() {
        if (this.f && this.e == 0) {
            LinkedHashMap linkedHashMap = this.v;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((oae) it.next()).close();
            }
            linkedHashMap.clear();
            tq4 tq4Var = this.a;
            if (((AtomicBoolean) tq4Var.c).getAndSet(false)) {
                e46.c((Thread) tq4Var.e);
                tq4Var.n();
            }
            tq4Var.Y = -1;
            tq4Var.Z = -1;
            this.b.quit();
        }
    }

    public final void e(Runnable runnable, Runnable runnable2) {
        try {
            this.c.execute(new c0(this, runnable2, runnable, 15));
        } catch (RejectedExecutionException e) {
            b21.X("DualSurfaceProcessor", "Unable to executor runnable", e);
            runnable2.run();
        }
    }

    public final void f(qr4 qr4Var) {
        Map map = Collections.EMPTY_MAP;
        la1 la1Var = new la1();
        la1Var.c = new qxb();
        pa1 pa1Var = new pa1(la1Var);
        la1Var.b = pa1Var;
        la1Var.a = kv2.class;
        try {
            e(new c0(this, qr4Var, la1Var), new ni(7));
            la1Var.a = "Init GlRenderer";
        } catch (Exception e) {
            pa1Var.a(e);
        }
        try {
            pa1Var.get();
        } catch (InterruptedException | ExecutionException e2) {
            e = e2;
            if (e instanceof ExecutionException) {
                e = e.getCause();
            }
            if (e instanceof RuntimeException) {
                throw ((RuntimeException) e);
            }
            ho7.r("Failed to create DefaultSurfaceProcessor", e);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (this.g.get() || (surfaceTexture2 = this.w) == null || this.x == null) {
            return;
        }
        surfaceTexture2.updateTexImage();
        this.x.updateTexImage();
        for (Map.Entry entry : this.v.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            oae oaeVar = (oae) entry.getKey();
            if (oaeVar.c == 34) {
                try {
                    this.a.v(surfaceTexture.getTimestamp(), surface, oaeVar, this.w, this.x);
                } catch (RuntimeException e) {
                    b21.w("DualSurfaceProcessor", "Failed to render with OpenGL.", e);
                }
            }
        }
    }
}
