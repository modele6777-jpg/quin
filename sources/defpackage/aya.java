package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class aya extends cya implements un7 {
    public aya(Class cls, String str, String str2, int i) {
        super(ga1.NO_RECEIVER, cls, str, str2, i);
    }

    @Override // defpackage.wn7
    public final tn7 b() {
        return ((un7) getReflected()).b();
    }

    @Override // defpackage.ga1
    public final cm7 computeReflected() {
        return job.a.h(this);
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return get(obj);
    }

    @Override // defpackage.un7
    public Object get(Object obj) {
        return ((xnb) b()).call(obj);
    }
}
