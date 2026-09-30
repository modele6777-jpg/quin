package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class uz3 implements h10 {
    public static final /* synthetic */ wn7[] b = {new aya(uz3.class, "annotations", "getAnnotations()Ljava/util/List;", 0)};
    public final ee8 a;

    public uz3(ge8 ge8Var, x16 x16Var) {
        ge8Var.getClass();
        this.a = new ee8(ge8Var, x16Var);
    }

    @Override // defpackage.h10
    public final /* bridge */ boolean E(dx5 dx5Var) {
        return cn1.E(this, dx5Var);
    }

    @Override // defpackage.h10
    public final /* bridge */ u00 R(dx5 dx5Var) {
        return cn1.u(this, dx5Var);
    }

    @Override // defpackage.h10
    public boolean isEmpty() {
        b[0].getClass();
        return ((List) this.a.invoke()).isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b[0].getClass();
        return ((List) this.a.invoke()).iterator();
    }
}
