package defpackage;

import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ye7 extends gf7 implements fn7 {
    public final lw7 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ye7(xm7 xm7Var, Field field, Object obj, dm7 dm7Var) {
        super(xm7Var, field, obj, dm7Var);
        xm7Var.getClass();
        dm7Var.getClass();
        this.x = eb3.N(z18.b, new j5(25, this));
    }

    @Override // defpackage.in7
    public final dn7 c() {
        return (xe7) this.x.getValue();
    }

    @Override // defpackage.gf7, defpackage.wnb
    public final wnb p(xm7 xm7Var, dm7 dm7Var) {
        xm7Var.getClass();
        dm7Var.getClass();
        return new ye7(xm7Var, F(), this.e, dm7Var);
    }

    @Override // defpackage.fn7, defpackage.in7
    public final en7 c() {
        return (xe7) this.x.getValue();
    }
}
