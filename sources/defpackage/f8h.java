package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class f8h {
    public static final Object j = new Object();
    public static final AtomicReference k = new AtomicReference();
    public static volatile f8h l = null;
    public static final u8e m = vtb.r(n8h.a);
    public final pbh a = new pbh();
    public final Context b;
    public final u8e c;
    public final u8e d;
    public final u8e e;
    public final u8e f;
    public final pdh g;
    public final u8e h;
    public final bdh i;

    public f8h(Context context, u8e u8eVar, u8e u8eVar2, u8e u8eVar3, u8e u8eVar4, u8e u8eVar5) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        u8eVar.getClass();
        u8eVar2.getClass();
        u8eVar3.getClass();
        u8eVar4.getClass();
        u8eVar5.getClass();
        u8e u8eVarR = vtb.r(u8eVar);
        u8e u8eVarR2 = vtb.r(u8eVar2);
        u8e u8eVarR3 = vtb.r(new p8h(u8eVar3, 0));
        u8e u8eVarR4 = vtb.r(u8eVar4);
        u8e u8eVarR5 = vtb.r(u8eVar5);
        this.b = applicationContext;
        this.c = u8eVarR;
        this.d = u8eVarR2;
        this.e = u8eVarR3;
        this.f = u8eVarR4;
        this.g = new pdh(applicationContext, u8eVarR, u8eVarR4, u8eVarR2);
        this.h = u8eVarR5;
        this.i = new bdh(applicationContext, u8eVarR, u8eVarR3, u8eVarR2);
    }

    public static void b() {
        synchronized (bm8.O) {
        }
        if (k.get() == null && bm8.P == null) {
            bm8.P = new r8h();
        }
    }

    public final i39 a() {
        return (i39) this.c.get();
    }
}
