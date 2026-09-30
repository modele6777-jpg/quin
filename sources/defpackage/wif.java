package defpackage;

import android.os.Trace;
import android.util.Log;
import io.sentry.android.core.b1;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wif extends gbe implements l26 {
    int label;
    final /* synthetic */ xif this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wif(xn2 xn2Var, xif xifVar) {
        super(2, xn2Var);
        this.this$0 = xifVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new wif(xn2Var, this.this$0);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        dg7 dg7VarB;
        Object next;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (!this.this$0.h.b()) {
            yf1 yf1VarA = this.this$0.a.a();
            ckf ckfVar = this.this$0.a;
            ckfVar.c.b = ckfVar.a();
            aj1 aj1Var = ckfVar.b;
            yf1 yf1VarA2 = ckfVar.a();
            synchronized (aj1Var.a) {
                try {
                    if (b21.F(3, "CXCP")) {
                        Log.d("CXCP", "Camera graph updated from " + aj1Var.d + " to " + yf1VarA2);
                    }
                    og1 og1Var = aj1Var.e;
                    og1 og1Var2 = og1.a;
                    if (og1Var != og1Var2) {
                        aj1Var.c(og1.c, null);
                        aj1Var.c(og1Var2, null);
                    }
                    aj1Var.d = yf1VarA2;
                    aj1Var.e = og1Var2;
                } catch (Throwable th) {
                    throw th;
                }
            }
            dg1 dg1Var = (dg1) yf1VarA;
            if (dg1Var.Z.b()) {
                r82.e(dg1Var, " after calling close()", "Cannot start ");
                return null;
            }
            Trace.beginSection(dg1Var + "#start");
            StringBuilder sb = new StringBuilder("Starting ");
            sb.append(dg1Var);
            Log.i("CXCP", sb.toString());
            ud6 ud6Var = dg1Var.b;
            ud6Var.getClass();
            Log.d("CXCP", ud6Var + " onGraphStarting");
            ud6Var.e.m(ae6.c);
            for (fe6 fe6Var : ud6Var.d) {
                fe6Var.a.b(fe6Var.a(), ae6.c);
            }
            gc1 gc1Var = dg1Var.e;
            synchronized (gc1Var.q) {
                gc1Var.e();
            }
            Trace.endSection();
            Map map = (Map) this.this$0.a.f.getValue();
            xif xifVar = this.this$0;
            c0d c0dVar = (c0d) xifVar.j.getValue();
            zzc zzcVar = ((yzc) c0dVar.e.getValue()).c() ? (zzc) c0dVar.f.getValue() : null;
            if (zzcVar != null) {
                List listUnmodifiableList = Collections.unmodifiableList(zzcVar.g.a);
                listUnmodifiableList.getClass();
                List listB = zzcVar.b();
                listB.getClass();
                Iterator it = listB.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (listUnmodifiableList.contains((lu3) next));
                lu3 lu3Var = (lu3) next;
                if (lu3Var != null) {
                }
            }
            if (b21.F(3, "CXCP")) {
                Log.d("CXCP", "Setting up Surfaces with UseCaseSurfaceManager");
            }
            if (((yzc) ((c0d) this.this$0.j.getValue()).e.getValue()).c()) {
                kkf kkfVar = (kkf) this.this$0.i.getValue();
                kkfVar.getClass();
                c0d c0dVar2 = (c0d) this.this$0.j.getValue();
                c0dVar2.getClass();
                map.getClass();
                synchronized (kkfVar.e) {
                    try {
                        if (kkfVar.f != null) {
                            throw new IllegalStateException("Surfaces should only be set up once!");
                        }
                        if (kkfVar.i != null) {
                            throw new IllegalStateException("Surfaces being setup after stopped!");
                        }
                        if (kkfVar.h != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                        Object value = c0dVar2.g.getValue();
                        value.getClass();
                        List list = (List) value;
                        try {
                            jgb.X(list);
                            pu3 pu3VarY = ynb.y(kkfVar.a.a, null, new jkf(c0dVar2, kkfVar, list, 5000L, map, yf1VarA, null), 3);
                            pu3VarY.E(new gfb(list, 1));
                            kkfVar.f = pu3VarY;
                            dg7VarB = pu3VarY;
                        } catch (ju3 e) {
                            if (b21.F(5, "CXCP")) {
                                b1.l("CXCP", "Failed to increment DeferrableSurfaces: Surfaces closed");
                            }
                            ynb.V(kkfVar.a.a, null, null, new ikf(c0dVar2, e, null), 3);
                            dg7VarB = y7h.b(Boolean.FALSE);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                dg7VarB.E(vic.T0);
            } else if (b21.F(6, "CXCP")) {
                b1.d("CXCP", "Unable to create capture session due to conflicting configurations");
            }
            this.this$0.getClass();
        } else if (b21.F(3, "CXCP")) {
            Log.d("CXCP", "UseCaseCamera is closed before starting the CameraGraph, skipping setup.");
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        wif wifVar = (wif) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        wifVar.r(wefVar);
        return wefVar;
    }
}
