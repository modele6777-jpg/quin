package defpackage;

import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class uy1 {
    public final t99 a;
    public final rob b;
    public final Collection c;
    public final a26 d;
    public final ly1[] e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public uy1(t99 t99Var, ly1[] ly1VarArr, a26 a26Var) {
        this(t99Var, null, null, a26Var, (ly1[]) Arrays.copyOf(ly1VarArr, ly1VarArr.length));
        t99Var.getClass();
    }

    public /* synthetic */ uy1(t99 t99Var, ly1[] ly1VarArr) {
        this(t99Var, ly1VarArr, zo1.d);
    }

    public uy1(t99 t99Var, rob robVar, Collection collection, a26 a26Var, ly1... ly1VarArr) {
        this.a = t99Var;
        this.b = robVar;
        this.c = collection;
        this.d = a26Var;
        this.e = ly1VarArr;
    }

    public /* synthetic */ uy1(Collection collection, ly1[] ly1VarArr) {
        this(collection, ly1VarArr, zo1.f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public uy1(Collection collection, ly1[] ly1VarArr, a26 a26Var) {
        this(null, null, collection, a26Var, (ly1[]) Arrays.copyOf(ly1VarArr, ly1VarArr.length));
        collection.getClass();
    }
}
