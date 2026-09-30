package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class cah extends w4h {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cah(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.w4h
    public final void a() {
        switch (this.b) {
            case 0:
                synchronized (((reh) this.c).f) {
                    try {
                        if (((reh) this.c).k.get() > 0 && ((reh) this.c).k.decrementAndGet() > 0) {
                            ((reh) this.c).b.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        reh rehVar = (reh) this.c;
                        if (rehVar.m != null) {
                            rehVar.b.d("Unbind from service.", new Object[0]);
                            reh rehVar2 = (reh) this.c;
                            rehVar2.a.unbindService(rehVar2.l);
                            rehVar = (reh) this.c;
                            rehVar.g = false;
                            rehVar.m = null;
                            rehVar.l = null;
                        }
                        rehVar.c();
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            default:
                reh rehVar3 = (reh) ((jhg) this.c).b;
                rehVar3.b.d("unlinkToDeath", new Object[0]);
                ((svg) rehVar3.m).d.unlinkToDeath(rehVar3.j, 0);
                rehVar3.m = null;
                rehVar3.g = false;
                return;
        }
    }
}
