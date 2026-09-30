package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lvxf;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lkx5;", "fragment", "Lkx5;", "a", "()Lkx5;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = z7c.f)
public abstract class vxf extends RuntimeException {
    private final kx5 fragment;

    public vxf(kx5 kx5Var, String str) {
        super(str);
        this.fragment = kx5Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final kx5 getFragment() {
        return this.fragment;
    }
}
