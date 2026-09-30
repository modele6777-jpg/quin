package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class cya extends ga1 implements wn7 {
    private final boolean syntheticJavaProperty;

    public cya(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.syntheticJavaProperty = false;
    }

    @Override // defpackage.ga1
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public final wn7 getReflected() {
        if (this.syntheticJavaProperty) {
            s8f.i("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
            return null;
        }
        cm7 cm7VarCompute = compute();
        if (cm7VarCompute != this) {
            return (wn7) cm7VarCompute;
        }
        throw new qt7();
    }

    @Override // defpackage.ga1
    public final cm7 compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cya) {
            cya cyaVar = (cya) obj;
            return getOwner().equals(cyaVar.getOwner()) && getName().equals(cyaVar.getName()) && getSignature().equals(cyaVar.getSignature()) && pa7.t(getBoundReceiver(), cyaVar.getBoundReceiver());
        }
        if (obj instanceof wn7) {
            return obj.equals(compute());
        }
        return false;
    }

    public final int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    public final String toString() {
        cm7 cm7VarCompute = compute();
        if (cm7VarCompute != this) {
            return cm7VarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
