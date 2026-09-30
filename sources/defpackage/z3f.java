package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class z3f implements y3f {
    public final Set a;
    public final qq0 b;
    public final f4f c;

    public z3f(Set set, qq0 qq0Var, f4f f4fVar) {
        this.a = set;
        this.b = qq0Var;
        this.c = f4fVar;
    }

    public final a4f a(String str, jv4 jv4Var, a3f a3fVar) {
        Set set = this.a;
        if (set.contains(jv4Var)) {
            return new a4f(this.b, str, jv4Var, a3fVar, this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", jv4Var, set));
    }
}
