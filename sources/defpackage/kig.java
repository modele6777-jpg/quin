package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class kig extends whg {
    public final j27 b;
    public final gle c;
    public final qfc d;

    public kig(int i, j27 j27Var, gle gleVar, qfc qfcVar) {
        super(i);
        this.c = gleVar;
        this.b = j27Var;
        this.d = qfcVar;
        if (i == 2 && j27Var.a) {
            qc0.j("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
            throw null;
        }
    }

    @Override // defpackage.mig
    public final void a(Status status) {
        this.d.getClass();
        this.c.b(status.c != null ? new pxb(status) : new x60(status));
    }

    @Override // defpackage.mig
    public final void b(Exception exc) {
        this.c.b(exc);
    }

    @Override // defpackage.mig
    public final void c(vea veaVar, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        Map map = (Map) veaVar.c;
        gle gleVar = this.c;
        map.put(gleVar, boolValueOf);
        gleVar.a.b(new vea(veaVar, gleVar));
    }

    @Override // defpackage.mig
    public final void d(rhg rhgVar) throws DeadObjectException {
        gle gleVar = this.c;
        try {
            j27 j27Var = this.b;
            ((ypb) ((j27) j27Var.d).c).accept(rhgVar.e, gleVar);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            a(mig.e(e2));
        } catch (RuntimeException e3) {
            gleVar.b(e3);
        }
    }

    @Override // defpackage.whg
    public final za5[] f(rhg rhgVar) {
        return (za5[]) this.b.c;
    }

    @Override // defpackage.whg
    public final boolean g(rhg rhgVar) {
        return this.b.a;
    }

    @Override // defpackage.whg
    public final int h(rhg rhgVar) {
        return this.b.b;
    }
}
