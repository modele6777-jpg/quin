package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class qy7 extends ry7 implements un7 {
    public final String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy7(String str, x16 x16Var) {
        super(x16Var);
        str.getClass();
        this.b = str;
    }

    @Override // defpackage.wn7
    public final tn7 b() {
        return ((un7) f()).b();
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return ((un7) f()).d(obj);
    }

    @Override // defpackage.un7
    public final Object get(Object obj) {
        return ((un7) f()).get(obj);
    }

    @Override // defpackage.cm7
    public final String getName() {
        return this.b;
    }
}
