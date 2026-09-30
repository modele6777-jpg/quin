package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pcc implements vpb {
    public odc a;
    public ucc b;
    public String c;
    public Object d;
    public Object[] e;
    public tcc f;
    public final hla g = new hla(12, this);

    public pcc(odc odcVar, ucc uccVar, String str, Object obj, Object[] objArr) {
        this.a = odcVar;
        this.b = uccVar;
        this.c = str;
        this.d = obj;
        this.e = objArr;
    }

    @Override // defpackage.vpb
    public final void a() {
        tcc tccVar = this.f;
        if (tccVar != null) {
            ((gg7) tccVar).z();
        }
    }

    public final void b() throws Throwable {
        String strT;
        ucc uccVar = this.b;
        tcc tccVar = this.f;
        if (tccVar != null) {
            cva.u(tccVar, ") is not null", "entry(");
            return;
        }
        if (uccVar != null) {
            hla hlaVar = this.g;
            Object objInvoke = hlaVar.invoke();
            if (objInvoke == null || uccVar.c(objInvoke)) {
                this.f = uccVar.a(this.c, hlaVar);
                return;
            }
            if (objInvoke instanceof wrd) {
                wrd wrdVar = (wrd) objInvoke;
                if (wrdVar.e() == qk6.L0 || wrdVar.e() == i8c.f || wrdVar.e() == hj6.X0) {
                    strT = "MutableState containing " + wrdVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strT = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strT = vfh.t(objInvoke);
            }
            throw new IllegalArgumentException(strT);
        }
    }

    @Override // defpackage.vpb
    public final void c() {
        tcc tccVar = this.f;
        if (tccVar != null) {
            ((gg7) tccVar).z();
        }
    }

    @Override // defpackage.vpb
    public final void d() throws Throwable {
        b();
    }
}
