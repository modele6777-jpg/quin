package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hig extends whg {
    public final gle b;
    public final /* synthetic */ int c;
    public final Object d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hig(a98 a98Var, gle gleVar) {
        this(4, gleVar);
        this.c = 1;
        this.d = a98Var;
    }

    @Override // defpackage.mig
    public final void a(Status status) {
        this.b.b(new x60(status));
    }

    @Override // defpackage.mig
    public final void b(Exception exc) {
        this.b.b(exc);
    }

    @Override // defpackage.mig
    public final /* bridge */ /* synthetic */ void c(vea veaVar, boolean z) {
        int i = this.c;
    }

    @Override // defpackage.mig
    public final void d(rhg rhgVar) throws DeadObjectException {
        try {
            k(rhgVar);
        } catch (DeadObjectException e) {
            a(mig.e(e));
            throw e;
        } catch (RemoteException e2) {
            a(mig.e(e2));
        } catch (RuntimeException e3) {
            this.b.b(e3);
        }
    }

    @Override // defpackage.whg
    public final za5[] f(rhg rhgVar) {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                return (za5[]) ((zhg) obj).a.c;
            default:
                zhg zhgVar = (zhg) rhgVar.i.get((a98) obj);
                if (zhgVar == null) {
                    return null;
                }
                return (za5[]) zhgVar.a.c;
        }
    }

    @Override // defpackage.whg
    public final boolean g(rhg rhgVar) {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                return ((zhg) obj).a.a;
            default:
                zhg zhgVar = (zhg) rhgVar.i.get((a98) obj);
                return zhgVar != null && zhgVar.a.a;
        }
    }

    @Override // defpackage.whg
    public final int h(rhg rhgVar) {
        switch (this.c) {
            case 0:
                return 0;
            default:
                return ((zhg) rhgVar.i.get((a98) this.d)) != null ? 0 : -1;
        }
    }

    public final void k(rhg rhgVar) {
        switch (this.c) {
            case 0:
                zhg zhgVar = (zhg) this.d;
                zi0 zi0Var = zhgVar.a;
                ((psd) ((kv) zi0Var.d).b).accept(rhgVar.e, this.b);
                a98 a98Var = (a98) ((gn2) zi0Var.b).b;
                if (a98Var != null) {
                    rhgVar.i.put(a98Var, zhgVar);
                }
                break;
            default:
                zhg zhgVar2 = (zhg) rhgVar.i.remove((a98) this.d);
                if (zhgVar2 == null) {
                    this.b.c(Boolean.FALSE);
                } else {
                    xb6 xb6Var = rhgVar.e;
                    ((jwg) ((kv) zhgVar2.b.b).c).getClass();
                    int i = w6h.l;
                    ((gn2) zhgVar2.a.b).b = null;
                }
                break;
        }
    }

    public hig(int i, gle gleVar) {
        super(i);
        this.b = gleVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hig(zhg zhgVar, gle gleVar) {
        this(3, gleVar);
        this.c = 0;
        this.d = zhgVar;
    }

    private final /* bridge */ /* synthetic */ void i(vea veaVar, boolean z) {
    }

    private final /* bridge */ /* synthetic */ void j(vea veaVar, boolean z) {
    }
}
