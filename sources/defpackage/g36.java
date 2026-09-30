package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g36 extends ga1 implements w26, ym7 {
    private final int arity;

    public g36(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
    }

    @Override // defpackage.ga1
    public cm7 computeReflected() {
        return job.a.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g36) {
            g36 g36Var = (g36) obj;
            return getName().equals(g36Var.getName()) && getSignature().equals(g36Var.getSignature()) && pa7.t(getBoundReceiver(), g36Var.getBoundReceiver()) && pa7.t(getOwner(), g36Var.getOwner());
        }
        if (obj instanceof ym7) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // defpackage.w26
    public int getArity() {
        return this.arity;
    }

    @Override // defpackage.ga1
    public ym7 getReflected() {
        cm7 cm7VarCompute = compute();
        if (cm7VarCompute != this) {
            return (ym7) cm7VarCompute;
        }
        throw new qt7();
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // defpackage.ym7
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // defpackage.ym7
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // defpackage.ym7
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // defpackage.ym7
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // defpackage.cm7, defpackage.ym7
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        cm7 cm7VarCompute = compute();
        if (cm7VarCompute != this) {
            return cm7VarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
