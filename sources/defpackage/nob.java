package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nob implements a26 {
    public final boolean a;

    public nob(boolean z) {
        this.a = z;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        do7 do7Var = (do7) obj;
        do7Var.getClass();
        return (this.a ? "(raw) " : "") + do7Var;
    }
}
