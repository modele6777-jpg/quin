package defpackage;

import android.hardware.camera2.CaptureResult;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class y88 implements atb, nd6 {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    @Override // defpackage.atb
    public final void R(qtb qtbVar, long j, ds dsVar) {
        d(qtbVar.C0(), dsVar.b);
    }

    @Override // defpackage.atb
    public final void W(qtb qtbVar, long j, es esVar) {
        qtbVar.getClass();
        d(qtbVar.C0(), esVar);
    }

    @Override // defpackage.nd6
    public final void a() {
        Iterator it = this.a.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((gzb) it.next()).c();
        }
    }

    @Override // defpackage.nd6
    public final void b() {
        Iterator it = this.a.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((gzb) it.next()).c();
        }
    }

    @Override // defpackage.nd6
    public final void c() {
        Iterator it = this.a.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((gzb) it.next()).c();
        }
    }

    public final void d(long j, es esVar) {
        Integer num;
        Iterator it = this.a.iterator();
        it.getClass();
        while (it.hasNext()) {
            gzb gzbVar = (gzb) it.next();
            gzbVar.getClass();
            esVar.getClass();
            if (!gzbVar.d.L0() && !gzbVar.d.isCancelled()) {
                synchronized (gzbVar) {
                    rtb rtbVar = gzbVar.g;
                    if (rtbVar != null && j >= rtbVar.a) {
                        CaptureResult.Key key = CaptureResult.SENSOR_TIMESTAMP;
                        key.getClass();
                        Long l = (Long) esVar.a.get(key);
                        long frameNumber = esVar.a.getFrameNumber();
                        if (l != null && gzbVar.f == null) {
                            gzbVar.f = l;
                        }
                        Long l2 = gzbVar.f;
                        if (gzbVar.c == null || l2 == null || l == null || l.longValue() - l2.longValue() <= gzbVar.c.longValue()) {
                            if (gzbVar.e == null) {
                                gzbVar.e = new yy5(frameNumber);
                            }
                            yy5 yy5Var = gzbVar.e;
                            if (yy5Var != null && (num = gzbVar.b) != null && frameNumber - yy5Var.a > num.intValue()) {
                                gzbVar.d.R(new fzb(1, esVar));
                            } else if (((Boolean) gzbVar.a.d(esVar)).booleanValue()) {
                                gzbVar.d.R(new fzb(0, esVar));
                            }
                        } else {
                            gzbVar.d.R(new fzb(2, esVar));
                        }
                    }
                }
            }
            this.a.remove(gzbVar);
        }
    }

    @Override // defpackage.atb
    public final void u(qtb qtbVar) {
        qtbVar.getClass();
        Iterator it = this.a.iterator();
        it.getClass();
        while (it.hasNext()) {
            gzb gzbVar = (gzb) it.next();
            long jC0 = qtbVar.C0();
            synchronized (gzbVar) {
                if (gzbVar.g == null) {
                    gzbVar.g = new rtb(jC0);
                }
            }
        }
    }
}
