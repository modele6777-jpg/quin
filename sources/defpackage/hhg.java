package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hhg extends ehg {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hhg(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.ehg
    public final void a() {
        switch (this.b) {
            case 0:
                synchronized (((khg) this.c).f) {
                    try {
                        if (((khg) this.c).k.get() > 0 && ((khg) this.c).k.decrementAndGet() > 0) {
                            ((khg) this.c).b.e("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        khg khgVar = (khg) this.c;
                        if (khgVar.m != null) {
                            khgVar.b.e("Unbind from service.", new Object[0]);
                            khg khgVar2 = (khg) this.c;
                            khgVar2.a.unbindService(khgVar2.l);
                            khgVar = (khg) this.c;
                            khgVar.g = false;
                            khgVar.m = null;
                            khgVar.l = null;
                        }
                        khgVar.e();
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            default:
                khg khgVar3 = (khg) ((jhg) this.c).b;
                khgVar3.b.e("unlinkToDeath", new Object[0]);
                ((meg) khgVar3.m).e.unlinkToDeath(khgVar3.j, 0);
                khgVar3.m = null;
                khgVar3.g = false;
                return;
        }
    }
}
