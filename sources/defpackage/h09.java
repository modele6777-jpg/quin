package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public interface h09 extends j09 {
    @Override // defpackage.j09
    default Object c(l26 l26Var, Object obj) {
        return l26Var.z(obj, this);
    }

    @Override // defpackage.j09
    default boolean g(a26 a26Var) {
        return ((Boolean) a26Var.d(this)).booleanValue();
    }
}
