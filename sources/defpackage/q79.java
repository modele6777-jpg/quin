package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class q79 extends r79 implements hn7 {
    public q79(Class cls, String str, String str2, int i) {
        super(ga1.NO_RECEIVER, cls, str, str2, i);
    }

    @Override // defpackage.wn7
    public final tn7 b() {
        return ((hn7) getReflected()).b();
    }

    @Override // defpackage.in7
    public final gn7 c() {
        return ((hn7) getReflected()).c();
    }

    @Override // defpackage.ga1
    public final cm7 computeReflected() {
        return job.a.f(this);
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return get(obj);
    }

    public Object get(Object obj) {
        return ((xnb) b()).call(obj);
    }

    public void v(Object obj, Object obj2) throws xu6 {
        ((xnb) c()).call(obj, obj2);
    }
}
