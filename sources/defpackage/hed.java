package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hed {
    public hed a(hcd hcdVar, tbd tbdVar, long j, long j2, long j3) {
        throw new IllegalStateException(("Active match can only be configured in ActiveMatchFoundConfigPending or ActiveMatchConfigured state. Current state: " + this).toString());
    }

    public boolean b() {
        return this instanceof jd;
    }

    public hkb c() {
        return null;
    }

    public boolean d() {
        return false;
    }

    public kxa e() {
        return null;
    }

    public hkb f(hcd hcdVar) {
        return c();
    }

    public abstract hed g(tbd tbdVar);

    public abstract hed h();

    public void i(hkb hkbVar) {
    }
}
