package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ky3 extends gy3 implements dn7 {
    public static final /* synthetic */ wn7[] x = {new aya(ky3.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;", 0)};
    public final fob v = lmg.m0(null, new jy3(this, 0));
    public final lw7 w = eb3.N(z18.b, new jy3(this, 1));

    @Override // defpackage.rx3
    public final zy3 F() {
        wn7 wn7Var = x[0];
        Object objInvoke = this.v.invoke();
        objInvoke.getClass();
        return new zy3(qz3.e((dya) objInvoke).x(), tq0.g, false);
    }

    @Override // defpackage.rx3
    public final ea1 G() {
        wn7 wn7Var = x[0];
        Object objInvoke = this.v.invoke();
        objInvoke.getClass();
        return (dya) objInvoke;
    }

    @Override // defpackage.gy3
    public final uxa H() {
        wn7 wn7Var = x[0];
        Object objInvoke = this.v.invoke();
        objInvoke.getClass();
        return (dya) objInvoke;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ky3) && pa7.t(I(), ((ky3) obj).I());
    }

    @Override // defpackage.cm7
    public final String getName() {
        return ub3.l(new StringBuilder("<set-"), I().w, '>');
    }

    @Override // defpackage.wnb
    public final sa1 h() {
        return (sa1) this.w.getValue();
    }

    public final int hashCode() {
        return I().hashCode();
    }

    @Override // defpackage.wnb
    public final wnb p(xm7 xm7Var, dm7 dm7Var) {
        xm7Var.getClass();
        dm7Var.getClass();
        throw new IllegalStateException("Property accessors can only be copied by copying the corresponding property");
    }

    public final String toString() {
        return "setter of " + I();
    }
}
